package io.github.JPA_Work.models;

import jakarta.persistence.*;

@Entity
@Table(name = "sample")
@NamedQuery(name = "sample.getAll", query = "SELECT s FROM Sample s")
public class Sample {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_sample;

    @Column(name = "name")
    private String name;

    @Column(name = "substance")
    private String substance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_brigade")
    private Brigade brigade;

    public Sample(int id_sample, String name, String substance) {
        this.id_sample = id_sample;
        this.name = name;
        this.substance = substance;
    }

    public Sample(){}

    public int getId_sample() {
        return id_sample;
    }

    public void setId_sample(int id_sample) {
        this.id_sample = id_sample;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubstance() {
        return substance;
    }

    public void setSubstance(String substance) {
        this.substance = substance;
    }

    public Brigade getBrigade() {
        return brigade;
    }

    public void setBrigade(Brigade brigade) {
        this.brigade = brigade;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "id_sample=" + id_sample +
                ", name='" + name + '\'' +
                ", substance='" + substance + '\'' +
                '}';
    }
}
