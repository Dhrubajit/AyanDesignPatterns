package behaviour.iteratorpattern;

import java.util.ArrayList;
import java.util.Collection;

public class IteratorPatternTest {

	public static void main(String[] args) {
		Channel channel1 = new Channel(100,ChannelType.ENGLISH);
		Channel channel2 = new Channel(101,ChannelType.HINDI);
		Channel channel3 = new Channel(102,ChannelType.HINDI);
		Channel channel4 = new Channel(103,ChannelType.ENGLISH);
		Channel channel5 = new Channel(104,ChannelType.ENGLISH);
		ChannelCollection collection = new ChannelCollection();
		collection.add(channel1);
		collection.add(channel2);
		collection.add(channel3);
		collection.add(channel4);
		collection.add(channel5);
		
		ChannelIterator iterator = collection.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
