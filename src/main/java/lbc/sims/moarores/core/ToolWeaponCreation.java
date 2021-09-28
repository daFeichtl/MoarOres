package lbc.sims.moarores.core;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

@MethodsReturnNonnullByDefault
public enum ToolWeaponCreation implements Tier {

    COPPER_SWORD(1,161,1f,4.5f,3,Ingredient.of(Items.COPPER_INGOT)),
    COPPER_PICKAXE(1,161,1.2f,3.5f,3,Ingredient.of(Items.COPPER_INGOT)),
    COPPER_AXE(1,161,0.8f,7.5f,3,Ingredient.of(Items.COPPER_INGOT)),
    COPPER_SHOVEL(1,161,1.2f,2.5f,3,Ingredient.of(Items.COPPER_INGOT)),
    COPPER_HOE(1,161,3f,1.0f,3,Ingredient.of(Items.COPPER_INGOT)),


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
        return repairmaterial;
    }


}
