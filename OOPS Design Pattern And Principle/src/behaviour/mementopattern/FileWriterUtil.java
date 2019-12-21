package behaviour.mementopattern;

public class FileWriterUtil {
	private String fileName;
	private StringBuilder content;
	
	public FileWriterUtil(String fileName){
		this.fileName = fileName;
		this.content = new StringBuilder();
	}
	
	public void write(StringBuilder sb){
		content.append(sb);
	}
	
	public Memento save(){
		return new Memento(this.fileName,this.content);
	}
	
	public void undoLastChange(Object object){
		Memento mem = (Memento)object;
		this.fileName = mem.fileName;
		this.content = mem.content;
	}
	
	private class Memento{
		private String fileName;
		private StringBuilder content;
		
		public Memento(String fileName, StringBuilder content){
			this.fileName = fileName;
			this.content = new StringBuilder(content);
		}
	}
	
	@Override
	public String toString(){
		return this.content.toString();
	}
}
