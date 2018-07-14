package io.priyo.ApplicationService.Resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.priyo.ApplicationService.Model.Tweet;
import io.priyo.ApplicationService.Services.TweetService;

@Path("/tweet")
public class TweetResource {
	
	TweetService ts=new TweetService(); 
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Tweet> getTweets(){
		
		return ts.getAllTweetInformation();	
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String postTweet() {
		return "tweet posted on time: "+new Date();
	}
	
	@Path("/{messageId}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String findTweetById(@PathParam("messageId") String messageId) {
		return "This is political Tweet";
	}
}
