package com.magitechserver.aepatch2.mixin;

import appeng.util.Platform;
import com.magitechserver.aepatch2.AEPatch2;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.util.FakePlayerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Created by Frani on 18/10/2018.
 */
@Mixin(value = Platform.class, remap = false)
public abstract class MixinPlatform {

    @Inject(method = "getPlayer", at = @At("RETURN"), cancellable = true)
    private static void onGetPlayer(WorldServer server, CallbackInfoReturnable<EntityPlayer> cir) {
        cir.setReturnValue(FakePlayerFactory.get(server, AEPatch2.AE2Profile));
    }

}
