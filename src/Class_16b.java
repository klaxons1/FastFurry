import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Background;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Light;
import javax.microedition.m3g.Transformable;
import javax.microedition.m3g.World;

public final class Class_16b implements Class_2b9, CommandListener {
   private final String var_22 = "{0}{1} " + Class_1cc.sub_2dd(106) + "{2}";
   private final int var_71 = Class_1cc.sub_7b9() * 2 + 1;
   private final int var_83 = Class_1cc.sub_7b9() + 2;
   private final int var_bf;
   private final Object[] var_da;
   private final int[][] var_10c;
   private GameMidlet var_15e;
   private Class_7d var_16f;
   private Graphics3D var_181;
   private World var_20d;
   private Group var_266;
   private Image var_2a0;
   private Image var_2bb;
   private Image var_313;
   private String var_367;
   private Image[] var_38b;
   private Image[] var_3a0;
   private int[] var_404;
   private String[] var_416;
   private String[] var_43f;
   private int var_47f;
   private int var_4df;
   private int var_506;
   private int var_569;
   private int var_59f;
   private int var_5de;
   private int var_619;
   private int var_64a;
   private int var_68b;
   private int var_6a3;
   private int var_6ff;
   private int var_755;
   private int var_767;
   private byte var_7ba;
   private byte var_829;
   private byte var_873;
   private byte var_89f;
   private byte var_901;
   private boolean var_92a;
   private boolean var_96e;
   private boolean var_983;

   public Class_16b(GameMidlet var1, Class_7d var2, int var3, Image var4) {
      this.var_bf = 3 * (this.var_83 + 3) + 5;
      this.var_da = new Object[3];
      this.var_10c = new int[][]{{550, 1100, 2750}, {150, 300, 750}, {400, 800, 2000}, {200, 400, 1000}, {50, 100, 200}, {50, 50, 50}, {250, 500, 1250}, {500, 1000, 2500}, {600, 1200, 3000}};
      this.var_15e = var1;
      this.var_16f = var2;
      this.var_5de = var3;
      this.var_47f = var3;
      this.var_2bb = var4;
      Class_1cc.sub_831(false);
      this.var_619 = 0;
      this.var_404 = new int[9];

      for(int var5 = 0; var5 < this.var_404.length; ++var5) {
         this.var_404[var5] = (var3 & 3 << var5 * 2) >> var5 * 2;
      }

      this.var_181 = Graphics3D.getInstance();
      this.var_829 = 4;
      this.sub_334();
      this.var_7ba = 10;
      this.var_68b = (this.sub_e3() - 20) / 3;
      this.var_59f = Class_1cc.sub_26c() + 1;
      this.var_64a = this.sub_103() - this.var_59f - this.var_2a0.getHeight();
      this.var_6a3 = this.var_64a - this.var_bf - 2;
      this.var_6ff = this.sub_e3() - 4;
      this.var_755 = 2 + this.var_71 + 2;
      this.var_767 = this.sub_103() - (this.sub_103() - this.var_6a3) - this.var_755 - 2;
      this.sub_1eb();
      this.sub_55d();
      this.sub_3e2();
      this.var_92a = false;
      this.var_983 = this.sub_103() >= 180;
   }

