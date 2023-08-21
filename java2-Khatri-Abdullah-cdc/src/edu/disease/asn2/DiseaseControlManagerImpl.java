/**
 * 
 */
package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

/**
 * 
 */
public class DiseaseControlManagerImpl implements DiseaseControlManager{
	
	private Disease[] diseases;
	private Patient[] patients;
	private int emptyIndex;
	
	
	public DiseaseControlManagerImpl(int maxDiseases, int maxPatients) {
		if(maxDiseases <= 0 || maxPatients <=0) {
			throw new IllegalArgumentException("maxDiseases and maxPatients must be greater than zero");
		}
		
		diseases = new Disease[maxDiseases];
		patients = new Patient[maxPatients];
	}
	/**
	 * To find Empty Index in the array.
	 * @param array Send object's array
	 * @return If found then the INDEX number or negative1.
	 */
	public int findEmptyIndex(Object[] array) {
		for(int i=0; i<array.length; i++) {
			if(array[i]== null ) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public Disease addDisease(String name, boolean infectious) {
		
		emptyIndex = findEmptyIndex(diseases);
		if (emptyIndex == -1) {
			throw new IllegalStateException("No more diseases can be added.");
		}
		
		Disease newDisease;
		if(infectious) {
			newDisease = new InfectiousDisease();
		} else {
			newDisease = new NonInfectiousDisease();
		}
		newDisease.setName(name);
		diseases[emptyIndex] = newDisease;
		return newDisease;		
	}

	@Override
	public Disease getDisease(UUID diseaseId) {
		for(Disease disease : diseases) {
			if(disease !=null || disease.getDiseaseID().equals(diseaseId)) {
				return disease;
			}
		}
		return null;
	}

	@Override
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposure) {
		emptyIndex = findEmptyIndex(patients);
		if(emptyIndex == -1) {
			throw new IllegalStateException("No more patients can be added.");
		}
		
		Patient newPatient = new Patient(maxDiseases, maxExposure);
		newPatient.setFirstName(firstName);
		newPatient.setLastName(lastName);
		patients[emptyIndex] = newPatient;
		return newPatient;
	}

	@Override
	public Patient getPatient(UUID patientId) {
		for(Patient patient : patients) {
			if(patient != null && patient.getPatientID().equals(patientId)) {
				return patient;
			}
		}
		return null;
	}

	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
		Patient patient = getPatient(patientId);

		//if patient not found throw an error
		if(patient == null) {
			throw new IllegalArgumentException("Patient not found.");
		}
		
		Disease disease = getDisease(diseaseId);
		
		//if disease not found throw an error
		if(disease == null) {
			throw new IllegalArgumentException("Disease not found.");
		}
		
		patient.addDiseaseID(diseaseId);		
		
	}

	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposure) {
		Patient patient = getPatient(patientId);
		
		if(patient == null) {
			throw new IllegalArgumentException("Patient not found.");
		}
		
		patient.addExposure(exposure);
		
	}
	
}
