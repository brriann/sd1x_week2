
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
	
	public boolean onRing(int i, int j, int ring) {
		boolean onRing = (i == ring - 1 || j == ring - 1 || i == size - ring || j == size - ring);
		boolean outRing = (i <= ring - 2 || i >= size + 1 - ring || j <= ring - 2 || j >= size + 1 - ring);
		return onRing && !outRing;
	}
	
	public Squarelotron upsideDownFlip(int ring) {
		if (ring > ringLimit) {
			return this;
		}
		Squarelotron sqNew = new Squarelotron(this.size);
		
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				if (onRing(i, j, ring)) {
					sqNew.squarelotron[i][j] = this.squarelotron[this.size - i - 1][j];
				}
			}
		}
		return sqNew;
	}
	
	public Squarelotron mainDiagonalFlip(int ring) {
		if (ring > ringLimit) {
			return this;
		}
		Squarelotron sqNew = new Squarelotron(this.size);
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				if (onRing(i, j, ring)) {
					sqNew.squarelotron[i][j] = this.squarelotron[j][i];
				}
			}
		}
		return sqNew;
	}
	
	public void rotateRight(int numberOfTurns) {
		numberOfTurns = (numberOfTurns % 4 + 4) % 4;
		for (int n = 0; n < numberOfTurns; n++) {
			Squarelotron sqNew = new Squarelotron(this.size);
			for (int i = 0; i < this.size; i++) {
				for (int j = 0; j < this.size; j++) {
					sqNew.squarelotron[j][size - 1 - i] = this.squarelotron[i][j];
				}
			}
			this.squarelotron = sqNew.squarelotron;
		}
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
