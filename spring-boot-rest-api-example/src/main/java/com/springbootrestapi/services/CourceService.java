package com.springbootrestapi.services;

import com.springbootrestapi.entities.Cource;
import java.util.List;

public interface CourceService {

     public List<Cource> getCource();
     public Cource getCource(long courceId);
}
