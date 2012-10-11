package dao;

import java.util.List;
import javax.sql.DataSource;
import model.X;

public interface Idao {
	
	void setDataSource(DataSource ds);
    void create(String a, String b);

	  List<X> select(String a, String b);
	  List<X> selectAll();
	  void deleteAll();
	  void delete(String a, String b);

}
