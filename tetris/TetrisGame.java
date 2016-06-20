package tetris;
import java.util.Random;


public class TetrisGame {
	final int NUMSHAPES = 7;
	
	private int width;
	private int height;

	
	//default of 10x20
	public TetrisGame() {
		this(new Coordinate(Tetris.GRID_WIDTH, Tetris.GRID_HEIGHT));
	}
	
	public TetrisGame(Coordinate dims) {
		width = dims.getRow();
		height = dims.getCol();
		//make the game board
		GridInfo board = new GridInfo(width, height);
	}
	
	/*
	 * starts the game loop until game over, then reset
	 */
	public void start() {
		System.out.println("Starting Game...");
		boolean gameOver = false;
		
		//debug code: 
			int counts = 0;
		
		while(!gameOver) {
			//generate new shape
			//TetrisShape newShape = randomShapeGen();
			++counts;

			if(counts == 30) {
				gameOver = true;
			}
		}
	}
	
	/* 
	 * generates a new random number to make a new shape
	 */
	private TetrisShape randomShapeGen() {
		Random rng = new Random(System.nanoTime());
		int shapeNum = rng.nextInt(NUMSHAPES+1);
		
		return new TetrisShape(shapeNum);
	}
	
	
}