public class MatrixMultiple {

	public static void main(String[] args) {
	// create two matrices
		int a1[][] = {{5,2,1},{2,4,2},{2,4,3}};
		int a2[][] = {{1,3,2},{2,2,6,},{2,3,2}};
		
		// create res to restore multiple result
		int result[][] = new int[3][3];
		
		// multiplication & printing of a1 7 a2
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				result[i][j]=0;
				for(int k=0;k<3;k++) {
					result[i][j] += a1[i][k] * a2[k][j];
				}
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
			
			}
		
		

	}

}
