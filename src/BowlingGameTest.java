import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {
	
	private BowlingGame bowlingGame;
	
	@Before
	public void init() throws Exception{
		bowlingGame = new BowlingGame();
	}
	
	@Test
	public void testOneRoll() throws Exception{
		bowlingGame.roll(5);
		assertEquals(5, bowlingGame.score());
	}
	
	@Test
	public void testTwoRolls() throws Exception{
		bowlingGame.roll(4);
		bowlingGame.roll(4);
		assertEquals(8, bowlingGame.score());
	}
	
	@Test
	public void testSpare() throws Exception{
		bowlingGame.roll(4);
		bowlingGame.roll(6);		
		bowlingGame.roll(5);		
		assertEquals(20, bowlingGame.score());
	}
	
	@Test
	public void testStrike() throws Exception{
		bowlingGame.roll(10);
		//bowlingGame.roll(0);
		bowlingGame.roll(5);
		bowlingGame.roll(4);
		assertEquals(28, bowlingGame.score());
	}
	
	@Test
	public void testComplexSpare() throws Exception{
		bowlingGame.roll(4);
		bowlingGame.roll(4);
		bowlingGame.roll(4);
		bowlingGame.roll(6);		
		bowlingGame.roll(5);	
		assertEquals(28, bowlingGame.score());
	}
	
	@Test
	public void testComplexStrike() throws Exception{
		bowlingGame.roll(4);
		bowlingGame.roll(4);
		bowlingGame.roll(10);
		bowlingGame.roll(5);		
		bowlingGame.roll(4);	
		assertEquals(36, bowlingGame.score());
	}
}
