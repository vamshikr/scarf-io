package org.continuousassurance.scarf;

import org.continuousassurance.scarf.datastructures.BugInstance;
import org.continuousassurance.scarf.datastructures.BugSummary;
import org.continuousassurance.scarf.datastructures.InitialInfo;
import org.continuousassurance.scarf.datastructures.Metric;
import org.continuousassurance.scarf.datastructures.MetricSummary;

public interface ScarfInterface {
	/*
	public void initialCallback(InitialInfo initial) {
		System.out.println(initial);
	}
	
	public void bugCallback(BugInstance bug) {
		System.out.println(bug);
	}
	
	public void metricCallback(Metric metric) {
		System.out.println(metric);
	}
	
	public void metricSummaryCallback(MetricSummary metricSum) {
		System.out.println(metricSum);
	}
	
	public void bugSummaryCallback(BugSummary bugSum) {
		System.out.println(bugSum);
	}
	
	public void finalCallback() {
		System.out.println("Final callback");
	}
	*/
	public void initialCallback(InitialInfo initial);
	public void bugCallback(BugInstance bug);
	public void metricCallback(Metric metric);
	public void metricSummaryCallback(MetricSummary metricSum);
	public void bugSummaryCallback(BugSummary bugSum);
	public void finalCallback();
}
