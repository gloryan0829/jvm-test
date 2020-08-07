package org.example;

import junit.framework.TestCase;
import org.example.Moim;
import org.junit.Test;


public class MoimTest extends TestCase {


    @Test
    public void testIsNotFull() {
        Moim moim = new Moim();
        moim.maxNumberOfAttendees = 100;
        moim.numberOfEnrollment = 10;
        assertFalse(moim.isEnrollmentFull());
    }

    @Test
    public void testIsFull() {
        Moim moim = new Moim();
        moim.maxNumberOfAttendees = 100;
        moim.numberOfEnrollment = 100;
        assertTrue(moim.isEnrollmentFull());
    }
}
