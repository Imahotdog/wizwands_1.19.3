package hotdoggalaxy.wizwands.item;

import hotdoggalaxy.wizwands.WizWands;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //Add bismuth
    public static final Item BISMUTH = registerItem("bismuth",
            new Item(new FabricItemSettings()));

    public static final Item RAW_BISMUTH = registerItem("raw_bismuth",
            new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(WizWands.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.INGREDIENTS, BISMUTH);
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_BISMUTH);

        addToItemGroup(ModItemGroup.MAGICALMATERIALS, BISMUTH);
        addToItemGroup(ModItemGroup.MAGICALMATERIALS, RAW_BISMUTH);
    }

    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems(){
        WizWands.LOGGER.info("Registering mod items for" + WizWands.MOD_ID);

        addItemsToItemGroup();

    }
}
