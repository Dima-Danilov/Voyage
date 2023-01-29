package org.projectvoyage.voyage.app.infra.exception;

import org.projectvoyage.voyage.app.infra.exception.base.AppException;

/**
 * Signals about data access layer unexpected situations
 */

public class PersistenceException extends AppException {
    private static final long serialVersionUID = -7889716045779735512L;

    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersistenceException(String message) {
        super(message);
    }
}
