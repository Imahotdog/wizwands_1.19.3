package hotdoggalaxy.wizwands;

import hotdoggalaxy.wizwands.block.ModBlocks;
import hotdoggalaxy.wizwands.item.ModItemGroup;
import hotdoggalaxy.wizwands.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WizWands implements ModInitializer {
	public static final String MOD_ID = "wizwands";
	public static final Logger LOGGER = LoggerFactory.getLogger("wizwands");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}