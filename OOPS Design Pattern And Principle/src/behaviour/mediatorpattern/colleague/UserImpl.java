package behaviour.mediatorpattern.colleague;

import behaviour.mediatorpattern.mediator.ChatMediator;

public class UserImpl extends User {

	public UserImpl(ChatMediator chatMediator, String name) {
		super(chatMediator, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name+": sending message -- " + msg);
		this.chatMediator.sendMessage(msg,this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name +": received message -- "+ msg);
	}

}
