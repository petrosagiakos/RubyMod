package com.example.rubymod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.example.rubymod.entity.custom.ElephantEntity;
import com.example.rubymod.RubyMod;

import net.minecraft.client.model.EntityModel;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class ElephantModel<T extends ElephantEntity> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(RubyMod.MODID, "elephant"), "main");
    private final ModelPart root;
    private final ModelPart bone7;
	private final ModelPart bone6;
	private final ModelPart bone5;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart bone4;
	private final ModelPart bone14;
	private final ModelPart bone15;
	private final ModelPart bone3;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart bone;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone2;
	private final ModelPart bone8;
	private final ModelPart bone9;

	public ElephantModel(ModelPart root) {
        this.root=root;
		this.bone7 = root.getChild("bone7");
		this.bone6 = root.getChild("bone6");
        
		this.bone5 = root.getChild("bone5");
		this.bone16 = this.bone5.getChild("bone16");
		this.bone17 = this.bone5.getChild("bone17");
		this.bone4 = root.getChild("bone4");
		this.bone14 = this.bone4.getChild("bone14");
		this.bone15 = this.bone4.getChild("bone15");
		this.bone3 = root.getChild("bone3");
		this.bone12 = this.bone3.getChild("bone12");
		this.bone13 = this.bone3.getChild("bone13");
		this.bone = root.getChild("bone");
		this.bone10 = this.bone.getChild("bone10");
		this.bone11 = this.bone.getChild("bone11");
		this.bone2 = root.getChild("bone2");
		this.bone8 = this.bone2.getChild("bone8");
		this.bone9 = this.bone2.getChild("bone9");
        
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.0F, -3.0F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(1.0F, 20.0F, -4.0F));

		PartDefinition cube_r1 = bone6.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone16 = bone5.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offset(-1.0F, -3.0F, -7.0F));

		PartDefinition cube_r2 = bone16.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 8).addBox(2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone17 = bone5.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone17.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(10, 11).addBox(1.0F, -4.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(3.0F, 24.0F, 1.0F));

		PartDefinition bone14 = bone4.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition cube_r4 = bone14.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone15 = bone4.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone15.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(4, 12).addBox(0.0F, -3.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(3.0F, 24.0F, 1.0F));

		PartDefinition bone12 = bone3.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition cube_r6 = bone12.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 8).addBox(0.0F, -3.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone13 = bone3.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone13.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(8, 14).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.0F, 24.0F, 1.0F));

		PartDefinition bone10 = bone.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition cube_r8 = bone10.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 15).addBox(-4.0F, -3.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone11 = bone.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone11.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 14).addBox(-4.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0F, 24.0F, 1.0F));

		PartDefinition bone8 = bone2.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition cube_r10 = bone8.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(4, 15).addBox(-4.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone9 = bone2.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone9.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(14, 11).addBox(-4.0F, -3.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.animateWalk(ElephantAnimations.WALKING, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(entity.idleAnimationState, ElephantAnimations.ATTACK,  ageInTicks, 1f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		this.root.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}
    @Override
    public ModelPart root() {
        return this.root;
    }
}
