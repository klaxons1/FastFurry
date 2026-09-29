import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class Class_2a9 {
   public int var_37;
   private int var_86;
   private boolean var_9e;

   public Class_2a9() {
      this.sub_31();
   }

   public final void sub_22(boolean var1) {
      this.var_9e = var1;
      this.sub_31();
   }

   public final void sub_31() {
      this.var_37 = 0;
      this.var_86 = 0;
   }

   public final void sub_52(int var1) {
      this.var_86 += var1;
   }

   public final void sub_9c(int var1) {
      this.var_86 -= var1;
   }

   public final int sub_ca() {
      return this.var_9e ? 9999 : this.var_86;
   }

   public final void sub_d7(byte[] var1) {
      try {
         DataInputStream var2 = new DataInputStream(new ByteArrayInputStream(var1));

         try {
            this.var_37 = var2.readInt();
            this.var_86 = var2.readInt();
         } finally {
            var2.close();
         }
      } catch (Exception var7) {
      }

      Runtime.getRuntime().gc();
   }

   public final byte[] sub_111() {
      byte[] var1 = null;

      try {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         DataOutputStream var3 = new DataOutputStream(var2);

         try {
            var3.writeInt(this.var_37);
            var3.writeInt(this.var_86);
            var1 = var2.toByteArray();
         } finally {
            var3.close();
         }
      } catch (Exception var8) {
      }

      return var1;
   }
}
