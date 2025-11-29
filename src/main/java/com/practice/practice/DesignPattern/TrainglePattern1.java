package com.practice.practice.DesignPattern;

public class TrainglePattern1 {

	public static void main(String[] args) {
//		pattern1(4);
		pattern2(5);
	}

	// *
	// **
	// ***
	// ****
//	static void pattern1(int n) {
//		for (int row = 1; row <= n; row++) {
//			// for every row, run the col
//			for (int col = 1; col <= row; col++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
//   }

	// ****
	// ****
	// ****
	// ****
//	static void pattern1(int n) {
//		for (int row = 1; row <= n; row++) {
//			// for every row, run the col
//			for (int col = 1; col <= n; col++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
//	}

	// ****
	// ***
	// **
	// *
//	static void pattern1(int n) {
//	   for(int row =1 ; row<=n ; row++) {
//		   for(int col=1 ; col <= n-row+1 ; col++ ) {
//			   System.out.print("* ");
//		   }
//		   System.out.println("");
//	   }
//	}

	// 1
	// 12
	// 123
	// 1234
//	static void pattern1(int n) {
//		   for(int row =1 ; row<=n ; row++) {
//			   for(int col=1 ; col <= row ; col++ ) {
//				   System.out.print(col);
//			   }
//			   System.out.println("");
//		   }
//		}

	// *
	// **
	// ***
	// ****
	// ***
	// **
	// *
	// approach1
//	static void pattern1(int n) {
//		for (int row = 1; row <= n; row++) {
//			for (int col = 1; col <= row; col++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
//		for (int row = 1; row <= n - 1; row++) {
//			for (int col = 1; col <= n - row; col++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
//	}
	// approach2
//	static void pattern1(int n) {
//		for (int row = 1; row <= 2 * n - 1; row++) {
//			int stars = (row <= n) ? row : 2 * n - row;
//			for (int col = 1; col <= stars; col++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}

	// ****
	// *  *
	// *  *
	// ****
//	static void pattern1(int n) {
//		for (int row = 0; row < n; row++) {
//			for (int col = 0; col < n; col++) {
//				if (row == 0 || col == 0 || row == n - 1 || col == n - 1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println("");
//		}
//	}
	
	//    *
	//   * *
	//  * * *
	// * * * * 
	//* * * * *
	// * * * *
	//  * * *
	//   * *
	//    *
//	static void pattern2(int n) {
//	    for (int row = 1; row <= 2 * n - 1; row++) {
//	        int totalColsInRow = row > n ? 2 * n - row : row;
//	        int noOfSpace = n - totalColsInRow;
//	        for (int s = 0; s < noOfSpace; s++) {
//	            System.out.print(" ");
//	        }
//	        for (int col = 0; col < totalColsInRow; col++) {
//	            System.out.print("* ");
//	        }
//	        System.out.println();
//	    }
//	}	

	//    1
	//   212
	//  32123
	// 4321234
	//543212345
//	static void pattern2(int n) {
//		for(int row = 1 ; row <= n ; row++) {
//			for(int space = 0 ; space < n-row ; space ++) {
//				System.out.print(" ");
//			}
//			for(int col = row; col >= 1; col--) {
//				System.out.print(col);
//			}
//			for(int col = 2; col <= row; col++) {
//				System.out.print(col);
//			}
//			System.out.println();
//		}
//	}
	
	//    1
	//   212
	//  32123
	// 4321234 
	//  32123
	//   212
	//    1
	static void pattern2(int n) {
	    for (int row = 1; row <= 2 * n; row++) {

	        int c = row > n ? 2 * n - row : row;   //upper & lower part mirror
	        for (int space = 0; space < n - c; space++) {
	            System.out.print("  ");
	        }
	        // descending numbers
	        for (int col = c; col >= 1; col--) {
	            System.out.print(col + " ");
	        }
	        // ascending numbers
	        for (int col = 2; col <= c; col++) {
	            System.out.print(col + " ");
	        }
	        System.out.println();
	    }
	}

	
	

}
