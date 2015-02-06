public class MultiArrays {
	public static void main(String[] args) {
		// one dimensional array
		// each element of array is an int
		int[] values = { 3, 5, 2344 };
		System.out.println(values[2]);

		// multi dimensional array
		// each element of array is an array
		// 2D

		int[][] grid = { 			// row, column
				{ 3, 5, 3444 }, 	// row 0
				{ 3, 4 },			// row 1 
				{ 1, 2, 3, 4 }		// row 2 
		};
		
		System.out.println(grid[0][2]);			// row 0, column 2
		
		
		
		String[][] texts = new String[2][3];	// string array
		
		texts[0][1] = "Hello there";
		System.out.println(texts[0][1]);
	
		// output of all 2D array
		for(int row=0; row < grid.length; row++) {
			for(int col=0; col < grid[row].length; col++) {
				// print vypise do jedneho riadku, \t = Tab
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();		//novy riadok
		}
		
	}
}