//import java.sql.ResultSet;

public class App {
    public static void main(String[] args) throws Exception
    {
        

        // Code for creation of database

        /*int rowsaffected = Createdb.createdb();

        if(rowsaffected > 0){
            System.out.println("Successfully Created Data Base Connection.");
        }
        else{
            System.out.println("OOPS!!! Please Try Again.");
        }*/

        // creation of table

        /*int rows = CreateTable.tableCreation();
        
        if(rows >= 0){
            System.out.println("Table Created Successfully");
        }else{
            System.out.println("OOPS!!! Table Creation Failed.");
        }*/

        // inserting into table

        /*int rows = Insert.Inserttable();

        if(rows > 0){
            System.out.println("inserted rows Successfully");
        }else{
            System.out.println("OOPS!!! Insertion Failed");
        }*/

        /*int rowsupdated = Update.updateTable();
        
        if(rowsupdated > 0){
            System.out.println("Rows Updated Successfully");
        }
        else{
            System.out.println("OOPS!!! Please Try Again.");
        }*/

        /*int rowsdeleted = Delete.deleteTable();

        if(rowsdeleted > 0){
            System.out.println("Rows Deleted Successfully");
        }
        else{
            System.out.println("OOPS!!! Hey, The Record May Be Not Present In Databaase or It Must Have Been Deleted");
        }*/

        /*ResultSet rs = Read.readTableData();

        if(rs!=null)
        {
            while(rs.next())
            {
                System.out.println(rs.getInt(1) + " "+ rs.getString(2) + " " + rs.getString(3) + " "+ rs.getInt(4));
            }
        }else{
            System.out.println("OOPS!!!. Sorry we didn't receive you data properly. Please try again.");
        }*/

      
    }
}
