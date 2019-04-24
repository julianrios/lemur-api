package com.julianrios.lemur;

//import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;


//@Data
@Entity
public class Lemur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean movesIt;
    private Integer age;
    private Double weight;
    private String species;

    public Lemur(Long id, Boolean movesIt, Integer age, Double weight, String species) {
        this.id = id;
        this.movesIt = movesIt;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    public Lemur(Boolean movesIt, Integer age, Double weight, String species) {
        this.movesIt = movesIt;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    public Lemur() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getMovesIt() {
        return movesIt;
    }

    public void setMovesIt(Boolean movesIt) {
        this.movesIt = movesIt;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lemur lemur = (Lemur) o;
        return Objects.equals(id, lemur.id) &&
                Objects.equals(movesIt, lemur.movesIt) &&
                Objects.equals(age, lemur.age) &&
                Objects.equals(weight, lemur.weight) &&
                Objects.equals(species, lemur.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, movesIt, age, weight, species);
    }
}
