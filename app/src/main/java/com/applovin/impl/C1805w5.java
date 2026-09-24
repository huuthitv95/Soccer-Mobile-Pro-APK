package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1762a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.applovin.impl.w5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1805w5 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final b f3522g;

    /* JADX INFO: renamed from: com.applovin.impl.w5$a */
    class a extends AbstractC1673o6 {
        a(C1762a c1762a, C1748l c1748l) {
            super(c1762a, c1748l);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3137a(String str, int i, String str2, String str3) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i);
            }
            C1805w5.this.f3522g.mo2057a(C1506b0.b.APP_DETAILS_NOT_FOUND);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3139a(String str, String str2, int i) {
            if (TextUtils.isEmpty(str2)) {
                if (C1768p.m5160a()) {
                    this.f1971c.m5174b(this.f1970b, "No developer URI found - response from the Play Store is empty");
                }
                C1805w5.this.f3522g.mo2057a(C1506b0.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (C1768p.m5160a()) {
                    this.f1971c.m5174b(this.f1970b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                C1805w5.this.f3522g.mo2057a(C1506b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            String strGroup = matcher.group();
            if (URLUtil.isValidUrl(strGroup)) {
                if (C1768p.m5160a()) {
                    this.f1971c.m5171a(this.f1970b, "Found developer URI: " + strGroup);
                }
                C1805w5.this.f3522g.mo2059a(strGroup);
                return;
            }
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Developer URI (" + strGroup + ") is not valid");
            }
            C1805w5.this.f3522g.mo2057a(C1506b0.b.INVALID_DEVELOPER_URI);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.w5$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2057a(C1506b0.b bVar);

        /* JADX INFO: renamed from: a */
        void mo2059a(String str);
    }

    public C1805w5(C1748l c1748l, b bVar) {
        super("TaskFetchDeveloperUri", c1748l);
        this.f3522g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strValueOf = String.valueOf(this.f1969a.m4759B().m4933G().get("package_name"));
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Looking up developer URI for package name: " + strValueOf);
        }
        this.f1969a.m4853s0().m2603a(new a(C1762a.m5013a(this.f1969a).mo5049c("GET").mo5045b("https://play.google.com/store/apps/details?id=" + strValueOf).mo5038a((Object) "").mo5042a(false).mo5043a(), this.f1969a));
    }
}
