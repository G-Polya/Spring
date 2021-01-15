package Observer.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("정말 해도 될까?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListner());
        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.setSize(200,200);
        frame.setVisible(true);
    }

    class AngelListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("안돼. 분명 나중에 후회할꺼야");
        }
    }

    class DevilListner implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("당연하지. 그냥 확 저질러버려!");
        }
    }
}
