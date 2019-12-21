package behaviour.commandpattern.command;

import behaviour.commandpattern.receiver.FileSystemReceiver;

public class WriteFileCommand implements Command {
	private FileSystemReceiver fileSystemReceiver;

	public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
		this.fileSystemReceiver = fileSystemReceiver;
	}
	
	@Override
	public void execute() {
		this.fileSystemReceiver.writeFile();
	}

}
