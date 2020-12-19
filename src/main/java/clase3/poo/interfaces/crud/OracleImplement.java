package clase3.poo.interfaces.crud;

public class OracleImplement implements DataAccess, Logger {

    @Override
    public void create() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void read() {
        System.out.println("Buscar desde Oracle");
    }

    @Override
    public void update() {
        System.out.println("Actualizar desde Oracle");
    }

    @Override
    public void delete() {
        System.out.println("Eliminar desde Oracle");
    }

    @Override
    public void info() {
        System.out.println("********************** ORACLE INFO **********************");
    }

    @Override
    public void error() {
        System.out.println("********************** ORACLE ERROR **********************");
    }
}
