package com.example.ItsMicroserciziExam.models;

import java.util.List;
import java.util.Objects;

public class CapitalInfo {
    List<Double> latlng;

    public CapitalInfo() {
    }

    public CapitalInfo(List<Double> latlng) {
        this.latlng = latlng;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CapitalInfo that)) return false;
        return Objects.equals(latlng, that.latlng);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(latlng);
    }

    @Override
    public String toString() {
        return "CapitalInfo{" +
                "latlng=" + latlng +
                '}';
    }
}
