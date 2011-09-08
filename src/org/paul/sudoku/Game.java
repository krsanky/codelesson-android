package org.paul.sudoku;

import android.app.Activity;

public class Game extends Activity {

	public static final String KEY_DIFFICULTY = "org.paul.sudoku.difficulty";
	public static final int DIFFICULTY_EASY = 0;
	public static final int DIFFICULTY_MEDIUM = 1;
	public static final int DIFFICULTY_HARD = 2;

	
	//method. This method will take into account the selected difficulty level and then fetch a puzzle accordingly, to fill out the tiles.
	static public void getPuzzle(){
	
	}
	
	//Implement the helper methods for the getPuzzle method:

	static protected int[] fromPuzzleString(String string){
		return null;
		
	}
	
	static private String toPuzzleString(int[] puz) {
		return null;
		
	}
	
	private int getTile(int x, int y) {
		return y;
		
	}
	
	private void setTile(int x, int y, int value) {
		
	}
	
	protected String getTileString(int x, int y) {
		return null;
		
	}
	
}
