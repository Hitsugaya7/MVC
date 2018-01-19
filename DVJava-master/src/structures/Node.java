package structures;

import java.util.ArrayList;

public class Node {
    public float x;
    public float y;
    public int index;
    public int dist;
    public boolean out;
    public boolean in;
    public ArrayList<Integer> prev;
    public ArrayList<Edge> edges;
    public Node(int index){
        this.index=index; prev = new ArrayList<>(); edges = new ArrayList<Edge>();
    }
}
