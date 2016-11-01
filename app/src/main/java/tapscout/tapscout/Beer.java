package tapscout.tapscout;

/**
 * Created by jkalb on 10/8/2016.
 */

public class Beer {
    String name;
    String remaining;
    int photoId;

    Beer(String name, String remaining, int photoId) {
        this.name = name;
        this.remaining = remaining;
        this.photoId = photoId;
    }
}
