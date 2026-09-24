package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1762a;
import com.applovin.impl.sdk.network.C1766e;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.s5 */
/* JADX INFO: loaded from: classes9.dex */
public class C1719s5 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final C1766e f2795g;

    /* JADX INFO: renamed from: h */
    private final AppLovinPostbackListener f2796h;

    /* JADX INFO: renamed from: i */
    private final C1552f6.b f2797i;

    /* JADX INFO: renamed from: com.applovin.impl.s5$a */
    /* JADX INFO: loaded from: classes3.dex */
    class a implements AppLovinPostbackListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i) {
            C1719s5.this.m4346e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (C1719s5.this.f2796h != null) {
                C1719s5.this.f2796h.onPostbackSuccess(C1719s5.this.f2795g.m5023f());
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.s5$b */
    /* JADX INFO: loaded from: classes3.dex */
    class b extends AbstractC1673o6 {

        /* JADX INFO: renamed from: n */
        final String f2799n;

        b(C1762a c1762a, C1748l c1748l) {
            super(c1762a, c1748l);
            this.f2799n = C1719s5.this.f2795g.m5023f();
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a */
        public void mo3137a(String str, int i, String str2, Object obj) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Failed to dispatch postback. Error code: " + i + " URL: " + this.f2799n);
            }
            if (C1719s5.this.f2796h != null) {
                C1719s5.this.f2796h.onPostbackFailure(this.f2799n, i);
            }
            if (C1719s5.this.f2795g.m5120t()) {
                this.f1969a.m4856u().m4706a(C1719s5.this.f2795g.m5119s(), this.f2799n, i, obj, str2, false);
            }
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a */
        public void mo3139a(String str, Object obj, int i) {
            if (obj instanceof String) {
                for (String str2 : this.f1969a.m4821c(C1831z4.f3949i0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                AbstractC1714s0.m4323c(jSONObject, this.f1969a);
                                AbstractC1714s0.m4321b(jSONObject, this.f1969a);
                                AbstractC1714s0.m4312a(jSONObject, this.f1969a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (C1719s5.this.f2796h != null) {
                C1719s5.this.f2796h.onPostbackSuccess(this.f2799n);
            }
            if (C1719s5.this.f2795g.m5120t()) {
                this.f1969a.m4856u().m4706a(C1719s5.this.f2795g.m5119s(), this.f2799n, i, obj, null, true);
            }
        }
    }

    public C1719s5(C1766e c1766e, C1552f6.b bVar, C1748l c1748l, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", c1748l);
        if (c1766e == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f2795g = c1766e;
        this.f2796h = appLovinPostbackListener;
        this.f2797i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m4346e() {
        b bVar = new b(this.f2795g, m3084b());
        bVar.m3765a(this.f2797i);
        m3084b().m4853s0().m2603a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f2795g.m5023f())) {
            if (this.f2795g.m5121u()) {
                m3084b().m4867z0().m3705a(this.f2795g, new a());
                return;
            } else {
                m4346e();
                return;
            }
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5175d(this.f1970b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f2796h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f2795g.m5023f(), AppLovinErrorCodes.INVALID_URL);
        }
    }
}
