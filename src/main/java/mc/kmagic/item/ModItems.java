package mc.kmagic.item;

import mc.kmagic.KMagic;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(KMagic.MOD_ID, name), item)
    }

    public static void registerModItems () {
        KMagic.LOGGER.info("Registering Mod Items for " + KMagic.MOD_ID);
    }
}
