package lec12;

import java.util.*;

public class BFS
{
    static int adj[][] = {
        {0,1,1,0,0,0},
        {1,0,0,1,1,0},
        {1,0,0,0,1,0},
        {0,1,0,0,1,1},
        {0,1,1,1,0,1},
        {0,0,0,1,1,0}
    };
    static int N = 6;
    static Queue<Integer> queue = new LinkedList<Integer>();

    public static boolean bfs(int goal, boolean visited[])
    {
        if(queue.size() == 0)
            return false;
        int current = queue.remove();
        System.out.print(current+" ");
        if(current == goal)
            return true;
        for(int i = 0;i < N;i++)
        {
            if(adj[current][i] == 1 && !visited[i])
            {
                queue.add(i);
                visited[i] = true;
            }
        }
        return bfs(goal, visited);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the source node: ");
        int source = sc.nextInt();
        System.out.print("Enter the goal node: ");
        int goal = sc.nextInt();
        queue.add(source);
        boolean visited[] = new boolean[N];
        visited[source] = true;
        boolean found = bfs(goal, visited);
        if(found)
            System.out.println("Node found");
        else
            System.out.println("Node not found");
    }
}