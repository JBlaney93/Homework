package behaviours;

import people.Visitor;

public interface ISecurity {
    public boolean isAllowedToVisit(Visitor visitor);
}
