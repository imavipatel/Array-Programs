//WAP in java to define a method to reverse the element row wise in the matrix.
import java.util.Scanner;
public class ReverseElementRowwiseInMatrix{
  public static void main(String[] args) {
    int mat[][] = readMatrix();
    System.out.println("The User Entered Matrix is  : ");
    displayMatrix(mat);
    reverseElementRowwiseInMatrix(mat);
    System.out.println("After reversing rowwise the final matrix is : ");
    displayMatrix(mat);
  }
  public static int[][] readMatrix()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows you want : ");
    int r = sc.nextInt();
    System.out.println("Enter the number of column you want : ");
    int c = sc.nextInt();
    int mat[][] = new int[r][c];
    System.out.println("Enter the "+r*c+" elements row wise : ");
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
    //System.out.println("The User Entered Matrix is  : ");
    for(int i=0;i<mat.length;i++)
    {
      for(int j=0;j<mat[i].length;j++)
      {
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void reverseElementRowwiseInMatrix(int mat[][])
  {
    for(int i=0;i<mat.length;i++)
    {
      for(int j=0;j<mat[i].length/2;j++)
      {
        int temp = mat[i][j];
        mat[i][j] = mat[i][mat[i].length-j-1];
        mat[i][mat[i].length-j-1] = temp;
      }
    }
  }
}
