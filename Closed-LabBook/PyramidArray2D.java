package basicsCLB;

public class PyramidArray2D {
	public static void main(String[] args) {
		int[][] twod = {{1},
						{2,3},
						{4,5,6,},
						{7,8,9,10}};
		
		
		for(int[] row : twod) {						
			for(int number : row) {					
				System.out.print(number+" ");	
			}
			System.out.println();
		}
		
	}
}
