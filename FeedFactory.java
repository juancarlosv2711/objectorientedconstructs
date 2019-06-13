package ie.cct.objectorientedconstructs.s2017017;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ie.cct.objectorientedconstructs.FeedFactoryInterface;
import ie.cct.objectorientedconstructs.FeedItem;

/** 
 * ~~~~~~~~~ FeedFactory implementing FeedFactoryInterface ~~~~~~~~~~  *
 *                                                                     **/
public class FeedFactory implements FeedFactoryInterface {

	List<FeedItem> myFeedItems = new ArrayList<FeedItem>();
	Feed feed;
	/**
	 * Default Constructor creating FeedItem and Feed, returning Feed and getting
	 * BufferedReader as a parameter
	 **/
	@Override
	public Feed createFeed(BufferedReader in) throws IOException {

		// List of FeedItem instantiated
		//List<FeedItem> myFeedItems = new ArrayList();

		// For Loop iterating through the text
		for (int i = 0; i < 3; i++) {
			// reading lines from text
			String titles = in.readLine();
			String content = in.readLine();
			// instantiating FeedItem passing titles and content in parameter
			FeedItem myFeedItem = new FeedItem(titles, content);
			// Adding FeedItem to List FeedItem
			myFeedItems.add(myFeedItem);
		}
		// passing List as a parameter to instantiate Feed class
		Feed feed1 = new Feed(myFeedItems);
		this.feed = feed1;
		//returning object
		return feed;
	}

	/**Default Constructor creating FeedItem and Feed, returning Feed and getting**/
	@Override
	public FeedList createFeedList() {
		
		//Creating an instance of FeedList
		FeedList myFeedList = new FeedList();
		//Adding Feed to FeedList
		myFeedList.addFeed(feed);
		
		//returning FeedList
		return myFeedList;
	}

}
