import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.CompositingMode;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.Light;
import javax.microedition.m3g.Loader;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.Node;
import javax.microedition.m3g.Object3D;
import javax.microedition.m3g.Texture2D;
import javax.microedition.m3g.Transform;
import javax.microedition.m3g.Transformable;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;
import javax.microedition.m3g.World;

public abstract class Class_1cc {
   private static final Font var_2b = sub_d36();
   public static final Image var_a0 = sub_6b("/dollar.png");
   public static final int[] var_e3 = new int[]{2002, 2001, 2000};
   public static final int[] var_135 = new int[]{2003, 2004, 2005};
   public static final int[] var_157 = new int[]{2006, 2007, 2008};
   public static final int[] var_176 = new int[]{2009, 2010, 2011};
   public static final Group[] var_190 = sub_b7b();
   public static final float[][] var_1e4 = sub_bc9();
   public static final int[] var_238 = new int[]{-1, -13378049, -2263279, -7803341};
   private static final Image[] var_26d = sub_b33();
   public static final byte[] var_2b3 = new byte[]{3, 33, 48, 24, 12, 6};
   public static Command var_314;
   public static Command var_331;
   public static Command var_393;
   private static final double var_3a9 = Math.tan((Math.PI / 6D));
   private static final double var_3e7 = Math.tan(0.2617993877991494);
   public static Hashtable var_430 = null;
   private static String[] var_4a4;
   private static short[] var_4e7;
   private static short[] var_53c;
   private static Image[] var_573;
   private static byte var_5b1;
   private static int var_5cd;
   private static int var_63d;
   private static int var_661;
   private static boolean var_69d = false;

   public static final void sub_2a() {
      var_4e7 = null;
      var_573 = null;
      var_53c = null;
      var_4a4 = null;
      var_314 = null;
      var_331 = null;
      var_393 = null;
   }

   public static final Image sub_6b(String var0) {
      return (Image)sub_fc(var0, 0);
   }

   public static final Object3D[] sub_cd(String var0) {
      return (Object3D[])sub_fc(var0, 1);
   }

   private static Object sub_fc(String var0, int var1) {
      Object var2 = null;
      if (var_430 == null) {
         var_430 = new Hashtable();
      }

      try {
         if ((var1 & 1) == 1) {
            var2 = Loader.load(var0);
         } else {
            var2 = Image.createImage(var0);
         }
      } catch (IOException var3) {
      }

      return var2;
   }

   public static final void sub_12c(Graphics var0, int var1, int var2, int var3) {
      var0.setColor(30872);
      var0.fillRect(0, var1, var3, var2);
      var0.setColor(41152);
      var0.drawLine(0, var1, var3, var1);
      var0.setColor(19551);
      var0.drawLine(0, var1 + var2 - 1, var3, var1 + var2 - 1);
   }

   public static final void sub_181(Graphics var0, int var1, int var2, int var3) {
      if (var1 < 0) {
         var1 = 0;
      }

      int var5 = var2;
      String var7 = Integer.toString(var1);

      for(int var8 = 0; var8 < var7.length(); ++var8) {
         int var4 = Integer.parseInt(var7.substring(var8, var8 + 1));
         int var6 = var_53c[var4 + 1] - var_53c[var4];
         var0.drawImage(var_573[var4], var5, var3, 20);
         var5 += var6 - 3;
      }

   }

   public static final int sub_19b() {
      return var_661;
   }

   public static final int sub_1e2(int var0) {
      if (var0 < 0) {
         var0 = 0;
      }

      int var2 = 0;
      int var3 = 0;
      String var4 = Integer.toString(var0);

      for(int var5 = 0; var5 < var4.length(); ++var5) {
         int var1 = Integer.parseInt(var4.substring(var5, var5 + 1));
         var2 = var_53c[var1 + 1] - var_53c[var1];
         var3 += var2 - 3;
      }

      return var3;
   }

   public static final Font sub_20a() {
      return var_2b;
   }

