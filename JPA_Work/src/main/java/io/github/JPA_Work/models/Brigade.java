package io.github.JPA_Work.models;

import jakarta.persistence.*;

@Entity
@Table(name = "brigade")
@NamedQuery(name = "brigade.getAll", query = "SELECT b FROM Brigade b")
public class Brigade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_brigade;

    @Column(name = "name")
    private String name;

    public Brigade(int id_brigade, String name) {
        this.id_brigade = id_brigade;
        this.name = name;
    }

    private Brigade(){}

    public int getId_brigade() {
        return id_brigade;
    }

    public void setId_brigade(int id_brigade) {
        this.id_brigade = id_brigade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brigade{" +
                "name='" + name + '\'' +
                ", id_brigade=" + id_brigade +
                '}';
    }
}
