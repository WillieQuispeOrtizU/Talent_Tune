package pe.edu.upc.talent_tune.dtos;

import java.util.Date;


public class BandaDTO {

    private int idBanda;

    private String nombreBanda;

    private Date fechaBanda;

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
