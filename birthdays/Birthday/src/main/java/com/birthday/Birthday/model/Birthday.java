package com.birthday.Birthday.model;

import javax.persistence.*;

// private vs protected vs public
// inheritance, encapsulation, polymorphism, abstraction

@Entity
@Table(name = "birthday")
public class Birthday {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "day")
    private String day;

    public Birthday() {
    }

    public Birthday(String name, String day) {
        this.name = name;
        this.day = day;
    }

    public Birthday(Integer id, String name, String day) {
        this.id = id;
        this.name = name;
        this.day = day;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Birthday{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}

