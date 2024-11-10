import java.util.Scanner;
public class ValuesCount {
    public static void main(String arg[]) {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("enter the no of strings to insert");
      n=sc.nextInt();
      sc.nextLine();
      String[] strings=new String[n];
        System.out.println("enter the string values");
      for(int i=0;i<n;i++){
          strings[i]=sc.nextLine();
      }
      count(strings);
      sc.close();
    }
    public static void count(String[] strings) {
        String[] unique = new String[strings.length];
        int[] count = new int[strings.length];
        int uc = 0;
        for (String ignored : strings) {
            int i = findindex(unique,ignored, uc);
            if (i != -1) {
                count[i]++;
            } else {
                uniqugit e[uc] = ignored;
                count[uc] = 1;
                uc++;
            }
        }
        System.out.println("Counting");
            for (int j = 0; j < uc; j++) {
                System.out.println(unique[j] + "-" + count[j]);
            }
    }
        public static int findindex(String[] s,String value,int len){
            for(int i=0;i<len;i++){
                if(s[i].equals(value)){
                    return i;
                }
            }
            return -1;
        }
}