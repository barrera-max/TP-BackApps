package Backend.TPI.App.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Marca {

    @Id
    private long id;

    private String nombre;
}
