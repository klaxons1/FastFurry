import javax.microedition.lcdui.Display;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

public final class Class_200 implements PlayerListener {
   private GameMidlet var_19;
   private Player[][] var_7c;
   private Display var_ad;
   private int var_ef = 3;
   private int var_14a = 3;
   private byte var_171;
   private byte var_195;
   private boolean var_1c3;
   private boolean var_201;
   private boolean var_218;
   public boolean var_253;

   public Class_200(GameMidlet var1) {
      this.var_19 = var1;
      this.var_ad = Display.getDisplay(var1);
      this.var_1c3 = false;
      this.var_253 = false;
      this.var_7c = new Player[2][];
      this.var_7c[0] = new Player[this.var_ef];

      for(int var2 = 0; var2 < this.var_7c[0].length; ++var2) {
         this.var_7c[0][var2] = this.sub_383(0 + var2);
      }

      this.var_7c[1] = new Player[this.var_14a];
      this.sub_13();
   }

   public final void sub_13() {
      try {
         try {
            for(int var1 = 0; var1 < this.var_7c[1].length; ++var1) {
               if (this.var_7c[1][var1] != null) {
                  this.sub_34e(this.var_7c[1][var1]);
                  this.var_7c[1][var1].deallocate();
                  this.var_7c[1][var1].close();
                  this.var_7c[1][var1] = null;
               }
            }
         } catch (Exception var2) {
         }

         for(int var4 = 0; var4 < Math.min(this.var_14a, 1); ++var4) {
            this.var_7c[1][var4] = this.sub_383(3 + var4);
         }
      } catch (Exception var3) {
      }

      this.var_201 = true;
   }

   public final void sub_5c() {
      try {
         try {
            for(int var1 = 0; var1 < this.var_7c[1].length; ++var1) {
               if (this.var_7c[1][var1] != null) {
                  this.sub_34e(this.var_7c[1][var1]);
                  this.var_7c[1][var1].deallocate();
                  this.var_7c[1][var1].close();
                  this.var_7c[1][var1] = null;
               }
            }
         } catch (Exception var2) {
         }

         for(int var4 = 0; var4 < Math.min(this.var_14a, 1); ++var4) {
            this.var_7c[1][var4] = this.sub_383(4 + var4);
         }
      } catch (Exception var3) {
      }

      this.var_201 = false;
   }

   public final void sub_72() {
      for(int var1 = 0; var1 < this.var_7c.length; ++var1) {
         for(int var2 = 0; var2 < this.var_7c[var1].length; ++var2) {
            if (this.var_7c[var1][var2] != null) {
               this.sub_34e(this.var_7c[var1][var2]);
               this.var_7c[var1][var2].deallocate();
               this.var_7c[var1][var2].close();
               this.var_7c[var1][var2] = null;
            }
         }
      }

      this.var_ad = null;
      this.var_7c = (Player[][])null;
      this.var_19 = null;
      Runtime.getRuntime().gc();
   }

   public final void sub_d2() {
      boolean var1 = false;
      boolean var2 = false;
      byte var3 = this.sub_3f4(0);
      if (this.var_1c3) {
         try {
            this.var_7c[this.var_195][this.var_171].stop();
            if (this.var_201 && this.var_195 == 1) {
               this.var_218 = true;
            }
         } catch (Exception var5) {
         }

         this.var_1c3 = false;
      }

      try {
         this.var_171 = 0;
         this.var_195 = var3;
         this.var_1c3 = true;
         this.var_7c[var3][0].start();
      } catch (Exception var4) {
         this.var_1c3 = false;
         this.var_218 = false;
      }
   }

   public final synchronized void sub_132(byte var1) {
      byte var2 = this.sub_3f4(var1);
      boolean var3 = false;
      byte var4;
      boolean var5;
      if (var2 == 0) {
         var5 = (var4 = (byte)(var1 - 0)) >= 0 && var4 < Math.min(this.var_ef, 3);
      } else if (this.var_201) {
         var5 = (var4 = (byte)(var1 - 3)) >= 0 && var4 < Math.min(this.var_14a, 1);
      } else {
         var5 = (var4 = (byte)(var1 - 4)) >= 0 && var4 < Math.min(this.var_14a, 1);
      }

      if (!this.var_1c3 && var5) {
         try {
            this.var_171 = var4;
            this.var_195 = var2;
            this.var_1c3 = true;
            this.var_7c[var2][var4].start();
            return;
         } catch (Throwable var6) {
            this.var_1c3 = false;
         }
      }

   }

