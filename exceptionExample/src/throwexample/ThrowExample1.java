package throwexample;

public class ThrowExample1 {
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score1) throws ArithmeticException {
		
		try {
			
			if(score1%2==0) {
				throw new Exception();
			}
			else {
				this.score = score1;
			}
		}
		catch(Exception e) {
			System.out.println("score should not an even number.");
		}
	}

	@Override
	public String toString() {
		return "ThrowExample1 [score=" + score + "]";
	}
	
	
	
	
}
