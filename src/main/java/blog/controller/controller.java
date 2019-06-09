package blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import blog.model.post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class controller {
    @RequestMapping("/")
    public String getData(Model model)
    {
        ArrayList<post> posts = new ArrayList<>();
        post p = new post();
        p.setTitle("Post 1");
        p.setBody("Post Body 1 by avas");
        p.setDate(new Date());

        post p2 = new post();
        p2.setTitle("Post 1");
        p2.setBody("Post Body 1 by avas");
        p2.setDate(new Date());

        post p3 = new post();
        p3.setTitle("Post 1");
        p3.setBody("Post Body 1 by avas");
        p3.setDate(new Date());


        posts.add(p);
        posts.add(p2);
        posts.add(p3);
        model.addAttribute("avas",posts);

        return "index";

    }
}
