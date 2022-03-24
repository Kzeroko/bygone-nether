package com.izofar.bygonenether.client.renderer;

import com.izofar.bygonenether.BygoneNetherMod;
import com.izofar.bygonenether.client.model.WexModel;
import com.izofar.bygonenether.entity.WexEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WexRenderer extends HumanoidMobRenderer<WexEntity, WexModel> {

	private static final ResourceLocation WEX_LOCATION = new ResourceLocation(BygoneNetherMod.MODID, "textures/entity/wex/wex.png");
	private static final ResourceLocation WEX_CHARGING_LOCATION = new ResourceLocation(BygoneNetherMod.MODID, "textures/entity/wex/wex_charging.png");

	public WexRenderer(Context context) { super(context, new WexModel(context.bakeLayer(ModelLayers.VEX)), 0.3F); }

	@Override
	protected int getBlockLightLevel(WexEntity wex, BlockPos blockPos) { return 15; }

	@Override
	public ResourceLocation getTextureLocation(WexEntity wex) { return wex.isCharging() ? WEX_CHARGING_LOCATION : WEX_LOCATION; }

	@Override
	protected void scale(WexEntity wex, PoseStack stack, float f) { stack.scale(0.4F, 0.4F, 0.4F); }

}
