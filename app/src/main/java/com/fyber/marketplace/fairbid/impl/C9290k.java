package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.InterfaceC8122g0;
import com.fyber.inneractive.sdk.flow.InterfaceC8126i0;
import com.fyber.inneractive.sdk.flow.InterfaceC8174r0;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.marketplace.fairbid.impl.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C9290k implements InterfaceC8126i0, InterfaceC8174r0 {

    /* JADX INFO: renamed from: a */
    public InneractiveUnitController f21741a;

    /* JADX INFO: renamed from: b */
    public AbstractC8236x f21742b;

    /* JADX INFO: renamed from: d */
    public boolean f21744d = false;

    /* JADX INFO: renamed from: c */
    public final String f21743c = UUID.randomUUID().toString();

    public C9290k(InneractiveUnitController inneractiveUnitController, AbstractC8236x abstractC8236x) {
        this.f21741a = inneractiveUnitController;
        this.f21742b = abstractC8236x;
    }

    @Override // com.fyber.inneractive.sdk.flow.InterfaceC8126i0
    /* JADX INFO: renamed from: a */
    public final void mo20544a() {
        AbstractC8236x abstractC8236x = this.f21742b;
        if (abstractC8236x != null) {
            abstractC8236x.destroy();
        }
        this.f21742b = null;
        this.f21741a = null;
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.InterfaceC8174r0
    /* JADX INFO: renamed from: a */
    public final void mo20546a(InterfaceC8122g0 interfaceC8122g0) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void addUnitController(InneractiveUnitController inneractiveUnitController) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void destroy() {
        InneractiveUnitController inneractiveUnitController = this.f21741a;
        if (inneractiveUnitController != null) {
            inneractiveUnitController.destroy();
        }
        mo20544a();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final AbstractC8236x getAdContent() {
        return this.f21742b;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveAdRequest getCurrentProcessedRequest() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getLocalUniqueId() {
        return this.f21743c;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveMediationName getMediationName() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationNameString() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationVersion() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getRequestedSpotId() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveUnitController getSelectedUnitController() {
        return this.f21741a;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final boolean isReady() {
        AbstractC8236x abstractC8236x = this.f21742b;
        if (abstractC8236x == null) {
            return false;
        }
        AbstractC9087e abstractC9087e = abstractC8236x.f18374b;
        boolean z = abstractC9087e != null && abstractC9087e.f21301a < System.currentTimeMillis();
        if (z) {
            AbstractC8236x abstractC8236x2 = this.f21742b;
            AbstractC9087e abstractC9087e2 = abstractC8236x2.f18374b;
            if (!this.f21744d && abstractC9087e2 != null && abstractC9087e2.f21303c != 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = abstractC9087e2.f21301a;
                if (j < jCurrentTimeMillis) {
                    long minutes = TimeUnit.MILLISECONDS.toMinutes(j - System.currentTimeMillis());
                    long j2 = abstractC9087e2.f21302b;
                    IAlog.m21945a("Firing Event 802 - AdExpired - time passed- " + minutes + ", sessionTimeOut - " + j2, new Object[0]);
                    EnumC8415t enumC8415t = EnumC8415t.IA_AD_EXPIRED;
                    InneractiveAdRequest inneractiveAdRequest = abstractC8236x2.f18373a;
                    JSONArray jSONArrayM20435b = abstractC8236x2.f18375c.m20435b();
                    C8428w c8428w = new C8428w(abstractC9087e2);
                    c8428w.f18754b = enumC8415t;
                    c8428w.f18753a = inneractiveAdRequest;
                    c8428w.f18756d = jSONArrayM20435b;
                    JSONObject jSONObject = new JSONObject();
                    Long lValueOf = Long.valueOf(minutes);
                    try {
                        jSONObject.put("time_passed", lValueOf);
                    } catch (Exception unused) {
                        IAlog.m21950f("Got exception adding param to json object: %s, %s", "time_passed", lValueOf);
                    }
                    Long lValueOf2 = Long.valueOf(j2);
                    try {
                        jSONObject.put("timeout", lValueOf2);
                    } catch (Exception unused2) {
                        IAlog.m21950f("Got exception adding param to json object: %s, %s", "timeout", lValueOf2);
                    }
                    c8428w.f18758f.put(jSONObject);
                    c8428w.m20808a((String) null);
                    this.f21744d = true;
                }
            }
        }
        return !z;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(String str) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(String str, String str2) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void removeUnitController(InneractiveUnitController inneractiveUnitController) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void requestAd(InneractiveAdRequest inneractiveAdRequest) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(InneractiveMediationName inneractiveMediationName) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(String str) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationVersion(String str) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
    }
}
