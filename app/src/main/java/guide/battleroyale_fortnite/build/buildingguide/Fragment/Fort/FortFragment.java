package guide.battleroyale_fortnite.build.buildingguide.Fragment.Fort;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import guide.battleroyale_fortnite.build.buildingguide.ItemExample.FortItem;
import guide.battleroyale_fortnite.build.buildingguide.R;
import guide.battleroyale_fortnite.build.buildingguide.adapters.FortAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class FortFragment extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager verticalLinearLayoutManager;
    private FortAdapter adapter;

    public FortFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fort, container, false);
        recyclerView = view.findViewById(R.id.recycler);
        verticalLinearLayoutManager = new LinearLayoutManager(getActivity());
        verticalLinearLayoutManager.setStackFromEnd(false);
        recyclerView.setLayoutManager(verticalLinearLayoutManager);
        adapter = new FortAdapter();
        recyclerView.setAdapter(adapter);

        adapter.addMessage(new FortItem("FORT", R.drawable.img_fort_standart));
        adapter.addMessage(new FortItem("MEGA FORT", R.drawable.img_fort));
        adapter.addMessage(new FortItem("SPIKY STADIUM", R.drawable.img_arena));


        return view;
    }

}
