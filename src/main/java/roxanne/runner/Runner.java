package roxanne.runner;

import roxanne.twittertopicmodels.Configure;
import roxanne.twittertopicmodels.TwitterLDA;

public class Runner {
	static void runTwitterLDA() {
		new Configure();

		String dataPath = "path to data file";
		String outputPath = "path to directory to save outputs";
		int nTopics = 10;
		TwitterLDA twitterLDA = new TwitterLDA(dataPath, outputPath, nTopics);
		twitterLDA.readData();
		twitterLDA.learnModel();
	}

	public static void main(String[] args) {
		runTwitterLDA();
	}
}
