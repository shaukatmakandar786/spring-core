package com.farmersampleproject.service;

import com.farmersampleproject.dao.FarmerDao;
import com.farmersampleproject.entity.Farmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerService {

    @Autowired
    private FarmerDao farmerDao;

    public List<Farmer> getAllFarmers()
    {
        return farmerDao.findAll();
    }


    public Farmer saveFarmer(Farmer farmer) {

        return farmerDao.save(farmer);
    }

    public void deleteFarmer(int id)
    {
        farmerDao.deleteById(id);
    }
    public Farmer updateFarmer(Farmer farmer)
    {
        return farmerDao.save(farmer);
    }
}
