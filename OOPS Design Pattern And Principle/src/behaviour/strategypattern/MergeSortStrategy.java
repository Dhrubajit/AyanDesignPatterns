package behaviour.strategypattern;

public class MergeSortStrategy implements SortStrategy {

	@Override
	public void sort(int[] arr) {
		System.out.println("sorting using merge sort strategy");
	}

}
