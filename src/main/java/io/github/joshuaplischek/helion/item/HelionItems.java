package io.github.joshuaplischek.helion.item;

import com.jcraft.jorbis.Block;
import io.github.joshuaplischek.helion.HelionMod;
import io.github.joshuaplischek.helion.block.HelionBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HelionItems {

    // Hier kommt wieder der eigene Deferrender für die Items aus meiner Mod
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HelionMod.MODID);

    // ── Block-Items (Item-Form der Blöcke) ──────────────────

    public static final DeferredItem<BlockItem> HELIONIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem(
            "helionium_ore", HelionBlocks.HELIONIUM_ORE
    );

    public static final DeferredItem<BlockItem> DEEPSLATE_HELIONIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem(
            "deepslate_helionium_ore", HelionBlocks.DEEPSLATE_HELIONIUM_ORE
    );

    public static final DeferredItem<BlockItem> LEAD_ORE_ITEM = ITEMS.registerSimpleBlockItem(
            "lead_ore", HelionBlocks.LEAD_ORE
    );

    public static final DeferredItem<BlockItem> TITANIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem(
            "titanium_ore", HelionBlocks.TITANIUM_ORE
    );

    public static final DeferredItem<BlockItem> DEEPSLATE_TITANIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem(
            "deepslate_titanium_ore", HelionBlocks.DEEPSLATE_TITANIUM_ORE
    );

    public static final DeferredItem<BlockItem> HELIONIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
            "helionium_block", HelionBlocks.HELIONIUM_BLOCK
    );

    public static final DeferredItem<BlockItem> LEAD_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
            "lead_block", HelionBlocks.LEAD_BLOCK
    );

    public static final DeferredItem<BlockItem> TITANIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
            "titanium_block", HelionBlocks.TITANIUM_BLOCK
    );

    // ── Eigenständige Items ─────────────────────────────────

    public static final DeferredItem<Item> RAW_HELIONIUM = ITEMS.registerSimpleItem(
            "raw_helionium",
            new Item.Properties()
    );

    public static final DeferredItem<Item> RAW_LEAD = ITEMS.registerSimpleItem(
            "raw_lead",
            new Item.Properties()
    );

    public static final DeferredItem<Item> RAW_TITANIUM = ITEMS.registerSimpleItem(
            "raw_titanium",
            new Item.Properties()
    );

    // ── Ingots ─────────────────────────────────

    public static final DeferredItem<Item> HELIONIUM_INGOT = ITEMS.registerSimpleItem(
            "helionium_ingot",
            new Item.Properties()
    );

    public static final DeferredItem<Item> LEAD_INGOT = ITEMS.registerSimpleItem(
            "lead_ingot",
            new Item.Properties()
    );

    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.registerSimpleItem(
            "titanium_ingot",
            new Item.Properties()
    );

    // ── Nuggets ─────────────────────────────────

    public static final DeferredItem<Item> HELIONIUM_NUGGET = ITEMS.registerSimpleItem(
            "helionium_nugget",
            new Item.Properties());

    public static final DeferredItem<Item> LEAD_NUGGET = ITEMS.registerSimpleItem(
            "lead_nugget",
            new Item.Properties());

    public static final DeferredItem<Item> TITANIUM_NUGGET = ITEMS.registerSimpleItem(
            "titanium_nugget",
            new Item.Properties());

}
