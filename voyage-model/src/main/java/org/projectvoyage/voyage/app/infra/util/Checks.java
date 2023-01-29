package org.projectvoyage.voyage.app.infra.util;

import org.projectvoyage.voyage.app.infra.exception.flow.InvalidParameterException;

/**
 * Contains common check routines
 */
public class Checks {
    private Checks() {
    }

    /**
     * Verified that specified check passed and throws
     * exception otherwise
     * @param check
     * @param message
     * @throws InvalidParameterException
     */
    public static void checkParameter(boolean check, String message)
    throws InvalidParameterException {
            if (!check){
                throw new InvalidParameterException(message);
            }
        }
    }
