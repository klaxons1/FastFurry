import java.util.Vector;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.Light;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.Node;
import javax.microedition.m3g.Object3D;
import javax.microedition.m3g.Transform;
import javax.microedition.m3g.Transformable;

public class Class_53 {
   public final float[] var_36 = new float[]{51.0F, 53.0F, 52.5F};
   public final float[] var_40 = new float[]{0.0F, 2.0F, 4.0F, 6.0F, 8.0F, 10.0F, 14.0F, 16.0F};
   public final float[] var_4d = new float[]{10.0F, 10.0F, 10.0F};
   public final float[] var_a2 = new float[]{3.0F, 7.0F, 5.25F};
   public final float[] var_be = new float[]{15.0F, 6.0F, 4.0F, 2.0F};
   public GameMidlet var_121;
   public Class_108 var_12c;
   public Group var_137;
   public Group var_14e;
   public Transform var_16b;
   public Mesh var_1b7;
   private Image2D[] var_208;
   public Node[] var_25c;
   public Class_a0[] var_27b;
   public float[] var_2ba;
   public float[] var_2e8;
   public float[] var_33c;
   public float[] var_378;
   public float[] var_3c7;
   private int[] var_3ee;
   public float var_403;
   public float var_42f;
   public float var_464;
   public float var_487;
   public float var_498;
   public float var_4ec;
   public float var_52b;
   public float var_543;
   public float var_58f;
   public float var_5af;
   public float var_606;
   public float var_62e;
   public float var_654;
   public float var_672;
   public float var_695;
   public float var_6b4;
   public int var_6d7;
   public int var_716;
   public int var_72b;
   public int var_75a;
   public int var_76c;
   public int var_77a;
   public int var_7a0;
   public int var_7b8;
   public int var_7e4;
   public int var_807;
   public byte var_835;
   public byte var_869;
   public byte var_891;
   public byte var_8e8;
   public byte var_906;
   public byte var_954;
   public boolean var_9b4;
   public boolean var_9be;
   public boolean var_a0b;
   public boolean var_a1d;
   public boolean var_a41;
   private boolean var_a7b;
   public boolean var_a9a;
   public boolean var_aef;
   public boolean var_b23;
   public boolean var_b72;
   public boolean var_bbc;

   public Class_53(Class_108 var1, GameMidlet var2, int var3, Group var4, Group var5, Light var6, int var7, boolean var8, boolean var9) {
      this.var_137 = var4;
      this.var_14e = var5;
      this.var_12c = var1;
      this.var_121 = var2;
      this.var_7b8 = var3;
      this.var_b23 = var8;
      this.var_b72 = var9;
      this.var_42f = this.var_36[var3];
      if (!this.var_12c.var_144c) {
         if (this instanceof Class_b4) {
            this.var_42f += this.var_40[this.var_12c.var_13bd];
            this.var_403 = this.var_be[1];
         } else {
            this.sub_9f6(var7);
         }
      }

      this.sub_50();
      this.var_25c = new Node[3];
      this.var_25c[0] = (Node)((Object3D)var4).find(1001);
      this.var_25c[1] = (Node)((Object3D)var4).find(1000);
      this.var_25c[2] = (Node)((Object3D)var4).find(1002);

      for(int var10 = 0; var10 < this.var_25c.length; ++var10) {
         this.var_25c[var10].preRotate(0.0F, 0.0F, 0.0F, 0.0F);
      }

      this.var_208 = new Image2D[2];
      this.var_208[0] = Class_1cc.sub_8cd("/flame1.png");
      this.var_208[1] = Class_1cc.sub_8cd("/flame2.png");
      this.var_1b7 = Class_1cc.sub_61a(var3, var4);
      this.var_1b7.setRenderingEnable(false);
      this.var_16b = new Transform();
      this.var_33c = new float[4];
      this.var_378 = new float[7];
      this.var_2ba = new float[4];
      this.var_2e8 = new float[4];
      this.var_3c7 = new float[16];
      this.var_835 = 0;
      this.var_62e = Class_1cc.var_1e4[var3][0];
      this.var_654 = Class_1cc.var_1e4[var3][2];
      this.var_3ee = new int[2 * this.var_12c.var_1372];
      this.var_aef = false;
      if (var8) {
         this.var_464 = 180.0F;
      } else {
         this.var_464 = 0.0F;
      }

      ((Transformable)var4).setOrientation(this.var_464, 0.0F, 1.0F, 0.0F);
      this.var_1b7.getAppearance(0).getTexture(0).setImage(this.var_208[this.var_954]);
      this.var_bbc = false;
      this.var_807 = 5;
   }

