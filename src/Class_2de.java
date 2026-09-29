import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;

public final class Class_2de implements Class_2b9, CommandListener {
   private final int var_ce = Class_1cc.sub_7b9() + 1;
   private final int var_122 = Class_1cc.sub_80a() + 3;
   private final int var_1d7 = Class_1cc.sub_80a() + 4;
   private final int var_209;
   private GameMidlet var_22c;
   private Class_7d var_252;
   private String[] var_285;
   private char[] var_30e;
   private int var_36e;
   private int var_3b4;
   private int var_3cd;
   private int var_461;
   private int var_495;
   private int var_4f0;
   private int var_51a;
   private int var_578;
   private int var_58c;
   private int var_5c3;
   private int var_5ea;
   private int var_5f8;
   private int var_658;
   private boolean var_698;
   private boolean var_6d4;

   public Class_2de(GameMidlet var1, Class_7d var2, String var3) {
      this.var_209 = this.var_ce + 2;
      this.var_22c = var1;
      this.var_252 = var2;
      this.var_5ea = -9999;
      this.var_5f8 = -9999;
      Class_1cc.sub_831(false);
      this.var_285 = Class_1cc.sub_9cb(var3, this.sub_9a() - 2);
      this.var_30e = new char[5];

      for(int var4 = 0; var4 < this.var_30e.length; ++var4) {
         this.var_30e[var4] = ' ';
      }

      this.var_698 = true;
      this.var_578 = this.var_ce * this.var_285.length + 10 + 1;
      this.var_58c = (this.sub_9a() - this.var_122 * 5) / 2;
      this.var_3cd = (this.sub_9a() - 10 - 4) / this.var_1d7;
      if (this.var_3cd % 2 == 0) {
         --this.var_3cd;
      }

      this.var_4f0 = (this.sub_9a() - this.var_3cd * this.var_1d7) / 2;
      this.var_51a = this.var_578 + this.var_ce * 2;
      this.var_5c3 = 0;
      this.var_461 = Class_1cc.sub_b11('A') - this.var_3cd / 2;
      if (this.var_461 < 0) {
         this.var_461 += Class_1cc.sub_aca();
      }

      this.var_495 = (this.var_461 + this.var_3cd / 2) % Class_1cc.sub_aca();
      this.var_658 = 0;
      this.var_36e = Class_1cc.sub_20a().getHeight() + 1;
   }

   public final void sub_21() {
      this.var_6d4 = false;
      this.var_285 = null;
      this.var_30e = null;
      this.var_22c = null;
      this.var_252 = null;
   }

   public final void sub_292() {
      if (this.var_6d4) {
         ++this.var_3b4;
         int var1;
         if (this.var_5ea != -9999) {
            try {
               var1 = this.var_252.getGameAction(this.var_5ea);
            } catch (Exception var2) {
               var1 = -9999;
            }
         } else {
            var1 = -9999;
         }

         if (this.var_5f8 != this.var_5ea) {
            this.var_658 = 0;
         }

         this.var_5f8 = this.var_5ea;
         if (this.var_22c.sub_abc(12, this.var_5ea, var1) && this.var_658++ == 0) {
            this.sub_161();
         } else {
            if (this.var_22c.sub_abc(13, this.var_5ea, var1) && this.var_658++ == 0) {
               this.sub_1ba();
            }

            if (this.var_22c.sub_abc(11, this.var_5ea, var1) && this.var_658++ == 0) {
               if (this.var_5c3 < this.var_30e.length) {
                  this.var_30e[this.var_5c3++] = Class_1cc.sub_a69(this.var_495);
               }

               this.var_698 = this.sub_13a();
            } else if (!this.var_22c.sub_abc(9, this.var_5ea, var1) || ++this.var_658 <= 5 && this.var_658 != 1) {
               if (this.var_22c.sub_abc(10, this.var_5ea, var1) && (++this.var_658 > 5 || this.var_658 == 1)) {
                  this.sub_2ad();
               }

            } else {
               this.sub_24c();
            }
         }
      }
   }

