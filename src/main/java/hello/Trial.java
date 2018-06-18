package hello;
import java.sql.*;
import java.util.*;
public class Trial {

    public String getdata() {
        {
            ResultSet rs;
            Scanner sc = new Scanner(System.in);
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/naren", "root", "ihatepiyu");
 /*   System.out.println("connection established");
    System.out.println("enter name");*/
                String n = sc.next();
                /*  System.out.println("enter number");*/
                int p = sc.nextInt();
                Statement st = conn.createStatement();
                st.executeUpdate("insert into troll values(" + p + ",'" + n + "');");
                /*  System.out.println("succesfully added");*/


            } catch (Exception e) {
                e.printStackTrace();
            }


        }

        return " hello";
    }

}