   public void sub_26() {
      Class_1cc.sub_419(this.var_137, this.var_14e, this.var_16b, 0.0F, 0.0F, 0.0F, this.var_2ba);
      this.var_33c[0] = this.var_33c[2] = this.var_2ba[0];
      this.var_33c[1] = this.var_33c[3] = this.var_2ba[2];
      this.var_695 = 0.0F;
      this.var_869 = 1;
      this.var_7a0 = 2;
      this.var_a9a = false;
      this.var_75a = 0;
      this.var_7e4 = 2;
      this.var_77a = 0;
      this.var_606 = this.var_27b[7].sub_1dc(this.var_75a, this.var_2ba);
   }

   public final void sub_50() {
      this.var_672 = 55.0F + this.var_121.var_595;
   }

   public final void sub_76() {
      this.var_5af = 100.0F;
   }

   private boolean sub_d4(int var1, int var2, Vector var3) {
      boolean var4 = false;
      if (var3 == null) {
         var4 = this.var_12c.sub_428(var1, 2, var2);
      } else {
         for(int var5 = 0; var5 < var3.size(); ++var5) {
            int var6 = (Integer)var3.elementAt(var5);
            int var7 = this.var_12c.sub_b9(var6);
            if (var4 = this.var_12c.sub_44c(var1, var6, var7)) {
               break;
            }
         }
      }

      return var4;
   }

   public final void sub_e7(float var1, int var2, Vector var3) {
      switch (this.var_835) {
         case 0:
            this.sub_820();
            return;
         case 1:
            this.var_a7b = false;
            this.var_716 = (int)((float)this.var_716 + var1 * 1000.0F);
            if (!this.sub_d4(1, var2, var3) && !this.var_12c.var_17a1 && !this.var_12c.var_17c0) {
               if (++this.var_906 > 10) {
                  this.var_543 = this.var_4d[this.var_7b8];
               } else {
                  this.var_543 = 1.0F;
               }
            } else {
               this.var_543 = -15.0F;
               this.var_906 = 0;
            }

            if (!this.sub_d4(4, var2, var3) && !this.var_12c.var_1707 && !this.var_12c.var_172a && !this.var_12c.var_1748) {
               this.sub_581();
            } else {
               this.sub_4cd(var1);
               if (this.sub_1ee()) {
                  this.var_12c.sub_2dc(Class_1cc.sub_2dd(23));
               }
            }

            this.var_1b7.setRenderingEnable(this.var_9b4);
            if (!this.sub_d4(2, var2, var3) && !this.var_12c.var_172a && !this.var_12c.var_17a1) {
               if (this.sub_d4(3, var2, var3) || this.var_12c.var_1748 || this.var_12c.var_17c0) {
                  if (this.var_487 < 0.0F) {
                     float var5 = 30.0F * var1;
                     this.var_464 = Class_1cc.sub_8e3(this.var_464 - var5);
                     this.var_487 += var5;
                     if (this.var_487 >= 0.0F) {
                        this.var_487 = 0.0F;
                        this.var_891 = 0;
                     }
                  }

                  if (this.var_487 >= 0.0F && Math.abs(this.var_498) > 1.5F) {
                     this.var_8e8 = 1;
                     this.var_a7b = true;
                  }
               }
            } else {
               if (this.var_487 > 0.0F) {
                  float var4 = 30.0F * var1;
                  this.var_464 = Class_1cc.sub_8e3(this.var_464 + var4);
                  this.var_487 -= var4;
                  if (this.var_487 <= 0.0F) {
                     this.var_487 = 0.0F;
                     this.var_891 = 0;
                  }
               }

               if (this.var_487 <= 0.0F && Math.abs(this.var_498) > 1.5F) {
                  this.var_8e8 = -1;
                  this.var_a7b = true;
               }
            }

            if (this.var_a7b) {
               this.var_464 = Class_1cc.sub_8e3(this.var_464 + (float)this.var_8e8 * this.var_672 * var1);
               this.var_137.setOrientation(this.var_464, 0.0F, -1.0F, 0.0F);
               if (this.var_8e8 == -1) {
                  this.sub_8c6();
               } else {
                  this.sub_90c();
               }

               if (++this.var_891 > 2) {
                  this.var_891 = 2;
               }
            } else {
               this.sub_95a();
               if (this.var_891 > 0) {
                  --this.var_891;
               }
            }

            this.sub_882(var1);
            this.sub_77e();
            this.sub_7cb();
            this.sub_9cb();
            if (this.var_12c.var_1367 == 1) {
               this.sub_9ae();
            }

            this.var_33c[2] = this.var_2ba[0];
            this.var_33c[3] = this.var_2ba[2];
            return;
         case 2:
            this.var_543 = -15.0F;
            this.sub_862(var1);
            Class_1cc.sub_419(this.var_137, this.var_14e, this.var_16b, 0.0F, 0.0F, 0.0F, this.var_2ba);
            this.sub_a82(var1);
            this.sub_882(var1);
            this.sub_77e();
            this.sub_7cb();
            this.sub_9cb();
            if (this.var_12c.var_1367 == 1) {
               this.sub_9ae();
            }

            this.var_33c[2] = this.var_2ba[0];
            this.var_33c[3] = this.var_2ba[2];
         default:
      }
   }

