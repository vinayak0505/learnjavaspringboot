package com.lazyengineer.sprintmvcboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lazyengineer.sprintmvcboot.model.Alien;

@Controller
public class HomeController {

    @Autowired
    AlienRepo repo;

    @ModelAttribute
    public void ModelData(ModelMap m) {
        m.addAttribute("name", "Alien 1");
    }

    @RequestMapping("/")
    public String Home() {
        return "index";
    }

    @RequestMapping("/add")
    public String Add(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap m) {

        int k = i + j;
        m.addAttribute("num3", k);
        return "result";
    }

    @PostMapping(value = "/addAlien")
    public String AddAlien(@ModelAttribute Alien a) {
        repo.save(a);
        return "result";
    }

    @GetMapping(value = "/getAliens")
    public String getAliens(Model m) {
        m.addAttribute("result", repo.findAll());
        return "showAliens";
    }

    @GetMapping("getAlien")
    public String getAlien(@RequestParam int aid, Model m) {
        m.addAttribute("result", repo.getOne(aid));
        return "showAliens";
    }

    @GetMapping("getAlienByName")
    public String getAlienByName(@RequestParam String aname, Model m) {
        m.addAttribute("result", repo.find(aname));
        return "showAliens";
    }

}
