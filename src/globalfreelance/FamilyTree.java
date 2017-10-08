package globalfreelance;

import java.util.List;
import java.util.Set;

public interface FamilyTree {
    void add(Person self, Integer p1, Integer p2);
    Set getAll();
    Set getDescendants(int nodeNum);
    List getParents(int id);
    Person getPersonById(int id);
    List getPersonsByName(String lastName, String firstName);
    int size();
}
