import java.util.Random;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Node;
import javax.microedition.m3g.Transform;
import javax.microedition.m3g.Transformable;
import javax.microedition.m3g.World;

public final class Class_d6 {
   public static float var_2f = 0.2F;
   public static float var_46 = 2000.0F;
   private Group var_61;
   public Camera var_95;
   public Class_a0 var_d9;
   private Random var_12a;
   private Transform var_169;
   private float[] var_17e;
   private float var_1cb;
   private float var_20f;
   private float var_28b;
   private float var_2bf;
   private float var_30d;
   private int var_342;
   private byte var_372;
   public boolean var_3cc;
   private boolean var_3e9;

   public Class_d6(boolean var1) {
      this.var_3e9 = var1;
      this.var_12a = new Random();
      this.var_17e = new float[4];
      this.var_169 = new Transform();
      this.sub_2b8((byte)0, (Group)null);
      this.var_342 = 0;
      this.var_2bf = 50.0F;
   }

   public final void sub_3e() {
      this.var_61 = null;
      this.var_95 = null;
      if (this.var_d9 != null) {
         this.var_d9.sub_1fb();
      }

      this.var_d9 = null;
      this.var_12a = null;
      this.var_169 = null;
      this.var_17e = null;
   }

   public final void sub_93(Group var1, Group var2) {
      this.sub_bd(var1);
      this.sub_2b8((byte)3, var2);
   }

   public final void sub_bd(Group var1) {
      if (this.var_61 != null) {
         this.var_61.setRenderingEnable(true);
      }

      this.var_61 = var1;
      if (this.var_372 == 1) {
         this.var_61.setRenderingEnable(false);
      }

   }

   public final void sub_ce(Camera var1, int var2, int var3) {
      this.var_95 = var1;
      this.var_28b = (float)var2 / ((float)var3 * 1.0F);
      if (this.var_3e9) {
         ((Transformable)var1).setOrientation(180.0F, 0.0F, 1.0F, 0.0F);
      } else {
         ((Transformable)var1).setOrientation(0.0F, 0.0F, 1.0F, 0.0F);
      }

      var1.setPerspective(this.var_2bf, this.var_28b, var_2f, var_46);
   }

   public final void sub_12a(Group var1, Group var2, Group var3) {
      ++this.var_342;
      this.var_61.getTranslation(this.var_17e);
      int var4 = this.var_d9.sub_60(this.var_17e[0], this.var_17e[2]);
      float var5 = this.var_d9.sub_1dc(var4, this.var_17e);
      if (this.var_372 != 2) {
         if (this.var_342 > 20 && var5 < 9000.0F) {
            this.sub_2b8((byte)2, var1);
            return;
         }

         if (var5 > 15000.0F && this.var_342 > 50 && this.var_342 % 100 == 50) {
            switch (Math.abs(this.var_12a.nextInt()) % 5) {
               case 0:
                  this.sub_2b8((byte)0, (Group)null);
                  this.sub_bd(var2);
                  return;
               case 1:
                  this.sub_2b8((byte)0, (Group)null);
                  this.sub_bd(var3);
                  return;
               case 2:
                  if (this.var_372 != 1) {
                     this.sub_2b8((byte)1, (Group)null);
                     this.sub_bd(var2);
                     return;
                  }
                  break;
               case 3:
                  if (this.var_372 != 1) {
                     this.sub_2b8((byte)1, (Group)null);
                     this.sub_bd(var3);
                     return;
                  }
                  break;
               default:
                  return;
            }
         }
      } else if (var5 > 9000.0F) {
         this.sub_2b8((byte)0, (Group)null);
         this.var_95.setScale(1.0F, 1.0F, 1.0F);
         this.var_342 = 0;
      }

   }

   public final boolean sub_13f() {
      byte var1;
      if (this.var_3e9) {
         var1 = 1;
      } else {
         var1 = -1;
      }

      this.var_95.translate(0.0F, 0.0F, (float)var1 * 1.5F);
      boolean var2;
      if (var2 = ++this.var_30d > 69.5F) {
         this.sub_179();
      }

      return var2;
   }

