/**
Write an algorithm such that if an element in an M*N matrix is 0, its entire row and column are set to 0. 
**/

public void setZeros(int[][] matrix){
	boolean[] row = new boolean[matrix.length];
	boolean[] col = new boolean[matrix[0].length];
	//set a flag to the rows and columns where there is a space contains 0.
	for(int i=0; i<matrix.length; i++){
		for(int a=0; a<matrix[i].length; a++){
			if(matrix[i][a]==0){
				row[i]=true;
				col[a]=true;
			}
		}
	}
	//set the space to zero where either its row or column equals true
	for(int i=0; i<matrix.length;i++){
		for(int a=0; a<matrix[i].length;a++){
			if(row[i]||col[a]){
				matrix[i][a]=0; 
			}
		}
	}
	
	
}