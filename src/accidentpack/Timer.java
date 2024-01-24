/**
 * 
 */
package accidentpack;

/**
 * 
 */
public class Timer{

	private long timerStartTime;
	private long timerEndTime;
	
	public void startTimer() {
		timerStartTime = System.currentTimeMillis();
	}
	
	public long endTimer() {
		timerEndTime = System.currentTimeMillis();
		return timerEndTime - timerStartTime;
	}
	
	public long getStartTime() {
		return timerStartTime;
	}
	
	public long getEndTime() {
		return timerEndTime;
	}
	
}