   public final int sub_141(int var1, int var2) {
      return this.var_3ee[2 * (var1 - 1) + var2];
   }

   public final void sub_174() {
      if (this.var_9b4) {
         if (++this.var_954 >= this.var_208.length) {
            this.var_954 = 0;
         }

         this.var_1b7.getAppearance(0).getTexture(0).setImage(this.var_208[this.var_954]);
      }

   }

   public final void sub_193(boolean var1) {
      if (var1) {
         this.sub_581();
         this.var_1b7.setRenderingEnable(this.var_9b4);
         this.var_835 = 2;
         this.var_27b[8].sub_80();
         this.var_6d7 = this.var_75a;
         if (this.var_6d7 >= this.var_27b[8].var_44) {
            this.var_6d7 = 0;
            return;
         }
      } else {
         this.var_835 = 1;
      }

   }

   public final int sub_1a8() {
      return (int)(this.var_498 * 2.2356F);
   }

   public final String sub_1bd() {
      return Class_1cc.sub_516(this.var_716);
   }

   public final boolean sub_1ee() {
      return this.var_5af < 20.0F && this.var_5af > 0.0F;
   }

   public final boolean sub_229() {
      return this.var_891 >= 2;
   }

   public final boolean sub_265() {
      return this.var_835 == 1;
   }

   public final float sub_287() {
      return -this.var_464;
   }

   public final float sub_2e1() {
      return -(this.var_464 + this.var_487);
   }

   public final float sub_2fa() {
      return this.var_33c[0];
   }

   public final float sub_35b() {
      return this.var_33c[1];
   }

   public final boolean sub_3aa() {
      if (this.var_12c.var_1508) {
         return false;
      } else {
         return this.var_695 >= 100.0F;
      }
   }

   public final float sub_40c(float var1, float var2) {
      float var3 = this.sub_622() - var1;
      float var4 = this.sub_636() - var2;
      return var3 * var3 + var4 * var4;
   }

   public final boolean sub_42e() {
      if (this.var_b23) {
         return this.var_75a == this.var_27b[7].var_44 - 2 && this.var_33c[1] > this.var_12c.var_b95 && this.var_33c[3] < this.var_12c.var_b95 && this.var_33c[2] > this.var_12c.var_b13 && this.var_33c[2] < this.var_12c.var_b42;
      } else {
         return this.var_75a == this.var_27b[7].var_44 - 2 && this.var_33c[1] < this.var_12c.var_b95 && this.var_33c[3] > this.var_12c.var_b95 && this.var_33c[2] > this.var_12c.var_b13 && this.var_33c[2] < this.var_12c.var_b42;
      }
   }

   public final float sub_47a() {
      this.var_2ba[0] = this.var_33c[2];
      this.var_2ba[1] = 0.0F;
      this.var_2ba[2] = this.var_33c[3];
      float[] var1 = new float[2];
      this.var_27b[7].sub_d9(this.var_75a, var1);
      return this.var_27b[7].sub_137(this.var_75a, this.var_2ba);
   }

