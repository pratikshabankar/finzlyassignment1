
package JDBCHW;

import java.sql.*;

public class JDBCStatement {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn= DriverManager.getConnection( "jdbc:mysql://localhost:3306/ABC","root","root");

        //Create Operation
        Statement createStatement= conn.createStatement();
        String createQuery="Insert into emp(emp_ID,emp_name,emp_salary) VALUES (4,'Ram',70000)";
        int rowAffected=createStatement.executeUpdate(createQuery);

        if(rowAffected>0){
            System.out.println("Record inserted successfully");
        }else{
            System.out.println("Record insertion failed");
        }

        //read data

        Statement readStatement= conn.createStatement();
        ResultSet rs=readStatement.executeQuery("Select * from emp");
        while(rs.next()){
            System.out.println(rs.getInt("emp_id")+" "+rs.getString("emp_name")+" "+rs.getString("emp_salary"));
        }

        //update data
        Statement updateStatement=conn.createStatement();
        String updateQuery="UPDATE emp SET emp_salary=30000 WHERE emp_id=4";
        rowAffected=updateStatement.executeUpdate(updateQuery);
        if(rowAffected>0){
            System.out.println("Record inserted successfully");
        }else{
            System.out.println("Record insertion failed");
        }
        while(rs.next()){
            System.out.println(rs.getInt("emp_id")+" "+rs.getString("emp_name")+" "+rs.getString("emp_salary"));
        }

        //Delete
        Statement deleteStatement=conn.createStatement();
        String deleteQuery="DELETE FROM emp where emp_id=4";
        rowAffected=deleteStatement.executeUpdate(deleteQuery);
        if(rowAffected>0){
            System.out.println("Record deleted  successfully");
        }else{
            System.out.println("Record deletion failed");
        }



    }
}