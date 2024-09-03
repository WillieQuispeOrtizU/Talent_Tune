package pe.edu.upc.talent_tune.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;
    @Column(name = "nombreUsuario", nullable = false, length = 20)
    private String nombreUsuario;
    @Column(name = "contrasenia", nullable = false, length = 20)
    private String contrasenia;
    @Column(name = "descripcion", length = 45)
    private String descripcion;
    //consultar
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPersona")
    private Persona persona;
    @ManyToOne
    @JoinColumn(name = "idRol")
    private Rol rol;
    @ManyToOne
    @JoinColumn(name = "idEvento")
    private Evento evento;

    public Usuario() {
    }

    public Usuario(int idPersona, String nombreUsuario, String contrasenia, String descripcion, Persona persona, Rol rol, Evento evento) {
        this.idPersona = idPersona;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.descripcion = descripcion;
        this.persona = persona;
        this.rol = rol;
        this.evento = evento;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
