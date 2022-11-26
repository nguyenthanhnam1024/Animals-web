package ConnectionDB_animals;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ModelAnimals.ImageAnimals;

public class Table_imageanimals {
	
	public ArrayList<ImageAnimals> SelectAll() {
		Connection conn = JDBCConnection.getJDBCConection();
		ArrayList<ImageAnimals> ListImageAnimals = new ArrayList<ImageAnimals>();
		try {
			Statement stm = conn.createStatement();
			String sql = "SELECT * FROM animals.imageanimals;";
			ResultSet rs = stm.executeQuery(sql);
		    while(rs.next()) {
		    	ListImageAnimals.add(new ImageAnimals(rs.getInt("IdImage"), rs.getString("NameAnimal"), rs.getString("UrlI-mage")));
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ListImageAnimals;
	}
	
	public void Insert(int id, String ten, String url, String lop) {
		Connection conn = JDBCConnection.getJDBCConection();
		try {
			String sql = "INSERT INTO `animals`.`imageanimals` (`IdImage`, `NameAnimal`, `UrlI-mage`, `class`) VALUES (?, ?, ?, ?);";
		    PreparedStatement ppstm = conn.prepareStatement(sql);
		    ppstm.setInt(1, id);
		    ppstm.setNString(2, ten);
		    ppstm.setNString(3, url);
		    ppstm.setNString(4, lop);
		    ppstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public static void main(String[] args) {
		Table_imageanimals tia = new Table_imageanimals();
		tia.Insert(2, "thỏ", "https://ss-images.saostar.vn/wp700/2020/04/08/7307009/12.jpg", "động vật có vú");
	}

}
