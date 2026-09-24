package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.S7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class AsyncTaskC6005S7 extends AsyncTask<C6007S9, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"Er5x4Nf8UA9tVLePD2EX", "DtYF9X90t5u", "I941X6fzqWLmgCmjxes", "iBgQ7OI2DFUGAw4NUel9vSUdaaiAzSqO", "QcmiodlDN7oY3kgnmckrDpvdiERsjn9V", "z", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "KLyCCmbDECCjA8c7XM6gY8wQDdZdMwfW"};
    public final InterfaceC6006S8 A00;
    public final C6902gi A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final Drawable A00(C6007S9... c6007s9Arr) throws Throwable {
        if (!AbstractC6271WU.A02(this) && c6007s9Arr != null) {
            try {
                if (c6007s9Arr.length >= 1) {
                    String str = c6007s9Arr[0].A01;
                    String str2 = c6007s9Arr[0].A00;
                    Bitmap bitmapA0O = null;
                    try {
                        bitmapA0O = new C6056Sx(this.A01).A0O(str, -1, -1);
                    } catch (Throwable th) {
                        this.A01.A08().ABC(A01(0, 7, 4), AbstractC6098Td.A1V, new C6099Te(th));
                    }
                    if (bitmapA0O != null) {
                        return C6140UK.A05(this.A01, bitmapA0O, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                AbstractC6271WU.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] ^ i3) ^ 36;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A04[2] = "XzO4PGfz9rpTObXE3Krp6";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{71, 69, 78, 69, 82, 73, 67};
    }

    static {
        A02();
    }

    public AsyncTaskC6005S7(C6902gi c6902gi, InterfaceC6006S8 interfaceC6006S8, boolean z) {
        this.A01 = c6902gi;
        this.A00 = interfaceC6006S8;
        this.A02 = z;
    }

    public /* synthetic */ AsyncTaskC6005S7(C6902gi c6902gi, InterfaceC6006S8 interfaceC6006S8, boolean z, C6924h4 c6924h4) {
        this(c6902gi, interfaceC6006S8, z);
    }

    private final void A03(Drawable drawable) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.AE8(drawable);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C6007S9[] c6007s9Arr) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return null;
        }
        try {
            return A00(c6007s9Arr);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
