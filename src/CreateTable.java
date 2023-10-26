import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


class CreateTable
{

    public static int tableCreation()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the table name: ");
        
        String tablename = sc.nextLine();

        sc.close();

        String tquery = "create table " + tablename
        + "(empid integer primary key,"
        + "first varchar(20), "
        + "last varchar(20), " 
        + "age integer)";

        try{
            Connection con = Connectiondb.getConnection();
            Statement stmt = con.createStatement();

            int rows = stmt.executeUpdate(tquery);

            if(rows >= 0){
                return rows;
            }

        }catch(SQLException e){
            e.printStackTrace();;
        }

        return -1;
    }
    
}
