import java.util.List;
import java.util.Objects;

public class Map {
  private List<String> tripPoints;
	
	public Map() {}

  public List<String> getTripPoints() {
    return tripPoints;
  }

  public void setTripPoints(List<String> tripPoints) {
    this.tripPoints = tripPoints;
  }

  @Override
  public int hashCode() {
    return Objects.hash(tripPoints);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Map other = (Map) obj;
    return Objects.equals(tripPoints, other.tripPoints);
  }

  @Override
  public String toString() {
    return "Map [tripPoints=" + tripPoints + "]";
  }
}
