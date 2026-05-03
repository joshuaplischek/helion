package io.github.joshuaplischek.helion.block;

import io.github.joshuaplischek.helion.HelionMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.minecraft.world.item.Items.*;

public class HelionBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(HelionMod.MODID);


    //Helionium Ore
    public static final DeferredBlock<Block> HELIONIUM_ORE = BLOCKS.registerSimpleBlock(
            "helionium_ore",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE) // Hierbei wird die Farbe auch der Karte Festgelegt, welche es haben soll. Also auf einer Normalen Map
                    .requiresCorrectToolForDrops() // Mit dieser eigenschaft dropt der Block nur wenn das Richtige Werkzeug benutzt wird
                    .strength(3.0F, 3.0F) //Das ist der Widerstand bzw die Härte, also beim Abbauen...wie lange ich also draufhauen muss und wie viel gesprengt wird.
                    .sound(SoundType.STONE) //Das ist für den sound. Also bei dem Laufen / Abbauen usw.
                    .lightLevel(state -> 10)

    );

    public static final DeferredBlock<Block> DEEPSLATE_HELIONIUM_ORE = BLOCKS.registerSimpleBlock(
            "deepslate_helionium_ore",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops()
                    .strength(4.5F, 4.5F)
                    .sound(SoundType.DEEPSLATE)
                    .lightLevel(state -> 15)
    );

    // Lead Ore

    public static final DeferredBlock<Block> LEAD_ORE = BLOCKS.registerSimpleBlock(
            "lead_ore",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.STONE)
    );

    // Titanium Ore
    public static final DeferredBlock<Block> TITANIUM_ORE = BLOCKS.registerSimpleBlock(
            "titanium_ore",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 4.0F)
                    .sound(SoundType.STONE)
    );

    public static final DeferredBlock<Block> DEEPSLATE_TITANIUM_ORE = BLOCKS.registerSimpleBlock(
            "deepslate_titanium_ore",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(4.5F, 4.5F)
                    .sound(SoundType.DEEPSLATE)
    );

    //Tin

    public static final DeferredBlock<Block> TIN_ORE = BLOCKS.registerSimpleBlock(
            "tin_ore",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.STONE)
    );

    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = BLOCKS.registerSimpleBlock(
            "deepslate_tin_ore",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 4.0F)
                    .sound(SoundType.DEEPSLATE)
    );

    // Lagerblöcke aus neun Ingots

    public static final DeferredBlock<Block> HELIONIUM_BLOCK = BLOCKS.registerSimpleBlock(
            "helionium_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .lightLevel(state -> 15)
    );

    public static final DeferredBlock<Block> LEAD_BLOCK = BLOCKS.registerSimpleBlock(
            "lead_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
    );

    public static final DeferredBlock<Block> TITANIUM_BLOCK = BLOCKS.registerSimpleBlock(
            "titanium_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
    );

    // TIN BLOCK

    public static final DeferredBlock<Block> TIN_BLOCK = BLOCKS.registerSimpleBlock(
            "tin_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
    );
}
