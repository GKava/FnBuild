package guide.battleroyale_fortnite.build.buildingguide.ItemExample;

import java.util.ArrayList;
import java.util.List;

public class FortItem {
    private String textName;
    private int imageName;

    public String getTextName() {
        return textName;
    }

    public int getImageName() {
        return imageName;
    }

    public FortItem (String textName, int imageName){
        this.textName = textName;
        this.imageName = imageName;
    }

    public static List<FortItem> getFakeItems(){
        ArrayList<FortItem> itemList = new ArrayList<>();

        //itemList.add(new FortItem("One message", ));
//       itemList.add(new ModelItems("Two message",12));
//       itemList.add(new ModelItems("Three message",11));
        return itemList;
    }
}
