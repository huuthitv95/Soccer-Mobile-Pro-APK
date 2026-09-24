package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ih */
/* JADX INFO: loaded from: classes6.dex */
public final class C12032ih {

    /* JADX INFO: renamed from: ﱟ */
    private static int f29333 = 0;

    /* JADX INFO: renamed from: ﺙ */
    private static int f29334 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static char[] f29335;

    /* JADX INFO: renamed from: ﻛ */
    private static long f29336;

    /* JADX INFO: renamed from: ﾇ */
    private static final String[] f29337;

    /* JADX INFO: renamed from: ｋ */
    private final c f29338;

    /* JADX INFO: renamed from: ﾒ */
    private final SQLiteDatabase f29339;

    /* JADX INFO: renamed from: ﾇ */
    static void m30501() {
        f29335 = new char[]{'v', 23579, 47256, 'k', 23583, 47245, 5454, 29141, 52802, 10979, 'k', 23564, 47275, 5405, 29084, 52749, 10926, 34611, 'k', 23583, 47245, 'k', 23583, 47245, 5459, 29143, 42293, 63809, 7635, 45072, 54522, 27509, 36809, 8781, 18094, 58667, 38939, 50285, 8441, 36216, 59876, 22034, 45810, 8047, 31716, 55355};
        f29336 = 1844694482599500922L;
    }

