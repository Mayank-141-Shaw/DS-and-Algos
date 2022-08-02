package leetcode;

public class _74_Search2DMatrix {

	public static void main(String[] args) {
		int[][] m = {{1,3,5},{7,8,10},{13,15,19}};
		boolean res = searchMatrix(m, 8);
		System.out.println(res);
	}
	
	static boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length, c=matrix[0].length;
        
        int rowM=0, rowS=0, rowE=r-1;
        
        while(rowS <= rowE){
            rowM = rowE - (rowE-rowS)/2;
            if(target < matrix[rowM][0]) rowE = rowM - 1;
            else if(target > matrix[rowM][c-1]) rowS = rowM + 1;
            else break;
        }
        
        if(!(rowS<=rowE)) return false;
        
        // do cols
        int colM, colS=0, colE=c-1;
        while(colS<=colE){
            colM = colE - (colE - colS)/2;
            if(target < matrix[rowM][colM]) colE = colM-1;
            else if(target > matrix[rowM][colM]) colS = colM+1;
            else return true;
        }
        return false;
    }

}
