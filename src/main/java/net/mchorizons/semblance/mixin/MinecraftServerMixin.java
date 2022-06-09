package net.mchorizons.semblance.mixin;

import net.mchorizons.semblance.Config;
import net.mchorizons.semblance.MinecraftServerInterface;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin implements MinecraftServerInterface {
	@Override
	public String getServerModName() {
		return Config.getServerBrand();
	}
}
