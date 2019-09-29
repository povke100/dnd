package eu.povilass.dnd.chs.items;

import eu.povilass.dnd.chs.enums.DamageTypes;

public class Weapon extends InventoryItem{
	
	private DamageTypes damageType;
	private double weight;

	@Override
	public double getWeight() {
		return weight * amount;
	}
}
