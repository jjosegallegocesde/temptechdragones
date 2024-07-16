package com.example.casaDragon.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.List;

@Entity
public class Jinete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombres; //maximo 50 caracteres y solo letras y espacios
    private float edad;  //solo numeros positivos
    private String fechaMontura;  //dd/MM/YYYY

    @OneToMany(mappedBy = "jinete")
    @JsonManagedReference
    private List<Dragon> dragones;

    @OneToMany(mappedBy = "jinete")
    @JsonManagedReference
    private List<Aliado> aliados;

    public Jinete() {
    }

    public Jinete(Integer id, String nombres, float edad, String fechaMontura) {
        this.id = id;
        this.nombres = nombres;
        this.edad = edad;
        this.fechaMontura = fechaMontura;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }

    public String getFechaMontura() {
        return fechaMontura;
    }

    public void setFechaMontura(String fechaMontura) {
        this.fechaMontura = fechaMontura;
    }
}
