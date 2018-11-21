package guide.battleroyale_fortnite.build.buildingguide.Fragment;


import android.graphics.Point;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import guide.battleroyale_fortnite.build.buildingguide.ItemExample.AllConstructionItem;
import guide.battleroyale_fortnite.build.buildingguide.R;
import guide.battleroyale_fortnite.build.buildingguide.adapters.TwoImageAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentStairs extends android.support.v4.app.Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager verticalLinearLayoutManager;
    private TwoImageAdapter adapter;

    public FragmentStairs() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_stairs, container, false);
        recyclerView = view.findViewById(R.id.recycler);
        verticalLinearLayoutManager = new LinearLayoutManager(getActivity());
        verticalLinearLayoutManager.setStackFromEnd(false);
        recyclerView.setLayoutManager(verticalLinearLayoutManager);
        Display display = getActivity().getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x/2;

        adapter = new TwoImageAdapter(width);
        recyclerView.setAdapter(adapter);
        adapter.addMessage(new AllConstructionItem(R.drawable.l1, R.drawable.l1_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.l2, R.drawable.l2_2));
        adapter.addMessage(new AllConstructionItem(R.drawable.l3, R.drawable.l3_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.l4, R.drawable.l4_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.l5, R.drawable.l5_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.l6, R.drawable.l6_1));
        adapter.addMessage(new AllConstructionItem(R.drawable.l7, R.drawable.l7_1));

        return view;
    }

}
