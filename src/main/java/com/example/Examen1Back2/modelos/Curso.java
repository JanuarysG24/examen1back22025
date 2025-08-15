package com.example.Examen1Back2.modelos;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
@Entity
public class Curso {
    //se completo el @Id
    @Id
    @GeneratedValue (strategy = generationType.IDENTITY) //Se le complete el @GeneratedValue
    private Integer id;
    private String nombre; //se le agrego ";"


    @ManyToOne
    @JoinColumn(name="fk_docente", referencedColumnName = "id") //se le quita el ;
    @JsonBackReference(value = "docente-curso")
    Docente docente; //se le añande ;

    public Curso() {
    }

    public Curso(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    //se le añaden los getter and setter


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
