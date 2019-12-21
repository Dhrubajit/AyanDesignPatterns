package behaviour.mementopattern;

public class FileWriterCareTaker {
	private Object obj;
	
	public void save(FileWriterUtil file){
		this.obj = file.save();
	}
	
	public void undo(FileWriterUtil file){
		file.undoLastChange(obj);
	}
	
}
