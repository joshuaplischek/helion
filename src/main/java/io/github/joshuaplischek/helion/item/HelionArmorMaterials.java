package io.github.joshuaplischek.helion.item;

import io.github.joshuaplischek.helion.HelionMod;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;

public class HelionArmorMaterials {

    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
            DeferredRegister.create(Registries.ARMOR_MATERIAL, HelionMod.MODID);

    public static final Holder<ArmorMaterial> TITANIUM = ARMOR_MATERIALS.register(
            "titanium",
            () -> new ArmorMaterial(
                    // Schutzwerte pro Slot: Boots=2, Leggings=5, Chestplate=6, Helmet=2, Body=5
                    // Zum Vergleich: Eisen = 2/5/6/2, Diamant = 3/6/8/3
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 2);
                        map.put(ArmorItem.Type.LEGGINGS, 5);
                        map.put(ArmorItem.Type.CHESTPLATE, 7);
                        map.put(ArmorItem.Type.HELMET, 3);
                        map.put(ArmorItem.Type.BODY, 5);
                    }),
                    // enchantmentValue — Verzauberbarkeit. Eisen=9, Diamant=10
                    12,
                    // equipSound — Geräusch beim Anlegen
                    SoundEvents.ARMOR_EQUIP_IRON,
                    // repairIngredient — was zur Reparatur verwendet wird
                    () -> Ingredient.of(HelionItems.TITANIUM_INGOT.get()),
                    // layers — Textur-Layer für das Armor-Rendering
                    List.of(
                            new ArmorMaterial.Layer(
                                    ResourceLocation.fromNamespaceAndPath(HelionMod.MODID, "titanium")
                            )
                    ),
                    // toughness — Rüstungszähigkeit. Eisen=0, Diamant=2
                    1.0f,
                    // knockbackResistance — Rückstoß-Widerstand. Eisen=0, Netherite=0.1
                    0.9f
            )
    );
}
