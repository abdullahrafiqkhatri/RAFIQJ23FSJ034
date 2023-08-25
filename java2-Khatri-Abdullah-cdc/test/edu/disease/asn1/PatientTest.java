package edu.disease.asn1;

import org.junit.jupiter.api.Test;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

public class PatientTest {

    @Test
    public void testConstructorAndGetters() {
        int maxDiseases = 5;
        int maxExposures = 10;
        Patient patient = new Patient(maxDiseases, maxExposures);
        UUID patientID = UUID.randomUUID();
        patient.setPatientID(patientID);
        patient.setFirstName("John");
        patient.setLastName("Doe");

        assertEquals(patientID, patient.getPatientID());
        assertEquals("John", patient.getFirstName());
        assertEquals("Doe", patient.getLastName());
        assertArrayEquals(new Exposure[maxExposures], patient.getExposures());
        assertArrayEquals(new UUID[maxDiseases], patient.getDiseaseIDs());
    }

    @Test
    public void testAddDiseaseID() {
        int maxDiseases = 2;
        int maxExposures = 3;
        Patient patient = new Patient(maxDiseases, maxExposures);
        UUID diseaseID = UUID.randomUUID();

        patient.addDiseaseID(diseaseID);
        assertArrayEquals(new UUID[]{diseaseID, null}, patient.getDiseaseIDs());

        UUID diseaseID2 = UUID.randomUUID();
        patient.addDiseaseID(diseaseID2);
        assertArrayEquals(new UUID[]{diseaseID, diseaseID2}, patient.getDiseaseIDs());

        assertThrows(IndexOutOfBoundsException.class, () -> patient.addDiseaseID(UUID.randomUUID()));
    }
	    
    @Test
    public void testAddExposure() {
        int maxDiseases = 2;
        int maxExposures = 3;
        Patient patient = new Patient(maxDiseases, maxExposures);
        Exposure exposure = new Exposure(UUID.randomUUID());

        patient.addExposure(exposure);
        assertArrayEquals(new Exposure[]{exposure, null, null}, patient.getExposures());

        Exposure exposure2 = new Exposure(UUID.randomUUID());
        patient.addExposure(exposure2);
        assertArrayEquals(new Exposure[]{exposure, exposure2, null}, patient.getExposures());

    }

    @Test
    public void testEqualsAndHashCode() {
        int maxDiseases = 2;
        int maxExposures = 3;
        UUID patientID = UUID.randomUUID();

        Patient patient1 = new Patient(maxDiseases, maxExposures);
        patient1.setPatientID(patientID);

        Patient patient2 = new Patient(maxDiseases, maxExposures);
        patient2.setPatientID(patientID);

        assertEquals(patient1, patient2);
        assertEquals(patient1.hashCode(), patient2.hashCode());

        Patient patient3 = new Patient(maxDiseases, maxExposures);
        patient3.setPatientID(UUID.randomUUID());

        assertNotEquals(patient1, patient3);
    }
    
    @Test
    public void testAddDiseaseIDFullArray() {
        int maxDiseases = 2;
        int maxExposures = 3;
        Patient patient = new Patient(maxDiseases, maxExposures);

        UUID diseaseID1 = UUID.randomUUID();
        UUID diseaseID2 = UUID.randomUUID();
        patient.addDiseaseID(diseaseID1);
        patient.addDiseaseID(diseaseID2);

        UUID diseaseID3 = UUID.randomUUID();
        assertThrows(IndexOutOfBoundsException.class, () -> patient.addDiseaseID(diseaseID3));
    }

    @Test
    public void testAddExposureFullArray() {
        int maxDiseases = 2;
        int maxExposures = 1;
        Patient patient = new Patient(maxDiseases, maxExposures);

        Exposure exposure1 = new Exposure(UUID.randomUUID());
        patient.addExposure(exposure1);

        Exposure exposure2 = new Exposure(UUID.randomUUID());
        assertThrows(IndexOutOfBoundsException.class, () -> patient.addExposure(exposure2));
    }

    @Test
    public void testEqualsWithDifferentTypes() {
        int maxDiseases = 2;
        int maxExposures = 3;
        UUID patientID = UUID.randomUUID();

        Patient patient = new Patient(maxDiseases, maxExposures);
        patient.setPatientID(patientID);

        // Ensure equals returns false when compared to a different type
        assertFalse(patient.equals(patientID));
    }

    @Test
    public void testEqualsWithNull() {
        int maxDiseases = 2;
        int maxExposures = 3;
        UUID patientID = UUID.randomUUID();

        Patient patient = new Patient(maxDiseases, maxExposures);
        patient.setPatientID(patientID);

        // Ensure equals returns false when compared to null
        assertFalse(patient.equals(null));
    }
    
    @Test
    public void testToString() {
        int maxDiseases = 2;
        int maxExposures = 3;
        UUID patientID = UUID.randomUUID();

        Patient patient = new Patient(maxDiseases, maxExposures);
        patient.setPatientID(patientID);
        patient.setFirstName("Jane");
        patient.setLastName("Smith");

        String expected = "Patient{patientId=" + patientID + ", firstName='Jane', lastName='Smith'}";
        assertEquals(expected, patient.toString());
    }
    
    @Test
    public void testConstructorWithInvalidArguments() {
        // Ensure constructor throws IllegalArgumentException for non-positive maxDiseases and maxExposures
        assertThrows(IllegalArgumentException.class, () -> new Patient(0, 5));
        assertThrows(IllegalArgumentException.class, () -> new Patient(5, 0));
        assertThrows(IllegalArgumentException.class, () -> new Patient(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> new Patient(5, -1));
    }

    @Test
    public void testSetDiseaseIDs() {
        int maxDiseases = 2;
        int maxExposures = 3;
        UUID diseaseID1 = UUID.randomUUID();
        UUID diseaseID2 = UUID.randomUUID();

        Patient patient = new Patient(maxDiseases, maxExposures);
        UUID[] diseaseIDs = {diseaseID1, diseaseID2};

        patient.setDiseaseIDs(diseaseIDs);
        assertArrayEquals(diseaseIDs, patient.getDiseaseIDs());

        }

    @Test
    public void testSetExposures() {
        int maxDiseases = 2;
        int maxExposures = 3;
        Exposure exposure1 = new Exposure(UUID.randomUUID());
        Exposure exposure2 = new Exposure(UUID.randomUUID());

        Patient patient = new Patient(maxDiseases, maxExposures);
        Exposure[] exposures = {exposure1, exposure2};

        assertDoesNotThrow(() -> patient.setExposures(exposures));
        assertArrayEquals(exposures, patient.getExposures());
    }



}
