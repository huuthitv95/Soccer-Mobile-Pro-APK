package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.e0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1536e0 extends AbstractCallableC1516c0 {

    /* JADX INFO: renamed from: f */
    private final String f1393f;

    /* JADX INFO: renamed from: g */
    private final AbstractC1736b f1394g;

    /* JADX INFO: renamed from: h */
    private final List f1395h;

    /* JADX INFO: renamed from: i */
    private final boolean f1396i;

    /* JADX INFO: renamed from: j */
    private final String f1397j;

    /* JADX INFO: renamed from: k */
    private final C1748l f1398k;

    /* JADX INFO: renamed from: l */
    private final a f1399l;

    /* JADX INFO: renamed from: com.applovin.impl.e0$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2339a(Uri uri);
    }

    public C1536e0(String str, AbstractC1736b abstractC1736b, List list, boolean z, String str2, C1748l c1748l, a aVar) {
        super("AsyncTaskCacheResource", c1748l);
        this.f1393f = str;
        this.f1394g = abstractC1736b;
        this.f1395h = list;
        this.f1396i = z;
        this.f1397j = str2;
        this.f1398k = c1748l;
        this.f1399l = aVar;
    }

    /* JADX INFO: renamed from: a */
    private void m2452a(Uri uri) {
        a aVar;
        if (this.f1230e.get() || (aVar = this.f1399l) == null) {
            return;
        }
        aVar.mo2339a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.f1230e.get()) {
            return Boolean.FALSE;
        }
        String strM4973a = this.f1398k.m4771I().m4973a(m2147a(), this.f1393f, this.f1394g.getCachePrefix(), this.f1395h, this.f1396i, this.f1398k.m4771I().m4970a(this.f1393f, this.f1394g), this.f1397j, AbstractC1568h2.m2787a((AppLovinAdImpl) this.f1394g));
        if (TextUtils.isEmpty(strM4973a)) {
            m2452a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f1230e.get()) {
            return Boolean.FALSE;
        }
        File fileM4971a = this.f1398k.m4771I().m4971a(strM4973a, m2147a());
        if (fileM4971a == null) {
            if (C1768p.m5160a()) {
                this.f1228c.m5174b(this.f1227b, "Unable to retrieve File for cached filename = " + strM4973a);
            }
            m2452a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f1230e.get()) {
            return Boolean.FALSE;
        }
        Uri uriFromFile = Uri.fromFile(fileM4971a);
        if (uriFromFile == null) {
            if (C1768p.m5160a()) {
                this.f1228c.m5174b(this.f1227b, "Unable to extract Uri from file");
            }
            m2452a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f1230e.get()) {
            return Boolean.FALSE;
        }
        m2452a(uriFromFile);
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f1393f.equals(((C1536e0) obj).f1393f);
    }

    public int hashCode() {
        String str = this.f1393f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
