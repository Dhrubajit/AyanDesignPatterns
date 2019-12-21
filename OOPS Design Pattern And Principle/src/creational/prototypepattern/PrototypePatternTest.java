package creational.prototypepattern;

public class PrototypePatternTest {
	public static void main(String[] args) {
		String type = "tom";
		Person prototype = PrototypeFactory.getPrototype(type);
		if (prototype != null) {
			System.out.println(prototype);
		}
	}
}
