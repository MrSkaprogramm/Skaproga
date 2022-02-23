import java.io.Serializable;
import java.util.Map;
import dao.MapDAO;
import database.Database;

public class DatabaseMapDAO implements MapDAO, Serializable {

  /**
  * 
  */
  private static final long serialVersionUID = 9012247179142102312L;
  Database database = new Database();

    @Override
    public Map<String, Double> getStreets() {
      return database.getStreets();
    }
}
