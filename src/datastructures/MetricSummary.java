package datastructures;

public class MetricSummary {
	private String metricType;
	private int count;
	private double sum;
	private double sumOfSquares;
	private double min;
	private double max;
	private double average;
	private double stdDev;
	
	public void setMetricType(String type) {
		metricType = type;
	}
	
	public String getMetricType() {
		return metricType;
	}
	
	public void setCount(int cnt) {
		count = cnt;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setSum(double s) {
		sum = s;
	}
	
	public double getSum() {
		return sum;
	}
	
	public void setSumOfSquares(double ss) {
		sumOfSquares = ss;
	}
	
	public double getSumOfSquares() {
		return sumOfSquares;
	}
	
	public void setMin(double m) {
		min = m;
	}
	
	public double getMin() {
		return min;
	}
	
	public void setMax(double m) {
		max = m;
	}
	
	public double getMax() {
		return max;
	}
	
	public void setAverage(double a) {
		average = a;
	}
	
	public double getAverage() {
		return average;
	}
	
	public void setStdDev(double s) {
		stdDev = s;
	}
	
	public double getStdDev() {
		return stdDev;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("Metric type: " + metricType + "\n");
		result.append("Count: " + count + "\n");
		result.append("Sum: " + sum + "\n");
		result.append("Sum of Squares: " + sumOfSquares + "\n");
		result.append("Min: " + min + "\n");
		result.append("Max: " + max + "\n");
		result.append("Average: " + average + "\n");
		result.append("Standard Deviation: " + stdDev + "\n");
		return result.toString();
	}
	
}
