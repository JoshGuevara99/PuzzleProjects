package Guevara.cs146.project3;

public class Grid {
	
	private Spaces[][] maze;
	private int visitedcells;
	private int totalsize;
	
	public Grid(int size) {
		
		totalsize = size;
		maze = new Spaces[size][size];
		visitedcells = 0;
	}

	public void create() {
		for (int i = 0; i < maze.length; i++) {// row
			for (int j = 0; j < maze.length; j++) {// column
				maze[i][j] = new Spaces(i, j);// create spaces
			}
		}

		for (int i = 0; i < maze.length; i++) {// row
			for (int j = 0; j < maze.length; j++) {// column
				createNeighbors(maze[i][j]);// find their neighbors
			}
		}

	}

	public void createNeighbors(Spaces s) {
		if (s.getRow() - 1 >= 0) // West
		{
			s.addNeighbors(maze[s.getRow() - 1][s.getColumn()]);
		} else if (s.getRow() + 1 < maze.length)// east
		{
			s.addNeighbors(maze[s.getRow() + 1][s.getColumn()]);
		}
		if (s.getColumn() - 1 >= 0) // South
		{
			s.addNeighbors(maze[s.getRow()][s.getColumn() - 1]);
		} else if (s.getColumn() + 1 < maze.length) {
			s.addNeighbors(maze[s.getRow()][s.getColumn() + 1]);
		}
	}

	public void generateMaze() {

		Spaces start = maze[0][0];
		visitedcells = 1;
		while(visitedcells <= totalsize)
		{
			ArrayList<Spaces> 
		}
		
		System.out.print("+ - +");
		System.out.print("+  +");
		System.out.print(" | ");
	
	}

	public double random() {
		return Math.random();// Randomized?
	}

}