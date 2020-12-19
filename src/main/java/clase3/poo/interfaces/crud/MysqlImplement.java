package clase3.poo.interfaces.crud;

public class MysqlImplement implements DataAccess, Logger {

    @Override
    public void create() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void read() {
        System.out.println("Buscar desde Mysql");
    }

    @Override
    public void update() {
        System.out.println("Actualizar desde Mysql");
    }

    @Override
    public void delete() {
        System.out.println("Eliminar desde Mysql");
    }

    @Override
    public void info() {
        System.out.println("********************** MYSQL INFO **********************");
    }

    @Override
    public void error() {
        System.out.println("********************** MYSQL ERROR **********************");
    }
}
