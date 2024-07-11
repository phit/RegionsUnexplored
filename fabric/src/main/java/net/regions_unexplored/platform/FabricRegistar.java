package net.regions_unexplored.platform;

import net.minecraft.core.Registry;
import net.regions_unexplored.Constants;
import net.regions_unexplored.platform.services.IRegistar;

import java.util.function.Supplier;

public class FabricRegistar implements IRegistar {
    @Override
    public <T> Supplier<T> register(Registry<T> registry, String name, Supplier<T> value) {
        Registry.register(registry, Constants.id(name), value.get());
        return value;
    }
}
