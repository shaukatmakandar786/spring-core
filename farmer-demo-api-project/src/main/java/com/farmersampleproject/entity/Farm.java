package com.farmersampleproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Farm {

    @Id
    private int farmId;
    private String farmLocation;
    private double farmSize;

    public Farm() {
    }

    public Farm(int farmId, String farmLocation, double farmSize) {
        this.farmId = farmId;
        this.farmLocation = farmLocation;
        this.farmSize = farmSize;
    }

    public int getFarmId() {
        return farmId;
    }

    public void setFarmId(int farmId) {
        this.farmId = farmId;
    }

    public String getFarmLocation() {
        return farmLocation;
    }

    public void setFarmLocation(String farmLocation) {
        this.farmLocation = farmLocation;
    }

    public double getFarmSize() {
        return farmSize;
    }

    public void setFarmSize(double farmSize) {
        this.farmSize = farmSize;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "farmId=" + farmId +
                ", farmLocation='" + farmLocation + '\'' +
                ", farmSize=" + farmSize +
                '}';
    }
}