   public final boolean sub_49e(Class_53 var1) {
      if (this.var_869 != var1.var_869) {
         return this.var_869 > var1.var_869;
      } else if (this.var_75a != var1.var_75a) {
         if (this.var_75a == this.var_27b[7].var_44 - 2 && var1.var_75a == 0) {
            return false;
         } else if (this.var_75a == 0 && var1.var_75a == this.var_27b[7].var_44 - 2) {
            return true;
         } else {
            return this.var_75a > var1.var_75a;
         }
      } else {
         return var1.sub_47a() > this.sub_47a();
      }
   }

   public final void sub_4cd(float var1) {
      if (this.var_5af > 0.0F) {
         this.sub_174();
         if (!this.var_9b4) {
            this.var_9b4 = true;
            var1 = 0.0F;
            if (!(this instanceof Class_b4)) {
               this.var_12c.sub_1b0();
            }
         }

         if (!this.var_b72) {
            this.var_5af -= var1 * this.var_403;
            return;
         }
      } else {
         this.sub_581();
         if (!(this instanceof Class_b4)) {
            this.var_12c.sub_2dc(Class_1cc.sub_2dd(24));
         }
      }

   }

   public final float sub_51e() {
      return this.var_5af / 100.0F;
   }

   public final float sub_549() {
      return this.var_695 / 100.0F;
   }

   public final void sub_581() {
      this.var_9b4 = false;
   }

   public void sub_5cc() {
      this.var_121 = null;
      this.var_12c = null;
      this.var_137 = null;
      this.var_14e = null;
      this.var_16b = null;
      this.var_1b7 = null;
      this.var_208 = null;
      this.var_25c = null;
      if (this.var_27b != null) {
         for(int var1 = 0; var1 < this.var_27b.length; ++var1) {
            if (this.var_27b[var1] != null) {
               this.var_27b[var1].sub_1fb();
               this.var_27b[var1] = null;
            }
         }
      }

      this.var_27b = null;
      this.var_2ba = null;
      this.var_2e8 = null;
      this.var_33c = null;
      this.var_378 = null;
      this.var_3c7 = null;
      this.var_3ee = null;
   }

   public final void sub_5f0(float[] var1) {
      var1[0] = this.var_33c[2];
      var1[1] = 0.5F;
      var1[2] = this.var_33c[3];
   }

   public final float sub_622() {
      return this.var_33c[2];
   }

   public final float sub_636() {
      return this.var_33c[3];
   }

   public final void sub_686(float[] var1) {
      this.var_3c7[0] = -this.var_62e / 2.0F;
      this.var_3c7[1] = 0.0F;
      this.var_3c7[2] = this.var_654 / 2.0F;
      this.var_3c7[3] = 1.0F;
      this.var_3c7[4] = -this.var_3c7[0];
      this.var_3c7[5] = 0.0F;
      this.var_3c7[6] = this.var_3c7[2];
      this.var_3c7[7] = 1.0F;
      this.var_3c7[8] = -this.var_3c7[0];
      this.var_3c7[9] = 0.0F;
      this.var_3c7[10] = -this.var_3c7[2];
      this.var_3c7[11] = 1.0F;
      this.var_3c7[12] = this.var_3c7[0];
      this.var_3c7[13] = 0.0F;
      this.var_3c7[14] = -this.var_3c7[2];
      this.var_3c7[15] = 1.0F;
      System.arraycopy(this.var_3c7, 0, var1, 0, this.var_3c7.length);
   }

   public final void sub_6ea(Class_a0 var1, int var2) {
      this.var_27b[var2] = var1;
   }

