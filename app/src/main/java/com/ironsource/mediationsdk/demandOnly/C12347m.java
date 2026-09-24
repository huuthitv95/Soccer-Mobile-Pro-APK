package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C11733W9;
import com.ironsource.C12159e1;
import com.ironsource.C12317m4;
import com.ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.m */
/* JADX INFO: loaded from: classes6.dex */
public class C12347m {

    /* JADX INFO: renamed from: a */
    protected AbstractAdapter f31193a;

    /* JADX INFO: renamed from: b */
    protected C12159e1 f31194b;

    /* JADX INFO: renamed from: c */
    protected JSONObject f31195c;

    /* JADX INFO: renamed from: d */
    private a f31196d;

    /* JADX INFO: renamed from: e */
    private Timer f31197e;

    /* JADX INFO: renamed from: f */
    long f31198f;

    /* JADX INFO: renamed from: g */
    protected String f31199g;

    /* JADX INFO: renamed from: h */
    protected JSONObject f31200h;

    /* JADX INFO: renamed from: i */
    protected List<String> f31201i;

    /* JADX INFO: renamed from: j */
    protected String f31202j;

    /* JADX INFO: renamed from: k */
    private final Object f31203k = new Object();

    /* JADX INFO: renamed from: l */
    private final Object f31204l = new Object();

    /* JADX INFO: renamed from: m */
    protected final IronSource.EnumC12328a f31205m;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.m$a */
    protected enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public C12347m(C12159e1 c12159e1, AbstractAdapter abstractAdapter) {
        this.f31194b = c12159e1;
        this.f31205m = c12159e1.m31336b();
        this.f31193a = abstractAdapter;
        JSONObject jSONObjectM31337c = c12159e1.m31337c();
        this.f31195c = jSONObjectM31337c;
        try {
            jSONObjectM31337c.put(IronSourceLoadParameters.Constants.DEMAND_ONLY, true);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
        }
        this.f31196d = a.NOT_LOADED;
        this.f31197e = null;
        this.f31199g = "";
        this.f31200h = null;
        this.f31201i = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    boolean m32438a(a aVar, a aVar2) {
        synchronized (this.f31203k) {
            if (this.f31196d != aVar) {
                return false;
            }
            m32439b(aVar2);
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    void m32439b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.f31194b.m31340f() + ": current state=" + this.f31196d + ", new state=" + aVar);
        synchronized (this.f31203k) {
            this.f31196d = aVar;
        }
    }

    /* JADX INFO: renamed from: f */
    public C12159e1 m32441f() {
        return this.f31194b;
    }

    /* JADX INFO: renamed from: g */
    public String m32442g() {
        return this.f31199g;
    }

    /* JADX INFO: renamed from: h */
    public String m32443h() {
        return this.f31194b.m31340f();
    }

    /* JADX INFO: renamed from: i */
    public int m32444i() {
        return this.f31194b.m31338d();
    }

    /* JADX INFO: renamed from: j */
    public Map<String, Object> mo32372j() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f31193a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f31193a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f31194b.m31343i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f31194b.m31335a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            map.put("instanceType", Integer.valueOf(this.f31194b.m31338d()));
            if (!TextUtils.isEmpty(this.f31199g)) {
                map.put("auctionId", this.f31199g);
            }
            JSONObject jSONObject = this.f31200h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f31200h);
            }
            if (!TextUtils.isEmpty(this.f31202j)) {
                map.put("dynamicDemandSource", this.f31202j);
            }
            if (m32449o()) {
                map.put("isOneFlow", 1);
                return map;
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + m32443h() + ")", e);
        }
        return map;
    }

    /* JADX INFO: renamed from: k */
    String m32445k() {
        a aVar = this.f31196d;
        return aVar == null ? AbstractJsonLexerKt.NULL : aVar.toString();
    }

    /* JADX INFO: renamed from: l */
    public String m32446l() {
        return this.f31194b.m31343i();
    }

    /* JADX INFO: renamed from: m */
    public List<String> m32447m() {
        return this.f31201i;
    }

    /* JADX INFO: renamed from: n */
    public boolean m32448n() {
        return this.f31194b.m31344j();
    }

    /* JADX INFO: renamed from: o */
    public boolean m32449o() {
        return this.f31195c.optBoolean("isOneFlow", false);
    }

    /* JADX INFO: renamed from: p */
    void m32450p() {
        synchronized (this.f31204l) {
            Timer timer = this.f31197e;
            if (timer != null) {
                timer.cancel();
                this.f31197e = null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    a m32431a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.f31203k) {
            aVar2 = this.f31196d;
            if (Arrays.asList(aVarArr).contains(this.f31196d)) {
                m32439b(aVar);
            }
        }
        return aVar2;
    }

    /* JADX INFO: renamed from: b */
    public void m32440b(String str) {
        this.f31202j = C12333d.m32333b().m32342c(str);
    }

    /* JADX INFO: renamed from: a */
    boolean m32437a(a aVar) {
        boolean z;
        synchronized (this.f31203k) {
            z = this.f31196d == aVar;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public void m32436a(boolean z) {
        try {
            this.f31195c.put("isOneFlow", z);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.verbose("Can't set isOneFlow = " + z + ". Error: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    void m32434a(TimerTask timerTask) {
        synchronized (this.f31204l) {
            m32450p();
            Timer timer = new Timer();
            this.f31197e = timer;
            timer.schedule(timerTask, this.f31198f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m32432a(String str) {
        this.f31199g = str;
    }

    /* JADX INFO: renamed from: a */
    public void m32435a(JSONObject jSONObject) {
        this.f31200h = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    protected void m32433a(List<String> list, String str, int i, String str2, String str3) {
        Iterator it = ((List) C11733W9.m27831a((ArrayList) list, new ArrayList())).iterator();
        while (it.hasNext()) {
            String str4 = str;
            int i2 = i;
            C12333d.m32333b().m32339a(str3, str4, C12333d.m32333b().m32337a((String) it.next(), str4, i2, str2, "", "", "", ""));
            str = str4;
            i = i2;
        }
    }
}
