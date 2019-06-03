package com.gmail.ponomarenko2008.progects.model;

public class Entity {

    private Integer id;

    public Entity() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                '}';
    }
}
