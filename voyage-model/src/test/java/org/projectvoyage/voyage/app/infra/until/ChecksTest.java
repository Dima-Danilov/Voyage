package org.projectvoyage.voyage.app.infra.until;

import org.junit.Test;
import org.projectvoyage.voyage.app.infra.exception.flow.InvalidParameterException;
import org.projectvoyage.voyage.app.infra.util.Checks;

import static org.junit.Assert.*;

public class ChecksTest {

    @Test
    public void testCheckParameterGetException(){
        try {
            Checks.checkParameter(false, "test");
            assertTrue(false);
        } catch (Exception exception){
            assertSame(exception.getClass(), InvalidParameterException.class);
            assertEquals(exception.getMessage(), "test");
        }
    }

    @Test
    public  void testCheckParameterNoException(){
        Checks.checkParameter(true, "test");
        assertTrue(true);
    }
}
