package com.facebook.ads.redexgen.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.W6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6248W6 implements InterfaceC6205VN {
    public static byte[] A01;
    public final C6902gi A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{94, 89, 91, 76, 77, 89, 84, 103, 76, 81, 85, 93, 75, 76, 89, 85, 72, SignedBytes.MAX_POWER_OF_TWO, 79, 74, 70, 77, 87, 124, 66, 83, 74, 124, 85, 70, 81, 80, 74, 76, 77, 101, 105, 104, 114, 99, 104, 114, 60, 41, 41, 5, 2, Ascii.f22502US, Ascii.CAN, Ascii.f22490CR, 0, 0, 51, Ascii.f22498RS, 9, 10, 9, Ascii.f22498RS, Ascii.f22498RS, 9, Ascii.f22498RS, 68, 94, 114, 78, 89, 57, 40, 42, 34, 40, 46, 44, Ascii.SYN, 39, 40, 36, 44};
    }

    public C6248W6(C6902gi c6902gi) {
        this.A00 = c6902gi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A03(String str, boolean z, String str2, String str3, String str4, long j) {
        this.A00.A0F().ABN(str);
        PackageManager packageManager = this.A00.getPackageManager();
        if (packageManager == null) {
            this.A00.A0F().ABS(str);
            return false;
        }
        ContentResolver contentResolver = this.A00.getContentResolver();
        if (contentResolver == null) {
            this.A00.A0F().ABP(str);
            return false;
        }
        if (packageManager.resolveContentProvider(str, 0) == null) {
            this.A00.A0F().ABO(str);
            return false;
        }
        Uri uri = Uri.parse(A00(35, 10, 10) + str + A00(0, 1, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) + str2);
        ContentValues values = new ContentValues();
        values.put(A00(17, 18, 47), (Integer) 1);
        values.put(A00(61, 5, 33), Boolean.valueOf(z));
        values.put(A00(45, 16, 96), str3);
        values.put(A00(66, 12, 69), str4);
        values.put(A00(1, 16, 52), Long.valueOf(j));
        try {
            contentResolver.insert(uri, values);
            this.A00.A0F().ABU(str);
            return true;
        } catch (UnsupportedOperationException unused) {
            this.A00.A0F().ABR(str);
            return false;
        } catch (Exception unused2) {
            this.A00.A0F().ABQ(str);
            return false;
        }
    }

    public final void A04(boolean z, String str, String str2, String str3, long j, boolean z2) {
        this.A00.A0F().ABT();
        ExecutorC6379YG.A06.execute(new C6249W7(this, z, str, str2, str3, j, z2));
    }
}
