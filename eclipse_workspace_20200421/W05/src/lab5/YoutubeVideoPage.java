package lab5;
import java.util.ArrayList;

public class YoutubeVideoPage {
	
	public String videoName;
	public int likeNumber;
	public int dislikeNumber;
	public ArrayList<String> relatedVideos;
	public ArrayList<String> comments = new ArrayList<String>();
	
	public void likeVideo() {
		likeNumber++;
	}
	
	public void dislikeVideo() {
		dislikeNumber++;
	}

	public void addComments(String comment) {
		comments.add(comment);
	}

	public static void main(String[] args) {
		
		YoutubeVideoPage v1 = new YoutubeVideoPage();
		v1.videoName = "My video";
		v1.likeVideo();
		v1.dislikeVideo();
		v1.likeVideo();
		v1.addComments("Great.");
		v1.addComments("Awful.");
		System.out.println("Video name: "+ v1.videoName);
		System.out.println("Likes: "+ v1.likeNumber);
		System.out.println("Dislikes: "+ v1.dislikeNumber);
		System.out.println("Comments:" + v1.comments);
		
		
	}

	
	
}
