package ie.cct.objectorientedconstructs.s2017017;

import java.util.ArrayList;
import java.util.List;

import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;
import ie.cct.objectorientedconstructs.FeedListInterface;

/**
 *~~~~~~~~~~ Class FeedList implementing FeedListInterface~~~~~~~~~~~ *
 *                                                                    **/
public class FeedList implements FeedListInterface {

	//Global Variable List FeedInterface
	List<FeedInterface> myFeedListMain = new ArrayList<>();

	/** List Titles returning in ArrayList **/
	@Override
	public ArrayList<String> listTitles() {

		//Instantiating two ArrayList type String
		ArrayList<String> titles = new ArrayList<String>();
		ArrayList<String> titles2 = new ArrayList<String>();
		//Iterating through FeedList
		for (FeedInterface f : myFeedListMain) {
			//Calling listTitle method from Feed and adding into ArrayList
			titles = f.listTitles();
			//Add ArrayList into second one to be able to store next iteration in same ArrayList
			titles2.addAll(titles);
		}

		//Returning Full ArrayList
		return titles2;

	}
	
	/** FindItem method returning FeedItem object by "title"**/
	@Override
	public FeedItem getItem(String title) {

		//Iterating through FeedList
		for (FeedInterface f : myFeedListMain) {
			//returning item with specific title
			return f.getItem(title);
		}
		//return null if there is no match
		return null;
	}

	/** Number of Items in List**/
	@Override
	public int numItems() {

		//Counter type Integer
		int count = 0;
		//Iterating through ArrayList
		for (FeedInterface f : myFeedListMain) {
			//Adding each number of Items in the counter
			count = f.numItems();
			//adding counters
			count += count;
		}
		//return count integer
		return count;
	}

	/** Find Items returning Array List**/
	@Override
	public ArrayList<FeedItem> findItems(String keyword) {

		//Instantiating two ArrayList type FeedItem
		ArrayList<FeedItem> item = new ArrayList<FeedItem>();
		ArrayList<FeedItem> item2 = new ArrayList<FeedItem>();
		//Iterating through FeedList
		for (FeedInterface f : myFeedListMain) {
			//Find Item method in Feed Interface
			item = f.findItems(keyword);
			//Adding object to main Array
			item2.addAll(item);
		}
		//returning main array
		return item2;
	}

	/** Add Feed taking FeedInterface as a parameter**/
	@Override
	public void addFeed(FeedInterface f) {
		
		//Saving FeedInterdace in global FeedInterface List
		this.myFeedListMain.add(f);
	}

	/** Remove Feed**/
	@Override
	public boolean removeFeed(FeedInterface f) {

		//Instantiating flag
		boolean flag = false;
		// Equals method compare object and return boolean
		flag = myFeedListMain.equals(f);
		//If flag is true
		if (flag == true) {
			//remove object
			myFeedListMain.remove(f);
			return true;
		} else {
			//otherwise return null
			return false;
		}

	}

}
