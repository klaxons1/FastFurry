import javax.microedition.m3g.Group;
import javax.microedition.m3g.Light;

public final class Class_b4 extends Class_53 {
   private final float[] var_63 = new float[]{5.0F, 6.0F, 7.0F, 8.0F, 11.0F, 12.0F, 11.0F, 12.0F};
   private float[] var_8e;
   private float var_cc;
   private float var_11a;
   private int var_150;
   private boolean var_1a8;

   public Class_b4(Class_108 var1, GameMidlet var2, int var3, Group var4, Group var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, (Light)null, var6, var7, false);
      super.var_5af = 100.0F;
      super.var_672 = 90.0F;
      if (!super.var_12c.var_144c) {
         this.var_cc = this.var_63[super.var_12c.var_13bd];
      } else {
         this.var_cc = this.var_63[0];
      }

      this.var_8e = new float[3];
      super.var_869 = 1;
   }

   public final void sub_26() {
      Class_1cc.sub_419(super.var_137, super.var_14e, super.var_16b, 0.0F, 0.0F, 0.0F, super.var_2ba);
      super.var_33c[0] = super.var_33c[2] = super.var_2ba[0];
      super.var_33c[1] = super.var_33c[3] = super.var_2ba[2];
      super.var_869 = 1;
      super.var_7a0 = 2;
      super.var_6d7 = 0;
      super.var_543 = super.var_4d[super.var_7b8] + 1.0F;
   }

   public final void sub_5cc() {
      this.var_8e = null;
      super.sub_5cc();
   }

   public final void sub_51(float var1, Class_53 var2, boolean var3) {
      switch (super.var_835) {
         case 1:
            if (super.var_27b[8] == null) {
               return;
            } else {
               super.var_716 = (int)((float)super.var_716 + var1 * 1000.0F);
               ++super.var_807;
               Class_1cc.sub_419(super.var_137, super.var_14e, super.var_16b, 0.0F, 0.0F, 0.0F, super.var_2ba);
               ((Class_53)this).sub_581();
               if (++this.var_150 > 150 && !var3) {
                  var2.sub_5f0(this.var_8e);
                  this.var_11a = var2.var_498 - var2.var_4ec;
                  float var4 = super.var_2ba[0] - this.var_8e[0];
                  float var5 = super.var_2ba[2] - this.var_8e[2];
                  float var6 = var4 * var4 + var5 * var5;
                  switch (super.var_7a0) {
                     case 1:
                        super.var_543 = 0.25F;
                        if (var6 < 150.0F) {
                           this.sub_80(var1);
                        }

                        if (var6 > 20000.0F) {
                           if (!this.var_1a8) {
                              super.var_12c.sub_27d();
                              this.var_1a8 = true;
                           }

                           if (this.var_11a < 25.0F) {
                              super.var_498 = Math.min(super.var_498, 25.0F);
                           } else {
                              super.var_498 = this.var_11a - 10.0F;
                           }
                        } else {
                           this.var_1a8 = false;
                           super.var_543 = Math.max(0.0F, var2.var_543 - 5.0F);
                           super.var_498 = Math.min(super.var_42f, super.var_498);
                        }
                        break;
                     default:
                        this.sub_80(var1);
                        if (var6 > 20000.0F) {
                           super.var_498 = this.var_11a + this.var_cc;
                           if (super.var_498 > super.var_42f) {
                              super.var_498 = super.var_42f;
                           }

                           super.var_543 = super.var_4d[super.var_7b8];
                        }
                  }
               }

               ((Class_53)this).sub_a82(var1);
               ((Class_53)this).sub_882(var1);
               ((Class_53)this).sub_77e();
               ((Class_53)this).sub_7cb();
               ((Class_53)this).sub_9cb();
               if (super.var_137 != Class_1cc.var_190[2]) {
                  for(int var7 = 0; var7 < super.var_25c.length; ++var7) {
                     super.var_25c[var7].preRotate(45.0F, -1.0F, 0.0F, 0.0F);
                  }
               }

               super.var_33c[2] = super.var_2ba[0];
               super.var_33c[3] = super.var_2ba[2];
               super.var_1b7.setRenderingEnable(super.var_9b4);
            }
         default:
      }
   }

   public final void sub_704(float var1, float var2, float var3) {
      super.sub_704(var1, var2, var3);
      super.var_807 = 0;
   }

   private void sub_80(float var1) {
      if (super.var_5af > 0.0F && super.var_891 == 0) {
         ((Class_53)this).sub_4cd(var1);
      }

   }
}
