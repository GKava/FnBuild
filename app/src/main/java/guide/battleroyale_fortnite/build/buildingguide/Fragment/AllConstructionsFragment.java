package guide.battleroyale_fortnite.build.buildingguide.Fragment;


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

import guide.battleroyale_fortnite.build.buildingguide.ItemExample.AllConstructionItem;
import guide.battleroyale_fortnite.build.buildingguide.R;
import guide.battleroyale_fortnite.build.buildingguide.adapters.AllConstructionAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class AllConstructionsFragment extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager verticalLinearLayoutManager;
    private AllConstructionAdapter adapter;
    private ImageView im1 , im1_1, im2,im2_1;



    public AllConstructionsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all_construction, container, false);
        recyclerView = view.findViewById(R.id.recycler);
        verticalLinearLayoutManager = new LinearLayoutManager(getActivity());
        verticalLinearLayoutManager.setStackFromEnd(false);
        recyclerView.setLayoutManager(verticalLinearLayoutManager);

        Display display = getActivity().getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x/2;

        adapter = new AllConstructionAdapter(width);
        recyclerView.setAdapter(adapter);
        adapter.addMessage(new AllConstructionItem(R.drawable.c1, R.drawable.c1_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c2, R.drawable.c2_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c3, R.drawable.c3_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c4, R.drawable.c4_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c5, R.drawable.c5_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c6, R.drawable.c6_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c7, R.drawable.c7_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c8, R.drawable.c8_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c9, R.drawable.c9_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c10, R.drawable.c10_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c11, R.drawable.c11_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c12, R.drawable.c12_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c13, R.drawable.c13_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c14, R.drawable.c14_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c15, R.drawable.c15_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c16, R.drawable.c16_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c17, R.drawable.c17_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c18, R.drawable.c18_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c19, R.drawable.c19_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c20, R.drawable.c20_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c21, R.drawable.c21_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c22, R.drawable.c22_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c23, R.drawable.c23_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c24, R.drawable.c24_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c25, R.drawable.c25_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.c26, R.drawable.c26_1));
        return view;
    }

}
