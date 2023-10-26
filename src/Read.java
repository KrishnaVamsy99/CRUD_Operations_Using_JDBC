import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Read 
{
    public static ResultSet readTableData()
    {
        String rquery = "select * from krishna_table";
        ResultSet rs = null;

        try{
            Connection con = Connectiondb.getConnection();
            PreparedStatement ps = con.prepareStatement(rquery);

            rs = ps.executeQuery();

            if(rs!=null){
                return rs;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return rs;
    }
    
}
