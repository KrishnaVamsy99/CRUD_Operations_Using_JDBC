import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


class Createdb 
{
    
    public static int createdb()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of your database?");

        String name = scanner.nextLine();

        scanner.close();
        
        final String cquery = "create database "+ name;

        try{
            Connection con = Connectiondb.getConnection();
            PreparedStatement ps = con.prepareStatement(cquery);

            int rows = ps.executeUpdate();
            if(rows > 0){
                return 1;
            }
            else{
                System.out.println("OOPS!!! Try Again");
            }

        }catch(SQLException e){
            e.printStackTrace();      
        }
        return 0;
    }
    
}
