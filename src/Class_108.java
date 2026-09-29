import java.io.DataInputStream;
import java.io.EOFException;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Light;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.Node;
import javax.microedition.m3g.Object3D;
import javax.microedition.m3g.RayIntersection;
import javax.microedition.m3g.Transformable;
import javax.microedition.m3g.World;

public final class Class_108 implements Class_2b9, CommandListener {
   private final int var_2c = Class_1cc.sub_7b9() + 1;
   private final int var_77;
   private final int var_c1;
   private final Object[] var_10a;
   private GameMidlet var_166;
   private Class_7d var_18e;
   private World var_1c5;
   private Graphics3D var_1ea;
   private Group var_1ff;
   private Group var_20e;
   private Class_a0 var_21b;
   private Class_53 var_237;
   private Class_b4 var_299;
   private Image var_2d8;
   private Image var_341;
   private Image var_384;
   private Image var_395;
   private Image var_442;
   private Image var_46e;
   private Image var_4cf;
   private Image var_524;
   private Image var_572;
   private Image var_5b4;
   private Image var_610;
   private Image var_657;
   private Image var_66d;
   private Image var_6a7;
   private Image var_6b3;
   private Class_d6 var_6cc;
   private String var_6f7;
   private String var_757;
   private String var_78e;
   private String var_79a;
   private String var_7f0;
   private Random var_843;
   private Image[] var_89c;
   private float[] var_8aa;
   private float[] var_8d9;
   private float[] var_911;
   private byte[] var_921;
   public int[][][] var_95b;
   private short[] var_977;
   public String[] var_9aa;
   private String[] var_9d2;
   private String[] var_9ff;
   private Mesh[] var_a30;
   private Image[] var_a54;
   private float var_a7e;
   private float var_ab1;
   private float var_abd;
   private float var_aca;
   private float var_af4;
   public float var_b13;
   public float var_b42;
   private float var_b50;
   public float var_b95;
   private long var_ba9;
   private long var_c01;
   private int var_c3e;
   private int var_c9a;
   private int var_cee;
   private int var_d37;
   private int var_d67;
   private int var_d99;
   private int var_da3;
   private int var_ddc;
   private int var_e23;
   private int var_e3b;
   private int var_e82;
   private int var_eb5;
   private int var_ec8;
   private int var_f19;
   private int var_f7d;
   private int var_fb5;
   private int var_100e;
   private int var_105a;
   private int var_107e;
   private int var_10b3;
   private int var_1108;
   private int var_1119;
   private int var_1175;
   private int var_11bb;
   private int var_11c5;
   private int var_1215;
   private byte var_1236;
   private byte var_125b;
   private byte var_1278;
   private byte var_12af;
   private byte var_130a;
   private byte var_135a;
   public byte var_1367;
   public byte var_1372;
   public byte var_13bd;
   public byte var_13c9;
   public byte var_13eb;
   public boolean var_1425;
   private boolean var_1436;
   public boolean var_144c;
   private boolean var_1499;
   public boolean var_14eb;
   public boolean var_1508;
   private boolean var_1559;
   private boolean var_15ad;
   private boolean var_15d5;
   private boolean var_1605;
   private boolean var_1647;
   private boolean var_1695;
   private boolean var_16a9;
   private boolean var_16e5;
   public boolean var_1707;
   public boolean var_172a;
   public boolean var_1748;
   public boolean var_17a1;
   public boolean var_17c0;
   private boolean var_17de;
   private boolean var_17f0;
   private boolean var_180d;

   public Class_108(GameMidlet var1, Class_7d var2, Image var3, int[][][] var4, int var5, byte var6, byte var7, byte var8, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13) {
      this.var_77 = this.var_2c + 10;
      this.var_c1 = this.var_2c - 5;
      this.var_10a = new Object[2];
      this.var_843 = new Random();
      this.var_166 = var1;
      this.var_18e = var2;
      this.var_66d = var3;
      this.var_95b = var4;
      this.var_ddc = var5;
      this.var_13bd = var8;
      this.var_12af = var1.var_123.sub_39e(var8);
      this.var_1367 = var1.var_123.sub_5ce(var8);
      this.var_1425 = var1.var_123.sub_537(var8);
      this.var_144c = var9;
      this.var_14eb = var10;
      this.var_e3b = var6;
      this.var_e82 = var7;
      this.var_1508 = var11;
      this.var_1559 = var12;
      this.var_15ad = var13;
      this.var_1372 = var1.var_123.sub_786(var8);
      this.var_1647 = var1.var_123.sub_790(var8) > 0;
      Class_1cc.sub_831(false);
      this.var_9aa = var1.var_57f;
      Class_1cc.sub_831(true);
      this.var_1236 = 0;
      this.var_c3e = -9999;
      this.var_c9a = -9999;
      this.var_da3 = 0;
      this.var_eb5 = 0;
      this.var_11bb = 0;
      this.var_e23 = 2999;
      this.var_1499 = false;
      this.var_17f0 = false;
      this.var_16e5 = false;
      this.var_1707 = false;
      this.var_172a = false;
      this.var_1748 = false;
      this.var_17a1 = false;
      this.var_17c0 = false;
      this.var_757 = new String();
      this.var_6f7 = new String();
      this.var_78e = new String();
      this.var_130a = (byte)Math.min(this.sub_3b2() - 20, 127);
      this.var_135a = (byte)Math.min(this.sub_3b2() / 5, 40);
      this.var_8aa = new float[16];
      this.var_911 = new float[4];
      this.var_15d5 = var1.var_a65 && var1.var_990;
      this.var_1ea = Graphics3D.getInstance();
      this.var_1695 = var1.var_123.sub_3d3(var8);

      try {
         this.var_524 = Image.createImage("/girl.png");
         this.var_6a7 = Image.createImage("/track" + this.var_12af + ".png");
      } catch (Exception var16) {
      }

      this.var_d37 = Class_1cc.sub_26c() + 1;
      this.var_f7d = Math.min(Math.max(2 + (this.var_9aa.length + 2) * this.var_2c, this.var_2c + 4 + this.var_524.getHeight()), this.sub_3db() - (this.var_d37 + 10));
      this.var_100e = Math.min(this.sub_3b2() - 10, 166);
      this.var_1175 = this.var_100e - 20;
      int[] var14 = new int[this.var_100e * this.var_f7d];

      for(int var15 = 0; var15 < var14.length; ++var15) {
         var14[var15] = -2434342;
      }

      this.var_6b3 = Image.createRGBImage(var14, this.var_100e, this.var_f7d, true);
      this.var_16a9 = this.sub_3db() >= 280;
      if (var1.var_cf1) {
         this.var_11c5 = 38;
         this.var_1215 = this.sub_3db() - 76;
      } else {
         this.var_11c5 = 0;
         this.var_1215 = this.sub_3db();
      }
   }

   public final void sub_2f() {
      System.out.println("Enter init");

      try {
         this.var_af4 = Class_1cc.var_1e4[this.var_e3b][2] - 0.5F;
         this.var_af4 *= this.var_af4;
         this.sub_4ac();
         this.var_572 = Class_1cc.sub_6b("/cash.png");
         this.var_2d8 = Class_1cc.sub_6b("/nosmeter.png");
         this.var_341 = Class_1cc.sub_6b("/nosfill.png");
         this.var_384 = Class_1cc.sub_6b("/damagemeter.png");
         this.var_395 = Class_1cc.sub_6b("/damagefill.png");
         this.var_442 = Class_1cc.sub_6b("/distancemeter.png");
         this.var_46e = Class_1cc.sub_6b("/marker1.png");
         this.var_4cf = Class_1cc.sub_6b("/marker2.png");
         Image var1;
         int var2;
         int[] var3 = new int[(var2 = (var1 = Class_1cc.sub_6b("/turnarrows.png")).getWidth() / 4) * var1.getHeight()];
         this.var_a54 = new Image[4];

         for(int var4 = 0; var4 < this.var_a54.length; ++var4) {
            var1.getRGB(var3, 0, var2, var4 * var2, 0, var2, var1.getHeight());
            this.var_a54[var4] = Image.createRGBImage(var3, var2, var1.getHeight(), true);
         }

         this.sub_5a8(90);
         if (!this.var_14eb && !this.var_144c && this.var_166.var_123.sub_ac0()) {
            int var5;
            Image var8;
            int[] var6 = new int[(var5 = (var8 = Class_1cc.sub_6b("/stages.png")).getWidth() / 3) * var8.getHeight()];
            var8.getRGB(var6, 0, var5, (this.var_166.var_123.sub_b24() - 1) * var5, 0, var5, var8.getHeight());
            this.var_657 = Image.createRGBImage(var6, var5, var8.getHeight(), true);
            Runtime.getRuntime().gc();
         }

         if (!this.var_14eb && !this.var_144c && this.var_166.var_123.sub_a98()) {
            Image var9;
            int var11 = (var9 = Class_1cc.sub_6b("/characters.png")).getWidth() / 2;
            int var12 = this.var_166.var_123.sub_aa8() * var11;
            this.var_5b4 = Image.createImage(var11, var9.getHeight());
            this.var_5b4.getGraphics().drawImage(var9, -var12, 0, 20);
            Runtime.getRuntime().gc();
         }

         if (!this.var_14eb && !this.var_144c && this.var_166.var_123.sub_b8f()) {
            byte var10;
            if ((var10 = this.var_166.var_123.sub_39e(this.var_166.var_123.sub_bd8())) == this.var_12af) {
               this.var_610 = Image.createImage(this.var_6a7);
            } else {
               this.var_610 = Class_1cc.sub_6b("/track" + var10 + ".png");
            }
         }

         this.var_107e = (this.var_f7d - this.var_77) / this.var_2c;
         this.var_fb5 = (this.sub_3db() - this.var_d37 - this.var_f7d) / 2;
         this.sub_67c();
         if (!this.var_144c) {
            this.var_921 = Class_29c.var_a[this.var_13bd];
            this.var_aca = (float)this.var_921[0] - 0.1F;
         }

         this.var_10a[0] = Integer.toString(Math.min(this.var_237.var_869, this.var_1372));
         this.var_10a[1] = Integer.toString(this.var_1372);
         this.var_78e = Class_1cc.sub_3d0("{0}/{1}", this.var_10a);
         this.sub_5a8(100);
         if (this.var_1647) {
            this.var_10a[0] = Class_1cc.sub_50c(this.var_e82);
            this.var_10a[1] = Class_1cc.sub_2dd(206);
            this.var_7f0 = Class_1cc.sub_3d0("{0}{1}", this.var_10a);
         }

         this.var_1236 = 1;
      } catch (Throwable var7) {
         this.var_1236 = 20;
         if (this.var_144c) {
            this.sub_61();
            return;
         }

         this.var_9d2 = Class_1cc.sub_989(var7.toString(), this.sub_3b2() - 2);
         this.var_524 = null;
         this.var_6a7 = null;
         this.var_6b3 = null;
         this.var_1c5 = null;
      }

      this.var_6a7 = null;
      Runtime.getRuntime().gc();
      this.sub_292();
      if (this.var_180d) {
         this.sub_34f(true);
         this.var_180d = false;
      }

   }

