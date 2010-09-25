import twitter4j.*

abstract class GeeTwitterScript extends Script {

	static twitter = null

	// establish connection with Twitter service
	def login(username, password) {
		twitter = new Twitter(username, password)
	}

	// send a direct message
	def sendMessage(username, message) {
		twitter.sendDirectMessage(username, message)
	}

	// apply a closure to each friendship
	def eachMessage(Closure c) {
		twitter.directMessages.each {
			c.call(it.sender.Screen.Name,it.text)
		}
	}

	// apply a closure to each follower
	def eachFollower(Closure c) {
		twitter.followers.each {
			c.call(.it.screenName)
		}
	}

	// follow another user
	def follow(user) {
		try {
			twitter.createFriendship("${twitter.getUserDetail(user).getId()}")
		} catch (e) {}
	}
	
	def search(terms, Closure c) {
		if (!twitter)
			twitter = new Twitter()
		def query = new Query(terms)
		twitter.search(query).tweets.each {
			c.call(it.fromUser,it.text)
		}
	}

	def block(user) {
		try {
			twitter.createBlock(user)
		} catch (e) {}
	}

	static void search(terms, Closure c) {
		if (!twitter)
			twitter = new Twitter()
		def query = new Query(terms)
		twitter.search(query).tweets.each {
			c.call(it.fromUser,it.text)
		} 
	}

}