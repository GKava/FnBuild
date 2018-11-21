package guide.battleroyale_fortnite.build.buildingguide.Fragment.Trap;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import guide.battleroyale_fortnite.build.buildingguide.ItemExample.FortItem;
import guide.battleroyale_fortnite.build.buildingguide.R;
import guide.battleroyale_fortnite.build.buildingguide.adapters.TrapAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrapFragmentMenu extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager verticalLinearLayoutManager;
    private TrapAdapter adapter;

    public TrapFragmentMenu() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fort, container, false);
        recyclerView = view.findViewById(R.id.recycler);
        verticalLinearLayoutManager = new LinearLayoutManager(getActivity());
        verticalLinearLayoutManager.setStackFromEnd(false);
        recyclerView.setLayoutManager(verticalLinearLayoutManager);
        adapter = new TrapAdapter();
        recyclerView.setAdapter(adapter);

        adapter.addMessage(new FortItem("TRAP", R.drawable.trap_ship));
        adapter.addMessage(new FortItem("FREEZE TRAP", R.drawable.menu_trap));
        adapter.addMessage(new FortItem("TURRET", R.drawable.trap_turret));

        return view;
    }

}
