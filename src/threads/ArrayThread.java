package threads;

public class ArrayThread extends Thread {

	public static final int SIMPLE_FOR = 1;
	public static final int FOR_EACH = 2;

	private int[] array;
	private int type;

	public ArrayThread() {
		super();
	}

	public ArrayThread(int[] array, int type) {
		this.array = array;
		this.type = type;
	}

	@Override
	public void run() {
		long startTime;
		double elapsedTime;
		if (type % 2 == 0) {
			startTime = System.nanoTime();
			simpleFor();
			elapsedTime = System.nanoTime() - startTime;
		} else {
			startTime = System.nanoTime();
			forEach();
			elapsedTime = System.nanoTime() - startTime;
		}
		System.out.printf("%s%f seconds\n", (type % 2 == 0 ? "Simple for: " : "For each: "),
				(elapsedTime / 1000000000));
	}

	private void simpleFor() {
		int length = array.length;
		for (int i = 0; i < length; i++)
			array[i] *= 1;

	}

	private void forEach() {
		for (@SuppressWarnings("unused")
		int n : array)
			n *= 1;

	}

}
