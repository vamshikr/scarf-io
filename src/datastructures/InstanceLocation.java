package datastructures;

public class InstanceLocation {
	int startLine;
	int endLine;
	String xPath;
	
	public int getStartLine() {
		return startLine;
	}
	
	public void setStartLine(int ln) {
		startLine = ln;
	}
	
	public int getEndLine() {
		return endLine;
	}
	
	public void setEndLine(int ln) {
		endLine = ln;
	}
	
	public String getXPath() {
		return xPath;
	}
	
	public void setXPath(String xpath) {
		xPath = xpath;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("Start line: " + startLine + "\n");
		result.append("End line: " + endLine + "\n");
		result.append("XPath: " + xPath + "\n");
		return result.toString();
	}
}
