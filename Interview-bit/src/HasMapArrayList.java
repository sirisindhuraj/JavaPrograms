import java.util.ArrayList;
import java.util.HashMap;
public class HasMapArrayList {
    public static void main(String ar[]){
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("BMW");
        count(cars);
    }
    public static void count(ArrayList<String> cars){
        HashMap<String,Integer> counting= new  HashMap<String,Integer>();
        for(String igs:cars){
            if(counting.containsKey(igs)){
                counting.put(igs,counting.get(igs)+1);
            }
            else{
                counting.put(igs,1);
            }
        }
        System.out.println(counting);
    }
}
