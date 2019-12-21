package behaviour.mediatorpattern.mediator;

import behaviour.mediatorpattern.colleague.User;

public interface ChatMediator {
	
	void sendMessage(String message,User user);
	void addUser(User user);
}
