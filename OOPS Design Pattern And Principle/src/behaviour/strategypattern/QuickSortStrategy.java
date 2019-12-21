package behaviour.strategypattern;

public class QuickSortStrategy implements SortStrategy {

	@Override
	public void sort(int[] arr) {
		System.out.println("sorting using quick sort strategy");
	}

}