   public final void sub_179() {
      this.var_95.setScale(1.0F, 1.0F, 1.0F);
      this.var_95.setOrientation(90.0F, 0.0F, 0.0F, 1.0F);
      this.sub_2b8((byte)0, (Group)null);
   }

   public final void sub_1b8(boolean var1) {
      if (var1 && this.var_2bf < 65.0F) {
         this.var_95.setPerspective(++this.var_2bf, this.var_28b, var_2f, var_46);
      } else if (!var1 && this.var_2bf > 50.0F) {
         this.var_95.setPerspective(--this.var_2bf, this.var_28b, var_2f, var_46);
      }

      if (var1) {
         int var2 = this.var_12a.nextInt() % 2 == 1 ? -1 : 1;
         this.var_95.translate(this.var_12a.nextFloat() % 0.05F * (float)var2, 0.0F, 0.0F);
      }

   }

   public final void sub_1fa(World var1, Class_53 var2) {
      Class_1cc.sub_419(this.var_61, var1, this.var_169, 0.0F, 0.0F, 0.0F, this.var_17e);
      switch (this.var_372) {
         case 0:
            double var3 = Math.toRadians((double)var2.sub_287());
            if (this.var_3cc) {
               this.var_95.setTranslation((float)((double)this.var_17e[0] + (double)this.var_20f * Math.sin(var3)), this.var_17e[1] + this.var_1cb, (float)((double)this.var_17e[2] + (double)this.var_20f * Math.cos(var3)));
               this.var_95.setOrientation(var2.sub_287(), 0.0F, 1.0F, 0.0F);
            } else {
               this.var_95.setTranslation((float)((double)this.var_17e[0] - (double)this.var_20f * Math.sin(var3)), this.var_17e[1] + this.var_1cb, (float)((double)this.var_17e[2] - (double)this.var_20f * Math.cos(var3)));
               this.var_95.setOrientation(var2.sub_287() + 180.0F, 0.0F, 1.0F, 0.0F);
            }

            this.var_95.postRotate(10.0F, -1.0F, 0.0F, 0.0F);
            return;
         case 1:
         default:
            this.var_95.setTranslation(this.var_17e[0], this.var_17e[1] + this.var_1cb, this.var_17e[2]);
            if (this.var_3cc) {
               this.var_95.setOrientation(var2.sub_2e1(), 0.0F, 1.0F, 0.0F);
            } else {
               this.var_95.setOrientation(var2.sub_2e1() + 180.0F, 0.0F, 1.0F, 0.0F);
            }

            this.var_95.postRotate(var2.var_52b, 0.0F, 0.0F, 1.0F);
            return;
         case 2:
            this.var_95.align((Node)null);
            this.var_95.setScale(-1.0F, 1.0F, -1.0F);
      }
   }

   public final void sub_234() {
      if (this.var_372 == 0) {
         this.sub_2b8((byte)1, (Group)null);
      } else {
         this.sub_2b8((byte)0, (Group)null);
      }
   }

   public final boolean sub_26f(Group var1) {
      return var1.equals(this.var_61);
   }

   private void sub_2b8(byte var1, Group var2) {
      if (this.var_61 != null) {
         this.var_61.setRenderingEnable(true);
      }

      this.var_372 = var1;
      switch (this.var_372) {
         case 1:
            this.var_61.setRenderingEnable(false);
            this.var_20f = -1.0F;
            this.var_1cb = 1.5F;
            return;
         case 2:
            this.var_d9.sub_bc(this.var_17e);
            this.var_95.setTranslation(this.var_17e[0], 2.75F, this.var_17e[1]);
            this.var_95.setAlignment(this.var_61, 145, var2, 147);
            return;
         case 3:
            return;
         default:
            this.var_3cc = false;
            this.var_20f = 6.85F;
            this.var_1cb = 2.75F;
      }
   }
}