   public final void sub_97(Graphics var1) {
      if (this.var_6d4) {
         int var2 = this.sub_9a() / 2;
         var1.setColor(16777215);
         var1.fillRect(0, 0, this.sub_9a(), this.sub_f2());
         var1.setColor(0);
         var1.fillRect(0, 0, this.sub_9a(), this.var_285.length * this.var_ce);
         var1.fillRect(0, this.var_51a - 1, this.sub_9a(), this.var_ce);

         for(int var10 = 0; var10 < this.var_285.length; ++var10) {
            Class_1cc.sub_861(var1, this.var_285[var10], var2, 1 + var10 * this.var_ce, 17);
         }

         for(int var13 = 0; var13 < this.var_30e.length; ++var13) {
            int var3 = this.var_58c + this.var_122 * var13 + (Class_1cc.sub_80a() - Class_1cc.sub_a05(this.var_30e[var13])) / 2;
            var1.setColor(0);
            if (var13 == this.var_5c3 && this.var_3b4 % 8 > 3 || var13 != this.var_5c3) {
               var1.fillRect(this.var_58c + this.var_122 * var13, this.var_578 + Class_1cc.sub_7b9(), Class_1cc.sub_80a(), 2);
            }

            Class_1cc.sub_81c(var1, String.valueOf(this.var_30e[var13]), var3, this.var_578);
         }

         int var7 = this.var_51a - 1 - (this.var_209 - this.var_ce) / 2;

         for(int var14 = 0; var14 < this.var_3cd; ++var14) {
            int var8 = (this.var_461 + var14) % Class_1cc.sub_aca();
            int var11 = this.var_4f0 + var14 * this.var_1d7 + (this.var_1d7 - Class_1cc.sub_a05(Class_1cc.sub_a69(var8))) / 2;
            Class_1cc.sub_81c(var1, String.valueOf(Class_1cc.sub_a69(var8)), var11, this.var_51a);
            if (var14 == this.var_3cd / 2) {
               int var6 = var11 - 2;
               int var9 = Class_1cc.sub_a05(Class_1cc.sub_a69(var8)) + 3;
               var1.setColor(0);
               var1.drawRect(var6, var7, var9, this.var_209);
               var1.setColor(16776960);
               var1.drawRect(var6 + 1, var7 + 1, var9 - 2, this.var_209 - 2);
            }
         }

         var1.setColor(16777215);
         int var4 = 0;
         int var5 = this.var_51a - 1 + (this.var_ce - 10) / 2 + 5;
         var1.fillTriangle(1, var5, 6, var5 + 5, 6, var5 - 5);
         var4 = this.sub_9a() - 1;
         var1.fillTriangle(var4, var5, var4 - 5, var5 + 5, var4 - 5, var5 - 5);
         this.sub_1f8(var1);
      }
   }

   public final void sub_ad(int var1) {
      this.var_5ea = var1;
   }

   public final void sub_25d(int var1) {
      this.var_5ea = -9999;
   }

   public final void sub_117() {
      this.var_6d4 = true;
   }

   public final void sub_154() {
      this.var_5ea = -9999;
      this.var_6d4 = false;
   }

   public final boolean sub_200() {
      return this.var_6d4;
   }

   public final int sub_9a() {
      return this.var_252.var_198;
   }

   public final int sub_f2() {
      return this.var_252.var_1e9;
   }

   public final void commandAction(Command var1, Displayable var2) {
   }

   private boolean sub_13a() {
      for(int var1 = 0; var1 < this.var_30e.length; ++var1) {
         if (this.var_30e[var1] != ' ') {
            return false;
         }
      }

      return true;
   }

   private void sub_161() {
      if (!this.var_698) {
         this.var_252.removeCommand(Class_1cc.var_314);
         this.var_252.removeCommand(Class_1cc.var_393);
         this.var_22c.sub_385(String.valueOf(this.var_30e));
      }

   }

   private void sub_1ba() {
      if (this.var_5c3 > 0) {
         this.var_30e[--this.var_5c3] = ' ';
      }

      this.var_698 = this.sub_13a();
   }

   private void sub_1f8(Graphics var1) {
      var1.setColor(16777215);
      var1.fillRect(0, this.sub_f2() - this.var_36e, this.sub_9a(), this.var_36e);
      var1.setColor(0);
      var1.drawLine(0, this.sub_f2() - this.var_36e - 1, this.sub_9a(), this.sub_f2() - this.var_36e - 1);
      var1.setFont(Class_1cc.sub_20a());
      if (!this.var_698) {
         var1.drawString(Class_1cc.sub_2dd(22), 2, this.sub_f2() - 1, 36);
      }

      var1.drawString(Class_1cc.sub_2dd(122), this.sub_9a() - 2, this.sub_f2() - 1, 40);
   }

   private void sub_24c() {
      if (--this.var_461 < 0) {
         this.var_461 = Class_1cc.sub_aca() - 1;
      }

      this.var_495 = (this.var_461 + this.var_3cd / 2) % Class_1cc.sub_aca();
   }

   private void sub_2ad() {
      if (++this.var_461 >= Class_1cc.sub_aca()) {
         this.var_461 = 0;
      }

      this.var_495 = (this.var_461 + this.var_3cd / 2) % Class_1cc.sub_aca();
   }
}
