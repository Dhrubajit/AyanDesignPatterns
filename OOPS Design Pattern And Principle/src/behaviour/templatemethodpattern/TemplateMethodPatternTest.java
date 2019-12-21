package behaviour.templatemethodpattern;

public class TemplateMethodPatternTest {

	public static void main(String[] args) {
		HouseTemplate woodenHouse = new WoodenHouse();
		woodenHouse.buildHouse();
		
		System.out.println("==============================");
		
		HouseTemplate glassHouse = new GlassHouse();
		glassHouse.buildHouse();
	}

}
