package com.lazyengineer.sprintmvcboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lazyengineer.sprintmvcboot.model.Alien;


@RestController
public class AlienController {

    @Autowired
    AlienRepo repo;

    @GetMapping("aliens")
    public List<Alien> getAliens() {

        List<Alien> aliens = repo.findAll();
        System.out.println("getAliens: " + aliens);
        return aliens;
    }

    @GetMapping("alien/{aid}")
    public Alien getAlien(@PathVariable("aid") int aid) {
        System.out.println("getAlien: " + aid);
        Alien alien = repo.findById(aid).orElse(new Alien());

        return alien;
    }

    @PostMapping("alien")
    public Alien addAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }
    
}
