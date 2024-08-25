package net.eravern.eanimalmod;

import net.eravern.eanimalmod.item.ModItems;
import net.eravern.eanimalmod.util.ModLootTablesModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EAnimalMod implements ModInitializer {
	public static final String MOD_ID = "eanimalmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModLootTablesModifiers.modifyLootTables();
	}
}