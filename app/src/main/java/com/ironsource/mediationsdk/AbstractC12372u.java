package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.C12159e1;
import com.ironsource.C12317m4;
import com.ironsource.C12518sf;
import com.ironsource.InterfaceC11506J8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.u */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12372u implements InterfaceC11506J8.b {

    /* JADX INFO: renamed from: a */
    protected AbstractAdapter f31463a;

    /* JADX INFO: renamed from: b */
    protected C12159e1 f31464b;

    /* JADX INFO: renamed from: c */
    private boolean f31465c;

    /* JADX INFO: renamed from: d */
    protected JSONObject f31466d;

    /* JADX INFO: renamed from: e */
    protected String f31467e;

    /* JADX INFO: renamed from: f */
    protected int f31468f;

    /* JADX INFO: renamed from: g */
    protected Long f31469g = null;

    AbstractC12372u(C12159e1 c12159e1, AbstractAdapter abstractAdapter) {
        this.f31464b = c12159e1;
        this.f31463a = abstractAdapter;
        this.f31466d = c12159e1.m31337c();
    }

    /* JADX INFO: renamed from: a */
    public abstract IronSource.EnumC12328a m32708a();

    /* JADX INFO: renamed from: a */
    public void m32710a(boolean z) {
        this.f31465c = z;
    }

    @Override // com.ironsource.InterfaceC11506J8.b
    /* JADX INFO: renamed from: b */
    public int mo26206b() {
        return this.f31464b.m31339e();
    }

    @Override // com.ironsource.InterfaceC11506J8.b
    /* JADX INFO: renamed from: c */
    public String mo26207c() {
        return this.f31464b.m31340f();
    }

    /* JADX INFO: renamed from: d */
    public Long m32713d() {
        return this.f31469g;
    }

    /* JADX INFO: renamed from: e */
    public String m32714e() {
        return String.format("%s %s", m32717h(), Integer.valueOf(hashCode()));
    }

    /* JADX INFO: renamed from: f */
    public int m32715f() {
        return this.f31464b.m31338d();
    }

    /* JADX INFO: renamed from: g */
    public boolean m32716g() {
        return this.f31465c;
    }

    /* JADX INFO: renamed from: h */
    public String m32717h() {
        return this.f31464b.m31342h().isMultipleInstances() ? this.f31464b.m31342h().getProviderTypeForReflection() : this.f31464b.m31342h().getProviderName();
    }

    /* JADX INFO: renamed from: i */
    public String m32718i() {
        return this.f31464b.m31341g();
    }

    /* JADX INFO: renamed from: j */
    public abstract String m32719j();

    /* JADX INFO: renamed from: k */
    public int m32720k() {
        return 1;
    }

    /* JADX INFO: renamed from: l */
    public Map<String, Object> m32721l() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f31463a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f31463a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f31464b.m31343i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f31464b.m31335a());
            map.put("instanceType", Integer.valueOf(m32724o() ? 2 : 1));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(m32720k()));
            if (!TextUtils.isEmpty(this.f31467e)) {
                map.put("dynamicDemandSource", this.f31467e);
                return map;
            }
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + mo26207c() + ")", th);
        }
        return map;
    }

    /* JADX INFO: renamed from: m */
    public int m32722m() {
        return this.f31468f;
    }

    /* JADX INFO: renamed from: n */
    public boolean m32723n() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !this.f31463a.isUsingActivityBeforeImpression(C12518sf.m33676a(m32708a()))) {
                return false;
            }
            ironLog.verbose(mo26207c() + " - is using activity before impression and activity is null");
            return true;
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            m32711b("Exception while calling adapter.isUsingActivityBeforeImpression() - " + th.getLocalizedMessage());
            return true;
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m32724o() {
        return this.f31464b.m31344j();
    }

    /* JADX INFO: renamed from: p */
    public void m32725p() {
        this.f31463a = null;
    }

    /* JADX INFO: renamed from: q */
    public boolean m32726q() {
        if (m32723n()) {
            return false;
        }
        return m32724o() || m32727r();
    }

    /* JADX INFO: renamed from: r */
    public boolean m32727r() {
        return this.f31464b.m31345k();
    }

    /* JADX INFO: renamed from: a */
    public void m32709a(String str) {
        m32707a(str, 0);
    }

    /* JADX INFO: renamed from: b */
    public void m32711b(String str) {
        m32707a(str, 3);
    }

    /* JADX INFO: renamed from: c */
    public void m32712c(String str) {
        this.f31467e = C12333d.m32333b().m32342c(str);
    }

    /* JADX INFO: renamed from: a */
    private void m32707a(String str, int i) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, m32719j() + " " + mo26207c() + " : " + str, i);
    }
}
