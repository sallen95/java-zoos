package com.lambdaschool.javazoos.repositories;

import com.lambdaschool.javazoos.models.ZooAnimal;
import org.springframework.data.repository.CrudRepository;

public interface ZooAnimalRepository extends CrudRepository<ZooAnimal, Long>
{
}