   public final void sub_97(Graphics var1) {
      if (this.var_96e) {
         int var2 = this.var_64a + this.var_2a0.getHeight() / 2;
         int var3 = this.sub_e3() / 2;
         int var4 = this.var_64a + (this.var_2a0.getHeight() - 14) / 2;
         if (this.var_2bb != null) {
            var1.drawImage(this.var_2bb, 0, 0, 20);
         } else {
            var1.setColor(0);
            var1.fillRect(0, 0, this.sub_e3(), this.sub_103());
         }

         this.sub_43e(var1);
         Class_1cc.sub_181(var1, this.var_15e.var_a8.sub_ca(), this.sub_e3() - 2 - Class_1cc.sub_1e2(this.var_15e.var_a8.sub_ca()) - 2, 2 + (this.var_71 - Class_1cc.sub_19b()) / 2);
         var1.drawImage(Class_1cc.var_a0, this.sub_e3() - 2 - Class_1cc.sub_1e2(this.var_15e.var_a8.sub_ca()) - 1, 2 + this.var_71 / 2, 10);
         Class_1cc.sub_12c(var1, var4, 14, this.sub_e3());
         if (this.var_15e.var_8f8 == 2) {
            int var5 = 0;
            var1.setColor(16777215);
            if (this.var_7ba == 10 && this.var_829 > 0 || this.var_7ba >= 0 && this.var_7ba <= 8 && this.var_873 > 0) {
               var1.fillTriangle(2, var2, 7, var2 - 5, 7, var2 + 5);
            }

            var5 = this.sub_e3() - 2;
            if (this.var_7ba == 10 && this.var_829 < 8 || this.var_7ba >= 0 && this.var_7ba <= 8 && this.var_7ba != 5 && this.var_873 < 2 || this.var_7ba == 5 && this.var_873 < 3) {
               var1.fillTriangle(var5, var2, var5 - 5, var2 - 5, var5 - 5, var2 + 5);
            }
         }

         switch (this.var_7ba) {
            case 5:
            case 11:
            default:
               this.sub_4d9(var1);
               break;
            case 10:
               if (this.var_15e.var_8f8 == 2) {
                  this.sub_4d9(var1);
               }
         }

         if (this.var_15e.var_8f8 == 2) {
            var1.drawImage(this.var_2a0, var3 + -1, var2, 3);
         }

         this.sub_491(var1);
         this.sub_171(var1);

         try {
            var1.setClip(0, this.var_755, this.sub_e3(), this.var_767);
            this.var_181.bindTarget(var1);
            this.var_181.render(this.var_20d);
            return;
         } catch (Exception var11) {
         } finally {
            this.var_181.releaseTarget();
            var1.setClip(0, 0, this.sub_e3(), this.sub_103());
         }

      }
   }

   public final void sub_ad(int var1) {
      if (this.var_96e) {
         this.var_4df = var1;

         try {
            this.var_506 = this.var_16f.getGameAction(var1);
         } catch (Exception var2) {
            this.var_506 = -9999;
         }

         this.var_569 = 0;
      }
   }

   public final boolean sub_2e(int var1, int var2) {
      if (var1 == 5) {
         --var2;
      }

      return (this.var_5de >> var1 * 2 & 3) - 1 == var2;
   }

   public final void sub_89() {
      this.var_96e = false;
      this.var_15e = null;
      this.var_16f = null;
      this.var_266 = null;
      this.var_181 = null;
      this.var_20d = null;
      this.var_2a0 = null;
      this.var_38b = null;
      this.var_3a0 = null;
      this.var_404 = null;
      this.var_313 = null;
      this.var_367 = null;
      this.var_416 = null;
      this.var_43f = null;
      this.var_2bb = null;
      Runtime.getRuntime().gc();
   }

   public final void sub_117() {
      this.var_96e = true;
   }

   public final void sub_154() {
      this.var_96e = false;
   }

   public final int sub_e3() {
      return this.var_16f.var_198;
   }

   public final int sub_103() {
      return this.var_16f.var_1e9;
   }

   public final boolean sub_200() {
      return this.var_96e;
   }

   public final void sub_25d(int var1) {
      this.var_4df = -9999;
      this.var_506 = -9999;
   }

   public final String sub_146(int var1) {
      return Class_1cc.sub_2dd(44 + var1);
   }

