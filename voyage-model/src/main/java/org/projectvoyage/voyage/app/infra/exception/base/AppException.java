package org.projectvoyage.voyage.app.infra.exception.base;


/**
 * Мы встретили исключительную ситуацию и сигнализируем о ней
 * Мы словили исключение и перевыбрасываем его
 */
public class AppException extends RuntimeException{
    private static final long serialVersionUID = 7837501112802868980L;

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(String message) {
        super(message);
    }
}
