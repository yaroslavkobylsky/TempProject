package globalfreelance;

import java.util.*;
import java.util.stream.Collectors;

public class FamilyTreeImpl implements FamilyTree {
    private static int id = 1;
    private Node firstRootNode = new Node();
    private Node secondRootNode = new Node();
    private Set<Node> nodes = new HashSet<>();

    public FamilyTreeImpl() {
    }

    public FamilyTreeImpl(Person firstRootNode, Person secondRootNode) {
        this.firstRootNode = new Node(0, firstRootNode);
        this.secondRootNode = new Node(0, secondRootNode);
    }

    @Override
    public void add(Person self, Integer p1, Integer p2) {
        Node node = new Node(id, self);
        id++;
        if (p1 != null){
            node.setFirstParent(getNodeById(p1));
        }
        if (p2 != null){
            node.setSecondParent(getNodeById(p1));
        }
        nodes.add(node);
    }

    private Node getNodeById(int id){
        return nodes.stream()
                .filter(node -> node.getId() == id)
                .findFirst()
                .get();
    }

    @Override
    public Set getAll() {
        return nodes;
    }

    @Override
    public Set<Person> getDescendants(int nodeNum) {
        Queue<Node> nodeQueue = new ArrayDeque<>();
        Set<Node> result = Collections.EMPTY_SET;
        nodeQueue.add(getNodeById(nodeNum));

        while(nodeQueue.size()>0){
            Node poll = nodeQueue.poll();
            result.add(poll);
            nodes.stream().filter(node -> node.getFirstParent().equals(poll) || node.getSecondParent().equals(node))
                    .forEach(node -> nodeQueue.add(node));
        }
        return result.stream().map(node -> node.getSelf())
                .collect(Collectors.toSet());
    }

    @Override
    public List<Person> getParents(int id) {
        List<Person> parents = Collections.emptyList();
        Node node = getNodeById(id);
        if (node.getFirstParent() != null){
            parents.add(node.getFirstParent().getSelf());
        }
        if (node.getSecondParent() != null){
            parents.add(node.getSecondParent().getSelf());
        }
        return parents;
    }

    @Override
    public Person getPersonById(int id) {
        return nodes.stream()
                .filter(node -> node.getId() == id)
                .findFirst()
                .get()
                .getSelf();
    }

    @Override
    public List<Person> getPersonsByName(String lastName, String firstName) {
        return nodes.stream()
                .filter(node -> node.getSelf().getFirstName().equals(firstName)
                        && node.getSelf().getLastName().equals(lastName))
                .map(node -> node.getSelf())
                .collect(Collectors.toList());
    }

    @Override
    public int size() {
        return nodes.size();
    }
}
