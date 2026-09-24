package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import androidx.media3.extractor.p007ts.TsExtractor;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7125kQ implements InterfaceC5674Mh {
    public static byte[] A04;
    public static final String[] A05;
    public String A00;
    public String A01;
    public final SparseArray<C5673Mg> A02 = new SparseArray<>();
    public final InterfaceC46235O A03;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{55, 43, 106, 103, 35, 74, 77, 87, 70, 68, 70, 81, 35, 83, 81, 74, 78, 66, 81, 90, 35, 72, 70, 90, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 104, 102, 122, 35, 87, 70, 91, 87, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 110, 102, 119, 98, 103, 98, 119, 98, 35, 65, 79, 76, 65, 35, 77, 76, 87, 35, 77, 86, 79, 79, 42, 46, 63, 40, 44, 57, 40, 77, 57, 44, 47, 33, 40, 77, 6, Ascii.DLE, Ascii.f22490CR, Ascii.DC2, 98, Ascii.SYN, 3, 0, Ascii.f22500SO, 7, 98, Ascii.f22503VT, 4, 98, 7, Ascii.SUB, Ascii.f22503VT, 17, Ascii.SYN, 17, 98, 41, Ascii.DC4, 3, 60, 0, Ascii.f22490CR, Ascii.NAK, 9, Ascii.f22498RS, 47, Ascii.f22490CR, Ascii.f22499SI, 4, 9, 37, 2, 8, 9, Ascii.DC4, 88, 85, Ascii.DC2, Ascii.f22502US, 91, 70, 91, 68, 79, 65, 93, 109, 101, 116, 97, 100, 97, 116, 97};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final void AAs(HashMap<String, C5673Mg> map, SparseArray<String> sparseArray) throws IOException {
        AbstractC45353y.A08(this.A02.size() == 0);
        try {
            if (AbstractC46255Q.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC45353y.A01(this.A00)) != 1) {
                SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    A04(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            Cursor cursorA00 = A00();
            while (cursorA00.moveToNext()) {
                try {
                    C5673Mg c5673Mg = new C5673Mg(cursorA00.getInt(0), (String) AbstractC45353y.A01(cursorA00.getString(1)), C5675Mi.A02(new DataInputStream(new ByteArrayInputStream(cursorA00.getBlob(2)))));
                    map.put(c5673Mg.A02, c5673Mg);
                    sparseArray.put(c5673Mg.A01, c5673Mg.A02);
                } catch (Throwable th2) {
                    if (cursorA00 != null) {
                        try {
                            cursorA00.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            if (cursorA00 != null) {
                cursorA00.close();
            }
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new C46225N(e);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final void AKJ(HashMap<String, C5673Mg> map) throws IOException {
        if (this.A02.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < this.A02.size(); i++) {
                try {
                    C5673Mg c5673MgValueAt = this.A02.valueAt(i);
                    if (c5673MgValueAt == null) {
                        A05(writableDatabase, this.A02.keyAt(i));
                    } else {
                        A06(writableDatabase, c5673MgValueAt);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.A02.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C46225N(e);
        }
    }

    static {
        A03();
        A05 = new String[]{A01(128, 2, 48), A01(136, 3, 37), A01(TsExtractor.TS_STREAM_TYPE_DTS_UHD, 8, 1)};
    }

    public C7125kQ(InterfaceC46235O interfaceC46235O) {
        this.A03 = interfaceC46235O;
    }

    private Cursor A00() {
        return this.A03.getReadableDatabase().query((String) AbstractC45353y.A01(this.A01), A05, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(109, 19, 109) + str;
    }

    private void A04(SQLiteDatabase sQLiteDatabase) throws C46225N {
        AbstractC46255Q.A04(sQLiteDatabase, 1, (String) AbstractC45353y.A01(this.A00), 1);
        A07(sQLiteDatabase, (String) AbstractC45353y.A01(this.A01));
        sQLiteDatabase.execSQL(A01(75, 13, 108) + this.A01 + A01(0, 1, 22) + A01(1, 74, 2));
    }

    private void A05(SQLiteDatabase sQLiteDatabase, int i) {
        sQLiteDatabase.delete((String) AbstractC45353y.A01(this.A01), A01(130, 6, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), new String[]{Integer.toString(i)});
    }

    private void A06(SQLiteDatabase sQLiteDatabase, C5673Mg c5673Mg) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C5675Mi.A08(c5673Mg.A03(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(A01(128, 2, 48), Integer.valueOf(c5673Mg.A01));
        contentValues.put(A01(136, 3, 37), c5673Mg.A02);
        contentValues.put(A01(TsExtractor.TS_STREAM_TYPE_DTS_UHD, 8, 1), byteArray);
        sQLiteDatabase.replaceOrThrow((String) AbstractC45353y.A01(this.A01), null, contentValues);
    }

    public static void A07(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(A01(88, 21, 67) + str);
    }

    public static void A08(InterfaceC46235O interfaceC46235O, String str) throws C46225N {
        try {
            String strA02 = A02(str);
            SQLiteDatabase writableDatabase = interfaceC46235O.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                AbstractC46255Q.A03(writableDatabase, 1, str);
                A07(writableDatabase, strA02);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C46225N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final void A5p() throws C46225N {
        A08(this.A03, (String) AbstractC45353y.A01(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final boolean A6S() throws C46225N {
        try {
            return AbstractC46255Q.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC45353y.A01(this.A00)) != -1;
        } catch (SQLException e) {
            throw new C46225N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final void AAF(long j) {
        this.A00 = Long.toHexString(j);
        this.A01 = A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final void AFd(C5673Mg c5673Mg, boolean z) {
        if (z) {
            this.A02.delete(c5673Mg.A01);
        } else {
            this.A02.put(c5673Mg.A01, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final void AGK(C5673Mg c5673Mg) {
        this.A02.put(c5673Mg.A01, c5673Mg);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5674Mh
    public final void AKI(HashMap<String, C5673Mg> map) throws IOException {
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                A04(writableDatabase);
                Iterator<C5673Mg> it = map.values().iterator();
                while (it.hasNext()) {
                    A06(writableDatabase, it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.A02.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C46225N(e);
        }
    }
}
