package io.github.unlp_oo.archetype;

import java.util.ArrayList;
import java.util.List;

public class User {
	private List <Tweet> tweets;
	private String screenName;
	
	public User (String aName) {
		this.screenName = aName;
		this.tweets = new ArrayList<Tweet>();
	}
	
	public String getName() {
		return this.screenName;
	}
	
	public void setNombre(String nombre) {
		this.screenName = nombre;
	}
	
	public boolean createTweet(String aMessage) {
		if (checkLength(aMessage))
			return this.tweets.add(new normalTweet(aMessage));
		return false;
	}
	
	public boolean reTweet(Tweet aTweet) {
		return this.tweets.add(new Retweet(aTweet));
	}

	public boolean removeTweets() {
		return this.tweets.removeAll(tweets);
	}
	private boolean checkLength(String aMessage) {
		return (aMessage.length() > 0 && aMessage.length()<=240);
	}
}
