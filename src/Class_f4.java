import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.Node;
import javax.microedition.m3g.Transform;
import javax.microedition.m3g.World;

public final class Class_f4 implements Class_2b9 {
   private GameMidlet var_2e;
   private Class_7d var_4b;
   private World var_66;
   private World var_e1;
   private Camera var_134;
   private Transform var_143;
   private Group var_1a5;
   private Group var_1dd;
   private Mesh var_1fb;
   private Mesh var_23d;
   private Image var_25d;
   private Node[] var_2ac;
   private Node[] var_2de;
   private float[] var_306;
   private String[] var_357;
   private int var_3ba;
   private int var_43a;
   private int var_463;
   private int var_476;
   private int var_48c;
   private int var_49b;
   private int var_4e6;
   private int var_4f3;
   private int var_553;
   private int var_596;
   private int var_5c5;
   private byte var_604;
   private boolean var_665;
   private boolean var_69a;

   public Class_f4(GameMidlet var1, Class_7d var2) {
      this.var_2e = var1;
      this.var_4b = var2;
      this.var_43a = -9999;
      this.var_463 = -9999;
      this.var_4e6 = 0;
      this.var_3ba = 0;
      this.var_306 = new float[4];
      this.var_143 = new Transform();
      this.var_604 = 0;
      this.var_49b = 3000;
      this.var_48c = 16000;
      this.sub_2a7();
   }

   public final void sub_5f() {
      this.var_4e6 = 0;
      this.var_553 = 0;
      this.var_604 = 2;
      this.var_2e.sub_5bf((byte)3);
   }

   public final void sub_97(Graphics var1) {
      if (!this.var_665 && this.var_69a) {
         if (this.var_604 != 1) {
            var1.setColor(0);
            var1.fillRect(0, 0, this.sub_1a9(), this.sub_1f1());
            switch (this.var_604) {
               case 0:
                  var1.setColor(16777215);
                  var1.fillRect(0, 0, this.sub_1a9(), this.sub_1f1());
                  this.sub_350(var1, (String)null);
                  return;
               case 2:
                  var1.setColor(16777215);
                  var1.fillRect(0, 0, this.sub_1a9(), this.sub_1f1());
                  var1.drawImage(this.var_25d, this.sub_1a9() / 2, this.sub_1f1() / 2, 3);
                  return;
               case 3:
                  var1.setColor(0);
                  var1.fillRect(0, 0, this.sub_1a9(), this.sub_1f1());
                  var1.drawImage(this.var_25d, this.sub_1a9() / 2, this.sub_1f1() / 2, 3);
               case 1:
               case 4:
               case 6:
               default:
                  return;
               case 7:
                  this.sub_350(var1, Class_1cc.sub_2dd(19));
               case 5:
                  var1.drawImage(this.var_25d, this.var_596, 5, 17);
            }
         } else {
            var1.setColor(16777215);
            var1.fillRect(0, 0, this.sub_1a9(), this.sub_1f1());
            var1.setFont(Class_1cc.sub_20a());
            var1.setColor(0);

            for(int var2 = 0; var2 < this.var_357.length; ++var2) {
               var1.drawString(this.var_357[var2], this.sub_1a9() / 2, 1 + var2 * (Class_1cc.sub_20a().getHeight() + 1), 17);
            }

            var1.drawString(Class_1cc.sub_2dd(7), this.sub_1a9() - 2, this.sub_1f1() - 1, 40);
         }
      }
   }

   public final void sub_ad(int var1) {
      this.var_43a = var1;
   }

   public final void sub_ed() {
      this.var_2e = null;
      this.var_4b = null;
      if (this.var_1a5 != null) {
         Class_1cc.sub_5b7(this.var_1a5);
      }

      if (this.var_1dd != null) {
         Class_1cc.sub_5b7(this.var_1dd);
      }

      this.var_1a5 = null;
      this.var_1dd = null;
      this.var_66 = null;
      this.var_e1 = null;
      this.var_134 = null;
      this.var_143 = null;
      this.var_1fb = null;
      this.var_23d = null;
      this.var_25d = null;
      this.var_2ac = null;
      this.var_2de = null;
      this.var_306 = null;
      this.var_357 = null;
      Runtime.getRuntime().gc();
   }

