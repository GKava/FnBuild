package guide.battleroyale_fortnite.build.buildingguide.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.bumptech.glide.Glide;

import java.util.ArrayList;

import guide.battleroyale_fortnite.build.buildingguide.ItemExample.AllConstructionItem;
import guide.battleroyale_fortnite.build.buildingguide.R;

public class TwoImageAdapter extends RecyclerView.Adapter<TwoImageAdapter.ViewHolder>  {

    private ArrayList<AllConstructionItem> items = new ArrayList<AllConstructionItem>();
    private static final String TAG = "MY LOG ADAPTER ";
    private int width;
    Context context;

    public TwoImageAdapter(int width) {
        super();
        this.width = width;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onBindViewHolder(@NonNull TwoImageAdapter.ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder");
        final int pos = position;
        final AllConstructionItem item = items.get(position);

//        holder.imageName1.setImageResource(item.getImageName1());
//        holder.imageName2.setImageResource(item.getImageName2());

        Glide.with(holder.itemView.getContext()).load(item.getImageName1())
                .thumbnail(0.5f)
                .into(holder.imageName1);

        Glide.with(holder.itemView.getContext()).load(item.getImageName2())
                .thumbnail(0.5f)
                .into(holder.imageName2);
    }

    @NonNull
    @Override
    public TwoImageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_all_construction, parent, false);

        RecyclerView.LayoutParams lp = (RecyclerView.LayoutParams) view.getLayoutParams();
        lp.height = width;
        view.setLayoutParams(lp);

        return new TwoImageAdapter.ViewHolder(view);
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
       ImageView imageName1;
       ImageView imageName2;


        public ViewHolder(View itemView) {
            super(itemView);
            imageName1 =(ImageView) itemView.findViewById(R.id.imageName1);
            imageName2 =(ImageView) itemView.findViewById(R.id.imageName2);
        }

        public void bind(AllConstructionItem allConstructionItem) {
            Log.d(TAG, "bind");
            imageName1.setImageResource(allConstructionItem.getImageName1());
            imageName2.setImageResource(allConstructionItem.getImageName2());
        }
    }

    public  void addMessage(AllConstructionItem item) {
        Log.d(TAG, "addMessage");
        items.add(item);
        notifyItemChanged(items.size() - 1);
    }

}
