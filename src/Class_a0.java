import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public final class Class_a0 {
   public int var_44;
   private float[] var_93;
   private float var_dc;
   private float var_11b;
   private float var_13a;
   private float var_152;
   private float var_1b5;
   private float var_1f6;
   private float var_232;
   private float var_269;
   private float var_2b9;
   private float var_31b;
   private float var_336;
   private int var_344;
   private int var_3a3;
   private byte var_3dd;

   public Class_a0(byte[] var1, byte var2) {
      this.var_3dd = var2;
      this.var_3a3 = -1;

      try {
         DataInputStream var3 = new DataInputStream(new ByteArrayInputStream(var1));

         try {
            this.var_344 = var3.readShort();
            this.var_44 = this.var_344;
            this.var_93 = new float[this.var_344];

            for(int var4 = 0; var4 < this.var_344; ++var4) {
               this.var_93[var4] = var3.readFloat();
            }
         } finally {
            var3.close();
         }

      } catch (Exception var9) {
      }
   }

   public Class_a0(Class_a0 var1) {
      this.var_3dd = var1.var_3dd;
      this.var_3a3 = var1.var_3a3;
      this.var_344 = var1.var_344;
      this.var_44 = var1.var_44;
      this.var_93 = new float[this.var_344];
      System.arraycopy(var1.var_93, 0, this.var_93, 0, this.var_344);
   }

   public final void sub_1b(int var1) {
      this.sub_2b9(0.15F + Class_1cc.var_1e4[var1][0] / 2.0F);
   }

   public final int sub_60(float var1, float var2) {
      if (this.var_44 == 0) {
         return 0;
      } else {
         if (this.var_3a3 == -1) {
            float var5 = Float.MAX_VALUE;

            for(int var6 = this.var_344 - 2; var6 >= 0; var6 -= 2) {
               float var4;
               if ((var4 = this.sub_229(var1 - this.var_93[var6], var2 - this.var_93[var6 + 1])) < var5) {
                  var5 = var4;
                  this.var_3a3 = var6;
               }
            }
         } else {
            float var9 = Float.MAX_VALUE;
            int var3;
            byte var10;
            if (this.var_3dd == 11) {
               var3 = this.var_3a3 + 2;
               var10 = 3;
            } else {
               var3 = this.var_3a3 + 4;
               var10 = 5;
            }

            if (var3 >= this.var_44) {
               var3 -= this.var_44;
            }

            for(int var7 = var10; var7 > 0; --var7) {
               if (var3 + 1 < this.var_93.length) {
                  float var8;
                  if ((var8 = this.sub_229(var1 - this.var_93[var3], var2 - this.var_93[var3 + 1])) < var9) {
                     var9 = var8;
                     this.var_3a3 = var3;
                  }

                  var3 -= 2;
                  if (var3 < 0) {
                     var3 += this.var_44;
                  }
               }
            }
         }

         return this.var_3a3;
      }
   }

   public final void sub_80() {
      this.var_3a3 = -1;
   }

   public final boolean sub_8b(float[] var1, boolean var2, float[] var3) {
      int var4 = (this.var_3a3 + 6) % this.var_344;
      int var5 = 0;
      boolean var6 = false;
      boolean var7 = false;
      this.var_dc = var1[0];
      this.var_11b = var1[2];
      this.var_1b5 = var1[1];
      this.var_1f6 = var1[3];

      for(int var8 = 6; var8 > 0; --var8) {
         if ((var5 = var4 - 2) < 0) {
            var5 += this.var_344;
         }

         this.var_13a = this.var_93[var5];
         this.var_232 = this.var_93[var5 + 1];
         this.var_152 = this.var_93[var4];
         this.var_269 = this.var_93[var4 + 1];
         if (var7 = this.sub_276() && this.var_2b9 >= 0.0F && this.var_2b9 <= 1.0F && this.var_31b >= 0.0F && this.var_31b <= 1.0F) {
            break;
         }

         var4 = var5;
      }

      if (var7 && var2) {
         var3[0] = this.var_dc + this.var_2b9 * (this.var_11b - this.var_dc);
         var3[1] = this.var_1b5 + this.var_2b9 * (this.var_1f6 - this.var_1b5);
         var3[2] = var1[0];
         var3[3] = var1[1];
         var3[4] = this.var_152;
         var3[5] = this.var_269;
         var3[6] = this.sub_2e4(var4, var5, this.var_3dd == 0);
      }

      return var7;
   }

   public final void sub_bc(float[] var1) {
      var1[0] = this.var_93[this.var_3a3];
      var1[1] = this.var_93[this.var_3a3 + 1];
   }

   public final void sub_d9(int var1, float[] var2) {
      var2[0] = this.var_93[var1];
      var2[1] = this.var_93[var1 + 1];
   }

   public final float sub_137(int var1, float[] var2) {
      float var3 = this.var_93[var1] - var2[0];
      float var4 = this.var_93[var1 + 1] - var2[2];
      return var3 * var3 + var4 * var4;
   }

   public final void sub_179(float var1, float var2) {
      float[] var3 = new float[this.var_344];
      System.arraycopy(this.var_93, 0, var3, 0, this.var_344);
      this.var_344 += 2;
      this.var_44 = this.var_344;
      this.var_93 = new float[this.var_344];
      System.arraycopy(var3, 0, this.var_93, 0, var3.length);
      this.var_93[this.var_344 - 2] = var1;
      this.var_93[this.var_344 - 1] = var2;
      Runtime.getRuntime().gc();
   }

   public final float sub_1dc(int var1, float[] var2) {
      if (this.var_44 == 0) {
         return Float.MAX_VALUE;
      } else {
         float var3 = this.var_93[var1] - var2[0];
         float var4 = this.var_93[var1 + 1] - var2[2];
         return var3 * var3 + var4 * var4;
      }
   }

   public final void sub_1fb() {
      this.var_93 = null;
      Runtime.getRuntime().gc();
   }

   private float sub_229(float var1, float var2) {
      return var1 * var1 + var2 * var2;
   }

   private boolean sub_276() {
      this.var_336 = (this.var_269 - this.var_232) * (this.var_11b - this.var_dc) - (this.var_152 - this.var_13a) * (this.var_1f6 - this.var_1b5);
      if (this.var_336 == 0.0F) {
         return false;
      } else {
         this.var_2b9 = ((this.var_152 - this.var_13a) * (this.var_1b5 - this.var_232) - (this.var_269 - this.var_232) * (this.var_dc - this.var_13a)) / this.var_336;
         this.var_31b = ((this.var_11b - this.var_dc) * (this.var_1b5 - this.var_232) - (this.var_1f6 - this.var_1b5) * (this.var_dc - this.var_13a)) / this.var_336;
         return true;
      }
   }

   private void sub_2b9(float var1) {
      for(int var4 = 0; var4 < this.var_344; var4 += 2) {
         int var3;
         if ((var3 = var4 - 2) < 0) {
            var3 = this.var_93.length - 2;
         }

         float var2 = this.sub_2e4(var4, var3, this.var_3dd == 0);
         float[] var10000 = this.var_93;
         var10000[var4] = (float)((double)var10000[var4] + (double)var1 * Math.sin(Math.toRadians((double)var2)));
         var10000 = this.var_93;
         var10000[var4 + 1] = (float)((double)var10000[var4 + 1] + (double)var1 * Math.cos(Math.toRadians((double)var2)));
      }

   }

   private float sub_2e4(int var1, int var2, boolean var3) {
      float var4 = this.sub_2f1(var1, var2);
      if (var3) {
         var4 -= 90.0F;
      } else {
         var4 += 90.0F;
      }

      return var4;
   }

   private float sub_2f1(int var1, int var2) {
      float var4 = this.var_93[var1] - this.var_93[var2];
      float var5 = this.var_93[var1 + 1] - this.var_93[var2 + 1];
      return Class_1cc.sub_777(var4, var5, false);
   }
}
