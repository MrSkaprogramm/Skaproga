import java.io.Serializable;
import java.util.List;
import beans.Order;
import dao.OrderDAO;
import database.Database;

public class DatabaseOrderDAO implements OrderDAO, Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 4980839844482471178L;
  Database database = new Database();

  @Override
  public List<Order> getOrders() {
    return database.getOrders();
  }
}
