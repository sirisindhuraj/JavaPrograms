import java.util.ArrayList;
public class ValuesCountColFrame {
    public static void main(String ar[]){
            ArrayList<String> cars= new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            cars.add("BMW");
        count(cars);
    }
    public static void count (ArrayList<String> cars) {
        String[] unique = new String[cars.size()];
        int[] c = new int[cars.size()];
        int uc = 0;
        for (String ig : cars) {
            int i=findindexs(unique,ig,uc);
            if (i != -1) {
                c[i]++;
            } else {
                unique[uc] =ig;
                c[uc]=1;
                uc++;
            }
        }
        System.out.println("counting");
        for(int j=0;j<uc;j++){
            System.out.println(unique[j]+"="+c[j]);
        }
    }
    public static int findindexs(String[] s,String value,int len){
        for(int i=0;i<len;i++){
            if(s[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
}
