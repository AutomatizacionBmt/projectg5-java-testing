package clase2.clases;

import java.time.LocalDate;

public class EjecutaUsuario {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNombres("Giancarlo");
        usuario.setApellidos("Yarlequé");
        usuario.setFechaNacimiento(LocalDate.of(1992, 9, 27));
        usuario.setEmail("giancarlo2709@gmail.com");

        System.out.println(usuario);

        Usuario usuario2 = new Usuario("Elvis", "Juárez");
        System.out.println(usuario2);
    }
}
