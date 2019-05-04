import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.younes.connection.SdzConnection;
import fr.younes.metier.User;

public class Test {
	public static void main(String[] args) {
	    try {
	      //Nous appelons quatre fois la méthode getInstance()
	      PreparedStatement prepare = SdzConnection.getInstance().prepareStatement("SELECT * FROM users");

	      Statement state = SdzConnection.getInstance().createStatement();

	      SdzConnection.getInstance().setAutoCommit(false);
	      ArrayList<User> maList =new ArrayList<User>();
	      User a=new User();
			String sql="SELECT * FROM users";
			try {
				PreparedStatement statement=SdzConnection.getInstance().prepareStatement(sql);
				ResultSet rs=statement.executeQuery();
				while(rs.next()) {
					//System.out.println(rs.getString("labels"));
					a=new User(rs.getInt("id"),rs.getString("email"),rs.getString("password"),rs.getString("username"));
					maList.add(a);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (User mArticle : maList) {
				System.out.println(mArticle.getId());
			}
	      DatabaseMetaData meta = SdzConnection.getInstance().getMetaData();
	         
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }
}
