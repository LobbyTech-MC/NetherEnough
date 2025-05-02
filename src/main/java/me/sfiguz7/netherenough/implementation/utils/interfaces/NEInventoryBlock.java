package me.sfiguz7.netherenough.implementation.utils.interfaces;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

public interface NEInventoryBlock {

    int[] getInputSlots();

    int[] getOutputSlots();

    default void createPreset(@Nonnull SlimefunItem item, @Nonnull Consumer<BlockMenuPreset> setup) {
        String title = item.getItemName();
        new BlockMenuPreset(item.getId(), title) {
            public void init() {
                setup.accept(this);
            }

            public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
                return flow == ItemTransportFlow.INSERT ? getInputSlots() : getOutputSlots();
            }

            public boolean canOpen(Block b, Player p) {
                return p.hasPermission("slimefun.inventory.bypass") || Slimefun.getProtectionManager().hasPermission(p, b.getLocation(), Interaction.INTERACT_BLOCK) && Slimefun.getPermissionsService().hasPermission(p, item);
            }
        };
    }
}