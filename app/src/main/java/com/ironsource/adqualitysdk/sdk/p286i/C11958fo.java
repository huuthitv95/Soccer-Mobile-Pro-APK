package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fo */
/* JADX INFO: loaded from: classes6.dex */
public class C11958fo extends AbstractC11961fr {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28896 = 1;

    /* JADX INFO: renamed from: ﱡ */
    private static int f28897 = 0;

    /* JADX INFO: renamed from: ﻏ */
    private static short[] f28898 = null;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28899 = -1174249600;

    /* JADX INFO: renamed from: ｋ */
    private static byte[] f28900 = {0};

    /* JADX INFO: renamed from: ﾇ */
    private static int f28901 = -1674525746;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28902 = 69;

    /* JADX INFO: renamed from: ﻐ */
    private AbstractC11919ec f28903;

    public C11958fo(AbstractC11919ec abstractC11919ec) {
        this.f28903 = abstractC11919ec;
    }

    /* JADX INFO: renamed from: ﾒ */
    final AbstractC11919ec m30203() {
        int i = 2 % 2;
        int i2 = f28896 + 39;
        f28897 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f28903;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11961fr
    /* JADX INFO: renamed from: ｋ */
    public C11908ds mo30195(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28897 + 73;
        int i3 = i2 % 128;
        f28896 = i3;
        int i4 = i2 % 2;
        AbstractC11919ec abstractC11919ec = this.f28903;
        if (abstractC11919ec != null) {
            int i5 = i3 + 69;
            f28897 = i5 % 128;
            if (i5 % 2 == 0) {
                return abstractC11919ec.m30156(c11907dr, c11877co);
            }
            abstractC11919ec.m30156(c11907dr, c11877co);
            throw null;
        }
        return new C11908ds(null);
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = f28896 + 49;
        f28897 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.f28903 == null) {
            String strIntern = m30202(1674525746 - Drawable.resolveOpacity(0, 0), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 1174249659 - Color.red(0), (byte) (View.resolveSizeAndState(0, 0, 0) + 110), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 68).intern();
            int i3 = f28897 + 91;
            f28896 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 83 / 0;
            }
            return strIntern;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28903);
        sb.append(m30202((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1674525745, (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1174249659 - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (TextUtils.indexOf("", "") + 110), TextUtils.indexOf((CharSequence) "", '0') - 67).intern());
        String string = sb.toString();
        int i5 = f28897 + 67;
        f28896 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return string;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f28897 + 95;
        f28896 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            super.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            int i3 = f28897 + 53;
            f28896 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        AbstractC11919ec abstractC11919ec = this.f28903;
        AbstractC11919ec abstractC11919ec2 = ((C11958fo) obj).f28903;
        if (abstractC11919ec != null) {
            return abstractC11919ec.equals(abstractC11919ec2);
        }
        return abstractC11919ec2 == null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = f28897 + 55;
        int i3 = i2 % 128;
        f28896 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        AbstractC11919ec abstractC11919ec = this.f28903;
        if (abstractC11919ec == null) {
            return 0;
        }
        int i4 = i3 + 95;
        f28897 = i4 % 128;
        int i5 = i4 % 2;
        int iHashCode = abstractC11919ec.hashCode();
        int i6 = f28897 + 101;
        f28896 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 72 / 0;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30202(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f28902;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f28900;
                if (bArr != null) {
                    i5 = (byte) (bArr[f28901 + i] + i4);
                } else {
                    i5 = (short) (f28898[f28901 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f28901 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f28899);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f28900;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f28898;
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
