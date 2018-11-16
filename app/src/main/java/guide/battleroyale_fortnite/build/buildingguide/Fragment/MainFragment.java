package guide.battleroyale_fortnite.build.buildingguide.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import guide.battleroyale_fortnite.build.buildingguide.MainActivity;
import guide.battleroyale_fortnite.build.buildingguide.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements View.OnClickListener{
    LinearLayout select1;
    LinearLayout select2;
    LinearLayout select3;
    LinearLayout select4;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        select1 =view.findViewById(R.id.select1);
        select1.setOnClickListener(this);
        select2 =view.findViewById(R.id.select2);
        select2.setOnClickListener(this);
        select3 =view.findViewById(R.id.select3);
        select3.setOnClickListener(this);
        select4 =view.findViewById(R.id.select4);
        select4.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.select1:
                MainActivity.fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, new AllConstructionsFragment())
                        .addToBackStack(null)
                        .commit();
            break;
            case R.id.select2:
                MainActivity.fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, new FortFragment())
                        .addToBackStack(null)
                        .commit();
                break;


        }

    }
}
