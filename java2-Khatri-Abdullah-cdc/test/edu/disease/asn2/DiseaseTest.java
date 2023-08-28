package edu.disease.asn2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

public class DiseaseTest {
	
	@Test
    public void testGetDiseaseID() {
        Disease disease = new InfectiousDisease();
        UUID id = UUID.randomUUID();
        disease.setDiseaseID(id);
        assertEquals(id, disease.getDiseaseID());
    }

    @Test
    public void testGetName() {
        Disease disease = new InfectiousDisease();
        String name = "COVID-19";
        disease.setName(name);
        assertEquals(name, disease.getName());
    }

    

    @Test
    public void testHashCode() {
        Disease disease1 = new InfectiousDisease();
        Disease disease2 = new InfectiousDisease();
        UUID id = UUID.randomUUID();
        disease1.setDiseaseID(id);
        disease2.setDiseaseID(id);
        assertEquals(disease1.hashCode(), disease2.hashCode());
    }

    @Test
    public void testToString() {
        Disease disease = new InfectiousDisease();
        UUID id = UUID.randomUUID();
        String name = "Influenza";
        disease.setDiseaseID(id);
        disease.setName(name);
        assertEquals("Disease{diseaseId=" + id + ", name='" + name + '\'' + '}', disease.toString());
    }
	
    @Test
    public void testInfectiousDiseaseExamples() {
        InfectiousDisease disease = new InfectiousDisease();
        String[] examples = disease.getExamples();
        assertArrayEquals(new String[]{"Influenza", "Covid-19", "HIV", "Malaria"}, examples);
    }

    @Test
    public void testNonInfectiousDiseaseExamples() {
        NonInfectiousDisease disease = new NonInfectiousDisease();
        String[] examples = disease.getExamples();
        assertArrayEquals(new String[]{"Diabeties", "Cancer", "Alzheimer's", "Heart Disease"}, examples);
    }
    
    @Test
    public void testEquals() {
        Disease disease1 = new InfectiousDisease();
        Disease disease2 = new InfectiousDisease();
        Disease disease3 = null;

        // Testing object reference equality
        assertTrue(disease1.equals(disease1));

        // Testing null reference
        assertFalse(disease1.equals(disease3));

        // Testing object class mismatch
        assertFalse(disease1.equals("not_a_disease"));

        // Testing equal disease IDs
        UUID id = UUID.randomUUID();
        disease1.setDiseaseID(id);
        disease2.setDiseaseID(id);
        assertTrue(disease1.equals(disease2));

        // Testing different disease IDs
        disease2.setDiseaseID(UUID.randomUUID());
        assertFalse(disease1.equals(disease2));
    }
    
    
}
