package assignment.randomaccessvssequientialaccess;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPerformanceComparison {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList1K = new ArrayList<>(1000);
		ArrayList<Integer> arrayList10K = new ArrayList<>(10000);
		ArrayList<Integer> arrayList100K = new ArrayList<>(100000);

		Random random = new Random();

		for (int i = 0; i < 100000; i++) {
			arrayList1K.add(random.nextInt());
			arrayList10K.add(random.nextInt());
			arrayList100K.add(random.nextInt());
		}

		System.out.println("Random Access Pattern:");

		long startTime = System.nanoTime();
		arrayList1K.get(random.nextInt(1000));
		System.out.println("Time taken for accessing element in ArrayList with capacity 1K: "
				+ (System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		arrayList10K.get(random.nextInt(10000));
		System.out.println("Time taken for accessing element in ArrayList with capacity 10K: "
				+ (System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		arrayList100K.get(random.nextInt(100000));
		System.out.println("Time taken for accessing element in ArrayList with capacity 100K: "
				+ (System.nanoTime() - startTime) + " ns");

		System.out.println("\nSequential Access Pattern:");

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			arrayList1K.get(i);
		}
		System.out.println("Time taken for sequential access in ArrayList with capacity 1K: "
				+ (System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			arrayList10K.get(i);
		}
		System.out.println("Time taken for sequential access in ArrayList with capacity 10K: "
				+ (System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			arrayList100K.get(i);
		}
		System.out.println("Time taken for sequential access in ArrayList with capacity 100K: "
				+ (System.nanoTime() - startTime) + " ns");

		System.out.println("\nAdd Operation:");

		startTime = System.nanoTime();
		arrayList1K.add(random.nextInt());
		System.out.println("Time taken for adding element in ArrayList with capacity 1K: "
				+ (System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		arrayList10K.add(random.nextInt());
		System.out.println("Time taken for adding element in ArrayList with capacity 10K: "
				+ (System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		arrayList100K.add(random.nextInt());
		System.out.println("Time taken for adding element in ArrayList with capacity 100K: "
				+ (System.nanoTime() - startTime) + " ns");

		System.out.println("\nRemove Operation:");

		startTime = System.nanoTime();
		arrayList1K.remove(0);
		System.out.println("Time taken for removing element in ArrayList with capacity 1K: "
				+ (System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		arrayList10K.remove(0);
		System.out.println("Time taken for removing element in ArrayList with capacity 10K: "
				+ (System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		arrayList100K.remove(0);
		System.out.println("Time taken for removing element in ArrayList with capacity 100K: "
				+ (System.nanoTime() - startTime) + " ns");
	}
}
