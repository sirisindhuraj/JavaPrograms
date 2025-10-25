
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CodeForces{
    public static void main(String[] args) {
//create();
//createDynamicValues(6, "Iga", "Swiatek");

////createDynamicValues(6, "Iga", "');(DELETE FROM STUDENT WHERE ID=5)");

//createWithPreparedStatement(7, "Venus", "Williams");
        select();
    }
    private static void select() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
            String sql="select * from student";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }

            rs.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private static void create() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
            String sql = "insert into student values(5,'Serena','Williams')";
            Statement stmt = con.createStatement();
            int noOfRows = stmt.executeUpdate(sql);

            System.out.println("No of Rows Inserted: "+noOfRows);
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private static void createDynamicValues(int id, String firstName, String lastName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
            String sql = "insert into student values("+id+",'"+firstName+"','"+lastName+"'"+")";
            Statement stmt = con.createStatement();
            int noOfRows = stmt.executeUpdate(sql);

            System.out.println("No of Rows Inserted: "+noOfRows);
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void createWithPreparedStatement(int id, String firstName, String lastName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
            String sql = "insert into student values(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, firstName);
            stmt.setString(3, lastName);
            int noOfRows = stmt.executeUpdate();
            System.out.println("No of Rows Inserted: "+noOfRows);
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}