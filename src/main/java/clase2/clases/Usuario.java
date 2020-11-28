package clase2.clases;

import java.time.LocalDate;

public class Usuario {

    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String email;

    public Usuario() {
        /*this.nombres = "Giancarlo";
        this.apellidos = "Yarlequé";
        this.email = "giancarlo2709@gmail.com";
        this.fechaNacimiento = LocalDate.now();*/
    }

    public Usuario(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return this.nombres;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", email='" + email + '\'' +
                '}';
    }
}
