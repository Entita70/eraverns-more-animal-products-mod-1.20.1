package net.eravern.eanimalmod.item;

import net.eravern.eanimalmod.EAnimalMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_EQUINE_MEAT = registerItem("raw_equine_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_EQUINE_MEAT)));
    public static final Item COOKED_EQUINE_MEAT = registerItem("cooked_equine_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_EQUINE_MEAT)));
    public static final Item RAW_CAMEL_MEAT = registerItem("raw_camel_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_CAMEL_MEAT)));
    public static final Item COOKED_CAMEL_MEAT = registerItem("cooked_camel_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_CAMEL_MEAT)));
    public static final Item RAW_BEAR_MEAT = registerItem("raw_bear_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_BEAR_MEAT)));
    public static final Item COOKED_BEAR_MEAT = registerItem("cooked_bear_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_BEAR_MEAT)));
    public static final Item FRIED_BEE_WING = registerItem("fried_bee_wing",
            new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_BEE_WING)));
    public static final Item RAW_STRIDER_MEAT = registerItem("raw_strider_meat",
            new Item(new FabricItemSettings().fireproof().food(ModFoodComponents.RAW_STRIDER_MEAT)));
    public static final Item COOKED_STRIDER_MEAT = registerItem("cooked_strider_meat",
            new Item(new FabricItemSettings().fireproof().food(ModFoodComponents.COOKED_STRIDER_MEAT)));
    public static final Item RAW_CAT_MEAT = registerItem("raw_cat_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_CAT_MEAT)));
    public static final Item COOKED_CAT_MEAT = registerItem("cooked_cat_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_CAT_MEAT)));
    public static final Item RAW_SNIFFER_MEAT = registerItem("raw_sniffer_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_SNIFFER_MEAT)));
    public static final Item COOKED_SNIFFER_MEAT = registerItem("cooked_sniffer_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SNIFFER_MEAT)));
    public static final Item PARROT = registerItem("parrot",
            new Item(new FabricItemSettings().food(ModFoodComponents.PARROT)));
    public static final Item COOKED_PARROT = registerItem("cooked_parrot",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_PARROT)));
    public static final Item RAW_TURTLE_MEAT = registerItem("raw_turtle_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_TURTLE_MEAT)));
    public static final Item COOKED_TURTLE_MEAT = registerItem("cooked_turtle_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_TURTLE_MEAT)));
    public static final Item AXOLOTL_TAIL = registerItem("axolotl_tail",
            new Item(new FabricItemSettings().food(ModFoodComponents.AXOLOTL_TAIL)));
    public static final Item COOKED_AXOLOTL_TAIL = registerItem("cooked_axolotl_tail",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_AXOLOTL_TAIL)));
    public static final Item SQUID_TENTACLE = registerItem("squid_tentacle",
            new Item(new FabricItemSettings().food(ModFoodComponents.SQUID_TENTACLE)));
    public static final Item FRIED_SQUID_TENTACLE = registerItem("fried_squid_tentacle",
            new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_SQUID_TENTACLE)));
    public static final Item BAT_WING = registerItem("bat_wing",
            new Item(new FabricItemSettings().food(ModFoodComponents.BAT_WING)));
    public static final Item FRIED_BAT_WING = registerItem("fried_bat_wing",
            new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_BAT_WING)));
    public static final Item FROG_LEG = registerItem("frog_leg",
            new Item(new FabricItemSettings().food(ModFoodComponents.FROG_LEG)));
    public static final Item FRIED_FROG_LEG = registerItem("fried_frog_leg",
            new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_FROG_LEG)));
    public static final Item RAW_WOLF_MEAT = registerItem("raw_wolf_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_WOLF_MEAT)));
    public static final Item COOKED_WOLF_MEAT = registerItem("cooked_wolf_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_WOLF_MEAT)));
    public static final Item FOX_FUR = registerItem("fox_fur",
            new Item(new FabricItemSettings()));
    public static final Item PANDA_HIDE = registerItem("panda_hide",
            new Item(new FabricItemSettings()));
    public static final Item POLAR_BEAR_HIDE = registerItem("polar_bear_hide",
            new Item(new FabricItemSettings()));
    public static final Item STRIDER_SKIN = registerItem("strider_skin",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item BEE_WING = registerItem("bee_wing",
            new Item(new FabricItemSettings()));
    public static final Item SNIFFER_LEAVES = registerItem("sniffer_leaves",
            new Item(new FabricItemSettings().recipeRemainder(Items.AZALEA_LEAVES)));




    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(RAW_EQUINE_MEAT);
        entries.add(COOKED_EQUINE_MEAT);
        entries.add(RAW_CAMEL_MEAT);
        entries.add(COOKED_CAMEL_MEAT);
        entries.add(RAW_BEAR_MEAT);
        entries.add(COOKED_BEAR_MEAT);
        entries.add(FRIED_BEE_WING);
        entries.add(RAW_STRIDER_MEAT);
        entries.add(COOKED_STRIDER_MEAT);
        entries.add(RAW_CAT_MEAT);
        entries.add(COOKED_CAT_MEAT);
        entries.add(RAW_SNIFFER_MEAT);
        entries.add(COOKED_SNIFFER_MEAT);
        entries.add(PARROT);
        entries.add(COOKED_PARROT);
        entries.add(RAW_TURTLE_MEAT);
        entries.add(COOKED_TURTLE_MEAT);
        entries.add(AXOLOTL_TAIL);
        entries.add(COOKED_AXOLOTL_TAIL);
        entries.add(SQUID_TENTACLE);
        entries.add(FRIED_SQUID_TENTACLE);
        entries.add(BAT_WING);
        entries.add(FRIED_BAT_WING);
        entries.add(FROG_LEG);
        entries.add(FRIED_FROG_LEG);
        entries.add(RAW_WOLF_MEAT);
        entries.add(COOKED_WOLF_MEAT);


    }
    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(FOX_FUR);
        entries.add(PANDA_HIDE);
        entries.add(POLAR_BEAR_HIDE);
        entries.add(STRIDER_SKIN);
        entries.add(SNIFFER_LEAVES);
        entries.add(BEE_WING);


    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EAnimalMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EAnimalMod.LOGGER.info("Registering Mod Items for " + EAnimalMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);

    }
}
