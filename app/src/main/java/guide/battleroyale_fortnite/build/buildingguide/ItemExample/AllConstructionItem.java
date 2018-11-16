package guide.battleroyale_fortnite.build.buildingguide.ItemExample;


import java.util.ArrayList;
import java.util.List;

import guide.battleroyale_fortnite.build.buildingguide.R;


public class AllConstructionItem {
    private int imageName1;
    private int imageName2;

    public AllConstructionItem (int imageName1, int imageName2){
        this.imageName1 = imageName1;
        this.imageName2 = imageName2;
    }

    public void setImageName1(int imageName1) {
        this.imageName1 = imageName1;
    }

    public void setImageName2(int imageName2) {
        this.imageName2 = imageName2;
    }

    public int getImageName1() {

        return imageName1;
    }

    public int getImageName2() {
        return imageName2;
    }

    public static List<AllConstructionItem> getAllItems(){
        ArrayList<AllConstructionItem> itemList = new ArrayList<>();

        itemList.add(new AllConstructionItem(R.drawable.c1, R.drawable.c1_1));
        itemList.add(new AllConstructionItem(R.drawable.c2, R.drawable.c2_1));

        return itemList;
    }
}
