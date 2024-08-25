package net.eravern.eanimalmod.block;

import net.eravern.eanimalmod.EAnimalMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EAnimalMod.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(EAnimalMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static void addItemsToFunctionalGroup(FabricItemGroupEntries entries) {



    }


    public static void registerModBlocks() {
        EAnimalMod.LOGGER.info("Registering ModBlocks for " + EAnimalMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModBlocks::addItemsToFunctionalGroup);



    }
}
