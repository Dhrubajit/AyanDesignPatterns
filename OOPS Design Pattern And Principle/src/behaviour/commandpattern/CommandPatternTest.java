package behaviour.commandpattern;

import behaviour.commandpattern.command.OpenFileCommand;
import behaviour.commandpattern.invoker.FileInvoker;
import behaviour.commandpattern.receiver.FileSystemReceiver;
import behaviour.commandpattern.receiver.WindowsFileSystemReceiver;

public class CommandPatternTest {
	public static void main(String[] args) {
		//instead of creating receiver object manually we could have used
		//factory pattern to get intended receiver.
		FileSystemReceiver windowsFileSystemReceiver = new WindowsFileSystemReceiver();
		
		//injecting receiver in command object
		OpenFileCommand openFileCommand = new OpenFileCommand(windowsFileSystemReceiver);
		
		//injecting command in invoker
		FileInvoker fileInvoker = new FileInvoker(openFileCommand);
		
		//finally executing the command
		fileInvoker.execute();
		
	}
}