   public static final void sub_22d() {
      try {
         String[] var0;
         var_53c = new short[(var0 = sub_396("/digitspositions.txt")).length];

         for(int var1 = 0; var1 < var0.length; ++var1) {
            var_53c[var1] = (short)Integer.parseInt(var0[var1]);
         }

         Image var6;
         var_661 = (var6 = Image.createImage("/digits.png")).getHeight();
         var_573 = new Image[var_53c.length - 1];
         Object var2 = null;

         for(int var4 = 0; var4 < var_573.length; ++var4) {
            int var3;
            int[] var7 = new int[(var3 = var_53c[var4 + 1] - var_53c[var4]) * var_661];
            var6.getRGB(var7, 0, var3, var_53c[var4], 0, var3, var_661);
            var_573[var4] = Image.createRGBImage(var7, var3, var_661, true);
         }

      } catch (Exception var5) {
      }
   }

   public static final int sub_26c() {
      return var_5cd;
   }

   public static final void sub_2a1(int var0) {
      if (var_4a4 != null) {
         var_4a4 = null;
         var_314 = null;
         var_331 = null;
         var_393 = null;
      }

      var_4a4 = sub_335("/resourcetext.txt", var0 * 235, 235);
      new Command(sub_2dd(10), 4, 0);
      new Command(sub_2dd(60), 4, 0);
      new Command(sub_2dd(7), 7, 0);
      new Command(sub_2dd(11), 2, 0);
      var_314 = new Command(sub_2dd(22), 4, 0);
      new Command(sub_2dd(8), 4, 0);
      new Command(sub_2dd(9), 2, 0);
      new Command(sub_2dd(38), 4, 0);
      var_331 = new Command(sub_2dd(39), 7, 0);
      new Command(sub_2dd(109), 4, 0);
      var_393 = new Command(sub_2dd(122), 2, 0);
      new Command(sub_2dd(171), 4, 0);
   }

   public static final String sub_2dd(int var0) {
      return var_4a4[var0 - 1];
   }

   public static final String[] sub_335(String var0, int var1, int var2) {
      Object var3 = null;
      Vector var5 = new Vector();
      StringBuffer var6 = new StringBuffer();
      int var8 = 0;
      int var9 = 0;
      boolean var11 = false;

      try {
         InputStream var4 = (new Object()).getClass().getResourceAsStream(var0);

         try {
            int var7;
            for(char var10 = (char)(var7 = var4.read()); var7 != -1 && !var11; var10 = (char)(var7 = var4.read())) {
               if (var8 < var1) {
                  if (var10 == '\n') {
                     ++var8;
                  }
               } else if (var10 == '\n') {
                  if (var6.charAt(0) == ' ') {
                     var5.addElement(" " + var6.toString().trim());
                  } else {
                     var5.addElement(var6.toString().trim());
                  }

                  ++var9;
                  if (var9 == var2) {
                     var11 = true;
                  }

                  var6 = new StringBuffer();
               } else {
                  var6.append(var10);
               }
            }

            if (!var11) {
               var5.addElement(var6.toString().trim());
            }
         } finally {
            var4.close();
         }
      } catch (Exception var16) {
      }

      String[] var17 = new String[var5.size()];

      for(int var12 = 0; var12 < var5.size(); ++var12) {
         var17[var12] = (String)var5.elementAt(var12);
      }

      return var17;
   }

