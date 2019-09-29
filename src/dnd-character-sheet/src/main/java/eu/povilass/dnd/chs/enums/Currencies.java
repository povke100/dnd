package eu.povilass.dnd.chs.enums;

public enum Currencies {
	COPPER ("C"),
	SILVER ("S"),
	GOLD ("G"),
	ELECTRUM ("E"),
	PLATINUM ("P");
	
	private String name;
	
	Currencies(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
