package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cp */
/* JADX INFO: loaded from: classes6.dex */
public final class C11878cp {

    /* JADX INFO: renamed from: ﭖ */
    private static char f28316 = 27586;

    /* JADX INFO: renamed from: ﮉ */
    private static int f28317 = 1;

    /* JADX INFO: renamed from: ﮌ */
    private static int f28318 = 0;

    /* JADX INFO: renamed from: ﮐ */
    private static char f28319 = 54886;

    /* JADX INFO: renamed from: ﱡ */
    private static char f28320 = 15687;

    /* JADX INFO: renamed from: ﻏ */
    private static char f28321 = 16288;

    /* JADX INFO: renamed from: ﱟ */
    private C11903dn f28322;

    /* JADX INFO: renamed from: ﺙ */
    private List<C11877co> f28323 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ */
    private C11897dh f28324;

    /* JADX INFO: renamed from: ﻛ */
    private AbstractC11840be f28325;

    /* JADX INFO: renamed from: ｋ */
    private C11891db f28326;

    /* JADX INFO: renamed from: ﾇ */
    private C11833ay f28327;

    /* JADX INFO: renamed from: ﾒ */
    private Context f28328;

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ List m29724(C11878cp c11878cp) {
        int i = 2 % 2;
        int i2 = f28318;
        int i3 = i2 + 73;
        f28317 = i3 % 128;
        int i4 = i3 % 2;
        List<C11877co> list = c11878cp.f28323;
        int i5 = i2 + 61;
        f28317 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public C11878cp(Context context, C11897dh c11897dh, C11833ay c11833ay, C11891db c11891db, AbstractC11840be abstractC11840be) {
        this.f28324 = c11897dh;
        this.f28327 = c11833ay;
        this.f28326 = c11891db;
        this.f28325 = abstractC11840be;
        this.f28328 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m29743() {
        int i = 2 % 2;
        int i2 = f28318 + 73;
        f28317 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<C11877co> it = this.f28323.iterator();
        int i4 = f28317 + 35;
        f28318 = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            it.next().m29664();
        }
        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C11878cp.m29724(C11878cp.this).clear();
            }
        });
    }

    /* JADX INFO: renamed from: ﾇ */
    private synchronized void m29728(C11903dn c11903dn) {
        int i = 2 % 2;
        if (c11903dn != null) {
            this.f28322 = c11903dn;
            int i2 = f28318 + 47;
            f28317 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        int i4 = f28317 + 81;
        f28318 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﭸ */
    private synchronized List<C11877co> m29722() {
        int i = 2 % 2;
        int i2 = f28317 + 33;
        f28318 = i2 % 128;
        int i3 = i2 % 2;
        if (this.f28323 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(this.f28323);
        int i4 = f28317 + 27;
        f28318 = i4 % 128;
        if (i4 % 2 == 0) {
            return arrayList;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m29741() {
        int i = 2 % 2;
        C11903dn c11903dnM29941 = this.f28324.m29941();
        Object obj = null;
        if (c11903dnM29941 != null) {
            m29729(c11903dnM29941);
            if (this.f28325.mo28829()) {
                int i2 = f28317 + 93;
                f28318 = i2 % 128;
                if (i2 % 2 != 0) {
                    C12067jp.m30716(c11903dnM29941);
                    super.hashCode();
                    throw null;
                }
                C12067jp.m30716(c11903dnM29941);
            }
        }
        this.f28324.m29940().m30053(m29723("鱱扗屹鄯ᒱ砮眮嚸矁晳咇ฉ", 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), this.f28325);
        Iterator<String> it = this.f28324.m29939().keySet().iterator();
        int i3 = f28317 + 69;
        f28318 = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = f28318 + 83;
            f28317 = i5 % 128;
            if (i5 % 2 == 0) {
                this.f28324.m29939().get(it.next()).m30023();
                super.hashCode();
                throw null;
            }
            C11901dl c11901dl = this.f28324.m29939().get(it.next());
            if (!c11901dl.m30023()) {
                m29727(new C11877co(this, this.f28326, this.f28325, m29725(c11901dl), this.f28324.m29940()));
            }
        }
        m29726(this.f28324, this.f28325);
    }

    /* JADX INFO: renamed from: ｋ */
    private C12017ht m29725(C11901dl c11901dl) {
        int i = 2 % 2;
        int i2 = f28317 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28318 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (c11901dl == null) {
            return null;
        }
        C12017ht c12017ht = new C12017ht(c11901dl, m29725(this.f28324.m29939().get(c11901dl.m30021())));
        int i3 = f28317 + 37;
        f28318 = i3 % 128;
        int i4 = i3 % 2;
        return c12017ht;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final String m29740() {
        int i = 2 % 2;
        int i2 = f28318 + 3;
        f28317 = i2 % 128;
        int i3 = i2 % 2;
        String strM29944 = this.f28324.m29944();
        int i4 = f28317 + 49;
        f28318 = i4 % 128;
        int i5 = i4 % 2;
        return strM29944;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final String m29739() {
        String strM29945;
        int i = 2 % 2;
        int i2 = f28317 + 17;
        f28318 = i2 % 128;
        if (i2 % 2 != 0) {
            strM29945 = this.f28324.m29945();
            int i3 = 37 / 0;
        } else {
            strM29945 = this.f28324.m29945();
        }
        int i4 = f28317 + 41;
        f28318 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM29945;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final String m29742() {
        int i = 2 % 2;
        int i2 = f28318 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28317 = i2 % 128;
        int i3 = i2 % 2;
        C11897dh c11897dh = this.f28324;
        if (i3 != 0) {
            return c11897dh.m29943();
        }
        c11897dh.m29943();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ */
    public final String m29737() {
        int i = 2 % 2;
        int i2 = f28317 + 45;
        f28318 = i2 % 128;
        int i3 = i2 % 2;
        AbstractC11840be abstractC11840be = this.f28325;
        if (i3 == 0) {
            return abstractC11840be.m28834();
        }
        abstractC11840be.m28834();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ */
    public final String m29736() {
        int i = 2 % 2;
        int i2 = f28318 + 105;
        f28317 = i2 % 128;
        int i3 = i2 % 2;
        AbstractC11840be abstractC11840be = this.f28325;
        if (i3 != 0) {
            return abstractC11840be.mo28831();
        }
        abstractC11840be.mo28831();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ */
    public final String m29738() {
        int i = 2 % 2;
        String strM29737 = m29737();
        if (!TextUtils.isEmpty(strM29737) && !m29723("ﵸ嚇껼쇍梴꼆祡텶", Color.red(0) + 7).intern().equals(strM29737)) {
            int i2 = f28318 + 77;
            f28317 = i2 % 128;
            int i3 = i2 % 2;
            if (!m29723("╒缞䅔ފ愓쳝᧿뢰", 8 - Color.red(0)).intern().equals(strM29737)) {
                String strM29947 = this.f28324.m29947(m29737());
                int i4 = f28318 + 41;
                f28317 = i4 % 128;
                if (i4 % 2 != 0) {
                    return strM29947;
                }
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﮐ */
    public final String m29734() {
        int i = 2 % 2;
        int i2 = f28317 + 107;
        f28318 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f28324.m29942();
            throw null;
        }
        String strM29942 = this.f28324.m29942();
        int i3 = f28318 + 33;
        f28317 = i3 % 128;
        int i4 = i3 % 2;
        return strM29942;
    }

    /* JADX INFO: renamed from: ﱟ */
    public final String m29735() {
        int i = 2 % 2;
        int i2 = f28318 + 97;
        f28317 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f28324.m29946();
            throw null;
        }
        String strM29946 = this.f28324.m29946();
        int i3 = f28317 + 69;
        f28318 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
        return strM29946;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m29744(String str, List<Object> list) {
        int i = 2 % 2;
        Iterator<C11877co> it = m29722().iterator();
        while (it.hasNext()) {
            int i2 = f28318 + 53;
            f28317 = i2 % 128;
            int i3 = i2 % 2;
            it.next().m29677(str, list);
        }
        int i4 = f28318 + 79;
        f28317 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﮌ */
    public final Context m29733() {
        int i = 2 % 2;
        int i2 = f28317;
        int i3 = i2 + 29;
        f28318 = i3 % 128;
        int i4 = i3 % 2;
        Context context = this.f28328;
        int i5 = i2 + 27;
        f28318 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return context;
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m29727(C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28318 + 39;
        f28317 = i2 % 128;
        int i3 = i2 % 2;
        this.f28323.add(c11877co);
        int i4 = f28318 + 113;
        f28317 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m29729(C11903dn c11903dn) {
        int i = 2 % 2;
        int i2 = f28318 + 35;
        f28317 = i2 % 128;
        int i3 = i2 % 2;
        m29728(c11903dn);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ */
    protected final synchronized C11903dn m29732() {
        int i = 2 % 2;
        int i2 = f28317 + 111;
        f28318 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return this.f28322;
    }

    /* JADX INFO: renamed from: ﭴ */
    public final C11833ay m29731() {
        int i = 2 % 2;
        int i2 = f28317;
        int i3 = i2 + 53;
        f28318 = i3 % 128;
        int i4 = i3 % 2;
        C11833ay c11833ay = this.f28327;
        int i5 = i2 + 35;
        f28318 = i5 % 128;
        int i6 = i5 % 2;
        return c11833ay;
    }

    /* JADX INFO: renamed from: ｋ */
    private synchronized void m29726(C11897dh c11897dh, AbstractC11840be abstractC11840be) {
        int i = 2 % 2;
        if (abstractC11840be.mo28821()) {
            int i2 = f28317 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f28318 = i2 % 128;
            int i3 = i2 % 2;
            for (C11877co c11877co : m29722()) {
                c11897dh.m29940().m30052().m30053(c11877co.m29679().m30353(), c11877co);
            }
        }
        int i4 = f28318 + 7;
        f28317 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﭖ */
    public final synchronized boolean m29730() {
        int i = 2 % 2;
        int i2 = f28317 + 23;
        f28318 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f28325.mo28821();
            throw null;
        }
        return this.f28325.mo28821();
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29723(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f28321)) ^ ((c2 >>> 5) + f28316)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f28319) ^ ((c3 + i2) ^ ((c3 << 4) + f28320))));
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
