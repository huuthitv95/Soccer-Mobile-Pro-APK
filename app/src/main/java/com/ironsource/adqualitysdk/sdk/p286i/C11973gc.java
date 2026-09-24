package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gc */
/* JADX INFO: loaded from: classes6.dex */
public final class C11973gc extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28976 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static int f28977 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static long f28978 = -2965515626901348173L;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f28976 + 89;
        f28977 = i2 % 128;
        return m30221("ꕍ糱ꔮ鰭\u0b7b컗쩰泠⟨ῼ伦\uea5cꂦ髕췰椔ⵊᖃ䊟\ue4cb긙靣잘揿⣝ሷ䑭ﺻ뗶跮\ud93e簘㚪࣒忪ﭔ덤讐\udcd2盀㰲Ձ农\uf5e0뻖耿홤炢㯘ϳ欰蹦蒴细\ue9f4", i2 % 2 == 0 ? 1 >> ExpandableListView.getPackedPositionGroup(0L) : 1 - ExpandableListView.getPackedPositionGroup(0L)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        Class<IronSourceAdQuality> cls;
        int i = 2 % 2;
        int i2 = f28977;
        int i3 = i2 + 93;
        f28976 = i3 % 128;
        if (i3 % 2 != 0) {
            cls = IronSourceAdQuality.class;
            int i4 = 58 / 0;
        } else {
            cls = IronSourceAdQuality.class;
        }
        int i5 = i2 + 71;
        f28976 = i5 % 128;
        if (i5 % 2 == 0) {
            return cls;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11842bg c11842bg = new C11842bg(mo30209());
        int i2 = f28977 + 101;
        f28976 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
        }
        return c11842bg;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f28977 + 69;
        f28976 = i2 % 128;
        return (i2 % 2 != 0 ? m30221("ザ뻭プ帺鶼헖岫瞺눛\uddfe\ud9e7\uf147㕗壕嬪爆뢠힟퐒", 1 % (ViewConfiguration.getFadingEdgeLength() % 59)) : m30221("ザ뻭プ帺鶼헖岫瞺눛\uddfe\ud9e7\uf147㕗壕嬪爆뢠힟퐒", (ViewConfiguration.getFadingEdgeLength() >> 16) + 1)).intern();
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30221(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f28978, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28978));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
