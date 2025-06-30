package com.example.ItsMicroserciziExam.models;

import java.util.Objects;

public class Flags {

    private String png;

    public Flags() {

    }

    public Flags(String png) {
        this.png = png;
    }

    public String getPng() {
        return png;
    }

    public void setPng(String png) {
        this.png = png;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Flags flags)) return false;
        return Objects.equals(png, flags.png);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(png);
    }

    @Override
    public String toString() {
        return "Flags{" +
                "png='" + png + '\'' +
                '}';
    }
}
