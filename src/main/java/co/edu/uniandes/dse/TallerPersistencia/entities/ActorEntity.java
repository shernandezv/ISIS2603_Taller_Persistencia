package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class ActorEntity extends BaseEntity{
    private String nombre;
    private String nacionalidad;

    @ManyToMany(mappedBy = "actores")
    private ArrayList<PeliculaEntity> peliculas;
}