   public void sub_704(float var1, float var2, float var3) {
      boolean var7 = false;
      boolean var8 = false;
      this.var_695 += this.var_498 / (this.var_42f + 15.0F) * 2.5F;
      if (this.var_695 > 100.0F) {
         this.var_695 = 100.0F;
      }

      this.var_498 *= 0.95F;
      this.var_137.setTranslation(this.var_33c[0], 0.5F, this.var_33c[1]);
      this.var_27b[0].sub_60(this.var_33c[0], this.var_33c[1]);
      this.var_27b[1].sub_60(this.var_33c[0], this.var_33c[1]);
      float var4 = 0.6F * (float)Math.sin((double)var1);
      float var5 = 0.6F * (float)Math.cos((double)var1);
      this.var_2e8[0] = 0.0F;
      this.var_2e8[1] = 0.0F;
      this.var_2e8[2] = 0.0F;
      this.var_2e8[3] = 1.0F;
      this.var_137.getCompositeTransform(this.var_16b);
      this.var_16b.transform(this.var_2e8);
      this.var_2ba[0] = this.var_33c[0];
      this.var_2ba[1] = this.var_33c[1];
      this.var_2ba[2] = this.var_2e8[0] + var4;
      this.var_2ba[3] = this.var_2e8[2] + var5;
      this.var_16b.invert();
      this.var_2e8[0] = var2;
      this.var_2e8[1] = 0.0F;
      this.var_2e8[2] = var3;
      this.var_2e8[3] = 1.0F;
      this.var_16b.transform(this.var_2e8);
      if (this.var_2e8[0] < 0.0F) {
         var8 = true;
      } else {
         var8 = false;
      }

      if (this.var_27b[0].sub_8b(this.var_2ba, false, (float[])null)) {
         var7 = true;
      } else if (this.var_27b[1].sub_8b(this.var_2ba, false, (float[])null)) {
         var7 = true;
      }

      if (!var7) {
         this.var_137.translate(var4, 0.0F, var5);
         byte var6;
         if (var8) {
            var6 = -1;
         } else {
            var6 = 1;
         }

         this.var_464 += (float)var6 * 8.0F;
         this.var_137.setOrientation(this.var_464, 0.0F, -1.0F, 0.0F);
         this.var_137.getCompositeTransform(this.var_16b);
         this.var_2ba[0] = 0.0F;
         this.var_2ba[1] = 0.0F;
         this.var_2ba[2] = 0.0F;
         this.var_2ba[3] = 1.0F;
         this.var_16b.transform(this.var_2ba);
         this.var_33c[2] = this.var_2ba[0];
         this.var_33c[3] = this.var_2ba[2];
      }

   }

   public final void sub_711(float var1, float var2) {
      this.var_27b[7].sub_179(var1, var2);
   }

   public final boolean sub_740(float[] var1, Group var2) {
      float var3 = -this.var_62e / 2.0F;
      float var4 = this.var_62e / 2.0F;
      float var5 = this.var_654 / 2.0F;
      float var6 = -this.var_654 / 2.0F;
      byte var12 = 0;
      byte var13 = 0;
      ((Node)var2).getTransformTo(this.var_137, this.var_16b);
      this.var_16b.transform(var1);

      for(int var11 = 0; var11 < 4; ++var11) {
         float var7 = var1[0 + var11 * 4];
         float var9 = var1[2 + var11 * 4];
         float var8 = var1[(0 + (var11 + 1) * 4) % var1.length];
         float var10 = var1[(2 + (var11 + 1) * 4) % var1.length];
         var12 = this.sub_a53(var7, var9, var3, var4, var6, var5);
         var13 = this.sub_a53(var8, var10, var3, var4, var6, var5);
         if (var12 == 0 && var13 == 0) {
            return true;
         }

         if ((var12 & var13) == 0) {
            return true;
         }
      }

      return false;
   }

   public final Class_a0 sub_753() {
      return this.var_27b[9];
   }

