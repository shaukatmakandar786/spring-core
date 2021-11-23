package com.springbootrestapi.services;

import com.springbootrestapi.entities.Cource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourceServiceImplementation implements  CourceService{

    List<Cource> list;

    public CourceServiceImplementation() {
        list =new ArrayList<>();
        list.add(new Cource(101,"java SE","this is core java cource"));
        list.add(new Cource(102,"java EE","this is adv java cource"));
        list.add(new Cource(103,"java ME","this is ME java cource"));
    }

    @Override
    public List<Cource> getCource() {
        return list;
    }

    @Override
    public Cource getCource(long courceId) {

        Cource c=null;
        for(Cource cource:list)
        {
            if(cource.getCourceId()==courceId)
            {
                c=cource;
                break;
            }
        }
        return c;
    }
}
