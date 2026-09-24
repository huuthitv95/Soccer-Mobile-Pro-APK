package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fv */
/* JADX INFO: loaded from: classes6.dex */
public final class C11965fv extends AbstractC11961fr {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28935 = 1;

    /* JADX INFO: renamed from: ﺙ */
    private static int f28936 = 0;

    /* JADX INFO: renamed from: ﻐ */
    private static char[] f28937 = {216, 195, 212, 130, 142, 157};

    /* JADX INFO: renamed from: ﻛ */
    private static boolean f28938 = true;

    /* JADX INFO: renamed from: ｋ */
    private static int f28939 = 98;

    /* JADX INFO: renamed from: ﾇ */
    private static boolean f28940 = true;

    /* JADX INFO: renamed from: ﾒ */
    private List<AbstractC11919ec> f28941;

    public C11965fv(List<AbstractC11919ec> list) {
        this.f28941 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11961fr
    /* JADX INFO: renamed from: ｋ */
    public final C11908ds mo30195(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        Iterator<AbstractC11919ec> it = this.f28941.iterator();
        int i2 = f28936 + 89;
        f28935 = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            C11931eo c11931eoM30124 = null;
            if (!it.hasNext()) {
                return new C11908ds(null);
            }
            int i4 = f28935 + 73;
            f28936 = i4 % 128;
            int i5 = i4 % 2;
            AbstractC11919ec next = it.next();
            if (next instanceof C11931eo) {
                c11931eoM30124 = (C11931eo) next;
                int i6 = f28935 + 63;
                f28936 = i6 % 128;
                int i7 = i6 % 2;
            } else if (next instanceof C11911dv) {
                int i8 = f28936 + 93;
                f28935 = i8 % 128;
                if (i8 % 2 == 0) {
                    c11931eoM30124 = ((C11911dv) next).m30124();
                    int i9 = 42 / 0;
                } else {
                    c11931eoM30124 = ((C11911dv) next).m30124();
                }
            }
            if (c11931eoM30124 != null) {
                c11907dr.m30054(Arrays.asList(c11931eoM30124.m30179()));
            }
            next.mo30123(c11907dr, c11877co);
        }
    }

    public final String toString() {
        int i = 2 % 2;
        Object obj = null;
        if (this.f28941 == null) {
            String strIntern = m30213(null, View.getDefaultSize(0, 0) + 127, null, "\u0086\u0084\u0083\u0082\u0081").intern();
            int i2 = f28936 + 3;
            f28935 = i2 % 128;
            if (i2 % 2 != 0) {
                return strIntern;
            }
            super.hashCode();
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m30213(null, 127 - ExpandableListView.getPackedPositionType(0L), null, "\u0084\u0083\u0082\u0081").intern());
        sb.append(TextUtils.join(m30213(null, Gravity.getAbsoluteGravity(0, 0) + 127, null, "\u0084\u0085").intern(), this.f28941));
        sb.append(m30213(null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, "\u0086").intern());
        String string = sb.toString();
        int i3 = f28936 + 67;
        f28935 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 48 / 0;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30213(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f28937;
            int i2 = f28939;
            if (f28938) {
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
            if (f28940) {
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
