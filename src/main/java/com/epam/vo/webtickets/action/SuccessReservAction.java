package com.epam.vo.webtickets.action;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * успешная регистрация
 */
public class SuccessReservAction implements Action {
    private static final Logger logger = Logger.getLogger(ReservAction.class);
    private static int sf;
    private static int sr;

    public static int getSf() {
        return sf;
    }

    public static void setSf(int sf) {
        SuccessReservAction.sf = sf;
    }

    public static int getSr() {
        return sr;
    }

    public static void setSr(int sr) {
        SuccessReservAction.sr = sr;
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;


        try{
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test2", "", "");

            stmt = conn.createStatement();
    //reduce on 1 the value COUNT_SEAT_FREE
            rs = stmt.executeQuery("select COUNT_SEAT_FREE from EVENT WHERE ID = 1");
            while (rs.next()){
                sf = rs.getInt("COUNT_SEAT_FREE");
            }

            sf=sf-1;
            stmt.executeUpdate("UPDATE EVENT SET COUNT_SEAT_FREE = " + sf + " WHERE ID=1");

    //add on 1 the value COUNT_SEAT_RESERV
            rs = stmt.executeQuery("select COUNT_SEAT_RESERV from EVENT WHERE ID = 1");
            while (rs.next()){
                sr = rs.getInt("COUNT_SEAT_RESERV");
            }

            sr=sr+1;
            stmt.executeUpdate("UPDATE EVENT SET COUNT_SEAT_RESERV = " + sr + " WHERE ID=1");
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


        return "redirect:/successReserv";
        //return "successReserv";

    }
}
