package backtrack;

public class BacktrackRatMaze {
	
	public static void main(String args[]) throws Exception{
		int[][] maze = {
				{1,1,1,1,1},
				{0,0,0,0,1},
				{1,1,1,1,1},
				{1,0,0,0,0},
				{1,1,1,1,1}
			};
		
		mazeSolver(maze);
	}
	
	static void mazeSolver(int[][] maze) {
		int[][] soln = new int[5][5];
		
		mazeSolverUtil(maze, 0, 0, soln);
	}
	
	static boolean mazeSolverUtil(int[][] maze, int row, int col, int[][] soln) {
		
		// if we reached the dest , return true, soln = 1
		if(row == maze.length-1 && col == maze.length-1) {
			soln[row][col] = 1;
			for(int i=0; i<=row; i++) {
				for(int j=0; j<=col; j++) {
					System.out.print(soln[i][j] + " ");
				}
				System.out.println();
			}
			return true;
		}
		
		// else not reached
		
		// check if cur loc is inside the maze
		if(row < maze.length && row >= 0 && col >= 0 && col < maze.length && maze[row][col] == 1) {
			
			// then cur is a possible path
			soln[row][col] = 1;
			
			// go right
			if(mazeSolverUtil(maze, row, col+1, soln)) return true;
	
			// go down
			if(mazeSolverUtil(maze, row+1, col, soln)) return true;
			
			
			// go left
			if(mazeSolverUtil(maze, row, col-1, soln)) return true;
			
			// go up
			if(mazeSolverUtil(maze, row-1, col, soln)) return true;
		
			// else cur path wont be possible, make it 0 and return false
			soln[row][col] = 0;
			return false;
		}
		
		// else cur is a wall
		return false;
	}
}
