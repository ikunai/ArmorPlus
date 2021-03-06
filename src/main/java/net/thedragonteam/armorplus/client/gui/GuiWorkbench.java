/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus.client.gui;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.thedragonteam.armorplus.client.gui.base.GuiBaseBench;
import net.thedragonteam.armorplus.container.ContainerWorkbench;

/**
 * net.thedragonteam.armorplus.client.gui
 * ArmorPlus created by sokratis12GR on 6/19/2016 10:37 AM.
 * - TheDragonTeam
 */
public class GuiWorkbench extends GuiBaseBench {
    private static final ResourceLocation ARP_WORKBENCH_GUI_TEXTURES = new ResourceLocation("armorplus:textures/gui/container/gui_workbench.png");

    public GuiWorkbench(InventoryPlayer playerInv, World worldIn) {
        super(new ContainerWorkbench(playerInv, worldIn), playerInv, worldIn, ARP_WORKBENCH_GUI_TEXTURES, "workbench", 176, 165);
    }
}
