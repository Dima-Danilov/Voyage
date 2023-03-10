package org.projectvoyage.voyage.app.infra.exception;

import org.projectvoyage.voyage.app.infra.exception.base.AppException;

/**
 * Signals about incorrect configuration settings/parameters
 */

public class ConfigurationException extends AppException {

    private static final long serialVersionUID = -2177284893894040026L;

    public ConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigurationException(String message) {
        super(message);
    }
}
