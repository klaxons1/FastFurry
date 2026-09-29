import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class Class_29c {
   public static final byte[][] var_a = new byte[][]{{36, 35, 34}, {34, 33, 32}, {62, 61, 60}, {58, 57, 55}, {31, 29, 28}, {29, 28, 27}, {50, 49, 48}, {49, 48, 47}, new byte[0], {11, 9, 6, 4, 10, 9, 7, 4, 10, 9, 6, 4}, {6, 7, 10, 9, 5, 6, 10, 9, 5, 6, 10, 9}, {13, 11, 16, 9, 13, 11, 16, 9, 13, 11, 16, 9}, {9, 16, 11, 13, 9, 16, 11, 13, 9, 16, 11, 13}, {8, 7, 5, 4, 8, 7, 5, 4, 8, 7, 5, 4}, {4, 5, 7, 8, 4, 5, 7, 8, 4, 5, 7, 8}, {11, 10, 14, 7, 11, 10, 14, 7, 11, 10, 14, 7}, {7, 14, 10, 11, 7, 14, 10, 11, 7, 14, 10, 11}, {40, 35}, {40, 35}, {65, 65}, {65, 65}, {35, 32}, {35, 32}, {60, 60}, {60, 60}};
   private final int[] var_80 = new int[]{100, 35, 25, 0};
   private static final Object[] var_142 = new Object[2];
   private byte[] var_19b;
   private boolean[] var_1ec;
   private byte var_291;
   private byte var_2ad;
   private byte var_307;
   private byte var_33e;
   public byte var_373;
   private boolean var_3b3;
   private boolean var_3e8;
   private boolean var_437;
   private boolean var_457;

   public Class_29c() {
      this.sub_961();
   }

   public final void sub_37(boolean var1) {
      this.var_3b3 = var1;
      this.sub_961();
   }

   public final void sub_63() {
      this.var_19b = null;
      this.var_1ec = null;
   }

   public final String sub_b9() {
      return this.sub_124(this.sub_bd8());
   }

   public final int sub_106() {
      return this.var_291 * 100 / 8;
   }

   public final String sub_124(byte var1) {
      return this.sub_152(this.sub_39e(var1), this.sub_537(var1), this.sub_4d8(var1));
   }

   public final String sub_152(int var1, boolean var2, int var3) {
      byte var4 = (byte)((var1 - 1) * 2 + (var2 ? 1 : 0));
      var_142[0] = this.sub_20a(var4);
      if (var3 == 0) {
         var_142[1] = Class_1cc.sub_2dd(155);
      } else if (var3 == 1) {
         var_142[1] = Class_1cc.sub_2dd(156);
      }

      return Class_1cc.sub_3d0("{0} \n {1}", var_142);
   }

   public final String sub_19c(byte var1) {
      byte var2 = (byte)((this.sub_39e(var1) - 1) * 2 + (this.sub_537(var1) ? 1 : 0));
      return this.sub_20a(var2);
   }

   public final int sub_1c9(byte var1) {
      switch (var1) {
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
            return 4;
         default:
            return -1;
      }
   }

   public final String sub_20a(int var1) {
      return Class_1cc.sub_2dd(77 + var1);
   }

   public final void sub_23e() {
      if (!this.var_3b3) {
         this.sub_c90();
      }

      if (this.var_457 && ++this.var_291 > 8) {
         this.var_291 = 8;
      }

      this.sub_c67();
   }

   public final void sub_28c() {
      this.var_307 = this.var_19b[this.var_2ad];
   }

   public final int sub_2bd() {
      short var1;
      switch (this.var_19b[this.var_2ad]) {
         case 0:
         case 1:
            var1 = 150;
            break;
         case 2:
         case 3:
            var1 = 300;
            break;
         case 4:
         case 5:
            var1 = 450;
            break;
         case 6:
         case 7:
            var1 = 600;
            break;
         default:
            var1 = -1;
      }

      int var2;
      if ((var2 = this.var_19b.length - 1 - this.var_2ad) >= this.var_80.length) {
         var2 = this.var_80.length - 1;
      }

      int var3 = this.var_80[var2];
      return var1 * var3 / 100;
   }

   public final int sub_300() {
      short var1;
      switch (this.var_19b[this.var_2ad]) {
         case 0:
         case 1:
            var1 = 800;
            break;
         case 2:
         case 3:
            var1 = 1500;
            break;
         case 4:
         case 5:
            var1 = 2500;
            break;
         case 6:
         case 7:
            var1 = 3500;
            break;
         default:
            var1 = -1;
      }

      if (this.var_19b.length - 1 - this.var_2ad >= this.var_80.length - 1) {
         var1 = 0;
      }

      return var1;
   }

   public final int sub_35f() {
      return this.var_19b.length;
   }

   public final byte sub_39e(byte var1) {
      switch (var1) {
         case 0:
         case 1:
         case 4:
         case 5:
         case 9:
         case 10:
         case 13:
         case 14:
         case 17:
         case 18:
         case 21:
         case 22:
         case 25:
            return 1;
         case 2:
         case 3:
         case 6:
         case 7:
         case 11:
         case 12:
         case 15:
         case 16:
         case 19:
         case 20:
         case 23:
         case 24:
            return 2;
         case 8:
         default:
            return -1;
      }
   }

   public final boolean sub_3d3(byte var1) {
      switch (var1) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
            return true;
         case 8:
         case 25:
         default:
            return false;
      }
   }

   public final void sub_414() {
      if (++this.var_2ad >= this.var_19b.length) {
         this.var_2ad = (byte)(this.var_19b.length - 1);
      }

      this.var_457 = this.var_2ad == this.var_19b.length - 1;
      this.var_307 = this.var_19b[this.var_2ad];
   }

   public final void sub_438() {
      if (--this.var_2ad < 0) {
         this.var_2ad = 0;
      }

      this.var_457 = this.var_2ad == this.var_19b.length - 1;
      this.var_307 = this.var_19b[this.var_2ad];
   }

   public final boolean sub_451() {
      return this.var_2ad == 0;
   }

   public final boolean sub_49b() {
      return this.var_2ad == this.var_19b.length - 1;
   }

   public final byte sub_4d8(byte var1) {
      switch (var1) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 9:
         case 10:
         case 11:
         case 12:
         case 17:
         case 18:
         case 19:
         case 20:
            return 0;
         case 4:
         case 5:
         case 6:
         case 7:
         case 13:
         case 14:
         case 15:
         case 16:
         case 21:
         case 22:
         case 23:
         case 24:
            return 1;
         case 8:
         default:
            return -1;
      }
   }

   public final byte sub_4ec() {
      return this.var_19b[this.var_2ad];
   }

   public final boolean sub_537(byte var1) {
      switch (var1) {
         case 0:
         case 2:
         case 4:
         case 6:
         case 8:
         case 9:
         case 11:
         case 13:
         case 15:
         case 17:
         case 19:
         case 21:
         case 23:
         case 25:
         default:
            return false;
         case 1:
         case 3:
         case 5:
         case 7:
         case 10:
         case 12:
         case 14:
         case 16:
         case 18:
         case 20:
         case 22:
         case 24:
            return true;
      }
   }

   public final byte sub_57a(byte var1, int var2, byte var3) {
      switch (var1) {
         case 0:
            return (byte)((var3 == 0 ? 0 : 4) + var2);
         case 1:
            return (byte)((var3 == 0 ? 9 : 13) + var2);
         case 2:
            return (byte)((var3 == 0 ? 17 : 21) + var2);
         case 3:
            return 25;
         default:
            return -1;
      }
   }

   public final byte sub_5ce(int var1) {
      switch (var1) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
            return 0;
         case 8:
         default:
            return -1;
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
            return 1;
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
            return 2;
         case 25:
            return 3;
      }
   }

   public final int sub_603(byte var1, byte var2) {
      switch (var1) {
         case 0:
            if (var2 == 0) {
               return this.sub_66d();
            }

            return this.sub_6c6();
         case 1:
            if (!this.var_437 && !this.var_3b3) {
               return 0;
            } else {
               if (var2 == 0) {
                  return 4;
               }

               return 4;
            }
         case 2:
            if (!this.var_3e8 && !this.var_3b3) {
               return 0;
            } else {
               if (var2 == 0) {
                  return 4;
               }

               return 4;
            }
         case 3:
            return 1;
         default:
            return -1;
      }
   }

   public final boolean sub_633() {
      return this.var_291 == 8;
   }

   public final int sub_66d() {
      return this.var_3b3 ? 4 : Math.min(4, this.var_291 + 1);
   }

   public final int sub_6c6() {
      return this.var_3b3 ? 4 : Math.min(4, this.var_291 + 1 - 4);
   }

   public final int sub_6dc() {
      return this.var_3b3 ? 2 : this.var_33e;
   }

   public final byte sub_6eb(byte var1) {
      switch (var1) {
         case 0:
         case 1:
         case 4:
         case 5:
            return 0;
         case 2:
         case 3:
         case 6:
         case 7:
            return 1;
         default:
            return -1;
      }
   }

   public final String sub_72d(byte var1, byte var2) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  return Class_1cc.sub_2dd(200);
               case 1:
                  return Class_1cc.sub_2dd(201);
               case 2:
                  return Class_1cc.sub_2dd(202);
               default:
                  return null;
            }
         case 1:
            switch (var2) {
               case 0:
                  return Class_1cc.sub_2dd(203);
               case 1:
                  return Class_1cc.sub_2dd(204);
               case 2:
                  return Class_1cc.sub_2dd(205);
               default:
                  return null;
            }
         default:
            return null;
      }
   }

   public final byte sub_786(byte var1) {
      switch (var1) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 25:
            return 3;
         case 8:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         default:
            return 2;
      }
   }

   public final byte sub_790(byte var1) {
      switch (var1) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 25:
            return 1;
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         default:
            return 0;
      }
   }

   public final byte sub_7e3() {
      return this.sub_6eb(this.var_19b[this.var_2ad]);
   }

   public final byte sub_832() {
      switch (this.var_307) {
         case 0:
         case 1:
         case 4:
         case 5:
            return 0;
         case 2:
         case 3:
         case 6:
         case 7:
            return 1;
         default:
            return -1;
      }
   }

   public final String sub_841() {
      var_142[0] = Class_1cc.sub_2dd(106);
      var_142[1] = Integer.toString(this.sub_300());
      String var1 = Class_1cc.sub_3d0("{0}{1}", var_142);
      var_142[0] = Class_1cc.sub_2dd(226);
      var_142[1] = var1;
      String var2 = Class_1cc.sub_3d0("{0} {1}", var_142);
      return this.sub_124(this.var_19b[this.var_2ad]) + " \n " + var2;
   }

   public final String sub_89c() {
      var_142[0] = Class_1cc.sub_2dd(227);
      var_142[1] = Integer.toString(this.var_19b[this.var_2ad] + 1);
      return Class_1cc.sub_3d0("{0} {1}", var_142);
   }

   public final String sub_8be() {
      switch (this.var_19b[this.var_2ad]) {
         case 0:
            return Class_1cc.sub_2dd(69);
         case 1:
            return Class_1cc.sub_2dd(134);
         case 2:
            return Class_1cc.sub_2dd(143);
         case 3:
            return Class_1cc.sub_2dd(146);
         case 4:
            return Class_1cc.sub_2dd(137);
         case 5:
            return Class_1cc.sub_2dd(140);
         case 6:
            return Class_1cc.sub_2dd(149);
         case 7:
            return Class_1cc.sub_2dd(152);
         default:
            return null;
      }
   }

   public final String sub_8cf(boolean var1) {
      if (!var1) {
         switch (this.var_307) {
            case 0:
               return Class_1cc.sub_2dd(71);
            case 1:
               return Class_1cc.sub_2dd(135);
            case 2:
               return Class_1cc.sub_2dd(144);
            case 3:
               return Class_1cc.sub_2dd(147);
            case 4:
               return Class_1cc.sub_2dd(138);
            case 5:
               return Class_1cc.sub_2dd(141);
            case 6:
               return Class_1cc.sub_2dd(150);
            case 7:
               return Class_1cc.sub_2dd(153);
            default:
               return null;
         }
      } else {
         switch (this.var_307) {
            case 0:
               return Class_1cc.sub_2dd(70);
            case 1:
               return Class_1cc.sub_2dd(136);
            case 2:
               return Class_1cc.sub_2dd(145);
            case 3:
               return Class_1cc.sub_2dd(148);
            case 4:
               return Class_1cc.sub_2dd(139);
            case 5:
               return Class_1cc.sub_2dd(142);
            case 6:
               return Class_1cc.sub_2dd(151);
            case 7:
               return Class_1cc.sub_2dd(154);
            default:
               return null;
         }
      }
   }

   public final byte[] sub_8f2() {
      byte[] var1 = new byte[this.sub_8ff()];
      int var2 = 0;

      for(int var3 = 0; var3 < this.var_1ec.length; ++var3) {
         if (this.var_1ec[var3] || this.var_3b3) {
            var1[var2++] = (byte)var3;
         }
      }

      return var1;
   }

   public final int sub_8ff() {
      if (this.var_3b3) {
         return 3;
      } else {
         int var1 = 0;

         for(int var2 = 0; var2 < this.var_1ec.length; ++var2) {
            if (this.var_1ec[var2]) {
               ++var1;
            }
         }

         return var1;
      }
   }

   public final void sub_961() {
      this.var_291 = 0;
      this.var_2ad = 0;
      this.var_373 = 1;
      this.var_33e = 1;
      this.sub_c67();
      this.var_1ec = new boolean[3];

      for(int var1 = 0; var1 < this.var_1ec.length; ++var1) {
         this.var_1ec[var1] = var1 == 2;
      }

      this.var_457 = true;
   }

   public final void sub_98f(byte[] var1) {
      try {
         DataInputStream var2 = new DataInputStream(new ByteArrayInputStream(var1));

         try {
            this.var_291 = var2.readByte();
            this.var_2ad = var2.readByte();
            this.var_307 = var2.readByte();
            this.var_33e = var2.readByte();
            this.var_373 = var2.readByte();
            this.var_3e8 = var2.readBoolean();
            this.var_437 = var2.readBoolean();
            this.var_457 = var2.readBoolean();

            for(int var3 = 0; var3 < this.var_1ec.length; ++var3) {
               this.var_1ec[var3] = var2.readBoolean();
            }
         } finally {
            var2.close();
         }
      } catch (Exception var8) {
      }

      this.sub_c67();
   }

   public final byte[] sub_99e() {
      byte[] var1 = null;

      try {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         DataOutputStream var3;
         (var3 = new DataOutputStream(var2)).writeByte(this.var_291);
         var3.writeByte(this.var_2ad);
         var3.writeByte(this.var_307);
         var3.writeByte(this.var_33e);
         var3.writeByte(this.var_373);
         var3.writeBoolean(this.var_3e8);
         var3.writeBoolean(this.var_437);
         var3.writeBoolean(this.var_457);

         for(int var4 = 0; var4 < this.var_1ec.length; ++var4) {
            var3.writeBoolean(this.var_1ec[var4]);
         }

         var1 = var2.toByteArray();
         var2.close();
      } catch (Exception var5) {
      }

      return var1;
   }

   public final boolean sub_9fc() {
      if (!this.var_3b3 && this.var_457) {
         return this.var_291 == 7;
      } else {
         return false;
      }
   }

   public final boolean sub_a18() {
      if (!this.var_3b3 && this.var_457) {
         return this.var_291 == 3;
      } else {
         return false;
      }
   }

   public final boolean sub_a76() {
      if (!this.var_3b3 && this.var_457) {
         return this.var_291 == 5;
      } else {
         return false;
      }
   }

   public final boolean sub_a98() {
      if (!this.var_3b3 && this.var_457) {
         switch (this.var_291) {
            case 1:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public final int sub_aa8() {
      switch (this.var_291) {
         case 1:
            return 1;
         default:
            return -1;
      }
   }

   public final boolean sub_ac0() {
      if (!this.var_3b3 && this.var_457) {
         switch (this.var_291) {
            case 1:
            case 5:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public final byte sub_b24() {
      switch (this.var_291) {
         case 1:
            return 2;
         case 5:
            return 3;
         default:
            return -1;
      }
   }

   public final boolean sub_b34() {
      if (!this.var_3b3 && this.var_457) {
         switch (this.var_291) {
            case 1:
            case 3:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public final int sub_b5c() {
      switch (this.var_291) {
         case 1:
            return 0;
         case 3:
            return 1;
         default:
            return -1;
      }
   }

   public final boolean sub_b8f() {
      if (!this.var_3b3 && this.var_457) {
         switch (this.var_291) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public final byte sub_bd8() {
      switch (this.var_291) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
            return 3;
         case 3:
            return 4;
         case 4:
            return 5;
         case 5:
            return 6;
         case 6:
            return 7;
         default:
            return -1;
      }
   }

   public final boolean sub_c1e() {
      return this.var_3b3 ? true : this.var_3e8;
   }

   public final boolean sub_c47() {
      return this.var_3b3 ? true : this.var_437;
   }

   private void sub_c67() {
      this.var_19b = null;
      if (this.var_3b3) {
         this.var_19b = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
      } else {
         switch (this.var_291) {
            case 0:
               this.var_19b = new byte[]{0};
               break;
            case 1:
               this.var_19b = new byte[]{0, 1};
               break;
            case 2:
               this.var_19b = new byte[]{0, 1, 2};
               break;
            case 3:
               this.var_19b = new byte[]{0, 1, 2, 3};
               break;
            case 4:
               this.var_19b = new byte[]{0, 1, 2, 3, 4};
               break;
            case 5:
               this.var_19b = new byte[]{0, 1, 2, 3, 4, 5};
               break;
            case 6:
               this.var_19b = new byte[]{0, 1, 2, 3, 4, 5, 6};
               break;
            case 7:
               this.var_19b = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
               break;
            case 8:
            default:
               this.var_19b = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
         }
      }

      this.var_2ad = this.var_19b[this.var_19b.length - 1];
      this.var_457 = true;
   }

   private void sub_c90() {
      if (this.sub_b34()) {
         this.var_1ec[this.sub_b5c()] = true;
      }

      if (this.sub_ac0()) {
         ++this.var_373;
      }

      if (this.sub_a98()) {
         ++this.var_33e;
      }

      if (this.sub_9fc()) {
         this.var_3e8 = true;
      }

      if (this.sub_a76()) {
         this.var_437 = true;
      }

   }
}
