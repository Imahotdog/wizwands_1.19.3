package hotdoggalaxy.wizwands.block;

import hotdoggalaxy.wizwands.WizWands;
import hotdoggalaxy.wizwands.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {

    public static final Block BISMUTH_BLOCK = registerBlock("bismuth_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().luminance(1)), ModItemGroup.MAGICALMATERIALS);

    public static final Block DEEPSLATE_BISMUTH_ORE = registerBlock("deepslate_bismuth_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().luminance(1)), ModItemGroup.MAGICALMATERIALS);

    public static final Block BISMUTH_ORE = registerBlock("bismuth_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().luminance(1)), ModItemGroup.MAGICALMATERIALS);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(WizWands.MOD_ID, name), block);

    }
    public static Item registerBlockItem(String name, Block block, ItemGroup group){
        Item item = Registry.register(Registries.ITEM, new Identifier(WizWands.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks(){
        WizWands.LOGGER.info("Registering ModBlocks for " + WizWands.MOD_ID);
    }
}
