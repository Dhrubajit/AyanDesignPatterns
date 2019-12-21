package behaviour.iteratorpattern;

public class Channel {

	private Integer frequency;
	private ChannelType type;
	public Channel(Integer frequency, ChannelType type) {
		super();
		this.frequency = frequency;
		this.type = type;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	public ChannelType getType() {
		return type;
	}
	public void setType(ChannelType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Channel [frequency=" + frequency + ", type=" + type + "]";
	}
	
}
