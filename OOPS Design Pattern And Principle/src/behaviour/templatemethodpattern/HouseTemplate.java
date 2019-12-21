package behaviour.templatemethodpattern;

public abstract class HouseTemplate {
	
	public final void buildHouse(){
		buildFoundation();
		buildPillars();
		buildWall();
		buildWindow();
	}

	private void buildFoundation() {
		System.out.println("Building Common Fundation");
	}

	private void buildWindow() {
		System.out.println("Building common glass window");
	}
	
	public abstract void buildWall();
	
	public abstract void buildPillars();

}
