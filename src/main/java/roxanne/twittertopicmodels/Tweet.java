package roxanne.twittertopicmodels;

public class Tweet {
	public String tweetID;
	// public String userID;
	public int[] words;
	// public int nUniqueWords;
	public int[] coins;// for TwitterLDA with background topic
	//
	public int topic;

	public int inferedTopic;
	public double inferedLikelihood;
	public double inferedPosteriorProb; // i.e., prob{inferedTopic|words)

}
