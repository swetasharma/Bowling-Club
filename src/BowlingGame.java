
public class BowlingGame {
	
	private int score = 0;
	private int[] arrayOfRolls = new int[20]; // each frame has 2 rolls / tries and there are 10 frames in match
	private int index = 0;

	public void roll(int noOfPins) {
		arrayOfRolls[index++] = noOfPins;  
		//score = score + noOfPins;		
	}
	
	public int score() {
		int i = 0;
		for(int frame = 0; frame < 10; frame++){ // as there are 10 frames in match
			if(isStrike(i)){
				score = score + 10 + arrayOfRolls[i + 1] + arrayOfRolls[i + 2];
				i = i - 1 ;
			}else if(isSpare(i)){
				score = score +  10 + arrayOfRolls[i + 2];
			}else{
				score = score + arrayOfRolls[i] + arrayOfRolls[i + 1];
			}			
			i = i + 2; // as two rolls / tries consist of one frame
		}
		return score;
	}

	private boolean isStrike(int i) {
		return arrayOfRolls[i] == 10;
	}

	private boolean isSpare(int i) {
		return arrayOfRolls[i] + arrayOfRolls[i+1] == 10;
	}
}