   public static final String[] sub_396(String var0) {
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

   public static final String sub_3d0(String var0, Object[] var1) {
      StringBuffer var2 = new StringBuffer();
      int var3 = 0;

      for(int var6 = var0.indexOf("{", 0); var6 != -1; var6 = var0.indexOf("{", var3)) {
         int var4;
         if ((var4 = var0.indexOf("}", var6)) == -1) {
            var2.append(var0.substring(var3, var0.length() - 1));
            var3 = var0.length();
         } else {
            var2.append(var0.substring(var3, var6));

            try {
               int var5 = Integer.parseInt(var0.substring(var6 + 1, var4));
               var2.append(String.valueOf(var1[var5]));
               var3 = var4 + 1;
            } catch (Exception var7) {
               var3 = var4 + 1;
            }
         }
      }

      if (var3 < var0.length()) {
         var2.append(var0.substring(var3, var0.length()));
      }

      return var2.toString();
   }

   public static final void sub_419(Node var0, Node var1, Transform var2, float var3, float var4, float var5, float[] var6) {
      var6[0] = var3;
      var6[1] = var4;
      var6[2] = var5;
      var6[3] = 1.0F;
      var0.getTransformTo(var1, var2);
      var2.transform(var6);
   }

   public static final String sub_44c(int var0) {
      if (var0 == 1) {
         return "dom";
      } else {
         return var0 == 0 ? "brian" : "player";
      }
   }

   public static final String sub_467(int var0) {
      if (var0 == 1) {
         return sub_2dd(74);
      } else {
         return var0 == 0 ? sub_2dd(75) : sub_2dd(76);
      }
   }

   public static final String sub_4c0(int var0) {
      if (var0 < 3) {
         return sub_2dd(99 + var0);
      } else {
         return var0 == 3 ? sub_2dd(120) : sub_2dd(218);
      }
   }

   public static final String sub_50c(int var0) {
      return var0 == 0 ? sub_2dd(21) : sub_2dd(81);
   }

   public static final String sub_516(int var0) {
      int var1 = var0 / '\uea60';
      int var4;
      int var2 = (var4 = var0 - var1 * '\uea60') / 1000;
      int var3 = (var4 - var2 * 1000) / 10;
      return (var1 < 10 ? "0" : "") + var1 + ":" + (var2 < 10 ? "0" : "") + var2 + ":" + (var3 < 10 ? "0" : "") + var3;
   }

   public static final void sub_536(Group var0) {
      for(int var5 = var0.getChildCount() - 1; var5 >= 0; --var5) {
         Node var1;
         if ((var1 = var0.getChild(var5)) instanceof Mesh) {
            Mesh var2 = (Mesh)var1;

            for(int var6 = 0; var6 < var2.getSubmeshCount(); ++var6) {
               Appearance var3;
               CompositingMode var4;
               if ((var3 = var2.getAppearance(var6)) != null && (var4 = var3.getCompositingMode()) != null) {
                  var4.setBlending(68);
               }
            }
         } else if (var1 instanceof Light) {
            ((Light)var1).setColor(16777215);
         } else if (var1 instanceof Group) {
            sub_536((Group)var1);
         }
      }

      Runtime.getRuntime().gc();
   }

   public static final void sub_597(Group var0) {
      for(int var5 = var0.getChildCount() - 1; var5 >= 0; --var5) {
         Node var1;
         if ((var1 = var0.getChild(var5)) instanceof Mesh) {
            Mesh var2 = (Mesh)var1;

            for(int var6 = 0; var6 < var2.getSubmeshCount(); ++var6) {
               Appearance var3;
               if ((var3 = var2.getAppearance(var6)) != null) {
                  if (var3.getTexture(0) != null) {
                     var3.getTexture(0).setBlending(228);
                  }

                  CompositingMode var4;
                  if ((var4 = var3.getCompositingMode()) != null) {
                     var4.setBlending(68);
                  }
               }
            }
         } else if (var1 instanceof Group) {
            sub_597((Group)var1);
         }
      }

      Runtime.getRuntime().gc();
   }

   public static final void sub_5b7(Group var0) {
      ((Transformable)var0).setTranslation(0.0F, 0.0F, 0.0F);
      ((Transformable)var0).setOrientation(0.0F, 0.0F, 0.0F, 1.0F);
      Transform var3;
      (var3 = new Transform()).setIdentity();
      ((Transformable)var0).setTransform(var3);
      ((Transformable)var0).getCompositeTransform(var3);
      ((Group)var0.getChild(0)).setOrientation(0.0F, 0.0F, 0.0F, 1.0F);
      Group var1;
      if ((var1 = (Group)((Node)var0).getParent()) != null) {
         var1.removeChild(var0);
      }

      Node var2;
      if ((var2 = (Node)((Object3D)var0).find(4000)) != null) {
         ((Group)var2.getParent()).removeChild(var2);
      }

      if ((var2 = (Node)((Object3D)var0).find(4001)) != null) {
         ((Group)var2.getParent()).removeChild(var2);
      }

      ((Node)var0).setRenderingEnable(true);
   }

   public static final Group sub_5c7(int var0, boolean var1) {
      Group var3 = new Group();
      Group var4 = new Group();

      try {
         Object3D[] var2;
         World var5;
         if ((var5 = sub_72f(var2 = Loader.load("/" + sub_44c(var0) + ".m3g"))) == null) {
            var4 = (Group)var2[0];
         } else {
            Node[] var6 = new Node[((Group)var5).getChildCount()];

            for(int var7 = 0; var7 < var6.length; ++var7) {
               var6[var7] = ((Group)var5).getChild(var7);
            }

            for(int var9 = 0; var9 < var6.length; ++var9) {
               if (var6[var9] instanceof Mesh || var6[var9] instanceof Group) {
                  ((Group)var5).removeChild(var6[var9]);
                  var4.addChild(var6[var9]);
               }
            }

            sub_597(var4);
         }
      } catch (Exception var8) {
      }

      if (!var1) {
         sub_536(var4);
      }

      var3.addChild(var4);
      Runtime.getRuntime().gc();
      return var3;
   }

   public static final void sub_5ff(Group var0, int var1, boolean var2) {
      Object var4 = null;

      try {
         Object3D[] var3;
         World var5;
         if ((var5 = sub_72f(var3 = Loader.load("/shadow" + (var2 ? "" : "low") + ".m3g"))) != null) {
            for(int var6 = 0; var6 < ((Group)var5).getChildCount(); ++var6) {
               if (((Group)var5).getChild(var6) instanceof Mesh) {
                  ((Group)var5).getChild(var6);
               }
            }
         }

         Mesh var8;
         (var8 = (Mesh)var3[0]).setUserID(4000);
         ((Transformable)var8).setScale(var_1e4[var1][0] * 0.9F, 1.0F, var_1e4[var1][2] * 0.9F);
         var0.addChild(var8);
      } catch (Exception var7) {
      }
   }

   public static final Mesh sub_61a(int var0, Group var1) {
      Mesh var3 = null;

      try {
         Object3D[] var2;
         World var4;
         if ((var4 = sub_72f(var2 = Loader.load("/nos.m3g"))) == null) {
            var3 = (Mesh)var2[0];
         } else {
            for(int var5 = 0; var5 < ((Group)var4).getChildCount(); ++var5) {
               if (((Group)var4).getChild(var5) instanceof Mesh) {
                  var3 = (Mesh)((Group)var4).getChild(var5);
               }
            }
         }

         ((Object3D)var3).setUserID(4001);
         ((Transformable)var3).setTranslation(var_1e4[var0][0] / 4.0F, 0.3F, -var_1e4[var0][2] / 2.0F);
         var1.addChild(var3);
      } catch (Exception var6) {
      }

      return var3;
   }

   public static final Texture2D sub_650(int var0, boolean var1, int var2) {
      Texture2D var3 = null;

      try {
         Image var6;
         int var8 = (var6 = Image.createImage("/player.png")).getWidth();
         int var9 = var6.getHeight();
         Image var5;
         (var5 = Image.createImage(var8, var9)).getGraphics().drawImage(var6, 0, 0, 20);
         if (var0 > 0) {
            var6 = Image.createImage("/decal" + var0 + ".png");
            var5.getGraphics().drawImage(var6, 0, 0, 20);
         }

         int[] var7 = new int[var8 * var9];
         var5.getRGB(var7, 0, var8, 0, 0, var8, var9);
         sub_ccd(var7, var2, var8, var9);
         var5 = Image.createRGBImage(var7, var8, var9, false);
         Image2D var4 = new Image2D(99, var5);
         var3 = new Texture2D(var4);
         if (!var1) {
            var3.setBlending(228);
         } else {
            var3.setBlending(227);
         }
      } catch (Exception var10) {
      }

      return var3;
   }

   public static final void sub_686(Group var0, int var1, boolean var2, int var3) {
      Texture2D var5 = sub_650(var1, var2, var3);
      var0 = (Group)var0.getChild(0);

      for(int var6 = 0; var6 < var0.getChildCount(); ++var6) {
         if (var0.getChild(var6) instanceof Mesh) {
            Mesh var4 = (Mesh)var0.getChild(var6);

            for(int var7 = 0; var7 < var4.getSubmeshCount(); ++var7) {
               var4.getAppearance(var7).setTexture(0, var5);
            }
         }
      }

      Runtime.getRuntime().gc();
   }

   public static final void sub_6cf(Group var0, int var1, int var2, boolean var3) {
      sub_71e(var0);
      int var5;
      if ((var5 = var1 & 3) > 0) {
         var5 = (var5 >> 0) - 1;
         Mesh var4;
         if ((var4 = (Mesh)((Object3D)var0).find(var_e3[var5])) != null) {
            ((Node)var4).setRenderingEnable(true);
         }
      }

      if ((var5 = var1 & 192) > 0) {
         var5 = (var5 >> 6) - 1;
         Mesh var9;
         if ((var9 = (Mesh)((Object3D)var0).find(var_135[var5])) != null) {
            ((Node)var9).setRenderingEnable(true);
         }
      }

      if ((var5 = (var1 & 48) >> 4) > 0) {
         --var5;
      }

      Mesh var10;
      if ((var10 = (Mesh)((Object3D)var0).find(var_176[var5])) != null) {
         ((Node)var10).setRenderingEnable(true);
      }

      if ((var5 = (var1 & 12) >> 2) > 0) {
         --var5;
      }

      if ((var10 = (Mesh)((Object3D)var0).find(var_157[var5])) != null) {
         ((Node)var10).setRenderingEnable(true);
      }

      var5 = (var1 & 768) >> 8;
      boolean var7 = (var2 & 768) >> 8 != var5;
      boolean var8 = (var1 & 3072) >> 10 != (var2 & 3072) >> 10;
      int var6 = var_238[(var1 & 3072) >> 10];
      if (var7 || var8) {
         sub_686(var0, var5, var3, var6);
      }

   }

   public static final void sub_71e(Group var0) {
      for(int var1 = 0; var1 < 3; ++var1) {
         ((Mesh)((Object3D)var0).find(var_e3[var1])).setRenderingEnable(false);
         ((Mesh)((Object3D)var0).find(var_135[var1])).setRenderingEnable(false);
         ((Mesh)((Object3D)var0).find(var_157[var1])).setRenderingEnable(false);
         ((Mesh)((Object3D)var0).find(var_176[var1])).setRenderingEnable(false);
      }

   }

    public static final World sub_72f(Object3D[] var0) {
        for(int var1 = 0; var1 < var0.length; ++var1) {
            if (var0[var1] instanceof World) {
                World var2 = (World)var0[var1];
                Camera var3 = var2.getActiveCamera();
                if (var3 != null && var3.getParent() == null) {
                    var2.addChild(var3);
                }
                return var2;
            }
        }
        return null;
    }

   private static double sub_76b(double var0) {
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      if (var0 < (double)0.0F) {
         var0 = -var0;
         var4 = true;
      }

      if (var0 > (double)1.0F) {
         var0 = (double)1.0F / var0;
         var2 = true;
      }

      if (var0 > var_3e7) {
         var0 = (var0 - var_3a9) / ((double)1.0F + var_3a9 * var0);
         var3 = true;
      }

      double var5 = sub_b1d(var0);
      if (var3) {
         var5 += (Math.PI / 6D);
      }

      if (var2) {
         var5 = (Math.PI / 2D) - var5;
      }

      return var4 ? -var5 : var5;
   }

   public static final float sub_777(float var0, float var1, boolean var2) {
      float var3;
      if (var1 == 0.0F) {
         if (var0 < 0.0F) {
            var3 = 270.0F;
         } else {
            var3 = 90.0F;
         }
      } else {
         var3 = (float)Math.toDegrees(sub_76b((double)(var0 / var1)));
         if (var1 < 0.0F) {
            if (var0 > 0.0F) {
               var3 = 180.0F - Math.abs(var3);
            } else {
               var3 += 180.0F;
            }
         } else if (var0 < 0.0F) {
            var3 = 360.0F - Math.abs(var3);
         }

         var3 = sub_8e3(var3);
      }

      if (var2) {
         var3 = (float)Math.toRadians((double)var3);
      }

      return var3;
   }

   public static final int sub_789(String var0) {
      int var1 = 0;
      var0 = var0.toUpperCase();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         var1 += sub_a05(var0.charAt(var2)) - (var_69d ? 1 : 0);
      }

      return var1 + (var_69d ? 1 : 0);
   }

