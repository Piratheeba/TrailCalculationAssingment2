package dao;

import java.sql.ResultSet;

import domain.TrailCalculationDOM;
import domain.UserDOM;

public interface TrailCalculationDAO {
	public boolean insert(TrailCalculationDOM trailcalculation);
	public ResultSet select(UserDOM userDOM);

}
