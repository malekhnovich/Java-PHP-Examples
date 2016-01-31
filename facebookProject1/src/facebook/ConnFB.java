/*
 * Collect your Facebook feeds and save them in a .txt file. And upload your file here. You do not need to upload your java codes.

Other than the feed story shown in class, the create time (get from your feed), and a count number (create by yourself) for each feed are also needed in the file.

So the file should look like as follows.

1. Fri Sep 11 09:42:54 EDT 2015: null
2. Sun Mar 03 02:32:55 EST 2013: null
3. Sat Apr 14 20:19:35 EDT 2012: null
4. Sun Jan 01 03:00:00 EST 2012: Yanchi Liu added a life event from 2012: Started School at NJIT.
5. Tue Feb 01 03:00:00 EST 2011: Yanchi Liu added a life event from February 2011: Started Working at Microsoft Research Asia.
6. Tue Sep 28 19:30:29 EDT 2010: null
7. null: Yanchi Liu added a life event from April 14, 1986: Born on April 14, 1986.
 */
package facebook;
import java.util.*;
import com.restfb.types.*;
import com.restfb.*;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.scene.Parent;

/**
 *
 * @author maxrenet
 */


public class ConnFB {
    ArrayList nodeName=new ArrayList();
    ArrayList nodeID=new ArrayList();

/**private void getFriends(String token){
FacebookClient facebookClient=new DefaultFacebookClient("CAACEdEose0cBAFjQOEwu2wWL0aLfiheTD4pn4w76psON0OfCihLspbuvi1p7H3hNBEMIeF1H8EpStw0IVM95zXHMEDmooKpYu8ZBbBaee1VElwcY7jF4LEUxZB89KwReprZAQROVsZBObtkFkgeZA09cl2rhybc79bET0M5PUAATDf9IQrCrdsv3huuH8PQoZD");
Connection<User> myFriends=facebookClient.fetchConnection("me/friends",User.class);
for(User uservalue: myFriends.getData()) {
    nodeID.add(uservalue.getId());
    nodeID.add(uservalue.getName());
}
System.out.println("Count of all of my friends: "+myFriends.getTotalCount());
System.out.println("Count of all my public friends: "+myFriends.getData().size());
System.out.println(nodeID);
System.out.println(nodeName);

}
* */
private void getFeeds(String token) throws IOException {
    FacebookClient facebookClient=new DefaultFacebookClient(token);
    
    Connection<Post> myFeed=facebookClient.fetchConnection("me/feed", Post.class);
    System.out.println("First item in my feed: "+myFeed.getData().get(0));
 PrintWriter writer=new PrintWriter("myfeeds2.txt","UTF-8");
 int i=0;
            for(List<Post> myFeedConnectionPage: myFeed) {
                for(Post post:myFeedConnectionPage) {
                    System.out.println(i+" ."+post.getCreatedTime()+": "+post);
                    writer.println(i+". "+post.getCreatedTime()+": "+post.getStory());
                    i++;
                }
                
            }
            writer.close();
}
public void publishFeeds(String token){
    FacebookClient facebookClient=new DefaultFacebookClient(token);
    
    FacebookType publishMessageResponse=facebookClient.publish("me/feed",FacebookType.class,Parameter.with("message","JAVA to Facebook compile successful"));
            System.out.println("Published message ID: "+publishMessageResponse.getId());

            System.out.println("Published message ID: "+publishMessageResponse.getId());
           
}

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("connecting fb...");
        ConnFB tmp=new ConnFB();
       // tmp.getFriends("CAACEdEose0cBAFjQOEwu2wWL0aLfiheTD4pn4w76psON0OfCihLspbuvi1p7H3hNBEMIeF1H8EpStw0IVM95zXHMEDmooKpYu8ZBbBaee1VElwcY7jF4LEUxZB89KwReprZAQROVsZBObtkFkgeZA09cl2rhybc79bET0M5PUAATDf9IQrCrdsv3huuH8PQoZD");
       tmp.getFeeds("CAACEdEose0cBAPyaW5EURoSue9kKQoLH7ZAGBOfttkyB4qOh7xDa5tJss8AUs6LOJx3D0YAA2vzRfUhEDyAQRKMTs3Hei5dbQu3wnVTFf9wZBw8e6atVA9DItJ5VRVYhlyaw8j4TYJk4ozhy3dYpDF9rfBEWjZB7f0M3Q60DFIANPMRYZBcDkPJ5TfZBQgo4ZD");
        tmp.publishFeeds("CAACEdEose0cBAPyaW5EURoSue9kKQoLH7ZAGBOfttkyB4qOh7xDa5tJss8AUs6LOJx3D0YAA2vzRfUhEDyAQRKMTs3Hei5dbQu3wnVTFf9wZBw8e6atVA9DItJ5VRVYhlyaw8j4TYJk4ozhy3dYpDF9rfBEWjZB7f0M3Q60DFIANPMRYZBcDkPJ5TfZBQgo4ZD");
    }
    

}