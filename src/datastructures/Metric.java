package datastructures;

public class Metric {
	private Location location;
	private String className;
	private String methodName;
	private String metricType;
	private String metricValue;
	
	public void setLocation(Location l) {
		location = l;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setClassName(String name) {
		className = name;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setMethodName(String name) {
		methodName = name;
	}
	
	public String getMethodName() {
		return methodName;
	}
	
	public void setMetricType(String type) {
		metricType = type;
	}
	public String getMetricType() {
		return metricType;
	}
	
	public void setMetricValue(String val) {
		metricValue = val;
	}
	
	public String getMetricValue() {
		return metricValue;
	}
	
	@Override 
	public String toString() {
		StringBuilder result = new StringBuilder("Location: " + location + "\n");
		result.append("Class Name: " + className + "\n");
		result.append("Method Name: " + methodName + "\n");
		result.append("Metric Type: " + metricType + "\n");
		result.append("Metric Value: " + metricValue + "\n");
		return result.toString();
	}

}
