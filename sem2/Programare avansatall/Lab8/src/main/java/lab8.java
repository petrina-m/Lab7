
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 40757
 */
public class lab8 {
    public static void main(String[] args) throws SQLException {
   
        DatabaseClient client1=DatabaseClient.getInstance();
  

        MovieDAO movieDAO = new MovieDAO(client1);
        //movieDAO.add (2,"whatever", "2020-06-22", 5, 3f);
        
    }
     
}
