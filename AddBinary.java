// Denise Bruce
// Add Binary numbers

import java.util.*;

public class AddBinary{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] A = {1,1,1,1};
		int[] B = {1,0,1,0};
		int[] C = addB(A, B);

	} // end main

	public static int[] addB(int[] A, int[] B){
		int carry = 0;
		for (int i = A.length; 0 i--){
			sum +=i;
		}
		return sum;
	} // end method sum
} // end class