   private void sub_61() {
      this.var_166.sub_2a4();
   }

   private void sub_7f(boolean var1, int var2, int var3, int var4, byte var5) {
      this.var_166.sub_300(var1, var2, var3, var4, var5);
   }

   public final void sub_292() {
      if (this.var_1436) {
         ++this.var_da3;
         int var5;
         if (this.var_c3e != -9999) {
            try {
               var5 = this.var_18e.getGameAction(this.var_c3e);
            } catch (Exception var8) {
               var5 = -9999;
            }
         } else {
            var5 = -9999;
         }

         if (this.var_c9a != this.var_c3e) {
            this.var_cee = 0;
         }

         this.var_c9a = this.var_c3e;
         if (this.var_1236 != 0) {
            this.var_17de = this.sub_44c(5, this.var_c3e, var5);
            this.var_1707 = this.sub_44c(4, this.var_c3e, var5);
            this.var_172a = this.sub_44c(14, this.var_c3e, var5);
            this.var_1748 = this.sub_44c(15, this.var_c3e, var5);
            this.var_17a1 = this.sub_44c(16, this.var_c3e, var5);
            this.var_17c0 = this.sub_44c(17, this.var_c3e, var5);
         }

         switch (this.var_1236) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
               if ((this.sub_44c(12, this.var_c3e, var5) || this.sub_44c(11, this.var_c3e, var5)) && this.var_cee++ == 0) {
                  this.sub_6fb(this.var_1236);
               }
            default:
               if (this.sub_44c(13, this.var_c3e, var5) && this.var_cee++ == 0) {
                  if (this.var_1236 == 20) {
                     this.var_1436 = false;
                     this.var_166.sub_5a5();
                     return;
                  }

                  if (this.sub_799()) {
                     this.sub_84a();
                  }
               } else if (this.sub_44c(12, this.var_c3e, var5) && this.var_cee++ == 0) {
                  if (this.var_1236 == 20) {
                     this.var_1436 = false;
                     this.var_166.sub_5a5();
                     return;
                  }

                  if (this.var_144c) {
                     this.var_18e.removeCommand(Class_1cc.var_331);
                     this.sub_61();
                     return;
                  }

                  if (!this.sub_799()) {
                     this.sub_34f(true);
                  } else {
                     this.sub_7fe();
                  }
               }

               if (this.var_1236 != 0 && this.var_c3e != -9999 && this.var_cee++ == 0) {
                  if (this.var_144c) {
                     this.var_18e.removeCommand(Class_1cc.var_331);
                     this.sub_61();
                     return;
                  }

                  if (this.var_1236 == 20) {
                     this.var_1436 = false;
                     this.var_166.sub_5a5();
                     return;
                  }

                  if (this.var_1236 == 1) {
                     if (this.sub_44c(4, this.var_c3e, var5) || this.sub_44c(11, this.var_c3e, var5)) {
                        this.var_6cc.sub_179();
                        this.var_6cc.sub_1fa(this.var_1c5, this.var_237);
                        this.var_da3 = 0;
                        this.var_1236 = 2;
                     }
                  } else if (this.sub_44c(6, this.var_c3e, var5)) {
                     this.var_6cc.sub_234();
                  } else if (this.sub_799() && this.sub_44c(8, this.var_c3e, var5) && this.var_1236 != 19) {
                     if (this.var_1236 == 17) {
                        if (this.var_9aa.length > this.var_107e && ++this.var_105a >= this.var_9aa.length - this.var_107e) {
                           this.var_105a = this.var_9aa.length - this.var_107e;
                        }
                     } else if (++this.var_105a >= this.var_9ff.length) {
                        this.var_105a = 0;
                     }
                  } else if (this.sub_799() && this.sub_44c(7, this.var_c3e, var5) && this.var_1236 != 19) {
                     if (this.var_1236 == 17) {
                        if (this.var_9aa.length > this.var_107e && --this.var_105a < 0) {
                           this.var_105a = 0;
                        }
                     } else if (--this.var_105a < 0) {
                        this.var_105a = this.var_9ff.length - 1;
                     }
                  } else if (this.var_1236 == 19 && this.sub_44c(9, this.var_c3e, var5)) {
                     if (--this.var_105a < -5) {
                        this.var_105a = -5;
                     }
                  } else if (this.var_1236 == 19 && this.sub_44c(10, this.var_c3e, var5)) {
                     if (++this.var_105a > 5) {
                        this.var_105a = 5;
                     }
                  } else if (this.sub_799() && this.sub_44c(11, this.var_c3e, var5)) {
                     this.sub_7fe();
                  } else if (!this.sub_799() && this.var_166.sub_88e(4) && this.var_c3e == 48) {
                     this.var_1236 = 4;
                     this.var_16e5 = true;
                     this.var_1499 = true;
                  }
               }

               this.var_6cc.var_3cc = this.var_17de;
               if (this.var_79a != null && this.sub_3b2() - ++this.var_1108 * 3 + this.var_1119 < 0) {
                  this.var_79a = null;
               }

               this.var_ba9 = System.currentTimeMillis();
               this.var_ab1 = (float)(this.var_ba9 - this.var_c01) / 1000.0F;
               this.var_ab1 = Math.min(this.var_ab1, 0.12F);
               if (!this.sub_799()) {
                  this.var_c01 = this.var_ba9;
                  if (this.var_144c) {
                     this.var_6cc.sub_12a(this.var_1c5, this.var_1ff, this.var_20e);
                  }
               }

               int var1 = this.var_18e.getKeyStates();
               switch (this.var_1236) {
                  case 1:
                     if (!this.var_6cc.sub_13f()) {
                        return;
                     }

                     this.var_da3 = 0;
                     this.var_1236 = 2;
                     break;
                  case 2:
                     boolean var11 = false;
                     if (this.var_e23 == 2999) {
                        this.sub_e6((byte)4);
                     } else if (this.var_e23 % 1000 < (this.var_e23 - 100) % 1000) {
                        this.sub_e6((byte)4);
                     }

                     if ((this.var_e23 -= 100) <= 0) {
                        this.sub_e6((byte)5);
                        this.var_1236 = 3;
                        this.sub_2dc(Class_1cc.sub_2dd(25));
                        this.var_da3 = 0;
                        if (this.var_1647) {
                           this.var_299.sub_820();
                        }

                        if (!this.var_144c) {
                           this.var_237.sub_820();
                        }
                     }
                     break;
                  case 3:
                     if (this.var_144c && !this.var_237.sub_265() && this.var_da3 == 15) {
                        this.var_237.sub_820();
                     }

                     if (this.var_144c) {
                        ((Class_b4)this.var_237).sub_51(this.var_ab1, this.var_299, true);
                        this.var_299.sub_51(this.var_ab1, this.var_237, true);
                     } else {
                        this.var_237.sub_e7(this.var_ab1, var1, (Vector)null);
                        if (this.var_1647) {
                           this.var_299.sub_51(this.var_ab1, this.var_237, false);
                        }
                     }

                     if (this.var_1647) {
                        this.sub_51d();
                        float var2 = this.var_237.sub_622() - this.var_299.sub_622();
                        float var3 = this.var_237.sub_636() - this.var_299.sub_636();
                        this.var_abd = var2 * var2 + var3 * var3;
                        this.var_20e.setRenderingEnable(this.var_abd < 5000.0F);
                        if (this.var_abd <= this.var_af4) {
                           this.var_299.sub_686(this.var_8aa);
                           if (this.var_237.sub_740(this.var_8aa, this.var_20e)) {
                              this.sub_1ff();
                              this.sub_220();
                              float var6 = this.sub_6b9();
                              this.var_299.sub_704(var6, this.var_237.sub_2fa(), this.var_237.sub_35b());
                              var6 = (float)((double)((float)((double)var6 + Math.toRadians((double)180.0F))) % Math.toRadians((double)360.0F));
                              this.var_237.sub_704(var6, this.var_299.sub_2fa(), this.var_299.sub_35b());
                           }
                        }

                        boolean var4 = this.var_237.sub_49e(this.var_299);
                        this.var_237.var_7a0 = var4 ? 1 : 2;
                        this.var_299.var_7a0 = var4 ? 2 : 1;
                     } else {
                        this.var_237.var_7a0 = 1;
                     }

                     if (this.var_237.var_aef) {
                        this.sub_551();
                        this.var_17f0 = false;
                     }

                     int var10;
                     if (this.var_1695 && (var10 = this.var_21b.sub_60(this.var_237.sub_622(), this.var_237.sub_636()) / 2) != this.var_10b3) {
                        this.var_10b3 = var10;
                        this.sub_856(this.var_10b3);
                     }

                     if (this.var_237.var_a9a) {
                        this.sub_2dc(Class_1cc.sub_2dd(26));
                     }

                     if (!this.var_144c && !this.var_1559 && (this.var_aca -= this.var_ab1) <= -1.0F) {
                        this.var_1236 = 4;
                        this.var_237.sub_193(true);
                        this.sub_2dc(Class_1cc.sub_2dd(27));
                        this.var_da3 = 0;
                     } else if (!this.var_144c && this.var_aca < 5.0F && !this.var_17f0) {
                        this.sub_e6((byte)6);
                        this.sub_2dc(Class_1cc.sub_2dd(28));
                        this.var_17f0 = true;
                     }

                     if (!this.var_144c && this.var_237.sub_3aa() && !this.var_1508) {
                        this.var_1236 = 4;
                        this.var_237.sub_193(true);
                        this.sub_2dc(Class_1cc.sub_2dd(87));
                        this.var_da3 = 0;
                     }
                     break;
                  case 4:
                     if (this.var_144c) {
                        ((Class_b4)this.var_237).sub_51(this.var_ab1, this.var_299, true);
                        this.var_299.sub_51(this.var_ab1, this.var_237, true);
                     } else {
                        this.var_237.sub_e7(this.var_ab1, 64, (Vector)null);
                        if (this.var_1647) {
                           this.var_299.sub_51(this.var_ab1, this.var_237, false);
                        }
                     }

                     int var7;
                     if (this.var_1695 && (var7 = this.var_21b.sub_60(this.var_237.sub_622(), this.var_237.sub_636()) / 2) != this.var_10b3) {
                        this.var_10b3 = var7;
                        this.sub_856(this.var_10b3);
                     }

                     if (this.var_237.var_aef && this.var_1367 != 2 || this.var_237.var_aef && this.var_1367 == 2 && this.var_237.sub_549() <= 0.0F || this.var_1367 == 1 && !this.var_237.sub_3aa() && this.var_aca > -1.0F && this.var_237.var_498 > 0.0F && this.var_237.var_869 <= this.var_1372) {
                        this.var_1236 = 3;
                        this.var_237.sub_193(false);
                        if (this.var_237.var_aef) {
                           this.var_757 = null;
                           this.sub_551();
                        }
                     } else if (this.var_237.var_498 <= 0.0F) {
                        this.var_10a[0] = Integer.toString(this.var_eb5);
                        this.sub_6e3(7);
                        if (this.var_237.var_869 <= this.var_1372 && !this.var_16e5) {
                           this.var_eb5 = 0;
                        }

                        this.var_1236 = 7;
                        this.var_13eb = 0;
                        this.var_da3 = 0;
                        if (this.var_237.var_869 <= this.var_1372) {
                           this.sub_e6((byte)4);
                        }
                     }
                  case 5:
                  default:
                     break;
                  case 8:
                     if (this.var_13eb == 1 && this.var_1605) {
                        if (this.var_ec8 + 100 > this.var_eb5) {
                           this.var_ec8 = this.var_eb5;
                           this.var_1605 = false;
                        } else {
                           this.var_ec8 += 100;
                        }
                     }
                  case 6:
                  case 7:
                  case 9:
                  case 10:
                  case 11:
                  case 12:
                  case 13:
                  case 14:
                  case 15:
                     if (this.var_13eb == 0) {
                        if (this.var_da3 >= 3) {
                           this.var_13eb = 1;
                           if (this.var_1236 == 8) {
                              this.var_1605 = true;
                           }
                        }
                     } else if (this.var_13eb == 2 && this.var_da3 >= 3) {
                        this.var_1236 = this.var_125b;
                        if (this.var_1236 == 6) {
                           this.var_13eb = 1;
                        } else {
                           this.var_13eb = 0;
                        }

                        this.var_da3 = 0;
                     }
               }

               if (!this.sub_799() && this.var_1236 != 1) {
                  this.var_6cc.sub_1fa(this.var_1c5, (Class_53)(this.var_6cc.sub_26f(this.var_1ff) ? this.var_237 : this.var_299));
                  this.var_6cc.sub_1b8(this.var_237.var_9b4);
                  if (this.var_1236 != 4 && ++this.var_13c9 > 25) {
                     this.var_757 = "";
                  }
               }

               if (this.var_1236 != 0 && this.var_1236 != 1 && this.var_1236 != 2 && this.var_1236 != 3 && this.var_1236 != 4 && this.var_1236 != 5) {
                  this.var_c3e = -9999;
               }

         }
      }
   }

   public final int sub_b9(int var1) {
      return this.var_18e.getGameAction(var1);
   }

   public final void sub_97(Graphics var1) {
      if (this.var_1436) {
         if (this.var_1236 == 0) {
            this.sub_5e1(var1, Class_1cc.sub_2dd(20));
         } else if (this.var_1236 != 20) {
            var1.setColor(0);
            var1.fillRect(0, 0, this.sub_3b2(), this.sub_3db());
            this.sub_572(var1);
            this.sub_626(var1);
         } else {
            var1.setColor(16777215);
            var1.fillRect(0, 0, this.sub_3b2(), this.sub_3db());
            var1.setFont(Class_1cc.sub_20a());
            var1.setColor(0);

            for(int var2 = 0; var2 < this.var_9d2.length; ++var2) {
               var1.drawString(this.var_9d2[var2], this.sub_3b2() / 2, 1 + var2 * (Class_1cc.sub_20a().getHeight() + 1), 17);
            }

            this.sub_8ef(var1, -1, 7);
         }
      }
   }

   public final void sub_ad(int var1) {
      this.var_c3e = var1;
   }

   public final void sub_25d(int var1) {
      if ((this.var_1236 == 0 || this.var_1236 == 1 || this.var_1236 == 2 || this.var_1236 == 3 || this.var_1236 == 4 || this.var_1236 == 5) && this.var_c3e != this.var_166.sub_b34(12)) {
         this.var_c3e = -9999;
      }

   }

   public final void sub_e6(byte var1) {
      if (this.var_15d5 && !this.var_144c) {
         this.var_166.sub_5bf(var1);
      }

   }

   public final void sub_16f() {
      this.sub_e6((byte)2);
   }

   public final void sub_1b0() {
      this.sub_e6((byte)1);
      if (!this.var_144c) {
         this.var_166.sub_5bf((byte)-1);
      }

   }

   public final void sub_1ff() {
      if (this.var_1236 != 4 && this.var_1367 == 2) {
         this.var_1236 = 4;
         this.var_237.sub_193(true);
         this.var_1499 = false;
      }

   }

   public final void sub_220() {
      this.sub_e6((byte)0);
      if (!this.var_144c) {
         this.var_166.sub_5bf((byte)-1);
      }

   }

   public final void sub_25e(boolean var1, int var2, int var3) {
      int var5 = 0;
      int var6 = 0;
      if (var1) {
         if (this.var_237.sub_141(var2, var3) != 0) {
            for(int var7 = 1; var7 < var2; ++var7) {
               var5 += this.var_237.sub_141(var7, 1);
               var6 += this.var_299.sub_141(var7, 1);
            }

            var5 += this.var_237.sub_141(var2, var3);
            var6 += this.var_299.sub_141(var2, var3);
            int var4 = Math.abs(var5 - var6);
            this.var_10a[0] = Class_1cc.sub_2dd(98);
            this.var_10a[1] = "-" + Class_1cc.sub_516(var4);
            this.sub_2dc(Class_1cc.sub_3d0("{0} {1}", this.var_10a));
            return;
         }
      } else if (this.var_299.sub_141(var2, var3) != 0) {
         for(int var13 = 1; var13 < var2; ++var13) {
            var5 += this.var_237.sub_141(var13, 1);
            var6 += this.var_299.sub_141(var13, 1);
         }

         var5 += this.var_237.sub_141(var2, var3);
         var6 += this.var_299.sub_141(var2, var3);
         int var8 = Math.abs(var5 - var6);
         this.var_10a[0] = Class_1cc.sub_2dd(98);
         this.var_10a[1] = "+" + Class_1cc.sub_516(var8);
         this.sub_2dc(Class_1cc.sub_3d0("{0} {1}", this.var_10a));
      }

   }

   public final void sub_27d() {
      if (this.var_79a == null) {
         byte var1 = (byte)(Math.abs(this.var_843.nextInt()) % 3);
         this.var_79a = this.var_166.var_123.sub_72d(this.var_166.var_123.sub_6eb(this.var_13bd), var1);
         this.var_1119 = Class_1cc.sub_789(this.var_79a);
         this.var_1108 = 0;
      }

   }

   public final void sub_2cf(int var1) {
      if (!this.var_237.sub_3aa()) {
         this.sub_2dc(Class_1cc.sub_2dd(30));
         int var2 = (this.var_237.var_869 - 1) * this.var_166.var_123.sub_1c9(this.var_13bd) + var1;
         this.var_aca += (float)this.var_921[var2];
         this.sub_e6((byte)5);
      }

   }

   public final void sub_2dc(String var1) {
      this.var_757 = var1;
      this.var_13c9 = 0;
   }

   public final void sub_307() {
      if (!this.var_144c) {
         this.var_180d = true;
      }

   }

   public final void sub_34f(boolean var1) {
      if (this.var_1236 == 3 || this.var_1236 == 1 || this.var_1236 == 4 || this.var_1236 == 2) {
         this.var_1278 = this.var_1236;
         this.var_1236 = 6;
         this.var_105a = 0;
         if (var1) {
            this.var_da3 = 0;
            this.var_13eb = 0;
         } else {
            this.var_13eb = 1;
         }

         this.sub_7c2();
      }

   }

   public final void sub_366() {
      this.var_1436 = false;
      this.var_166 = null;
      this.var_18e = null;
      this.var_66d = null;
      this.var_1ea = null;
      if (this.var_1ff != null) {
         Class_1cc.sub_5b7(this.var_1ff);
      }

      if (this.var_1647 && this.var_20e != null) {
         Class_1cc.sub_5b7(this.var_20e);
      }

      if (this.var_237 != null) {
         this.var_237.sub_5cc();
         this.var_237 = null;
      }

      if (this.var_1647 && this.var_299 != null) {
         this.var_299.sub_5cc();
         this.var_299 = null;
      }

      this.var_1ff = null;
      this.var_20e = null;
      this.var_1c5 = null;
      this.var_2d8 = null;
      this.var_341 = null;
      this.var_384 = null;
      this.var_395 = null;
      this.var_442 = null;
      this.var_46e = null;
      this.var_4cf = null;
      this.var_a54 = null;
      this.var_524 = null;
      this.var_572 = null;
      this.var_5b4 = null;
      this.var_657 = null;
      if (this.var_6cc != null) {
         this.var_6cc.sub_3e();
         this.var_6cc = null;
      }

      this.var_6f7 = null;
      this.var_757 = null;
      this.var_78e = null;
      this.var_89c = null;
      this.var_8aa = null;
      this.var_8d9 = null;
      this.var_911 = null;
      this.var_6b3 = null;
      this.var_921 = null;
      this.var_95b = (int[][][])null;
      this.var_977 = null;
      this.var_9aa = null;
      this.var_9d2 = null;
      this.var_9ff = null;
      this.var_79a = null;
      this.var_7f0 = null;
      this.var_6a7 = null;
      this.var_610 = null;
      this.var_843 = null;
      this.var_a30 = null;
      if (this.var_21b != null) {
         this.var_21b.sub_1fb();
         this.var_21b = null;
      }

   }

   public final void sub_117() {
      this.var_166.sub_b7c();
      this.var_1436 = true;
   }

   public final void sub_154() {
      this.var_1436 = false;
   }

   public final int sub_3b2() {
      return this.var_18e.var_198;
   }

   public final int sub_3db() {
      return this.var_18e.var_1e9;
   }

   public final boolean sub_200() {
      return this.var_1436;
   }

   public final boolean sub_428(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.var_95b[var1][var2].length; ++var4) {
         if (var2 == 2) {
            if ((var3 & this.var_95b[var1][var2][var4]) > 0) {
               return true;
            }
         } else if (var3 == this.var_95b[var1][var2][var4]) {
            return true;
         }
      }

      return false;
   }

   public final boolean sub_44c(int var1, int var2, int var3) {
      return this.var_166.sub_abc(var1, var2, var3);
   }

   public final void commandAction(Command var1, Displayable var2) {
   }

   private void sub_4ac() {
      System.out.println("Enter load scene");
      System.gc();
      Object var3 = null;
      Object var7 = null;
      Object var8 = null;
      this.var_6cc = new Class_d6(this.var_1425);
      this.sub_5a8(10);
      Object3D[] var1 = Class_1cc.sub_cd("/track" + this.var_12af + ".m3g");
      this.var_1c5 = Class_1cc.sub_72f(var1);
      System.gc();

      Object3D var14;
      while((var14 = this.var_1c5.find(7000)) != null) {
         this.var_1c5.removeChild((Node)var14);
      }

      this.sub_5a8(20);
      Class_1cc.sub_536(this.var_1c5);

      for(int var15 = 0; var15 < this.var_1c5.getChildCount(); ++var15) {
         if (this.var_1c5.getChild(var15) instanceof Light) {
            ((Light)this.var_1c5.getChild(var15)).setColor(15658734);
         }
      }

      this.var_6cc.sub_ce(this.var_1c5.getActiveCamera(), this.sub_3b2(), this.var_1215);
      Class_a0[] var38 = new Class_a0[13];
      DataInputStream var43 = new DataInputStream(this.getClass().getResourceAsStream("/splines.dat"));

      try {
         String var16 = null;
         Object var18 = null;
         boolean var22 = false;

         try {
            var16 = var43.readUTF();
         } catch (EOFException var29) {
            var22 = true;
         }

         while(!var22 && var16 != null) {
            byte var21 = this.sub_4ef(var16);
            short var17 = var43.readShort();
            if (var21 == -1) {
               for(int var20 = 0; var20 != var17; var20 += var43.skipBytes(var17 - var20)) {
               }
            } else {
               byte[] var47 = new byte[var17];

               for(int var19 = 0; var19 != var47.length; var19 += var43.read(var47, 0, var47.length)) {
               }

               var38[var21] = new Class_a0(var47, var21);
            }

            try {
               var16 = var43.readUTF();
            } catch (EOFException var28) {
               var22 = true;
            }
         }
      } finally {
         var43.close();
      }

      this.sub_5a8(30);
      this.var_1ff = Class_1cc.var_190[this.var_e3b];
      this.var_1c5.addChild(this.var_1ff);
      Class_1cc.sub_5ff(this.var_1ff, this.var_e3b, false);
      if (this.var_144c) {
         this.var_237 = new Class_b4(this, this.var_166, this.var_e3b, this.var_1ff, this.var_1c5, this.var_ddc, this.var_1425);
      } else {
         this.var_237 = new Class_53(this, this.var_166, this.var_e3b, this.var_1ff, this.var_1c5, (Light)null, this.var_ddc, this.var_1425, this.var_15ad);
      }

      if (this.var_1647) {
         if (this.var_e82 == this.var_e3b) {
            this.var_20e = (Group)Class_1cc.var_190[this.var_e82].duplicate();
         } else {
            this.var_20e = Class_1cc.var_190[this.var_e82];
         }

         Class_1cc.sub_5ff(this.var_20e, this.var_e82, false);
         this.var_1c5.addChild(this.var_20e);
         this.var_299 = new Class_b4(this, this.var_166, this.var_e82, this.var_20e, this.var_1c5, 0, this.var_1425);
      }

      boolean var44 = this.var_12af < 3;
      Class_a0[] var2 = new Class_a0[10 - (this.var_1367 == 1 ? 0 : 1)];
      int var45 = this.var_1425 ? 2 : 1;
      var2[0] = new Class_a0(var38[0]);
      var2[1] = new Class_a0(var38[1]);
      var2[3] = new Class_a0(var38[6]);
      var2[4] = new Class_a0(var38[7]);
      var2[5] = new Class_a0(var38[8]);
      var2[6] = new Class_a0(var38[9]);
      var2[7] = new Class_a0(var38[10]);
      var2[8] = new Class_a0(var38[10]);
      if (var44) {
         var2[2] = new Class_a0(var38[4]);
      }

      if (this.var_1367 == 1) {
         var2[9] = new Class_a0(var38[12]);
      }

      var2[0].sub_1b(this.var_e3b);
      var2[1].sub_1b(this.var_e3b);
      this.var_237.var_27b = var2;
      if (this.var_144c && this.var_12af == 1 && var45 == 1) {
         Class_a0 var33 = new Class_a0(var38[3]);
         this.var_237.sub_6ea(var33, 8);
      }

      if (this.var_1647) {
         (var2 = new Class_a0[9])[0] = new Class_a0(var38[0]);
         var2[1] = new Class_a0(var38[1]);
         var2[3] = new Class_a0(var38[6]);
         var2[4] = new Class_a0(var38[7]);
         var2[5] = new Class_a0(var38[8]);
         var2[6] = new Class_a0(var38[9]);
         var2[7] = new Class_a0(var38[10]);
         var2[8] = new Class_a0(var38[2]);
         var2[0].sub_1b(this.var_e82);
         var2[1].sub_1b(this.var_e82);
         this.var_299.var_27b = var2;
      }

      this.sub_5a8(40);
      Class_a0 var34 = new Class_a0(var38[2]);
      RayIntersection var6 = new RayIntersection();
      var34.sub_d9(0, this.var_911);
      this.var_b95 = this.var_911[1];
      if (this.var_1c5.pick(-1, this.var_911[0], 0.5F, this.var_911[1], -1.0F, 0.0F, 0.0F, var6)) {
         this.var_b13 = this.var_911[0] - var6.getDistance() - 2.0F;
      } else {
         this.var_b13 = 0.0F;
      }

      if (this.var_1c5.pick(-1, this.var_911[0], 0.5F, this.var_911[1], 1.0F, 0.0F, 0.0F, var6)) {
         this.var_b42 = this.var_911[0] + var6.getDistance() + 2.0F;
      } else {
         this.var_b42 = 0.0F;
      }

      this.var_b50 = this.var_b13 + (this.var_b42 - this.var_b13) / 2.0F;
      byte var46;
      if (this.var_1425) {
         var46 = -1;
      } else {
         var46 = 1;
      }

      this.var_6cc.var_95.setTranslation(this.var_b50, 2.5F, this.var_b95 + (float)var46 * 50.0F);
      this.var_6cc.sub_93(this.var_1ff, this.var_1c5);
      if (this.var_144c && this.var_12af == 1 && var45 == 1) {
         var34 = new Class_a0(var38[5]);
         this.var_6cc.var_d9 = var34;
      }

      this.sub_5a8(50);
      if (this.var_1647) {
         this.var_1ff.setTranslation(this.var_b50 - 2.5F, 0.5F, this.var_b95 - (float)var46 * 2.75F);
         this.var_237.sub_26();
         this.var_20e.setTranslation(this.var_b50 + 2.5F, 0.5F, this.var_b95 - (float)var46 * 2.75F);
         this.var_299.sub_26();
      } else {
         this.var_1ff.setTranslation(this.var_b50, 0.5F, this.var_b95 - (float)var46 * 2.75F);
         this.var_237.sub_26();
      }

      Mesh var4;
      (var4 = Class_1cc.sub_88f(16777215)).setScale(this.var_b42 - this.var_b13, 1.0F, 0.2F);
      ((Transformable)var4).setTranslation(this.var_b50, 0.25F, this.var_b95);
      this.var_1c5.addChild(var4);
      this.var_237.sub_711(this.var_b50, this.var_b95);
      if (this.var_1647) {
         this.var_299.sub_711(this.var_b50, this.var_b95);
      }

      this.sub_5a8(60);
      if (this.var_1367 == 1) {
         (var4 = (Mesh)Class_1cc.sub_cd("/checkpoint.m3g")[0].duplicate()).setUserID(7000);
         var34 = this.var_237.sub_753();

         for(int var50 = 0; var50 < var34.var_44; var50 += 6) {
            var34.sub_d9(var50, this.var_911);
            float var12 = this.var_911[0];
            float var13 = this.var_911[1];
            Mesh var5;
            (var5 = (Mesh)((Object3D)var4).duplicate()).setTranslation(var12, 0.1F, var13);
            var34.sub_d9(var50 + 4, this.var_911);
            float var9 = var12 - this.var_911[0];
            float var10 = var13 - this.var_911[1];
            float var11 = Class_1cc.sub_777(var9, var10, false) + 90.0F;
            ((Transformable)var5).setOrientation(var11, 0.0F, 1.0F, 0.0F);
            float var48 = (float)Math.sqrt((double)(var9 * var9 + var10 * var10));
            ((Transformable)var5).setScale(var48, 1.0F, var48);
            this.var_1c5.addChild(var5);
         }
      }

      this.sub_5a8(70);
      (var34 = new Class_a0(var38[10])).sub_179(this.var_b50, this.var_b95);
      this.var_8d9 = new float[var34.var_44 / 2 + 1];
      float var41 = this.var_b50;
      float var42 = this.var_b95;

      for(int var51 = 0; var51 < this.var_8d9.length; ++var51) {
         int var49;
         if ((var49 = var51 * 2) < var34.var_44) {
            var34.sub_d9(var49, this.var_911);
         } else {
            this.var_911[0] = this.var_b50;
            this.var_911[1] = this.var_b95;
         }

         float var39 = this.var_911[0] - var41;
         float var40 = this.var_911[1] - var42;
         if (var51 > 0) {
            this.var_8d9[var51] = this.var_8d9[var51 - 1];
         }

         float[] var10000 = this.var_8d9;
         var10000[var51] = (float)((double)var10000[var51] + Math.sqrt((double)(var39 * var39 + var40 * var40)));
         var41 = this.var_911[0];
         var42 = this.var_911[1];
      }

      this.var_a7e = (float)this.var_1372 * this.var_8d9[this.var_8d9.length - 1];
      var34.sub_1fb();
      this.sub_5a8(80);
      if (this.var_1695) {
         this.var_a30 = new Mesh[6];

         for(int var52 = 0; var52 < this.var_a30.length; ++var52) {
            this.var_a30[var52] = (Mesh)this.var_1c5.find(9000 + var52);
         }

         this.var_21b = new Class_a0(var38[11]);
         this.var_10b3 = this.var_21b.sub_60(this.var_237.sub_622(), this.var_237.sub_636());
         this.var_10b3 /= 2;
         this.sub_856(this.var_10b3);
      }

      for(int var53 = 0; var53 < var38.length; ++var53) {
         if (var38[var53] != null) {
            var38[var53].sub_1fb();
            var38[var53] = null;
         }
      }

      Runtime.getRuntime().gc();
   }

   private byte sub_4ef(String var1) {
      int var2 = Integer.parseInt(var1.substring(0, 1));
      int var3 = Integer.parseInt(var1.substring(2, 3));
      byte var4 = (byte)Integer.parseInt(var1.substring(4, var1.indexOf(".")));
      if (var2 != this.var_12af) {
         return -1;
      } else if ((!this.var_1425 || var3 != 2) && (this.var_1425 || var3 != 1)) {
         return var4 != 0 && var4 != 1 && var4 != 11 ? -1 : var4;
      } else {
         return var4;
      }
   }

   private float sub_51d() {
      float var1 = 0.0F;
      float var2 = 0.0F;
      var1 = 0.0F + (float)(this.var_237.var_869 - 1) * this.var_8d9[this.var_8d9.length - 1];
      var2 = 0.0F + (float)(this.var_299.var_869 - 1) * this.var_8d9[this.var_8d9.length - 1];
      var1 += this.var_8d9[this.var_237.var_75a / 2];
      var2 += this.var_8d9[this.var_299.var_75a / 2];
      if (this.var_237.var_75a / 2 == this.var_8d9.length - 2) {
         this.var_911[0] = this.var_b50;
         this.var_911[1] = this.var_b95;
         var1 = (float)((double)var1 - Math.sqrt((double)this.var_237.sub_40c(this.var_911[0], this.var_911[1])));
      } else {
         var1 = (float)((double)var1 - Math.sqrt((double)this.var_237.sub_47a()));
      }

      if (this.var_299.var_75a / 2 == this.var_8d9.length - 2) {
         this.var_911[0] = this.var_b50;
         this.var_911[1] = this.var_b95;
         var2 = (float)((double)var2 - Math.sqrt((double)this.var_299.sub_40c(this.var_911[0], this.var_911[1])));
      } else {
         var2 = (float)((double)var2 - Math.sqrt((double)this.var_299.sub_47a()));
      }

      return var1 - var2;
   }

   private void sub_551() {
      if (!this.var_144c) {
         this.sub_e6((byte)5);
      }

      this.var_10a[0] = Integer.toString(Math.min(this.var_237.var_869, this.var_1372));
      this.var_10a[1] = Integer.toString(this.var_1372);
      this.var_78e = Class_1cc.sub_3d0("{0}/{1}", this.var_10a);
      if (!this.var_14eb) {
         int var1 = (int)Math.max(0.0F, this.var_aca);
         int var2 = Math.max(0, var1 - this.var_11bb);
         int var3 = this.var_166.var_123.sub_2bd() * var2;
         this.var_11bb += var2;
         this.var_eb5 += var3;
      }

      if (this.var_237.var_869 > this.var_1372) {
         if (this.var_144c) {
            this.var_18e.removeCommand(Class_1cc.var_331);
            this.sub_61();
         } else {
            if (this.var_1647) {
               this.var_1499 = this.var_237.sub_49e(this.var_299);
            } else {
               this.var_1499 = true;
            }

            if (!this.var_14eb) {
               this.var_eb5 = Math.min(this.var_eb5, this.var_166.var_123.sub_300());
            }

            this.var_1236 = 4;
            this.var_237.sub_193(true);
            this.sub_2dc(Class_1cc.sub_2dd(29));
            this.var_da3 = 0;
         }
      } else {
         this.sub_2dc(Class_1cc.sub_2dd(30));
         if (!this.var_144c) {
            if (this.var_1367 == 1) {
               this.var_aca += (float)this.var_921[(this.var_237.var_869 - 1) * this.var_166.var_123.sub_1c9(this.var_13bd)];
               this.var_237.sub_76();
               return;
            }

            this.var_aca += (float)this.var_921[this.var_237.var_869 - 1];
         }

      }
   }

   private void sub_572(Graphics var1) {
      try {
         this.var_1ea.bindTarget(var1);
         this.var_1ea.setViewport(0, this.var_11c5, this.sub_3b2(), this.var_1215);
         this.var_1ea.render(this.var_1c5);
         return;
      } catch (IllegalStateException var7) {
      } catch (Throwable var8) {
         if (this.var_144c) {
            this.sub_61();
            return;
         }

         this.var_524 = null;
         this.var_6a7 = null;
         this.var_6b3 = null;
         Runtime.getRuntime().gc();
         this.var_1236 = 20;
         this.var_9d2 = Class_1cc.sub_989(Class_1cc.sub_2dd(230), this.sub_3b2() - 2);
         this.var_1c5 = null;
         return;
      } finally {
         this.var_1ea.releaseTarget();
      }

   }

   private void sub_5a8(int var1) {
      this.var_d99 = this.var_d67;
      this.var_18e.repaint();
      this.var_18e.serviceRepaints();
      this.var_d67 = this.sub_3b2() * var1 / 100;
   }

   private void sub_5e1(Graphics var1, String var2) {
      Class_1cc.sub_831(false);
      if (this.var_66d == null) {
         var1.setColor(0);
         var1.fillRect(0, 0, this.sub_3b2(), this.sub_3db());
      } else {
         var1.drawImage(this.var_66d, 0, 0, 20);
      }

      var1.setColor(16777215);
      var1.fillRect(0, this.sub_3db() - 18, this.sub_3b2(), 18);
      if (++this.var_d99 > this.var_d67) {
         this.var_d99 = this.var_d67;
      }

      var1.setColor(16724805);
      var1.fillRect(0, this.sub_3db() - 18 + 1, this.var_d99, 16);
      if (!this.var_144c) {
         if (this.sub_3db() >= 280) {
            int var3 = (this.var_9aa.length + 1) * this.var_2c + 5;
            boolean var4 = false;
            int var6 = (this.sub_3b2() - this.var_100e) / 2;
            var1.setClip(var6, 5, this.var_100e, var3);
            var1.drawImage(this.var_6b3, var6, 5, 20);
            var1.setClip(0, 0, this.sub_3b2(), this.sub_3db());
            var1.setColor(41152);
            var1.drawRect(var6, 5, this.var_100e, var3);
            if (this.var_6a7 != null) {
               int var5 = 5 + var3 + (this.sub_3db() - 5 - var3 - 18) / 2;
               var1.drawImage(this.var_6a7, this.sub_3b2() / 2, var5, 3);
            }

            Class_1cc.sub_861(var1, Class_1cc.sub_2dd(88), this.sub_3b2() / 2, 6, 17);

            for(int var7 = 0; var7 < this.var_9aa.length; ++var7) {
               Class_1cc.sub_861(var1, this.var_9aa[var7], this.sub_3b2() / 2, 6 + this.var_2c + var7 * this.var_2c, 17);
            }
         } else if (this.var_6a7 != null) {
            int var8 = (this.sub_3db() - 18) / 2;
            var1.drawImage(this.var_6a7, this.sub_3b2() / 2, var8, 3);
         }
      }

      Class_1cc.sub_831(true);
      var1.setFont(Class_1cc.sub_20a());
      var1.setColor(0);
      var1.drawString(var2, this.sub_3b2() / 2, this.sub_3db() - 18 + 5 - 4, 17);
   }

   private void sub_626(Graphics var1) {
      int var4 = this.sub_3b2() / 2;
      int var5;
      int var6 = (var5 = Class_1cc.sub_7b9() + Class_1cc.sub_19b() + 4) + this.var_a54[0].getHeight() + 4;
      int var7 = this.sub_3db() - this.var_384.getHeight() - 2 * Class_1cc.sub_7b9() - 4;
      if (this.var_144c) {
         if (this.var_da3 % 8 < 4) {
            Class_1cc.sub_861(var1, Class_1cc.sub_2dd(3), var4, 15, 17);
         }

      } else {
         String var8 = this.var_237.sub_1bd();
         if (this.sub_3b2() < 150) {
            var8 = var8.substring(1);
         }

         Class_1cc.sub_81c(var1, var8, 1, 1);
         Class_1cc.sub_861(var1, Class_1cc.sub_2dd(34), var4, 1, 17);
         Class_1cc.sub_181(var1, (int)this.var_aca + 1, (this.sub_3b2() - Class_1cc.sub_1e2((int)this.var_aca + 1)) / 2, Class_1cc.sub_7b9() + 1);
         if (this.var_1647) {
            if (this.var_237.var_7a0 == 1) {
               this.var_6f7 = Class_1cc.sub_2dd(35);
               int var2 = this.sub_3b2() - Math.max(Class_1cc.sub_789(this.var_6f7), 10) - 2;
               var1.drawImage(this.var_89c[0], var2, 2, 24);
            } else {
               this.var_6f7 = Class_1cc.sub_2dd(36);
               int var23 = this.sub_3b2() - Math.max(Class_1cc.sub_789(this.var_6f7), 10) - 2;
               var1.drawImage(this.var_89c[1], var23, 2, 24);
            }

            Class_1cc.sub_861(var1, this.var_6f7, this.sub_3b2() - Math.max(Class_1cc.sub_789(this.var_6f7), 10), 1, 20);
            Class_1cc.sub_861(var1, Class_1cc.sub_2dd(108), this.sub_3b2() - 1, Class_1cc.sub_7b9() + 1, 24);
         }

         Class_1cc.sub_861(var1, Class_1cc.sub_2dd(107), this.sub_3b2() - 1, this.sub_3db() - this.var_2d8.getHeight() - 2, 40);
         Class_1cc.sub_181(var1, this.var_237.sub_1a8(), this.sub_3b2() - 5 - Class_1cc.sub_1e2(this.var_237.sub_1a8()) - Class_1cc.sub_789(Class_1cc.sub_2dd(107)), this.sub_3db() - this.var_2d8.getHeight() - Class_1cc.sub_19b() - 2);
         var1.setClip(this.sub_3b2() - 9 - (int)((float)this.var_341.getWidth() * this.var_237.sub_51e()), this.sub_3db() - 4 - this.var_341.getHeight(), (int)((float)this.var_341.getWidth() * this.var_237.sub_51e()), this.var_341.getHeight());
         var1.drawImage(this.var_341, this.sub_3b2() - 9, this.sub_3db() - 4, 40);
         var1.setClip(0, 0, this.sub_3b2(), this.sub_3db());
         var1.drawImage(this.var_2d8, this.sub_3b2() - 1, this.sub_3db() - 1, 40);
         if (!this.var_1508) {
            var1.setClip(5, this.sub_3db() - 5 - this.var_395.getHeight(), (int)((float)this.var_395.getWidth() * this.var_237.sub_549()), this.var_395.getHeight());
            var1.drawImage(this.var_395, 5, this.sub_3db() - 5, 36);
            var1.setClip(0, 0, this.sub_3b2(), this.sub_3db());
         }

         var1.drawImage(this.var_384, 1, this.sub_3db() - 1, 36);
         Class_1cc.sub_861(var1, Class_1cc.sub_2dd(86), 1, this.sub_3db() - this.var_384.getHeight() - 2, 36);
         Class_1cc.sub_81c(var1, this.var_78e, 1, 2 + Class_1cc.sub_7b9());
         var1.drawImage(this.var_442, this.sub_3b2() - 1, this.sub_3db() / 2, 10);
         int var9 = this.var_442.getHeight() / this.var_1372;
         int var10 = this.sub_3db() / 2 + this.var_442.getHeight() / 2;
         var1.setColor(0);

         for(int var12 = 0; var12 < this.var_1372 - 1; ++var12) {
            int var11 = var10 - (var12 + 1) * var9;
            var1.drawLine(this.sub_3b2() - 1 - this.var_442.getWidth(), var11, this.sub_3b2() - 2, var11);
         }

         if (this.var_1647) {
            int var13 = Math.min(Math.max((int)(((float)(this.var_299.var_869 - 1) * this.var_8d9[this.var_8d9.length - 1] + this.var_8d9[this.var_299.var_75a / 2]) / this.var_a7e * (float)this.var_442.getHeight()), this.var_46e.getHeight() / 2), this.var_442.getHeight() - this.var_46e.getHeight() / 2);
            var1.drawImage(this.var_4cf, this.sub_3b2() - 2, var10 - var13, 10);
         }

         int var32 = Math.min(Math.max((int)(((float)(this.var_237.var_869 - 1) * this.var_8d9[this.var_8d9.length - 1] + this.var_8d9[this.var_237.var_75a / 2]) / this.var_a7e * (float)this.var_442.getHeight()), this.var_46e.getHeight() / 2), this.var_442.getHeight() - this.var_46e.getHeight() / 2);
         var1.drawImage(this.var_46e, this.sub_3b2() - 2, var10 - var32, 10);
         switch (this.var_1236) {
            case 2:
               Class_1cc.sub_181(var1, this.var_e23 / 1000 + 1, var4 - Class_1cc.sub_1e2(this.var_e23 / 1000 + 1) / 2, var6);
               break;
            case 3:
               int var14 = var4 - this.var_a54[0].getWidth() / 2;
               if (this.var_237.var_9be) {
                  var1.drawImage(this.var_a54[0], var14, var5, 20);
               } else if (this.var_237.var_a0b) {
                  var1.drawImage(this.var_a54[2], var14, var5, 20);
               } else if (this.var_237.var_a1d) {
                  var1.drawImage(this.var_a54[1], var14, var5, 20);
               } else if (this.var_237.var_a41) {
                  var1.drawImage(this.var_a54[3], var14, var5, 20);
               }

               Class_1cc.sub_831(false);
               if (this.var_757.length() > 0) {
                  Class_1cc.sub_861(var1, this.var_757, var4, var6, 17);
               }

               if (this.var_79a != null) {
                  var1.setColor(0);
                  var1.fillRect(0, var7 - this.var_2c - 1, this.sub_3b2(), Class_1cc.sub_7b9() + 2);
                  Class_1cc.sub_861(var1, this.var_79a, this.sub_3b2() - ++this.var_1108 * 3, var7 - this.var_2c, 20);
                  var1.fillRect(0, var7 - this.var_2c - 1, Class_1cc.sub_789(this.var_7f0) + 2, Class_1cc.sub_7b9() + 2);
                  Class_1cc.sub_861(var1, this.var_7f0, 1, var7 - this.var_2c, 20);
               }

               Class_1cc.sub_831(true);
               break;
            case 4:
               Class_1cc.sub_831(false);
               if (this.var_757.length() > 0) {
                  Class_1cc.sub_861(var1, this.var_757, var4, var6, 17);
               }

               Class_1cc.sub_831(true);
            case 5:
            case 20:
            default:
               break;
            case 6:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
               this.sub_739(var1);
               break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
               int var15 = this.var_f7d / 2 / 3;
               int var16 = (this.sub_3b2() - this.var_100e) / 2;
               int var17;
               int var18;
               if (this.var_13eb == 0) {
                  var17 = this.var_fb5 + this.var_f7d / 2 - this.var_da3 * var15;
                  var18 = var15 * this.var_da3 * 2;
               } else if (this.var_13eb == 2) {
                  var17 = this.var_fb5 + this.var_da3 * var15;
                  var18 = this.var_f7d - var15 * this.var_da3 * 2;
               } else {
                  var17 = this.var_fb5;
                  var18 = this.var_f7d;
               }

               var1.setClip(var16, var17, this.var_100e, var18);
               var1.drawImage(this.var_6b3, var16, this.var_fb5, 20);
               if (this.var_13eb == 1) {
                  if (this.var_1236 != 7) {
                     if (this.var_1236 == 8) {
                        int var49 = this.var_fb5 + this.var_f7d / 2 - (this.var_2c + Class_1cc.var_a0.getHeight()) / 2;
                        var1.drawImage(this.var_572, var16 + this.var_100e, this.var_fb5 + this.var_f7d / 2, 10);
                        int var30 = var16 + 5;
                        Class_1cc.sub_861(var1, Class_1cc.sub_2dd(41), var30, var49, 20);
                        var49 += this.var_2c;
                        var1.drawImage(Class_1cc.var_a0, var30, var49, 20);
                        var30 += Class_1cc.var_a0.getWidth() + 1;
                        var49 += (Class_1cc.var_a0.getHeight() - Class_1cc.sub_19b()) / 2;
                        Class_1cc.sub_181(var1, this.var_ec8, var30, var49);
                     } else if (this.var_1236 != 9 && this.var_1236 != 11 && this.var_1236 != 12 && this.var_1236 != 13) {
                        if (this.var_1236 == 15) {
                           if (this.var_16a9) {
                              int var48 = this.var_fb5 + (this.var_f7d - this.var_2c * this.var_9d2.length) / 2;
                              var1.drawImage(this.var_610, var16 + this.var_100e, this.var_fb5 + this.var_f7d / 2, 10);

                              for(int var61 = 0; var61 < this.var_9d2.length; ++var61) {
                                 Class_1cc.sub_861(var1, this.var_9d2[var61], var16 + 5, var48 + var61 * (this.var_2c + 1), 20);
                              }
                           } else {
                              int var47 = this.var_fb5 + (this.var_f7d - (this.var_2c + 1) * this.var_9d2.length) / 2;

                              for(int var60 = 0; var60 < this.var_9d2.length; ++var60) {
                                 Class_1cc.sub_861(var1, this.var_9d2[var60], var16 + this.var_100e / 2, var47 + var60 * (this.var_2c + 1), 17);
                              }
                           }
                        } else if (this.var_1236 == 10) {
                           if (this.var_16a9) {
                              int var46 = this.var_fb5 + (this.var_f7d - this.var_9d2.length * this.var_2c) / 2;
                              var1.drawImage(this.var_5b4, var16 + this.var_100e - 5 + 1, this.var_fb5 + this.var_f7d / 2, 10);

                              for(int var59 = 0; var59 < this.var_9d2.length; ++var59) {
                                 Class_1cc.sub_861(var1, this.var_9d2[var59], var16 + 5 - 1, var46 + (this.var_2c + 1) * var59, 20);
                              }
                           } else {
                              int var45 = this.var_fb5 + (this.var_f7d - this.var_9d2.length * this.var_2c) / 2;

                              for(int var58 = 0; var58 < this.var_9d2.length; ++var58) {
                                 Class_1cc.sub_861(var1, this.var_9d2[var58], var16 + this.var_100e / 2, var45 + (this.var_2c + 1) * var58, 17);
                              }
                           }
                        } else if (this.var_1236 == 14) {
                           if (this.var_16a9) {
                              int var21;
                              int var57;
                              if ((var57 = (this.var_2c + 1) * this.var_9d2.length + this.var_657.getHeight()) > this.var_f7d - 20) {
                                 var21 = 10;
                              } else {
                                 var21 = (this.var_f7d - var57) / 2;
                              }

                              int var44 = this.var_fb5 + var21;
                              var1.drawImage(this.var_657, var4, this.var_fb5 + this.var_f7d - var21, 33);

                              for(int var22 = 0; var22 < this.var_9d2.length; ++var22) {
                                 Class_1cc.sub_861(var1, this.var_9d2[var22], var4, var44 + (this.var_2c + 1) * var22, 17);
                              }
                           } else {
                              int var43 = this.var_fb5 + (this.var_f7d - this.var_9d2.length * this.var_2c) / 2;

                              for(int var56 = 0; var56 < this.var_9d2.length; ++var56) {
                                 Class_1cc.sub_861(var1, this.var_9d2[var56], var4, var43 + 2 + (this.var_2c + 1) * var56, 17);
                              }
                           }
                        }
                     } else {
                        int var42 = this.var_fb5 + (this.var_f7d - this.var_2c * this.var_9d2.length) / 2;

                        for(int var55 = 0; var55 < this.var_9d2.length; ++var55) {
                           Class_1cc.sub_861(var1, this.var_9d2[var55], var4, var42 + var55 * (this.var_2c + 1), 17);
                        }
                     }
                  } else if (this.var_16a9) {
                     var1.drawImage(this.var_524, var16 + this.var_100e, this.var_fb5 + this.var_f7d, 40);
                     if (this.var_1367 != 0 || this.var_237.var_869 <= this.var_1372 && !this.var_16e5) {
                        if (this.var_237.var_869 <= this.var_1372 && !this.var_16e5) {
                           int var41 = this.var_fb5 + (this.var_f7d - this.var_2c * this.var_9d2.length) / 2;

                           for(int var54 = 0; var54 < this.var_9d2.length; ++var54) {
                              Class_1cc.sub_861(var1, this.var_9d2[var54], var16 + 5, var41 + var54 * (this.var_2c + 1), 20);
                           }
                        } else {
                           int var40 = this.var_fb5 + (this.var_f7d - this.var_2c * this.var_9d2.length) / 2;

                           for(int var53 = 0; var53 < this.var_9d2.length; ++var53) {
                              Class_1cc.sub_861(var1, this.var_9d2[var53], var16 + 4, var40 + var53 * (this.var_2c + 1), 20);
                           }
                        }
                     } else {
                        int var37 = this.var_fb5 + 5;
                        if (this.var_1499) {
                           Class_1cc.sub_861(var1, Class_1cc.sub_2dd(125), var4, var37 + 4, 17);
                        }

                        var37 = this.var_fb5 + (this.var_f7d - this.var_2c * 3) / 2;
                        int var28;
                        if (this.var_1499) {
                           this.var_6f7 = Class_1cc.sub_2dd(229);
                           var28 = var16 + (this.var_100e - this.var_524.getWidth() - (2 + this.var_89c[0].getWidth() + Class_1cc.sub_789(this.var_6f7))) / 2;
                           var1.drawImage(this.var_89c[0], var28, var37, 20);
                           var28 += this.var_89c[0].getWidth() + 2;
                        } else {
                           this.var_6f7 = Class_1cc.sub_2dd(36);
                           var28 = var16 + (this.var_100e - this.var_524.getWidth() - (2 + this.var_89c[1].getWidth() + Class_1cc.sub_789(this.var_6f7))) / 2;
                           var1.drawImage(this.var_89c[1], var28, var37, 20);
                           var28 += this.var_89c[1].getWidth() + 2;
                        }

                        Class_1cc.sub_861(var1, this.var_6f7, var28, var37 + (this.var_f19 - Class_1cc.sub_7b9()), 20);
                        var37 += this.var_2c * 2;
                        Class_1cc.sub_861(var1, Class_1cc.sub_2dd(126), var16 + (this.var_100e - this.var_524.getWidth()) / 2, var37, 17);
                     }
                  } else if (this.var_1367 != 0 || this.var_237.var_869 <= this.var_1372 && !this.var_16e5) {
                     if (this.var_237.var_869 <= this.var_1372 && !this.var_16e5) {
                        int var36 = this.var_fb5 + (this.var_f7d - this.var_2c * this.var_9d2.length) / 2;

                        for(int var52 = 0; var52 < this.var_9d2.length; ++var52) {
                           Class_1cc.sub_861(var1, this.var_9d2[var52], var16 + this.var_100e / 2, var36 + var52 * this.var_2c, 17);
                        }
                     } else {
                        int var35 = this.var_fb5 + (this.var_f7d - this.var_2c * this.var_9d2.length) / 2;

                        for(int var20 = 0; var20 < this.var_9d2.length; ++var20) {
                           Class_1cc.sub_861(var1, this.var_9d2[var20], var16 + this.var_100e / 2, var35 + var20 * this.var_2c, 17);
                        }
                     }
                  } else {
                     int var19 = this.var_fb5 + 2;
                     if (this.var_1499) {
                        Class_1cc.sub_861(var1, Class_1cc.sub_2dd(125), var4, var19 + 4, 17);
                     }

                     var19 = this.var_fb5 + (this.var_f7d - this.var_2c * 3) / 2;
                     int var25;
                     if (this.var_1499) {
                        this.var_6f7 = Class_1cc.sub_2dd(229);
                        var25 = var16 + (this.var_100e - (2 + this.var_89c[0].getWidth() + Class_1cc.sub_789(this.var_6f7))) / 2;
                        var1.drawImage(this.var_89c[0], var25, var19, 20);
                        var25 += this.var_89c[0].getWidth() + 2;
                     } else {
                        this.var_6f7 = Class_1cc.sub_2dd(36);
                        var25 = var16 + (this.var_100e - (2 + this.var_89c[1].getWidth() + Class_1cc.sub_789(this.var_6f7))) / 2;
                        var1.drawImage(this.var_89c[1], var25, var19, 20);
                        var25 += this.var_89c[1].getWidth() + 2;
                     }

                     Class_1cc.sub_861(var1, this.var_6f7, var25, var19 + (this.var_f19 - Class_1cc.sub_7b9()), 20);
                     var19 += this.var_2c * 2;
                     Class_1cc.sub_861(var1, Class_1cc.sub_2dd(126), var16 + this.var_100e / 2, var19, 17);
                  }
               }

               var1.setClip(0, 0, this.sub_3b2(), this.sub_3db());
               var1.setColor(11861831);
               var1.drawRect(var16, var17, this.var_100e, var18);
         }

         this.sub_88e(var1);
      }
   }

   private void sub_67c() {
      try {
         String[] var1 = Class_1cc.sub_396("/pospositions.txt");
         this.var_977 = new short[var1.length];

         for(int var2 = 0; var2 < this.var_977.length; ++var2) {
            this.var_977[var2] = (short)Integer.parseInt(var1[var2]);
         }

         Image var7 = Image.createImage("/pos.png");
         this.var_f19 = var7.getHeight();
         this.var_89c = new Image[this.var_977.length - 1];
         Object var3 = null;

         for(int var5 = 0; var5 < this.var_89c.length; ++var5) {
            int var4;
            int[] var8 = new int[(var4 = this.var_977[var5 + 1] - this.var_977[var5]) * this.var_f19];
            var7.getRGB(var8, 0, var4, this.var_977[var5], 0, var4, this.var_f19);
            this.var_89c[var5] = Image.createRGBImage(var8, var4, this.var_f19, true);
         }

      } catch (Exception var6) {
      }
   }

   private float sub_6b9() {
      float var1 = this.var_299.sub_2fa() - this.var_237.sub_2fa();
      float var2 = this.var_299.sub_35b() - this.var_237.sub_35b();
      return Class_1cc.sub_777(var1, var2, true);
   }

   private void sub_6e3(int var1) {
      switch (var1) {
         case 7:
            if (this.var_237.var_869 <= this.var_1372 && !this.var_16e5) {
               if (this.var_1367 == 2 && this.var_237.sub_549() > 0.0F) {
                  if (this.var_16a9) {
                     this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(199), this.var_100e - this.var_524.getWidth());
                     return;
                  }

                  this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(199), this.var_100e - 4);
                  return;
               } else if (this.var_aca <= -1.0F) {
                  if (this.var_16a9) {
                     this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(27), this.var_100e - this.var_524.getWidth());
                     return;
                  }

                  this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(27), this.var_100e - 4);
                  return;
               } else {
                  if (this.var_16a9) {
                     this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(87), this.var_100e - this.var_524.getWidth());
                     return;
                  }

                  this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(87), this.var_100e - 4);
                  return;
               }
            } else {
               if (this.var_16a9) {
                  this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(125) + " \n " + Class_1cc.sub_2dd(29), this.var_100e - this.var_524.getWidth());
                  return;
               }

               this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(125) + " \n " + Class_1cc.sub_2dd(29), this.var_100e - 4);
               return;
            }
         case 9:
            this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(127) + " \n " + Class_1cc.sub_467(this.var_166.var_123.sub_b5c()), this.var_100e - 4);
            return;
         case 10:
            if (this.var_16a9) {
               this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(129) + " \n " + Class_1cc.sub_50c(this.var_166.var_123.sub_aa8()), this.var_100e - 10 - this.var_5b4.getWidth());
               return;
            }

            this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(129) + " \n " + Class_1cc.sub_50c(this.var_166.var_123.sub_aa8()), this.var_100e - 4);
            return;
         case 11:
            this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(130), this.var_100e - 4);
            return;
         case 12:
            this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(131), this.var_100e - 4);
            return;
         case 13:
            this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(132), this.var_100e - 4);
            return;
         case 14:
            this.var_10a[0] = Class_1cc.sub_2dd(133);
            this.var_10a[1] = Class_1cc.sub_2dd(56 + (this.var_166.var_123.sub_b24() - 1));
            this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_3d0("{0} {1}", this.var_10a), this.var_100e - 4);
         case 8:
         default:
            return;
         case 15:
            if (this.var_16a9) {
               this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(128) + " \n " + this.var_166.var_123.sub_b9(), this.var_100e - this.var_610.getWidth());
            } else {
               this.var_9d2 = Class_1cc.sub_9cb(Class_1cc.sub_2dd(128) + " \n " + this.var_166.var_123.sub_b9(), this.var_100e - 4);
            }
      }
   }

   private void sub_6fb(int var1) {
      if (this.var_13eb == 1) {
         switch (var1) {
            case 7:
               if (this.var_14eb) {
                  this.sub_7f(this.var_1499, this.var_eb5, this.var_12af, this.var_237.var_72b, this.var_1367);
                  return;
               }

               this.var_125b = 8;
               this.var_13eb = 2;
               this.var_da3 = 0;
               this.sub_e6((byte)5);
               return;
            case 8:
               if (this.var_1605) {
                  this.var_ec8 = this.var_eb5;
                  this.var_1605 = false;
                  return;
               }

               if (!this.var_1499) {
                  this.var_166.sub_300(this.var_1499, this.var_eb5, this.var_12af, this.var_237.var_72b, this.var_1367);
                  return;
               }

               this.sub_6fb(9);
               return;
            case 9:
               if (this.var_166.var_123.sub_b34() && this.var_1236 != 9) {
                  this.var_125b = 9;
                  this.var_13eb = 2;
                  this.var_da3 = 0;
                  this.sub_6e3(this.var_125b);
                  this.sub_e6((byte)5);
                  return;
               }

               this.sub_6fb(10);
               return;
            case 10:
               if (this.var_166.var_123.sub_a98() && this.var_1236 != 10) {
                  this.var_125b = 10;
                  this.var_13eb = 2;
                  this.var_da3 = 0;
                  this.sub_6e3(this.var_125b);
                  this.sub_e6((byte)5);
                  return;
               }

               this.sub_6fb(11);
               return;
            case 11:
               if (this.var_166.var_123.sub_a18() && this.var_1236 != 11) {
                  this.var_125b = 11;
                  this.var_13eb = 2;
                  this.var_da3 = 0;
                  this.sub_6e3(this.var_125b);
                  this.sub_e6((byte)5);
                  return;
               }

               this.sub_6fb(12);
               return;
            case 12:
               if (this.var_166.var_123.sub_a76() && this.var_1236 != 12) {
                  this.var_125b = 12;
                  this.var_13eb = 2;
                  this.var_da3 = 0;
                  this.sub_6e3(this.var_125b);
                  this.sub_e6((byte)5);
                  return;
               }

               this.sub_6fb(13);
               return;
            case 13:
               if (this.var_166.var_123.sub_9fc() && this.var_1236 != 13) {
                  this.var_125b = 13;
                  this.var_13eb = 2;
                  this.var_da3 = 0;
                  this.sub_6e3(this.var_125b);
                  this.sub_e6((byte)5);
                  return;
               }

               this.sub_6fb(14);
               return;
            case 14:
               if (this.var_166.var_123.sub_ac0() && this.var_1236 != 14) {
                  this.var_125b = 14;
                  this.var_13eb = 2;
                  this.var_da3 = 0;
                  this.sub_6e3(this.var_125b);
                  this.sub_e6((byte)5);
                  return;
               }

               this.sub_6fb(15);
               return;
            case 15:
               if (this.var_166.var_123.sub_b8f() && this.var_1236 != 15) {
                  this.var_125b = 15;
                  this.var_13eb = 2;
                  this.var_da3 = 0;
                  this.sub_6e3(this.var_125b);
                  this.sub_e6((byte)5);
                  return;
               }

               this.var_166.sub_300(this.var_1499, this.var_eb5, this.var_12af, this.var_237.var_72b, this.var_1367);
         }
      }

   }

   private void sub_739(Graphics var1) {
      int var2 = this.var_f7d / 2 / 3;
      int var3;
      int var6 = (var3 = (this.sub_3b2() - this.var_100e) / 2) + this.var_100e / 2;
      int var4;
      int var5;
      if (this.var_13eb == 0) {
         var4 = this.var_fb5 + this.var_f7d / 2 - this.var_da3 * var2;
         var5 = var2 * this.var_da3 * 2;
      } else if (this.var_13eb == 2) {
         var4 = this.var_fb5 + this.var_da3 * var2;
         var5 = this.var_f7d - var2 * this.var_da3 * 2;
      } else {
         var4 = this.var_fb5;
         var5 = this.var_f7d;
      }

      var1.setClip(var3, var4, this.var_100e, var5);
      var1.drawImage(this.var_6b3, var3, this.var_fb5, 20);
      var1.setClip(0, 0, this.sub_3b2(), this.sub_3db());
      var1.setColor(11861831);
      var1.drawRect(var3, var4, this.var_100e, var5);
      if (this.var_13eb == 1) {
         if (this.var_1236 != 17) {
            var1.drawImage(this.var_524, var3 + this.var_100e, this.var_fb5 + this.var_f7d, 40);
         }

         Class_1cc.sub_831(false);
         int var7 = this.var_fb5 + this.var_77;
         switch (this.var_1236) {
            case 6:
               Class_1cc.sub_861(var1, Class_1cc.sub_2dd(37), var6, this.var_fb5 + 2, 17);
               var7 = this.var_fb5 + (this.var_f7d - this.var_9ff.length * this.var_2c) / 2;
               var1.setColor(0);
               int var21 = Class_1cc.sub_789(this.var_9ff[this.var_105a]) + 4;
               var1.fillRect(var3 + 2, var7 + this.var_105a * this.var_2c - 1, var21, this.var_2c);

               for(int var25 = 0; var25 < this.var_9ff.length; ++var25) {
                  Class_1cc.sub_861(var1, this.var_9ff[var25], var3 + 4, var7 + var25 * this.var_2c, 20);
               }
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 20:
            default:
               break;
            case 16:
               Class_1cc.sub_861(var1, Class_1cc.sub_2dd(4), var6, this.var_fb5 + 2, 17);
               int var20 = Class_1cc.sub_789(this.var_9ff[this.var_105a]) + 8 + this.var_c1;
               var7 = this.var_fb5 + (this.var_f7d - this.var_9ff.length * this.var_2c) / 2;
               var1.setColor(0);
               var1.fillRect(var3 + 2, var7 + this.var_105a * this.var_2c - 1, var20, this.var_2c);

               for(int var26 = 0; var26 < this.var_9ff.length; ++var26) {
                  Class_1cc.sub_861(var1, this.var_9ff[var26], var3 + 4, var7 + var26 * this.var_2c, 20);
                  boolean var24;
                  if (this.var_9ff[var26].equals(Class_1cc.sub_2dd(14))) {
                     var24 = this.var_166.var_a65;
                  } else {
                     var24 = this.var_166.var_ad7;
                  }

                  if (!this.var_9ff[var26].equals(Class_1cc.sub_2dd(207)) && !this.var_9ff[var26].equals(Class_1cc.sub_2dd(233)) && !this.var_9ff[var26].equals(Class_1cc.sub_2dd(215))) {
                     int var9 = var3 + Class_1cc.sub_789(this.var_9ff[var26]) + 4 + 2;
                     int var10 = var7 - 1 + var26 * this.var_2c + (this.var_2c - this.var_c1) / 2;
                     if (var26 == this.var_105a) {
                        var1.setColor(16777215);
                     } else {
                        var1.setColor(0);
                     }

                     var1.drawRect(var9, var10, this.var_c1, this.var_c1);
                     if (var24) {
                        var1.drawLine(var9, var10, var9 + this.var_c1, var10 + this.var_c1);
                        var1.drawLine(var9, var10 + this.var_c1, var9 + this.var_c1, var10);
                     }
                  }
               }
               break;
            case 17:
               Class_1cc.sub_861(var1, Class_1cc.sub_2dd(5), var6, this.var_fb5 + 2, 17);

               for(int var23 = 0; var23 < Math.min(this.var_9aa.length, this.var_107e); ++var23) {
                  Class_1cc.sub_861(var1, this.var_9aa[var23 + this.var_105a], var3 + this.var_100e / 2, var7 + var23 * this.var_2c, 17);
               }
               break;
            case 18:
               Class_1cc.sub_861(var1, Class_1cc.sub_2dd(159), var6, this.var_fb5 + 2, 17);

               for(int var22 = 0; var22 < this.var_9ff.length; ++var22) {
                  Class_1cc.sub_861(var1, this.var_9ff[var22], var3 + 4, var7 + var22 * this.var_2c, 20);
               }
               break;
            case 19:
               Class_1cc.sub_861(var1, this.var_16a9 ? Class_1cc.sub_2dd(207) : Class_1cc.sub_2dd(215), var6, this.var_fb5 + 2, 17);
               var7 = this.var_fb5 + this.var_2c * 2;
               Class_1cc.sub_861(var1, Class_1cc.sub_2dd(209), var3 + 2, var7, 20);
               Class_1cc.sub_861(var1, Class_1cc.sub_2dd(208), var3 + this.var_100e - 2, var7, 24);
               var7 += this.var_2c + 4;
               int var12 = var3 + 10;
               var1.setColor(0);
               var1.drawLine(var12, var7, var12 + this.var_1175, var7);
               var1.drawLine(var12, var7 - 1, var12, var7 + 1);
               var1.drawLine(var12 + this.var_1175, var7 - 1, var12 + this.var_1175, var7 + 1);
               int var13 = var12 + this.var_1175 / 2 + this.var_105a * (this.var_1175 / 10) - 1;
               int var14 = var7 - 3;
               var1.fillRect(var13, var14, 3, 6);
               break;
            case 21:
               Class_1cc.sub_861(var1, Class_1cc.sub_2dd(233), var6, this.var_fb5 + 2, 17);
               var7 = this.var_fb5 + (this.var_f7d - this.var_9ff.length * this.var_2c) / 2;
               var1.setColor(0);
               int var8 = Class_1cc.sub_789(this.var_9ff[this.var_105a]) + 4;
               var1.fillRect(var3 + 2, var7 + this.var_105a * this.var_2c - 1, var8, this.var_2c);

               for(int var11 = 0; var11 < this.var_9ff.length; ++var11) {
                  Class_1cc.sub_861(var1, this.var_9ff[var11], var3 + 4, var7 + var11 * this.var_2c, 20);
               }
         }

         Class_1cc.sub_831(true);
      }

   }

   private boolean sub_799() {
      return this.var_1236 == 6 || this.var_1236 == 16 || this.var_1236 == 21 || this.var_1236 == 17 || this.var_1236 == 18 || this.var_1236 == 19;
   }

   private void sub_7c2() {
      switch (this.var_1236) {
         case 6:
            boolean var3 = false;
            this.var_9ff = new String[4];
            this.var_9ff[0] = Class_1cc.sub_2dd(157);
            this.var_9ff[1] = Class_1cc.sub_2dd(4);
            this.var_9ff[2] = Class_1cc.sub_2dd(5);
            this.var_9ff[3] = Class_1cc.sub_2dd(159);
            return;
         case 16:
            int var1 = 1;
            if (this.var_166.var_990) {
               ++var1;
            }

            if (this.var_166.var_97c) {
               ++var1;
            }

            this.var_9ff = new String[var1];
            var1 = 0;
            if (this.var_166.var_990) {
               ++var1;
               this.var_9ff[0] = Class_1cc.sub_2dd(14);
            }

            if (this.var_166.var_97c) {
               this.var_9ff[var1++] = Class_1cc.sub_2dd(15);
            }

            this.var_9ff[var1] = this.var_16a9 ? Class_1cc.sub_2dd(207) : Class_1cc.sub_2dd(215);
            return;
         case 18:
            this.var_9ff = Class_1cc.sub_9cb(Class_1cc.sub_2dd(18), this.var_100e - 2);
         default:
            return;
         case 21:
            this.var_9ff = new String[]{Class_1cc.sub_2dd(234), Class_1cc.sub_2dd(235)};
      }
   }

   private void sub_7fe() {
      switch (this.var_1236) {
         case 6:
            if (this.var_9ff[this.var_105a].equals(Class_1cc.sub_2dd(157))) {
               this.var_125b = this.var_1278;
               this.var_13eb = 2;
               this.var_da3 = 0;
               return;
            }

            if (this.var_9ff[this.var_105a].equals(Class_1cc.sub_2dd(4))) {
               this.var_1236 = 16;
               this.sub_7c2();
               this.var_105a = 0;
               return;
            }

            if (this.var_9ff[this.var_105a].equals(Class_1cc.sub_2dd(5))) {
               this.var_1236 = 17;
               this.var_105a = 0;
               return;
            }

            if (this.var_9ff[this.var_105a].equals(Class_1cc.sub_2dd(159))) {
               this.var_1236 = 18;
               this.sub_7c2();
               this.var_105a = 0;
               return;
            }
            break;
         case 16:
            if (this.var_9ff[this.var_105a].equals(Class_1cc.sub_2dd(14))) {
               this.var_166.sub_682(!this.var_166.var_a65);
               this.var_15d5 = this.var_166.var_a65;
               return;
            }

            if (this.var_9ff[this.var_105a].equals(Class_1cc.sub_2dd(15))) {
               this.var_166.sub_6eb(!this.var_166.var_ad7);
               return;
            }

            if (this.var_9ff[this.var_105a].equals(Class_1cc.sub_2dd(207)) || this.var_9ff[this.var_105a].equals(Class_1cc.sub_2dd(215))) {
               this.var_1236 = 19;
               this.var_105a = (int)(this.var_166.var_595 / 2.0F);
               return;
            }
            break;
         case 18:
            this.sub_7f(false, 0, this.var_12af, this.var_237.var_72b, this.var_1367);
            break;
         case 19:
            float var1 = 2.0F * (float)this.var_105a;
            this.var_166.var_595 = var1;
            this.var_237.sub_50();
            this.var_1236 = 16;
            this.var_105a = 0;
            this.sub_7c2();
            return;
         case 21:
            if (this.var_9ff[this.var_105a].equals(Class_1cc.sub_2dd(234))) {
               if (this.var_166.var_7cb) {
                  this.var_166.sub_1c3(false);
               }
            } else if (this.var_9ff[this.var_105a].equals(Class_1cc.sub_2dd(235)) && !this.var_166.var_7cb) {
               this.var_166.sub_1c3(true);
            }

            this.var_130a = (byte)Math.min(this.sub_3b2() - 20, 127);
            this.var_135a = (byte)Math.min(this.sub_3b2() / 5, 40);
            this.var_f7d = Math.min(Math.max(2 + (this.var_9aa.length + 2) * this.var_2c, this.var_2c + 4 + this.var_524.getHeight()), this.sub_3db() - (this.var_d37 + 10));
            this.var_100e = Math.min(this.sub_3b2() - 10, 166);
            this.var_1175 = this.var_100e - 20;
            int[] var2 = new int[this.var_100e * this.var_f7d];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               var2[var3] = -2434342;
            }

            this.var_6b3 = Image.createRGBImage(var2, this.var_100e, this.var_f7d, true);
            this.var_16a9 = this.sub_3db() >= 280;
            if (this.var_166.var_cf1) {
               this.var_11c5 = 38;
               this.var_1215 = this.sub_3db() - 76;
            } else {
               this.var_11c5 = 0;
               this.var_1215 = this.sub_3db();
            }

            this.var_6cc.sub_ce(this.var_1c5.getActiveCamera(), this.sub_3b2(), this.var_1215);
            this.var_1236 = 16;
            this.var_105a = 0;
            this.sub_7c2();
            return;
      }

   }

   private void sub_84a() {
      switch (this.var_1236) {
         case 6:
            this.var_125b = this.var_1278;
            this.var_13eb = 2;
            this.var_da3 = 0;
            return;
         case 16:
         case 17:
         case 18:
            this.var_1236 = 6;
            this.var_105a = 0;
            this.sub_7c2();
            return;
         case 19:
         case 21:
            this.var_1236 = 16;
            this.var_105a = 0;
            this.sub_7c2();
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 20:
         default:
      }
   }

   private void sub_856(int var1) {
      if (!this.var_144c) {
         for(int var2 = 0; var2 < 6; ++var2) {
            if ((Class_1cc.var_2b3[var1] & 1 << var2) > 0) {
               this.var_a30[var2].setRenderingEnable(true);
            } else {
               this.var_a30[var2].setRenderingEnable(false);
            }
         }

      }
   }

   private void sub_88e(Graphics var1) {
      switch (this.var_1236) {
         case 6:
         case 16:
         case 19:
         case 21:
            this.sub_8ef(var1, 10, 11);
            return;
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            this.sub_8ef(var1, 22, -1);
         case 20:
         default:
            return;
         case 17:
            this.sub_8ef(var1, -1, 11);
            return;
         case 18:
            this.sub_8ef(var1, 8, 9);
      }
   }

   private void sub_8ef(Graphics var1, int var2, int var3) {
      var1.setColor(16777215);
      var1.fillRect(0, this.sub_3db() - this.var_d37, this.sub_3b2(), this.var_d37);
      var1.setColor(0);
      var1.drawLine(0, this.sub_3db() - this.var_d37 - 1, this.sub_3b2(), this.sub_3db() - this.var_d37 - 1);
      var1.setFont(Class_1cc.sub_20a());
      if (var2 != -1) {
         var1.drawString(Class_1cc.sub_2dd(var2), 2, this.sub_3db() - 1, 36);
      }

      if (var3 != -1) {
         var1.drawString(Class_1cc.sub_2dd(var3), this.sub_3b2() - 2, this.sub_3db() - 1, 40);
      }

   }
}
