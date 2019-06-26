package com.Professor_Cool.myfirstmod.items;

import com.Professor_Cool.myfirstmod.MyFirstMod;
import net.minecraft.item.Item;

public class FirstItem extends Item {
    public FirstItem() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(MyFirstMod.setup.itemGroup));
        setRegistryName("firstitem");
    }
}
