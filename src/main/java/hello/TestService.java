package hello;
import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.Scanner;

@Service
public class TestService {
    public String getdata(int a1){

        String a="";
        String b="";
        String c="";
        String d="";
        String e1="";
        try {


        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/naren", "root", "ihatepiyu");
        Statement st = conn.createStatement();
        ResultSet rs=st.executeQuery("select * from plash where pid="+a1+";");
        while(rs.next())
        {
            a=Integer.toString(rs.getInt(1));
            b=rs.getString(2);
            c=rs.getString(3);
            d=rs.getString(4);
            e1+=a+"\t\t\t"+b+"\t\t\t"+c+"\t\t\t"+d+"\n";

        }

        }
    catch (Exception e)
    {
        e.printStackTrace();
    }

    return (e1);
    }




    public String postdata(String a,String b,String c) {
        int i = (int) new Date().getTime();

        try {


            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/naren", "root", "ihatepiyu");

            Statement st = conn.createStatement();
            st.executeUpdate("insert into plash values(" + i + ",'" + a + "','"+b+"','"+c+"');");


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        String q1=Integer.toString(i);
        return (" the data was successfully created and the attributes are:   "+q1+"   "+a+"   "+b+"   "+c);

    }



    public String putdata(String a,String b,String c) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/naren", "root", "ihatepiyu");

            Statement st = conn.createStatement();
            st.executeUpdate("update plash set fname='"+a+"',lname='"+b+"',email='"+c+"' where pid=121;");


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return (" The records were successfully updated by a condition");

    }
    public String deletedata(int a) {

        try {


            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/naren", "root", "ihatepiyu");

            Statement st = conn.createStatement();
            st.executeUpdate("DELETE FROM plash where pid="+a+";");


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return (" The record with id=" + a + "was succesfully deleted ");

    }


}

