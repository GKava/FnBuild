package guide.battleroyale_fortnite.build.buildingguide;

import android.content.Intent;
import android.net.Uri;
import android.support.design.bottomappbar.BottomAppBar;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import guide.battleroyale_fortnite.build.buildingguide.Fragment.MainFragment;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab =  findViewById(R.id.fab);
        fab.setOnClickListener(this);

        fragmentManager = getSupportFragmentManager();
        if (findViewById(R.id.fragment_container)!=null){
            if (savedInstanceState!=null){
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragment_container, new MainFragment()).commit();
        }

        BottomAppBar bar = (BottomAppBar) findViewById(R.id.app_bar);
        setSupportActionBar(bar);

//        bar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Handle the navigation click by showing a BottomDrawer etc.
//            }
//        });

    }

    @Override
    public void onClick(View view) {
switch (view.getId()){
    case R.id.fab:
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new MainFragment())
                .addToBackStack(null)
                .commit();
        break;


//    MainActivity.fragmentManager.beginTransaction()
//            .replace(R.id.fragment_container,  weekClosed)
//            .addToBackStack(null)
//            .commit();
}
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        MainFragment mainFragment = new MainFragment();
        switch (id) {
            case R.id.item_rate:
                Toast toast = Toast.makeText(getApplicationContext(),
                        "item_rate", Toast.LENGTH_SHORT);
                toast.show();
                Uri address = Uri.parse("https://play.google.com/store/apps/details?id=com.gbattleroyale.fortnitestarschallenge");
                Intent openlinkIntent = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlinkIntent);

                return true;
            case R.id.item_share:
                Toast toast2 = Toast.makeText(getApplicationContext(),
                        "item_share", Toast.LENGTH_SHORT);
                toast2.show();
                return true;
            case R.id.item_help:
                Toast toast3 = Toast.makeText(getApplicationContext(),
                        "item_help", Toast.LENGTH_SHORT);
                toast3.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottomappbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
