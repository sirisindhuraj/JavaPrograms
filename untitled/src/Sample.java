import java.io.*;
class emp implements Serializable{
    String name;
    int rollno;
    emp(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
}
public class Sample {
    public static void main(String ars[]){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"));
            oos.writeObject(new emp("Alice", 25));
            oos.close();
            // Deserialization
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.ser"));
            emp p = (emp) ois.readObject();
            ois.close();
            System.out.println("Name: " + p.name + ", Age: " + p.rollno);
        }
        catch(Exception e){
            System.out.println((e));
        }
    }
}
