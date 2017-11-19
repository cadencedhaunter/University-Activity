package lab_6;

public class CalculationThread extends Thread{
	private int valueToReach;
	private int result;
	private boolean calculated = false;

	private static final int DELAY = 1;
	
	public CalculationThread() {}
	
	public CalculationThread(int value) {
		valueToReach=value;
	}
	
	public int getResult() {
		// { calculation result awaiting: }
		while(!calculated) {
			try { 
				Thread.sleep(CalculationThread.DELAY);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		} 
		return result;
	}
	
	public void run() {
		for(int i = 1; i <= valueToReach; i++) {
			result += i;
		}
		calculated = true;
	}
}
