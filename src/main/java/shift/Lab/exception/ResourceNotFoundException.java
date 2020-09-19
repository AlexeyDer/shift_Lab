package shift.Lab.exception;

/**
 * Класс обработки ошибок для значений, которые не были найдены
 *
 * @author "Alexey Derevtsov"
 */
public class ResourceNotFoundException extends RuntimeException {
    private static final int serialVersionUID = 1;

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