   public final void sub_187() {
      this.var_253 = true;

      for(int var1 = 0; var1 < this.var_7c.length; ++var1) {
         for(int var2 = 0; var2 < this.var_7c[var1].length; ++var2) {
            if (this.var_7c[var1][var2] != null) {
               try {
                  this.var_7c[var1][var2].stop();
               } catch (Exception var5) {
               }

               try {
                  this.var_7c[var1][var2].deallocate();
               } catch (Exception var4) {
               }

               try {
                  this.var_7c[var1][var2].close();
               } catch (Exception var3) {
               }

               this.var_7c[var1][var2] = null;
            }
         }
      }

      this.var_1c3 = false;
   }

   public final void sub_1e2() {
      if (this.var_253) {
         this.var_253 = false;

         for(int var1 = 0; var1 < this.var_7c[0].length; ++var1) {
            this.var_7c[0][var1] = this.sub_383(0 + var1);
         }

         if (this.var_201) {
            this.sub_13();
            return;
         }

         this.sub_5c();
      }

   }

   public final void sub_225() {
      for(int var1 = 0; var1 < this.var_7c.length; ++var1) {
         for(int var2 = 0; var2 < this.var_7c[var1].length; ++var2) {
            if (var1 == 0 && this.var_7c[var1][var2] != null) {
               this.sub_34e(this.var_7c[var1][var2]);
            } else if (var1 == 1 && !this.var_201 && this.var_7c[var1][var2] != null) {
               this.sub_34e(this.var_7c[var1][var2]);
            }
         }
      }

   }

   public final void sub_2bc() {
      if (this.var_7c[1][0] != null) {
         this.sub_34e(this.var_7c[1][0]);
      }

   }

   public final void sub_2d6() {
      try {
         this.var_ad.vibrate(500);
      } catch (Exception var1) {
      }
   }

   public final boolean sub_315(int var1) {
      switch (var1) {
         case 3:
            return true;
         default:
            return false;
      }
   }

   private void sub_34e(Player var1) {
      if (var1 != null) {
         try {
            var1.stop();
         } catch (Exception var2) {
         }

         try {
            var1.setMediaTime(0L);
            return;
         } catch (Exception var3) {
         }
      }

   }

   private Player sub_383(int var1) {
      byte var2 = this.sub_3f4(var1);
      return this.sub_38f("/" + this.sub_3b2(var1) + "." + this.sub_475(var2), this.sub_428(var2));
   }

   private Player sub_38f(String var1, String var2) {
      Player var3 = null;
      Object var4 = null;

      try {
         (var3 = Manager.createPlayer(this.getClass().getResourceAsStream(var1), var2)).prefetch();
         var3.setLoopCount(1);
         var3.addPlayerListener(this);
         ((VolumeControl)var3.getControl("VolumeControl")).setLevel(65);
      } catch (Exception var5) {
      }

      return var3;
   }

   private String sub_3b2(int var1) {
      switch (var1) {
         case 0:
            return "collision";
         case 1:
            return "nos";
         case 2:
            return "skid";
         case 3:
            return "introtheme";
         case 4:
            return "lowtone";
         case 5:
         default:
            return "hightone";
         case 6:
            return "warningtone";
      }
   }

   private byte sub_3f4(int var1) {
      switch (var1) {
         case 0:
         case 1:
         case 2:
            return 0;
         default:
            return 1;
      }
   }

   private String sub_428(int var1) {
      switch (var1) {
         case 0:
            return "audio/x-wav";
         default:
            return "audio/midi";
      }
   }

   private String sub_475(int var1) {
      switch (var1) {
         case 0:
            return "wav";
         default:
            return "mid";
      }
   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
      if (var2.equals("stopped")) {
         this.var_1c3 = false;
      } else {
         if (var2.equals("endOfMedia")) {
            this.var_1c3 = false;
            if (this.var_218 && this.var_19.var_a65 && this.var_19.var_990 && this.var_201) {
               this.var_218 = false;
               this.sub_132((byte)3);
            }
         }

      }
   }
}
