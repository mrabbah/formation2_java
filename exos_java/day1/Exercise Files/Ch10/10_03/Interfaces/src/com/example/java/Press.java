package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

public interface Press extends Maintenance {

    public int getOil(List<Olive> olives);
    public void setOil(int oil);
}
