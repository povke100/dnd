package eu.povilass.dnd.chs.items;

import lombok.Data;

@Data
public abstract class InventoryItem implements Item {

	protected String itemName;
	protected String itemDescription;
	protected int amount;
	protected boolean isEquiped;
}
