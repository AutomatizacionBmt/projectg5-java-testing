package clase3.poo.interfaces.crud;

public class MysqlImplement implements DataAccess {

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
}
