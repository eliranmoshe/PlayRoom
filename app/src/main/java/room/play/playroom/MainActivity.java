package room.play.playroom;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

import room.play.playroom.room.play.playroom.meanwhileclass.FeedObdject;
import room.play.playroom.room.play.playroom.meanwhileclass.FeedRVAdapter;
import room.play.playroom.room.play.playroom.meanwhileclass.FragmentChanger;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,FragmentChanger {
    private Toolbar toolbar;

    Button createBtnTB,explorerBtnTB,homeBtnTB,notBtnTB,profBtnTB;
    LinearLayout createLL,explorerLL,homeLL,notLL,profLL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createBtnTB= (Button) findViewById(R.id.CreateBtnTB);
        explorerBtnTB= (Button) findViewById(R.id.ExplorerBtnTB);
        homeBtnTB= (Button) findViewById(R.id.HomeBtnTB);
        notBtnTB= (Button) findViewById(R.id.NotBtnTB);
        profBtnTB= (Button) findViewById(R.id.ProfBtnTB);
        createBtnTB.setOnClickListener(this);
        explorerBtnTB.setOnClickListener(this);
        homeBtnTB.setOnClickListener(this);
        notBtnTB.setOnClickListener(this);
        profBtnTB.setOnClickListener(this);
        createLL= (LinearLayout) findViewById(R.id.CreateLL);
        homeLL= (LinearLayout) findViewById(R.id.HomeLL);
        explorerLL= (LinearLayout) findViewById(R.id.ExplorerLL);
        profLL= (LinearLayout) findViewById(R.id.ProfLL);
        notLL= (LinearLayout) findViewById(R.id.NotLL);
        //LogIn logIn=new LogIn();
        //getFragmentManager().beginTransaction().replace(R.id.main_container,logIn).commit();
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        AddFeedFragment();

    }

    @Override
    public void onClick(View v) {

        createLL.setBackgroundColor(Color.TRANSPARENT);
        explorerLL.setBackgroundColor(Color.TRANSPARENT);
        profLL.setBackgroundColor(Color.TRANSPARENT);
        notLL.setBackgroundColor(Color.TRANSPARENT);
        homeLL.setBackgroundColor(Color.TRANSPARENT);

        switch (v.getId())
        {
            case R.id.CreateBtnTB:
                Toast.makeText(this, "create", Toast.LENGTH_SHORT).show();

                AddCreateFragment();
                break;
            case R.id.ExplorerBtnTB:
                Toast.makeText(this, "explorer", Toast.LENGTH_SHORT).show();

                explorerLL.setBackgroundColor(Color.GRAY);
                break;
            case R.id.HomeBtnTB:
                Toast.makeText(this, "home", Toast.LENGTH_SHORT).show();
                AddFeedFragment();

                break;
            case R.id.NotBtnTB:
                Toast.makeText(this, "notification", Toast.LENGTH_SHORT).show();
                notLL.setBackgroundColor(Color.GRAY);
                break;
            case R.id.ProfBtnTB:
                Toast.makeText(this, "profile", Toast.LENGTH_SHORT).show();
                profLL.setBackgroundColor(Color.GRAY);
                break;
        }
    }

    @Override
    public void AddCreateFragment() {
        createLL.setBackgroundColor(Color.GRAY);
        CreateFragment createFragment=new CreateFragment();
        getFragmentManager().beginTransaction().replace(R.id.frag_layout,createFragment,"createfragment").commit();
    }

    @Override
    public void AddFeedFragment() {
        homeLL.setBackgroundColor(Color.GRAY);
        FeedFragment feedFragment=new FeedFragment();
        getFragmentManager().beginTransaction().replace(R.id.frag_layout,feedFragment,"feed").commit();
    }
}
