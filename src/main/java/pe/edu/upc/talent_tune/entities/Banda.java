package pe.edu.upc.talent_tune.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Banda")
public class Banda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBanda;

    @Column(name = "nombreBanda", nullable = false, length = 30)
    private String nombreBanda;

    @Column(name = "fechaBanda", nullable = false)
    private Date fechaBanda;

    public Banda() {
    }

    public Banda(int idBanda, String nombreBanda, Date fechaBanda) {
        this.idBanda = idBanda;
        this.nombreBanda = nombreBanda;
        this.fechaBanda = fechaBanda;
    }

    public int getIdBanda() {
        return idBanda;
    }

    public void setIdBanda(int idBanda) {
        this.idBanda = idBanda;
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public Date getFechaBanda() {
        return fechaBanda;
    }

    public void setFechaBanda(Date fechaBanda) {
        this.fechaBanda = fechaBanda;
    }
}
