import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;

public final class Class_7d extends GameCanvas implements Runnable {
   private final Font var_56 = Font.getFont(0, 0, 8);
   private final int[] var_67 = new int[]{35, 50, 48, 48, 53};
   public Class_2b9 var_7b;
   private GameMidlet var_b8;
   private String var_111;
   private Thread var_16d;
   public int var_198;
   public int var_1e9;
   private byte var_243;
   private boolean var_284;
   private boolean var_2e6;
   private boolean var_322;

   public Class_7d(GameMidlet var1) {
      super(false);
      new Object();
      ((Canvas)this).setFullScreenMode(true);
      this.var_b8 = var1;
      this.var_322 = false;
      this.var_243 = 0;
      ((Canvas)this).repaint();
      ((Canvas)this).serviceRepaints();
      this.var_198 = ((Displayable)this).getWidth();
      this.var_284 = false;
      this.var_1e9 = ((Displayable)this).getHeight();
      this.var_2e6 = false;
   }

   public final void sub_45() {
      this.var_7b = null;
      this.var_b8 = null;
      this.var_111 = null;
      this.var_16d = null;
   }

   public final void paint(Graphics var1) {
      Object var2 = null;
      Object var3 = null;
      var1.setClip(0, 0, this.var_198, this.var_1e9);
      if (this.var_7b != null) {
         this.var_7b.sub_97(var1);
      } else {
         var1.setColor(16777215);
         var1.fillRect(0, 0, this.var_198, this.var_1e9);
      }

      if (this.var_322) {
         var1.setFont(this.var_56);
         var1.setColor(16777215);
         this.var_111 = "fps: " + this.var_b8.var_5e6;
         var1.fillRect(0, 0, this.var_56.stringWidth(this.var_111) + 2, this.var_56.getHeight() + 2);
         var1.setColor(0);
         var1.drawString(this.var_111, 1, 1, 20);
      }

   }

   public final void run() {
      long var5 = (long)Math.max(50, this.var_b8.var_723);

      while(this.var_16d != Thread.currentThread()) {
         long var3 = System.currentTimeMillis();
         if (this.var_7b != null) {
            try {
               ((Canvas)this).repaint();
               ((Canvas)this).serviceRepaints();
            } catch (Throwable var7) {
            }
         }

         long var1;
         if ((var1 = System.currentTimeMillis() - var3) < var5) {
            try {
               Thread.sleep(var5 - var1);
            } catch (InterruptedException var8) {
            }
         }
      }

   }

   public final synchronized void sub_74() {
      if (this.var_7b != null) {
         this.var_7b.sub_292();
      }

   }

   public final void sub_81(Class_2b9 var1) {
      if (this.var_7b != null) {
         this.var_7b.sub_154();
      }

      this.var_7b = var1;
      if (this.var_7b != null) {
         this.var_7b.sub_117();
      }

      ((Canvas)this).repaint();
      ((Canvas)this).serviceRepaints();
   }

   public final void keyPressed(int var1) {
      if (var1 == this.var_67[this.var_243]) {
         if (++this.var_243 >= this.var_67.length) {
            this.var_243 = 0;
            this.var_322 = !this.var_322;
         }
      } else {
         this.var_243 = 0;
      }

      if (this.var_7b != null) {
         this.var_7b.sub_ad(var1);
      }

   }

   public final void keyReleased(int var1) {
      if (this.var_7b != null) {
         this.var_7b.sub_25d(var1);
      }

   }

   public final void keyRepeated(int var1) {
   }

   public final void hideNotify() {
      if (this.var_7b != null) {
         this.var_7b.sub_154();
         this.var_b8.pauseApp();
      }

   }

   public final void showNotify() {
      if (this.var_7b != null && !this.var_7b.sub_200()) {
         this.var_7b.sub_117();
      }

   }

   public final void sub_ab(int var1, int var2) {
      if (var1 != -1) {
         this.var_198 = var1;
         this.var_284 = true;
      }

      if (var2 != -1) {
         this.var_1e9 = var2;
         this.var_2e6 = true;
      }

   }

   public final void sizeChanged(int var1, int var2) {
      if (!this.var_284) {
         this.var_198 = var1;
      }

      if (!this.var_2e6) {
         this.var_1e9 = var2;
      }

   }
}
