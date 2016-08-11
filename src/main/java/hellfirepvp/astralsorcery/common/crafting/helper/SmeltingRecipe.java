package hellfirepvp.astralsorcery.common.crafting.helper;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

/**
 * This class is part of the Astral Sorcery Mod
 * The complete source code for this mod can be found on github.
 * Class: SmeltingRecipe
 * Created by HellFirePvP
 * Date: 10.08.2016 / 15:20
 */
public class SmeltingRecipe extends AbstractRecipe {

    private ItemStack smelted;
    private float exp;

    public SmeltingRecipe(Block output) {
        this(new ItemStack(output));
    }

    public SmeltingRecipe(Item output) {
        this(new ItemStack(output));
    }

    public SmeltingRecipe(ItemStack output) {
        super(output);
    }

    public SmeltingRecipe setSmelted(Block block) {
        return setSmelted(new ItemStack(block));
    }

    public SmeltingRecipe setSmelted(Item item) {
        return setSmelted(new ItemStack(item));
    }

    public SmeltingRecipe setSmelted(ItemStack stack) {
        this.smelted = stack;
        return this;
    }

    public SmeltingRecipe setExp(float exp) {
        this.exp = exp;
        return this;
    }

    @Override
    public void register() {
        FurnaceRecipes.instance().addSmeltingRecipe(smelted, getOutput(), exp);
    }

}
