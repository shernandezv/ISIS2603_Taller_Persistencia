package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class PeliculaEntity extends BaseEntity{
    private String titulo;
    private Integer anioLanzamiento; 

    @ManyToOne
    private DirectorEntity director;
    
    @ManyToMany
    private ArrayList<ActorEntity> actores;
}
