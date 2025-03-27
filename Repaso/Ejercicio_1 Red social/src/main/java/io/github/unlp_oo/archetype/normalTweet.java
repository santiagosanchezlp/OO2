package io.github.unlp_oo.archetype;

public class normalTweet extends Tweet{
	private String message;
	public normalTweet (String aMessage) {
		this.setMessage(aMessage);
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
