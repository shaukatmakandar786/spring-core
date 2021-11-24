package com.farmersampleproject.controller;

import com.farmersampleproject.entity.Farmer;
import com.farmersampleproject.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FarmerController {

    @Autowired
    private FarmerService farmerService;

    @GetMapping("/farmers")
    public List<Farmer> getFarmers()
    {
        return farmerService.getFarmers();
    }

    @PostMapping("/farmers")
    public Farmer saveFarmer(@RequestBody Farmer farmer)
    {

        return farmerService.saveFarmer(farmer);
    }
    @DeleteMapping("farmers/{id}")
    public String deleteFarmer(@PathVariable int id)
    {
        farmerService.deleteFarmer(id);
        return  "Deleted";
    }
    @PutMapping("/farmer")
    public Farmer updateFarmer(@RequestBody Farmer farmer)
    {
        return farmerService.updateFarmer(farmer);
    }


}
