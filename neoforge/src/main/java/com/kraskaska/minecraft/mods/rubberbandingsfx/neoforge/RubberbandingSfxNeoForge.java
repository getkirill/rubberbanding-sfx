package com.kraskaska.minecraft.mods.rubberbandingsfx.neoforge;

import com.kraskaska.minecraft.mods.rubberbandingsfx.RubberbandingSfx;
import net.neoforged.fml.common.Mod;

@Mod(RubberbandingSfx.MOD_ID)
public final class RubberbandingSfxNeoForge {
    public RubberbandingSfxNeoForge() {
        // Run our common setup.
        RubberbandingSfx.init();
    }
}
