package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* JADX INFO: renamed from: com.applovin.impl.v3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1794v3 {

    /* JADX INFO: renamed from: a */
    private a f3461a;

    /* JADX INFO: renamed from: b */
    private String f3462b;

    /* JADX INFO: renamed from: com.applovin.impl.v3$a */
    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    protected C1794v3(a aVar, String str) {
        this.f3461a = aVar;
        this.f3462b = str;
    }

    /* JADX INFO: renamed from: a */
    public static C1794v3 m5459a(AbstractC1482a3 abstractC1482a3) {
        String strM1833T = abstractC1482a3.m1833T();
        MaxAdFormat format = abstractC1482a3.getFormat();
        if (TextUtils.isEmpty(strM1833T) || format == null) {
            return null;
        }
        return new C1717s3(new C1609l3(strM1833T, format));
    }

    /* JADX INFO: renamed from: a */
    public static C1794v3 m5460a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new C1794v3(a.AD_FORMAT, label);
    }

    /* JADX INFO: renamed from: a */
    public static C1794v3 m5461a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new C1794v3(a.AD_UNIT_ID, str);
    }

    /* JADX INFO: renamed from: a */
    public a m5462a() {
        return this.f3461a;
    }

    /* JADX INFO: renamed from: b */
    public String m5463b() {
        return this.f3462b;
    }
}
