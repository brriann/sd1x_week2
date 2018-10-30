
public class Squarelotron {

	public int[][] squarelotron;
	int size;
	int ringLimit;
	
	Squarelotron(int n) {
		squarelotron = new int[n][n];
		size = n;
		ringLimit = size / 2;
		
		int counter = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				squarelotron[i][j] = counter;
				counter++;
			}
		}
	}
	
	public Squarelotron upsideDownFlip(int ring) {
		if (ring > ringLimit) {
			return this;
		}
	}
	
	public Squarelotron mainDiagonalFlip(int ring) {
		if (ring > ringLimit) {
			return this;
		}
	}
	
	public void rotateRight(int numberOfTurns) {
		
	}
	
	public static void printSquarelotron(Squarelotron sq) {
		int n = sq.size;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (sq.squarelotron[i][j] < 10) {
					System.out.print(" " + sq.squarelotron[i][j] + " ");
				} else {
					System.out.print(sq.squarelotron[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Squarelotron sq = new Squarelotron(9);
		printSquarelotron(sq);
	}
}
