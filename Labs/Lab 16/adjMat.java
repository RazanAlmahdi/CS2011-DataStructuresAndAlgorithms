package lec16;

import java.util.Scanner;

public class adjMat {
	
	public static void main(String[] args)
	{
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter number of vertices: ");
	int n = sc.nextInt();
	System.out.print("Enter the number of edges : ");
	int m = sc.nextInt();
	
	int [][] adjMatrix = new int [n+1][n+1];
	
	for (int i=1; i< n+1; i++)
	{
		System.out.print("Enter first vertix: ");
		int u = sc.nextInt();
		System.out.print("Enter second edge: ");
		int v = sc.nextInt();
		
		adjMatrix[u][v] = 1;
		adjMatrix[v][u] = 1;
	}

for (int i =1; i < n+1; i++)
{
	for(int j=1; j<n+1; j++)
		System.out.print(adjMatrix[i][j] + " ");
	System.out.println();
}

System.out.println("\n Print the elements as adjacent list: ");

for (int i=1; i<n+1; i++)
{
	System.out.print(i + ": ");
	for(int j= 1; j < n+1; j++)
		if(adjMatrix[i][j] ==1)
			System.out.print(j + ", ");
	System.out.println();
			}
		}
	}



