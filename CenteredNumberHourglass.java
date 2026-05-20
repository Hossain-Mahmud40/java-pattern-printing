import java.util.Scanner;
public class CenteredNumberHourglass{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for(int i=1;i<=n;i++){
    int row;
    if(i<=(n/2)+1){
     row = i;
    }
    else{
     row = n-i+1;
    }
    for(int j=1;j<=row-1;j++){
    System.out.print(" ");
    }
    for(int j=1; j<=n-2*(row-1) ;j++){
    System.out.print(j);
    }
    
    System.out.println();
  }
  }
}
