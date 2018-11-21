package guide.battleroyale_fortnite.build.buildingguide.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import guide.battleroyale_fortnite.build.buildingguide.ItemExample.FortItem;
import guide.battleroyale_fortnite.build.buildingguide.R;
import guide.battleroyale_fortnite.build.buildingguide.adapters.MainFragmentAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment{
    private RecyclerView recyclerView;
    private LinearLayoutManager verticalLinearLayoutManager;
    private MainFragmentAdapter adapter;
    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_menu, container, false);


        recyclerView = view.findViewById(R.id.recycler);
        verticalLinearLayoutManager = new LinearLayoutManager(getActivity());
        verticalLinearLayoutManager.setStackFromEnd(false);
        recyclerView.setLayoutManager(verticalLinearLayoutManager);
        adapter = new MainFragmentAdapter();
        recyclerView.setAdapter(adapter);

        adapter.addMessage(new FortItem("ALL CONSTRUCTION", R.drawable.menu_const));
        adapter.addMessage(new FortItem("FORT", R.drawable.img_fort));
        adapter.addMessage(new FortItem("TRAPS", R.drawable.menu_trap));
        adapter.addMessage(new FortItem("STAIRS", R.drawable.l4));
//        adapter.addMessage(new FortItem("SANDBOX", R.drawable.img_arena));
//        adapter.addMessage(new bar.appbarbottom.appbarbottom.ItemExample.FortItem("SPEED BUILD", R.drawable.img_arena));
        return view;
    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.select1:
//                MainActivity.fragmentManager.beginTransaction()
//                        .replace(R.id.fragment_container, new AllConstructionsFragment())
//                        .addToBackStack(null)
//                        .commit();
//            break;
//            case R.id.select2:
//                MainActivity.fragmentManager.beginTransaction()
//                        .replace(R.id.fragment_container, new FortFragment())
//                        .addToBackStack(null)
//                        .commit();
//                break;
//
//
//        }
//
//    }
}
