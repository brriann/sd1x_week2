import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquarelotronTest {
	
	Squarelotron sq4;
	Squarelotron sq5;

	@BeforeEach
	void setUp() throws Exception {
		sq4 = new Squarelotron(4);
		sq5 = new Squarelotron(5);
	}

	@Test
	void testUpsideDownFlip() {
		
		// *** 4x4 ***
		
		// flip outer ring 
		Squarelotron sq4_ud1 = sq4.upsideDownFlip(1);
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				assertEquals(sq4.squarelotron[i][j], sq4_ud1.squarelotron[i][j]);
			}
		}
		assertEquals(sq4.squarelotron[0][0], sq4_ud1.squarelotron[3][0]);
		assertEquals(sq4.squarelotron[0][1], sq4_ud1.squarelotron[3][1]);
		assertEquals(sq4.squarelotron[0][2], sq4_ud1.squarelotron[3][2]);
		assertEquals(sq4.squarelotron[0][3], sq4_ud1.squarelotron[3][3]);
		
		assertEquals(sq4.squarelotron[3][0], sq4_ud1.squarelotron[0][0]);
		assertEquals(sq4.squarelotron[3][1], sq4_ud1.squarelotron[0][1]);
		assertEquals(sq4.squarelotron[3][2], sq4_ud1.squarelotron[0][2]);
		assertEquals(sq4.squarelotron[3][3], sq4_ud1.squarelotron[0][3]);
		
		assertEquals(sq4.squarelotron[1][0], sq4_ud1.squarelotron[2][0]);
		assertEquals(sq4.squarelotron[2][0], sq4_ud1.squarelotron[1][0]);
		assertEquals(sq4.squarelotron[1][3], sq4_ud1.squarelotron[2][3]);
		assertEquals(sq4.squarelotron[2][3], sq4_ud1.squarelotron[1][3]);
		
		//flip inner ring
		Squarelotron sq4_ud2 = sq4.upsideDownFlip(2);
		
		assertEquals(sq4.squarelotron[0][0], sq4_ud1.squarelotron[0][0]);
		assertEquals(sq4.squarelotron[0][1], sq4_ud1.squarelotron[0][1]);
		assertEquals(sq4.squarelotron[0][2], sq4_ud1.squarelotron[0][2]);
		assertEquals(sq4.squarelotron[0][3], sq4_ud1.squarelotron[0][3]);
		
		assertEquals(sq4.squarelotron[3][0], sq4_ud1.squarelotron[3][0]);
		assertEquals(sq4.squarelotron[3][1], sq4_ud1.squarelotron[3][1]);
		assertEquals(sq4.squarelotron[3][2], sq4_ud1.squarelotron[3][2]);
		assertEquals(sq4.squarelotron[3][3], sq4_ud1.squarelotron[3][3]);
		
		assertEquals(sq4.squarelotron[1][0], sq4_ud1.squarelotron[1][0]);
		assertEquals(sq4.squarelotron[2][0], sq4_ud1.squarelotron[2][0]);
		assertEquals(sq4.squarelotron[1][3], sq4_ud1.squarelotron[1][3]);
		assertEquals(sq4.squarelotron[2][3], sq4_ud1.squarelotron[2][3]);
		
		assertEquals(sq4.squarelotron[1][1], sq4_ud1.squarelotron[2][1]);
		assertEquals(sq4.squarelotron[1][2], sq4_ud1.squarelotron[2][2]);
		assertEquals(sq4.squarelotron[2][1], sq4_ud1.squarelotron[1][1]);
		assertEquals(sq4.squarelotron[2][2], sq4_ud1.squarelotron[1][2]);
		
		
		// test that a ring past ring limit returns equal sq.
		Squarelotron sq4_ud3 = sq4.upsideDownFlip(3);
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				assertEquals(sq4_ud3.squarelotron[i][j], sq4.squarelotron[i][j]);
			}
		}
		
		// *** 5x5 ***
		
		// flip outer ring 
		Squarelotron sq5_ud1 = sq5.upsideDownFlip(1);
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				assertEquals(sq5.squarelotron[i][j], sq5_ud1.squarelotron[i][j]);
			}
		}
		for (int j = 0; j < 5; j++) {
			assertEquals(sq5.squarelotron[0][j], sq5_ud1.squarelotron[4][j]);
		}
		for (int j = 0; j < 5; j++) {
			assertEquals(sq5.squarelotron[4][j], sq5_ud1.squarelotron[0][j]);
		}
		for (int j = 0; j < 5; j++) {
			assertEquals(sq5.squarelotron[2][j], sq5_ud1.squarelotron[2][j]);
		}
		
		assertEquals(sq5.squarelotron[1][0], sq5_ud1.squarelotron[3][0]);
		assertEquals(sq5.squarelotron[3][0], sq5_ud1.squarelotron[1][0]);
		assertEquals(sq5.squarelotron[1][4], sq5_ud1.squarelotron[3][4]);
		assertEquals(sq5.squarelotron[3][4], sq5_ud1.squarelotron[1][4]);
		
		//flip inner ring
		Squarelotron sq5_ud2 = sq5.upsideDownFlip(2);
		
		for (int j = 0; j < 5; j++) {
			assertEquals(sq5.squarelotron[0][j], sq5_ud1.squarelotron[0][j]);
		}
		for (int j = 0; j < 5; j++) {
			assertEquals(sq5.squarelotron[4][j], sq5_ud1.squarelotron[4][j]);
		}
		for (int j = 0; j < 5; j++) {
			assertEquals(sq5.squarelotron[2][j], sq5_ud1.squarelotron[2][j]);
		}
		assertEquals(sq5.squarelotron[1][0], sq5_ud1.squarelotron[1][0]);
		assertEquals(sq5.squarelotron[3][0], sq5_ud1.squarelotron[3][0]);
		assertEquals(sq5.squarelotron[1][4], sq5_ud1.squarelotron[1][4]);
		assertEquals(sq5.squarelotron[3][4], sq5_ud1.squarelotron[3][4]);
		
		
		
		assertEquals(sq5.squarelotron[1][1], sq5_ud1.squarelotron[3][1]);
		assertEquals(sq5.squarelotron[1][2], sq5_ud1.squarelotron[3][2]);
		assertEquals(sq5.squarelotron[1][3], sq5_ud1.squarelotron[3][3]);
		assertEquals(sq5.squarelotron[3][1], sq5_ud1.squarelotron[1][1]);
		assertEquals(sq5.squarelotron[3][2], sq5_ud1.squarelotron[1][2]);
		assertEquals(sq5.squarelotron[3][3], sq5_ud1.squarelotron[1][3]);
		
		
		// test that a ring past ring limit returns equal sq.
		Squarelotron sq5_ud3 = sq5.upsideDownFlip(3);
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				assertEquals(sq5_ud3.squarelotron[i][j], sq5.squarelotron[i][j]);
			}
		}
	}

	@Test
	void testMainDiagonalFlip() {
		// *** 4x4 ***
		
		// flip outer ring
		Squarelotron sq4_md1 = sq4.mainDiagonalFlip(1);
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				assertEquals(sq4.squarelotron[i][j], sq4_md1.squarelotron[i][j]);
			}
		}
		assertEquals(sq4.squarelotron[0][0], sq4_md1.squarelotron[0][0]);
		assertEquals(sq4.squarelotron[3][3], sq4_md1.squarelotron[3][3]);
		
		assertEquals(sq4.squarelotron[0][1], sq4_md1.squarelotron[1][0]);
		assertEquals(sq4.squarelotron[0][2], sq4_md1.squarelotron[2][0]);
		assertEquals(sq4.squarelotron[1][0], sq4_md1.squarelotron[0][1]);
		assertEquals(sq4.squarelotron[2][0], sq4_md1.squarelotron[0][2]);
		assertEquals(sq4.squarelotron[1][3], sq4_md1.squarelotron[3][1]);
		assertEquals(sq4.squarelotron[2][3], sq4_md1.squarelotron[3][2]);
		assertEquals(sq4.squarelotron[3][1], sq4_md1.squarelotron[1][3]);
		assertEquals(sq4.squarelotron[3][2], sq4_md1.squarelotron[2][3]);
		
		
		// flip inner ring
		Squarelotron sq4_md2 = sq4.mainDiagonalFlip(2);
		for (int j = 1; j < 3; j++) {
			assertEquals(sq4.squarelotron[0][j], sq4_md2.squarelotron[0][j]);
		}
		for (int j = 1; j < 3; j++) {
			assertEquals(sq4.squarelotron[3][j], sq4_md2.squarelotron[3][j]);
		}
		assertEquals(sq4.squarelotron[1][0], sq4_md2.squarelotron[1][0]);
		assertEquals(sq4.squarelotron[2][0], sq4_md2.squarelotron[2][0]);
		assertEquals(sq4.squarelotron[1][3], sq4_md2.squarelotron[1][3]);
		assertEquals(sq4.squarelotron[2][3], sq4_md2.squarelotron[2][3]);
		
		assertEquals(sq4.squarelotron[1][1], sq4_md2.squarelotron[1][1]);
		assertEquals(sq4.squarelotron[2][2], sq4_md2.squarelotron[2][2]);
		assertEquals(sq4.squarelotron[1][2], sq4_md2.squarelotron[2][1]);
		assertEquals(sq4.squarelotron[2][1], sq4_md2.squarelotron[1][2]);
		
		// test that a ring past ring limit returns equal sp
		Squarelotron sq4_md3 = sq4.mainDiagonalFlip(3);
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				assertEquals(sq4_md3.squarelotron[i][j], sq4.squarelotron[i][j]);
			}
		}
		
		// *** 5x5 ***
		
		// flip outer ring
		Squarelotron sq5_md1 = sq5.mainDiagonalFlip(1);
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				assertEquals(sq5.squarelotron[i][j], sq5_md1.squarelotron[i][j]);
			}
		}
		assertEquals(sq5.squarelotron[0][0], sq5_md1.squarelotron[0][0]);
		assertEquals(sq5.squarelotron[4][4], sq5_md1.squarelotron[4][4]);
		
		assertEquals(sq5.squarelotron[0][1], sq5_md1.squarelotron[1][0]);
		assertEquals(sq5.squarelotron[0][2], sq5_md1.squarelotron[2][0]);
		assertEquals(sq5.squarelotron[0][3], sq5_md1.squarelotron[3][0]);
		
		assertEquals(sq5.squarelotron[1][0], sq5_md1.squarelotron[0][1]);
		assertEquals(sq5.squarelotron[2][0], sq5_md1.squarelotron[0][2]);
		assertEquals(sq5.squarelotron[3][0], sq5_md1.squarelotron[0][3]);
		
		assertEquals(sq5.squarelotron[1][4], sq5_md1.squarelotron[4][1]);
		assertEquals(sq5.squarelotron[2][4], sq5_md1.squarelotron[4][2]);
		assertEquals(sq5.squarelotron[3][4], sq5_md1.squarelotron[4][3]);
		
		assertEquals(sq5.squarelotron[1][4], sq5_md1.squarelotron[4][1]);
		assertEquals(sq5.squarelotron[2][4], sq5_md1.squarelotron[4][2]);
		assertEquals(sq5.squarelotron[3][4], sq5_md1.squarelotron[4][3]);
		
		assertEquals(sq5.squarelotron[0][4], sq5_md1.squarelotron[4][0]);
		assertEquals(sq5.squarelotron[4][0], sq5_md1.squarelotron[0][4]);
		
		// flip inner ring
		Squarelotron sq5_md2 = sq5.mainDiagonalFlip(2);
		
		for (int j = 0; j < 5; j++) {
			assertEquals(sq5.squarelotron[0][j], sq5_md2.squarelotron[0][j]);
		}
		for (int j = 0; j < 5; j++) {
			assertEquals(sq5.squarelotron[4][j], sq5_md2.squarelotron[4][j]);
		}
		
		assertEquals(sq5.squarelotron[1][0], sq5_md2.squarelotron[1][0]);
		assertEquals(sq5.squarelotron[2][0], sq5_md2.squarelotron[2][0]);
		assertEquals(sq5.squarelotron[3][0], sq5_md2.squarelotron[3][0]);
		
		assertEquals(sq5.squarelotron[1][4], sq5_md2.squarelotron[1][4]);
		assertEquals(sq5.squarelotron[2][4], sq5_md2.squarelotron[2][4]);
		assertEquals(sq5.squarelotron[3][4], sq5_md2.squarelotron[3][4]);
		
		assertEquals(sq5.squarelotron[1][1], sq5_md2.squarelotron[1][1]);
		assertEquals(sq5.squarelotron[2][2], sq5_md2.squarelotron[2][2]);
		assertEquals(sq5.squarelotron[3][3], sq5_md2.squarelotron[3][3]);
		
		assertEquals(sq5.squarelotron[1][2], sq5_md2.squarelotron[2][1]);
		assertEquals(sq5.squarelotron[2][1], sq5_md2.squarelotron[1][2]);
		assertEquals(sq5.squarelotron[1][3], sq5_md2.squarelotron[3][1]);
		assertEquals(sq5.squarelotron[3][1], sq5_md2.squarelotron[1][3]);
		assertEquals(sq5.squarelotron[3][2], sq5_md2.squarelotron[2][3]);
		assertEquals(sq5.squarelotron[2][3], sq5_md2.squarelotron[3][2]);
		
		// test that a ring past ring limit returns equal sp
		Squarelotron sq5_md3 = sq5.mainDiagonalFlip(3);
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				assertEquals(sq5_md3.squarelotron[i][j], sq5.squarelotron[i][j]);
			}
		}
	}

	@Test
	void testRotateRight() {
		// *** 4x4 ***
		Squarelotron sq4Ref = new Squarelotron(4);
		sq4Ref.rotateRight(1);
		assertEquals(sq4Ref.squarelotron[0][0], 13);
		assertEquals(sq4Ref.squarelotron[1][0], 14);
		assertEquals(sq4Ref.squarelotron[2][0], 15);
		assertEquals(sq4Ref.squarelotron[3][0], 16);
		
		assertEquals(sq4Ref.squarelotron[0][2], 5);
		assertEquals(sq4Ref.squarelotron[1][2], 6);
		assertEquals(sq4Ref.squarelotron[2][2], 7);
		assertEquals(sq4Ref.squarelotron[3][2], 8);

		Squarelotron sq4ref2 = new Squarelotron(4);
		sq4ref2.rotateRight(-1);
		assertEquals(sq4Ref.squarelotron[0][0], 4);
		assertEquals(sq4Ref.squarelotron[1][0], 3);
		assertEquals(sq4Ref.squarelotron[2][0], 2);
		assertEquals(sq4Ref.squarelotron[3][0], 1);
		
		assertEquals(sq4Ref.squarelotron[0][2], 12);
		assertEquals(sq4Ref.squarelotron[1][2], 11);
		assertEquals(sq4Ref.squarelotron[2][2], 10);
		assertEquals(sq4Ref.squarelotron[3][2], 9);
		
		// *** 5x5 ***
		Squarelotron sq5Ref = new Squarelotron(5);
		sq5Ref.rotateRight(-1);
		assertEquals(sq5Ref.squarelotron[0][2], 15);
		assertEquals(sq5Ref.squarelotron[1][2], 14);
		assertEquals(sq5Ref.squarelotron[2][2], 13);
		assertEquals(sq5Ref.squarelotron[3][2], 12);
		assertEquals(sq5Ref.squarelotron[4][2], 11);
		
		assertEquals(sq5Ref.squarelotron[0][4], 25);
		assertEquals(sq5Ref.squarelotron[1][4], 24);
		assertEquals(sq5Ref.squarelotron[2][4], 23);
		assertEquals(sq5Ref.squarelotron[3][4], 22);
		assertEquals(sq5Ref.squarelotron[4][4], 21);
		
		Squarelotron sq5Ref2 = new Squarelotron(5);
		sq5Ref2.rotateRight(1);
		assertEquals(sq5Ref.squarelotron[0][2], 11);
		assertEquals(sq5Ref.squarelotron[1][2], 12);
		assertEquals(sq5Ref.squarelotron[2][2], 13);
		assertEquals(sq5Ref.squarelotron[3][2], 14);
		assertEquals(sq5Ref.squarelotron[4][2], 15);
		
		assertEquals(sq5Ref.squarelotron[0][4], 1);
		assertEquals(sq5Ref.squarelotron[1][4], 2);
		assertEquals(sq5Ref.squarelotron[2][4], 3);
		assertEquals(sq5Ref.squarelotron[3][4], 4);
		assertEquals(sq5Ref.squarelotron[4][4], 5);
	}
}
