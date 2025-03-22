package com.kraskaska.minecraft.mods.rubberbandingsfx.mixin;

import com.kraskaska.minecraft.mods.rubberbandingsfx.RubberbandingSfx;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPacketListener.class)
public class TeleportTargetMixin {
    @Inject(at = @At("HEAD"), method = "handleMovePlayer(Lnet/minecraft/network/protocol/game/ClientboundPlayerPositionPacket;)V")
    public void playSoundOnTeleport(ClientboundPlayerPositionPacket clientboundPlayerPositionPacket, CallbackInfo ci) {
        Player player = ((TeleportTargetMinecraftAccessor) this)
                .minecraft()
                .player;
        if(player != null) {
            player.playSound(SoundEvent.createFixedRangeEvent(ResourceLocation.fromNamespaceAndPath(RubberbandingSfx.MOD_ID, "entity.player.rubberband"), 1));
        }
    }
}
