package behaviour.strategypattern;

public class StrategyPatternTest {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Context context = new Context();
		context.setSortStrategy(new MergeSortStrategy());
		context.sort(arr);
		
		context.setSortStrategy(new QuickSortStrategy());
		context.sort(arr);
		
		SortStrategy quick = new QuickSortStrategy();
		quick.sort(arr);
		
	}

}
