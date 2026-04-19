package io.github.joshuaplischek.helion.item;

import io.github.joshuaplischek.helion.HelionMod;
import io.github.joshuaplischek.helion.block.HelionBlocks;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HelionItems {

    // Hier kommt wieder der eigene Deferrender für die Items aus meiner Mod
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HelionMod.MODID);

    public static final DeferredItem<BlockItem> HELIONIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem(
            "helionium_ore", HelionBlocks.HELIONIUM_ORE
    );

}
