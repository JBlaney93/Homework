import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark implements IReviewed {

    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    ArrayList<IReviewed> allReviewed;

    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }


    @Override
    public int getRating() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewedItems = new ArrayList<>();
        reviewedItems.addAll(this.attractions);
        reviewedItems.addAll(this.stalls);
        return reviewedItems;
    }

    public void addAttractionToList(Attraction attraction) {
        attractions.add(attraction);
    }
}
