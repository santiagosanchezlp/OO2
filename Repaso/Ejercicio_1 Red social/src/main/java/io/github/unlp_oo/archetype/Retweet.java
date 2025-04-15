package io.github.unlp_oo.archetype;

public class Retweet extends Tweet{
	private Tweet retweet;
	
	public Retweet (Tweet aTweet) {
		this.retweet = aTweet;
	}

	public Tweet getRetweet() {
		return retweet;
	}
}
