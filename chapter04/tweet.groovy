// twitter-4j-2.0.3.jar 
import twitter4j.*
// personal information
def twitterId = "kbaurets"
def password =  "kb1977"
def twitter = new Twitter(twitterId, password)

try {

	twitter.updateStatus("hello")
}
catch(Exception e){
println e.stacktrace}