   public final void sub_292() {
      ++this.var_619;
      if (!this.var_92a) {
         if (this.var_15e.sub_abc(12, this.var_4df, this.var_506) && this.var_569++ == 0) {
            this.sub_1c2();
         } else if (this.var_15e.sub_abc(13, this.var_4df, this.var_506) && this.var_569++ == 0) {
            this.sub_2d4();
         }
      }

      if (!this.var_92a && this.var_15e.var_8f8 == 2 && this.var_569++ == 0) {
         if (this.var_15e.sub_abc(11, this.var_4df, this.var_506)) {
            this.sub_1c2();
         } else if (this.var_15e.sub_abc(9, this.var_4df, this.var_506)) {
            switch (this.var_7ba) {
               case 10:
                  if (--this.var_829 < 0) {
                     this.var_829 = 0;
                  }
               case 11:
                  break;
               default:
                  if (--this.var_873 < 0) {
                     this.var_873 = 0;
                  }

                  this.sub_390();
            }

            this.sub_55d();
         } else if (this.var_15e.sub_abc(10, this.var_4df, this.var_506)) {
            switch (this.var_7ba) {
               case 5:
                  if (++this.var_873 > 3) {
                     this.var_873 = 3;
                  }

                  this.sub_390();
                  break;
               case 10:
                  if (++this.var_829 >= 9) {
                     this.var_829 = 8;
                  }
               case 11:
                  break;
               default:
                  if (++this.var_873 > 2) {
                     this.var_873 = 2;
                  }

                  this.sub_390();
            }

            this.sub_55d();
         }
      }

      if (this.var_92a) {
         if (this.var_619 > 10) {
            this.var_7ba = 10;
            this.sub_3e2();
            this.sub_55d();
            this.var_92a = false;
            return;
         }
      } else {
         this.var_266.postRotate(10.0F, 0.0F, -1.0F, 0.0F);
      }

   }

   public final void commandAction(Command var1, Displayable var2) {
   }

   private void sub_171(Graphics var1) {
      var1.setColor(16777215);
      var1.fillRect(0, this.sub_103() - Class_1cc.sub_26c() - 1, this.sub_e3(), Class_1cc.sub_26c() + 1);
      var1.setColor(0);
      var1.drawLine(0, this.sub_103() - Class_1cc.sub_26c() - 2, this.sub_e3(), this.sub_103() - Class_1cc.sub_26c() - 2);
      switch (this.var_7ba) {
         case 5:
            if (!this.sub_2e(this.var_7ba, this.var_873) && this.sub_21a(this.var_7ba, this.var_873)) {
               this.sub_192(var1, 60, 11);
               return;
            }

            this.sub_192(var1, -1, 11);
            return;
         case 10:
            if (this.var_15e.var_8f8 == 2) {
               this.sub_192(var1, 10, 11);
               return;
            }

            this.sub_192(var1, -1, 11);
            return;
         case 11:
            if (!this.var_92a) {
               this.sub_192(var1, 8, 9);
               return;
            }
            break;
         default:
            if (!this.sub_2e(this.var_7ba, this.var_873) && this.sub_21a(this.var_7ba, this.var_873) && this.sub_24e(this.var_7ba, this.var_873) && !this.sub_27b(this.var_7ba, this.var_873)) {
               this.sub_192(var1, 60, 11);
               return;
            }

            this.sub_192(var1, -1, 11);
      }

   }

   private void sub_192(Graphics var1, int var2, int var3) {
      var1.setFont(Class_1cc.sub_20a());
      if (var2 != -1) {
         var1.drawString(Class_1cc.sub_2dd(var2), 2, this.sub_103() - 1, 36);
      }

      if (var3 != -1) {
         var1.drawString(Class_1cc.sub_2dd(var3), this.sub_e3() - 2, this.sub_103() - 1, 40);
      }

   }

