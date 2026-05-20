import java.util.Scanner;

public class DiamondStarPattern {
  public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); for(int i=1;i<=2*n-1;i++){ int row; if(i<=n){ row=i; } else{ row=2*n-i; } for(int j=1;j<=n-row;j++){ System.out.print(" "); } for(int j=1;j<=2*row-1;j++){ System.out.print("*"); } System.out.println(); } }
}
