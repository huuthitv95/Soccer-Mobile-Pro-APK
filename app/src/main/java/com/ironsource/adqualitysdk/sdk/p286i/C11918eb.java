package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.exoplayer2.C9415C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.eb */
/* JADX INFO: loaded from: classes6.dex */
public class C11918eb extends AbstractC11919ec {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28756 = 0;

    /* JADX INFO: renamed from: ﱟ */
    private static int f28757 = 1;

    /* JADX INFO: renamed from: ﺙ */
    private static boolean f28758 = true;

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f28759 = {'y', '|', 't', '`', '_', 'Y', Typography.less, '5', '6'};

    /* JADX INFO: renamed from: ｋ */
    private static int f28760 = 13;

    /* JADX INFO: renamed from: ﾒ */
    private static boolean f28761 = true;

    /* JADX INFO: renamed from: ﻐ */
    private String f28762;

    /* JADX INFO: renamed from: ﾇ */
    private AbstractC11919ec[] f28763;

    public C11918eb(String str, List<AbstractC11919ec> list, C11904do c11904do) {
        super(c11904do);
        this.f28762 = C11914dy.m30142(str);
        AbstractC11919ec[] abstractC11919ecArr = new AbstractC11919ec[list.size()];
        this.f28763 = abstractC11919ecArr;
        list.toArray(abstractC11919ecArr);
    }

    /* JADX INFO: renamed from: ﾒ */
    final String m30151() {
        int i = 2 % 2;
        int i2 = f28756 + 77;
        int i3 = i2 % 128;
        f28757 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f28762;
        int i4 = i3 + 109;
        f28756 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ */
    final AbstractC11919ec[] m30150() {
        int i = 2 % 2;
        int i2 = f28756 + 79;
        int i3 = i2 % 128;
        f28757 = i3;
        int i4 = i2 % 2;
        AbstractC11919ec[] abstractC11919ecArr = this.f28763;
        int i5 = i3 + 87;
        f28756 = i5 % 128;
        int i6 = i5 % 2;
        return abstractC11919ecArr;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28756 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f28757 = i2 % 128;
        int i3 = i2 % 2;
        List<Object> listM30148 = m30148(c11907dr, c11877co);
        if (m30151().equals(m30147(null, View.combineMeasuredStates(0, 0) + 127, null, "\u0083\u0082\u0081").intern())) {
            StringBuilder sb = new StringBuilder();
            sb.append(m30147(null, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, null, "\u0087\u0086\u0085\u0084").intern());
            sb.append(c11877co.m29666());
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(listM30148.get(0));
            C12085l.m30929(string, sb2.toString());
            return new C11908ds(null);
        }
        try {
            return new C11908ds(((C11906dq) c11907dr.m30055(m30151())).m30048(c11907dr, c11877co, listM30148));
        } catch (Exception unused) {
            if (c11877co.m29679().m30354(m30151()) == null) {
                C11891db c11891dbM29668 = c11877co.m29668();
                String strM30151 = m30151();
                c11877co.m29665();
                return new C11908ds(c11891dbM29668.mo29560(c11877co, strM30151, listM30148, c11907dr));
            }
            C11908ds c11908dsM30061 = c11877co.m29679().m30354(m30151()).m30048(c11907dr, c11877co, listM30148).m30061(false);
            int i4 = f28756 + 59;
            f28757 = i4 % 128;
            if (i4 % 2 != 0) {
                return c11908dsM30061;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    final List<Object> m30148(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (AbstractC11919ec abstractC11919ec : this.f28763) {
            int i2 = f28756 + 33;
            f28757 = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(abstractC11919ec.m30156(c11907dr, c11877co).m30066());
        }
        int i4 = f28756 + 37;
        f28757 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return arrayList;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = f28757 + 5;
        f28756 = i2 % 128;
        int i3 = i2 % 2;
        String strMo30149 = mo30149(this.f28763);
        int i4 = f28756 + 97;
        f28757 = i4 % 128;
        if (i4 % 2 != 0) {
            return strMo30149;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    String mo30149(Object[] objArr) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28762);
        Object obj = null;
        sb.append(m30147(null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, null, "\u0088").intern());
        sb.append(m30152(objArr));
        sb.append(m30147(null, 127 - KeyEvent.getDeadChar(0, 0), null, "\u0089").intern());
        String string = sb.toString();
        int i2 = f28757 + 15;
        f28756 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        super.hashCode();
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f28756 + 71;
        f28757 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            super.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            int i3 = f28756 + 5;
            f28757 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        C11918eb c11918eb = (C11918eb) obj;
        if (!this.f28762.equals(c11918eb.f28762)) {
            return false;
        }
        return Arrays.equals(this.f28763, c11918eb.f28763);
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.f28762;
        if (str != null) {
            int i2 = f28757 + 115;
            f28756 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = str.hashCode();
        } else {
            int i4 = f28756 + 11;
            f28757 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        return (iHashCode * 31) + Arrays.hashCode(this.f28763);
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30147(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f28759;
            int i2 = f28760;
            if (f28758) {
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
            if (f28761) {
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
