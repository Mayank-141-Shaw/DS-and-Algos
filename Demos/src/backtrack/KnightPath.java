package backtrack;


public class KnightPath {
	
	static int[][] map;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map = new int[8][8];
		KnightPath kp = new KnightPath();
		
		kp.tour(8, 8, 0, 0, 1);
		
		
//		for(int i=0; i<8; i++) {
//			for(int j=0; j<8; j++) {
//				System.out.print(map[i][j]+"\t");
//			}
//			System.out.println();
//		}
	}
	
	public boolean isInside(int r, int c, int x, int y) {
		return x>=0 && x<r && y>=0 && y<c;
	}
	
	public void tour( int r, int c, int x, int y, int step) {
		
		if( !isInside(r, c, x, y) || map[x][y] != 0 ) return;
		
		// set cur cell to step 
		map[x][y] = step;
		
		if(step == 64) {
			for(int i=0; i<8; i++) {
				for(int j=0; j<8; j++) {
					System.out.print(map[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		// move all 8 directions
		tour(r, c, x-2, y-1, step+1);
		tour(r, c, x-2, y+1, step+1);
		tour(r, c, x-1, y+2, step+1);
		tour(r, c, x+1, y+2, step+1);
		tour(r, c, x+2, y+1, step+1);
		tour(r, c, x+2, y-1, step+1);
		tour(r, c, x+1, y-2, step+1);
		tour(r, c, x-1, y-2, step+1);
		
		map[x][y] = 0;
		
	}

}
