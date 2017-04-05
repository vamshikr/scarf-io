package datastructures;

public class BugCategory {
	private final int count;
	private final int byteCount;
	private final String bugCode;
	private final String bugGroup;
	
	public BugCategory(int cnt, int bytes, String code, String group) {
		count = cnt;
		byteCount = bytes;
		bugCode = code;
		bugGroup = group;
	}
	
	public int getCount() {
		return count;
	}
	
	public int getByteCount() {
		return byteCount;
	}
	
	public String getBugCode() {
		return bugCode;
	}
	
	public String getBugGroup() {
		return bugGroup;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("Count: " + count + "\n" + 
		"Byte Count: " + byteCount + "\n" + 
		"Bug Code: " + bugCode + "\n" + 
		"Bug Group: " + bugGroup + "\n"); 
		return result.toString();
	}
}
