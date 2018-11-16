package guide.battleroyale_fortnite.build.buildingguide.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.ImageView;
import guide.battleroyale_fortnite.build.buildingguide.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FortContainerFragment extends Fragment {
    private ImageView img1,img2;
    int imgInt;

    public FortContainerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fort_container, container, false);

        Bundle b = this.getArguments();
        imgInt = b.getInt("key", -1);

        img1 = view.findViewById(R.id.img1);
        img2 = view.findViewById(R.id.img2);

        if (imgInt==1) {
            img1.setImageDrawable(view.getResources().getDrawable(R.drawable.c1));
            img2.setImageDrawable(view.getResources().getDrawable(R.drawable.c1));
        }
        if (imgInt==2){
            img1.setImageDrawable(view.getResources().getDrawable(R.drawable.c1_1));
            img2.setImageDrawable(view.getResources().getDrawable(R.drawable.c1_1));
        }

        return view;
    }
}
