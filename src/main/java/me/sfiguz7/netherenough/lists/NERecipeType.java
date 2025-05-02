package me.sfiguz7.netherenough.lists;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.sfiguz7.netherenough.NetherEnough;
import org.bukkit.NamespacedKey;

public class NERecipeType {

    static final NetherEnough instance = NetherEnough.getInstance();

    public static final RecipeType ALEMBIC = new RecipeType(new NamespacedKey(instance, "alembic"),
            NEItems.ALEMBIC
    );
}

