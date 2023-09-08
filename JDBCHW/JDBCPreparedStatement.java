
package JDBCHW;

        import java.sql.*;

public class JDBCPreparedStatement {
    public static void main(String[] args) throws SQLException {
        Connection conn= DriverManager.getConnection( "jdbc:mysql://localhost:3306/StaffDetails","root","root");

        //Create Operation
        String createQuery="Insert into student(student_id,student_name,studenet_age) VALUES (?,?,?)";
        PreparedStatement createStatement=conn.prepareStatement(createQuery);
        createStatement.setInt(1,2);
        createStatement.setString(2,"Sham");
        createStatement.setInt(3,6);
        int rowAffected=createStatement.executeUpdate();

        if(rowAffected>0){
            System.out.println("Record inserted successfully");
        }else{
            System.out.println("Record insertion failed");
        }

        //  read data

        String readQuery="Select * from student";
        PreparedStatement readStatement=conn.prepareStatement(readQuery);
        ResultSet rs=readStatement.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt("student_id")+" "+rs.getString("student_name")+" "+rs.getString("studenet_age"));
        }
//
        //update data
        String updateQuery="UPDATE student SET studenet_age = ? WHERE student_id= ?";
        PreparedStatement updateStatement= conn.prepareStatement(updateQuery);
        updateStatement.setInt(1,4);
        updateStatement.setInt(2,2);
        rowAffected=updateStatement.executeUpdate(updateQuery);
        if(rowAffected>0){
            System.out.println("Record Updated  successfully");
        }else{
            System.out.println("Record updation failed");
        }

//
//        //Delete
        String deleteQuery = "DELETE FROM student WHERE student_id = ?";
        PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);
        deleteStatement.setInt(1, 2);
        int rowsAffected = deleteStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Record deleted successfully.");
        } else {
            System.out.println("Record deletion failed.");
        }



    }
}
