package lab_6;

public class ThreadGenerator {
	
	public int result;
	public int values[];
	public CalcOperation operation;
	
	public ThreadGenerator() {}
	
	public ThreadGenerator(int values[], CalcOperation operation) {
		this.values = values;
		this.operation = operation;
		if(operation == CalcOperation.MULTIPLY) result = 1;
	}
	
	public int getResult() {
		return result;
	}
	
	public void execute() {
		// { Calculation Threads initializing }
		CalculationThread threads[] = new CalculationThread[values.length];
		for(int i = 0; i < threads.length; i++) {
			threads[i] = new CalculationThread(values[i]);
			threads[i].start();
		}
		// { result: }
		switch(operation) {
			case ADD:
				for(CalculationThread thread: threads) {
					result += thread.getResult();
				}
				break;
			case SUBTRACT:
				for(CalculationThread thread: threads) {
					result -= thread.getResult();
				}
				break;
			case MULTIPLY:
				for(CalculationThread thread: threads) {
					result *= thread.getResult();
				}
		}
		
	}
}
