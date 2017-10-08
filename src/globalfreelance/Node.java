package globalfreelance;

import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node> {
    private int id;
    private Person self;
    private Node firstParent;
    private Node secondParent;
    private List<Node> child = new ArrayList<>();

    public Node() {
    }

    public Node(int id, Person self) {
        this.id = id;
        this.self = self;
    }

    public Node(int id, Person self, Node firstParent, Node secondParent) {
        this.id = id;
        this.self = self;
        this.firstParent = firstParent;
        this.secondParent = secondParent;
    }

    @Override
    public int compareTo(Node o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Node{id: " + id + " " + self.toString() + "}";
    }

    @Override
    public int hashCode() {
        return self.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node){
            if (obj == this){
                return true;
            }
            else {
                return self.equals(((Node) obj).getSelf());
            }
        }
        else{
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getSelf() {
        return self;
    }

    public void setSelf(Person self) {
        this.self = self;
    }

    public Node getFirstParent() {
        return firstParent;
    }

    public void setFirstParent(Node firstParent) {
        this.firstParent = firstParent;
    }

    public Node getSecondParent() {
        return secondParent;
    }

    public void setSecondParent(Node secondParent) {
        this.secondParent = secondParent;
    }

    public List<Node> getChild() {
        return child;
    }

    public void setChild(List<Node> child) {
        this.child = child;
    }
}
