package lbc.sims.moarores.core;

import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,Main.MOD_ID);

    public static final RegistryObject<Item> copper_ingot = ITEMS
            .register("copper_ingot",() -> new Item(new Item.Properties().func_200916_a(ItemGroup.field_78026_f)));

    public static final RegistryObject<SwordItem> copper_sword =
            ITEMS.register("copper_sword", () -> new SwordItem(ToolWeaponCreation.COPPER_SWORD,
                    0,0.0f,
                    new Item.Properties()
                            .func_200915_b(1)
                            .func_200916_a(ItemGroup.field_78037_j)));
    public static final RegistryObject<PickaxeItem> copper_pickaxe =
            ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ToolWeaponCreation.COPPER_PICKAXE,
                    0,0f,
                    new Item.Properties()
                            .addToolType(ToolType.PICKAXE,2)
                            .func_200915_b(1)
                            .tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> copper_axe =
            ITEMS.register("copper_axe", () -> new AxeItem(ToolWeaponCreation.COPPER_AXE,
                    0,0f,
                    new Item.Properties()
                            .addToolType(ToolType.AXE,2)
                            .stacksTo(1)
                            .tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> copper_shovel =
            ITEMS.register("copper_shovel", () -> new ShovelItem(ToolWeaponCreation.COPPER_SHOVEL,
                    0,0f,
                    new Item.Properties()
                            .addToolType(ToolType.SHOVEL,2)
                            .stacksTo(1)
                            .tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> copper_hoe =
            ITEMS.register("copper_hoe", () -> new HoeItem(ToolWeaponCreation.COPPER_HOE,
                    0,0f,
                    new Item.Properties()
                            .addToolType(ToolType.AXE,2)
                            .stacksTo(1)
                            .tab(ItemGroup.TAB_TOOLS)));

}
