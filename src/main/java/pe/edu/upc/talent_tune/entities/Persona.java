package pe.edu.upc.talent_tune.entities;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;
    @Column(name = "nombres", nullable = false, length = 40)
    private String nombres;
    @Column(name = "apellidos", nullable = false, length = 40)
    private String apellidos;
    @Column(name = "fechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;
    @Column(name = "sexo", nullable = false)
    private String sexo;
    @Column(name = "telefono", nullable = false, length = 9)
    private String telefono;
    @Column(name = "pais", nullable = false, length = 25)
    private String pais;
    @Column(name = "estudios", nullable = false, length = 40)
    private String estudios;

    public Persona() {
    }

    public Persona(int idPersona, String nombres, String apellidos, LocalDate fechaNacimiento, String sexo, String telefono, String pais, String estudios) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.telefono = telefono;
        this.pais = pais;
        this.estudios = estudios;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }
}
