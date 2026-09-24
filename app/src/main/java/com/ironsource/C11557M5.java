package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.M5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11557M5 implements InterfaceC11456Gc {

    /* JADX INFO: renamed from: a */
    private boolean f25118a = true;

    /* JADX INFO: renamed from: b */
    private String f25119b = C11575N5.f25231j;

    /* JADX INFO: renamed from: com.ironsource.M5$a */
    public static final class a implements InterfaceC12165e7 {
        a() {
        }

        @Override // com.ironsource.InterfaceC12165e7
        /* JADX INFO: renamed from: a */
        public void mo26483a(boolean z) {
            if (z) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    /* JADX INFO: renamed from: b */
    private final JSONObject m26481b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11683Ta.f25802o, "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.m32746b(applicationContext));
            C11579N9 c11579n9M32763d = IronSourceUtils.m32763d(applicationContext);
            if (c11579n9M32763d != null) {
                jSONObject.put("advId", c11579n9M32763d.m26668c());
                jSONObject.put("advIdType", c11579n9M32763d.m26669d());
            }
        }
        String strM32668i = C12367p.m32628h().m32668i();
        if (strM32668i != null) {
            jSONObject.put(C11744X3.j.f26444g, strM32668i);
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC11456Gc
    /* JADX INFO: renamed from: a */
    public void mo25924a() {
    }

    /* JADX INFO: renamed from: a */
    public final void m26482a(String dataSource, JSONObject impressionData) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        if (!this.f25118a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject jSONObjectM26481b = m26481b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("externalMediationSource", dataSource);
            jSONObject.putOpt("externalMediationData", impressionData);
            jSONObject.putOpt("clientParams", jSONObjectM26481b);
            IronLog.API.info("impressionData: " + jSONObject);
            C12147d7.m31302a(this.f25119b, jSONObject.toString(), new a());
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.API.error("exception " + e.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.InterfaceC11456Gc
    /* JADX INFO: renamed from: g */
    public void mo25926g(String str) {
    }

    @Override // com.ironsource.InterfaceC11456Gc
    /* JADX INFO: renamed from: a */
    public void mo25925a(List<IronSource.EnumC12328a> list, boolean z, C11573N3 c11573n3) {
        if (c11573n3 != null) {
            C11373C1 c11373c1M26602b = c11573n3.m26602b();
            C11553M1 c11553m1M25548f = c11373c1M26602b != null ? c11373c1M26602b.m25548f() : null;
            Intrinsics.checkNotNull(c11553m1M25548f);
            this.f25118a = c11553m1M25548f.m26460l();
            this.f25119b = c11573n3.m26602b().m25548f().m26452d();
        }
    }
}
