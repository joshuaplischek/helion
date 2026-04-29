package io.github.joshuaplischek.helion.item;

import io.github.joshuaplischek.helion.HelionMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;
import net.minecraft.world.level.block.Block;

public class HelionToolMaterials {

    // Tag für Blöcke, die Titanium NICHT korrekt abbauen kann
    // (= Blöcke die ein höheres Tier brauchen, z.B. Obsidian)

    public static final TagKey<Block> INCORRECT_FOR_TITANIUM_TOOL =
            TagKey.create(BuiltInRegistries.BLOCK.key(),
                    ResourceLocation.fromNamespaceAndPath(
                            HelionMod.MODID, "incorrect_for_titanium_tool"
                    ));

    public static final Tier TITANIUM = new SimpleTier(
            // incorrectBlocksForDrops
            INCORRECT_FOR_TITANIUM_TOOL,
            // durability: Stein=131, Eisen=250, Diamant=1561
            450,
            // speed: Stein=4, Eisen=6, Diamant=8
            7.0f,
            // attackDamageBonus: Stein=1, Eisen=2, Diamant=3
            2.5f,
            // enchantmentValue: Gold=22, Eisen=14, Diamant=10
            16,
            // repairIngredient
            () -> Ingredient.of(HelionItems.TITANIUM_INGOT.get())
    );
}
