package behaviour.strategypattern;

public class Context implements SortStrategy {
	private SortStrategy sortStrategy;

	public SortStrategy getSortStrategy() {
		return sortStrategy;
	}

	public void setSortStrategy(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	@Override
	public void sort(int[] arr) {
		sortStrategy.sort(arr);
	}

}
