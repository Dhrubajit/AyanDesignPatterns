package behaviour.statepattern.state;

public class Normal implements MobileAlertState {

	@Override
	public void alert() {
		System.out.println("Normal mode is activated");
	}

}
