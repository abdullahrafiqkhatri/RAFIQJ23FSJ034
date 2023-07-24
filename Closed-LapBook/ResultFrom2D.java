package basicsCLB;

public class ResultFrom2D {
	public static void main(String[] args) {
		int[][] studentsMarksArray = {{78 ,80,82,90},
										{75,85,95,85},
										{96,86,76,66},
										{70,80,90,99}};
		
		
		for(int[] student: studentsMarksArray) {
			int studentCount=1;
			int subjectCount = 0;
			int totalMarks=0;
        	for(int subjectMark:student) {
        		totalMarks += subjectMark;
        		subjectCount++;
        		
        	}
        	double avgMarks =(double) totalMarks/subjectCount;		//or we can use student.length to divide totalMarks;
        	System.out.println("Result for student "+studentCount+": ");
        	System.out.println("Total Marks: "+totalMarks+"\nAverage: "+avgMarks+"\n");
        	studentCount++;
        }
		
	}
}
