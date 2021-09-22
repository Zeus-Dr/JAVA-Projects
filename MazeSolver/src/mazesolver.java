import java.util.LinkedList;

public class mazesolver {
	//0->wall
	//1->path
	//2->destination
	//We start from position 3,0.
	static int[][] maze= {//4*4 maze
			{2,0,1,1},
			{1,1,0,1},
			{0,1,1,1}
	};
	
	static LinkedList<Position> path=new LinkedList<Position>();//
	
	public static void main(String[] args) {
		Position p=new Position(3,0);
		path.push(p);
		maze[path.peek().y][path.peek().x]=0;
	}

}