   public final void sub_117() {
      this.var_69a = true;
      this.var_2e.sub_b7c();
   }

   public final void sub_154() {
      this.var_69a = false;
   }

   public final int sub_1a9() {
      return this.var_4b.var_198;
   }

   public final int sub_1f1() {
      return this.var_4b.var_1e9;
   }

   public final boolean sub_200() {
      return this.var_69a;
   }

   public final void sub_25d(int var1) {
      this.var_43a = -9999;
   }

   public final void sub_292() {
      if (this.var_69a) {
         label91: {
            ++this.var_4e6;
            if (this.var_43a != -9999) {
               try {
                  this.var_4b.getGameAction(this.var_43a);
                  break label91;
               } catch (Exception var4) {
               }
            }

            boolean var1 = false;
         }

         if (this.var_463 != this.var_43a) {
            this.var_476 = 0;
         }

         this.var_463 = this.var_43a;
         if (this.var_43a != -9999 && this.var_476++ == 0) {
            switch (this.var_604) {
               case 1:
                  this.var_69a = false;
                  this.var_2e.sub_5a5();
                  return;
               case 2:
               case 3:
               case 6:
               default:
                  break;
               case 4:
               case 5:
                  this.var_604 = 7;
                  this.sub_2a7();
                  this.var_4e6 = 0;
                  this.var_596 = this.sub_1a9() / 2;
                  this.var_66.setActiveCamera(this.var_134);
                  this.var_66.animate(this.var_4f3 - 1);
                  Class_1cc.sub_419(this.var_1fb, this.var_66, this.var_143, 0.0F, 0.0F, 0.0F, this.var_306);
                  this.var_1a5.setTranslation(this.var_306[0], this.var_306[1], this.var_306[2]);
                  Class_1cc.sub_419(this.var_23d, this.var_66, this.var_143, 0.0F, 0.0F, 0.0F, this.var_306);
                  this.var_1dd.setTranslation(this.var_306[0], this.var_306[1], this.var_306[2]);
                  return;
               case 7:
                  this.var_665 = true;

                  try {
                     this.var_2e.sub_3a5(this.sub_302(this.sub_1a9(), this.sub_1f1()));
                     return;
                  } catch (OutOfMemoryError var3) {
                     this.var_665 = false;
                     this.var_604 = 1;
                     this.var_66 = null;
                     this.var_25d = null;
                     Runtime.getRuntime().gc();
                     this.var_357 = Class_1cc.sub_989(Class_1cc.sub_2dd(230), this.sub_1a9() - 2);
                     return;
                  }
            }
         }

         switch (this.var_604) {
            case 2:
               if (this.var_553 >= this.var_49b) {
                  this.var_604 = 3;
                  this.sub_2a7();
                  this.var_553 = 0;
                  this.var_4e6 = 0;
               }
               break;
            case 3:
               if (this.var_553 >= this.var_49b) {
                  this.var_2e.sub_3a5((Image)null);
                  this.sub_2a7();
                  this.var_553 = 0;
                  this.var_4e6 = 0;
               }
               break;
            case 4:
               if (this.var_553 >= 4000) {
                  this.var_66.setActiveCamera(this.var_134);
                  this.var_604 = 5;
                  this.var_553 = 0;
                  this.var_4e6 = 0;
                  this.var_596 = -this.sub_1a9() / 2;
               }
               break;
            case 5:
               if (this.var_4e6 >= this.var_5c5 && (this.var_596 += 6) > this.sub_1a9() / 2) {
                  this.var_596 = this.sub_1a9() / 2;
               }

               if (this.var_553 >= this.var_4f3) {
                  this.var_604 = 7;
                  this.sub_2a7();
               }
               break;
            case 6:
               if (this.var_553 >= this.var_48c) {
                  this.var_604 = 5;
                  this.var_553 = 0;
                  this.var_4e6 = 0;
                  this.var_596 = -this.sub_1a9() / 2;
                  return;
               }
         }

         if (this.var_604 == 6) {
            this.var_e1.animate(this.var_553);
         } else if (this.var_604 == 4 || this.var_604 == 5) {
            this.var_66.animate(this.var_553);

            for(int var2 = 0; var2 < 3; ++var2) {
               this.var_2ac[var2].preRotate(30.0F, -1.0F, 0.0F, 0.0F);
               this.var_2de[var2].preRotate(30.0F, -1.0F, 0.0F, 0.0F);
            }

            Class_1cc.sub_419(this.var_1fb, this.var_66, this.var_143, 0.0F, 0.0F, 0.0F, this.var_306);
            this.var_1a5.setTranslation(this.var_306[0], this.var_306[1], this.var_306[2]);
            Class_1cc.sub_419(this.var_23d, this.var_66, this.var_143, 0.0F, 0.0F, 0.0F, this.var_306);
            this.var_1dd.setTranslation(this.var_306[0], this.var_306[1], this.var_306[2]);
         }

         this.var_553 = this.var_4e6 * 100;
         if (this.var_604 == 6) {
            this.var_553 *= 4;
         }

      }
   }

