import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;

public class GameMidlet extends MIDlet implements Runnable {
   public static final int[][] var_33 = new int[][]{{7, 7, 8, 8, 7, 8, 7, 8}, {8, 8, 7, 7, 8, 7, 8, 7}, {7, 10, 8, 9, 7, 10, 8, 9}, {7, 9, 8, 10, 7, 9, 8, 10}, {7, 7, 9, 9, 7, 7, 10, 10}};
   private static final int[] var_5a = new int[]{2, 3, 1, 4, 6, 5, 14, 15, 16, 17};
   private Class_108 var_65;
   public Class_2a9 var_a8;
   public Class_29c var_123;
   private Class_16b var_194;
   private Class_279 var_1b2;
   private Class_f4 var_1c7;
   private Class_258 var_22a;
   private Class_2de var_248;
   private Class_7d var_271;
   private Class_200 var_293;
   private Thread var_2a8 = null;
   private Image var_327;
   private Image var_352;
   private Image var_39b;
   private RecordStore var_3d4 = null;
   public String var_455 = null;
   private int[][][] var_484;
   public int[] var_4b8;
   public String[] var_51c;
   public String[] var_57f;
   public float var_595;
   public float var_5e6;
   private long var_645;
   private long var_69e;
   private long var_6f2;
   private long var_706;
   public int var_723;
   private int var_744;
   public int var_771;
   public boolean var_7cb;
   private int var_82e;
   private int var_870;
   private int var_8a2;
   public int var_8f8;
   public int var_92f;
   public boolean var_97c;
   public boolean var_990;
   public boolean var_9d4;
   public boolean var_a65;
   public boolean var_ab0;
   public boolean var_ad7;
   private boolean var_b3b;
   public boolean var_b61;
   private boolean var_b78;
   private boolean var_bca;
   private boolean var_c0a;
   private boolean var_c22;
   private boolean var_c69;
   private boolean var_cab;
   public boolean var_cf1;
   private boolean var_d55;
   private boolean var_d73;

   public final void sub_7a() {
      this.var_92f = 0;
      this.var_d55 = false;
      this.var_271 = new Class_7d(this);
      Display.getDisplay(this).setCurrent(this.var_271);
      this.var_271.repaint();
      this.var_271.serviceRepaints();
      this.sub_fd1();
      this.sub_92();
   }

   public final void sub_92() {
      try {
         String var1 = ((MIDlet)this).getAppProperty("UNITYFORCELANGUAGE");

         for(int var2 = 0; var2 < Class_258.var_c.length; ++var2) {
            if (var1.equalsIgnoreCase(Class_258.var_c[var2][1])) {
               this.var_455 = var1.toUpperCase();
               this.var_771 = var2;
            }
         }
      } catch (Exception var3) {
      }

      boolean var4 = false;
      if (this.var_455 == null && this.sub_9dd("5")) {
         var4 = true;
         this.var_771 = this.sub_942("5")[0];
      }

      this.sub_dfd();
      if (this.var_455 == null && !var4) {
         this.sub_190();
      } else {
         this.sub_1e5();
         this.sub_e2(10);
         Class_1cc.sub_2a1(this.var_771);
         this.sub_e2(20);
         this.sub_b3();
      }
   }

   public final void sub_b3() {
      this.sub_f63();
      this.sub_e2(30);
      this.var_293 = new Class_200(this);
      this.sub_e2(40);
      Class_1cc.sub_22d();
      this.sub_e2(50);
      this.sub_1095();
      this.var_271.sub_ab(this.var_870, this.var_8a2);
      this.sub_e2(60);
      this.sub_106b();
      this.sub_e2(70);
      this.var_57f = this.sub_f0b(Math.min(this.var_271.var_198 - 20, 122));
      this.sub_e2(80);
      this.var_b61 = false;
      this.var_b78 = false;
      this.var_bca = false;
      this.var_c0a = false;
      this.var_c22 = false;
      this.var_a8 = new Class_2a9();
      this.var_a8.sub_22(this.var_b61);
      int var1 = this.var_a8.var_37;
      if (this.sub_9dd("1")) {
         this.var_a8.sub_d7(this.sub_942("1"));
      }

      Class_1cc.sub_6cf(Class_1cc.var_190[2], this.var_a8.var_37, var1, false);
      this.var_123 = new Class_29c();
      this.var_123.sub_37(this.var_b61);
      if (this.sub_9dd("3")) {
         this.var_d55 = true;
         this.var_123.sub_98f(this.sub_942("3"));
      }

      this.sub_da1();
      this.sub_e2(90);

      try {
         this.var_990 = ((MIDlet)this).getAppProperty("Sound-support").equals("Y");
      } catch (Exception var6) {
         this.var_990 = false;
      }

      try {
         this.var_97c = ((MIDlet)this).getAppProperty("Vibration").equals("Y");
      } catch (Exception var5) {
         this.var_97c = false;
      }

      try {
         this.var_9d4 = ((MIDlet)this).getAppProperty("Network-support").equals("Y");
      } catch (Exception var4) {
         this.var_9d4 = false;
      }

      try {
         this.var_cf1 = ((MIDlet)this).getAppProperty("Letterbox-view").equals("Y");
      } catch (Exception var3) {
         this.var_cf1 = true;
      }

      if (this.sub_9dd("0")) {
         this.sub_ccb(this.sub_942("0"));
      } else {
         try {
            this.var_a65 = ((MIDlet)this).getAppProperty("Sound-default").equals("On");
         } catch (Exception var2) {
            this.var_a65 = false;
         }

         this.var_ab0 = this.var_a65;
         this.var_ad7 = true;
         this.var_595 = 0.0F;
      }

      if (this.var_1c7 != null) {
         this.sub_e2(100);
         this.var_1c7.sub_5f();
      }

      this.var_8f8 = 2;
   }

