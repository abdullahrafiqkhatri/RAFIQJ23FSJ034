package edu.disease.asn2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImplTest {

	@Test
    public void testConstructor() {
        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(5, 10);

        assertNotNull(manager);
    }

    @Test
    public void testConstructorWithInvalidMaxDiseases() {
        assertThrows(IllegalArgumentException.class, () -> {
            new DiseaseControlManagerImpl(0, 10);
        });
    }

    @Test
    public void testConstructorWithInvalidMaxPatients() {
        assertThrows(IllegalArgumentException.class, () -> {
            new DiseaseControlManagerImpl(5, -1);
        });
    }

    @Test
    public void testAddPatientMaxDiseasesAndMaxExposure() {
        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(5, 2);

        Patient patient = manager.addPatient("John", "Doe", 1, 1);

        assertNotNull(patient);
    }

    

    
	
    @Test
    public void testAddDisease() {
        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(5, 10);

        Disease disease1 = manager.addDisease("COVID-19", true);
        Disease disease2 = manager.addDisease("Diabetes", false);

        assertNotNull(disease1);
        assertNotNull(disease2);

        assertEquals("COVID-19", disease1.getName());
        assertTrue(disease1 instanceof InfectiousDisease);

        assertEquals("Diabetes", disease2.getName());
        assertTrue(disease2 instanceof NonInfectiousDisease);
    }

    @Test
    public void testGetDisease() {
        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(5, 10);

        Disease disease1 = manager.addDisease("COVID-19", true);
        Disease disease2 = manager.addDisease("Diabetes", false);

        UUID id1 = disease1.getDiseaseID();
        UUID id2 = disease2.getDiseaseID();

        Disease retrievedDisease1 = manager.getDisease(id1);
        Disease retrievedDisease2 = manager.getDisease(id2);

        assertNotNull(retrievedDisease1);
        assertNotNull(retrievedDisease2);

        assertEquals("COVID-19", retrievedDisease1.getName());
        assertTrue(retrievedDisease1 instanceof InfectiousDisease);

        assertEquals("Diabetes", retrievedDisease2.getName());
        assertTrue(retrievedDisease2 instanceof NonInfectiousDisease);
    }

    @Test
    public void testAddPatient() {
        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(5, 10);

        Patient patient1 = manager.addPatient("John", "Doe", 3, 5);
        Patient patient2 = manager.addPatient("Jane", "Smith", 2, 4);

        assertNotNull(patient1);
        assertNotNull(patient2);

        assertEquals("John", patient1.getFirstName());
        assertEquals("Doe", patient1.getLastName());

        assertEquals("Jane", patient2.getFirstName());
        assertEquals("Smith", patient2.getLastName());
    }

    @Test
    public void testGetPatient() {
        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(5, 10);

        Patient patient1 = manager.addPatient("John", "Doe", 3, 5);
        Patient patient2 = manager.addPatient("Jane", "Smith", 2, 4);

        UUID id1 = patient1.getPatientID();
        UUID id2 = patient2.getPatientID();

        Patient retrievedPatient1 = manager.getPatient(id1);
        Patient retrievedPatient2 = manager.getPatient(id2);

        assertNotNull(retrievedPatient1);
        assertNotNull(retrievedPatient2);

        assertEquals("John", retrievedPatient1.getFirstName());
        assertEquals("Doe", retrievedPatient1.getLastName());

        assertEquals("Jane", retrievedPatient2.getFirstName());
        assertEquals("Smith", retrievedPatient2.getLastName());
    }

    @Test
    public void testAddDiseaseToPatient() {
        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(5, 10);

        Disease disease1 = manager.addDisease("COVID-19", true);
        Disease disease2 = manager.addDisease("Diabetes", false);

        Patient patient1 = manager.addPatient("John", "Doe", 1, 5);
        Patient patient2 = manager.addPatient("Jane", "Smith", 1, 4);

        manager.addDiseaseToPatient(patient1.getPatientID(), disease1.getDiseaseID());
        manager.addDiseaseToPatient(patient2.getPatientID(), disease2.getDiseaseID());

        UUID[] patient1DiseaseIDs = patient1.getDiseaseIDs();
        UUID[] patient2DiseaseIDs = patient2.getDiseaseIDs();

        assertEquals(1, patient1DiseaseIDs.length);
        assertEquals(disease1.getDiseaseID(), patient1DiseaseIDs[0]);

        assertEquals(1, patient2DiseaseIDs.length);
        assertEquals(disease2.getDiseaseID(), patient2DiseaseIDs[0]);
    }

    @Test
    public void testAddExposureToPatient() {
        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(5, 10);

        Patient patient1 = manager.addPatient("John", "Doe", 3, 1);
        Patient patient2 = manager.addPatient("Jane", "Smith", 2, 1);

        Exposure exposure1 = new Exposure(patient1.getPatientID());
        Exposure exposure2 = new Exposure(patient2.getPatientID());

        manager.addExposureToPatient(patient1.getPatientID(), exposure1);
        manager.addExposureToPatient(patient2.getPatientID(), exposure2);

        Exposure[] patient1Exposures = patient1.getExposures();
        Exposure[] patient2Exposures = patient2.getExposures();

        assertEquals(1, patient1Exposures.length);
        assertEquals(exposure1, patient1Exposures[0]);

        assertEquals(1, patient2Exposures.length);
        assertEquals(exposure2, patient2Exposures[0]);
    }

    @Test
    public void testAddDiseaseToPatient_PatientNotFound() {
        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(5, 10);
        Disease disease = manager.addDisease("COVID-19", true);

        UUID fakePatientId = UUID.randomUUID();

        assertThrows(IllegalArgumentException.class, () -> {
            manager.addDiseaseToPatient(fakePatientId, disease.getDiseaseID());
        });
    }


    @Test
    public void testAddDiseaseToPatient_DiseaseNotFound() {
        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(5, 10);
        Patient patient = manager.addPatient("John", "Doe", 3, 5);

        UUID fakeDiseaseId = UUID.randomUUID();

        assertThrows(IllegalArgumentException.class, () -> {
            manager.addDiseaseToPatient(patient.getPatientID(), fakeDiseaseId);
        });
    }

    @Test
    public void testAddExposureToPatient_PatientNotFound() {
        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(5, 10);
        Exposure exposure = new Exposure(UUID.randomUUID());

        UUID fakePatientId = UUID.randomUUID();

        assertThrows(IllegalArgumentException.class, () -> {
            manager.addExposureToPatient(fakePatientId, exposure);
        });
    }
    
    @Test
    public void testFindEmptyIndexArrayFull() {
        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(2, 2);

        Patient patient1 = manager.addPatient("John", "Doe", 3, 5);
        Patient patient2 = manager.addPatient("Jane", "Smith", 2, 4);

        int emptyIndex = manager.findEmptyIndex(manager.getPatients());

        assertEquals(-1, emptyIndex);
    }

}
