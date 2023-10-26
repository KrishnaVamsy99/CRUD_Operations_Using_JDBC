import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Scanner;

class Insert 
{
    public static int Inserttable()
    {


        String iquery = "INSERT INTO krishna_table VALUES(103, 'Sumit', 'Mittal', 28)";

        try{

            Connection con = Connectiondb.getConnection();
            Statement ps = con.createStatement();

            int r = ps.executeUpdate(iquery);

            if(r>0){
                return 1;
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        return 0;
    }
    
}
