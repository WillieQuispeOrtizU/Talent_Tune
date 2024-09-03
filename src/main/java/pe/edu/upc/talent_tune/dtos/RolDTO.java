package pe.edu.upc.talent_tune.dtos;

import pe.edu.upc.talent_tune.entities.Categoria;

public class RolDTO {
    private int idRol;
    private String tipoRol;
    private String areaDestacada;
    private String agencia;
    private Categoria categoria;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    public String getAreaDestacada() {
        return areaDestacada;
    }

    public void setAreaDestacada(String areaDestacada) {
        this.areaDestacada = areaDestacada;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
