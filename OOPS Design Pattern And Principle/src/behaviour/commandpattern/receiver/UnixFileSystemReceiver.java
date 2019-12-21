package behaviour.commandpattern.receiver;

public class UnixFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("opning file in unix system");
	}

	@Override
	public void writeFile() {
		System.out.println("writing file in unix system");
	}

	@Override
	public void closeFile() {
		System.out.println("closing file in unix system");
	}

}
