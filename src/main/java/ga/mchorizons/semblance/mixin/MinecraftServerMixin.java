package ga.mchorizons.semblance.mixin;

import ga.mchorizons.semblance.Config;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin implements ga.mchorizons.semblance.MinecraftServerInterface {
	@Override
	public String getServerModName() {
		return Config.getServerBrand();
	}
}
