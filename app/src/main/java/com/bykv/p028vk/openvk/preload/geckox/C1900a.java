package com.bykv.p028vk.openvk.preload.geckox;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.p028vk.openvk.preload.falconx.p032a.C1896a;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.p028vk.openvk.preload.geckox.p033a.C1901a;
import com.bykv.p028vk.openvk.preload.geckox.p033a.p034a.AbstractC1903b;
import com.bykv.p028vk.openvk.preload.geckox.p044d.AbstractC1947a;
import com.bykv.p028vk.openvk.preload.geckox.p048g.C1956a;
import com.bykv.p028vk.openvk.preload.geckox.statistic.C1961b;
import com.bykv.p028vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a */
/* JADX INFO: compiled from: GeckoClient.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1900a {

    /* JADX INFO: renamed from: a */
    private C1896a f4291a;

    /* JADX INFO: renamed from: b */
    private Queue<String> f4292b;

    /* JADX INFO: renamed from: c */
    private C1910b f4293c;

    /* JADX INFO: renamed from: d */
    private File f4294d;

    private C1900a(C1910b c1910b) {
        new ArrayList();
        this.f4291a = new C1896a();
        this.f4292b = new LinkedBlockingQueue();
        this.f4293c = c1910b;
        File fileM5934n = c1910b.m5934n();
        this.f4294d = fileM5934n;
        fileM5934n.mkdirs();
        C1961b.m6052a(this, this.f4293c);
    }

    /* JADX INFO: renamed from: a */
    public static C1900a m5887a(C1910b c1910b) {
        List<String> listM5927e = c1910b.m5927e();
        if (listM5927e == null || listM5927e.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        c1910b.m5922a();
        return new C1900a(c1910b);
    }

    /* JADX INFO: renamed from: a */
    private boolean m5889a() {
        List<String> listM5926d = this.f4293c.m5926d();
        List<String> listM5927e = this.f4293c.m5927e();
        if (listM5926d == null || listM5926d.isEmpty() || listM5927e == null || listM5927e.isEmpty()) {
            return false;
        }
        for (String str : listM5927e) {
            Iterator<String> it = listM5926d.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next())) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m5891b(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map != null && !map.isEmpty()) {
            List<String> listM5927e = this.f4293c.m5927e();
            for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                Iterator<String> it = listM5927e.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next(), entry.getKey())) {
                        z = true;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ void m5893d(C1900a c1900a) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c1900a.f4293c.m5927e());
        try {
            String strM5899a = new C1901a(arrayList).m5899a();
            if (c1900a.f4293c.m5936p() != null && c1900a.f4293c.m5936p().m5909a()) {
                c1900a.f4293c.m5936p();
            } else if (c1900a.f4292b.size() < 10) {
                c1900a.f4292b.add(strM5899a);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5894a(Class<? extends AbstractC1886d<?, ?>> cls, AbstractC1883a abstractC1883a) {
        this.f4291a.m5884a(cls, abstractC1883a);
    }

    /* JADX INFO: renamed from: a */
    public final void m5895a(final Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        final String str = BuildConfig.FLAVOR;
        if (TextUtils.isEmpty(BuildConfig.FLAVOR)) {
            throw new IllegalArgumentException("groupType == null");
        }
        if (!m5889a()) {
            throw new IllegalArgumentException("deployments keys not in local keys");
        }
        if (!m5891b(map)) {
            throw new IllegalArgumentException("target keys not in deployments keys");
        }
        final AbstractC1947a abstractC1947a = null;
        final Map map2 = null;
        C1910b.m5920h().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1903b abstractC1903bM5900a;
                String str2 = "download_duration";
                GeckoLogger.m6040d("gecko-debug-tag", "start check update...", str);
                if (C1900a.this.f4293c.m5924b() != null) {
                    abstractC1903bM5900a = C1900a.this.f4293c.m5924b().m5900a();
                    abstractC1903bM5900a.mo5908a(C1900a.this.f4293c.m5924b(), C1900a.this.f4293c.m5934n(), C1900a.this.f4293c.m5927e());
                } else {
                    abstractC1903bM5900a = null;
                }
                AbstractC1903b abstractC1903b = abstractC1903bM5900a;
                try {
                    try {
                        C1900a.this.f4293c.m5923a(new JSONObject());
                        GeckoLogger.m6040d("gecko-debug-tag", "update finished", C1956a.m6034a(abstractC1947a, C1900a.this.f4294d, C1900a.this.f4293c, C1900a.this.f4291a, map2, map, str).mo5836a(str));
                        if (abstractC1903b != null) {
                            abstractC1903b.mo5907a();
                        }
                        JSONObject jSONObjectM5928f = C1900a.this.f4293c.m5928f();
                        if (jSONObjectM5928f == null) {
                            jSONObjectM5928f = new JSONObject();
                        }
                        try {
                            jSONObjectM5928f.put("download_duration", SystemClock.elapsedRealtime() - C1900a.this.f4293c.m5939s());
                        } catch (Throwable unused) {
                        }
                        IStatisticMonitor iStatisticMonitorM5937q = C1900a.this.f4293c.m5937q();
                        iStatisticMonitorM5937q.upload("download_gecko_end", jSONObjectM5928f);
                        GeckoLogger.m6040d("gecko-debug-tag", "all channel update finished");
                        str2 = iStatisticMonitorM5937q;
                    } catch (Throwable th) {
                        if (abstractC1903b != null) {
                            abstractC1903b.mo5907a();
                        }
                        JSONObject jSONObjectM5928f2 = C1900a.this.f4293c.m5928f();
                        JSONObject jSONObject = jSONObjectM5928f2;
                        if (jSONObjectM5928f2 == null) {
                            jSONObject = new JSONObject();
                        }
                        try {
                            jSONObject.put(str2, SystemClock.elapsedRealtime() - C1900a.this.f4293c.m5939s());
                        } catch (Throwable unused2) {
                        }
                        C1900a.this.f4293c.m5937q().upload("download_gecko_end", jSONObject);
                        GeckoLogger.m6040d("gecko-debug-tag", "all channel update finished");
                        throw th;
                    }
                } catch (Exception e) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("success", false);
                        jSONObject2.put(NotificationCompat.CATEGORY_MESSAGE, e.toString());
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 2);
                        C1900a.this.f4293c.m5923a(jSONObject2);
                    } catch (Throwable unused3) {
                    }
                    GeckoLogger.m6043w("gecko-debug-tag", "Gecko update failed:", e);
                    if (abstractC1903b != null) {
                        abstractC1903b.mo5907a();
                    }
                    JSONObject jSONObjectM5928f3 = C1900a.this.f4293c.m5928f();
                    if (jSONObjectM5928f3 == null) {
                        jSONObjectM5928f3 = new JSONObject();
                    }
                    try {
                        jSONObjectM5928f3.put("download_duration", SystemClock.elapsedRealtime() - C1900a.this.f4293c.m5939s());
                    } catch (Throwable unused4) {
                    }
                    IStatisticMonitor iStatisticMonitorM5937q2 = C1900a.this.f4293c.m5937q();
                    iStatisticMonitorM5937q2.upload("download_gecko_end", jSONObjectM5928f3);
                    GeckoLogger.m6040d("gecko-debug-tag", "all channel update finished");
                    str2 = iStatisticMonitorM5937q2;
                }
                C1900a.m5893d(C1900a.this);
            }
        });
    }
}
