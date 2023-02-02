package mod.linguardium.skipbignbt.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin( targets = "net.minecraft.nbt.NbtCompound$1")
public class IgnoreBigNBTMixin {
    @ModifyConstant(method = "read*",constant = @Constant(intValue = 512))
    public int biggerDepth(int original) {
        return Integer.MAX_VALUE;
    }
}
