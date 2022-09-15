import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// Importing required classes

public class DBCon {

    public static void main(String a[])
    {

        // Creating the connection using Oracle DB
        // Note: url syntax is standard, so do grasp
        String url = "jdbc:oracle:thin:@uxddbhsssigdv02.dstcorp.net:1528:QA3CEDST";

        // Username and password to access DB
        // Custom initialization
        String user = "PP_QA_T1";
        String pass = "PP_QA_T1";

//        // Entering the data
//        Scanner k = new Scanner(System.in);
//
//        System.out.println("enter name");
//        String name = k.next();
//
//        System.out.println("enter roll no");
//        int roll = k.nextInt();
//
//        System.out.println("enter class");
//        String cls = k.next();

        // Inserting data using SQL query
        String sql = "SELECT * FROM CFS_TABLE";

        // Connection class object
        Connection con = null;

        // Try block to check for exceptions
        try {

//            // Registering drivers
//            DriverManager.registerDriver(
//                    new oracle.jdbc.OracleDriver());

            // Reference to connection interface
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user,
                    pass);

            // Creating a statement
            Statement st = con.createStatement();

            // Executing query
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

            // Closing the connections
            con.close();
        }

        // Catch block to handle exceptions
        catch (Exception ex) {
            // Display message when exceptions occurs
            System.err.println(ex);
        }
    }
}

