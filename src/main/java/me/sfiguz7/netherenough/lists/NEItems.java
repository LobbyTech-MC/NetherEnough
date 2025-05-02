package me.sfiguz7.netherenough.lists;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.sfiguz7.netherenough.NetherEnough;

public class NEItems {

    /* Category */
    public static final ItemGroup netherenough = new ItemGroup(new NamespacedKey(NetherEnough.getInstance(), "netherenough"),
            new CustomItemStack(Material.CHISELED_NETHER_BRICKS, "&c深渊幻章")
    );
    /* Items */
    public static final SlimefunItemStack MANA_ROD = new SlimefunItemStack("MANA_ROD",
    Material.END_ROD,
    "&b魔力法杖",
    "&9为附近的方块注入法力，揭示",
    "&9它们内在的本质"
    );
    public static final SlimefunItemStack DEMONIC_BRICKS = new SlimefunItemStack("DEMONIC_BRICKS",
    Material.CHISELED_NETHER_BRICKS,
    "&4恶魔砖块",
    "&9据说它们蕴含着",
    "&9恶魔的灵魂"
    );
    public static final SlimefunItemStack INFUSED_STONE = new SlimefunItemStack("INFUSED_STONE",
    Material.CHISELED_STONE_BRICKS,
    "&b注入石",
    "&9蕴含法力的石头，具有极佳的",
    "&9结构完整性"
    );
    public static final SlimefunItemStack DWARVEN_MARBLE = new SlimefunItemStack("DWARVEN_MARBLE",
    Material.CHISELED_QUARTZ_BLOCK,
    "&b矮人大理石",
    "&9一种奇妙的材料"
    );
    public static final SlimefunItemStack ALEMBIC = new SlimefunItemStack("ALEMBIC",
    Material.BREWING_STAND,
    "&c蒸馏器",
    "&9从其他物品中提取元素"
    );
    public static final SlimefunItemStack IGNIS = new SlimefunItemStack("IGNIS",
    Material.RED_DYE,
    "&4火焰精华",
    "&9热辣"
    );
    public static final SlimefunItemStack AQUA = new SlimefunItemStack("AQUA",
    Material.BLUE_DYE,
    "&1水精华",
    "&9冒泡"
    );
    public static final SlimefunItemStack TERRA = new SlimefunItemStack("TERRA",
    Material.GREEN_DYE,
    "&2大地精华",
    "&9我是格鲁特"
    );
    public static final SlimefunItemStack FULGUR = new SlimefunItemStack("FULGUR",
    Material.YELLOW_DYE,
    "&e闪电精华",
    "&9滋滋"
    );
    public static final SlimefunItemStack AURA = new SlimefunItemStack("AURA",
    Material.WHITE_DYE,
    "&7光环精华",
    "&9嗖嗖"
    );
    public static final SlimefunItemStack ARCANE_POWDER = new SlimefunItemStack("ARCANE_POWDER",
    Material.BROWN_DYE,
    "&c奥术粉末",
    "&9魔法"
    );
    public static final SlimefunItemStack FIRE_STARTER = new SlimefunItemStack("FIRE_STARTER",
    Material.FLINT_AND_STEEL,
    "&c火种",
    "&9基础工具，可以点燃",
    "&9南极/贝拉火焰至",
    "&9较低温度"
    );
    public static final SlimefunItemStack ANTAR_FIRE = new SlimefunItemStack("ANTAR_FIRE",
    Material.CAMPFIRE,
    "&c南极火焰",
    "&9以附魔的火焰为催化剂。火焰颜色",
    "&9表示温度"
    );
    public static final SlimefunItemStack BELLA_FIRE = new SlimefunItemStack("BELLA_FIRE",
    Material.SOUL_CAMPFIRE,
    "&c贝拉火焰",
    "&9以附魔的火焰为催化剂。火焰颜色",
    "&9表示温度"
    );
    private NEItems() {
    }
}