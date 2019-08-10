/*
WAP to display the matrix element in the clockwise spiral order.
1 2 3
4 5 6
7 8 9

To

1 2 3 6 9 8 7 4 5
*/
import java.util.Scanner;
public class MatrixInClockwiseSpiralOrder{
  public static void main(String[] args) {
    int mat[][] = readMatrix();
    System.out.println("The user Entered matrix is : ");
    displayMatrix(mat);
    System.out.println("The clockwise spiral order is : ");
    displaySpiral(mat);

  }
  public static int[][] readMatrix()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows you want : ");
    int r = sc.nextInt();
    System.out.println("Enter the number of column you want : ");
    int c = sc.nextInt();
    int mat[][] = new int[r][c];
    System.out.println("Enter the "+r*c+" elements rowwise : ");
    for(int i=0;i<mat.length;i++)
    {
      for(int j=0;j<mat[i].length;j++)
      {
        mat[i][j] = sc.nextInt();
      }
    }
    return mat;
  }
  public static void displayMatrix(int mat[][])
  {
    for(int i=0;i<mat.length;i++)
    {
      for(int j=0;j<mat[i].length;j++)
      {
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void displaySpiral(int mat[][])
  {
    int n = mat.length;
    for(int i=0,j=n-1;i<j;i++,j--)
    {
      for(int k=i;k<j;k++)
      System.out.print(mat[i][k]+" ");
      for(int k=i;k<j;k++)
      System.out.print(mat[k][j]+" ");
      for(int k=j;k>i;k--)
      System.out.print(mat[j][k]+" ");
      for(int k=j;k>i;k--)
      System.out.print(mat[k][i]+" ");
    }
    if(n%2!=0)
    System.out.print(mat[n/2][n/2]+" ");
  }
}
