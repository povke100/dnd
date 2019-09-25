package eu.povilass.dnd.chs.dtos;

import lombok.Data;

@Data
public abstract class InventoryItem {

	private String itemName;
	private String itemDescription;
}
