import java.util.*;

public class Classroom {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    
    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0); //source = 0
    }

    public static void main(String[] args) {
        int V=5;
        //int arr[] = new arr[V];
        ArrayList<Edge>[] graph = new ArrayList[V]; //its null currently

        for(int i=0 ; i<V ; i++){
            graph[i] = new ArrayList<Edge>(); //assign new empty arrayList in prev arraylst
        }

        //0th - vertex
        graph[0].add(new Edge(0, 1, 5)); //add new Edge to the list on 0th element of graph

        //1 vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //2 vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        //3 vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        //4 vertex
        graph[4].add(new Edge(4, 2, 2));

        //2nd vertex's neighbours:
        for(int i =0 ; i<graph[2].size() ; i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }

 
    }
}
