import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Update 
{
    public static int updateTable()
    {
        String uquery = "update krishna_table set last=? where empid=100";

        try{
            Connection con = Connectiondb.getConnection();
            PreparedStatement ps = con.prepareStatement(uquery);

            ps.setString(1, "lakshmi");

            int rowsupdated = ps.executeUpdate();
            if(rowsupdated > 0){
                return 1;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
    
}
