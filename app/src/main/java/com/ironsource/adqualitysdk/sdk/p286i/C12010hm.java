package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hm */
/* JADX INFO: loaded from: classes6.dex */
public class C12010hm extends AbstractC12012ho {

    /* JADX INFO: renamed from: ﮐ */
    private int f29177;

    /* JADX INFO: renamed from: ﱟ */
    private boolean f29178;

    /* JADX INFO: renamed from: ﱡ */
    private List<Class> f29179 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ */
    private Class f29180;

    public C12010hm() {
        super.mo30282();
        this.f29180 = null;
        this.f29177 = 0;
        this.f29178 = true;
        this.f29179.clear();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12012ho
    /* JADX INFO: renamed from: ﾒ */
    protected final void mo30282() {
        super.mo30282();
        this.f29180 = null;
        this.f29177 = 0;
        this.f29178 = true;
        this.f29179.clear();
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m30283(Class cls) {
        this.f29180 = cls;
    }

    /* JADX INFO: renamed from: ﺙ */
    public final Class m30280() {
        return this.f29180;
    }

    /* JADX INFO: renamed from: ﮐ */
    public final int m30278() {
        return this.f29177;
    }

    /* JADX INFO: renamed from: ﱡ */
    public final boolean m30279() {
        return this.f29178;
    }

    /* JADX INFO: renamed from: ﻏ */
    public final List<Class> m30281() {
        return this.f29179;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hm$c */
    public static class c extends AbstractC12012ho.b implements InterfaceC11870ch {

        /* JADX INFO: renamed from: ﮐ */
        private static int f29181 = 1;

        /* JADX INFO: renamed from: ﺙ */
        private static int f29182 = 0;

        /* JADX INFO: renamed from: ﻐ */
        private static char f29183 = 28237;

        /* JADX INFO: renamed from: ﻛ */
        private static char f29184 = 35185;

        /* JADX INFO: renamed from: ｋ */
        private static char f29185 = 21527;

        /* JADX INFO: renamed from: ﾒ */
        private static char f29186 = 59228;

        /* JADX INFO: renamed from: ﾇ */
        private C12010hm f29187 = new C12010hm();

        /* JADX INFO: renamed from: ﻛ */
        public final c m30291(Class cls) {
            int i = 2 % 2;
            int i2 = f29182 + 19;
            f29181 = i2 % 128;
            int i3 = i2 % 2;
            this.f29187.f29180 = cls;
            int i4 = f29182 + 71;
            f29181 = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ */
        private c m30284(int i) {
            int i2 = 2 % 2;
            int i3 = f29181 + 43;
            f29182 = i3 % 128;
            if (i3 % 2 == 0) {
                this.f29187.f29177 = i;
                return this;
            }
            this.f29187.f29177 = i;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ｋ */
        private c m30287(boolean z) {
            int i = 2 % 2;
            int i2 = f29182 + 95;
            f29181 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f29187.f29178 = z;
                int i3 = 45 / 0;
                return this;
            }
            this.f29187.f29178 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ */
        public final c m30292(int i) {
            C12010hm c12010hm;
            int i2;
            int i3 = 2 % 2;
            int i4 = f29182 + 49;
            f29181 = i4 % 128;
            if (i4 % 2 == 0) {
                c12010hm = this.f29187;
                i2 = i ^ c12010hm.f29188;
            } else {
                c12010hm = this.f29187;
                i2 = i | c12010hm.f29188;
            }
            c12010hm.f29188 = i2;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ */
        public final c m30290(int i) {
            int i2 = 2 % 2;
            int i3 = f29182 + 85;
            f29181 = i3 % 128;
            int i4 = i3 % 2;
            C12010hm c12010hm = this.f29187;
            c12010hm.f29191 = i | c12010hm.f29191;
            int i5 = f29181 + 25;
            f29182 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 15 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ｋ */
        private c m30288(boolean z, int i) {
            int i2 = 2 % 2;
            int i3 = f29181 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f29182 = i3 % 128;
            int i4 = i3 % 2;
            this.f29187.f29190 = z;
            this.f29187.f29189 = i;
            int i5 = f29182 + 1;
            f29181 = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ */
        private c m30286(Class cls) {
            int i = 2 % 2;
            int i2 = f29181 + 53;
            f29182 = i2 % 128;
            int i3 = i2 % 2;
            this.f29187.f29179.add(cls);
            int i4 = f29182 + 107;
            f29181 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ｋ */
        private c m30285() {
            int i = 2 % 2;
            int i2 = f29181 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f29182 = i2 % 128;
            int i3 = i2 % 2;
            this.f29187.mo30282();
            int i4 = f29182 + 49;
            f29181 = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ */
        public final C12010hm m30293() {
            int i = 2 % 2;
            int i2 = f29182 + 69;
            f29181 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.f29187;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11870ch
        /* JADX INFO: renamed from: ﻐ */
        public final Object mo28830(String str, List<Object> list, InterfaceC11874cl interfaceC11874cl) {
            int i = 2 % 2;
            int i2 = f29181 + 89;
            f29182 = i2 % 128;
            if (i2 % 2 != 0) {
                str.hashCode();
                throw null;
            }
            byte b = 6;
            int iIntValue = -1;
            switch (str.hashCode()) {
                case -1347544616:
                    if (!str.equals(m30289("蟿ﾺ椧ぴ瞧箁ᡸ쐒瓕픽⛓ꛮ뭘苂↗﨧医䲵", 19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        int i3 = f29181 + 35;
                        f29182 = i3 % 128;
                        int i4 = i3 % 2;
                    }
                    break;
                case -923635536:
                    b = !str.equals(m30289("蟿ﾺ꧔\ue1b3\uf055Ϡ욤䔒詻ϟ铌\ueddd埈쌭", TextUtils.getTrimmedLength("") + 13).intern()) ? (byte) -1 : (byte) 0;
                    break;
                case -216533736:
                    b = !str.equals(m30289("ꗌℾ켛钄Ｄ\ueade挜鸳퇆㚙", 10 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()) ? (byte) -1 : (byte) 1;
                    break;
                case 94094958:
                    b = !str.equals(m30289("襣\uf6e6\ud8af땥埈쌭", 5 - View.combineMeasuredStates(0, 0)).intern()) ? (byte) -1 : (byte) 8;
                    break;
                case 108404047:
                    if (!str.equals(m30289("\ue5c2恄蟿ﾺ鋬ы", TextUtils.indexOf((CharSequence) "", '0', 0) + 6).intern())) {
                        b = -1;
                    } else {
                        int i5 = f29182 + 115;
                        f29181 = i5 % 128;
                        b = i5 % 2 != 0 ? (byte) 7 : Base64.padSymbol;
                    }
                    break;
                case 387034026:
                    b = !str.equals(m30289("蟿ﾺ椧ぴ瞧箁쓀Ⓧ稊싲医䲵蟵촑段븪攓ꊀ", KeyEvent.keyCodeFromString("") + 18).intern()) ? (byte) -1 : (byte) 5;
                    break;
                case 391966482:
                    if (!str.equals(m30289("侥鞟炅\uee2d\ueb49瑲㫨䰗爵⫞᭙︧噫檹쓀Ⓧ\ue2f0킒⒮ȹ\u0b78䎳", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20).intern())) {
                        b = -1;
                    } else {
                        int i6 = f29182 + 77;
                        f29181 = i6 % 128;
                        b = i6 % 2 != 0 ? (byte) 3 : (byte) 2;
                    }
                    break;
                case 1067445448:
                    if (!str.equals(m30289("侥鞟衲Ꭿ\uf055Ϡ욤䔒瘻鎵픹뒲僑\uee14\u0b78䎳", 14 - ImageFormat.getBitsPerPixel(0)).intern())) {
                        b = -1;
                    } else {
                        int i7 = f29181 + 115;
                        f29182 = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    break;
                case 1423210564:
                    if (!str.equals(m30289("侥鞟炅\uee2d\ueb49瑲㫨䰗爵⫞᭙︧噫檹Ծ⛿\ue2f0킒⒮ȹ\u0b78䎳", (Process.myTid() >> 22) + 21).intern())) {
                        b = -1;
                    } else {
                        int i9 = f29181 + 51;
                        f29182 = i9 % 128;
                        int i10 = i9 % 2;
                        b = 4;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    return m30291((Class) m29851(list, 0, Class.class));
                case 1:
                    return m30284(((Integer) m29851(list, 0, Integer.class)).intValue());
                case 2:
                    c cVarM30287 = m30287(((Boolean) m29851(list, 0, Boolean.class)).booleanValue());
                    int i11 = f29181 + 51;
                    f29182 = i11 % 128;
                    if (i11 % 2 == 0) {
                        return cVarM30287;
                    }
                    throw null;
                case 3:
                    return m30292(((Integer) m29851(list, 0, Integer.class)).intValue());
                case 4:
                    return m30290(((Integer) m29851(list, 0, Integer.class)).intValue());
                case 5:
                    boolean zBooleanValue = ((Boolean) m29851(list, 0, Boolean.class)).booleanValue();
                    if (list.size() > 1) {
                        int i12 = f29182 + 51;
                        f29181 = i12 % 128;
                        int i13 = i12 % 2;
                        iIntValue = ((Integer) m29851(list, 1, Integer.class)).intValue();
                        int i14 = f29181 + 53;
                        f29182 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    return m30288(zBooleanValue, iIntValue);
                case 6:
                    return m30286((Class) m29851(list, 0, Class.class));
                case 7:
                    return m30285();
                case 8:
                    return m30293();
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ﾇ */
        private static String m30289(String str, int i) {
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
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f29185)) ^ ((c2 >>> 5) + f29184)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f29183) ^ ((c3 + i2) ^ ((c3 << 4) + f29186))));
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
