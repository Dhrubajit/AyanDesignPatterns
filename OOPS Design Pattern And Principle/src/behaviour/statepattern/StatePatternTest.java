package behaviour.statepattern;

import behaviour.statepattern.context.AlertContext;
import behaviour.statepattern.state.Silent;

public class StatePatternTest {
	public static void main(String[] args) {
		AlertContext context = new AlertContext();
		//first time mobile switched on.
		//normal mode is activated.
		context.alert();
		//no matter how many time we query our mobile it will say
		//normal mode is activated. This is because the current state is saved in
		//context via constructor. 
		context.alert();
		context.alert();
		
		//We can change the default state any time via setter and 
		//normal mode changes.
		context.setState(new Silent());
		
		context.alert();
		context.alert();
		
		
	}
}
