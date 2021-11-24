package com.farmersampleproject.dao;

import com.farmersampleproject.entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmerDao extends JpaRepository<Farmer,Integer>
{

}
