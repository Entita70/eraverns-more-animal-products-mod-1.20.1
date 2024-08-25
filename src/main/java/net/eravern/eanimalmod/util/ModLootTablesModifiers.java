package net.eravern.eanimalmod.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;

public class ModLootTablesModifiers {


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

        });
    }
}