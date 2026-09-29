import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class Class_258 implements Class_2b9, CommandListener {
   public static final String[][] var_c = sub_1a1();
   private Font var_3e;
   private GameMidlet var_85;
   private Class_7d var_ca;
   private int var_127;
   private int var_207;
   private int var_244;
   private int var_27d;
   private int var_2b7;
   private boolean var_2cd;

   public Class_258(GameMidlet var1, Class_7d var2) {
      Command[][] var10000 = new Command[][]{{new Command(var_c[0][2], 4, 0), new Command(var_c[0][3], 7, 0)}, {new Command(var_c[1][2], 4, 0), new Command(var_c[1][3], 7, 0)}, {new Command(var_c[2][2], 4, 0), new Command(var_c[2][3], 7, 0)}, {new Command(var_c[3][2], 4, 0), new Command(var_c[3][3], 7, 0)}, {new Command(var_c[4][2], 4, 0), new Command(var_c[4][3], 7, 0)}};
      this.var_3e = Font.getFont(0, 0, 8);
      Font.getFont(0, 0, 16);
      this.var_85 = var1;
      this.var_ca = var2;
      this.var_244 = -9999;
      this.var_27d = -9999;
      this.var_127 = this.var_3e.getHeight() + 1;
   }

   public final void sub_4d() {
      this.var_2cd = false;
      this.var_85 = null;
      this.var_3e = null;
      this.var_ca = null;
   }

   public final void sub_292() {
      if (this.var_2cd) {
         boolean var1 = false;
         int var2;
         if (this.var_244 != -9999) {
            try {
               var2 = this.var_ca.getGameAction(this.var_244);
            } catch (Exception var3) {
               var2 = -9999;
            }
         } else {
            var2 = -9999;
         }

         if (this.var_27d != this.var_244) {
            this.var_2b7 = 0;
         }

         this.var_27d = this.var_244;
         if (this.var_85.sub_abc(12, this.var_244, var2) && this.var_2b7++ == 0) {
            this.sub_c7();
         } else if (this.var_85.sub_abc(13, this.var_244, var2) && this.var_2b7++ == 0) {
            this.sub_fe();
         } else {
            if (this.var_2b7++ == 0) {
               if (this.var_85.sub_abc(11, this.var_244, var2)) {
                  this.sub_c7();
                  return;
               }

               if (this.var_85.sub_abc(7, this.var_244, var2)) {
                  if (--this.var_207 < 0) {
                     this.var_207 = 4;
                  }

                  return;
               }

               if (this.var_85.sub_abc(8, this.var_244, var2) && ++this.var_207 >= 5) {
                  this.var_207 = 0;
               }
            }

         }
      }
   }

   public final void sub_97(Graphics var1) {
      if (this.var_2cd) {
         int var2 = this.sub_5b() - 40;
         int var3 = (this.sub_5b() - var2) / 2;
         int var6;
         int var5 = ((var6 = this.var_3e.getHeight() + 2) - this.var_3e.getHeight()) / 2;
         int var4 = this.var_3e.getHeight() + 4;
         int var7 = (this.sub_6e() - 5 * var4) / 2;
         var1.setColor(16777215);
         var1.fillRect(0, 0, this.sub_5b(), this.sub_6e());
         var1.setFont(this.var_3e);
         var1.setColor(255);
         var1.fillRect(var3, var7 - var5 + this.var_207 * var4, var2, var6);

         for(int var8 = 0; var8 < 5; ++var8) {
            if (var8 == this.var_207) {
               var1.setColor(16777215);
            } else {
               var1.setColor(0);
            }

            var1.drawString(var_c[var8][0], this.sub_5b() / 2, var7 + var8 * var4, 17);
         }

         this.sub_140(var1);
      }
   }

   public final void sub_ad(int var1) {
      this.var_244 = var1;
   }

   public final void sub_25d(int var1) {
      this.var_244 = -9999;
   }

   public final void sub_117() {
      this.var_2cd = true;
   }

   public final void sub_154() {
      this.var_2cd = false;
   }

   public final boolean sub_200() {
      return this.var_2cd;
   }

   public final int sub_5b() {
      return this.var_ca.var_198;
   }

   public final int sub_6e() {
      return this.var_ca.var_1e9;
   }

   public final void commandAction(Command var1, Displayable var2) {
   }

   private void sub_c7() {
      this.var_85.sub_12c(this.var_207);
   }

   private void sub_fe() {
      this.var_85.sub_5a5();
   }

   private void sub_140(Graphics var1) {
      var1.setFont(Class_1cc.sub_20a());
      var1.setColor(16777215);
      var1.fillRect(0, this.sub_6e() - this.var_127, this.sub_5b(), this.var_127);
      var1.setColor(0);
      var1.drawLine(0, this.sub_6e() - this.var_127 - 1, this.sub_5b(), this.sub_6e() - this.var_127 - 1);
      var1.setFont(this.var_3e);
      var1.drawString(var_c[this.var_207][2], 2, this.sub_6e() - 1, 36);
      var1.drawString(var_c[this.var_207][3], this.sub_5b() - 2, this.sub_6e() - 1, 40);
   }

   private static String[][] sub_1a1() {
      String[][] var0 = new String[5][4];
      String[] var1 = sub_200("/languagetext.txt");
      int var2 = 0;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         for(int var4 = 0; var4 < var0[var3].length; ++var4) {
            var0[var3][var4] = var1[var2++];
         }
      }

      Runtime.getRuntime().gc();
      return var0;
   }

   private static String[] sub_200(String var0) {
      Object var1 = null;
      Vector var3 = new Vector();
      StringBuffer var4 = new StringBuffer();

      try {
         InputStream var2;
         int var5;
         for(char var6 = (char)(var5 = (var2 = (new Object()).getClass().getResourceAsStream(var0)).read()); var5 != -1; var6 = (char)(var5 = var2.read())) {
            if (var6 == '\n') {
               var3.addElement(var4.toString().trim());
               var4 = new StringBuffer();
            } else {
               var4.append(var6);
            }
         }

         var3.addElement(var4.toString().trim());
         var2.close();
      } catch (Exception var8) {
      }

      String[] var9 = new String[var3.size()];

      for(int var7 = 0; var7 < var3.size(); ++var7) {
         var9[var7] = (String)var3.elementAt(var7);
      }

      return var9;
   }
}