   public final void sub_77e() {
      float var5 = 0.0F;
      boolean var7 = false;
      this.var_27b[0].sub_60(this.var_2ba[0], this.var_2ba[2]);
      this.var_27b[1].sub_60(this.var_2ba[0], this.var_2ba[2]);
      if (this.var_27b[0].sub_8b(this.var_33c, true, this.var_378)) {
         var7 = true;
         var5 = (float)((byte)(this.var_b23 ? -1 : 1)) * 12.5F;
      } else if (this.var_27b[1].sub_8b(this.var_33c, true, this.var_378)) {
         var7 = true;
         var5 = (float)((byte)(this.var_b23 ? 1 : -1)) * 12.5F;
      }

      if (var7) {
         if (!(this instanceof Class_b4)) {
            this.var_12c.sub_220();
            this.var_12c.sub_1ff();
         }

         double var1 = Math.toRadians((double)this.var_378[6]);
         double var3 = (double)1.0F + Math.abs(Math.cos(var1 + Math.toRadians((double)this.sub_2e1()))) * (double)(this.var_498 / (this.var_42f + 15.0F)) * (double)2.5F;
         this.var_695 = (float)Math.min((double)this.var_695 + var3, (double)100.0F);
         this.var_2ba[0] = this.var_378[0];
         this.var_2ba[2] = this.var_378[1];
         float[] var10000 = this.var_2ba;
         var10000[0] += (float)((double)1.15F * Math.sin(var1));
         var10000 = this.var_2ba;
         var10000[2] += (float)((double)1.15F * Math.cos(var1));
         this.var_137.setTranslation(this.var_2ba[0], 0.5F, this.var_2ba[2]);
         this.var_464 += var5;
         this.var_137.setOrientation(this.var_464, 0.0F, -1.0F, 0.0F);
         this.var_498 *= 0.95F;
      }

   }

   public final void sub_7cb() {
      if (this.sub_42e()) {
         int var1;
         if (this.var_12c.var_1367 == 0 && (var1 = 2 * (this.var_869 - 1) + 1) < this.var_3ee.length) {
            this.var_3ee[var1] = this.var_716;
            this.var_12c.sub_25e(this instanceof Class_b4, this.var_869, 1);
         }

         ++this.var_869;
         if (this.var_716 < this.var_72b || this.var_72b == 0) {
            this.var_72b = this.var_716;
         }

         this.var_aef = true;
         this.var_716 = 0;
      } else {
         this.var_aef = false;
      }
   }

   public final void sub_820() {
      this.var_835 = 1;
      this.var_906 = 10;
   }

   public final void sub_862(float var1) {
      this.var_498 += this.var_543 * var1;
      if (this.var_498 < 0.0F) {
         this.var_498 = 0.0F;
      } else if (this.var_498 > this.var_42f) {
         this.var_498 = this.var_42f;
      }

      boolean var2 = this instanceof Class_b4;
      if (this.var_9b4) {
         this.var_58f = var2 ? 0.5F : 5.0F;
      } else {
         this.var_58f = -5.0F;
      }

      this.var_4ec += this.var_58f * var1;
      if (this.var_4ec < 0.0F) {
         this.var_4ec = 0.0F;
      } else if (this.var_4ec > (var2 ? 3.0F : 15.0F)) {
         this.var_4ec = 15.0F;
      }

      this.var_498 += this.var_4ec;
   }

   public final void sub_882(float var1) {
      this.sub_862(var1);
      if (this.sub_229()) {
         this.var_487 += (float)this.var_8e8 * 15.0F * var1;
         if (this.var_487 < -25.0F) {
            this.var_487 = -25.0F;
         } else if (this.var_487 > 25.0F) {
            this.var_487 = 25.0F;
         }

         if (Math.abs(this.var_487) > 14.0F && !(this instanceof Class_b4)) {
            if (!this.var_bbc) {
               this.var_bbc = true;
               this.var_12c.sub_16f();
            }
         } else {
            this.var_bbc = false;
         }

         this.var_137.setOrientation(this.var_464 + this.var_487, 0.0F, -1.0F, 0.0F);
      } else if (this.var_487 != 0.0F) {
         float var2 = (float)this.var_8e8 * 15.0F * var1;
         this.var_464 = Class_1cc.sub_8e3(this.var_464 + var2);
         this.var_487 -= var2;
         if (this.var_8e8 == -1 && this.var_487 > 0.0F) {
            this.var_487 = 0.0F;
            this.var_891 = 0;
         } else if (this.var_8e8 == 1 && this.var_487 < 0.0F) {
            this.var_487 = 0.0F;
            this.var_891 = 0;
         }

         this.var_137.setOrientation(this.var_464 + this.var_487, 0.0F, -1.0F, 0.0F);
      }

      this.var_2ba[0] = 0.0F;
      this.var_2ba[1] = 0.0F;
      this.var_2ba[2] = this.var_498 * var1;
      this.var_2ba[3] = 1.0F;
      this.var_137.getCompositeTransform(this.var_16b);
      this.var_16b.transform(this.var_2ba);
      this.var_137.setTranslation(this.var_2ba[0], this.var_2ba[1], this.var_2ba[2]);
      this.var_33c[0] = this.var_33c[2];
      this.var_33c[1] = this.var_33c[3];
      this.var_33c[2] = this.var_2ba[0];
      this.var_33c[3] = this.var_2ba[2];
   }

