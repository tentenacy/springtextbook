package org.example.ex8.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Parrot {

    private String name = "Koko";

    public Parrot() {
        System.out.println("Parrot created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}