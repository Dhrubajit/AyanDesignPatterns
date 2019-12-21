package behaviour.commandpattern.receiver;

public class WindowsFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("opning file in windows system");
	}

	@Override
	public void writeFile() {
		System.out.println("writing file in windows system");
	}

	@Override
	public void closeFile() {
		System.out.println("closing file in windows system");
	}

}
