package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1762a;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.applovin.impl.u5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1787u5 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final b f3424g;

    /* JADX INFO: renamed from: h */
    private final String f3425h;

    /* JADX INFO: renamed from: i */
    private String f3426i;

    /* JADX INFO: renamed from: com.applovin.impl.u5$a */
    class a extends AbstractC1673o6 {
        a(C1762a c1762a, C1748l c1748l) {
            super(c1762a, c1748l);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3137a(String str, int i, String str2, String str3) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i);
            }
            C1787u5.this.f3424g.mo2058a(C1506b0.b.APPADSTXT_NOT_FOUND, C1787u5.this.f3426i);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3139a(String str, String str2, int i) {
            if (TextUtils.isEmpty(str2)) {
                if (C1768p.m5160a()) {
                    this.f1971c.m5174b(this.f1970b, "No app-ads.txt found");
                }
                C1787u5.this.f3424g.mo2058a(C1506b0.b.APPADSTXT_NOT_FOUND, C1787u5.this.f3426i);
            } else {
                if (C1768p.m5160a()) {
                    this.f1971c.m5171a(this.f1970b, "Found app-ads.txt");
                }
                C1787u5.this.f3424g.mo2060a(str2, C1787u5.this.f3426i);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.u5$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2058a(C1506b0.b bVar, String str);

        /* JADX INFO: renamed from: a */
        void mo2060a(String str, String str2);
    }

    public C1787u5(C1748l c1748l, String str, b bVar) {
        super("TaskFetchAppAdsContent", c1748l);
        this.f3425h = str;
        this.f3424g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f3425h).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || InneractiveMediationDefs.GENDER_MALE.equals(str)) {
                arrayList.remove(0);
            }
        }
        String strJoin = TextUtils.join(".", arrayList);
        Uri uriBuild = new Uri.Builder().scheme("https").authority(strJoin).appendPath("app-ads.txt").build();
        C1762a c1762aMo5043a = C1762a.m5013a(this.f1969a).mo5049c("GET").mo5045b(uriBuild.toString()).mo5039a(new Uri.Builder().scheme(ProxyConfig.MATCH_HTTP).authority(strJoin).appendPath("app-ads.txt").build().toString()).mo5038a((Object) "").mo5042a(false).mo5043a();
        this.f3426i = uriBuild.toString();
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Looking up app-ads.txt at " + this.f3426i);
        }
        this.f1969a.m4853s0().m2603a(new a(c1762aMo5043a, this.f1969a));
    }
}
