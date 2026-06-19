package com.harman2009.glintcontroller.mixin;

import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import com.harman2009.glintcontroller.GlintControllerConfig;

@Mixin(ItemStack.class)
public class ItemStackMixin {
    @Inject(method = "hasGlint", at = @At("HEAD"), cancellable = true)
    private void onHasGlint(CallbackInfoReturnable<Boolean> cir) {
        if (!GlintControllerConfig.enableGlint) {
            cir.setReturnValue(false);
        }
    }
}
