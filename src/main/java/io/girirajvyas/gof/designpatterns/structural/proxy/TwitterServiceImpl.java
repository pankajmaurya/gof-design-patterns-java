package io.girirajvyas.gof.designpatterns.structural.proxy;

import static java.lang.String.format;

public class TwitterServiceImpl implements TwitterService {

	@Override
	public String getTimeline(String screenName) {

		return "A fake timeline for demo of design patterns";
	}

	@Override
	public void postToTimeline(String screenName, String message) {
		// we aren't going to allow this
		System.out.println(format("This method postToTimeline actually got called with params %s, %s", screenName, message));
	}

}
