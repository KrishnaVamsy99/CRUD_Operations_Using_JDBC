import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Delete
{
    public static int deleteTable()
    {
        String dquery = "delete from krishna_table where empid = ?";

        try{
            Connection con = Connectiondb.getConnection();
            PreparedStatement ps = con.prepareStatement(dquery);

            ps.setInt(1, 102);

            int rowsdeleted = ps.executeUpdate();

            if(rowsdeleted > 0){
                return 1;
            }

            
        }catch(SQLException e){
            e.printStackTrace();
        }

        return 0;
    }
    
}
