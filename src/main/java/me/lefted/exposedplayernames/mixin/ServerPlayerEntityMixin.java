package me.lefted.exposedplayernames.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.server.network.ServerPlayerEntity;

@Mixin(ServerPlayerEntity.class)
@Environment(EnvType.SERVER)
public abstract class ServerPlayerEntityMixin {

    @Overwrite
    public boolean allowsServerListing() {
        return true;
    }
}
