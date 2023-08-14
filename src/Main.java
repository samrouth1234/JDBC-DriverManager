import Modle.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // how to connection database using DriverManager
    public static void main(String[] args) {

        //String url ="jdbc:postgresql://localhost:5432/NameDatabase";
        String url ="jdbc:postgresql://localhost:5432/postgres";
        // username Postgresql (postgres)
        String username="postgres";
        String password="samrouth020320";
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            // print merl schema
            System.out.println(con.getSchema());
            // 1. Create statement SQL
            String selectSql ="SELECT * FROM student";
            PreparedStatement statement = con.prepareStatement(selectSql);
            // 2. Execute SQL statement
            ResultSet resultSet =statement.executeQuery();
            // 3.Process Result with ResultSet
            List <Student> students = new ArrayList<>();
            while (resultSet.next()){
                // create object of Student
                Integer id    = resultSet.getInt("id");
                String name   = resultSet.getString("name");
                String sex    = resultSet.getString("sex");
                String object = resultSet.getString("object");
                students.add(new Student(id,name,sex,object));
            }
            //
            students.stream().forEach(System.out::println);

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}