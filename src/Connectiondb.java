import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.SQLException;

class Connectiondb{
    
    // Initializing variables
    static final String url = "jdbc:mysql://localhost:3306/krishna";
    static final String user = "root";
    static final String passwd = "9566251124.sS";
    //static final String query = "select * from student";

    // Declaring Connection Method
    public static Connection getConnection(){
        //Connection con = null;

        try{
            Connection conn = DriverManager.getConnection(url, user, passwd);

            return conn;

        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }


}