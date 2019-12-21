package behaviour.statepattern.context;

import behaviour.statepattern.state.MobileAlertState;
import behaviour.statepattern.state.Normal;

public class AlertContext implements MobileAlertState{
	private MobileAlertState state;

	public AlertContext() {
		super();
		this.state = new Normal();
	}

	public void setState(MobileAlertState state) {
		this.state = state;
	}
	
	public void alert(){
		this.state.alert();
	}
	
}
