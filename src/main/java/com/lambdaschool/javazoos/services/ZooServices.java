package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.models.Zoo;

import java.util.List;

public interface ZooServices
{
    List<Zoo> findAll();
    Zoo findZooById(long id);
}
