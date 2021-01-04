package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // MVC
    @GetMapping("hello")    // 'localhost:8080/hello'가 들어오면 이 메소드를 호출해줌
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello"; // templates폴더의 hello.html의 ${data}에 "hello"전달하고 viewResolver에서 엔진처리후 HTML변환

    }

    // MVC
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){ // URL에 name=spring으로 입력하면 됨. 즉 URL에서 parameter를 읽어오기 위한 수단이 @RequsetParam
        model.addAttribute("name", name);
        return "hello-template";
    }

    // API
    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello "+name; // "hello spring"문자열이 그대로 내려감
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello helloObject = new Hello();
        helloObject.setName(name);

        return helloObject;
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }

}
