package behaviour.templatemethodpattern;

public class GlassHouse extends HouseTemplate {

	@Override
	public void buildWall() {
		System.out.println("building glass wall");
	}

	@Override
	public void buildPillars() {
		System.out.println("building glass pillars");
	}

}
