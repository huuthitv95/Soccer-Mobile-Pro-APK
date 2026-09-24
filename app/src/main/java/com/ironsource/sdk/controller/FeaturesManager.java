package com.ironsource.sdk.controller;

import com.ironsource.C11455Gb;
import com.ironsource.C11501J3;
import com.ironsource.C11519K3;
import com.ironsource.C11637Qe;
import com.ironsource.C11744X3;
import com.ironsource.C11747X6;
import com.ironsource.C12317m4;
import com.ironsource.InterfaceC12300l8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class FeaturesManager {

    /* JADX INFO: renamed from: d */
    private static volatile FeaturesManager f31939d = null;

    /* JADX INFO: renamed from: e */
    private static final String f31940e = "debugMode";

    /* JADX INFO: renamed from: a */
    private Map<String, ?> f31941a;

    /* JADX INFO: renamed from: b */
    private final ArrayList<String> f31942b = new C12486a();

    /* JADX INFO: renamed from: c */
    private InterfaceC12300l8 f31943c = C11455Gb.m25891U().mo25853t();

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.FeaturesManager$a */
    class C12486a extends ArrayList<String> {
        C12486a() {
            add(C11744X3.d.f26228f);
            add(C11744X3.d.f26227e);
            add(C11744X3.d.f26229g);
            add(C11744X3.d.f26230h);
            add(C11744X3.d.f26231i);
            add(C11744X3.d.f26232j);
            add(C11744X3.d.f26233k);
            add(C11744X3.d.f26234l);
            add(C11744X3.d.f26235m);
        }
    }

    private FeaturesManager() {
        if (f31939d != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.f31941a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (f31939d == null) {
            synchronized (FeaturesManager.class) {
                if (f31939d == null) {
                    f31939d = new FeaturesManager();
                }
            }
        }
        return f31939d;
    }

    /* JADX INFO: renamed from: a */
    ArrayList<String> m33340a() {
        return new ArrayList<>(this.f31942b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(C11744X3.a.f26167d) ? networkConfiguration.optJSONObject(C11744X3.a.f26167d) : new JSONObject();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f31941a.containsKey("debugMode")) {
                num = (Integer) this.f31941a.get("debugMode");
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public C11501J3 getFeatureFlagCatchUrlError() {
        return new C11501J3(SDKUtils.getNetworkConfiguration().optJSONObject(C11501J3.a.f24718c));
    }

    public C11519K3 getFeatureFlagClickCheck() {
        return new C11519K3(SDKUtils.getNetworkConfiguration());
    }

    public C11747X6 getFeatureFlagHealthCheck() {
        JSONObject jSONObjectMo32059a = this.f31943c.mo32059a(C11744X3.a.f26181r);
        return jSONObjectMo32059a instanceof JSONObject ? new C11747X6(jSONObjectMo32059a) : new C11747X6(null);
    }

    public boolean getFeatureFlagLoadControllerAndPlayerFromBundle() {
        return SDKUtils.getNetworkFeatureConfiguration().optBoolean(C11744X3.a.f26186w, false);
    }

    public int getInitRecoverTrials() {
        JSONObject jSONObjectOptJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject("init");
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optInt(C11744X3.a.f26168e, 0);
        }
        return 0;
    }

    public C11637Qe getSessionHistoryConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return new C11637Qe(networkConfiguration.has(C11744X3.a.f26182s) ? networkConfiguration.optJSONObject(C11744X3.a.f26182s) : new JSONObject());
    }

    public boolean getStopUseOnResumeAndPause() {
        return Boolean.TRUE.equals(this.f31943c.mo32061c(C11744X3.a.f26184u));
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f31941a = map;
    }
}
