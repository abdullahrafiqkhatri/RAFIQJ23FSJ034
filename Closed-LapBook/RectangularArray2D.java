package basicsCLB;

public class RectangularArray2D {
	public static void main(String[] args) {
		int[][] twod = {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
		
		//"%4d" - will give you 4digit even space between each element ** you can adjust number according to the space you want 
		//if the product is up to 3-digit long, the spacing between consecutive products will be visible,
		//if the product is 4-digit or greater, the spacing will not be visible.
		
		//using basic for loop
		for(int i=0;i<twod.length;i++) {
			for(int j=0;j<twod[i].length;j++) {
				System.out.printf("%3d",twod[i][j]); // here using %3d
			}
			System.out.println();
		}
		
		System.out.println();
		
		//using enhanced for-each-loop
		for(int[] row : twod) {						//for each row in twod array
			for(int number : row) {					//for each number in the selected row
				System.out.printf("%5d",number);	//here using %5d
			}
			System.out.println();
		}
	}
}
