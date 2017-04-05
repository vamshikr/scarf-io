package datastructures;

public class Method {
	private final String id;
	private final String name;
	private final boolean isPrimary;
	
	public Method(String id, String name, boolean primary) {
		this.id = id;
		this.name = name;
		this.isPrimary = primary;
	}
	
	public String getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isPrimary() {
		return isPrimary;
	}

}
