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
		StringBuilder result = new StringBuilder("Count: " + count + "\n");
		result.append("Byte Count: " + byteCount + "\n");
		result.append("Bug Code: " + bugCode + "\n");
		result.append("Bug Group: " + bugGroup + "\n");
		return result.toString();
	}
}
