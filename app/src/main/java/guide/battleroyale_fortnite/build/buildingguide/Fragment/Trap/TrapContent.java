package guide.battleroyale_fortnite.build.buildingguide.Fragment.Trap;


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
public class TrapContent extends  Fragment {
    private ImageView img1,img2;
    int imgInt;
    private TextView txtName;
    private RecyclerView recyclerView;
    private LinearLayoutManager verticalLinearLayoutManager;
    private TwoImageAdapter adapter;
    public TrapContent() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trap_content, container, false);

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
            imgInt = bundle.getInt("img_int_trap");
        }

        adapter = new TwoImageAdapter(width);
        recyclerView.setAdapter(adapter);
        if (imgInt==0) {
            txtName.setText("TRAP");
            adapter.addMessage(new AllConstructionItem(R.drawable.trap1, R.drawable.trap2));
            adapter.addMessage(new AllConstructionItem(R.drawable.trap3, R.drawable.trap4));
        }
        if (imgInt==1) {
            txtName.setText("FREEZE TRAP");
            adapter.addMessage(new AllConstructionItem(R.drawable.freeze1, R.drawable.freeze2));
            adapter.addMessage(new AllConstructionItem(R.drawable.freeze3, R.drawable.freeze4));
            adapter.addMessage(new AllConstructionItem(R.drawable.freeze5, R.drawable.empty));
        }
        if (imgInt==2) {
            txtName.setText("TURRET");
            adapter.addMessage(new AllConstructionItem(R.drawable.turret1, R.drawable.empty));

        }



        return view;
    }
}
