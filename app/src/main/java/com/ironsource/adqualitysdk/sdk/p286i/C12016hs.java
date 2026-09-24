package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hs */
/* JADX INFO: loaded from: classes6.dex */
public class C12016hs extends AbstractC12012ho {

    /* JADX INFO: renamed from: ﮐ */
    private boolean f29213;

    /* JADX INFO: renamed from: ﱟ */
    private int f29214;

    /* JADX INFO: renamed from: ﱡ */
    private List<Class> f29215 = new ArrayList();

    /* JADX INFO: renamed from: ﺙ */
    private List<Class> f29216;

    /* JADX INFO: renamed from: ﻏ */
    private Class f29217;

    /* JADX INFO: renamed from: ﾇ */
    private int f29218;

    public C12016hs() {
        mo30282();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12012ho
    /* JADX INFO: renamed from: ﾒ */
    protected final void mo30282() {
        super.mo30282();
        this.f29217 = null;
        this.f29218 = 0;
        this.f29213 = true;
        this.f29215.clear();
        this.f29216 = null;
        this.f29214 = -1;
    }

    /* JADX INFO: renamed from: ﮐ */
    public final Class m30327() {
        return this.f29217;
    }

    /* JADX INFO: renamed from: ﻏ */
    public final int m30331() {
        return this.f29218;
    }

    /* JADX INFO: renamed from: ﱟ */
    public final boolean m30328() {
        return this.f29213;
    }

    /* JADX INFO: renamed from: ﺙ */
    public final List<Class> m30330() {
        return this.f29215;
    }

    /* JADX INFO: renamed from: ﱡ */
    public final List<Class> m30329() {
        return this.f29216;
    }

    /* JADX INFO: renamed from: ﮉ */
    public final int m30326() {
        return this.f29214;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hs$e */
    public static class e extends AbstractC12012ho.b implements InterfaceC11870ch {

        /* JADX INFO: renamed from: ﱟ */
        private static int f29219 = 0;

        /* JADX INFO: renamed from: ﱡ */
        private static char f29220 = 55939;

        /* JADX INFO: renamed from: ﺙ */
        private static int f29221 = 1;

        /* JADX INFO: renamed from: ﻐ */
        private static char f29222 = 16609;

        /* JADX INFO: renamed from: ﻛ */
        private static long f29223 = 4954593078587967919L;

        /* JADX INFO: renamed from: ﾇ */
        private static char f29224 = 31303;

        /* JADX INFO: renamed from: ﾒ */
        private static char f29225 = 12638;

        /* JADX INFO: renamed from: ｋ */
        private C12016hs f29226 = new C12016hs();

        /* JADX INFO: renamed from: ﾇ */
        private e m30341(Class cls) {
            int i = 2 % 2;
            int i2 = f29221 + 65;
            f29219 = i2 % 128;
            int i3 = i2 % 2;
            this.f29226.f29217 = cls;
            int i4 = f29221 + 5;
            f29219 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ */
        private e m30332(int i) {
            int i2 = 2 % 2;
            int i3 = f29219 + 57;
            f29221 = i3 % 128;
            int i4 = i3 % 2;
            this.f29226.f29218 = i;
            int i5 = f29221 + 13;
            f29219 = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ */
        private e m30338(boolean z) {
            int i = 2 % 2;
            int i2 = f29219 + 11;
            f29221 = i2 % 128;
            int i3 = i2 % 2;
            this.f29226.f29213 = z;
            int i4 = f29219 + 21;
            f29221 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 42 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾒ */
        private e m30342(int i) {
            C12016hs c12016hs;
            int i2;
            int i3 = 2 % 2;
            int i4 = f29219 + 13;
            f29221 = i4 % 128;
            if (i4 % 2 == 0) {
                c12016hs = this.f29226;
                i2 = i ^ c12016hs.f29188;
            } else {
                c12016hs = this.f29226;
                i2 = i | c12016hs.f29188;
            }
            c12016hs.f29188 = i2;
            return this;
        }

        /* JADX INFO: renamed from: ｋ */
        private e m30337(int i) {
            C12016hs c12016hs;
            int i2;
            int i3 = 2 % 2;
            int i4 = f29221 + 69;
            f29219 = i4 % 128;
            if (i4 % 2 != 0) {
                c12016hs = this.f29226;
                i2 = i ^ c12016hs.f29191;
            } else {
                c12016hs = this.f29226;
                i2 = i | c12016hs.f29191;
            }
            c12016hs.f29191 = i2;
            int i5 = f29219 + 99;
            f29221 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ */
        private e m30333(boolean z, int i) {
            int i2 = 2 % 2;
            int i3 = f29221 + 27;
            f29219 = i3 % 128;
            int i4 = i3 % 2;
            this.f29226.f29190 = z;
            this.f29226.f29189 = i;
            int i5 = f29219 + 21;
            f29221 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 57 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻛ */
        private e m30335(Class cls) {
            int i = 2 % 2;
            int i2 = f29219 + 41;
            f29221 = i2 % 128;
            int i3 = i2 % 2;
            this.f29226.f29215.add(cls);
            int i4 = f29221 + 53;
            f29219 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 12 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾒ */
        private e m30343(List<Class> list) {
            int i = 2 % 2;
            int i2 = f29221 + 101;
            f29219 = i2 % 128;
            int i3 = i2 % 2;
            this.f29226.f29216 = list;
            int i4 = f29219 + 3;
            f29221 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ */
        private e m30340(int i) {
            int i2 = 2 % 2;
            int i3 = f29219 + 7;
            f29221 = i3 % 128;
            int i4 = i3 % 2;
            this.f29226.f29214 = i;
            int i5 = f29219 + 11;
            f29221 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ */
        private e m30339() {
            int i = 2 % 2;
            int i2 = f29219 + 101;
            f29221 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f29226.mo30282();
                return this;
            }
            this.f29226.mo30282();
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ */
        private C12016hs m30336() {
            int i = 2 % 2;
            int i2 = f29221 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            int i3 = i2 % 128;
            f29219 = i3;
            int i4 = i2 % 2;
            C12016hs c12016hs = this.f29226;
            int i5 = i3 + 15;
            f29221 = i5 % 128;
            if (i5 % 2 != 0) {
                return c12016hs;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0093  */
        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11870ch
        /* JADX INFO: renamed from: ﻐ */
        public final Object mo28830(String str, List<Object> list, InterfaceC11874cl interfaceC11874cl) {
            int i = 2 % 2;
            while (true) {
                int i2 = 3;
                i2 = -1;
                switch (str.hashCode()) {
                    case -2020212392:
                        if (str.equals(m30334("憦䵺\ue00a旓懇ұ猰뢌䝿㵥婥晨Ⲱ\uda09¥伦ᗷ\uf0cd\ue7f7㓛בּꦋ츫ቜꁯ", (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern())) {
                            i2 = 8;
                        }
                        break;
                    case -600792781:
                        if (str.equals(m30334("ᐸ譆⽏ﯘᑋ슂뱸⚥㋉רּ锡\uf879夯ᰅ쿪", 1 - View.combineMeasuredStates(0, 0)).intern())) {
                            int i3 = f29219 + 59;
                            f29221 = i3 % 128;
                            if (i3 % 2 == 0) {
                                i2 = 5;
                            }
                        }
                        break;
                    case 94094958:
                        if (str.equals(m30334("靂̤릋ދ霠䫾⪼\udaea놚", -ExpandableListView.getPackedPositionChild(0L)).intern())) {
                            i2 = 10;
                        }
                        break;
                    case 108404047:
                        if (str.equals(m30334("\ud995\u0ac6법⎌\ud9e7䌌⾸ﻤ｝", TextUtils.getTrimmedLength("") + 1).intern())) {
                            i2 = 9;
                        }
                        break;
                    case 132643084:
                        if (str.equals(m30344("袑彀섋ꘅ쏪퐄\ud8a1ੋ\uf388⏃뺌礻\uaad8븭\u0897\uef4a扝픷ऑ直ҋ쮭", (ViewConfiguration.getWindowTouchSlop() >> 8) + 21).intern())) {
                            int i4 = f29221 + 7;
                            f29219 = i4 % 128;
                            if (i4 % 2 == 0) {
                                i2 = 2;
                            }
                        }
                        break;
                    case 200590504:
                        if (str.equals(m30334("골⹐丸挩겛枚\udd07빖訷幓\uf464悏\ue1e2뤲꺖䧍\ud8bf鏇䧸㈍㙬쪺怄ᒺ洐╲ᭂﷵ", 1 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                            int i5 = f29219 + 7;
                            f29221 = i5 % 128;
                            int i6 = i5 % 2;
                            i2 = 4;
                        }
                        break;
                    case 387034026:
                        if (str.equals(m30334("揽浩㼞\uabef掎⒣갡皐䔢ᵪ蕍ꡈ⻖層\udfb8脏ុ탩㣠𢡊量覅", 1 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                            i2 = 7;
                        }
                        break;
                    case 391966482:
                        if (str.equals(m30344("᳒枿쩍䇐ᄺ쌢ᣖꑮ噗咊絝旖ᯍ豻봡ㆉ鶞槔ꉏज़\u0378b", 21 - Color.red(0)).intern())) {
                            i2 = 5;
                        }
                        break;
                    case 393987200:
                        if (str.equals(m30334("⡟뇂錧⮣⠬\uf808\r\uf6fcຆ쇝⥈⠘敉⚱玈Ŗ導\u0c75铚窤닆唳봍", 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                            int i7 = f29219 + 13;
                            f29221 = i7 % 128;
                            int i8 = i7 % 2;
                            i2 = 0;
                        }
                        break;
                    case 1423210564:
                        if (str.equals(m30334("曮큌爉\uf5fe暏馇\ue133⢾䀽ꁃ졺\uf651⯿䜎銭\udf08\u128e淀痞\ua4c7ﱽ㒿尲艧ꜧ", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                            int i9 = f29219;
                            int i10 = i9 + 27;
                            f29221 = i10 % 128;
                            int i11 = i10 % 2;
                            int i12 = i9 + 15;
                            f29221 = i12 % 128;
                            int i13 = i12 % 2;
                            i2 = 6;
                        }
                        break;
                    case 1773646829:
                        if (str.equals(m30344("袑彀ኦＥ\uaad8븭\u0897\uef4a扝픷ऑ直\udf96㜞쟒䢥匎벎", 18 - TextUtils.indexOf("", "")).intern())) {
                            i2 = 1;
                        }
                        break;
                    default:
                        break;
                }
                switch (i2) {
                    case 0:
                        return m30341((Class) m29851(list, 0, Class.class));
                    case 1:
                        return m30343((List<Class>) m29851(list, 0, List.class));
                    case 2:
                        return m30340(((Integer) m29851(list, 0, Integer.class)).intValue());
                    case 3:
                        return m30332(((Integer) m29851(list, 0, Integer.class)).intValue());
                    case 4:
                        return m30338(((Boolean) m29851(list, 0, Boolean.class)).booleanValue());
                    case 5:
                        return m30342(((Integer) m29851(list, 0, Integer.class)).intValue());
                    case 6:
                        return m30337(((Integer) m29851(list, 0, Integer.class)).intValue());
                    case 7:
                        return m30333(((Boolean) m29851(list, 0, Boolean.class)).booleanValue(), list.size() > 1 ? ((Integer) m29851(list, 1, Integer.class)).intValue() : -1);
                    case 8:
                        return m30335((Class) m29851(list, 0, Class.class));
                    case 9:
                        return m30339();
                    case 10:
                        return m30336();
                    default:
                        break;
                }
            }
        }

        /* JADX INFO: renamed from: ﻐ */
        private static String m30334(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C11943f.f28848) {
                char[] cArrM30189 = C11943f.m30189(f29223, cArr, i);
                C11943f.f28846 = 4;
                while (C11943f.f28846 < cArrM30189.length) {
                    C11943f.f28847 = C11943f.f28846 - 4;
                    cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f29223));
                    C11943f.f28846++;
                }
                str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾒ */
        private static String m30344(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C12078k.f29776) {
                char[] cArr2 = new char[cArr.length];
                C12078k.f29775 = 0;
                char[] cArr3 = new char[2];
                while (C12078k.f29775 < cArr.length) {
                    cArr3[0] = cArr[C12078k.f29775];
                    cArr3[1] = cArr[C12078k.f29775 + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f29224)) ^ ((c2 >>> 5) + f29220)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f29222) ^ ((c3 + i2) ^ ((c3 << 4) + f29225))));
                        i2 -= 40503;
                    }
                    cArr2[C12078k.f29775] = cArr3[0];
                    cArr2[C12078k.f29775 + 1] = cArr3[1];
                    C12078k.f29775 += 2;
                }
                str2 = new String(cArr2, 0, i);
            }
            return str2;
        }
    }
}
