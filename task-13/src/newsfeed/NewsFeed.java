import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * The NewsFeed class stores news posts for the news feed in a
 * social network application (like FaceBook or Google+).
 *
 * Display of the posts is currently simulated by printing the
 * details to the terminal. (Later, this should display in a browser.)
 *
 * This version does not save the data to disk, and it does not
 * provide any search or ordering functions.
 *
 * @author Michael Kölling and David J. Barnes
 * @version 0.2
 */
public class NewsFeed {
    private ArrayList<Post> posts;

    /**
     * Construct an empty news feed.
     */
    public NewsFeed() {
        posts = new ArrayList<Post>();
    }

    /**
     * Add a post to the news feed.
     *
     * @param post  The post to be added.
     */
    public void addPost(Post post) {
        posts.add(post);
    }

    /**
     * Show the news feed. Currently: print the news feed details
     * to the terminal. 
     */
    public void show() {
        // display all posts
        for(Post post : posts) {
            post.display();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        NewsFeed test = new NewsFeed();
        Post test2 = new EventPost("Daniel", "Prova på kajak", "Vart? " + "Nacka", LocalDate.of(2023, 05, 15));
        test2.display();
       // test.show();
    
    }
}
