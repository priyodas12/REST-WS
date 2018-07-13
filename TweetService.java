package io.priyo.ApplicationService.Services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.priyo.ApplicationService.Model.Tweet;


public class TweetService {
	
	    
	    public List<Tweet> getAllTweetInformation() {
	    	
	    	Tweet t1=new Tweet(10001,45,"Ram",32);
	    	Tweet t2=new Tweet(10002,95,"shayam",422);
	    	
	    	List<Tweet> l=new ArrayList<Tweet>();
	    	
	    	l.add(t1);
	    	l.add(t2);
	    	
	    	return l;
	    	
	    }

}
