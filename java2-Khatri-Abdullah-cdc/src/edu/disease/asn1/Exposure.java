/**
 * 
 */
package edu.disease.asn1;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * 
 */
public class Exposure {
	private UUID patientId;
	private LocalDateTime dateTime;
	private String exposureType;
	
	/**
	 * 
	 */
	public Exposure(UUID patientId) {
		this.patientId = patientId;
	}
	
	public UUID getPatientID() {
		return this.patientId;
	}
	
	/**
	 * @return the dateTime
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	/**
	 * @return the exposureType
	 */
	public String getExposureType() {
		return exposureType;
	}
	
	/**
	 * @param exposureType the exposureType to set
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
