/**
 * 
 */
package edu.disease.asn2;
import java.util.Objects;
import java.util.UUID;
/**
 * 
 */
public abstract class Disease {
	private UUID diseaseID;
	private String name;
	
	public abstract String[] getExamples();
	
	/**
	 * @return the diseaseID
	 */
	public UUID getDiseaseID() {
		return diseaseID;
	}
	
	/**
	 * @param diseaseID the diseaseID to set
	 */
	public void setDiseaseID(UUID diseaseID) {
		this.diseaseID = diseaseID;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(diseaseID);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Disease disease = (Disease) obj;
		return Objects.equals(diseaseID, disease.diseaseID);
	}
	
	@Override
    public String toString() {
        return "Disease{" +
                "diseaseId=" + diseaseID +
                ", name='" + name + '\'' +
                '}';
    }
}
