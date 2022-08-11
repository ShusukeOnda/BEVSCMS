
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewEmpty{
    public static void main(String args[]){
        try {
            Connection Con = DriverManager.getConnection("jdbc:derby://localhost:1527/jdb1;create=true","app","app");
            PreparedStatement ad = Con.prepareStatement("select * from APP.FTB1 where BN=?");
                ad.setString(1,"33333");
                ResultSet Rs = ad.executeQuery();
                while(Rs.next()){
                    String BPD = Rs.getString("BPD");
                    System.out.println(BPD+"ok");
                }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