   private void sub_1c2() {
      if (this.var_15e.var_8f8 == 2) {
         switch (this.var_7ba) {
            case 5:
               if (!this.sub_2e(this.var_7ba, this.var_873) && this.sub_21a(this.var_7ba, 0)) {
                  this.var_89f = this.var_829;
                  this.var_901 = this.var_873;
                  this.var_404[this.var_89f] = this.var_901;
                  this.var_5de = 0;

                  for(int var1 = 0; var1 < this.var_404.length; ++var1) {
                     this.var_5de |= this.var_404[var1] << var1 * 2;
                  }

                  Class_1cc.sub_6cf(this.var_266, this.var_5de, this.var_15e.var_a8.var_37, true);
                  this.var_7ba = 11;
               }
               break;
            case 10:
               this.var_7ba = this.var_829;
               this.var_873 = 0;
               this.sub_390();
               break;
            case 11:
               if (this.var_89f == 5) {
                  this.var_15e.var_a8.sub_9c(this.var_10c[this.var_89f][0]);
               } else {
                  this.var_15e.var_a8.sub_9c(this.var_10c[this.var_89f][this.var_901 - 1]);
               }

               this.var_15e.var_a8.var_37 = this.var_5de;
               this.var_92a = true;
               this.var_619 = 0;
               break;
            default:
               if (!this.sub_2e(this.var_7ba, this.var_873) && this.sub_21a(this.var_7ba, this.var_873) && this.sub_24e(this.var_7ba, this.var_873) && !this.sub_27b(this.var_7ba, this.var_873)) {
                  this.var_89f = this.var_829;
                  this.var_901 = (byte)(this.var_873 + 1);
                  this.var_404[this.var_89f] = this.var_901;
                  this.var_5de = 0;

                  for(int var2 = 0; var2 < this.var_404.length; ++var2) {
                     this.var_5de |= this.var_404[var2] << var2 * 2;
                  }

                  Class_1cc.sub_6cf(this.var_266, this.var_5de, this.var_15e.var_a8.var_37, true);
                  this.var_7ba = 11;
               }
         }

         this.sub_3e2();
         this.sub_55d();
      }
   }

   private void sub_1eb() {
      this.var_181 = Graphics3D.getInstance();
      this.var_20d = new World();
      Background var1;
      (var1 = new Background()).setColor(8355711);
      Light var2;
      (var2 = new Light()).setMode(128);
      var2.setColor(16777215);
      Camera var3 = new Camera();
      float var4 = (float)this.sub_e3() / ((float)this.var_767 * 1.0F);
      var3.setPerspective(50.0F, var4, Class_d6.var_2f, Class_d6.var_46);
      ((Transformable)var3).setTranslation(0.0F, 2.0F, 5.5F);
      ((Transformable)var3).postRotate(19.98F, -1.0F, 0.0F, 0.0F);
      this.var_266 = (Group)Class_1cc.var_190[this.var_15e.var_8f8].duplicate();
      this.var_20d.setBackground(var1);
      this.var_20d.addChild(var2);
      this.var_20d.addChild(this.var_266);
      this.var_20d.addChild(var3);
      this.var_20d.setActiveCamera(var3);
      Runtime.getRuntime().gc();
   }

   private boolean sub_21a(int var1, int var2) {
      if (var1 == 5) {
         return this.var_15e.var_a8.sub_ca() >= this.var_10c[var1][0];
      } else {
         return this.var_15e.var_a8.sub_ca() >= this.var_10c[var1][var2];
      }
   }

   private boolean sub_24e(int var1, int var2) {
      if (this.var_15e.var_b61) {
         return true;
      } else {
         return var2 < this.var_15e.var_123.var_373;
      }
   }

   private boolean sub_27b(int var1, int var2) {
      if (var1 != 4 && var1 != 5) {
         return var2 + 1 < this.var_404[var1];
      } else {
         return false;
      }
   }

   private void sub_2d4() {
      switch (this.var_7ba) {
         case 10:
            this.var_96e = false;
            if (this.var_15e.var_8f8 == 2) {
               Class_1cc.sub_6cf(Class_1cc.var_190[this.var_15e.var_8f8], this.var_5de, this.var_47f, false);
            }

            this.var_15e.sub_2a4();
            return;
         case 11:
            this.var_7ba = this.var_89f;
            int var1 = this.var_5de;
            this.var_5de = this.var_15e.var_a8.var_37;

            for(int var2 = 0; var2 < this.var_404.length; ++var2) {
               this.var_404[var2] = (this.var_5de & 3 << var2 * 2) >> var2 * 2;
            }

            Class_1cc.sub_6cf(this.var_266, this.var_5de, var1, true);
            this.sub_3e2();
            this.sub_55d();
            return;
         default:
            this.var_7ba = 10;
            this.sub_3e2();
            this.sub_55d();
      }
   }