   private void sub_2a7() {
      String var1;
      switch (this.var_604) {
         case 0:
         case 2:
            var1 = "pub_logo";
            break;
         case 1:
         default:
            var1 = "game_logo";
            break;
         case 3:
            var1 = "lic_logo";
      }

      try {
         this.var_25d = Class_1cc.sub_6b("/" + var1 + ".png");
         if (this.var_604 == 7 || this.var_604 == 0) {
            Class_1cc.sub_6b("/pub_logo.png");
         }
      } catch (Exception var2) {
      }

      Runtime.getRuntime().gc();
   }

   private Image sub_302(int var1, int var2) {
      Image var3 = null;
      Graphics var4 = null;
      Graphics3D var5 = null;

      try {
         var4 = (var3 = Image.createImage(var1, var2)).getGraphics();
         var5 = Graphics3D.getInstance();

         try {
            var5.releaseTarget();
         } catch (Exception var12) {
         }

         var5.bindTarget(var4);
         var5.render(this.var_66);
      } catch (Exception var13) {
      } finally {
         if (var5 != null) {
            var5.releaseTarget();
         }

      }

      int[] var6 = new int[var1 * var2];

      for(int var7 = 0; var7 < var6.length; ++var7) {
         var6[var7] = 1593835520;
      }

      var4.drawRGB(var6, 0, var1, 0, 0, var1, var2, true);
      Runtime.getRuntime().gc();
      return var3;
   }

   private void sub_350(Graphics var1, String var2) {
      var1.setColor(0);
      var1.fillRect(0, this.sub_1f1() - 19, this.sub_1a9(), 19);
      int var3;
      if (this.var_604 == 0) {
         if (++this.var_3ba >= this.var_2e.var_92f) {
            this.var_3ba = this.var_2e.var_92f;
         }

         var3 = this.sub_1a9() * this.var_3ba / 100;
      } else {
         var3 = this.sub_1a9();
      }

      var1.setColor(16724805);
      var1.fillRect(0, this.sub_1f1() - 19 + 1, var3, 17);
      if (var2 != null && this.var_4e6 % 8 < 4) {
         var1.setFont(Class_1cc.sub_20a());
         var1.setColor(16777215);
         var1.drawString(var2, this.sub_1a9() / 2, this.sub_1f1() - 19 + 5 - 4, 17);
      }

   }
}
