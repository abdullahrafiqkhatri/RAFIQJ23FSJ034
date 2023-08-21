/**
 * 
 */
package edu.disease.asn1;

import java.util.Objects;
import java.util.UUID;
/**
 * Represents a patient with exposures and disease IDs.
 */
public class Patient {
	private UUID patientID;
	private String firstName;
	private String lastName;
	private Exposure[] exposures;
	private UUID[] diseaseIDs;
	
	/**
     * Constructor for creating a Patient instance.
     *
     * @param maxDiseases   Maximum number of diseases.
     * @param maxExposures  Maximum number of exposures.
     * @throws IllegalArgumentException If maxDiseases or maxExposures are non-positive.
     */
	public Patient(int maxDiseases, int maxExposures) {
		if(maxDiseases<=0 || maxExposures <=0) {
			throw new IllegalArgumentException("maxDiseases and maxExposure must be greater than zero");
		}
		diseaseIDs = new UUID[maxDiseases];
		exposures = new Exposure[maxExposures];
	}
	
	/**
     * Adds a disease ID to the diseaseIds array.
     *
     * @param diseaseId The UUID of the disease.
     * @throws IndexOutOfBoundsException If the diseaseIds array is full.
     */
	public void addDiseaseID(UUID diseaseID) {
		for(int i=0; i<diseaseIDs.length; i++) {
			if (diseaseIDs[i] == null) {
				diseaseIDs[i]= diseaseID;
				return;
			}
		}
		throw new IndexOutOfBoundsException("Disease IDs array is FULL!");
	}
	
	/**
     * Adds an exposure to the exposures array.
     *
     * @param exposure The exposure to add.
     * @throws IndexOutOfBoundsException If the exposures array is full.
     */	
	public void addExposure(Exposure exposure) {
		for(int i=0; i<exposures.length; i++) {
			if(exposures[i]== null ) {
				exposures[i]= exposure; 
				return;
			}
		}
		throw new IndexOutOfBoundsException("Exposures array is FULL!");
	}
	
	/**
	 * @return the patientID
	 */
	public UUID getPatientID() {
		return patientID;
	}
	
	/**
	 * @param patientID the patientID to set
	 */
	public void setPatientID(UUID patientID) {
		this.patientID = patientID;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @return the exposures
	 */
	public Exposure[] getExposures() {
		return exposures;
	}
	
	/**
	 * @param exposures the exposures to set
	 */
	public void setExposures(Exposure[] exposures) {
		this.exposures = exposures;
	}
	
	/**
	 * @return the diseaseIDs
	 */
	public UUID[] getDiseaseIDs() {
		return diseaseIDs;
	}
	
	/**
	 * @param diseaseIDs the diseaseIDs to set
	 */
	public void setDiseaseIDs(UUID[] diseaseIDs) {
		this.diseaseIDs = diseaseIDs;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(patientID);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Patient patient = (Patient) obj;
		return Objects.equals(patientID, patient.patientID);
	}
	
	@Override
	public String toString() {
		return "Patient{" +
                "patientId=" + patientID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
	}
	
}