   private void sub_334() {
      this.var_38b = new Image[10];
      this.var_3a0 = new Image[3];
      Object var1 = null;
      Object var2 = null;

      try {
         Image var8;
         int var3 = (var8 = Image.createImage("/mods.png")).getWidth() / 10;

         for(int var4 = 0; var4 < 10; ++var4) {
            int[] var10 = new int[var3 * var8.getHeight()];
            var8.getRGB(var10, 0, var3, var4 * var3, 0, var3, var8.getHeight());
            this.var_38b[var4] = Image.createRGBImage(var10, var3, var8.getHeight(), true);
         }

         Runtime.getRuntime().gc();
         var3 = (var8 = Image.createImage("/stages.png")).getWidth() / 3;

         for(int var13 = 0; var13 < this.var_3a0.length; ++var13) {
            int[] var11 = new int[var3 * var8.getHeight()];
            var8.getRGB(var11, 0, var3, var13 * var3, 0, var3, var8.getHeight());
            this.var_3a0[var13] = Image.createRGBImage(var11, var3, var8.getHeight(), true);
         }

         Runtime.getRuntime().gc();
         this.var_2a0 = Image.createImage("/highlight.png");
         int[] var14 = new int[this.var_3a0[0].getWidth() * this.var_3a0[0].getHeight()];
         this.var_3a0[0].getRGB(var14, 0, this.var_3a0[0].getWidth(), 0, 0, this.var_3a0[0].getWidth(), this.var_3a0[0].getHeight());
         boolean var5 = false;

         for(int var6 = 0; var6 < var14.length; ++var6) {
            if ((var14[var6] & -16777216) == -16777216) {
               var14[var6] = -1728053248;
            }
         }

         this.var_313 = Image.createRGBImage(var14, this.var_3a0[0].getWidth(), this.var_3a0[0].getHeight(), true);
         Runtime.getRuntime().gc();
      } catch (Exception var7) {
      }
   }

   private String sub_36e(int var1, int var2) {
      if (var1 != 5) {
         if (!this.sub_24e(this.var_7ba, this.var_873)) {
            return Class_1cc.sub_2dd(84);
         } else if (this.sub_2e(this.var_7ba, this.var_873)) {
            return Class_1cc.sub_2dd(54);
         } else if (this.sub_27b(this.var_7ba, this.var_873)) {
            return Class_1cc.sub_2dd(219);
         } else {
            switch (var1) {
               case 0:
                  switch (var2) {
                     case 0:
                        return Class_1cc.sub_2dd(61);
                     case 1:
                        return Class_1cc.sub_2dd(63);
                     case 2:
                        return Class_1cc.sub_2dd(64);
                     default:
                        return null;
                  }
               case 1:
                  switch (var2) {
                     case 0:
                        return Class_1cc.sub_2dd(173);
                     case 1:
                        return Class_1cc.sub_2dd(174);
                     case 2:
                        return Class_1cc.sub_2dd(175);
                     default:
                        return null;
                  }
               case 2:
                  switch (var2) {
                     case 0:
                        return Class_1cc.sub_2dd(176);
                     case 1:
                        return Class_1cc.sub_2dd(177);
                     case 2:
                        return Class_1cc.sub_2dd(178);
                     default:
                        return null;
                  }
               case 3:
                  switch (var2) {
                     case 0:
                        return Class_1cc.sub_2dd(179);
                     case 1:
                        return Class_1cc.sub_2dd(180);
                     case 2:
                        return Class_1cc.sub_2dd(181);
                     default:
                        return null;
                  }
               case 4:
                  switch (var2) {
                     case 0:
                        return Class_1cc.sub_2dd(182);
                     case 1:
                        return Class_1cc.sub_2dd(183);
                     case 2:
                        return Class_1cc.sub_2dd(184);
                     default:
                        return null;
                  }
               case 5:
                  switch (var2) {
                     case 0:
                        return Class_1cc.sub_2dd(185);
                     case 1:
                        return Class_1cc.sub_2dd(186);
                     case 2:
                        return Class_1cc.sub_2dd(187);
                     default:
                        return null;
                  }
               case 6:
                  switch (var2) {
                     case 0:
                        return Class_1cc.sub_2dd(188);
                     case 1:
                        return Class_1cc.sub_2dd(189);
                     case 2:
                        return Class_1cc.sub_2dd(190);
                     default:
                        return null;
                  }
               case 7:
                  switch (var2) {
                     case 0:
                        return Class_1cc.sub_2dd(191);
                     case 1:
                        return Class_1cc.sub_2dd(191);
                     case 2:
                        return Class_1cc.sub_2dd(191);
                     default:
                        return null;
                  }
               case 8:
                  switch (var2) {
                     case 0:
                        return Class_1cc.sub_2dd(194);
                     case 1:
                        return Class_1cc.sub_2dd(195);
                     case 2:
                        return Class_1cc.sub_2dd(196);
                     default:
                        return null;
                  }
               default:
                  return null;
            }
         }
      } else {
         return this.sub_2e(this.var_7ba, this.var_873) ? Class_1cc.sub_2dd(54) : "";
      }
   }

