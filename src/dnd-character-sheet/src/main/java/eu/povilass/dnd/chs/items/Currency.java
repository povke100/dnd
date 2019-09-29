package eu.povilass.dnd.chs.items;

public interface Currency {
	
	public void addAmount(int amount);
	
	public boolean spendAmount(int amount);
	
	public void setAmount(int amount);
	
	public int getAmount();

}
