package room.play.playroom.room.play.playroom.meanwhileclass;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by eliran on 6/6/2017.
 */

public class FeedObdject {
    String name;
    String date;
    int profileIV;
    int ThumdnailIV;
    int NumOfLIsting;
    int NumOfLIke;


    public FeedObdject(String name, String date, int profileIV, int thumdnailIV, int numOfLIsting, int numOfLIke) {
        this.name = name;
        this.date = date;
        this.profileIV = profileIV;
        ThumdnailIV = thumdnailIV;
        NumOfLIsting = numOfLIsting;
        NumOfLIke = numOfLIke;
    }
}