   public final void sub_8c6() {
      if (--this.var_52b < -this.var_a2[this.var_7b8]) {
         this.var_52b = -this.var_a2[this.var_7b8];
      }

      this.var_137.getChild(0).setOrientation(this.var_52b, 0.0F, 0.0F, 1.0F);
   }

   public final void sub_90c() {
      if (++this.var_52b > this.var_a2[this.var_7b8]) {
         this.var_52b = this.var_a2[this.var_7b8];
      }

      this.var_137.getChild(0).setOrientation(this.var_52b, 0.0F, 0.0F, 1.0F);
   }

   public final void sub_95a() {
      if (this.var_52b > 0.0F) {
         if (--this.var_52b < 0.0F) {
            this.var_52b = 0.0F;
         }

         this.var_137.getChild(0).setOrientation(this.var_52b, 0.0F, 0.0F, 1.0F);
      } else {
         if (this.var_52b < 0.0F) {
            if (++this.var_52b > 0.0F) {
               this.var_52b = 0.0F;
            }

            this.var_137.getChild(0).setOrientation(this.var_52b, 0.0F, 0.0F, 1.0F);
         }

      }
   }

   public final void sub_9a2() {
      int var2;
      if ((var2 = this.var_27b[7].var_44 / 2) % 2 == 1) {
         ++var2;
      }

      int var3;
      if ((var3 = (this.var_869 - 1) * 2) < this.var_3ee.length && this.var_75a == var2) {
         this.var_3ee[var3] = this.var_716;
         this.var_12c.sub_25e(this instanceof Class_b4, this.var_869, 0);
      }

   }

   public final void sub_9ae() {
      if (this.var_27b[9].sub_137(this.var_7e4, this.var_2ba) < 200.0F) {
         this.var_12c.sub_2cf((this.var_7e4 - 2) / 6 + 1);
         this.var_7e4 += 6;
         if (this.var_7e4 > this.var_27b[9].var_44) {
            this.var_7e4 = 2;
         }

         this.sub_76();
      }

   }

   public final void sub_9cb() {
      float var1 = this.var_27b[7].sub_137(this.var_75a, this.var_2ba);
      if (this.var_aef) {
         this.var_75a = 0;
         this.sub_9a2();
      } else if (var1 < 1000.0F && this.var_75a != this.var_27b[7].var_44 - 2) {
         this.var_75a += 2;
         this.sub_9a2();
      }

      if (var1 > this.var_606) {
         ++this.var_77a;
      } else {
         this.var_77a = 0;
      }

      this.var_606 = var1;
      this.var_a9a = this.var_77a > 60;
      if (!this.var_a9a) {
         this.var_a0b = false;
         this.var_9be = false;
         this.var_a41 = false;
         this.var_a1d = false;
         this.var_76c = this.var_27b[3].sub_60(this.var_2ba[0], this.var_2ba[2]);
         if (this.var_27b[3].sub_1dc(this.var_76c, this.var_2ba) < 2000.0F) {
            this.var_a0b = true;
         }

         this.var_76c = this.var_27b[4].sub_60(this.var_2ba[0], this.var_2ba[2]);
         if (this.var_27b[4].sub_1dc(this.var_76c, this.var_2ba) < 2000.0F) {
            this.var_9be = true;
         }

         this.var_76c = this.var_27b[5].sub_60(this.var_2ba[0], this.var_2ba[2]);
         if (this.var_27b[5].sub_1dc(this.var_76c, this.var_2ba) < 2000.0F) {
            this.var_a41 = true;
         }

         this.var_76c = this.var_27b[6].sub_60(this.var_2ba[0], this.var_2ba[2]);
         if (this.var_27b[6].sub_1dc(this.var_76c, this.var_2ba) < 2000.0F) {
            this.var_a1d = true;
         }
      }

   }

