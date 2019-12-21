package behaviour.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollection {
	private List<Channel> channelList=new ArrayList<>();
	
	public void add(Channel channel){
		channelList.add(channel);
	}
	
	public void remove(Channel channel){
		channelList.remove(channel);
	}
	
	public ChannelIterator iterator(){
		return new EnglishChannelIterator();
	}
	private class EnglishChannelIterator implements ChannelIterator{
		private int position;
		
		@Override
		public boolean hasNext() {
			while(position <= channelList.size()-1){
				if(channelList.get(position).getType() == ChannelType.ENGLISH){
					return true;
				}
				else
					position++;
					
			}
			
			return false;
		}

		@Override
		public Channel next() {
			return channelList.get(position++);
		}
		
	}
}
