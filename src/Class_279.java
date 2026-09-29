import java.util.Vector;
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

public final class Class_279 implements Class_2b9, CommandListener {
   private final int var_30 = Class_1cc.sub_7b9() + 2;
   private final int var_53 = Class_1cc.sub_7b9() + 3;
   private final int var_92 = Class_1cc.sub_7b9() + 1;
   private final int var_10f = Class_1cc.sub_7b9() + 2;
   private final Object[] var_162 = new Object[2];
   private Graphics3D var_172;
   private World var_1ba;
   private Group var_1f3;
   private GameMidlet var_223;
   private Class_7d var_249;
   public Image var_29f;
   private Image var_2af;
   private Image var_2ea;
   private Image var_36c;
   private Image var_3c9;
   private Vector var_3e5;
   private String var_3ff;
   private String var_42e;
   private String[] var_490;
   private byte[] var_4dc;
   private int[] var_515;
   private int[] var_54c;
   private long var_574;
   private int var_580;
   private int var_5a4;
   private int var_5b3;
   private int var_5fa;
   private int var_648;
   private int var_69b;
   private int var_6b2;
   private int var_6e6;
   private int var_6f4;
   private int var_70d;
   private int var_787;
   private int var_7ad;
   private int var_7ff;
   private int var_842;
   private int var_89a;
   private int var_8fb;
   private int var_935;
   private int var_95e;
   private int var_969;
   private int var_978;
   private int var_9d0;
   private int var_a16;
   private int var_a77;
   private int var_ac9;
   private int var_b27;
   private int var_b73;
   private int var_bcf;
   private int var_bde;
   private byte var_c42;
   private byte var_c4c;
   private byte var_c61;
   private byte var_ca2;
   private byte var_cd8;
   private boolean var_cf4;
   private boolean var_d00;
   private boolean var_d36;
   private boolean var_d86;
   private boolean var_de3;
   private boolean var_e20;
   private boolean var_e67;

   public Class_279(GameMidlet var1, Class_7d var2, Image var3) {
      this.var_223 = var1;
      this.var_249 = var2;
      this.var_29f = var3;
      this.var_580 = -9999;
      this.var_5a4 = -9999;
      this.var_d00 = true;
      this.var_69b = this.var_6b2 = 0;
      Class_1cc.sub_831(false);
      this.var_2af = Class_1cc.sub_6b("/game_logo.png");
      this.var_36c = Class_1cc.sub_6b("/cursorleft.png");
      this.var_3c9 = Class_1cc.sub_6b("/cursorright.png");
      this.var_2ea = Class_1cc.sub_6b("/characters.png");
      this.var_935 = this.var_2af.getHeight() + 5 + 4;
      this.var_95e = this.var_935 + this.var_92 + this.var_30 / 2;
      this.var_969 = this.var_935;
      this.var_7ff = this.var_36c.getHeight() + 2;
      this.var_5fa = Class_1cc.sub_26c() + 1;
      this.var_9d0 = (this.sub_139() - this.var_5fa - this.var_95e) / this.var_7ff;
      this.var_648 = (this.sub_139() - this.var_5fa - this.var_95e) / this.var_30;
      this.var_842 = this.sub_ec();
      this.var_89a = this.sub_139() - this.var_95e - this.var_5fa - 10 - this.var_92 - this.var_30 / 2;
      this.var_8fb = this.var_2ea.getWidth() / 2;
      this.var_b73 = 5 + this.var_8fb + 1;
      this.var_a16 = this.sub_ec() - this.var_b73 - 5;
      this.var_a77 = this.var_2ea.getHeight();
      this.var_ac9 = this.var_a77 / this.var_30;
      this.var_bcf = this.sub_ec() - this.var_b73 - 5;
      this.var_b27 = this.sub_ec() - 20;
      this.sub_361((byte)0);
      this.var_515 = new int[5];
      this.var_54c = new int[this.var_a16 * this.var_a77];

      for(int var4 = 0; var4 < this.var_54c.length; ++var4) {
         this.var_54c[var4] = -2002869338;
      }

      this.var_bde = this.sub_ec() - 20;
      this.var_e67 = this.sub_139() >= 230;
   }

