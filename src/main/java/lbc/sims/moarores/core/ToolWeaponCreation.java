package lbc.sims.moarores.core;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

@MethodsReturnNonnullByDefault
public enum ToolWeaponCreation implements IItemTier {

    COPPER_SWORD(0,161,4,5.5f,3,Ingredient.of(ItemsInit.copper_ingot.get())),
    COPPER_PICKAXE(0,161,4,5.5f,3,Ingredient.of(ItemsInit.copper_ingot.get())),
    COPPER_AXE(0,161,4,5.5f,3,Ingredient.of(ItemsInit.copper_ingot.get())),
    COPPER_SHOVEL(0,161,4,5.5f,3,Ingredient.of(ItemsInit.copper_ingot.get())),
    COPPER_HOE(0,161,4,5.5f,3,Ingredient.of(ItemsInit.copper_ingot.get())),

    ;



    private final Ingredient repairmaterial;
    private final int enchantability;
    private final float attackDamage;
    private final float efficiency;
    private final int maxUses;
    private final int harvestLevel;

    ToolWeaponCreation(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Ingredient repairmaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairmaterial = repairmaterial;
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairmaterial;
    }

}
