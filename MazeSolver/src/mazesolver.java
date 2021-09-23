import java.util.LinkedList;

public class mazesolver {
	//y->rows
	//x->columns
	//0->wall
	//1->path
	//2->destination
	//We start from position 3,0.
	static int[][] maze= {//4*4 maze
			{1,0,1,1,1,1,1,0,1,1,1,0,1,0},
			{0,1,1,1,0,1,1,0,1,1,1,0,1,0},
			{0,0,0,1,0,1,1,0,1,1,0,0,1,0},
			{1,0,1,1,2,0,1,0,1,1,1,0,1,0},
			{0,1,1,1,0,1,1,0,1,1,0,1,1,0},
			{0,0,0,1,0,1,1,1,1,1,1,1,1,0}
	};
	
	//Store our paths in a stack data structure.
	static LinkedList<Position> path=new LinkedList<Position>();//
	
	public static void main(String[] args) {
		Position p=new Position(4,12);
		path.push(p);
		
		while(true) {
			int y=path.peek().y;
			int x=path.peek().x;
			
			maze[y][x]=0;//Blocking previous path.
			
			//down
			if (isValid(y+1, x)) {
				if (maze[y+1][x]==2) {
					System.out.println("Moved down.\nYou won!");
					return;
				}else if(maze[y+1][x]==1) {
					System.out.println("Moved down.");
					path.push(new Position(y+1, x));
					continue;
				}				
			}

			//left
			if (isValid(y, x-1)) {
				if (maze[y][x-1]==2) {
					System.out.println("Moved left.\nYou won!");
					return;
				}else if(maze[y][x-1]==1) {
					System.out.println("Moved left.");
					path.push(new Position(y, x-1));
					continue;
				}				
			}
			
			//right
			if (isValid(y, x+1)) {
				if (maze[y][x+1]==2) {
					System.out.println("Moved right.\nYou won!");
					return;
				}else if(maze[y][x+1]==1) {
					System.out.println("Moved right.");
					path.push(new Position(y, x+1));
					continue;
				}				
			}
			
			//up
			if (isValid(y-1, x)) {
				if (maze[y-1][x]==2) {
					System.out.println("Moved up.\nYou won!");
					return;
				}else if(maze[y-1][x]==1) {
					System.out.println("Moved up.");
					path.push(new Position(y-1, x));
					continue;
				}				
			}
			
			path.pop();
			System.out.println("Moved Back!!");//Incase we take invalid path
			if (path.size()<=0) {
				System.out.println("No path!!");//If all positons are popped off the stack
				return;
			}
		}
	}

	//Checking array out of bounds!!
	public static boolean isValid(int y, int x) {
		if (y<0||y>=maze.length||x<0||x>=maze[y].length) {
			return false;
		}
		return true;
	}
}