   public final void sub_e2(int var1) {
      if (this.var_1c7 != null && this.var_271.var_7b instanceof Class_f4) {
         this.var_92f = var1;
         this.var_271.repaint();
         this.var_271.serviceRepaints();
      }

   }

   public final void sub_12c(int var1) {
      this.var_771 = var1;
      this.sub_1e5();
      this.sub_e2(10);
      Class_1cc.sub_2a1(this.var_771);
      this.sub_e2(20);
      this.sub_b3();
   }

   public final void sub_190() {
      this.var_22a = new Class_258(this, this.var_271);
      this.var_271.sub_81(this.var_22a);
   }

   public final void sub_1c3(boolean var1) {
      if (this.var_7cb != var1) {
         this.var_7cb = var1;
         if (var1) {
            this.var_271.sub_ab(this.var_271.getWidth(), this.var_271.getHeight());
            if (this.var_1b2 != null) {
               this.var_1b2.var_29f = this.var_352;
            }
         } else {
            this.var_271.sub_ab(this.var_271.getHeight(), this.var_271.getWidth());
            if (this.var_1b2 != null) {
               this.var_1b2.var_29f = this.var_39b;
            }
         }

         this.sub_dfd();
         if (this.var_65 != null) {
            this.var_65.var_95b = this.var_484;
         }

         this.sub_8ee();
         if (this.var_65 != null) {
            this.var_65.var_9aa = this.var_57f;
         }
      }

   }

   public final void sub_1e5() {
      if (this.var_22a != null) {
         this.var_22a.sub_4d();
         this.var_22a = null;
         Runtime.getRuntime().gc();
      }

      this.var_1c7 = new Class_f4(this, this.var_271);
      this.var_271.sub_81(this.var_1c7);
      this.var_271.repaint();
      this.var_271.serviceRepaints();
   }

   public final void sub_244() {
      if (this.var_1b2 != null) {
         this.var_1b2.sub_154();
         this.var_1b2.sub_6a();
         this.var_1b2 = null;
         Runtime.getRuntime().gc();
      }

      this.var_194 = new Class_16b(this, this.var_271, this.var_a8.var_37, this.var_327);
      this.var_271.sub_81(this.var_194);
   }

   public final void sub_2a4() {
      this.sub_3a5(this.var_327);
   }

   public final void sub_300(boolean var1, int var2, int var3, int var4, byte var5) {
      this.var_b3b = var1;
      this.var_a8.sub_52(var2);
      boolean var6 = this.var_65.var_14eb;
      boolean var7 = this.var_123.sub_633();
      this.var_c69 = false;
      this.var_293.sub_13();
      if (!var6) {
         this.var_123.sub_28c();
      }

      if (var1 && !var6) {
         this.var_123.sub_23e();
         if (!var7 && this.var_123.sub_633()) {
            this.var_c69 = true;
         }
      }

      if (!var6) {
         this.sub_989("1", this.var_a8.sub_111());
         this.sub_989("3", this.var_123.sub_99e());
      }

      var3 = (var3 - 1) * 2;
      if (this.var_65.var_1425) {
         ++var3;
      }

      this.var_82e = var3;
      if (var5 == 0 && (var4 < this.var_4b8[var3] || this.var_4b8[var3] == 0) && var4 != 0) {
         this.var_4b8[var3] = var4;
         this.var_65.sub_154();
         this.sub_352();
      } else {
         this.sub_2a4();
      }
   }

   public final void sub_352() {
      this.var_248 = new Class_2de(this, this.var_271, Class_1cc.sub_2dd(83));
      this.var_271.sub_81(this.var_248);
   }

   public final void sub_385(String var1) {
      this.var_51c[this.var_82e] = var1;
      this.sub_2a4();
   }

   public final void sub_3a5(Image var1) {
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = this.var_271.var_7b instanceof Class_16b;
      boolean var5 = this.var_271.var_7b instanceof Class_108 && this.var_65 != null && this.var_65.var_14eb || this.var_271.var_7b instanceof Class_2de && this.var_65 != null && this.var_65.var_14eb;
      this.var_327 = var1;
      if (this.var_1c7 != null) {
         this.var_1c7.sub_154();
         this.var_1c7.sub_ed();
         this.var_1c7 = null;
         Runtime.getRuntime().gc();
      }

      if (this.var_248 != null) {
         this.var_248.sub_21();
         this.var_248 = null;
         Runtime.getRuntime().gc();
      }

      if (this.var_194 != null) {
         this.var_194.sub_89();
         this.var_194 = null;
         Runtime.getRuntime().gc();
      }

      if (this.var_65 != null) {
         var2 = !this.var_65.var_144c;
         var3 = !this.var_65.var_144c && !this.var_65.var_14eb;
         this.var_65.sub_366();
         this.var_65 = null;
         Runtime.getRuntime().gc();
         if (var2) {
            this.sub_5bf((byte)3);
         }
      }

      this.var_1b2 = new Class_279(this, this.var_271, var1);
      if (var3) {
         this.var_1b2.sub_89(this.var_b3b, this.var_c69);
      } else if (var4) {
         this.var_1b2.sub_27();
      } else if (var5) {
         this.var_1b2.sub_34();
      }

      this.var_271.sub_81(this.var_1b2);
   }

