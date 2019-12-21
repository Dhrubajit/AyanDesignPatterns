package behaviour.statepattern.state;

public class Silent implements MobileAlertState {

	@Override
	public void alert() {
		System.out.println("silent mode is activated");
	}

}
