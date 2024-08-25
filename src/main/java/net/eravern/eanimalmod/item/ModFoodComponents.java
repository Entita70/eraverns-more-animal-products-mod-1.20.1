package net.eravern.eanimalmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RAW_EQUINE_MEAT;
    public static final FoodComponent COOKED_EQUINE_MEAT;
    public static final FoodComponent RAW_CAMEL_MEAT;
    public static final FoodComponent COOKED_CAMEL_MEAT;
    public static final FoodComponent RAW_BEAR_MEAT;
    public static final FoodComponent COOKED_BEAR_MEAT;
    public static final FoodComponent FRIED_BEE_WING;
    public static final FoodComponent RAW_STRIDER_MEAT;
    public static final FoodComponent COOKED_STRIDER_MEAT;
    public static final FoodComponent RAW_CAT_MEAT;
    public static final FoodComponent COOKED_CAT_MEAT;
    public static final FoodComponent RAW_SNIFFER_MEAT;
    public static final FoodComponent COOKED_SNIFFER_MEAT;
    public static final FoodComponent PARROT;
    public static final FoodComponent COOKED_PARROT;
    public static final FoodComponent RAW_TURTLE_MEAT;
    public static final FoodComponent COOKED_TURTLE_MEAT;
    public static final FoodComponent AXOLOTL_TAIL;
    public static final FoodComponent COOKED_AXOLOTL_TAIL;
    public static final FoodComponent SQUID_TENTACLE;
    public static final FoodComponent FRIED_SQUID_TENTACLE;
    public static final FoodComponent BAT_WING;
    public static final FoodComponent FRIED_BAT_WING;
    public static final FoodComponent FROG_LEG;
    public static final FoodComponent FRIED_FROG_LEG;
    public static final FoodComponent RAW_WOLF_MEAT;
    public static final FoodComponent COOKED_WOLF_MEAT;






    public ModFoodComponents() {
    }

    private static FoodComponent.Builder createStew(int hunger) {
        return (new FoodComponent.Builder()).hunger(hunger).saturationModifier(0.6F);
    }

    static {

        RAW_EQUINE_MEAT = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.4F).meat().build();
        COOKED_EQUINE_MEAT = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.9F).meat().build();
        RAW_CAMEL_MEAT = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.3F).meat().build();
        COOKED_CAMEL_MEAT = (new FoodComponent.Builder()).hunger(7).saturationModifier(0.7F).meat().build();
        RAW_BEAR_MEAT = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.2F).meat().build();
        COOKED_BEAR_MEAT = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.6F).meat().build();
        FRIED_BEE_WING = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.5F).build();
        RAW_STRIDER_MEAT = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F).meat().build();
        COOKED_STRIDER_MEAT = (new FoodComponent.Builder()).hunger(7).saturationModifier(0.7F).meat().build();
        RAW_CAT_MEAT = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.2F).meat().build();
        COOKED_CAT_MEAT = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.6F).meat().build();
        RAW_SNIFFER_MEAT = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.5F).meat().build();
        COOKED_SNIFFER_MEAT = (new FoodComponent.Builder()).hunger(10).saturationModifier(1.0F).meat().build();
        PARROT = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300, 0), 0.3F).meat().build();
        COOKED_PARROT = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.6F).meat().build();
        RAW_TURTLE_MEAT = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.2F).meat().build();
        COOKED_TURTLE_MEAT = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.6F).meat().build();
        AXOLOTL_TAIL = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.2F).meat().build();
        COOKED_AXOLOTL_TAIL = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.6F).meat().build();
        SQUID_TENTACLE = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.1F).build();
        FRIED_SQUID_TENTACLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.4F).build();
        BAT_WING = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.1F).build();
        FRIED_BAT_WING = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.4F).build();
        FROG_LEG = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.2F).build();
        FRIED_FROG_LEG = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.6F).build();
        RAW_WOLF_MEAT = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.2F).build();
        COOKED_WOLF_MEAT = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.6F).build();



    }
}
