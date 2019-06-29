package roxanne.twittertopicmodels;

public class Configure {

	public final static int TWEET_MAX_NUMBER_CHARACTER = 150;

	public enum Author {
		HOANG
	}

	public final static Author AUTHOR = Author.HOANG;

	public static String WORKING_DIRECTORY;
	public static String STOPWORD_PATH;

	public Configure() {
		if (AUTHOR == Author.HOANG) {
			WORKING_DIRECTORY = "/home/hoang/attt";
		} else {
			// TO-DO: add authors
			System.out.println("No author defined!");
			System.exit(0);
		}

		Configure.STOPWORD_PATH = String.format("%s/data/stopwords", WORKING_DIRECTORY);

	}

}