package behaviour.mediatorpattern.mediator;

import java.util.ArrayList;
import java.util.List;

import behaviour.mediatorpattern.colleague.User;

public class ChatMediatorImpl implements ChatMediator {
	
	private List<User> list;
	
	public ChatMediatorImpl() {
		super();
		this.list = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message,User user) {
		for(User u : list){
			if(!u.equals(user)){
				u.receive(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.list.add(user);
	}
	
}
