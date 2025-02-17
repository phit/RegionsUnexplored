package net.regions_unexplored.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;

@SuppressWarnings("unused")
public class LeafParticle extends TextureSheetParticle {
    private static final float ACCELERATION_SCALE = 1F;
    private static final int INITIAL_LIFETIME = 300;
    private static final int CURVE_ENDPOINT_TIME = 300;
    private static final float FALL_ACC = 1F;
    private static final float WIND_BIG = 2.0F;
    private float rotSpeed;
    private final float particleRandom;
    private final float spinAcceleration;

    public LeafParticle(ClientLevel clientLevel, double p_278010_, double p_277614_, double p_277673_, SpriteSet spriteSet) {
        super(clientLevel, p_278010_, p_277614_, p_277673_);
        this.setSprite(spriteSet.get(this.random.nextInt(4), 4));
        this.rotSpeed = (float)Math.toRadians(this.random.nextBoolean() ? -30.0D : 30.0D);
        this.particleRandom = this.random.nextFloat();
        this.spinAcceleration = (float)Math.toRadians(this.random.nextBoolean() ? -5.0D : 5.0D);
        this.lifetime = 300;
        this.gravity = -0.04F;
        float f = this.random.nextBoolean() ? 0.06F : 0.085F;
        this.quadSize = f;
        this.setSize(f, f);
        this.friction = 1.0F;
    }

    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        if (this.lifetime-- <= 0) {
            this.remove();
        }

        if (!this.removed) {
            float f = (float)(300 - this.lifetime);
            float f1 = Math.min(f / 300.0F, 1.0F);
            double d0 = Math.cos(Math.toRadians(this.particleRandom * 60.0F)) * 2.0D * Math.pow((double)f1, 1.25D);
            double d1 = Math.sin(Math.toRadians(this.particleRandom * 60.0F)) * 2.0D * Math.pow((double)f1, 1.25D);
            this.xd += d0 * (double)0.0025F;
            this.zd += d1 * (double)0.0025F;
            this.yd = this.gravity;
            this.rotSpeed += this.spinAcceleration / 20.0F;
            this.oRoll = this.roll;
            this.roll += this.rotSpeed / 20.0F;
            this.move(this.xd, this.yd, this.zd);
            if (this.onGround || this.lifetime < 299 && (this.xd == 0.0D || this.zd == 0.0D)) {
                this.remove();
            }

            if (!this.removed) {
                this.xd *= this.friction;
                //this.yd *= (double)this.friction;
                this.zd *= this.friction;
            }
        }
    }
}