   public static final int sub_7b9() {
      return 8;
   }

   public static final int sub_80a() {
      return var_63d;
   }

   public static final void sub_81c(Graphics var0, String var1, int var2, int var3) {
      sub_861(var0, var1, var2, var3, 20);
   }

   public static final void sub_831(boolean var0) {
      var_69d = var0;
   }

   public static final void sub_861(Graphics var0, String var1, int var2, int var3, int var4) {
      int var5;
      if ((var4 & 4) > 0) {
         var5 = var2;
      } else if ((var4 & 8) > 0) {
         var5 = var2 - sub_789(var1);
      } else {
         var5 = var2 - sub_789(var1) / 2;
      }

      int var6;
      if ((var4 & 16) > 0) {
         var6 = var3;
      } else if ((var4 & 32) > 0) {
         var6 = var3 - sub_7b9();
      } else {
         var6 = var3 - sub_7b9() / 2;
      }

      var6 -= 2;
      char var8 = '\u0000';

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if ((var8 = var1.charAt(var9)) >= 'a' && var8 <= 'z' || var8 >= 224 && var8 <= 246 || var8 >= 248 && var8 <= 255) {
            var8 = Character.toUpperCase(var8);
         }

         short var7 = sub_a05(var8);
         if (var8 != ' ' && var8 != 160) {
            var0.drawImage(var_26d[sub_b11(var8)], var5, var6, 20);
         } else {
            var7 = 5;
         }

         var5 += var7 - (var_69d ? 1 : 0);
      }

   }

   public static final Mesh sub_88f(int var0) {
      Mesh var1 = null;
      (var1 = (Mesh)sub_cd("/line.m3g")[0].duplicate()).setUserID(7000);
      return var1;
   }

   public static final Image2D sub_8cd(String var0) {
      Image var2;
      try {
         var2 = Image.createImage(var0);
      } catch (Exception var3) {
         return null;
      }

      return new Image2D(100, var2);
   }

   public static final float sub_8e3(float var0) {
      if (var0 >= 360.0F) {
         var0 -= 360.0F;
      } else if (var0 < 0.0F) {
         var0 += 360.0F;
      }

      return var0;
   }

   public static final String[] sub_93d(String var0) {
      int var2 = 0;

      for(int var1 = 0; var1 < var0.length(); ++var1) {
         if (var0.charAt(var1) == ' ') {
            ++var2;
         }
      }

      String[] var4 = new String[var2 + 1];
      var2 = 0;
      int var3 = 0;

      for(int var5 = 0; var5 < var0.length(); ++var5) {
         if (var0.charAt(var5) == ' ') {
            var4[var2++] = var0.substring(var3, var5);
            var3 = var5 + 1;
         }
      }

      var4[var2] = var0.substring(var3, var0.length());
      return var4;
   }

   public static final String[] sub_989(String var0, int var1) {
      Vector var2 = new Vector();
      String[] var3 = sub_93d(var0);
      StringBuffer var4 = new StringBuffer();

      for(int var5 = 0; var5 < var3.length; ++var5) {
         if (var3[var5].equals("\n")) {
            var2.addElement(var4.toString());
            var4 = new StringBuffer();
         } else if (sub_20a().stringWidth(var4.toString() + " ") + sub_20a().stringWidth(var3[var5]) > var1) {
            var2.addElement(var4.toString());
            var4 = new StringBuffer(var3[var5]);
         } else {
            if (var4.length() != 0) {
               var4.append(" ");
            }

            var4.append(var3[var5]);
         }

         if (var5 == var3.length - 1) {
            var2.addElement(var4.toString());
         }
      }

      String[] var7 = new String[var2.size()];

      for(int var6 = 0; var6 < var7.length; ++var6) {
         var7[var6] = (String)var2.elementAt(var6);
      }

      Runtime.getRuntime().gc();
      return var7;
   }

   public static final String[] sub_9cb(String var0, int var1) {
      Vector var2 = new Vector();
      String[] var3 = sub_93d(var0);
      StringBuffer var4 = new StringBuffer();

      for(int var5 = 0; var5 < var3.length; ++var5) {
         if (var3[var5].equals("\n")) {
            var2.addElement(var4.toString());
            var4 = new StringBuffer();
         } else if (sub_789(var4.toString() + " ") + sub_789(var3[var5]) > var1) {
            var2.addElement(var4.toString());
            var4 = new StringBuffer(var3[var5]);
         } else {
            if (var4.length() != 0) {
               var4.append(" ");
            }

            var4.append(var3[var5]);
         }

         if (var5 == var3.length - 1) {
            var2.addElement(var4.toString());
         }
      }

      String[] var7 = new String[var2.size()];

      for(int var6 = 0; var6 < var7.length; ++var6) {
         var7[var6] = (String)var2.elementAt(var6);
      }

      Runtime.getRuntime().gc();
      return var7;
   }

   public static final short sub_a05(char var0) {
      if (var0 != ' ' && var0 != 160) {
         int var1 = sub_b11(var0);
         return (short)(var_4e7[var1 + 1] - var_4e7[var1]);
      } else {
         return 5;
      }
   }

   public static final char sub_a69(int var0) {
      if (var0 >= 0 && var0 <= 63) {
         return (char)(var0 + 33);
      } else if (var0 >= 64 && var0 <= 67) {
         return (char)(var0 - 64 + 123);
      } else if (var0 >= 68 && var0 <= 79) {
         return (char)(var0 - 68 + 161);
      } else if (var0 >= 80 && var0 <= 129) {
         return (char)(var0 - 80 + 174);
      } else {
         return (char)(var0 == 130 ? '÷' : '!');
      }
   }

   public static final int sub_aca() {
      return var_4e7.length - 2;
   }

   public static final int sub_b11(char var0) {
      if (var0 >= '!' && var0 <= '`') {
         return var0 - 33;
      } else if (var0 >= '{' && var0 <= '~') {
         return var0 - 33 - 26;
      } else if (var0 >= 161 && var0 <= 172) {
         return var0 - 33 - 60;
      } else if (var0 >= 174 && var0 <= 223) {
         return var0 - 33 - 61;
      } else {
         return var0 == 247 ? var0 - 33 - 83 : 0;
      }
   }

   private static final double sub_b1d(double var0) {
      double var2 = var0 * var0;
      return var0 * (48.70107004404898 + var2 * (49.532626377225434 + var2 * 9.40604244231624)) / (48.70107004404996 + var2 * (65.76631639089562 + var2 * (21.587934067020264 + var2)));
   }

   private static Image[] sub_b33() {
      var_63d = -1;
      String[] var0;
      var_4e7 = new short[(var0 = sub_396("/fontpositions.txt")).length];

      for(int var1 = 0; var1 < var_4e7.length; ++var1) {
         var_4e7[var1] = (short)Integer.parseInt(var0[var1]);
      }

      Image[] var6 = new Image[var_4e7.length - 1];
      Image var2;
      var_5b1 = (byte)(var2 = sub_6b("/font.png")).getHeight();
      Object var3 = null;

      for(int var5 = 0; var5 < var6.length; ++var5) {
         int var4;
         if ((var4 = var_4e7[var5 + 1] - var_4e7[var5]) > var_63d) {
            var_63d = var4;
         }

         int[] var7 = new int[var_5b1 * var4];
         var2.getRGB(var7, 0, var4, var_4e7[var5], 0, var4, var_5b1);
         var6[var5] = Image.createRGBImage(var7, var4, var_5b1, true);
      }

      return var6;
   }

   private static Group[] sub_b7b() {
      Group[] var0 = new Group[3];

      for(int var1 = 0; var1 < var0.length; ++var1) {
         var0[var1] = sub_5c7(var1, var1 == 2);
      }

      return var0;
   }

   private static float[][] sub_bc9() {
      float[][] var1 = new float[var_190.length][3];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Mesh var0;
         if ((var0 = (Mesh)var_190[var2].find(3000)) != null) {
            sub_be3(var0, var1[var2]);
         }
      }

      Runtime.getRuntime().gc();
      return var1;
   }

   public static final void sub_be3(Mesh var0, float[] var1) {
      float[] var5 = new float[4];
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      VertexBuffer var2;
      VertexArray var3 = (var2 = var0.getVertexBuffer()).getPositions(var5);
      float[] var6 = new float[4 * var2.getVertexCount()];
      Transform var4;
      (var4 = new Transform()).postTranslate(var5[1], var5[2], var5[3]);
      var4.postScale(var5[0], var5[0], var5[0]);
      var4.transform(var3, var6, true);

      for(int var13 = 0; var13 < var6.length; var13 += 4) {
         if (var6[var13] < var7) {
            var7 = var6[var13];
         } else if (var6[var13] > var8) {
            var8 = var6[var13];
         }

         if (var6[var13 + 1] < var9) {
            var9 = var6[var13 + 1];
         } else if (var6[var13 + 1] > var10) {
            var10 = var6[var13 + 1];
         }

         if (var6[var13 + 2] < var11) {
            var11 = var6[var13 + 2];
         } else if (var6[var13 + 2] > var12) {
            var12 = var6[var13 + 2];
         }
      }

      var1[0] = var8 - var7;
      var1[1] = var10 - var9;
      var1[2] = var12 - var11;
      Runtime.getRuntime().gc();
   }

   private static int sub_c33(int var0, int var1, int var2) {
      int var3 = (var0 & 16711680) >> 16;
      int var4 = (var0 & '\uff00') >> 8;
      int var5 = var0 & 255;
      int var6 = (var1 & 16711680) >> 16;
      int var7 = (var1 & '\uff00') >> 8;
      int var8 = var1 & 255;
      int var9 = (var3 - var6 + (var4 - var7) + (var5 - var8)) / 3;
      int var10 = sub_c81(((var2 & 16711680) >> 16) - var9) << 16;
      int var11 = sub_c81(((var2 & '\uff00') >> 8) - var9) << 8;
      int var12 = sub_c81((var2 & 255) - var9);
      return (var2 & -16777216) + var10 + var11 + var12;
   }

   private static int sub_c81(int var0) {
      if (var0 < 0) {
         var0 = 0;
      } else if (var0 > 255) {
         var0 = 255;
      }

      return var0;
   }

   private static void sub_ccd(int[] var0, int var1, int var2, int var3) {
      for(int var7 = 0; var7 < var0.length; ++var7) {
         if (var7 / var2 <= 108 || var7 % var2 <= 105) {
            int var4 = (var0[var7] & 16711680) >> 16;
            int var5 = (var0[var7] & '\uff00') >> 8;
            int var6 = var0[var7] & 255;
            if (var4 <= 160 || var4 >= 240 || var5 <= 0 || var5 >= 80 || var6 <= 0 || var6 >= 64) {
               var0[var7] = sub_c33(-1, var0[var7], var1);
            }
         }
      }

   }

   private static int sub_d25(String var0) {
      if (var0.equals("SIZE_SMALL")) {
         return 8;
      } else if (var0.equals("SIZE_MEDIUM")) {
         return 0;
      } else {
         return var0.equals("SIZE_LARGE") ? 16 : -1;
      }
   }

   private static Font sub_d36() {
      Font var0 = null;
      int var1 = 8;
      String[] var2;
      String var3;
      if ((var3 = GameMidlet.sub_caa(var2 = sub_396("/properties.txt"), "Font_Size")) != null && sub_d25(var3) != -1) {
         var1 = sub_d25(var3);
      }

      var0 = Font.getFont(0, 0, var1);
      String var4 = GameMidlet.sub_caa(var2, "Font_Height");
      boolean var5 = false;

      try {
         var_5cd = Integer.parseInt(var4);
      } catch (Exception var9) {
         var_5cd = var0.getHeight();
      }

      String var6 = GameMidlet.sub_caa(var2, "Font_Char_Width");
      boolean var7 = false;

      try {
         Integer.parseInt(var6);
      } catch (Exception var8) {
      }

      return var0;
   }
}
