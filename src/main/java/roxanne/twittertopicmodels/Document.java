package roxanne.twittertopicmodels;

public class Document {
	/***
	 * An aggregation of tweets
	 * E.g., if we aggregate tweets by author then documentId = userId and documentName = userName
	 */
	public int documentId;
	public String documentName;
	public double[] topicDistribution;
	public Tweet[] tweets;
}
