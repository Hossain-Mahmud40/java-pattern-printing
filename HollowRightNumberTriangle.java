import java.util.Scanner;
public class HollowRightNumberTriangle{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for(int i=1;i<=n;i++){
    if(i == 1){
      for(int j=1;j<=n-i;j++){
      System.out.print(" ");
      }
      System.out.print(n);
    }
    else if(i==n){
    for(int j=1;j<=n;j++){
      System.out.print(j);
      }
    }
    else{
    for(int j=1;j<=n-i;j++){
      System.out.print(" ");
      }
      System.out.print(n-i+1);
      for(int k=1;k<=i-2;k++){
      System.out.print(" ");
      }
      System.out.print(n);
    }
    System.out.println();
  }
  }
}
