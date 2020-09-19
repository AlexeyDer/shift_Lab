package shift.Lab.exception;

/**
 * Класс обработки ошибок для значений, которые не нужно перезапивывать при добавлении
 *
 * @author "Alexey Derevtsov"
 */
public class ResourceFoundMatchException extends RuntimeException {

    public ResourceFoundMatchException(String message) {
        super(message);
    }
}
