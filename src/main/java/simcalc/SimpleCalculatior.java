package simcalc;

public class SimpleCalculatior {
	private int result=0;
	
	public void add(int x, int y) {
		result = x + y;
	}
	
	public void sub(int x, int y) {
		result = x - y;
	}
	public void mul(int x, int y) {
		result = x * y;
	}
	public int getResult() {
		return result;
	}
}
