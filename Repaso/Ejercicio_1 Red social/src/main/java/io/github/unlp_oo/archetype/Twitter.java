package io.github.unlp_oo.archetype;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<User> users;
	
	public Twitter () {
	this.users = new ArrayList<User>();
	}
	
	private boolean existUsername(String aScreenName) {
		return this.users.stream()
		.anyMatch(u->u.getName().equals(aScreenName));
	}
	
	public boolean createUser (String aScreenName){
		if (! this.existUsername(aScreenName))
			return this.users.add(new User(aScreenName));
		return false;
	}
	
	public boolean removeUser(User user) {
		user.removeTweets();
		return this.users.remove(user);
	}
}
