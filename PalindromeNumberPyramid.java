import java.util.Scanner;
public class PalindromeNumberPyramid{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for(int i=1;i<=n;i++){
    if(i==1){
    for(int j=1;j<=n-1;j++){
      System.out.print(" ");
    }
    System.out.print("1");
    for(int j=1;j<=n-1;j++){
      System.out.print(" ");
    }
    }
    else if(i==n){
      for(int j=1;j<=n-1;j++){
      System.out.print(j);
      }
      System.out.print(n);
      for(int j=n-1;j>=1;j--){
      System.out.print(j);
      }
    }
    else{
    for(int j=1;j<=n-i;j++){
      System.out.print(" ");
    }
    
    for(int j=1;j<i;j++){
    System.out.print(j);
    }
    System.out.print(i);
    for(int j=i-1;j>=1;j--){
    System.out.print(j);
    }
    
    
    for(int j=1;j<=n-i;j++){
      System.out.print(" ");
    }
    }
    System.out.println();
  }
  }
}
