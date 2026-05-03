package io.github.joshuaplischek.helion.item;

import com.jcraft.jorbis.Block;
import io.github.joshuaplischek.helion.HelionMod;
import io.github.joshuaplischek.helion.block.HelionBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;



public class HelionItems {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HelionMod.MODID);

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

    // Tin ORE ITEM

    public static final DeferredItem<BlockItem> TIN_ORE_ITEM = ITEMS.registerSimpleBlockItem(
            "tin_ore", HelionBlocks.TIN_ORE
    );

    public static final DeferredItem<BlockItem> DEEPSLATE_TIN_ORE_ITEM = ITEMS.registerSimpleBlockItem(
            "deepslate_tin_ore", HelionBlocks.DEEPSLATE_TIN_ORE
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

    // RAW TIN

    public static final DeferredItem<Item> RAW_TIN = ITEMS.registerSimpleItem(
            "raw_tin",
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

    // TIN INGOT

    public static final DeferredItem<Item> TIN_INGOT = ITEMS.registerSimpleItem(
            "tin_ingot",
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

    // Tin Nugget

    public static final DeferredItem<Item> TIN_NUGGET = ITEMS.registerSimpleItem(
            "tin_nugget",
            new Item.Properties());


    // --- DUST -------------------------------------------------------------------------

    public static final DeferredItem<Item> TIN_DUST = ITEMS.registerSimpleItem(
            "tin_dust",
            new Item.Properties());

    public static final  DeferredItem<Item> LEAD_DUST = ITEMS.registerSimpleItem(
            "lead_dust",
            new Item.Properties());

    // --- Tools ----------------------------------------------------------------------

    // Titanium Sword

    public static final DeferredItem<SwordItem> TITANIUM_SWORD = ITEMS.register(
            "titanium_sword",
            () -> new SwordItem(
                    HelionToolMaterials.TITANIUM,
                    new Item.Properties().attributes(
                            SwordItem.createAttributes(HelionToolMaterials.TITANIUM, 3, -0f)
                    )
            )
    );

    // Titanium AXE

    public static final DeferredItem<AxeItem> TITANIUM_AXE = ITEMS.register(
            "titanium_axe",
            () -> new AxeItem(
                    HelionToolMaterials.TITANIUM,
                    new Item.Properties().attributes(
                            AxeItem.createAttributes(HelionToolMaterials.TITANIUM, 5, -1f)
                    )
            )
    );

    // Titanium PICKAXE

    public static final DeferredItem<PickaxeItem> TITANIUM_PICKAXE = ITEMS.register(
            "titanium_pickaxe",
            () -> new PickaxeItem(
                    HelionToolMaterials.TITANIUM,
                    new Item.Properties().attributes(
                            PickaxeItem.createAttributes(HelionToolMaterials.TITANIUM, 1, -2f)
                    )
            )
    );

    // Titanium SHOVEL

    public static final DeferredItem<ShovelItem> TITANIUM_SHOVEL = ITEMS.register(
            "titanium_shovel",
            () -> new ShovelItem(
                    HelionToolMaterials.TITANIUM,
                    new Item.Properties().attributes(
                            PickaxeItem.createAttributes(HelionToolMaterials.TITANIUM, 1.5f, -3.0f)
                    )
            )
    );

    // Titanium HOE

    public static final DeferredItem<HoeItem> TITANIUM_HOE = ITEMS.register(
            "titanium_hoe",
            () -> new HoeItem(
                    HelionToolMaterials.TITANIUM,
                    new Item.Properties().attributes(
                            PickaxeItem.createAttributes(HelionToolMaterials.TITANIUM, 2, -1.0f)
                    )
            )
    );

    // --- ARMOR ------------------------------------------------------------------------------

    //TITANIUM ARMOR

    public static final DeferredItem<ArmorItem> TITANIUM_HELMET = ITEMS.register(
            "titanium_helmet",
            () -> new ArmorItem(
                    HelionArmorMaterials.TITANIUM,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(25))
            )
    );

    public static final DeferredItem<ArmorItem> TITANIUM_CHESTPLATE = ITEMS.register(
            "titanium_chestplate",
            () -> new ArmorItem(
                    HelionArmorMaterials.TITANIUM,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(25))
            )
    );

    public static final DeferredItem<ArmorItem> TITANIUM_LEGGINGS = ITEMS.register(
            "titanium_leggings",
            () -> new ArmorItem(
                    HelionArmorMaterials.TITANIUM,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(25))
            )
    );

    public static final DeferredItem<ArmorItem> TITANIUM_BOOTS = ITEMS.register(
            "titanium_boots",
            () -> new ArmorItem(
                    HelionArmorMaterials.TITANIUM,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(25))
            )
    );

    // Helion Creative Tab, hier müssen alle Items welche in der MOD existieren hinzugefügt werden, da sie sonst nicht sichtbar sind

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HELION_TAB =
            CREATIVE_MODE_TABS.register("helion_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.helion"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> HELIONIUM_INGOT.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        // Erze
                        output.accept(HELIONIUM_ORE_ITEM);
                        output.accept(DEEPSLATE_HELIONIUM_ORE_ITEM);
                        output.accept(LEAD_ORE_ITEM);
                        output.accept(TITANIUM_ORE_ITEM);
                        output.accept(DEEPSLATE_TITANIUM_ORE_ITEM);
                        output.accept(TIN_ORE_ITEM);
                        output.accept(DEEPSLATE_TIN_ORE_ITEM);

                        // Rohmaterialien
                        output.accept(RAW_HELIONIUM);
                        output.accept(RAW_LEAD);
                        output.accept(RAW_TITANIUM);

                        // Ingots & Nuggets
                        output.accept(HELIONIUM_INGOT);
                        output.accept(HELIONIUM_NUGGET);
                        output.accept(LEAD_INGOT);
                        output.accept(LEAD_NUGGET);
                        output.accept(TITANIUM_INGOT);
                        output.accept(TITANIUM_NUGGET);
                        output.accept(TIN_INGOT);
                        output.accept(TIN_NUGGET);

                        // Lagerblöcke
                        output.accept(HELIONIUM_BLOCK_ITEM);
                        output.accept(LEAD_BLOCK_ITEM);
                        output.accept(TITANIUM_BLOCK_ITEM);

                        // Tools (werden in Kap. 05 hinzugefügt)
                        output.accept(TITANIUM_PICKAXE);
                        output.accept(TITANIUM_SHOVEL);
                        output.accept(TITANIUM_HOE);
                        output.accept(TITANIUM_AXE);
                        output.accept(TITANIUM_SWORD);
                        // Armor (werden in Kap. 07 hinzugefügt)
                        output.accept(TITANIUM_HELMET);
                        output.accept(TITANIUM_CHESTPLATE);
                        output.accept(TITANIUM_LEGGINGS);
                        output.accept(TITANIUM_BOOTS);
                    }).build());



}