   public final void sub_3e0(byte var1, byte var2, byte var3) {
      System.out.println("Enter showArcadeGame");
      this.sub_4c3();
      this.var_65 = new Class_108(this, this.var_271, this.var_327, this.var_484, this.var_a8.var_37, var3, var2, var1, false, true, this.var_bca, this.var_b78, this.var_c0a);
      this.var_271.sub_81(this.var_65);
      this.var_d73 = true;
      this.var_293.sub_5c();
      this.sub_f8c();
   }

   public final void sub_413() {
      this.sub_4c3();
      this.var_65 = new Class_108(this, this.var_271, this.var_327, this.var_484, this.var_a8.var_37, (byte)0, (byte)0, (byte)0, false, true, this.var_bca, this.var_b78, this.var_c0a);
      this.var_271.sub_81(this.var_65);
      this.var_d73 = true;
      this.var_293.sub_5c();
      this.sub_f8c();
   }

   public final void sub_479() {
      this.sub_4c3();
      this.var_65 = new Class_108(this, this.var_271, this.var_327, this.var_484, this.var_a8.var_37, (byte)2, (byte)1, this.var_123.sub_57a((byte)3, 0, (byte)0), true, false, this.var_bca, this.var_b78, this.var_c0a);
      this.var_271.sub_81(this.var_65);
      this.var_d73 = true;
      this.sub_f8c();
   }

   public final void sub_4c3() {
      if (this.var_194 != null) {
         this.var_194.sub_89();
         this.var_194 = null;
      }

      if (this.var_65 != null) {
         this.var_65.sub_366();
         this.var_65 = null;
      }

      if (this.var_1b2 != null) {
         this.var_1b2.sub_6a();
         this.var_1b2 = null;
      }

   }

   public final void sub_4ed() {
      this.var_d55 = true;
      this.sub_4c3();
      if (!this.sub_77b() && this.sub_7c8()) {
         this.sub_989("1", this.var_a8.sub_111());
         this.sub_989("3", this.var_123.sub_99e());
      }

      this.var_65 = new Class_108(this, this.var_271, this.var_327, this.var_484, this.var_a8.var_37, (byte)2, this.var_123.sub_7e3(), this.var_123.sub_4ec(), false, false, this.var_bca, this.var_b78, this.var_c0a);
      this.var_271.sub_81(this.var_65);
      this.var_d73 = true;
      this.var_293.sub_5c();
      this.sub_f8c();
   }

   public final void run() {
      long var3 = (long)Math.max(50, this.var_723);

      while(this.var_2a8 != null) {
         if (!this.var_cab) {
            ++this.var_744;
            this.var_69e = System.currentTimeMillis();
            this.var_645 += this.var_69e - this.var_6f2;
            if (this.var_744 % 20 == 0) {
               this.var_5e6 = 20000.0F / ((float)this.var_645 * 1.0F) + 0.5F;
               this.var_645 = 0L;
            }

            this.var_6f2 = this.var_69e;
         }

         if (this.var_271.var_7b != null && !this.var_cab) {
            try {
               this.var_271.sub_74();
               this.var_271.repaint();
               this.var_271.serviceRepaints();
            } catch (Throwable var7) {
            }
         }

         long var1;
         if ((var1 = System.currentTimeMillis() - this.var_69e) >= var3 && !this.var_cab) {
            try {
               Thread.sleep(0L);
            } catch (InterruptedException var8) {
            }
         } else {
            try {
               if (this.var_cab) {
                  Thread.sleep(this.var_706 + 0L);
                  this.var_cab = false;
               } else {
                  Thread.sleep(Math.max(0L, var3 - var1));
               }
            } catch (InterruptedException var9) {
            }
         }
      }

   }

   public final String sub_550() {
      String var1 = null;

      try {
         var1 = Class_1cc.sub_3d0("{0}{1}", new Object[]{Class_1cc.sub_2dd(43), ((MIDlet)this).getAppProperty("MIDlet-Version")});
      } catch (Exception var2) {
      }

      return var1;
   }

   public final void sub_5a5() {
      this.destroyApp(true);
   }

   public final void sub_5bf(byte var1) {
      if (var1 == -1) {
         if (this.var_ad7 && this.var_97c) {
            this.var_293.sub_2d6();
            return;
         }
      } else if (this.var_293.sub_315(var1)) {
         if (this.var_ab0 && this.var_990) {
            this.var_293.sub_132(var1);
            return;
         }
      } else if (this.var_a65 && this.var_990) {
         this.var_293.sub_132(var1);
      }

   }

   public final void sub_612() {
      this.var_293.sub_225();
   }

   public final void sub_63a() {
      this.var_293.sub_2bc();
   }

   public final void sub_682(boolean var1) {
      this.var_a65 = var1;
      if (!this.var_a65) {
         this.sub_612();
      } else {
         this.var_293.sub_d2();
      }
   }

   public final void sub_6a9(boolean var1) {
      this.var_ab0 = var1;
      if (!this.var_ab0) {
         this.sub_63a();
      } else {
         if (this.var_271.var_7b instanceof Class_279) {
            this.sub_5bf((byte)3);
         }

      }
   }

