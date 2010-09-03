// twitter-4j-2.0.3.jar 
import twitter4j.*
// personal information
def twitterId = ""
def password =  ""
def twitter = new Twitter(twitterId, password)
twitter.updateStatus("updat3 from the cons0le!; Groovy is in the heart; f1nd m3 on github; thanks 2 @kayaman :) ")
//println twitter.getUserDetail(twitterId).getStatusText()