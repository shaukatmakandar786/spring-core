package com.unittesting.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    private int person_id;
    private String person_city;
    private String person_name;

    public Person() {
    }

    public Person(int person_id, String person_city, String person_name) {
        this.person_id = person_id;
        this.person_city = person_city;
        this.person_name = person_name;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getPerson_city() {
        return person_city;
    }

    public void setPerson_city(String person_city) {
        this.person_city = person_city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "person_id=" + person_id +
                ", person_city='" + person_city + '\'' +
                ", person_name='" + person_name + '\'' +
                '}';
    }
}
