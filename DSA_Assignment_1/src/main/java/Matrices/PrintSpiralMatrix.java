package main.java.Matrices;

public class PrintSpiralMatrix {

	public static void printSpiral(int[][] arr) {
		int startRow = 0;
		int startCol = 0;
		int endRow = arr.length - 1;
		int endCol = arr[0].length - 1;
		int direction = 0;
		
		while(startRow <= endRow && startCol <= endCol) {
			if(direction == 0) {
				for(int i = startCol; i <= endCol; i++) {
					System.out.print(arr[startRow][i] + " ");
				}
				System.out.println();
				startRow++;
				direction = 1;
			} else if(direction == 1) {
				for(int i = startRow; i <= endRow; i++) {
					System.out.print(arr[i][endCol] + " ");
				}
				System.out.println();
				endCol--;
				direction = 2;
			} else if(direction == 2) {
				for(int i = endCol; i >= startCol; i--) {
					System.out.print(arr[endRow][i] + " ");
				}
				System.out.println();
				endRow--;
				direction = 3;
			} else if(direction == 3) {
				for(int i = endRow; i >= startRow; i--) {
					System.out.print(arr[i][startCol] + " ");
				}
				System.out.println();
				startCol++;
				direction = 0;
			}
		}
		
	}
	public static void main(String[] args) {
		int[][] arr = { {1,   2,  3,  4,  5},
						{6,   7,  8,  9, 10},
						{11, 12, 13, 14, 15},
						{16, 17, 18, 19, 20},
						{21, 22, 23, 24, 25}
					};
		
		printSpiral(arr);

	}

}
