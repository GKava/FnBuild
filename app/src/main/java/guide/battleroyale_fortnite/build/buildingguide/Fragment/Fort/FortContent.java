package guide.battleroyale_fortnite.build.buildingguide.Fragment.Fort;


import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.ImageView;
import android.widget.TextView;

import guide.battleroyale_fortnite.build.buildingguide.ItemExample.AllConstructionItem;
import guide.battleroyale_fortnite.build.buildingguide.R;
import guide.battleroyale_fortnite.build.buildingguide.adapters.TwoImageAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class FortContent extends Fragment {
    private ImageView img1,img2;
    int imgInt;
    private TextView txtName;
    private RecyclerView recyclerView;
    private LinearLayoutManager verticalLinearLayoutManager;
    private TwoImageAdapter adapter;
    public FortContent() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fort_container, container, false);

        txtName = view.findViewById(R.id.txtName);

        recyclerView = view.findViewById(R.id.recycler);
        verticalLinearLayoutManager = new LinearLayoutManager(getActivity());
        verticalLinearLayoutManager.setStackFromEnd(false);
        recyclerView.setLayoutManager(verticalLinearLayoutManager);

        Display display = getActivity().getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x/2;

        Bundle bundle = getArguments();
        if (bundle != null) {
            imgInt = bundle.getInt("img_int_fort");
        }

        adapter = new TwoImageAdapter(width);
        recyclerView.setAdapter(adapter);
        if (imgInt==0) {
            txtName.setText("FORT");
            adapter.addMessage(new AllConstructionItem(R.drawable.fr1, R.drawable.fr2));
            adapter.addMessage(new AllConstructionItem(R.drawable.fr3, R.drawable.fr4));
        }
        if (imgInt==1) {
            txtName.setText("MEGA FORT");
            adapter.addMessage(new AllConstructionItem(R.drawable.mf1, R.drawable.mf2));
            adapter.addMessage(new AllConstructionItem(R.drawable.mf3, R.drawable.mf4));
        }
        if (imgInt==2) {
            txtName.setText("SPIKY STADIUM");
            adapter.addMessage(new AllConstructionItem(R.drawable.ss1, R.drawable.ss2));
            adapter.addMessage(new AllConstructionItem(R.drawable.ss3, R.drawable.ss4));
        }



        return view;
    }
}
