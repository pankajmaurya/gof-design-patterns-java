package io.girirajvyas.gof.designpatterns.structural.proxy;

public class TwitterServiceImpl implements TwitterService {

	@Override
	public String getTimeline(String screenName) {

		return "foo";
	}

	@Override
	public void postToTimeline(String screenName, String message) {
		// we aren't going to allow this
		System.out.println(message);
	}

}
