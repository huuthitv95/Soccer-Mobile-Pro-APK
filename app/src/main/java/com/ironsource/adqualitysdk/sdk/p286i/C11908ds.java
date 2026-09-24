package com.ironsource.adqualitysdk.sdk.p286i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import com.google.android.exoplayer2.C9415C;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ds */
/* JADX INFO: loaded from: classes6.dex */
public final class C11908ds {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28665 = 220;

    /* JADX INFO: renamed from: ﱟ */
    private static int f28666 = 0;

    /* JADX INFO: renamed from: ﱡ */
    private static int f28667 = 1;

    /* JADX INFO: renamed from: ﺙ */
    private static boolean f28668 = true;

    /* JADX INFO: renamed from: ﻏ */
    private static boolean f28669 = true;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f28670 = {254};

    /* JADX INFO: renamed from: ﻐ */
    private boolean f28671;

    /* JADX INFO: renamed from: ﻛ */
    private Object f28672;

    /* JADX INFO: renamed from: ｋ */
    private boolean f28673;

    /* JADX INFO: renamed from: ﾒ */
    private boolean f28674;

    public C11908ds(Object obj) {
        this.f28672 = obj;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final Object m30066() {
        int i = 2 % 2;
        int i2 = f28666;
        int i3 = i2 + 11;
        f28667 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.f28672;
        int i5 = i2 + 39;
        f28667 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final boolean m30065() {
        int i = 2 % 2;
        Object obj = this.f28672;
        if (obj == null) {
            return false;
        }
        if (!(!(obj instanceof Boolean))) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() != 0;
        }
        if (obj instanceof Long) {
            int i2 = f28667 + 33;
            f28666 = i2 % 128;
            int i3 = i2 % 2;
            if (((Long) obj).longValue() == 0) {
                return false;
            }
            int i4 = f28666 + 7;
            f28667 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return false;
            }
            int i6 = f28667 + 105;
            f28666 = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!(obj instanceof String)) {
            return true;
        }
        if (TextUtils.isEmpty((String) obj)) {
            return false;
        }
        int i7 = f28667 + 107;
        f28666 = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final Number m30063() {
        int i = 2 % 2;
        Object obj = this.f28672;
        Object obj2 = null;
        if (!(obj instanceof Integer)) {
            if (obj instanceof Long) {
                int i2 = f28666 + 37;
                f28667 = i2 % 128;
                int i3 = i2 % 2;
                return (Long) obj;
            }
            if (!(obj instanceof Double)) {
                int i4 = f28666 + 39;
                f28667 = i4 % 128;
                if (i4 % 2 != 0) {
                    return null;
                }
                super.hashCode();
                throw null;
            }
            return (Double) obj;
        }
        int i5 = f28667 + 99;
        f28666 = i5 % 128;
        if (i5 % 2 == 0) {
            return (Integer) obj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    public final boolean m30064() {
        int i = 2 % 2;
        int i2 = f28667 + 33;
        f28666 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f28671;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final C11908ds m30061(boolean z) {
        int i = 2 % 2;
        int i2 = f28667 + 51;
        f28666 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f28671 = z;
            int i3 = 74 / 0;
            return this;
        }
        this.f28671 = z;
        return this;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final boolean m30062() {
        int i = 2 % 2;
        int i2 = f28667 + 81;
        int i3 = i2 % 128;
        f28666 = i3;
        int i4 = i2 % 2;
        boolean z = this.f28673;
        int i5 = i3 + 39;
        f28667 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﺙ */
    public final C11908ds m30059() {
        int i = 2 % 2;
        int i2 = f28667 + 47;
        f28666 = i2 % 128;
        this.f28673 = i2 % 2 == 0;
        return this;
    }

    /* JADX INFO: renamed from: ﻏ */
    public final boolean m30060() {
        int i = 2 % 2;
        int i2 = f28667 + 111;
        int i3 = i2 % 128;
        f28666 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.f28674;
        int i4 = i3 + 33;
        f28667 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﱟ */
    public final C11908ds m30058() {
        int i = 2 % 2;
        int i2 = f28666 + 81;
        int i3 = i2 % 128;
        f28667 = i3;
        int i4 = i2 % 2;
        this.f28674 = true;
        int i5 = i3 + 93;
        f28666 = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f28667 + 99;
        f28666 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (this.f28672 instanceof String) {
            StringBuilder sb = new StringBuilder();
            sb.append(m30057(null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, "\u0081").intern());
            sb.append(this.f28672);
            sb.append(m30057(null, View.resolveSizeAndState(0, 0, 0) + 127, null, "\u0081").intern());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f28672);
        String string = sb2.toString();
        int i4 = f28667 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28666 = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30057(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C12088o.f29838) {
            char[] cArr2 = f28670;
            int i2 = f28665;
            if (f28669) {
                int length = bArr.length;
                C12088o.f29839 = length;
                char[] cArr3 = new char[length];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr3[C12088o.f29840] = (char) (cArr2[bArr[(C12088o.f29839 - 1) - C12088o.f29840] + i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr3);
            }
            if (f28668) {
                int length2 = cArr.length;
                C12088o.f29839 = length2;
                char[] cArr4 = new char[length2];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr4[C12088o.f29840] = (char) (cArr2[cArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            C12088o.f29839 = length3;
            char[] cArr5 = new char[length3];
            C12088o.f29840 = 0;
            while (C12088o.f29840 < C12088o.f29839) {
                cArr5[C12088o.f29840] = (char) (cArr2[iArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                C12088o.f29840++;
            }
            return new String(cArr5);
        }
    }
}
