package com.facebook.ads.redexgen.core;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.TI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6077TI extends SQLiteOpenHelper {
    public static byte[] A01;
    public static String[] A02 = {"XfAyR2vU0BibGbkW5sl", "72EQRqCB7z", "pQj0Q1BmcNSJNmsLpeVJ6qN75i73IOus", "lsxje2C6xdGld5UPkxYO", "GgAbEVzt1AOENmbxI3KXH96Z5ccDQ2lY", "3OXRqiMUeM1s", "WQkJsHQStWfxe", "yOid3ecrxpkgxviYKYk6NUThnYl"};
    public static final String A03;
    public final C6076TH A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-105, 101, -119, -118, -117, -122, -102, -111, -103, 101, 117, 0, Ascii.f22503VT, 19, 4, 17, -33, 19, 0, 1, Ascii.f22503VT, 4, -33, 36, 53, 36, 45, 51, 50, -33, 0, 3, 3, -33, 2, Ascii.f22500SO, Ascii.f22503VT, Ascii.DC4, Ascii.f22492FF, Ascii.f22490CR, -33, -122, -87, -119, -90, -71, -90, -89, -90, -72, -86, -115, -86, -79, -75, -86, -73, 101, -88, -90, -77, 101, -77, -76, -71, 101, -89, -86, 101, -77, -70, -79, -79, -16, -2, -5, -4, -52, 0, -19, -18, -8, -15, -52, -11, -14, -52, -15, 4, -11, -1, 0, -1, -52, Ascii.f22499SI, Ascii.f22498RS, Ascii.f22490CR, Ascii.f22502US, Ascii.DC4, 17, Ascii.f22502US, -10, -8, -25, -19, -13, -25, -58, Ascii.f22492FF, Ascii.NAK, Ascii.CAN, Ascii.f22503VT, Ascii.f22499SI, Ascii.f22490CR, Ascii.DC4, 5, 17, Ascii.f22503VT, Ascii.f22502US, Ascii.f22491EM, -58, -29, -58, -11, -12, -31, -51, -48, -33, -111, -33, -102, -48, -50};
        if (A02[7].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "z4ETzKVSWwABxmvmOp0bWtQm6ZVGd83i";
        strArr[2] = "IiBR5v01IEKLzmVqyabUzMw7zaZ4VOx3";
    }

    static {
        A02();
        A03 = C6077TI.class.getSimpleName();
    }

    public C6077TI(C6898ge c6898ge, C6076TH c6076th) {
        super(c6898ge, A01(c6898ge), (SQLiteDatabase.CursorFactory) null, 4);
        if (c6076th != null) {
            this.A00 = c6076th;
            return;
        }
        throw new IllegalArgumentException(A00(41, 32, 2));
    }

    public static String A01(C6898ge c6898ge) {
        Locale locale = Locale.US;
        Object[] objArr = {A00(0, 0, 19)};
        String strA00 = A00(126, 8, 41);
        String str = String.format(locale, strA00, objArr);
        if (!C6171Up.A2k(c6898ge)) {
            return str;
        }
        String defaultDbName = c6898ge.getPackageName();
        String processName = ProcessUtils.getProcessName(c6898ge);
        if (!defaultDbName.equals(processName) && !TextUtils.isEmpty(processName)) {
            String defaultDbName2 = String.format(Locale.US, strA00, '_' + processName);
            return defaultDbName2;
        }
        return str;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (AbstractC6080TL abstractC6080TL : this.A00.A0M()) {
            abstractC6080TL.A07(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        for (AbstractC6080TL abstractC6080TL : this.A00.A0M()) {
            abstractC6080TL.A08(sQLiteDatabase);
            abstractC6080TL.A07(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL(A00(101, 25, 99));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 2 && i2 >= 3) {
            sQLiteDatabase.execSQL(A00(73, 28, 105));
        }
        if (i <= 3 && i2 >= 4) {
            C6074TF c6074tf = C6850fs.A02;
            sQLiteDatabase.execSQL(A00(11, 30, 124) + c6074tf.A01 + A00(0, 1, 52) + c6074tf.A02 + A00(1, 10, 2));
        }
    }
}
