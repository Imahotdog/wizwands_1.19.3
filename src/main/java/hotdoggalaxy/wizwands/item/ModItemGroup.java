package hotdoggalaxy.wizwands.item;

import hotdoggalaxy.wizwands.WizWands;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup MAGICALMATERIALS;

    public static void registerItemGroups(){
        MAGICALMATERIALS = FabricItemGroup.builder(new Identifier(WizWands.MOD_ID, "magicalmaterials"))
                .displayName(Text.literal("Magical Materials"))
                .icon (() -> new ItemStack(ModItems.BISMUTH)).build();

    }

}
