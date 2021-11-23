package com.springbootrestapi.controller;
import com.springbootrestapi.entities.Cource;
import com.springbootrestapi.services.CourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class MyController {

    @Autowired
    private CourceService courceService;

    /*@GetMapping("/hello")
    public String hello()
    {
        return "This is home page.....!";
    }*/

    // get the Cources
    @GetMapping("/cources")
    public List<Cource> getCource() {
        return this.courceService.getCource();
    }

    @GetMapping("/cources/{courceId}")
    public Cource getCource(@PathVariable String courceId)
    {
        return this.courceService.getCource(Long.parseLong(courceId));
    }

}