   public final void sub_6eb(boolean var1) {
      this.var_ad7 = var1;
      if (this.var_ad7) {
         this.sub_5bf((byte)-1);
      }

   }

   public final boolean sub_736() {
      return this.sub_9dd("4");
   }

   public final boolean sub_769() {
      return this.sub_9dd("3");
   }

   public final boolean sub_77b() {
      return this.var_b61 || this.sub_769();
   }

   public final boolean sub_7c8() {
      return !this.var_b61 && !this.var_b78 && !this.var_bca && !this.var_c0a;
   }

   public final void sub_81d() {
      this.sub_9a5("3");
   }

   public final void sub_840(int var1) {
      switch (var1) {
         case 0:
            this.var_b61 = !this.var_b61;
            if (this.var_b61) {
               this.sub_989("1", this.var_a8.sub_111());
               this.sub_989("3", this.var_123.sub_99e());
            }

            this.var_a8.sub_22(this.var_b61);
            this.var_123.sub_37(this.var_b61);
            if (!this.var_b61) {
               int var2 = this.var_a8.var_37;
               if (this.sub_9dd("1")) {
                  this.var_a8.sub_d7(this.sub_942("1"));
               }

               Class_1cc.sub_6cf(Class_1cc.var_190[2], this.var_a8.var_37, var2, false);
               if (this.sub_9dd("3")) {
                  this.var_123.sub_98f(this.sub_942("3"));
                  return;
               }
            }
            break;
         case 1:
            this.var_b78 = !this.var_b78;
            return;
         case 2:
            this.var_bca = !this.var_bca;
            return;
         case 3:
            this.var_c0a = !this.var_c0a;
            return;
         case 4:
            this.var_c22 = !this.var_c22;
      }

   }

   public final boolean sub_88e(int var1) {
      switch (var1) {
         case 0:
            return this.var_b61;
         case 1:
            return this.var_b78;
         case 2:
            return this.var_bca;
         case 3:
            return this.var_c0a;
         case 4:
         default:
            return this.var_c22;
      }
   }

   public final void sub_8ee() {
      this.var_57f = this.sub_f0b(Math.min(this.var_271.var_198 - 20, 122));
   }

   public final byte[] sub_942(String var1) {
      byte[] var2 = null;

      try {
         RecordStore var3 = RecordStore.openRecordStore(var1, false);

         try {
            if (var3.getNumRecords() > 0) {
               var2 = var3.getRecord(1);
            }
         } finally {
            var3.closeRecordStore();
         }
      } catch (RecordStoreNotFoundException var9) {
      } catch (RecordStoreException var10) {
      }

      return var2;
   }

   public final void sub_989(String var1, byte[] var2) {
      try {
         RecordStore.deleteRecordStore(var1);
      } catch (RecordStoreNotFoundException var13) {
      } catch (RecordStoreException var14) {
      }

      try {
         RecordStore var3 = RecordStore.openRecordStore(var1, true);

         try {
            var3.addRecord(var2, 0, var2.length);
         } finally {
            var3.closeRecordStore();
         }

      } catch (RecordStoreFullException var11) {
      } catch (RecordStoreException var12) {
      }
   }

   public final void sub_9a5(String var1) {
      try {
         this.sub_d6a(var1);

         try {
            this.var_3d4.deleteRecord(1);
         } finally {
            this.sub_d8b();
         }

      } catch (Exception var6) {
      }
   }

   public final boolean sub_9dd(String var1) {
      boolean var2 = false;

      try {
         this.sub_d6a(var1);

         try {
            if (this.var_3d4.getNumRecords() > 0) {
               var2 = true;
            }
         } finally {
            this.sub_d8b();
         }
      } catch (Exception var7) {
      }

      return var2;
   }

   public final void sub_9ff() {
      for(int var1 = 0; var1 < this.var_51c.length; ++var1) {
         this.var_4b8[var1] = 0;
         this.var_51c[var1] = "";
      }

   }

   public final boolean sub_a5b(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.var_484[var1][var2].length; ++var4) {
         if (var2 == 2) {
            if ((var3 & this.var_484[var1][var2][var4]) > 0) {
               return true;
            }
         } else if (var3 == this.var_484[var1][var2][var4]) {
            return true;
         }
      }

