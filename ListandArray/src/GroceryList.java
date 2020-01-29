import java.lang.reflect.Array;
import java.util.ArrayList;

public class GroceryList {

    private int[] mynumbers;
    private ArrayList<String> grceryList= new ArrayList<String>();

    public void addGroceryItem(String item){
        grceryList.add(item);

    }

    public void printGroceryList() {
        System.out.println("Your Have" + grceryList.size() + "item in your grocery list");
        for (int i = 0; i < grceryList.size(); i++) {
            System.out.println((i + 1) + "." + grceryList.get(i));
        }
    }

    public void modifiedgrocerylist(String newItem) {
        int position = Finditem(newItem);
        if (position >= 0) {
            modifiedgrocrtylist(position, newItem);
        }

    }

    public void modifiedgrocrtylist(int position, String newitem) {
        grceryList.set(position, newitem);
        System.out.println("GroceryItem" + (position + 1) + "has been modified ");

    }

    public void removeItem(String item) {
        int position = Finditem(item);
        if (position >= 0) {
            modifiedgrocrtylist(position, item);
        }

    }

    public void removeItem(int position) {
        String theitem = grceryList.get(position);
        grceryList.remove(position);
    }

    public int Finditem(String searchItem) {
        return grceryList.indexOf(searchItem);

    }


}
