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

import java.util.ArrayList;
import guide.battleroyale_fortnite.build.buildingguide.Fragment.Trap.TrapContent;
import guide.battleroyale_fortnite.build.buildingguide.ItemExample.FortItem;
import guide.battleroyale_fortnite.build.buildingguide.MainActivity;
import guide.battleroyale_fortnite.build.buildingguide.R;


public class TrapAdapter extends RecyclerView.Adapter<TrapAdapter.ViewHolder>   {

    private ArrayList<FortItem> items = new ArrayList<>();
    private static final String TAG = "MY LOG ADAPTER ";

    @Override
    public int getItemCount() {
        return items.size();
    }


    @Override
    public void onBindViewHolder(@NonNull TrapAdapter.ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder");
        final int pos = position;
        final FortItem item = items.get(position);
        holder.textName.setText(item.getTextName());
        holder.imageName.setImageResource(item.getImageName());
        holder.mItemCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Fragment fr = new TrapContent();
                    Bundle args = new Bundle();
                    args.putInt("img_int_trap", pos);
                    fr.setArguments(args);
                    MainActivity.fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, fr)
                            .addToBackStack(null)
                            .commit();
            }
        });

    }

    @NonNull
    @Override
    public TrapAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder");
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_fort_menu, parent, false);
        return new TrapAdapter.ViewHolder(view);
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
