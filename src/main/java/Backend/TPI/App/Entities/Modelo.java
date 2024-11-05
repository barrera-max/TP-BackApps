package Backend.TPI.App.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Modelo {

    @Id
    private long id;

    @JoinColumn(name = "id")
    @OneToOne
    private Marca idMarca;

    private String descripcion;



}
