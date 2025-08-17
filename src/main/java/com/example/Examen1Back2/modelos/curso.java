package com.example.Examen1Back2.modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private  String especialidad;

    @ManyToOne
    @JoinColumn(name = "fk_docente", referencedColumnName = "id")
    @JsonBackReference(value = "docente-curso")
    private Docente docente;

    @OneToOne
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id_usuario")
    @JsonManagedReference(value = "curso-usuario")
    private Usuario usuario;

    public Curso() {}

    public Curso(Integer id, String especialidad, Docente docente, Usuario usuario) {
        this.id = id;
        this.especialidad = especialidad;
        this.docente = docente;
        this.usuario = usuario;
    }

