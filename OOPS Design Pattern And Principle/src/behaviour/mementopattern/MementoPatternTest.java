package behaviour.mementopattern;

public class MementoPatternTest {

	public static void main(String[] args) {
		
		FileWriterCareTaker careTaker = new FileWriterCareTaker();
		FileWriterUtil file = new FileWriterUtil("text");
		file.write(new StringBuilder("first time\n"));
		
		careTaker.save(file);
		
		System.out.println("File output after writing first time after saving: " + file);
		
		file.write(new StringBuilder("second time"));
		
		System.out.println("File output after writing second time before saving: " + file);
		
		careTaker.undo(file);
		
		System.out.println("File output undo writing second time before saving: " + file);

	}

}