   private void sub_390() {
      this.var_da[0] = Class_1cc.sub_2dd(59);
      this.var_da[1] = Class_1cc.sub_2dd(206);
      if (this.var_829 == 5) {
         this.var_da[2] = Integer.toString(this.var_10c[this.var_829][0]);
      } else {
         this.var_da[2] = Integer.toString(this.var_10c[this.var_829][this.var_873]);
      }

      this.var_367 = Class_1cc.sub_3d0(this.var_22, this.var_da);
   }

   private void sub_3e2() {
      this.var_43f = null;
      int var1 = this.sub_e3() - Class_1cc.sub_1e2(this.var_15e.var_a8.sub_ca()) - Class_1cc.var_a0.getWidth() - 4 - 4;
      switch (this.var_7ba) {
         case 10:
            this.var_43f = Class_1cc.sub_9cb(Class_1cc.sub_2dd(2), var1);
            return;
         case 11:
            this.var_43f = Class_1cc.sub_9cb(Class_1cc.sub_2dd(60), var1);
            return;
         default:
            this.var_43f = Class_1cc.sub_9cb(this.sub_146(this.var_7ba), var1);
      }
   }

   private void sub_43e(Graphics var1) {
      Class_1cc.sub_12c(var1, 2, this.var_71, this.sub_e3());
      if (this.var_43f != null) {
         if (this.var_43f.length == 1) {
            Class_1cc.sub_861(var1, this.var_43f[0], 2, 2 + this.var_71 / 2, 6);
         } else {
            for(int var2 = 0; var2 < this.var_43f.length; ++var2) {
               Class_1cc.sub_81c(var1, this.var_43f[var2], 2, 2 + var2 * Class_1cc.sub_7b9() + 1);
            }

         }
      }
   }

   private void sub_491(Graphics var1) {
      int var2 = this.sub_e3() / 2;
      int var3 = (this.sub_e3() - this.var_6ff) / 2;
      var1.setColor(8355711);
      var1.fillRect(var3, this.var_6a3, this.var_6ff, this.var_bf);
      var1.setColor(11860032);
      var1.drawRect(var3, this.var_6a3, this.var_6ff, this.var_bf);
      if (this.var_983) {
         for(int var4 = 0; var4 < Math.min(this.var_416.length, 3); ++var4) {
            Class_1cc.sub_861(var1, this.var_416[var4], var2, this.var_6a3 + 2 + 1 + var4 * this.var_83, 17);
         }
      } else {
         for(int var5 = 0; var5 < Math.min(this.var_416.length, 3); ++var5) {
            Class_1cc.sub_861(var1, this.var_416[var5], var2, this.var_6a3 + 2 + 1 + var5 * this.var_83, 17);
         }
      }

      switch (this.var_7ba) {
         case 5:
            if (!this.sub_2e(this.var_7ba, this.var_873) && (this.sub_21a(this.var_7ba, this.var_873) || !this.sub_21a(this.var_7ba, this.var_873) && this.var_619 % 8 > 3)) {
               Class_1cc.sub_861(var1, this.var_367, var3 + 1, this.var_6a3 + this.var_bf, 36);
               return;
            }
            break;
         case 10:
         case 11:
            return;
         default:
            if (!this.sub_2e(this.var_7ba, this.var_873) && this.sub_24e(this.var_7ba, this.var_873) && !this.sub_27b(this.var_7ba, this.var_873) && (this.sub_21a(this.var_7ba, this.var_873) || !this.sub_21a(this.var_7ba, this.var_873) && this.var_619 % 8 > 3)) {
               Class_1cc.sub_861(var1, this.var_367, var3 + 1, this.var_6a3 + this.var_bf, 36);
            }
      }

   }

