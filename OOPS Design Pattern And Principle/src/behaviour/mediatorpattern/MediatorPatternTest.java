package behaviour.mediatorpattern;

import behaviour.mediatorpattern.colleague.User;
import behaviour.mediatorpattern.colleague.UserImpl;
import behaviour.mediatorpattern.mediator.ChatMediator;
import behaviour.mediatorpattern.mediator.ChatMediatorImpl;

public class MediatorPatternTest {
	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediatorImpl();
		User user1 = new UserImpl(chatMediator, "ayan");
		User user2 = new UserImpl(chatMediator, "debarati");
		User user3 = new UserImpl(chatMediator, "pramit");
		User user4 = new UserImpl(chatMediator, "arka");
		User user5 = new UserImpl(chatMediator, "sayan");
		User user6 = new UserImpl(chatMediator, "pal");
		chatMediator.addUser(user1);
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		chatMediator.addUser(user4);
		chatMediator.addUser(user5);
		chatMediator.addUser(user6);
		user1.send("Party kobe??");
	}
}
