package com.clinica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEspecialidad;

    private String nombre;

    @OneToMany(mappedBy = "especialidad")
    private List<MedicoEspecialidad> medicosEspecialidad;

    @OneToMany(mappedBy = "especialidad")
    private List<Cita> citas;

    public Long getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Long idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<MedicoEspecialidad> getMedicosEspecialidad() {
        return medicosEspecialidad;
    }

    public void setMedicosEspecialidad(List<MedicoEspecialidad> medicosEspecialidad) {
        this.medicosEspecialidad = medicosEspecialidad;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

}
