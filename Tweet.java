package io.priyo.ApplicationService.Model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Tweet {
	
	private int tweetId;
	private Date tweetedDate;
	private int retweetCounts;
	private String tweetedBy;
	private int likeCounts;
	
	public Tweet() {
		
	}
	
	public Tweet(int tweetId, int retweetCounts, String tweetedBy, int likeCounts) {
		
		this.tweetId = tweetId;
		this.tweetedDate = new Date();
		this.retweetCounts = retweetCounts;
		this.tweetedBy = tweetedBy;
		this.likeCounts = likeCounts;
	}

	public int getTweetId() {
		return tweetId;
	}

	public void setTweetId(int tweetId) {
		this.tweetId = tweetId;
	}

	public Date getTweetedDate() {
		return tweetedDate;
	}

	public void setTweetedDate(Date tweetedDate) {
		this.tweetedDate = tweetedDate;
	}

	public int getRetweetCounts() {
		return retweetCounts;
	}

	public void setRetweetCounts(int retweetCounts) {
		this.retweetCounts = retweetCounts;
	}

	public String getTweetedBy() {
		return tweetedBy;
	}

	public void setTweetedBy(String tweetedBy) {
		this.tweetedBy = tweetedBy;
	}

	public int getLikeCounts() {
		return likeCounts;
	}

	public void setLikeCounts(int likeCounts) {
		this.likeCounts = likeCounts;
	}
	
	

}
