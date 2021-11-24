package com.farmersampleproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Farmer {

    @Id
    private int farmerId;
    private String farmerName;
    private String farmerAddress;

    public Farmer() {
    }

    public Farmer(int farmerId, String farmerName, String farmerAddress) {
        this.farmerId = farmerId;
        this.farmerName = farmerName;
        this.farmerAddress = farmerAddress;
    }

    public int getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public String getFarmerAddress() {
        return farmerAddress;
    }

    public void setFarmerAddress(String farmerAddress) {
        this.farmerAddress = farmerAddress;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "farmerId=" + farmerId +
                ", farmerName='" + farmerName + '\'' +
                ", farmerAddress='" + farmerAddress + '\'' +
                '}';
    }
}
