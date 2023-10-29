import java.util.ArrayList;

class Graph{
    int[][] matrix;
    ArrayList<Node> node;
    Graph(int size){
        node=new ArrayList<>();
        matrix=new int[size][size];
    }
    public void addNode(Node nodes){
        node.add(nodes);
    }
    public void addEdge(int src,int Des){
        matrix[src][Des]=1;
    }
    public boolean Checkedge(int src,int des){
        if (matrix[src][des]==1){
            return true;
        }else{ return false;}
    }
    public void print(){
        System.out.print("  ");
        for (Node x:node){
            System.out.print(x.data+" ");
        }
        System.out.println();
        for (int i=0;i< matrix.length;i++){
            System.out.print(node.get(i).data+" ");
            for (int j=0;j< matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void depthFirstSearch(int src) {
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);
    }
    private void dFSHelper(int src, boolean[] visited) {

        if(visited[src]) {
            return;
        }
        else {
            visited[src] = true;
            System.out.println(node.get(src).data + " = visited");
        }

        for(int i = 0; i < matrix[src].length; i++) {
            if(matrix[src][i] == 1) {
                dFSHelper(i, visited);
            }
        }
        return;
    }
}

class Node{
    char data;
    Node(char data){
        this.data=data;
    }
}
public class DepthFirstSearch{
    public static void main(String[] args) {
        Graph graph=new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,1);
        graph.addEdge(2,3);
        graph.addEdge(3,1);
        graph.addEdge(3,4);
        graph.addEdge(4,2);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));
        /*graph.print();*/
        graph.depthFirstSearch(0);
    }
}