   private void sub_4d9(Graphics var1) {
      boolean var2 = false;
      int var3 = this.sub_e3() / 2;
      int var4 = this.var_64a + this.var_2a0.getHeight() / 2;
      byte var5;
      if (this.var_7ba == 11) {
         var5 = this.var_89f;
      } else {
         var5 = this.var_7ba;
      }

      switch (var5) {
         case 5:
            int var8 = this.var_38b[9].getWidth() - 4;

            for(int var7 = -1; var7 < 2; ++var7) {
               if (this.var_873 + var7 < Class_1cc.var_238.length && this.var_873 + var7 >= 0) {
                  var1.setColor(Class_1cc.var_238[this.var_873 + var7]);
                  var1.fillArc(var3 + var7 * this.var_68b - var8 / 2, var4 - var8 / 2, var8, var8, 0, 360);
                  var1.drawImage(this.var_38b[9], var3 + var7 * this.var_68b + -1, var4, 3);
               }
            }
            break;
         case 10:
            for(int var6 = -1; var6 < 2; ++var6) {
               if (this.var_829 + var6 < 9 && this.var_829 + var6 >= 0) {
                  var1.drawImage(this.var_38b[this.var_829 + var6], var3 + var6 * this.var_68b, var4, 3);
               }
            }
            break;
         default:
            for(int var9 = -1; var9 < 2; ++var9) {
               if (this.var_873 + var9 < this.var_3a0.length && this.var_873 + var9 >= 0) {
                  var1.drawImage(this.var_3a0[this.var_873 + var9], var3 + var9 * this.var_68b, var4, 3);
                  if (!this.sub_24e(this.var_7ba, this.var_873 + var9) || this.sub_27b(var5, this.var_873 + var9)) {
                     var1.drawImage(this.var_313, var3 + var9 * this.var_68b + -1, var4, 3);
                  }
               }
            }
      }

   }

   private String sub_50b(int var1) {
      if (var1 == 5) {
         return "";
      } else {
         String var2;
         switch (this.var_404[var1]) {
            case 0:
            default:
               var2 = Class_1cc.sub_2dd(224);
               break;
            case 1:
               this.var_da[0] = Class_1cc.sub_2dd(55);
               this.var_da[1] = Class_1cc.sub_2dd(56);
               var2 = Class_1cc.sub_3d0("{0} {1}", this.var_da);
               break;
            case 2:
               this.var_da[0] = Class_1cc.sub_2dd(55);
               this.var_da[1] = Class_1cc.sub_2dd(57);
               var2 = Class_1cc.sub_3d0("{0} {1}", this.var_da);
               break;
            case 3:
               this.var_da[0] = Class_1cc.sub_2dd(55);
               this.var_da[1] = Class_1cc.sub_2dd(58);
               var2 = Class_1cc.sub_3d0("{0} {1}", this.var_da);
         }

         this.var_da[0] = Class_1cc.sub_2dd(225);
         this.var_da[1] = var2;
         return Class_1cc.sub_3d0("{0} {1}", this.var_da);
      }
   }

   private void sub_55d() {
      if (this.var_15e.var_8f8 != 2) {
         this.var_416 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(97), this.var_6ff - 2);
      } else {
         switch (this.var_7ba) {
            case 10:
               this.var_416 = Class_1cc.sub_9cb(this.sub_146(this.var_829) + " \n " + this.sub_50b(this.var_829), this.var_6ff - 2);
               return;
            case 11:
               if (this.var_92a) {
                  this.var_416 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(121), this.var_6ff - 2);
                  return;
               }

               this.var_416 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(217), this.var_6ff - 2);
               return;
            default:
               this.var_416 = Class_1cc.sub_9cb(this.sub_36e(this.var_7ba, this.var_873), this.var_6ff - 2);
         }
      }
   }
}
