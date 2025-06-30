package com.example.ItsMicroserciziExam.models;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class InfoDTO {

    private boolean visited;
    private String notes;
    private double rating;

    public InfoDTO() {
    }

    public InfoDTO(boolean visited, String notes, double rating) {
        this.visited = visited;
        this.notes = notes;
        this.rating = rating;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof InfoDTO infoDTO)) return false;
        return visited == infoDTO.visited && Double.compare(rating, infoDTO.rating) == 0 && Objects.equals(notes, infoDTO.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visited, notes, rating);
    }

    @Override
    public String toString() {
        return "Info{" +
                "visited=" + visited +
                ", notes='" + notes + '\'' +
                ", rating=" + rating +
                '}';
    }
}
