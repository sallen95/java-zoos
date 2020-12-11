package com.lambdaschool.javazoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "zooanimals")
@IdClass(ZooAnimalId.class)
public class ZooAnimal extends Auditable implements Serializable
{
    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties(value = "animals", allowSetters = true)
    private Zoo zoo;

    @Id
    @ManyToOne
    @JoinColumn(name = "animalid")
    @JsonIgnoreProperties(value = "zoos", allowSetters = true)
    private Animal animal;


    private String incomingzoo;

    public ZooAnimal()
    {
    }

    public ZooAnimal(
        Zoo zoo,
        Animal animal,
        String incomingzoo)
    {
        this.zoo = zoo;
        this.animal = animal;
        this.incomingzoo = incomingzoo;
    }

    public Zoo getZoo()
    {
        return zoo;
    }

    public void setZoo(Zoo zoo)
    {
        this.zoo = zoo;
    }

    public Animal getAnimal()
    {
        return animal;
    }

    public void setAnimal(Animal animal)
    {
        this.animal = animal;
    }

    public String getIncomingzoo()
    {
        return incomingzoo;
    }

    public void setIncomingzoo(String incomingzoo)
    {
        this.incomingzoo = incomingzoo;
    }

    @Override
    public int hashCode()
    {
        return 1;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof ZooAnimal))
        {
            return false;
        }
        ZooAnimal that = (ZooAnimal) obj;
        return ((this.zoo == null) ? 0 : this.zoo.getZooid()) ==
            ((that.getZoo() == null) ? 0 : that.getZoo().getZooid()) &&
            ((this.animal == null) ? 0 : this.animal.getAnimalid()) ==
                ((that.getAnimal() == null) ? 0 : that.getAnimal().getAnimalid());
    }
}