    static {
        m30501();
        f29337 = new String[]{m30500(KeyEvent.normalizeMetaState(0) + 18, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 4 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m30500(Color.argb(0, 0, 0, 0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3).intern()};
        int i = f29334 + 107;
        f29333 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public C12032ih(Context context, String str) {
        c cVar = new c(context, str);
        this.f29338 = cVar;
        this.f29339 = cVar.getWritableDatabase();
    }

    /* JADX INFO: renamed from: ﻛ */
    public final synchronized void m30504(String str, String str2) {
        int i = 2 % 2;
        ContentValues contentValues = new ContentValues();
        contentValues.put(m30500(KeyEvent.getMaxKeyCode() >> 16, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 3 - View.getDefaultSize(0, 0)).intern(), str2);
        if (this.f29339.update(m30500(TextUtils.indexOf("", "") + 10, (char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 8).intern(), contentValues, m30500((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4, (char) View.combineMeasuredStates(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6).intern(), new String[]{str}) == 0) {
            int i2 = f29333 + 85;
            f29334 = i2 % 128;
            int i3 = i2 % 2;
            contentValues.put(m30500((ViewConfiguration.getLongPressTimeout() >> 16) + 18, (char) TextUtils.getOffsetAfter("", 0), 3 - TextUtils.getOffsetAfter("", 0)).intern(), str);
            this.f29339.replace(m30500(Color.green(0) + 10, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.rgb(0, 0, 0) + 16777224).intern(), null, contentValues);
            int i4 = f29334 + 33;
            f29333 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        int i6 = f29334 + 27;
        f29333 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    protected final synchronized String m30502(String str) {
        String string;
        int i = 2 % 2;
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f29339.query(m30500(9 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 8 - KeyEvent.getDeadChar(0, 0)).intern(), f29337, m30500(Color.argb(0, 0, 0, 0) + 3, (char) (ViewConfiguration.getTapTimeout() >> 16), Color.rgb(0, 0, 0) + 16777223).intern(), new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        int i2 = f29334 + 99;
                        f29333 = i2 % 128;
                        if (i2 % 2 != 0) {
                            string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m30500(Color.alpha(1), (char) TextUtils.getOffsetAfter("", 0), 4 >>> (ViewConfiguration.getKeyRepeatTimeout() - 91)).intern()));
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } else {
                            string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m30500(Color.alpha(0), (char) TextUtils.getOffsetAfter("", 0), 3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern()));
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            int i3 = f29333 + 33;
            f29334 = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            int i4 = 96 / 0;
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final synchronized void m30503(String str) {
        int i = 2 % 2;
        int i2 = f29334 + 63;
        f29333 = i2 % 128;
        int i3 = i2 % 2;
        this.f29339.delete(m30500(Gravity.getAbsoluteGravity(0, 0) + 10, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), Gravity.getAbsoluteGravity(0, 0) + 8).intern(), m30500(21 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.indexOf("", "") + 5).intern(), new String[]{str});
        int i4 = f29334 + 39;
        f29333 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x010f A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:56:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x010f, please report this as an issue */
    /* JADX INFO: renamed from: ﾒ */
    public final synchronized HashMap<String, String> m30506(String str, int i) {
        Throwable th;
        String str2;
        HashMap<String, String> map;
        int i2;
        int i3 = 2 % 2;
        int i4 = f29334 + 17;
        f29333 = i4 % 128;
        int i5 = i4 % 2;
        Cursor cursor = null;
        try {
            String strReplace = str.replace('*', '%');
            String strIntern = m30500((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25, (char) (42333 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern();
            String[] strArr = {strReplace};
            if (i <= 0) {
                int i6 = f29334 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                f29333 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 8 / 0;
                }
                str2 = null;
            } else {
                String string = Integer.toString(i);
                int i8 = 2 % 2;
                str2 = string;
            }
            Cursor cursorQuery = this.f29339.query(m30500(10 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) Gravity.getAbsoluteGravity(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 8).intern(), f29337, strIntern, strArr, null, null, null, str2);
            try {
                map = new HashMap<>();
                while (cursorQuery != null && cursorQuery.moveToNext()) {
                    int i9 = f29334 + 59;
                    f29333 = i9 % 128;
                    int i10 = i9 % 2;
                    try {
                        map.put(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m30500(18 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) Color.red(0), TextUtils.lastIndexOf("", '0', 0) + 4).intern())), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m30500(ViewConfiguration.getScrollBarSize() >> 8, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 3 - TextUtils.getTrimmedLength("")).intern())));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (cursorQuery != null) {
                    int i11 = f29334 + 25;
                    f29333 = i11 % 128;
                    if (i11 % 2 != 0) {
                        cursorQuery.close();
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    cursorQuery.close();
                    int i12 = 2 % 2;
                    i2 = f29334 + 7;
                    f29333 = i2 % 128;
                    if (i2 % 2 == 0) {
                        try {
                            super.hashCode();
                            throw null;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } else {
                    i2 = f29334 + 7;
                    f29333 = i2 % 128;
                    if (i2 % 2 == 0) {
                        super.hashCode();
                        throw null;
                    }
                }
            } catch (Throwable th4) {
                cursor = cursorQuery;
                th = th4;
                if (cursor == null) {
                    throw th;
                }
                cursor.close();
                int i13 = 2 % 2;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        throw th;
        return map;
    }

    /* JADX INFO: renamed from: ｋ */
    public final synchronized int m30505(String str) {
        int i = 2 % 2;
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f29339.query(m30500(TextUtils.indexOf("", "", 0, 0) + 10, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 8 - ExpandableListView.getPackedPositionGroup(0L)).intern(), new String[]{m30500(36 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (39000 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9).intern()}, m30500(25 - Process.getGidForName(""), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 42334), TextUtils.indexOf("", "", 0) + 10).intern(), new String[]{str.replace('*', '%')}, null, null, null);
            if (cursorQuery != null) {
                int i2 = f29333 + 75;
                f29334 = i2 % 128;
                int i3 = i2 % 2;
                if (cursorQuery.moveToFirst()) {
                    int i4 = cursorQuery.getInt(0);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    int i5 = f29334 + 71;
                    f29333 = i5 % 128;
                    if (i5 % 2 == 0) {
                        return i4;
                    }
                    int i6 = 34 / 0;
                    return i4;
                }
            }
            if (cursorQuery != null) {
                int i7 = f29334 + 9;
                f29333 = i7 % 128;
                int i8 = i7 % 2;
                cursorQuery.close();
            }
            return 0;
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            cursor.close();
            int i9 = f29334 + 63;
            f29333 = i9 % 128;
            if (i9 % 2 != 0) {
                throw th;
            }
            int i10 = 2 % 2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ih$c */
    static class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: ﮐ */
        private static int f29340 = 0;

        /* JADX INFO: renamed from: ﱡ */
        private static int f29341 = 1;

        /* JADX INFO: renamed from: ﻐ */
        private static short[] f29342 = null;

        /* JADX INFO: renamed from: ﻛ */
        private static int f29343 = 1843306310;

        /* JADX INFO: renamed from: ｋ */
        private static byte[] f29344 = {-85, -1, Ascii.DC2, -60, Ascii.DC4, -6, Ascii.f22492FF, -15, 7, -2, 4, -13, 3, 9, 70, -33, -12, 6, 6, -17, 2, -39, -43, -4, 19, -15, 52, -76, Ascii.f22503VT, -21, 86, -12, -45, Ascii.DC4, -6, 43, -57, 7, 17, -12, 4, -9, 2, 48, -52, -4, 19, -15, 52, -89, Ascii.DC4, -6, 67, -61, -13, 3, -5, 1, Ascii.DC4, -23, Ascii.f22503VT, 75, -51, -1, 1, 10, -15, 19, 37, -52, 5, 1, 46, -38, -3, 41, -37, -7, 10, 1, -19, 52, -37, -15, 19, -4, -13, Ascii.f22499SI};

        /* JADX INFO: renamed from: ﾇ */
        private static int f29345 = 106;

        /* JADX INFO: renamed from: ﾒ */
        private static int f29346 = 312955811;

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = f29341 + 107;
            f29340 = i4 % 128;
            int i5 = i4 % 2;
        }

        public c(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            int i = 2 % 2;
            int i2 = f29340 + 67;
            f29341 = i2 % 128;
            if (i2 % 2 != 0) {
                if (!sQLiteDatabase.isReadOnly()) {
                    sQLiteDatabase.execSQL(m30507((-1843306310) - View.getDefaultSize(0, 0), (short) KeyEvent.keyCodeFromString(""), ((Process.getThreadPriority(0) + 20) >> 6) - 312955731, (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-107) - KeyEvent.normalizeMetaState(0)).intern());
                }
                sQLiteDatabase.execSQL(m30507((-1843306290) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (-312955744) - Color.argb(0, 0, 0, 0), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-107) - View.resolveSize(0, 0)).intern());
                int i3 = f29341 + 1;
                f29340 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            sQLiteDatabase.isReadOnly();
            throw null;
        }

        /* JADX INFO: renamed from: ｋ */
        private static String m30507(int i, short s, int i2, byte b, int i3) {
            String string;
            synchronized (C12086m.f29832) {
                StringBuilder sb = new StringBuilder();
                int i4 = f29345;
                int i5 = i3 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f29344;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f29343 + i] + i4);
                    } else {
                        i5 = (short) (f29342[f29343 + i] + i4);
                    }
                }
                if (i5 > 0) {
                    C12086m.f29836 = ((i + i5) - 2) + f29343 + i6;
                    C12086m.f29833 = b;
                    C12086m.f29837 = (char) (i2 + f29346);
                    sb.append(C12086m.f29837);
                    C12086m.f29834 = C12086m.f29837;
                    C12086m.f29835 = 1;
                    while (C12086m.f29835 < i5) {
                        byte[] bArr2 = f29344;
                        if (bArr2 != null) {
                            int i7 = C12086m.f29836;
                            C12086m.f29836 = i7 - 1;
                            C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                        } else {
                            short[] sArr = f29342;
                            int i8 = C12086m.f29836;
                            C12086m.f29836 = i8 - 1;
                            C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i8] + s)) ^ C12086m.f29833));
                        }
                        sb.append(C12086m.f29837);
                        C12086m.f29834 = C12086m.f29837;
                        C12086m.f29835++;
                    }
                }
                string = sb.toString();
            }
            return string;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30500(int i, char c2, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f29335[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f29336)) ^ ((long) c2));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
