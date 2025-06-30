package com.example.ItsMicroserciziExam.models;

import java.util.Objects;

public class Currencies {

    private String name;

    public Currencies() {
    }

    public Currencies(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Currencies that)) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Currencies{" +
                "name='" + name + '\'' +
                '}';
    }
}