   private void sub_9f6(int var1) {
      int var2 = (var1 & 12288) >> 12;
      this.var_5af = 100.0F;
      this.var_403 = this.var_be[var2];
      if ((var2 = (var1 & 3) >> 0) > 0) {
         float[] var10000 = this.var_4d;
         int var10001 = this.var_7b8;
         var10000[var10001] += (float)var2 * 0.1F;
         this.var_42f += (float)var2 * 1.0F;
      }

      if ((var2 = (var1 & 12) >> 2) > 0) {
         float[] var9 = this.var_4d;
         int var14 = this.var_7b8;
         var9[var14] += (float)var2 * 0.02F;
         this.var_42f += (float)var2 * 0.5F;
      }

      if ((var2 = (var1 & 48) >> 4) > 0) {
         float[] var10 = this.var_4d;
         int var15 = this.var_7b8;
         var10[var15] += (float)var2 * 0.06F;
         this.var_42f += (float)var2 * 1.0F;
      }

      if ((var2 = (var1 & 192) >> 6) > 0) {
         float[] var11 = this.var_4d;
         int var16 = this.var_7b8;
         var11[var16] += (float)var2 * 0.03F;
         this.var_42f += (float)var2 * 0.5F;
      }

      if ((var2 = (var1 & '쀀') >> 14) > 0) {
         float[] var12 = this.var_4d;
         int var17 = this.var_7b8;
         var12[var17] += (float)var2 * 0.1F;
         this.var_42f += (float)var2 * 1.5F;
      }

      if ((var2 = (var1 & 196608) >> 16) > 0) {
         float[] var13 = this.var_4d;
         int var18 = this.var_7b8;
         var13[var18] += (float)var2 * 0.1F;
         this.var_42f += (float)var2 * 2.0F;
      }

   }

   private byte sub_a53(float var1, float var2, float var3, float var4, float var5, float var6) {
      byte var7 = 0;
      if (var1 < var3) {
         var7 = 8;
      } else if (var1 > var4) {
         var7 = 4;
      }

      if (var2 < var5) {
         var7 = (byte)(var7 | 2);
      } else if (var2 > var6) {
         var7 = (byte)(var7 | 1);
      }

      return var7;
   }

   public final void sub_a82(float var1) {
      this.var_27b[8].sub_d9(this.var_6d7, this.var_33c);
      if (this.var_27b[8].sub_1dc(this.var_6d7, this.var_2ba) < 250.0F) {
         if ((this.var_6d7 += 2) >= this.var_27b[8].var_44) {
            this.var_6d7 = 0;
         }

         this.var_27b[8].sub_d9(this.var_6d7, this.var_33c);
      }

      float var3 = this.var_2ba[0] - this.var_33c[0];
      float var4 = this.var_33c[1] - this.var_2ba[2];
      float var6 = this.var_464 + this.var_487;
      this.var_6b4 = Class_1cc.sub_777(var3, var4, false);
      this.var_6b4 = Class_1cc.sub_8e3(this.var_6b4);
      var6 = Class_1cc.sub_8e3(var6);
      if (this.var_498 > 5.0F && this.var_807 >= 5) {
         if (Math.abs(this.var_6b4 - var6) >= 2.75F) {
            float var2 = Math.abs(this.var_6b4 - var6);
            if (Math.abs(this.var_6b4 - var6) > 180.0F) {
               this.var_6b4 -= 360.0F;
               var2 = Math.abs(this.var_6b4 - var6);
            }

            var2 = Math.min(this.var_672 * var1, var2);
            Class_1cc.sub_419(this.var_14e, this.var_137, this.var_16b, this.var_33c[0], 0.0F, this.var_33c[1], this.var_2ba);
            if (this.var_2ba[0] < 0.0F) {
               this.var_8e8 = 1;
            } else {
               this.var_8e8 = -1;
            }

            if (this.var_8e8 == -1) {
               this.sub_8c6();
            } else {
               this.sub_90c();
            }

            if (++this.var_891 > 2) {
               this.var_891 = 2;
            }

            this.var_464 += var2 * (float)this.var_8e8;
            this.var_137.setOrientation(this.var_464, 0.0F, -1.0F, 0.0F);
            return;
         }

         this.sub_95a();
         if (this.var_891 > 0) {
            --this.var_891;
         }
      }

   }
}
