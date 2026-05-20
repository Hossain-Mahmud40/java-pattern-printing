import java.util.Scanner;
public class NumberDiamondPattern{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for(int i=1;i<=(2*n)-1;i++){
    if(i==1 || i==(2*n)-1){
      for(int j=1;j<n;j++){
      System.out.print(" ");
      }
      System.out.print("1");
      for(int j=1;j<n;j++){
      System.out.print(" ");
      }
    }
    else if(i==n){
    for(int j=1;j<=(2*n)-1;j++){
      System.out.print(j);
      }
    }
    else if(i<n){
      for(int j=1; j<= n-i; j++){
      System.out.print(" ");
      }
      for(int j=1; j<=i*2-1;j++){
      System.out.print(j);
      }
      for(int j=1; j<= n-i; j++){
      System.out.print(" ");
      }
      
    }
    else{
      for(int j=1;j<=i-n;j++){
      System.out.print(" ");
      }
      for(int j=1; j<=2*(2*n-i)-1;j++){
      System.out.print(j);
      }
      for(int j=1;j<=i-n;j++){
      System.out.print(" ");
      }
    }
    System.out.println();
  }
  }
}
