package com.epam.vo.webtickets.action;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


public class ReservAction implements Action {
    private static final Logger logger = Logger.getLogger(ReservAction.class);
    private static int i;

    public static int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
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
            rs = stmt.executeQuery("select COUNT_SEAT_FREE from EVENT WHERE ID = 1");
            while (rs.next()){
                i = rs.getInt("COUNT_SEAT_FREE");
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


        return "reserv";

    }
}
