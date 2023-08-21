package edu.disease.asn1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.UUID;

public class ExposureTest {

    @Test
    public void testConstructorAndGetters() {
        UUID patientId = UUID.randomUUID();
        Exposure exposure = new Exposure(patientId);

        assertEquals(patientId, exposure.getPatientID());
        assertNull(exposure.getDateTime());
        assertNull(exposure.getExposureType());
    }

    @Test
    public void testSetDateTime() {
        UUID patientId = UUID.randomUUID();
        Exposure exposure = new Exposure(patientId);
        LocalDateTime dateTime = LocalDateTime.now();

        exposure.setDateTime(dateTime);
        assertEquals(dateTime, exposure.getDateTime());
    }

    @Test
    public void testSetExposureType() {
        UUID patientId = UUID.randomUUID();
        Exposure exposure = new Exposure(patientId);

        exposure.setExposureType("D");
        assertEquals("D", exposure.getExposureType());

        exposure.setExposureType("I");
        assertEquals("I", exposure.getExposureType());

        assertThrows(IllegalArgumentException.class, () -> exposure.setExposureType("Invalid"));
    }

    @Test
    public void testEqualsAndHashCode() {
        UUID patientId1 = UUID.randomUUID();
        UUID patientId2 = UUID.randomUUID();
        LocalDateTime dateTime = LocalDateTime.now();

        Exposure exposure1 = new Exposure(patientId1);
        exposure1.setDateTime(dateTime);
        exposure1.setExposureType("D");

        Exposure exposure2 = new Exposure(patientId1);
        exposure2.setDateTime(dateTime);
        exposure2.setExposureType("D");

        Exposure exposure3 = new Exposure(patientId2);
        exposure3.setDateTime(dateTime);
        exposure3.setExposureType("D");

        assertTrue(exposure1.equals(exposure2));
        assertFalse(exposure1.equals(exposure3));

        assertEquals(exposure1.hashCode(), exposure2.hashCode());
    }

    @Test
    public void testToString() {
        UUID patientId = UUID.randomUUID();
        Exposure exposure = new Exposure(patientId);
        exposure.setDateTime(LocalDateTime.now());
        exposure.setExposureType("I");

        String expected = "Exposure{patientId=" + patientId + ", dateTime=" + exposure.getDateTime() + ", exposureType='I'}";
        assertEquals(expected, exposure.toString());
    }
}
