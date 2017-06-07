package room.play.playroom.room.play.playroom.meanwhileclass;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import room.play.playroom.R;

/**
 * Created by eliran on 6/6/2017.
 */

public class FeedRVAdapter extends RecyclerView.Adapter<FeedRVAdapter.MyHolder> {
ArrayList<FeedObdject> allFeed;
    Context context;

    public FeedRVAdapter(ArrayList<FeedObdject> allFeed, Context context) {
        this.allFeed = allFeed;
        this.context = context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.feed_item, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        FeedObdject feedObdject=allFeed.get(position);
        holder.BindData(feedObdject);
    }

    @Override
    public int getItemCount() {
        return allFeed.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView profileIVItem;
        ImageButton joinIBItem;
        TextView nameTVItem;
        TextView DateTVItem;
        ImageView songIVITem;
        TextView listeningTVItem;
        TextView likeTVITem;
        public MyHolder(View itemView) {
            super(itemView);
            profileIVItem= (ImageView) itemView.findViewById(R.id.ProfileIVItem);
            joinIBItem= (ImageButton) itemView.findViewById(R.id.JoinIB);
            nameTVItem= (TextView) itemView.findViewById(R.id.NameTVItem);
            DateTVItem= (TextView) itemView.findViewById(R.id.DateTVItem);
            songIVITem= (ImageView) itemView.findViewById(R.id.SongIVItem);
            listeningTVItem= (TextView) itemView.findViewById(R.id.ListeningTVItem);
            likeTVITem= (TextView) itemView.findViewById(R.id.LikeTVItem);
            joinIBItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "join to room", Toast.LENGTH_SHORT).show();
                }
            });
        }
        public void BindData(FeedObdject feedObdject)
        {
            profileIVItem.setImageResource(feedObdject.profileIV);
            nameTVItem.setText(feedObdject.name);
            DateTVItem.setText(feedObdject.date);
            songIVITem.setImageResource(feedObdject.ThumdnailIV);
            likeTVITem.setText(""+feedObdject.NumOfLIke);
            listeningTVItem.setText(""+feedObdject.NumOfLIsting);
        }
    }
}
