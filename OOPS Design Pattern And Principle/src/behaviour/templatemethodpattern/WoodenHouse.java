package behaviour.templatemethodpattern;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWall() {
		System.out.println("building wooden wall");

	}

	@Override
	public void buildPillars() {
		System.out.println("building wooden pillars");
	}

}
