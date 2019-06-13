package ie.cct.objectorientedconstructs.s2017017;

import java.util.ArrayList;
import java.util.List;

import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;

/** 
 * ~~~~~~~~~ Feed implementing Feed Interface ~~~~~~~~~~     *
 *                                                           **/
public class Feed implements FeedInterface {

	// Global List Variable type "FeedItem"
	List<FeedItem> myFeedItems;

	/** Default constructor passing a List type "Feed Item" as a parameter **/
	public Feed(List<FeedItem> myFeedItems) {
		// Returning List and saving it in global variable
		this.myFeedItems = myFeedItems;
	}

	/** List Titles Method **/
	@Override
	public ArrayList<String> listTitles() {

		// Array List Variable type "String"
		ArrayList<String> titles = new ArrayList<String>();

		// For each loop iterating through List
		for (FeedItem f : myFeedItems) {
			// Getting each title from object and saving it to the array
			titles.add(f.getTitle());
		}
		// Returning the Array List
		return titles;
	}

	/** Get Item **/
	@Override
	public FeedItem getItem(String title) {

		// For each loop iterating through List
		for (FeedItem f : myFeedItems) {
			if (f.getTitle().contains(title)) {
				return f;
			}
		}
		return null;
	}

	/** Get Item **/
	@Override
	public int numItems() {

		//Getting size of list and returning it into integer
		int numItems = this.myFeedItems.size();
		//returning integer method
		return numItems;
	}

	/** Getting Items **/
	@Override
	public ArrayList<FeedItem> findItems(String keyword) {

		// ArrayList of items
		ArrayList<FeedItem> item = new ArrayList<FeedItem>();

		// Iterating through global Array List and Saving it into New Array List
		for (FeedItem f : myFeedItems) {
			// Comparing titles and Content against "keyword"
			if (f.getTitle().contains(keyword) || (f.getContent().contains(keyword))) {
				// Adding FeedItem to new Array List
				item.add(f);

			}

		}
		//returning saved Array
		return item;
	}

}
