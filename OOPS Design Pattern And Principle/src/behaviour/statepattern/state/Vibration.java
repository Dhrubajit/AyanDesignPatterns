package behaviour.statepattern.state;

public class Vibration implements MobileAlertState{

	@Override
	public void alert() {
		System.out.println("vibration mode is activated");
	}
	
}
