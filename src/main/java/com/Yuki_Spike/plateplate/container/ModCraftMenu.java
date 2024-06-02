package com.Yuki_Spike.plateplate.container;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.block.Block;

public class ModCraftMenu extends CraftingMenu {
    private final Block workBench;
    private final ContainerLevelAccess worldPos;

    public ModCraftMenu(int id, Inventory playerInv, ContainerLevelAccess worldPos, Block workBench) {
        super(id, playerInv, worldPos);
        this.workBench = workBench;
        this.worldPos = worldPos;
    }

    protected static boolean isWithinUsableDistance(ContainerLevelAccess worldPos, Player playerIn, Block targetBlock) {
        return (Boolean)worldPos.evaluate((world, pos) ->
                world.getBlockState(pos).getBlock() == targetBlock && playerIn.distanceToSqr((double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5) <= 64.0, (Object)true);
    }

    public boolean stillValid(Player playerIn) {
        return ModCraftMenu.isWithinUsableDistance(this.worldPos, playerIn, this.workBench);
    }
}
