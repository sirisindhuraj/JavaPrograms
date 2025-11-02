import java.util.*;
public class Rasikhbox{
  public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    char[][] arr=new char[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        arr[i][j]=sc.next().charAt(0);
      }
    }
    sc.nextLine();
    int t=sc.nextInt();
    arr=gravity(arr);
    while(t!=0){
      t--;
      String k=sc.next().trim().toLowerCase();
      if(k.equals("left")){
        arr=leftrot(arr);
      }
      else if(k.equals("right")){
        arr=rightrot(arr);
      }
      arr=gravity(arr);
    }
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static char[][] gravity(char[][] arr){
    int m = arr.length;       
    int n = arr[0].length;
    for(int j=0;j<n;j++){
      int h=m-1;
      for(int i=m-1;i>=0;i--){
        if(arr[i][j]=='*'){
          arr[i][j]='.';
          arr[h][j]='*';
          h--;
        }
      }
      while(h>=0){
        arr[h][j]='.';
        h--;
      }
    }
    return arr;
  }
  public static char[][] leftrot(char[][] arr){
    int m = arr.length;       
    int n = arr[0].length;
    char[][] crr=new char[n][m];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        crr[n-j-1][i]=arr[i][j];
      }
    }
    return crr;
  }
  public static char[][] rightrot(char[][] arr){
    int m = arr.length;       
    int n = arr[0].length;
    char[][] brr=new char[n][m];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        brr[j][m-1-i]=arr[i][j];
      }
    }
    return brr;
  }
}