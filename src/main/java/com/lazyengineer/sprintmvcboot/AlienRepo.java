package com.lazyengineer.sprintmvcboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lazyengineer.sprintmvcboot.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

    public List<Alien> findByAname(String aname); // Query DSL
    public List<Alien> findByAnameOrderByAidDesc(String aname); // Query DSL
    
    @Query("from Alien where aname=:aname")
    public List<Alien> find(@Param("aname") String aname);

}
