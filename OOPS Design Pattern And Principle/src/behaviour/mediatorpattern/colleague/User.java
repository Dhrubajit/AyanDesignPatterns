package behaviour.mediatorpattern.colleague;

import behaviour.mediatorpattern.mediator.ChatMediator;

public abstract class User {
	protected ChatMediator chatMediator;
	protected String name;
	
	public User(ChatMediator chatMediator, String name) {
		this.chatMediator = chatMediator;
		this.name = name;
	}
	public abstract void send(String msg);
	public abstract void receive(String msg);
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
