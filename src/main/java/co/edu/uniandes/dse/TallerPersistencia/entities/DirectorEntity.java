package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class DirectorEntity extends BaseEntity{
    private String nombre;
    private String biografia;

    @OneToMany(mappedBy = "director")
    private ArrayList<PeliculaEntity> peliculas;
}
