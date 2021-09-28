package lbc.sims.moarores.core;

import net.minecraft.world.item.*;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,Main.MOD_ID);


    public static final RegistryObject<SwordItem> copper_sword =
            ITEMS.register("copper_sword", () -> new SwordItem(ToolWeaponCreation.COPPER_SWORD,
                    0,0.0f,
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<PickaxeItem> copper_pickaxe =
            ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ToolWeaponCreation.COPPER_PICKAXE,
                    0,0f,
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> copper_axe =
            ITEMS.register("copper_axe", () -> new AxeItem(ToolWeaponCreation.COPPER_AXE,
                    0,0f,
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> copper_shovel =
            ITEMS.register("copper_shovel", () -> new ShovelItem(ToolWeaponCreation.COPPER_SHOVEL,
                    0,0f,
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> copper_hoe =
            ITEMS.register("copper_hoe", () -> new HoeItem(ToolWeaponCreation.COPPER_HOE,
                    0,0f,
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(CreativeModeTab.TAB_TOOLS)));

}
