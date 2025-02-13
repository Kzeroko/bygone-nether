package com.izofar.bygonenether.client.renderer;

import com.izofar.bygonenether.BygoneNetherMod;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PiglinRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Mob;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PiglinPrisonerRenderer extends PiglinRenderer {
	
	private static final ResourceLocation PIGLIN_PRISONER_LOCATION = new ResourceLocation(BygoneNetherMod.MODID, "textures/entity/piglin_prisoner.png");

	public PiglinPrisonerRenderer(EntityRendererProvider.Context context) {
		super(context, ModelLayers.PIGLIN, ModelLayers.PIGLIN_INNER_ARMOR, ModelLayers.PIGLIN_OUTER_ARMOR, false);
	}

	@Override
	public ResourceLocation getTextureLocation(Mob mob) { return PIGLIN_PRISONER_LOCATION; }
}
