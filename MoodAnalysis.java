package Demo;

public class MoodAnalysis {
	public String analyseMood(String Mood) {
		if (Mood.toLowerCase().contains("happy")) {
			return "Entry Successful";
		} else if (Mood.toLowerCase().contains("sad")) {
			return "Entry Failed";
		} else
			return null;
	}
}

