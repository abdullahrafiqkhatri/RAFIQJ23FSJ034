/**
 * 
 */
package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

/**
 * 
 */
public interface DiseaseControlManager {
	/**
	 * Adds a new Disease to the application
	 * @param name  A new Name for the disease
	 * @param infectious True if the disease is infectious, false otherwise
	 * @return The added Disease instance.
	 */
	Disease addDisease(String name, boolean infectious);
	
	/**
	 * Returns the disease associated with the provided disease ID.
	 * 
	 * @param diseaseId The Unique Id of the Disease
	 * @return The disease instance or null if not found
	 */
	Disease getDisease(UUID diseaseId);
	
	/**
	 * Add a new patient to the application
	 * 
	 * @param firstName The first name of the patient
	 * @param lastName The last name of the patient
	 * @param maxDiseases The maximum number of disease for the patient
	 * @param maxExposure The maximum number of exposure for the patient
	 * @return The added Patient instance
	 */
	Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposure);
	
	/**
	 * Returns the patient associated with the provided patient ID.
	 * 
	 * @param patientId The Unique Id of the patient.
	 * @return The patient instance or null if not found
	 */
	Patient getPatient(UUID patientId);
	
	/**
	 * Adds a Disease to a Patient associated with the provided patient id and disease id.
	 * 
	 * @param patientId The Unique Id of the patient.
	 * @param diseaseId The Unique Id of the disease.
	 */
	void addDiseaseToPatient(UUID patientId,UUID diseaseId);
	
	/**
	 * Adds an Exposure to a patient associated with the provided patient id and the exposure instance.
	 * @param patientId The Unique Id of the patient
	 * @param exposure The Exposure instance to add.
	 */
	void addExposureToPatient(UUID patientId, Exposure exposure);
	
}
