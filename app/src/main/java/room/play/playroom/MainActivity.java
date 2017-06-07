package room.play.playroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

import room.play.playroom.room.play.playroom.meanwhileclass.FeedObdject;
import room.play.playroom.room.play.playroom.meanwhileclass.FeedRVAdapter;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    RecyclerView feedRV;
    FeedRVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogIn logIn=new LogIn();
        getFragmentManager().beginTransaction().replace(R.id.main_container,logIn).commit();
        toolbar = (Toolbar) findViewById(R.id.tool_bar); // Attaching the layout to the toolbar object
        setSupportActionBar(toolbar);
        feedRV= (RecyclerView) findViewById(R.id.FeedRV);
        ArrayList<FeedObdject> allFeed=new ArrayList<>();
        allFeed.add(new FeedObdject("Mikey James","Hot rining playlist|22:45",R.drawable.profile,R.drawable.song,45,12745));
        allFeed.add(new FeedObdject("David Boref","Relaxing Music|45:12",R.drawable.profile,R.drawable.song,50,9458));
        feedRV.setLayoutManager(new LinearLayoutManager(this));
        adapter=new FeedRVAdapter(allFeed,this);
        feedRV.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.createTB:
                Toast.makeText(this, "create", Toast.LENGTH_SHORT).show();
                break;
            case R.id.explorerTB:
                Toast.makeText(this, "explorer", Toast.LENGTH_SHORT).show();
                break;
            case R.id.homeTB:
                Toast.makeText(this, "home", Toast.LENGTH_SHORT).show();
                break;
            case R.id.notificationTB:
                Toast.makeText(this, "notify", Toast.LENGTH_SHORT).show();
                break;
            case R.id.profileiconTB:
                Toast.makeText(this, "profile", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
