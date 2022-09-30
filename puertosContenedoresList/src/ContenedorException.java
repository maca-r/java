public class ContenedorException extends Exception{

    public ContenedorException() {
        super();
    }

    public ContenedorException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "El país de procedencia no es válido" ;
    }
}