      return false;
   }

   public final boolean sub_abc(int var1, int var2, int var3) {
      return this.sub_a5b(var1, 0, var2) || this.sub_a5b(var1, 1, var3);
   }

   public final int[] sub_af3(int var1, int var2) {
      return this.var_484[var1][var2];
   }

   public final int sub_b34(int var1) {
      return this.var_484[var1][0][0];
   }

   public final String sub_b42(int var1, int var2) {
      String var3 = null;
      if (var2 == 0) {
         switch (var1) {
            case 35:
               var3 = "#";
               break;
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            default:
               var3 = this.var_271.getKeyName(var1);
               break;
            case 42:
               var3 = "*";
               break;
            case 48:
               var3 = "0";
               break;
            case 49:
               var3 = "1";
               break;
            case 50:
               var3 = "2";
               break;
            case 51:
               var3 = "3";
               break;
            case 52:
               var3 = "4";
               break;
            case 53:
               var3 = "5";
               break;
            case 54:
               var3 = "6";
               break;
            case 55:
               var3 = "7";
               break;
            case 56:
               var3 = "8";
               break;
            case 57:
               var3 = "9";
         }
      } else if (var2 == 1) {
         switch (var1) {
            case 1:
               var3 = Class_1cc.sub_2dd(113);
               break;
            case 2:
               var3 = Class_1cc.sub_2dd(111);
               break;
            case 3:
            case 4:
            case 7:
            default:
               var3 = this.var_271.getKeyName(this.var_271.getKeyCode(var1));
               break;
            case 5:
               var3 = Class_1cc.sub_2dd(112);
               break;
            case 6:
               var3 = Class_1cc.sub_2dd(114);
               break;
            case 8:
               var3 = Class_1cc.sub_2dd(115);
               break;
            case 9:
               var3 = Class_1cc.sub_2dd(116);
               break;
            case 10:
               var3 = Class_1cc.sub_2dd(117);
               break;
            case 11:
               var3 = Class_1cc.sub_2dd(118);
               break;
            case 12:
               var3 = Class_1cc.sub_2dd(119);
         }
      } else {
         switch (var1) {
            case 2:
               var3 = Class_1cc.sub_2dd(113);
               break;
            case 4:
               var3 = Class_1cc.sub_2dd(111);
               break;
            case 32:
               var3 = Class_1cc.sub_2dd(112);
               break;
            case 64:
               var3 = Class_1cc.sub_2dd(114);
               break;
            case 256:
               var3 = Class_1cc.sub_2dd(115);
               break;
            case 512:
               var3 = Class_1cc.sub_2dd(116);
               break;
            case 1024:
               var3 = Class_1cc.sub_2dd(117);
               break;
            case 2048:
               var3 = Class_1cc.sub_2dd(118);
               break;
            case 4096:
               var3 = Class_1cc.sub_2dd(119);
         }
      }

      return var3;
   }

   public final void sub_b7c() {
      if (this.var_293 != null && this.var_293.var_253) {
         this.var_293.sub_1e2();
      }

   }

   public final void startApp() {
      if (this.var_22a == null && this.var_271 != null) {
         if (!this.var_271.isShown()) {
            Display.getDisplay(this).setCurrent(this.var_271);
         }

         if ((this.var_271.var_7b instanceof Class_f4 && this.var_1c7 != null || this.var_271.var_7b instanceof Class_279 && this.var_1b2 != null || this.var_271.var_7b instanceof Class_16b && this.var_194 != null) && this.var_293 != null) {
            this.sub_5bf((byte)3);
            return;
         }
      } else if (this.var_271 == null) {
         this.sub_7a();
      }

   }

   public final void pauseApp() {
      if (this.var_271 != null) {
         if (!this.var_d73 && this.var_293 != null) {
            this.var_293.sub_187();
         }

         if (this.var_271.var_7b instanceof Class_108 && this.var_65 != null) {
            if (!this.var_d73) {
               if (this.var_65.var_144c) {
                  return;
               }

               this.var_65.sub_34f(false);
               return;
            }

            this.var_65.sub_307();
         }
      }

   }

   public final void destroyApp(boolean var1) {
      if (this.var_22a == null) {
         this.sub_bb5();
         if (var1) {
            this.sub_d57();
         }
      } else {
         this.var_22a.sub_4d();
         this.var_22a = null;
      }

      ((MIDlet)this).notifyDestroyed();
   }

   public final void sub_bb5() {
      if (this.var_455 == null) {
         this.sub_989("5", new byte[]{(byte)this.var_771});
      }

      this.sub_be5();
      if (this.sub_7c8() && this.var_a8 != null && this.var_123 != null) {
         this.sub_989("1", this.var_a8.sub_111());
         if (this.var_d55) {
            this.sub_989("3", this.var_123.sub_99e());
         }
      }

      if (this.var_4b8 != null) {
         this.sub_dd1();
      }

   }

   public final void sub_be5() {
      this.sub_989("0", this.sub_d2d());
   }

   public static final String sub_c26(String var0) {
      String var1 = null;
      int var2;
      if ((var2 = var0.indexOf(":")) != -1 && var2 != var0.length() - 1) {
         var1 = var0.substring(var2 + 1, var0.length()).trim();
      }

      return var1;
   }

   public static final String sub_c74(String var0) {
      String var1 = null;
      int var2;
      if ((var2 = var0.indexOf(":")) != -1 && var2 != var0.length() - 1) {
         var1 = var0.substring(0, var2).trim();
      }

      return var1;
   }

   public static final String sub_caa(String[] var0, String var1) {
      String var2 = null;
      Object var3 = null;

      for(int var4 = 0; var4 < var0.length; ++var4) {
         if (sub_c74(var0[var4]) != null && sub_c74(var0[var4]).equals(var1)) {
            var2 = sub_c26(var0[var4]);
            break;
         }
      }

      return var2;
   }

   private void sub_ccb(byte[] var1) {
      try {
         DataInputStream var2 = new DataInputStream(new ByteArrayInputStream(var1));

         try {
            this.var_595 = var2.readFloat();
            this.var_a65 = var2.readBoolean();
            this.var_ab0 = var2.readBoolean();
            this.var_ad7 = var2.readBoolean();
         } finally {
            var2.close();
         }
      } catch (Exception var7) {
      }

      Runtime.getRuntime().gc();
   }

   private byte[] sub_d2d() {
      byte[] var1 = null;

      try {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         DataOutputStream var3 = new DataOutputStream(var2);

         try {
            var3.writeFloat(this.var_595);
            var3.writeBoolean(this.var_a65);
            var3.writeBoolean(this.var_ab0);
            var3.writeBoolean(this.var_ad7);
            var1 = var2.toByteArray();
         } finally {
            var3.close();
         }
      } catch (Exception var8) {
      }

      return var1;
   }

   private void sub_d57() {
      this.sub_1013();
      if (this.var_293 != null) {
         this.sub_612();
      }

      if (this.var_65 != null) {
         this.var_65.sub_366();
      }

      if (this.var_194 != null) {
         this.var_194.sub_89();
      }

      if (this.var_1b2 != null) {
         this.var_1b2.sub_6a();
      }

      if (this.var_1c7 != null) {
         this.var_1c7.sub_ed();
      }

      if (this.var_123 != null) {
         this.var_123.sub_63();
      }

      if (this.var_271 != null) {
         this.var_271.sub_45();
      }

      Class_1cc.sub_2a();
      this.var_123 = null;
      this.var_a8 = null;
      this.var_65 = null;
      this.var_194 = null;
      this.var_1b2 = null;
      this.var_1c7 = null;
      this.var_271 = null;
      if (this.var_293 != null) {
         this.var_293.sub_72();
         this.var_293 = null;
      }

      this.var_327 = null;
   }

   private void sub_d6a(String var1) {
      this.var_3d4 = RecordStore.openRecordStore(var1, true);
   }

   private void sub_d8b() {
      this.var_3d4.closeRecordStore();
      this.var_3d4 = null;
   }

   private void sub_da1() {
      this.var_4b8 = new int[4];
      this.var_51c = new String[4];
      if (this.sub_9dd("2")) {
         try {
            DataInputStream var8 = new DataInputStream(new ByteArrayInputStream(this.sub_942("2")));

            try {
               for(int var2 = 0; var2 < this.var_4b8.length; ++var2) {
                  this.var_4b8[var2] = var8.readInt();
               }

               for(int var9 = 0; var9 < this.var_51c.length; ++var9) {
                  this.var_51c[var9] = var8.readUTF();
               }
            } finally {
               var8.close();
            }
         } catch (Exception var7) {
         }

         Runtime.getRuntime().gc();
      } else {
         for(int var1 = 0; var1 < this.var_51c.length; ++var1) {
            this.var_51c[var1] = "";
         }

      }
   }

   private void sub_dd1() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         DataOutputStream var2 = new DataOutputStream(var1);

         try {
            for(int var3 = 0; var3 < this.var_4b8.length; ++var3) {
               var2.writeInt(this.var_4b8[var3]);
            }

            for(int var9 = 0; var9 < this.var_51c.length; ++var9) {
               var2.writeUTF(this.var_51c[var9]);
            }

            this.sub_989("2", var1.toByteArray());
         } finally {
            var2.close();
         }

      } catch (Exception var8) {
      }
   }

   private void sub_dfd() {
      Vector var1 = new Vector();
      StringBuffer var2 = new StringBuffer();
      this.var_484 = new int[18][3][0];

      try {
         InputStream var3;
         int var4;
         for(char var5 = (char)(var4 = (var3 = this.getClass().getResourceAsStream("/keymappings.txt")).read()); var4 != -1; var5 = (char)(var4 = var3.read())) {
            if (var5 == '\n') {
               var1.addElement(var2.toString());
               var2 = new StringBuffer();
            } else {
               var2.append(var5);
            }
         }

         var1.addElement(var2.toString());
         var3.close();
      } catch (Exception var21) {
      }

      for(int var18 = 0; var18 < var1.size(); ++var18) {
         int var14 = 0;
         Vector var6 = new Vector();
         Vector var7 = new Vector();
         Vector var8 = new Vector();
         int var12;
         String var15;
         if ((var12 = (var15 = (String)var1.elementAt(var18)).indexOf(":")) == -1) {
            return;
         }

         var14 = var12 + 2;
         String var16 = var15.substring(0, var12);
         int var10 = this.sub_e9a(var16);
         int var13 = var15.indexOf(";", var14);

         while(var13 != -1) {
            String var17 = var15.substring(var14, var13).trim();
            int var11;
            if ((var11 = this.sub_e82(var17)) == 0) {
               var6.addElement(var17);
            } else if (var11 == 1) {
               var7.addElement(var17);
            } else {
               var8.addElement(var17);
            }

            var14 = var13 + 1;
            if ((var13 = var15.indexOf(";", var14)) == -1) {
               ++var14;
            }
         }

         String var24 = var15.substring(var14, var15.length()).trim();
         int var22;
         if ((var22 = this.sub_e82(var24)) == 0) {
            var6.addElement(var24);
         } else if (var22 == 1) {
            var7.addElement(var24);
         } else {
            var8.addElement(var24);
         }

         for(int var19 = 0; var19 < 3; ++var19) {
            Vector var9;
            if (var19 == 0) {
               var9 = var6;
            } else if (var19 == 1) {
               var9 = var7;
            } else {
               var9 = var8;
            }

            this.var_484[var10][var19] = new int[var9.size()];

            for(int var20 = 0; var20 < var9.size(); ++var20) {
               this.var_484[var10][var19][var20] = this.sub_e21((String)var9.elementAt(var20));
            }
         }
      }

   }

   private int sub_e21(String var1) {
      if (var1.equals("UP_PRESSED")) {
         return 2;
      } else if (var1.equals("DOWN_PRESSED")) {
         return 64;
      } else if (var1.equals("LEFT_PRESSED")) {
         return 4;
      } else if (var1.equals("RIGHT_PRESSED")) {
         return 32;
      } else if (var1.equals("FIRE_PRESSED")) {
         return 256;
      } else if (var1.equals("GAME_A_PRESSED")) {
         return 512;
      } else if (var1.equals("GAME_B_PRESSED")) {
         return 1024;
      } else if (var1.equals("GAME_C_PRESSED")) {
         return 2048;
      } else if (var1.equals("GAME_D_PRESSED")) {
         return 4096;
      } else if (var1.equals("UP")) {
         return 1;
      } else if (var1.equals("DOWN")) {
         return 6;
      } else if (var1.equals("LEFT")) {
         return 2;
      } else if (var1.equals("RIGHT")) {
         return 5;
      } else if (var1.equals("FIRE")) {
         return 8;
      } else if (var1.equals("GAME_A")) {
         return 9;
      } else if (var1.equals("GAME_B")) {
         return 10;
      } else if (var1.equals("GAME_C")) {
         return 11;
      } else if (var1.equals("GAME_D")) {
         return 12;
      } else if (var1.equals("KEY_NUM0")) {
         return 48;
      } else if (var1.equals("KEY_NUM1")) {
         return 49;
      } else if (var1.equals("KEY_NUM2")) {
         return 50;
      } else if (var1.equals("KEY_NUM3")) {
         return 51;
      } else if (var1.equals("KEY_NUM4")) {
         return 52;
      } else if (var1.equals("KEY_NUM5")) {
         return 53;
      } else if (var1.equals("KEY_NUM6")) {
         return 54;
      } else if (var1.equals("KEY_NUM7")) {
         return 55;
      } else if (var1.equals("KEY_NUM8")) {
         return 56;
      } else if (var1.equals("KEY_NUM9")) {
         return 57;
      } else if (var1.equals("KEY_STAR")) {
         return 42;
      } else if (var1.equals("KEY_POUND")) {
         return 35;
      } else if (var1.equals("KEY_SOFTKEY1")) {
         return -6;
      } else if (var1.equals("KEY_SOFTKEY2")) {
         return -7;
      } else if (var1.equals("MIN_VALUE")) {
         return Integer.MIN_VALUE;
      } else {
         try {
            return Integer.parseInt(var1);
         } catch (NumberFormatException var2) {
            return -9999;
         }
      }
   }

   private int sub_e82(String var1) {
      if (!var1.equals("UP_PRESSED") && !var1.equals("DOWN_PRESSED") && !var1.equals("LEFT_PRESSED") && !var1.equals("RIGHT_PRESSED") && !var1.equals("FIRE_PRESSED") && !var1.equals("GAME_A_PRESSED") && !var1.equals("GAME_B_PRESSED") && !var1.equals("GAME_C_PRESSED") && !var1.equals("GAME_D_PRESSED")) {
         return !var1.equals("UP") && !var1.equals("DOWN") && !var1.equals("LEFT") && !var1.equals("RIGHT") && !var1.equals("FIRE") && !var1.equals("GAME_A") && !var1.equals("GAME_B") && !var1.equals("GAME_C") && !var1.equals("GAME_D") ? 0 : 1;
      } else {
         return 2;
      }
   }

   private int sub_e9a(String var1) {
      if (var1.equals("Game_UP")) {
         return 0;
      } else if (var1.equals("Game_DOWN")) {
         return 1;
      } else if (var1.equals("Game_LEFT")) {
         return 2;
      } else if (var1.equals("Game_RIGHT")) {
         return 3;
      } else if (var1.equals("Game_FIRE")) {
         return 4;
      } else if (var1.equals("Game_LOOK_BEHIND")) {
         return 5;
      } else if (var1.equals("Game_CHANGE_VIEW")) {
         return 6;
      } else if (var1.equals("Menu_UP")) {
         return 7;
      } else if (var1.equals("Menu_DOWN")) {
         return 8;
      } else if (var1.equals("Menu_LEFT")) {
         return 9;
      } else if (var1.equals("Menu_RIGHT")) {
         return 10;
      } else if (var1.equals("Menu_FIRE")) {
         return 11;
      } else if (var1.equals("Left_Softkey")) {
         return 12;
      } else if (var1.equals("Right_Softkey")) {
         return 13;
      } else if (var1.equals("Game_NOS_AND_LEFT")) {
         return 14;
      } else if (var1.equals("Game_NOS_AND_RIGHT")) {
         return 15;
      } else if (var1.equals("Game_BRAKE_AND_LEFT")) {
         return 16;
      } else {
         return var1.equals("Game_BRAKE_AND_RIGHT") ? 17 : -1;
      }
   }

   private String sub_ed2(int var1) {
      if (var1 < 5) {
         return Class_1cc.sub_2dd(90 + var1);
      } else {
         return var1 == 5 ? Class_1cc.sub_2dd(105) : Class_1cc.sub_2dd(220 + (var1 - 6));
      }
   }

   private String[] sub_f0b(int var1) {
      String var2 = "{0} {1}";
      String var3 = "{0} {1} {2} {3}";
      String var4 = "{0} {1} {2} {3} {4} {5}";
      Object[] var6 = new Object[6];
      Vector var7 = new Vector();
      Object var9 = null;

      for(int var10 = 0; var10 < var_5a.length; ++var10) {
         Vector var8 = new Vector();

         for(int var11 = 0; var11 < 3; ++var11) {
            for(int var12 = 0; var12 < this.sub_af3(var_5a[var10], var11).length; ++var12) {
               var8.addElement(this.sub_b42(this.sub_af3(var_5a[var10], var11)[var12], var11));
            }
         }

         var6[0] = this.sub_ed2(var10);
         String[] var5;
         if (var8.size() == 3) {
            var6[1] = (String)var8.elementAt(0);
            var6[2] = Class_1cc.sub_2dd(104);
            var6[3] = (String)var8.elementAt(1);
            var6[4] = Class_1cc.sub_2dd(104);
            var6[5] = (String)var8.elementAt(2);
            var5 = Class_1cc.sub_9cb(Class_1cc.sub_3d0(var4, var6), var1);
         } else if (var8.size() == 2) {
            var6[1] = (String)var8.elementAt(0);
            var6[2] = Class_1cc.sub_2dd(104);
            var6[3] = (String)var8.elementAt(1);
            var5 = Class_1cc.sub_9cb(Class_1cc.sub_3d0(var3, var6), var1);
         } else if (var8.size() == 1) {
            var6[1] = (String)var8.elementAt(0);
            var5 = Class_1cc.sub_9cb(Class_1cc.sub_3d0(var2, var6), var1);
         } else {
            var5 = new String[0];
         }

         for(int var15 = 0; var15 < var5.length; ++var15) {
            var7.addElement(var5[var15]);
         }
      }

      String[] var13 = new String[var7.size()];

      for(int var14 = 0; var14 < var13.length; ++var14) {
         var13[var14] = (String)var7.elementAt(var14);
      }

      Runtime.getRuntime().gc();
      return var13;
   }

   private void sub_f63() {
      this.var_706 = 0L;
      Vector var2 = new Vector();
      StringBuffer var3 = new StringBuffer();

      try {
         InputStream var1;
         int var4;
         for(char var5 = (char)(var4 = (var1 = this.getClass().getResourceAsStream("/soundproperties.txt")).read()); var4 != -1; var5 = (char)(var4 = var1.read())) {
            if (var5 == '\n') {
               var2.addElement(var3.toString());
               var3 = new StringBuffer();
            } else {
               var3.append(var5);
            }
         }

         var2.addElement(var3.toString());
         var1.close();
      } catch (Exception var11) {
         return;
      }

      for(int var9 = 0; var9 < var2.size(); ++var9) {
         String var6;
         String var7 = sub_c74(var6 = (String)var2.elementAt(var9));
         String var8 = sub_c26(var6);

         try {
            if (var7 != null && var7.equals("Sound_Pause") & var8 != null && Integer.parseInt(var8) >= 0) {
               this.var_706 = (long)Integer.parseInt(var8);
            }
         } catch (Exception var10) {
         }
      }

      Runtime.getRuntime().gc();
   }

   private void sub_f8c() {
      System.out.println("Enter initGame");
      this.var_65.sub_2f();
      if (!this.var_65.var_144c && this.sub_9dd("4")) {
         this.sub_9a5("4");
      }

      this.var_d73 = false;
   }

   private void sub_fd1() {
      if (this.var_2a8 != null) {
         this.sub_1013();
      }

      this.var_2a8 = new Thread(this);
      this.var_2a8.start();
   }

   private void sub_1013() {
      this.var_2a8 = null;
   }

   private void sub_106b() {
      String var2;
      if ((var2 = sub_caa(Class_1cc.sub_396("/properties.txt"), "FPS_Limit")) == null) {
         this.var_723 = 50;
      } else {
         try {
            int var3 = Integer.parseInt(var2);
            this.var_723 = (int)(1.0F / (float)var3 * 1000.0F);
         } catch (Exception var4) {
            this.var_723 = 50;
         }
      }
   }

   private void sub_1095() {
      this.var_870 = -1;
      this.var_8a2 = -1;
      Vector var2 = new Vector();
      StringBuffer var3 = new StringBuffer();

      try {
         InputStream var1;
         int var4;
         for(char var5 = (char)(var4 = (var1 = this.getClass().getResourceAsStream("/properties.txt")).read()); var4 != -1; var5 = (char)(var4 = var1.read())) {
            if (var5 == '\n') {
               var2.addElement(var3.toString());
               var3 = new StringBuffer();
            } else {
               var3.append(var5);
            }
         }

         var2.addElement(var3.toString());
         var1.close();
      } catch (Exception var12) {
         return;
      }

      for(int var9 = 0; var9 < var2.size(); ++var9) {
         String var6;
         String var7 = sub_c74(var6 = (String)var2.elementAt(var9));
         String var8 = sub_c26(var6);

         try {
            if (var7 != null && var7.equals("Screen_Width") & var8 != null && Integer.parseInt(var8) > 0) {
               this.var_870 = Integer.parseInt(var8);
            }
         } catch (Exception var11) {
         }

         try {
            if (var7 != null && var7.equals("Screen_Height") & var8 != null && Integer.parseInt(var8) > 0) {
               this.var_8a2 = Integer.parseInt(var8);
            }
         } catch (Exception var10) {
         }
      }

   }
}