   public final void sub_97(Graphics var1) {
      if (this.var_cf4) {
         int var2 = this.sub_ec() / 2;
         if (this.var_29f == null) {
            var1.setColor(0);
            var1.fillRect(0, 0, this.sub_ec(), this.sub_139());
         } else {
            var1.drawImage(this.var_29f, 0, 0, 20);
         }

         var1.drawImage(this.var_2af, var2, 5, 17);
         switch (this.var_c42) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 23:
               this.sub_167(var1, this.var_969);
               this.sub_1a9(var1);
               if (this.var_c42 == 3) {
                  var1.setColor(0);
                  var1.fillRect(0, this.sub_139() - 5 - Class_1cc.sub_7b9() - 1 - this.var_5fa, this.sub_ec(), this.var_30);
                  Class_1cc.sub_861(var1, this.var_42e, this.sub_ec() - this.var_7ad * 3, this.sub_139() - 5 - this.var_5fa, 36);
               }
            case 4:
            case 25:
            default:
               break;
            case 5:
               this.sub_167(var1, this.var_969);
               this.sub_1a9(var1);
               int var19 = 0;

               for(int var56 = 0; var56 < this.var_6e6; ++var56) {
                  int var50;
                  if ((var50 = this.var_6b2 + var56) >= this.var_490.length) {
                     var50 -= this.var_490.length;
                  }

                  if (this.var_490[var50].equals(Class_1cc.sub_2dd(14)) || this.var_490[var50].equals(Class_1cc.sub_2dd(158)) || this.var_490[var50].equals(Class_1cc.sub_2dd(15))) {
                     var19 = this.sub_ec() / 2 + Class_1cc.sub_789(this.var_490[var50]) / 2 + 4;
                  }

                  int var20 = this.var_95e + var56 * this.var_7ff + (this.var_36c.getHeight() - 6) / 2;
                  if (this.var_490[var50].equals(Class_1cc.sub_2dd(14))) {
                     this.sub_17f(var1, var19, var20, this.var_223.var_a65, var56 == this.var_69b);
                  } else if (this.var_490[var50].equals(Class_1cc.sub_2dd(15))) {
                     this.sub_17f(var1, var19, var20, this.var_223.var_ad7, var56 == this.var_69b);
                  } else if (this.var_490[var50].equals(Class_1cc.sub_2dd(158))) {
                     this.sub_17f(var1, var19, var20, this.var_223.var_ab0, var56 == this.var_69b);
                  }
               }
               break;
            case 6:
            case 15:
            case 21:
               this.sub_167(var1, this.var_969);
               this.sub_1a9(var1);
               break;
            case 7:
            case 20:
               this.sub_167(var1, this.var_969);
               if (!this.var_d36) {
                  for(int var55 = 0; var55 < Math.min(this.var_648, this.var_3e5.size()); ++var55) {
                     Class_1cc.sub_81c(var1, (String)this.var_3e5.elementAt(var55 + this.var_69b), 6, this.var_95e + var55 * this.var_30);
                  }

                  if (this.var_648 < this.var_3e5.size()) {
                     this.sub_20b(var1, this.var_3e5.size() - this.var_648 + 1, this.var_69b);
                  }
               }
               break;
            case 8:
            case 9:
            case 17:
            case 18:
            case 19:
            case 24:
            case 28:
               this.sub_167(var1, this.var_969);

               for(int var52 = 0; var52 < Math.min(this.var_648, this.var_490.length); ++var52) {
                  int var49 = var52 + this.var_69b;
                  Class_1cc.sub_861(var1, this.var_490[var49], var2, this.var_95e + var52 * this.var_53, 17);
               }

               if (this.var_648 < this.var_490.length) {
                  this.sub_20b(var1, this.var_490.length - this.var_648 + 1, this.var_69b);
               }
               break;
            case 10:
            case 11:
            case 12:
               byte var21 = this.var_c42 != 11 && this.var_c42 != 10 ? this.var_223.var_123.sub_832() : this.var_223.var_123.sub_7e3();
               boolean var22 = false;
               int var23;
               int var44 = (var23 = this.var_95e) + this.var_2ea.getHeight() + 10;
               int var24 = var23 + 3 + (this.var_a77 - this.var_ac9 * this.var_30) / 2;
               Class_1cc.sub_12c(var1, this.var_969, this.var_92, this.sub_ec());
               Class_1cc.sub_861(var1, Class_1cc.sub_50c(var21), this.sub_ec() / 2, this.var_969 + 1, 17);
               var1.setClip(5, var23, this.var_8fb, this.var_2ea.getHeight());
               var1.drawImage(this.var_2ea, 5 - var21 * this.var_8fb, var23, 20);
               var1.setClip(0, 0, this.sub_ec(), this.sub_139());
               var1.setColor(6081251);
               var1.drawRect(this.var_b73, var23, this.var_bcf, this.var_2ea.getHeight() - 1);
               var1.drawRGB(this.var_54c, 0, this.var_a16, this.var_b73, var23, this.var_a16, this.var_a77, true);
               Class_1cc.sub_12c(var1, var44, this.var_92, this.sub_ec());

               for(int var25 = 0; var25 < Math.min(this.var_ac9, this.var_490.length); ++var25) {
                  int var48 = var25 + this.var_69b;
                  Class_1cc.sub_81c(var1, this.var_490[var48], this.var_b73 + 2, var24 + var25 * this.var_30);
               }

               if (this.var_c42 == 10) {
                  Class_1cc.sub_861(var1, this.var_223.var_123.sub_89c(), var2, var44 + 1, 17);
               }

               if (this.var_c42 == 10 && this.var_223.var_123.sub_35f() > 1) {
                  var44 += this.var_92 / 2;
                  int var36 = 0;
                  var1.setColor(16777215);
                  if (!this.var_223.var_123.sub_451()) {
                     var1.fillTriangle(2, var44, 7, var44 + 5, 7, var44 - 5);
                  }

                  var36 = this.sub_ec() - 2;
                  if (!this.var_223.var_123.sub_49b()) {
                     var1.fillTriangle(var36, var44, var36 - 5, var44 + 5, var36 - 5, var44 - 5);
                  }
               }

               if (this.var_490.length > this.var_ac9) {
                  int var38 = this.var_b73 + this.var_bcf / 2;
                  if (this.var_69b > 0) {
                     var44 = var23 + 1;
                     var1.setColor(16777215);
                     var1.fillTriangle(var38, var44, var38 - 5, var44 + 5, var38 + 5, var44 + 5);
                  }

                  if (this.var_69b < this.var_490.length - this.var_ac9) {
                     var44 = var23 + this.var_2ea.getHeight() - 1;
                     var1.setColor(16777215);
                     var1.fillTriangle(var38, var44, var38 - 5, var44 - 5, var38 + 5, var44 - 5);
                  }
               }
               break;
            case 13:
               this.sub_167(var1, this.var_969);
               int var11 = Math.min((this.sub_139() - this.var_5fa - this.var_95e) / (Class_1cc.sub_7b9() * 2 + Class_1cc.sub_7b9() / 2), this.var_490.length / 3);
               int var42 = this.var_95e;

               for(int var51 = 0; var51 < var11; ++var51) {
                  int var6 = (this.var_69b + var51) * 3;
                  Class_1cc.sub_81c(var1, this.var_490[var6], this.var_e67 ? 10 : 2, var42);
                  var42 += Class_1cc.sub_7b9() + 0;
                  Class_1cc.sub_861(var1, this.var_490[var6 + 1], 10, var42, 20);
                  Class_1cc.sub_861(var1, this.var_490[var6 + 2], this.sub_ec() - 10, var42, 24);
                  var42 += Class_1cc.sub_7b9() + Class_1cc.sub_7b9() / 2;
               }

               if (var11 < this.var_490.length / 3) {
                  this.sub_20b(var1, this.var_490.length / 3 - var11 + 1, this.var_69b);
               }
               break;
            case 14:
            case 22:
               this.sub_167(var1, this.var_969);
               int var40 = this.sub_139() - this.var_5fa - this.var_92 - 10;
               Class_1cc.sub_12c(var1, var40, this.var_92, this.sub_ec());
               Class_1cc.sub_861(var1, this.var_490[this.var_69b], var2, var40 + 1, 17);

               try {
                  var1.setClip(var2 - this.var_842 / 2, this.var_95e, this.var_842, this.var_89a);
                  this.var_172.bindTarget(var1);
                  this.var_172.render(this.var_1ba);
               } catch (Exception var28) {
               } finally {
                  this.var_172.releaseTarget();
                  var1.setClip(0, 0, this.sub_ec(), this.sub_139());
               }

               if (this.var_490.length > 1) {
                  var40 += this.var_92 / 2;
                  int var34 = 0;
                  var1.setColor(16777215);
                  var1.fillTriangle(2, var40, 7, var40 + 5, 7, var40 - 5);
                  var34 = this.sub_ec() - 2;
                  var1.fillTriangle(var34, var40, var34 - 5, var40 + 5, var34 - 5, var40 - 5);
               }
               break;
            case 16:
               this.sub_167(var1, this.var_969);
               int var13;
               int var5 = (var13 = this.var_95e) + this.var_2ea.getHeight() + 10;
               Class_1cc.sub_12c(var1, var5, this.var_92, this.sub_ec());
               Class_1cc.sub_861(var1, this.var_490[this.var_69b], var2, var5 + 1, 17);
               int var12 = (this.sub_ec() - this.var_8fb) / 2;
               var1.setClip(var12, var13, this.var_8fb, this.var_2ea.getHeight());
               var1.drawImage(this.var_2ea, var12 - this.var_69b * this.var_8fb, var13, 20);
               var1.setClip(0, 0, this.sub_ec(), this.sub_139());
               if (this.var_223.var_123.sub_6dc() > 1) {
                  var5 += this.var_92 / 2;
                  int var32 = 0;
                  var1.setColor(16777215);
                  var1.fillTriangle(2, var5, 7, var5 + 5, 7, var5 - 5);
                  var32 = this.sub_ec() - 2;
                  var1.fillTriangle(var32, var5, var32 - 5, var5 + 5, var32 - 5, var5 - 5);
               }
               break;
            case 26:
               this.sub_167(var1, this.var_969);
               int var15 = (this.sub_ec() - this.var_b27) / 2;
               boolean var16 = false;
               int var17 = this.var_95e + Class_1cc.var_a0.getHeight() / 2;
               int var18 = Class_1cc.sub_789(Class_1cc.sub_2dd(53)) + 4 + Class_1cc.var_a0.getWidth() + Class_1cc.sub_1e2(this.var_223.var_a8.sub_ca());
               int var4 = (this.sub_ec() - var18) / 2;
               Class_1cc.sub_861(var1, Class_1cc.sub_2dd(53), var4, var17, 6);
               var4 += Class_1cc.sub_789(Class_1cc.sub_2dd(53)) + 4;
               var1.drawImage(Class_1cc.var_a0, var4, var17, 6);
               var4 += Class_1cc.var_a0.getWidth();
               Class_1cc.sub_181(var1, this.var_223.var_a8.sub_ca(), var4, var17 - Class_1cc.sub_19b() / 2);
               var17 += Class_1cc.var_a0.getHeight();
               int var14 = this.var_223.var_123.sub_106() * this.var_b27 / 100;
               Class_1cc.sub_861(var1, this.var_490[0], var2, var17, 17);
               var17 += this.var_30;
               var1.setColor(16777215);
               var1.fillRect(var15, var17, this.var_b27, this.var_10f);
               var1.setColor(30872);
               var1.fillRect(var15, var17, var14, this.var_10f);
               var1.setColor(19551);
               var1.fillRect(var15, var17 + this.var_10f - 2, var14, 2);
               var1.setColor(0);
               var1.drawRect(var15, var17, this.var_b27, this.var_10f);
               Class_1cc.sub_861(var1, this.var_490[1], var2, var17 + 2, 17);
               break;
            case 27:
               this.sub_167(var1, this.var_969);
               Class_1cc.sub_861(var1, Class_1cc.sub_2dd(209), 2, this.var_95e, 20);
               Class_1cc.sub_861(var1, Class_1cc.sub_2dd(208), this.sub_ec() - 2, this.var_95e, 24);
               int var7 = this.var_95e + this.var_30;
               boolean var8 = false;
               var1.setColor(16777215);
               var1.drawLine(10, var7, 10 + this.var_bde, var7);
               var1.drawLine(10, var7 - 1, 10, var7 + 1);
               var1.drawLine(10 + this.var_bde, var7 - 1, 10 + this.var_bde, var7 + 1);
               int var9 = 10 + this.var_bde / 2 + this.var_69b * (this.var_bde / 10) - 1;
               int var10 = var7 - 3;
               var1.fillRect(var9, var10, 3, 6);
               break;
            case 29:
               this.sub_167(var1, this.var_969);
               this.sub_1a9(var1);
         }

         this.sub_4c4(var1);
      }
   }

   public final void sub_27() {
      this.sub_361((byte)2);
   }

   public final void sub_34() {
      this.sub_361((byte)3);
   }

   public final void sub_ad(int var1) {
      this.var_580 = var1;
   }

   public final void sub_25d(int var1) {
      this.var_580 = -9999;
   }

   public final void sub_6a() {
      this.var_cf4 = false;
      this.var_223 = null;
      this.var_249 = null;
      this.var_29f = null;
      this.var_2af = null;
      this.var_2ea = null;
      this.var_36c = null;
      this.var_3c9 = null;
      this.var_3e5 = null;
      this.var_490 = null;
      this.var_172 = null;
      this.var_1ba = null;
      this.var_1f3 = null;
      this.var_4dc = null;
      this.var_515 = null;
      this.var_3ff = null;
      this.var_54c = null;
      this.var_42e = null;
      Runtime.getRuntime().gc();
   }

   public final void sub_292() {
      if (this.var_cf4) {
         ++this.var_7ad;
         int var3;
         if (this.var_580 != -9999) {
            try {
               var3 = this.var_249.getGameAction(this.var_580);
            } catch (Exception var5) {
               var3 = -9999;
            }
         } else {
            var3 = -9999;
         }

         if (this.var_5a4 != this.var_580) {
            this.var_5b3 = 0;
            this.var_574 = System.currentTimeMillis();
         }

         this.var_5a4 = this.var_580;
         if (this.var_c61 == 1) {
            if (this.var_223.sub_abc(12, this.var_580, var3) && this.var_5b3++ == 0) {
               this.sub_29f();
            } else if (this.var_223.sub_abc(13, this.var_580, var3) && this.var_5b3++ == 0) {
               this.sub_2ee();
            }
         }

         if (this.var_c61 == 1 && this.var_5b3++ == 0) {
            if (this.var_c42 == 0 && this.var_580 != -9999) {
               this.sub_47c(this.var_580, var3);
            }

            if (this.var_223.sub_abc(11, this.var_580, var3)) {
               this.sub_29f();
            }

            switch (this.var_c42) {
               case 0:
               case 1:
               case 2:
               case 3:
               case 5:
               case 6:
               case 15:
               case 21:
               case 23:
               case 29:
                  if (this.var_223.sub_abc(7, this.var_580, var3)) {
                     this.sub_24a();
                     if (this.var_c42 == 3) {
                        this.var_7ad = 0;
                        this.sub_54a();
                     }
                  } else if (this.var_223.sub_abc(8, this.var_580, var3)) {
                     this.sub_25e();
                     if (this.var_c42 == 3) {
                        this.var_7ad = 0;
                        this.sub_54a();
                     }
                  }
               case 4:
               case 24:
               case 25:
               case 26:
               case 28:
               default:
                  break;
               case 7:
               case 20:
                  if (this.var_223.sub_abc(7, this.var_580, var3)) {
                     if (--this.var_69b < 0) {
                        this.var_69b = 0;
                     }
                  } else if (this.var_223.sub_abc(8, this.var_580, var3) && this.var_648 < this.var_3e5.size() && ++this.var_69b >= this.var_3e5.size() - this.var_648) {
                     this.var_69b = this.var_3e5.size() - this.var_648;
                  }
                  break;
               case 8:
               case 9:
               case 17:
               case 18:
               case 19:
                  if (this.var_223.sub_abc(7, this.var_580, var3)) {
                     if (--this.var_69b < 0) {
                        this.var_69b = 0;
                     }
                  } else if (this.var_223.sub_abc(8, this.var_580, var3) && this.var_648 < this.var_490.length && ++this.var_69b >= this.var_490.length - this.var_648) {
                     this.var_69b = this.var_490.length - this.var_648;
                  }
                  break;
               case 10:
               case 11:
               case 12:
                  if (this.var_c42 == 10 && this.var_223.var_123.sub_35f() > 1) {
                     if (this.var_223.sub_abc(9, this.var_580, var3) && !this.var_223.var_123.sub_451()) {
                        this.var_223.var_123.sub_438();
                        this.var_69b = 0;
                        this.sub_305(10);
                     } else if (this.var_223.sub_abc(10, this.var_580, var3) && !this.var_223.var_123.sub_49b()) {
                        this.var_223.var_123.sub_414();
                        this.var_69b = 0;
                        this.sub_305(10);
                     }
                  }

                  if (this.var_490.length > this.var_ac9) {
                     if (this.var_223.sub_abc(7, this.var_580, var3)) {
                        if (--this.var_69b < 0) {
                           this.var_69b = 0;
                        }
                     } else if (this.var_223.sub_abc(8, this.var_580, var3) && ++this.var_69b >= this.var_490.length - this.var_ac9) {
                        this.var_69b = this.var_490.length - this.var_ac9;
                     }
                  }
                  break;
               case 13:
                  if (this.var_223.sub_abc(7, this.var_580, var3)) {
                     if (--this.var_69b < 0) {
                        this.var_69b = 0;
                     }
                  } else {
                     int var4;
                     if (this.var_223.sub_abc(8, this.var_580, var3) && (var4 = Math.min((this.sub_139() - this.var_5fa - this.var_95e) / (Class_1cc.sub_7b9() * 3), this.var_490.length / 3)) < this.var_490.length / 3 && ++this.var_69b >= this.var_490.length / 3 - var4 - 1) {
                        this.var_69b = this.var_490.length / 3 - var4 - 1;
                     }
                  }
                  break;
               case 14:
               case 22:
                  if (this.var_4dc.length > 1 && this.var_223.sub_abc(9, this.var_580, var3)) {
                     this.sub_25e();
                     this.sub_437();
                  } else if (this.var_4dc.length > 1 && this.var_223.sub_abc(10, this.var_580, var3)) {
                     this.sub_24a();
                     this.sub_437();
                  }
                  break;
               case 16:
                  if (this.var_223.sub_abc(9, this.var_580, var3)) {
                     this.sub_25e();
                  } else if (this.var_223.sub_abc(10, this.var_580, var3)) {
                     this.sub_24a();
                  }
                  break;
               case 27:
                  if (this.var_223.sub_abc(9, this.var_580, var3)) {
                     if (--this.var_69b < -5) {
                        this.var_69b = -5;
                     }
                  } else if (this.var_223.sub_abc(10, this.var_580, var3) && ++this.var_69b > 5) {
                     this.var_69b = 5;
                  }
            }
         }

         if (this.var_c61 == 0 && this.var_7ad >= 10) {
            this.var_c61 = 1;
         } else if (this.var_c61 == 2 && this.var_7ad >= 10) {
            this.sub_3b1();
         }

         if (System.currentTimeMillis() - this.var_574 > 45000L && this.var_c42 == 0 && this.var_580 == -9999) {
            this.var_223.sub_479();
         }

         if (this.var_c42 != 14 && this.var_c42 != 22) {
            if (this.var_c42 == 3 && this.sub_ec() - this.var_7ad * 3 + Class_1cc.sub_789(this.var_42e) < 0) {
               this.var_7ad = 0;
            }

         } else {
            this.var_1f3.postRotate(10.0F, 0.0F, -1.0F, 0.0F);
         }
      }
   }

   public final void sub_89(boolean var1, boolean var2) {
      this.var_d86 = var1;
      this.var_e20 = var2;
      this.var_d00 = false;
      this.sub_361((byte)12);
   }

   public final void sub_117() {
      this.var_574 = System.currentTimeMillis();
      this.var_cf4 = true;
      this.var_223.sub_b7c();
   }

   public final void sub_154() {
      this.var_cf4 = false;
   }

   public final int sub_ec() {
      return this.var_249.var_198;
   }

   public final int sub_139() {
      return this.var_249.var_1e9;
   }

   public final boolean sub_200() {
      return this.var_cf4;
   }

   public final void commandAction(Command var1, Displayable var2) {
      this.var_5b3 = 0;
   }

   private void sub_167(Graphics var1, int var2) {
      this.var_3ff = null;
      switch (this.var_c42) {
         case 0:
            this.var_3ff = Class_1cc.sub_2dd(123);
            break;
         case 1:
            this.var_3ff = Class_1cc.sub_2dd(160);
            break;
         case 2:
            this.var_3ff = Class_1cc.sub_2dd(65);
            break;
         case 3:
            this.var_3ff = Class_1cc.sub_2dd(1);
         case 4:
         case 12:
         case 25:
         default:
            break;
         case 5:
            this.var_3ff = Class_1cc.sub_2dd(4);
            break;
         case 6:
            this.var_3ff = Class_1cc.sub_2dd(5);
            break;
         case 7:
            this.var_3ff = Class_1cc.sub_2dd(6);
            break;
         case 8:
            this.var_3ff = Class_1cc.sub_2dd(7);
            break;
         case 9:
            this.var_3ff = Class_1cc.sub_2dd(16);
            break;
         case 10:
         case 11:
            this.var_3ff = Class_1cc.sub_2dd(65);
            break;
         case 13:
            this.var_3ff = Class_1cc.sub_2dd(66);
            break;
         case 14:
         case 22:
            this.var_3ff = Class_1cc.sub_2dd(68);
            break;
         case 15:
            this.var_3ff = Class_1cc.sub_2dd(72);
            break;
         case 16:
            this.var_3ff = Class_1cc.sub_2dd(73);
            break;
         case 17:
            this.var_3ff = Class_1cc.sub_2dd(85);
            break;
         case 18:
            this.var_3ff = Class_1cc.sub_2dd(124);
            break;
         case 19:
            this.var_3ff = Class_1cc.sub_2dd(88);
            break;
         case 20:
            this.var_3ff = Class_1cc.sub_2dd(89);
            break;
         case 21:
            this.var_3ff = Class_1cc.sub_2dd(110);
            break;
         case 23:
            this.var_3ff = Class_1cc.sub_2dd(168);
            break;
         case 24:
            this.var_3ff = Class_1cc.sub_2dd(166);
            break;
         case 26:
            this.var_3ff = Class_1cc.sub_2dd(161);
            break;
         case 27:
            this.var_3ff = this.var_e67 ? Class_1cc.sub_2dd(207) : Class_1cc.sub_2dd(215);
            break;
         case 28:
            this.var_3ff = Class_1cc.sub_2dd(210);
            break;
         case 29:
            this.var_3ff = Class_1cc.sub_2dd(233);
      }

      if (this.var_3ff != null) {
         Class_1cc.sub_12c(var1, var2, this.var_92, this.sub_ec());
         Class_1cc.sub_861(var1, this.var_3ff, this.sub_ec() / 2, var2 + 1, 17);
      }

   }

   private void sub_17f(Graphics var1, int var2, int var3, boolean var4, boolean var5) {
      var1.setColor(16776960);
      var1.drawRect(var2, var3, 6, 6);
      if (var4) {
         var1.drawLine(var2, var3, var2 + 6, var3 + 6);
         var1.drawLine(var2, var3 + 6, var2 + 6, var3);
      }

   }

   private void sub_1a9(Graphics var1) {
      int var2 = this.sub_ec() / 2;
      int var5;
      if ((var5 = this.var_6b2 + this.var_69b) >= this.var_490.length) {
         var5 -= this.var_490.length;
      }

      int var6;
      if (this.var_c42 != 5 || !this.var_490[var5].equals(Class_1cc.sub_2dd(14)) && !this.var_490[var5].equals(Class_1cc.sub_2dd(158)) && !this.var_490[var5].equals(Class_1cc.sub_2dd(15))) {
         var6 = Math.max(this.sub_ec(), this.var_36c.getWidth() + this.var_3c9.getWidth() + Class_1cc.sub_789(this.var_490[var5])) / 10;
      } else {
         var6 = Math.max(this.sub_ec(), this.var_36c.getWidth() + this.var_3c9.getWidth() + Class_1cc.sub_789(this.var_490[var5]) + 20) / 10;
      }

      for(int var7 = 0; var7 < this.var_6e6; ++var7) {
         int var4;
         if ((var4 = this.var_6b2 + var7) >= this.var_490.length) {
            var4 -= this.var_490.length;
         }

         if (this.var_c61 == 0) {
            int var8 = Math.max(this.sub_ec() + var2, var2 + this.var_36c.getWidth() + this.var_3c9.getWidth() + Class_1cc.sub_789(this.var_490[var5]));
            if (var7 == this.var_69b) {
               this.sub_4aa(var1, Class_1cc.sub_789(this.var_490[var4]), var8 - var6 * this.var_7ad, this.var_95e + this.var_7ff * var7);
            }

            Class_1cc.sub_861(var1, this.var_490[var4], var8 - var6 * this.var_7ad, this.var_95e + 3 + this.var_7ff * var7, 17);
         } else if (this.var_c61 == 2) {
            if (var7 == this.var_69b) {
               this.sub_4aa(var1, Class_1cc.sub_789(this.var_490[var4]), var2 + var6 * this.var_7ad, this.var_95e + this.var_7ff * var7);
            }

            Class_1cc.sub_861(var1, this.var_490[var4], var2 + var6 * this.var_7ad, this.var_95e + 3 + this.var_7ff * var7, 17);
         } else {
            if (var7 == this.var_69b) {
               this.sub_4aa(var1, Class_1cc.sub_789(this.var_490[var4]), var2, this.var_95e + this.var_7ff * var7);
            }

            Class_1cc.sub_861(var1, this.var_490[var4], var2, this.var_95e + 3 + this.var_7ff * var7, 17);
            if (this.var_490.length > this.var_9d0) {
               this.sub_20b(var1, this.var_490.length, (this.var_69b + this.var_6b2) % this.var_490.length);
            }
         }
      }

   }

   private void sub_20b(Graphics var1, int var2, int var3) {
      int var4;
      float var5 = (float)(var4 = this.sub_139() - this.var_5fa - this.var_95e - 10) / (float)var2;
      int var6 = this.sub_ec() - 4;
      int var7 = this.var_95e + 5;
      var1.setColor(16776960);
      var1.drawLine(var6 + 1, var7, var6 + 1, var7 + var4 - 1);
      var1.fillRect(var6, (int)((float)var7 + var5 * (float)var3), 3, (int)Math.max(var5, 1.0F));
   }

   private void sub_24a() {
      if (this.var_490.length > this.var_9d0) {
         if (--this.var_69b < 0) {
            this.var_69b = 0;
            if (--this.var_6b2 < 0) {
               this.var_6b2 = this.var_490.length - 1;
               return;
            }
         }
      } else if (--this.var_69b < 0) {
         this.var_69b = this.var_6e6 - 1;
      }

   }

   private void sub_25e() {
      if (this.var_490.length > this.var_9d0) {
         if (++this.var_69b >= this.var_6e6) {
            this.var_69b = this.var_6e6 - 1;
            if (++this.var_6b2 >= this.var_490.length) {
               this.var_6b2 = 0;
               return;
            }
         }
      } else if (++this.var_69b >= this.var_6e6) {
         this.var_69b = 0;
      }

   }

   private void sub_29f() {
      int var1;
      if ((var1 = this.var_6b2 + this.var_69b) >= this.var_490.length) {
         var1 -= this.var_490.length;
      }

      switch (this.var_c42) {
         case 0:
            if (this.var_490[var1].equals(Class_1cc.sub_2dd(38))) {
               this.var_223.sub_63a();
               this.var_223.sub_413();
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(160))) {
               this.sub_361((byte)1);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(4))) {
               this.sub_361((byte)5);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(6))) {
               this.sub_361((byte)7);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(5))) {
               this.sub_361((byte)6);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(7))) {
               this.sub_361((byte)8);
               return;
            }
            break;
         case 1:
            if (this.var_490[var1].equals(Class_1cc.sub_2dd(65))) {
               this.sub_361((byte)2);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(1))) {
               this.sub_361((byte)3);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(66))) {
               this.sub_361((byte)13);
               return;
            }
            break;
         case 2:
            if (this.var_490[var1].equals(Class_1cc.sub_2dd(38))) {
               this.sub_361((byte)10);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(16))) {
               if (this.var_223.sub_77b()) {
                  this.sub_361((byte)9);
                  return;
               }

               this.sub_361((byte)10);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(2))) {
               this.sub_361((byte)22);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(161))) {
               this.sub_361((byte)26);
               return;
            }
            break;
         case 3:
            if (this.var_490[var1].equals(Class_1cc.sub_2dd(165))) {
               this.var_ca2 = 0;
               this.sub_361((byte)23);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(164))) {
               if (this.var_223.var_123.sub_c47()) {
                  this.var_ca2 = 1;
                  this.sub_361((byte)23);
                  return;
               }

               this.sub_361((byte)24);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(163))) {
               if (this.var_223.var_123.sub_c1e()) {
                  this.var_ca2 = 2;
                  this.sub_361((byte)23);
                  return;
               }

               this.sub_361((byte)24);
               return;
            }
         case 4:
         case 7:
         case 19:
         case 20:
         case 24:
         case 25:
         case 26:
         default:
            break;
         case 5:
            if (this.var_490[var1].equals(Class_1cc.sub_2dd(14))) {
               this.var_223.sub_682(!this.var_223.var_a65);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(158))) {
               this.var_223.sub_6a9(!this.var_223.var_ab0);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(15))) {
               this.var_223.sub_6eb(!this.var_223.var_ad7);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(110))) {
               this.sub_361((byte)21);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(207)) || this.var_490[var1].equals(Class_1cc.sub_2dd(215))) {
               this.sub_361((byte)27);
            }
            break;
         case 6:
            if (this.var_490[var1].equals(Class_1cc.sub_2dd(88))) {
               this.sub_361((byte)19);
               return;
            }

            if (this.var_490[var1].equals(Class_1cc.sub_2dd(89))) {
               this.sub_361((byte)20);
               return;
            }
            break;
         case 8:
            this.var_cf4 = false;
            this.var_223.sub_5a5();
            return;
         case 9:
            int var4 = this.var_223.var_a8.var_37;
            this.var_223.var_a8.sub_31();
            this.var_223.var_123.sub_961();
            this.var_223.sub_81d();
            Class_1cc.sub_6cf(Class_1cc.var_190[2], this.var_223.var_a8.var_37, var4, false);
            this.sub_361((byte)10);
            return;
         case 10:
            this.sub_361((byte)11);
            return;
         case 11:
            this.var_223.sub_63a();
            this.var_223.sub_4ed();
            return;
         case 12:
            if (this.var_e20) {
               this.sub_361((byte)28);
               return;
            }

            this.sub_361((byte)2);
            return;
         case 13:
            this.sub_361((byte)17);
            return;
         case 14:
            this.var_6f4 = this.var_4dc[this.var_69b];
            this.var_4dc = null;
            this.sub_361((byte)15);
            return;
         case 15:
            this.var_70d = this.var_69b;
            byte var5 = this.var_223.var_123.sub_57a(this.var_ca2, this.var_70d, this.var_cd8);
            if (this.var_223.var_123.sub_790(var5) > 0) {
               this.sub_361((byte)16);
               return;
            }

            this.var_223.sub_63a();
            this.var_223.sub_3e0(var5, (byte)0, (byte)this.var_6f4);
            return;
         case 16:
            this.var_787 = this.var_69b;
            this.var_223.sub_63a();
            this.var_223.sub_3e0(this.var_223.var_123.sub_57a(this.var_ca2, this.var_70d, this.var_cd8), (byte)this.var_787, (byte)this.var_6f4);
            return;
         case 17:
            this.var_223.sub_9ff();
            this.sub_361((byte)13);
            return;
         case 18:
            this.sub_361((byte)0);
            return;
         case 21:
            this.var_de3 = true;
            this.var_223.sub_be5();
            this.sub_361((byte)5);
            return;
         case 22:
            this.var_223.var_8f8 = this.var_4dc[this.var_69b];
            this.sub_361((byte)4);
            return;
         case 23:
            this.var_cd8 = (byte)this.var_69b;
            this.sub_361((byte)14);
            return;
         case 27:
            float var2 = 2.0F * (float)this.var_69b;
            this.var_223.var_595 = var2;
            this.sub_361((byte)5);
            return;
         case 28:
            this.sub_361((byte)26);
            return;
         case 29:
            if (this.var_490[var1].equals(Class_1cc.sub_2dd(234))) {
               if (this.var_223.var_7cb) {
                  this.var_223.sub_1c3(false);
               }
            } else if (this.var_490[var1].equals(Class_1cc.sub_2dd(235)) && !this.var_223.var_7cb) {
               this.var_223.sub_1c3(true);
            }

            this.var_9d0 = (this.sub_139() - this.var_5fa - this.var_95e) / this.var_7ff;
            this.var_648 = (this.sub_139() - this.var_5fa - this.var_95e) / this.var_30;
            this.var_842 = this.sub_ec();
            this.var_89a = this.sub_139() - this.var_95e - this.var_5fa - 10 - this.var_92 - this.var_30 / 2;
            this.var_8fb = this.var_2ea.getWidth() / 2;
            this.var_b73 = 5 + this.var_8fb + 1;
            this.var_a16 = this.sub_ec() - this.var_b73 - 5;
            this.var_ac9 = this.var_a77 / this.var_30;
            this.var_bcf = this.sub_ec() - this.var_b73 - 5;
            this.var_b27 = this.sub_ec() - 20;
            this.var_54c = new int[this.var_a16 * this.var_a77];

            for(int var3 = 0; var3 < this.var_54c.length; ++var3) {
               this.var_54c[var3] = -2002869338;
            }

            this.var_bde = this.sub_ec() - 20;
            this.var_e67 = this.sub_139() >= 230;
            this.sub_361((byte)5);
            return;
      }

   }

   private void sub_2ee() {
      switch (this.var_c42) {
         case 0:
            this.sub_361((byte)8);
            return;
         case 2:
         case 3:
            this.sub_361((byte)1);
            return;
         case 7:
            this.var_3e5 = null;
            Runtime.getRuntime().gc();
         case 1:
         case 5:
         case 6:
         case 8:
            this.sub_361((byte)0);
            return;
         case 9:
         case 10:
         case 22:
         case 26:
            this.sub_361((byte)2);
            return;
         case 11:
            this.sub_361((byte)10);
            return;
         case 13:
            this.sub_361((byte)1);
            return;
         case 14:
            this.sub_361((byte)23);
            return;
         case 15:
            this.sub_361((byte)14);
            return;
         case 16:
            this.sub_361((byte)15);
            return;
         case 17:
            this.sub_361((byte)13);
            return;
         case 20:
            this.var_3e5 = null;
            Runtime.getRuntime().gc();
         case 19:
            this.sub_361((byte)6);
            return;
         case 21:
            this.var_de3 = false;
            this.sub_361((byte)5);
            return;
         case 23:
            this.sub_361((byte)3);
            return;
         case 24:
            this.sub_361((byte)3);
            return;
         case 27:
            this.sub_361((byte)5);
            return;
         case 29:
            this.var_de3 = false;
            this.sub_361((byte)5);
         case 4:
         case 12:
         case 18:
         case 25:
         case 28:
         default:
      }
   }

   private void sub_305(int var1) {
      switch (var1) {
         case 0:
            int var3 = 5;
            if (this.var_223.sub_736()) {
               ++var3;
            }

            if (this.var_223.var_9d4) {
               ++var3;
            }

            this.var_490 = new String[var3];
            int var15 = 0;
            if (this.var_223.sub_736()) {
               ++var15;
               this.var_490[0] = Class_1cc.sub_2dd(38);
            }

            this.var_490[var15++] = Class_1cc.sub_2dd(160);
            if (this.var_223.var_9d4) {
               this.var_490[var15++] = Class_1cc.sub_2dd(67);
            }

            this.var_490[var15++] = Class_1cc.sub_2dd(4);
            this.var_490[var15++] = Class_1cc.sub_2dd(5);
            this.var_490[var15++] = Class_1cc.sub_2dd(6);
            this.var_490[var15] = Class_1cc.sub_2dd(7);
            break;
         case 1:
            this.var_490 = new String[]{Class_1cc.sub_2dd(1), Class_1cc.sub_2dd(65), Class_1cc.sub_2dd(66)};
            break;
         case 2:
            if (this.var_223.sub_77b()) {
               this.var_490 = new String[]{Class_1cc.sub_2dd(38), Class_1cc.sub_2dd(16), Class_1cc.sub_2dd(2), Class_1cc.sub_2dd(161)};
            } else {
               this.var_490 = new String[]{Class_1cc.sub_2dd(16), Class_1cc.sub_2dd(2), Class_1cc.sub_2dd(161)};
            }
            break;
         case 3:
            this.var_490 = new String[]{Class_1cc.sub_2dd(165), Class_1cc.sub_2dd(164), Class_1cc.sub_2dd(163)};
         case 4:
         case 7:
         case 20:
         case 25:
         case 27:
         default:
            break;
         case 5:
            int var11 = 1;
            if (this.var_223.var_990) {
               ++var11;
               ++var11;
            }

            if (this.var_223.var_97c) {
               ++var11;
            }

            if (this.var_223.var_455 == null) {
               ++var11;
            }

            this.var_490 = new String[var11];
            var11 = 0;
            if (this.var_223.var_990) {
               ++var11;
               this.var_490[0] = Class_1cc.sub_2dd(14);
               ++var11;
               this.var_490[1] = Class_1cc.sub_2dd(158);
            }

            if (this.var_223.var_97c) {
               this.var_490[var11++] = Class_1cc.sub_2dd(15);
            }

            if (this.var_223.var_455 == null) {
               this.var_490[var11++] = Class_1cc.sub_2dd(110);
            }

            this.var_490[var11] = this.var_e67 ? Class_1cc.sub_2dd(207) : Class_1cc.sub_2dd(215);
            break;
         case 6:
            this.var_490 = new String[]{Class_1cc.sub_2dd(88), Class_1cc.sub_2dd(89)};
            break;
         case 8:
            this.var_490 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(13), this.sub_ec() - 2);
            break;
         case 9:
            this.var_490 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(216), this.sub_ec() - 2);
            break;
         case 10:
            this.var_490 = Class_1cc.sub_9cb(this.var_223.var_123.sub_841(), this.var_a16 - 10);
            this.var_ac9 = this.var_a77 / this.var_30;
            if (this.var_490.length > this.var_ac9) {
               --this.var_ac9;
            }
            break;
         case 11:
            this.var_490 = Class_1cc.sub_9cb(this.var_223.var_123.sub_8be(), this.var_a16 - 10);
            this.var_ac9 = this.var_a77 / this.var_30;
            if (this.var_490.length > this.var_ac9) {
               --this.var_ac9;
            }
            break;
         case 12:
            this.var_490 = Class_1cc.sub_9cb(this.var_223.var_123.sub_8cf(this.var_d86), this.var_a16 - 10);
            this.var_ac9 = this.var_a77 / this.var_30;
            if (this.var_490.length > this.var_ac9) {
               --this.var_ac9;
            }
            break;
         case 13:
            this.var_490 = new String[12];
            int[] var20 = this.var_223.var_4b8;
            String[] var5 = this.var_223.var_51c;

            for(int var24 = 0; var24 < this.var_490.length; ++var24) {
               if (var24 % 3 == 0) {
                  this.var_490[var24] = this.var_223.var_123.sub_20a(var24 / 3);
               } else if (var24 % 3 == 1) {
                  this.var_490[var24] = var5[var24 / 3];
               } else if (var20[var24 / 3] == 0) {
                  this.var_490[var24] = "--:--:--";
               } else {
                  this.var_490[var24] = Class_1cc.sub_516(var20[var24 / 3]);
               }
            }
            break;
         case 14:
         case 22:
            this.var_490 = new String[this.var_4dc.length];

            for(int var23 = 0; var23 < this.var_490.length; ++var23) {
               this.var_490[var23] = Class_1cc.sub_467(this.var_4dc[var23]);
            }
            break;
         case 15:
            this.var_490 = new String[this.var_223.var_123.sub_603(this.var_ca2, this.var_cd8)];

            for(int var22 = 0; var22 < this.var_490.length; ++var22) {
               this.var_490[var22] = this.var_223.var_123.sub_19c(this.var_223.var_123.sub_57a(this.var_ca2, var22, this.var_cd8));
            }
            break;
         case 16:
            this.var_490 = new String[this.var_223.var_123.sub_6dc()];

            for(int var21 = 0; var21 < this.var_490.length; ++var21) {
               this.var_490[var21] = Class_1cc.sub_50c(var21);
            }
            break;
         case 17:
            this.var_490 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(18), this.sub_ec() - 2);
            break;
         case 18:
            this.var_162[0] = Class_1cc.sub_4c0(this.var_978);
            this.var_162[1] = this.var_223.sub_88e(this.var_978) ? Class_1cc.sub_2dd(102) : Class_1cc.sub_2dd(103);
            this.var_490 = Class_1cc.sub_9cb(Class_1cc.sub_3d0("{0} {1}", this.var_162), this.sub_ec() - 2);
            break;
         case 19:
            String[] var6 = this.var_223.var_57f;
            this.var_490 = new String[var6.length + 1];

            for(int var7 = 0; var7 < var6.length; ++var7) {
               this.var_490[var7] = var6[var7];
            }

            String[] var25 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(228), 122);
            this.var_490 = new String[var6.length + var25.length];

            for(int var8 = 0; var8 < var6.length; ++var8) {
               this.var_490[var8] = var6[var8];
            }

            int var26 = var6.length;

            for(int var9 = 0; var26 < this.var_490.length; ++var9) {
               this.var_490[var26] = var25[var9];
               ++var26;
            }
            break;
         case 21:
            this.var_490 = new String[5];

            for(int var4 = 0; var4 < this.var_490.length; ++var4) {
               this.var_490[var4] = Class_258.var_c[var4][0];
            }
            break;
         case 23:
            int var10 = 1;
            if (this.var_223.var_123.sub_6c6() > 0) {
               ++var10;
            }

            this.var_490 = new String[var10];
            this.var_490[0] = Class_1cc.sub_2dd(169);
            if (this.var_223.var_123.sub_6c6() > 0) {
               this.var_490[1] = Class_1cc.sub_2dd(170);
            }
            break;
         case 24:
            this.var_490 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(167), this.sub_ec() - 2);
            break;
         case 26:
            this.var_490 = new String[2];
            boolean var2 = false;
            this.var_490[0] = Class_1cc.sub_2dd(198);
            this.var_162[0] = Integer.toString(this.var_223.var_123.sub_106());
            this.var_162[1] = Class_1cc.sub_2dd(172);
            this.var_490[1] = Class_1cc.sub_3d0("{0}{1}", this.var_162);
            break;
         case 28:
            this.var_490 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(211), this.sub_ec() - 2);
            break;
         case 29:
            this.var_490 = new String[]{Class_1cc.sub_2dd(234), Class_1cc.sub_2dd(235)};
      }

      this.var_6e6 = Math.min(this.var_9d0, this.var_490.length);
   }

   private void sub_361(byte var1) {
      this.var_7ad = 0;
      this.var_c4c = var1;
      this.sub_3b1();
   }

   private void sub_3b1() {
      this.var_6b2 = 0;
      this.var_7ad = 0;
      int var1 = this.var_69b;
      if (this.var_c4c != 5 || this.var_c42 != 21) {
         this.var_69b = 0;
      }

      if (this.var_c4c == 14) {
         this.var_4dc = this.var_223.var_123.sub_8f2();

         for(int var2 = 0; var2 < this.var_4dc.length; ++var2) {
            if (this.var_4dc[var2] == 2) {
               this.var_69b = var2;
            }
         }

         this.sub_437();
      } else if (this.var_c4c == 21) {
         this.var_69b = this.var_223.var_771;
      } else if (this.var_c4c == 22) {
         this.var_4dc = this.var_223.var_123.sub_8f2();

         for(int var3 = 0; var3 < this.var_4dc.length; ++var3) {
            if (this.var_4dc[var3] == this.var_223.var_8f8) {
               this.var_69b = var3;
            }
         }

         this.sub_437();
      } else if (this.var_c4c == 5 && this.var_c42 == 21 && this.var_de3) {
         this.var_223.var_771 = var1;
         Class_1cc.sub_2a1(var1);
         this.var_223.sub_8ee();
         this.var_69b = 0;
      } else if (this.var_c42 == 0 && this.var_c4c != 0) {
         this.var_d00 = false;
      } else if (this.var_c4c == 27) {
         this.var_69b = (int)(this.var_223.var_595 / 2.0F);
      }

      this.sub_305(this.var_c4c);
      this.var_c42 = this.var_c4c;
      switch (this.var_c42) {
         case 3:
            this.sub_54a();
            break;
         case 4:
            this.var_223.sub_244();
            break;
         case 7:
            this.var_d36 = true;
            this.sub_3bc();
            this.var_d36 = false;
            break;
         case 20:
            this.var_d36 = true;
            this.sub_406(this.sub_ec() - 12, 231);
            this.var_d36 = false;
      }

      if (this.var_c42 == 0 && this.var_d00) {
         this.var_c61 = 0;
      } else {
         this.var_c61 = 1;
      }
   }

   private void sub_3bc() {
      this.sub_406(this.sub_ec() - 12, 232);
      this.var_3e5.insertElementAt("", 0);
      this.var_3e5.insertElementAt(this.var_223.sub_550(), 0);

      String[] var1;
      for(int var2 = (var1 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(12), this.sub_ec() - 12)).length - 1; var2 >= 0; --var2) {
         this.var_3e5.insertElementAt(var1[var2], 0);
      }

   }

   private void sub_406(int var1, int var2) {
      boolean var6 = false;
      String var7 = Class_1cc.sub_2dd(var2);
      this.var_3e5 = new Vector();
      StringBuffer var8 = new StringBuffer();
      StringBuffer var9 = new StringBuffer();
      boolean var3 = false;
      int var4 = 0;
      int var5 = 0;
      var6 = false;

      while(var4 < var7.length()) {
         while(var4 < var7.length() && var7.charAt(var4) != ' ') {
            if (var7.charAt(var4) == '\\' && var4 + 1 < var7.length() && var7.charAt(var4 + 1) == 'n') {
               var6 = true;
               var4 += 2;
               var5 = var4;
               break;
            }

            var8.append(var7.charAt(var4++));
         }

         if (var6) {
            if (Class_1cc.sub_789(var9.toString() + " " + var8.toString()) < var1) {
               var9.append((var9.length() == 0 ? "" : " ") + var8.toString());
            } else {
               this.var_3e5.addElement(var9.toString());
               var9 = new StringBuffer(var8.toString());
            }

            this.var_3e5.addElement(var9.toString());
            var4 = var5;
            var8 = new StringBuffer();
            var9 = new StringBuffer();
            var6 = false;
         } else if (Class_1cc.sub_789(var9.toString() + " " + var8.toString()) < var1) {
            var9.append((var9.length() == 0 ? "" : " ") + var8.toString());
            if (var4 == var7.length() - 1) {
               this.var_3e5.addElement(var9.toString());
            } else {
               ++var4;
               var5 = var4;
               var8 = new StringBuffer();
            }
         } else if (Class_1cc.sub_789(var8.toString()) <= var1) {
            this.var_3e5.addElement(var9.toString());
            var9 = new StringBuffer(var8.toString());
            var8 = new StringBuffer();
         } else {
            String var10;
            int var11 = (var10 = var8.toString()).length() - 1;

            for(int var12 = 0; var12 < var10.length(); ++var12) {
               if (Class_1cc.sub_789(var10.substring(0, var12)) > var1) {
                  var11 = var12;
                  break;
               }
            }

            this.var_3e5.addElement(var9.toString());
            var9 = new StringBuffer(var10.substring(0, var11 - 1));
            var8 = new StringBuffer(var10.substring(var11, var10.length() - 1));
         }
      }

      if (var9.length() != 0) {
         this.var_3e5.addElement(var9.toString());
      }

      Runtime.getRuntime().gc();
   }

   private void sub_437() {
      this.var_172 = Graphics3D.getInstance();
      this.var_1ba = new World();
      Background var1;
      (var1 = new Background()).setColor(8355711);
      Light var2;
      (var2 = new Light()).setMode(128);
      var2.setColor(16777215);
      Camera var3 = new Camera();
      float var4 = (float)this.var_842 / ((float)this.var_89a * 1.0F);
      var3.setPerspective(50.0F, var4, Class_d6.var_2f, Class_d6.var_46);
      ((Transformable)var3).setTranslation(0.0F, 2.0F, 5.5F);
      ((Transformable)var3).postRotate(19.98F, -1.0F, 0.0F, 0.0F);
      this.var_1f3 = (Group)Class_1cc.var_190[this.var_4dc[this.var_69b]].duplicate();
      this.var_1ba.setBackground(var1);
      this.var_1ba.addChild(var2);
      this.var_1ba.addChild(this.var_1f3);
      this.var_1ba.addChild(var3);
      this.var_1ba.setActiveCamera(var3);
      Runtime.getRuntime().gc();
   }

   private void sub_47c(int var1, int var2) {
      for(int var3 = 0; var3 < this.var_515.length; ++var3) {
         if (this.var_223.sub_abc(GameMidlet.var_33[var3][this.var_515[var3]], var1, var2)) {
            if (++this.var_515[var3] >= GameMidlet.var_33[var3].length) {
               this.var_978 = var3;
               this.var_223.sub_840(var3);
               this.sub_361((byte)18);

               for(int var4 = 0; var4 < this.var_515.length; ++var4) {
                  this.var_515[var4] = 0;
               }
               break;
            }
         } else {
            this.var_515[var3] = 0;
         }
      }

   }

   private void sub_4aa(Graphics var1, int var2, int var3, int var4) {
      int var5;
      if ((var5 = this.var_6b2 + this.var_69b) >= this.var_490.length) {
         var5 -= this.var_490.length;
      }

      if (this.var_c42 == 5 && (this.var_490[var5].equals(Class_1cc.sub_2dd(14)) || this.var_490[var5].equals(Class_1cc.sub_2dd(158)) || this.var_490[var5].equals(Class_1cc.sub_2dd(15)))) {
         var2 += 20;
      }

      int var6 = var2 / 2;
      var1.drawImage(this.var_36c, var3 - var6, var4, 24);
      var1.drawImage(this.var_3c9, var3 + var6, var4, 20);
      var1.setColor(30872);
      var1.fillRect(var3 - var6, var4 + 1, var2, this.var_36c.getHeight() - 2);
      var1.setColor(41152);
      var1.drawLine(var3 - var6, var4 + 1, var3 + var6, var4 + 1);
      var1.setColor(19551);
      var1.drawLine(var3 - var6, var4 + this.var_36c.getHeight() - 2, var3 + var6, var4 + this.var_36c.getHeight() - 2);
   }

   private void sub_4c4(Graphics var1) {
      if (this.var_223.var_7cb) {
         var1.setColor(16777215);
         var1.fillRect(0, this.sub_139() - this.var_5fa, this.sub_ec(), this.var_5fa);
         var1.setColor(0);
         var1.drawLine(0, this.sub_139() - this.var_5fa - 1, this.sub_ec(), this.sub_139() - this.var_5fa - 1);
      }

      switch (this.var_c42) {
         case 0:
            this.sub_505(var1, 10, 7);
            return;
         case 1:
         case 2:
         case 3:
         case 5:
         case 6:
         case 10:
         case 11:
         case 14:
         case 15:
         case 16:
         case 21:
         case 22:
         case 23:
         case 27:
         case 29:
            this.sub_505(var1, 10, 11);
            return;
         case 7:
         case 19:
         case 20:
         case 24:
         case 26:
            this.sub_505(var1, -1, 11);
            return;
         case 8:
         case 9:
         case 17:
            this.sub_505(var1, 8, 9);
         case 4:
         case 25:
         default:
            return;
         case 12:
         case 18:
         case 28:
            this.sub_505(var1, 22, -1);
            return;
         case 13:
            this.sub_505(var1, 171, 11);
      }
   }

   private void sub_505(Graphics var1, int var2, int var3) {
      var1.setFont(Class_1cc.sub_20a());
      var1.setColor(16777215);
      var1.fillRect(0, this.sub_139() - this.var_5fa, this.sub_ec(), this.var_5fa);
      var1.setColor(0);
      var1.drawLine(0, this.sub_139() - this.var_5fa - 1, this.sub_ec(), this.sub_139() - this.var_5fa - 1);
      var1.setFont(Class_1cc.sub_20a());
      if (var2 != -1) {
         var1.drawString(Class_1cc.sub_2dd(var2), 2, this.sub_139() - 1, 36);
      }

      if (var3 != -1) {
         var1.drawString(Class_1cc.sub_2dd(var3), this.sub_ec() - 2, this.sub_139() - 1, 40);
      }

   }

   private void sub_54a() {
      switch (this.var_69b) {
         case 0:
            this.var_42e = Class_1cc.sub_2dd(212);
            return;
         case 1:
            this.var_42e = Class_1cc.sub_2dd(213);
            return;
         case 2:
            this.var_42e = Class_1cc.sub_2dd(214);
         default:
      }
   }
}
