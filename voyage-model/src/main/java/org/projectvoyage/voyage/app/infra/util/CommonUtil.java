package org.projectvoyage.voyage.app.infra.util;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

/**
 * Contains utility functions of the general purpose
 * @author Dmitriy
 */
public class CommonUtil {

    /**
     * Returns not-null unmodifiable copy of the source set
     * @param source
     * @return
     * @param <T>
     */
    public  static  <T> Set <T> getSafeSet (Set<T> source){
        return Collections.unmodifiableSet(Optional.ofNullable(source).orElse(java.util.Collections.emptySet()));
    }
}
