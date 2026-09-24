package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7156kx implements InterfaceC5599LU<Bitmap> {
    public static byte[] A06;
    public final int A00;
    public final int A01;
    public final String A02 = C7156kx.class.getSimpleName();
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-110, -40, -47, -44, 3, 42, 53, 46, 34, 49, -31, 42, 52, -31, 47, 54, 45, 45, -55, -4, -25, -23, -12, -8, -19, -13, -14, -92, -24, -7, -10, -19, -14, -21, -92, -22, -19, -16, -23, -92, -25, -13, -15, -12, -10, -23, -9, -9, -19, -13, -14};
    }

    public C7156kx(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = z3;
    }

    public static C5598LT<Bitmap> A00(Throwable th) {
        return new C5598LT<>(false, null, th);
    }

    private void A03(File file, Bitmap bitmap) throws IOException {
        if (bitmap == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            ByteArrayOutputStream compressedBitmapOS = new ByteArrayOutputStream();
            byteArrayOutputStream = compressedBitmapOS;
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= 3145728) {
                return;
            }
            String str = file.getCanonicalPath() + A01(0, 4, 25);
            File file2 = new File(str);
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(str);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileInputStream = new FileInputStream(str);
            fileOutputStream2 = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i > 0) {
                    fileOutputStream2.write(bArr, 0, i);
                } else {
                    file2.delete();
                    return;
                }
            }
        } finally {
            AbstractC5618Ln.A07(byteArrayOutputStream);
            AbstractC5618Ln.A07(fileOutputStream);
            AbstractC5618Ln.A07(fileInputStream);
            AbstractC5618Ln.A07(fileOutputStream2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5599LU
    public final C5598LT<Bitmap> A3x(File file, InterfaceC5617Lm interfaceC5617Lm) {
        if (!this.A04) {
            return new C5598LT<>(true, null);
        }
        try {
            Bitmap bitmapA03 = AbstractC5618Ln.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
            if (bitmapA03 != null) {
                return new C5598LT<>(true, bitmapA03);
            }
            interfaceC5617Lm.AB4(new C7147kn(A01(4, 14, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)));
            return A00(null);
        } catch (Throwable t) {
            file.delete();
            interfaceC5617Lm.AB4(t);
            return A00(t);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5599LU
    public final void A5D(File file, InterfaceC5617Lm interfaceC5617Lm) throws Throwable {
        if (this.A03) {
            try {
                Bitmap bitmap = AbstractC5618Ln.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
                if (bitmap != null) {
                    A03(file, bitmap);
                } else {
                    file.delete();
                    throw new C7147kn(A01(4, 14, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
                }
            } catch (C7147kn e) {
                interfaceC5617Lm.ABI(e);
                throw e;
            } catch (Throwable th) {
                interfaceC5617Lm.ABI(th);
                Throwable t = new C7147kn(A01(18, 33, 57), th);
                throw t;
            }
        }
    }
}
