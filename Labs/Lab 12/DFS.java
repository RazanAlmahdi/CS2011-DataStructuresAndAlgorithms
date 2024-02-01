package lec12;
import java.util.*;

public class DFS
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
    static Vector<Integer> path = new Vector<Integer>();

    public static int dfs(int current, int goal, boolean visited[])
    {
        visited[current] = true;
        if(current == goal)
        {
            path.add(current);
            return goal;
        }
        for(int i = 0;i < N;i++)
        {
            if(adj[current][i] == 1 && !visited[i])
            {
                int found = dfs(i, goal, visited);
                if(found != -1)
                {
                    path.add(current);
                    return current;
                }
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean visited[] = new boolean[N];
        
        System.out.print("Enter the source node: ");
        int source = sc.nextInt();
        System.out.print("Enter the goal node: ");
        int goal = sc.nextInt();
        int found = dfs(source, goal, visited);

        if(found == -1)
            System.out.println("Goal node not found.");
        else
        {
            System.out.print("Path: ");
            for(int i = path.size()-1;i > 0;i--)
                System.out.print(path.get(i)+"-->");
            System.out.println(path.get(0));
        }
    }
}