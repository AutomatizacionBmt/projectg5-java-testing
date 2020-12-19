package clase3.poo.interfaces.crud;

public class CrudExample {

    public static void main(String[] args) {
        DataAccess dataAccess = new OracleImplement();
        operationsCrud(dataAccess);
        operationsLogging((Logger) dataAccess);
    }

    public static void operationsCrud(DataAccess dataAccess ) {
        dataAccess.create();
        dataAccess.read();
        dataAccess.update();
        dataAccess.delete();
    }

    public static void operationsLogging(Logger logger) {
        logger.info();
        logger.error();
    }
}
