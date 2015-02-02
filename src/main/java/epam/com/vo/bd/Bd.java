package epam.com.vo.bd;

import org.apache.log4j.Logger;

import java.sql.*;

public class Bd {
//    private static final Logger logger = Logger.getLogger("epam.com.vo.bd.Bd");
    private static final Logger logger = Logger.getLogger(Bd.class);

    public static void main(String[] args) throws ClassNotFoundException {

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test2", "", "");

            stmt = conn.createStatement();
            rs = stmt.executeQuery("select e.count_seat as count from event");

            while (rs.next()){
                System.out.println(rs.getInt("count"));
                int i = rs.getInt("count");
            }

        }
        catch (ClassNotFoundException | SQLException ex){
            logger.info("Connection with BD not found");
        } finally {
            try{
                if(conn != null) conn.close();
                if(stmt != null) stmt.close();
                if(rs != null) rs.close();
            } catch (SQLException ex){
                logger.info("SQL exeption");
            }
        }
    }
}
