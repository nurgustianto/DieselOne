public class TaskOne {
	public static void main(String[] args) {  
		int r = 5;  
		boolean flg = false;
		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 8; col++) {
				if (col == 1 || (row == 1 || row == 10/2) && col%2 == 1 || col == 8 && row < 10/2 && row!=1)
					System.out.print("X");
				else if (row > 10/2 && col == r) {
					System.out.print("X");
					flg = true;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			if(flg == true) {
				r++;
			}
			
		}

	}
}