package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gl */
/* JADX INFO: loaded from: classes6.dex */
public final class C11982gl extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻛ */
    private static int f29023 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static int f29024 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static long f29025 = -4128206949596736358L;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f29023 + 21;
        f29024 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30233("셞섽郏䐺戯쭶驛\ue7bb鍐랴よ䨈旼\ue98b蔛뢫㘈學歨\uef3c袝躁㧋嵃崳\ue043踹菩⽅叫岷\uf61d臲藘℈⒓剿\uf779\uf72c謜⒘⫣䗏寧勞鰆⩆\u2fec䭐쾸\uf89b鉹ᷳ⇔䴌삔\uee71鍈፸", ViewConfiguration.getWindowTouchSlop() >> 8).intern();
        int i4 = f29024 + 103;
        f29023 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29024 + 95;
        int i3 = i2 % 128;
        f29023 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 41;
        f29024 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return InneractiveAdManager.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11855bt c11855bt = new C11855bt(mo30209());
        int i2 = f29023 + 43;
        f29024 = i2 % 128;
        int i3 = i2 % 2;
        return c11855bt;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29024 + 87;
        f29023 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30233("㉣㈊䏥霑⿵蚯臻ﱐ恹撆結冹雚㫹죎", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern();
        int i4 = f29024 + 71;
        f29023 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30233(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f29025, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f29025));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
