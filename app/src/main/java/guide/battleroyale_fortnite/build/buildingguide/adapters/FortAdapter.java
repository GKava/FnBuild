package guide.battleroyale_fortnite.build.buildingguide.adapters;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import bar.appbarbottom.appbarbottom.ItemExample.FortItem;
import guide.battleroyale_fortnite.build.buildingguide.Fragment.FortContainerFragment;
import guide.battleroyale_fortnite.build.buildingguide.MainActivity;
import guide.battleroyale_fortnite.build.buildingguide.R;


public class FortAdapter extends RecyclerView.Adapter<FortAdapter.ViewHolder>   {

    private ArrayList<FortItem> items = new ArrayList<>();
    private static final String TAG = "MY LOG ADAPTER ";


    @Override
    public int getItemCount() {
        return items.size();
    }


    public void putInFortContainer(int arg){
        Fragment fr = new FortContainerFragment();
        Bundle args = new Bundle();
        args.putInt("key", arg);
        fr.setArguments(args);

    }

    @Override
    public void onBindViewHolder(@NonNull FortAdapter.ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder");
        final int pos = position;
        final FortItem item = items.get(position);
        holder.textName.setText(item.getTextName());
        holder.imageName.setImageResource(item.getImageName());


        holder.mItemCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pos==1){

                    putInFortContainer(1);

                    MainActivity.fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, new FortContainerFragment())
                            .addToBackStack(null)
                            .commit();
                }
                if (pos==2){
                    putInFortContainer(2);
                    MainActivity.fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, new FortContainerFragment())
                            .addToBackStack(null)
                            .commit();
                }

                Toast.makeText(view.getContext(), item.getTextName()+ " Pos = " + pos, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder");
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new ViewHolder(view);
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textName;
        private ImageView imageName;
        private CardView mItemCard;


        public ViewHolder(View itemView) {
            super(itemView);
            textName = (TextView) itemView.findViewById(R.id.textName);
            imageName =(ImageView) itemView.findViewById(R.id.imageName);
            mItemCard = (CardView) itemView.findViewById(R.id.mItemCard);

        }
        // установка теста, картинки внутрь
        public void bind(FortItem fortItem) {
            Log.d(TAG, "bind");
            textName.setText(fortItem.getTextName());
            imageName.setImageResource(fortItem.getImageName());
        }
    }

    public  void addMessage(FortItem item) {
        Log.d(TAG, "addMessage");
        items.add(item);
        notifyItemChanged(items.size() - 1);
    }

    public  void deleteMessage() {
        Log.d(TAG, "deleteMessage");
        int pos = getItemCount();
        if (pos > 0) {
            for (int i = 0; i < pos; i++) {
                this.items.remove(0);
            }
            this.notifyItemRangeRemoved(0, pos);
        }
    }
}
