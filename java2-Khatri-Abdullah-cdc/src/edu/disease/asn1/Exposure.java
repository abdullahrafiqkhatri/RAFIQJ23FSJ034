/**
 * 
 */
package edu.disease.asn1;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * Represents an exposure event.
 */
public class Exposure {
	private UUID patientId;
	private LocalDateTime dateTime;
	private String exposureType;
	
	/**
	 * Constructor for creating an Exposure instance.
	 * @param patientId
	 */
	public Exposure(UUID patientId) {
		this.patientId = patientId;
	}
	
	/**
     * Getter for the patientId property.
     *
     * @return The UUID of the patient.
     */
	public UUID getPatientID() {
		return this.patientId;
	}
	
	/**
     * Getter for the dateTime property.
     *
     * @return The date and time of the exposure.
     */
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	/**
     * Setter for the dateTime property.
     *
     * @param dateTime The date and time of the exposure.
     */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	/**
     * Getter for the exposureType property.
     *
     * @return The type of exposure ("D" for direct or "I" for indirect).
     */
	public String getExposureType() {
		return exposureType;
	}
	
	/**
     * Setter for the exposureType property.
     *
     * @param exposureType The type of exposure ("D" for direct or "I" for indirect).
     * @throws IllegalArgumentException If the exposureType is not "D" or "I".
     */
	public void setExposureType(String exposureType) {
		if(!exposureType.equals("D") && !exposureType.equals("I")) {
			throw new IllegalArgumentException("Exposure type must be D or I");
		}
		this.exposureType = exposureType;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(patientId, dateTime);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass()!= obj.getClass()) {
			return false;
		}
		Exposure exposure = (Exposure) obj;
		return Objects.equals(patientId, exposure.patientId) && Objects.equals(dateTime, exposure.dateTime);
	}
	
	@Override
	public String toString() {
		return "Exposure{" +
                "patientId=" + patientId +
                ", dateTime=" + dateTime +
                ", exposureType='" + exposureType + '\'' +
                '}';
	}
	
}
