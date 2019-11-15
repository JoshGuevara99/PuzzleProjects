package Guevara.cs146.project3;

import java.util.ArrayList;

public class Spaces {
	private int row, column;
	private ArrayList<Spaces> neighbors;

	public Spaces(int row, int column) {
		this.row = row;
		this.column = column;
		this.neighbors = new ArrayList<Spaces>();
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
	public void addNeighbors(Spaces s)
	{
		this.neighbors.add(s);
	}
	
	public ArrayList<Spaces> getNeighbors()
	{
		return this.neighbors;
	}
}
