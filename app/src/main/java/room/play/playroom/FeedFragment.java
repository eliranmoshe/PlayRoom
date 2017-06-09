package room.play.playroom;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import room.play.playroom.room.play.playroom.meanwhileclass.FeedObdject;
import room.play.playroom.room.play.playroom.meanwhileclass.FeedRVAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class FeedFragment extends Fragment {
    RecyclerView feedRV;
    FeedRVAdapter adapter;

    public FeedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_feed, container, false);
        feedRV= (RecyclerView) view.findViewById(R.id.FeedRV);
        ArrayList<FeedObdject> allFeed=new ArrayList<>();
        allFeed.add(new FeedObdject("Mikey James","Hot rining playlist|22:45",R.drawable.person_image2_bg_x,R.drawable.song_image_bg_x,45,12745));
        allFeed.add(new FeedObdject("David Boref","Relaxing Music|45:12",R.drawable.person_image_bg_x,R.drawable.song,50,9458));
        allFeed.add(new FeedObdject("Mikey James","Hot rining playlist|22:45",R.drawable.person_image2_bg_x,R.drawable.song_image_bg_x,45,12745));
        allFeed.add(new FeedObdject("David Boref","Relaxing Music|45:12",R.drawable.person_image_bg_x,R.drawable.song,50,9458));
        allFeed.add(new FeedObdject("Mikey James","Hot rining playlist|22:45",R.drawable.person_image2_bg_x,R.drawable.song_image_bg_x,45,12745));
        allFeed.add(new FeedObdject("David Boref","Relaxing Music|45:12",R.drawable.person_image_bg_x,R.drawable.song,50,9458));
        allFeed.add(new FeedObdject("Mikey James","Hot rining playlist|22:45",R.drawable.person_image2_bg_x,R.drawable.song_image_bg_x,45,12745));
        allFeed.add(new FeedObdject("David Boref","Relaxing Music|45:12",R.drawable.person_image_bg_x,R.drawable.song,50,9458));
        allFeed.add(new FeedObdject("Mikey James","Hot rining playlist|22:45",R.drawable.person_image2_bg_x,R.drawable.song_image_bg_x,45,12745));
        feedRV.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new FeedRVAdapter(allFeed,getActivity());
        feedRV.setAdapter(adapter);
        return view;
    }

}
