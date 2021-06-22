package lbc.sims.moarores.core;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,Main.MOD_ID);

    public static final RegistryObject<Item> copper_ingot = ITEMS
            .register("copper_ingot",() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<SwordItem> copper_sword =
            ITEMS.register("copper_sword", () -> new SwordItem(ToolWeaponCreation.COPPER_SWORD,
                    0,0.0f,
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(ItemGroup.TAB_COMBAT)));

}
