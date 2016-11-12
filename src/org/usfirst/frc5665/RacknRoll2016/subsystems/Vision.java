package org.usfirst.frc5665.RacknRoll2016.subsystems;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class Vision {
	private String reportName = "myContoursReport";
	private NetworkTable table;
	double[] defaultValue = new double[0];
	
	public void getTable() {
		table = NetworkTable.getTable("GRIP/"+reportName);
	}
	public double[][] getCenters() { 
		double[][] centers = {
				table.getNumberArray("centerX",defaultValue),
				table.getNumberArray("centerY",defaultValue)
		};
		return centers;
	}
	public double getAverageX() {
		double[] centersX = table.getNumberArray("centerX",defaultValue);
		double sumX = 0; 
		for(double x : centersX) {
			sumX += x;
		}
		double center = (double)sumX/centersX.length;
		return center;
	}
	public double getAverageY() {
		double[] centersY = table.getNumberArray("centerY",defaultValue);
		double sumY = 0; 
		for(double y : centersY) {
			sumY += y;
		}
		double center = (double)sumY/centersY.length;
		return center;
	}
	public double[] getAverageCenter() {
		double[] center = {this.getAverageX(),this.getAverageY()};
		return center;
	}
}
