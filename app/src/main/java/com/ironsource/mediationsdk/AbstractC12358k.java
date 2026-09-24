package com.ironsource.mediationsdk;

import com.ironsource.C11698U8;
import com.ironsource.C11767Y9;
import com.ironsource.C12434q2;
import com.ironsource.C12467s;
import com.ironsource.C12586wb;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.k */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12358k {

    /* JADX INFO: renamed from: a */
    private HashSet<ImpressionDataListener> f31280a;

    /* JADX INFO: renamed from: b */
    protected C12467s f31281b;

    /* JADX INFO: renamed from: c */
    protected C11767Y9 f31282c;

    /* JADX INFO: renamed from: d */
    protected AdInfo f31283d;

    public AbstractC12358k(HashSet<ImpressionDataListener> hashSet, C11767Y9 c11767y9) {
        new HashSet();
        this.f31280a = hashSet;
        this.f31281b = new C12467s();
        this.f31282c = c11767y9;
    }

    /* JADX INFO: renamed from: a */
    public void m32553a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f31280a.add(impressionDataListener);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m32557b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f31280a.remove(impressionDataListener);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m32558c() {
        this.f31283d = null;
    }

    /* JADX INFO: renamed from: a */
    public void m32551a(C11767Y9 c11767y9) {
        this.f31282c = c11767y9;
    }

    /* JADX INFO: renamed from: b */
    public void m32556b() {
        synchronized (this) {
            this.f31280a.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m32550a(C11698U8 c11698u8, C12586wb c12586wb) {
        if (c11698u8 != null) {
            this.f31283d = new AdInfo(c11698u8, c12586wb);
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m32554a(C12434q2 c12434q2, String str) {
        HashSet<ImpressionDataListener> hashSet;
        if (c12434q2 != null) {
            C11698U8 c11698u8M33140a = c12434q2.m33140a(str);
            if (c11698u8M33140a != null) {
                synchronized (this) {
                    hashSet = (HashSet) this.f31280a.clone();
                }
                for (ImpressionDataListener impressionDataListener : hashSet) {
                    IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + c11698u8M33140a);
                    impressionDataListener.onImpressionSuccess(c11698u8M33140a);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    /* JADX INFO: renamed from: a */
    protected String m32549a() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    protected void m32555a(JSONObject jSONObject, IronSource.EnumC12328a enumC12328a) {
        this.f31281b.mo31546a(enumC12328a, jSONObject != null ? jSONObject.optBoolean(C12333d.f31042f, false) : false);
    }

    /* JADX INFO: renamed from: a */
    protected void m32552a(IronSource.EnumC12328a enumC12328a) {
        this.f31281b.mo31546a(enumC12328a, false);
    }
}
