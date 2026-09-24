package com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3215ik;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.p226sf.C3324ik;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.slm.C3520ik;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.utils.C3593su;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.C11540L6;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ihz.ri.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3369ri {

    /* JADX INFO: renamed from: mj */
    private static volatile C3369ri f11966mj;

    /* JADX INFO: renamed from: ri */
    private volatile Boolean f11972ri = null;

    /* JADX INFO: renamed from: lr */
    private AtomicLong f11971lr = new AtomicLong(0);

    /* JADX INFO: renamed from: ik */
    private int f11969ik = 0;

    /* JADX INFO: renamed from: ka */
    private String f11970ka = "";

    /* JADX INFO: renamed from: fi */
    private final CountDownLatch f11968fi = new CountDownLatch(1);

    /* JADX INFO: renamed from: di */
    private volatile boolean f11967di = false;
    private String xha = "";

    private C3369ri() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public boolean m15218ik() {
        if (this.f11972ri == null) {
            synchronized (this) {
                if (this.f11972ri == null) {
                    this.f11972ri = Boolean.valueOf(((int) ((Math.random() * 100.0d) + 1.0d)) <= C3520ik.m15933lr("gid_status", 100));
                    if (this.f11972ri.booleanValue()) {
                        try {
                            this.xha = C3593su.m16658ri();
                        } catch (Throwable unused) {
                            this.xha = BuildConfig.FLAVOR;
                        }
                    }
                }
            }
        }
        return this.f11972ri.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static String m15221lr(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(th.toString());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(stackTraceElement.toString());
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C3369ri m15224ri() {
        if (f11966mj == null) {
            synchronized (C3369ri.class) {
                if (f11966mj == null) {
                    f11966mj = new C3369ri();
                }
            }
        }
        return f11966mj;
    }

    /* JADX INFO: renamed from: lr */
    public String m15229lr() {
        if (C3299nr.m14639ka().sez() == 1 && !dzy.m16391di()) {
            if (!this.f11967di) {
                try {
                    this.f11968fi.await(4L, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                } finally {
                    this.f11967di = true;
                    this.f11968fi.countDown();
                }
            }
            return this.f11970ka;
        }
        return this.f11970ka;
    }

    /* JADX INFO: renamed from: ri */
    public void m15230ri(int i, String str, long j) {
        m15234ri(false, i, str, null, j);
    }

    /* JADX INFO: renamed from: ri */
    public void m15231ri(int i, Throwable th, long j) {
        m15234ri(false, i, "", th, j);
    }

    /* JADX INFO: renamed from: ri */
    public void m15232ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(C11540L6.f24947V0, m15229lr());
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15233ri(boolean z) {
        if (this.f11969ik == 1 || !TextUtils.isEmpty(this.f11970ka)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z || this.f11971lr.get() <= jElapsedRealtime) {
            this.f11971lr.set(jElapsedRealtime + 300000);
            final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            dzy.m16409ri(new AbstractRunnableC2676ik("pag_gaid") { // from class: com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v5, types: [com.bytedance.sdk.openadsdk.core.ik] */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1, types: [int] */
                /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
                @Override // java.lang.Runnable
                public void run() {
                    ?? IsLimitAdTrackingEnabled;
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(C3299nr.m14642ri());
                        if (advertisingIdInfo != null) {
                            IsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                            if (IsLimitAdTrackingEnabled != 0) {
                                C3369ri.this.f11969ik = 1;
                                C3369ri.this.m15230ri(2, "lmt", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                            }
                            if (IsLimitAdTrackingEnabled == 0) {
                                String id = advertisingIdInfo.getId();
                                String str = C3369ri.this.f11970ka;
                                if (TextUtils.isEmpty(id)) {
                                    C3369ri.this.m15230ri(4, "empty gaid", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                } else {
                                    C3369ri.this.f11970ka = id;
                                    C3369ri.this.m15235ri(true, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                }
                                if (!str.equals(id)) {
                                    C3089aw.m12378ri();
                                }
                            }
                        } else {
                            IsLimitAdTrackingEnabled = -1;
                        }
                        if (IsLimitAdTrackingEnabled != -1) {
                            C3215ik.m13505ri().m13510ri("limit_ad_track", IsLimitAdTrackingEnabled);
                        }
                    } catch (Throwable th) {
                        try {
                            C3369ri.this.f11969ik = 2;
                            C3369ri.this.m15231ri(3, th, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                            C2707ac.m10196ik("AdvertisingIdHelper", th.getMessage());
                        } finally {
                            C3369ri.this.f11967di = true;
                            C3369ri.this.f11968fi.countDown();
                            C3324ik.m14918ri(C3369ri.this.f11970ka);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15234ri(final boolean z, final int i, final String str, final Throwable th, final long j) {
        if ((this.f11972ri == null || this.f11972ri.booleanValue()) && C3299nr.m14642ri() != null) {
            C3299nr.m14637fi().mo15674ri(new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.2
                @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                /* JADX INFO: renamed from: ri */
                public InterfaceC3530ik mo11574ri() throws Exception {
                    if (!C3369ri.this.m15218ik()) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, C3369ri.this.xha);
                    jSONObject.put("is_success", z);
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_msg", TextUtils.isEmpty(str) ? C3369ri.m15221lr(th) : str);
                    jSONObject.put("duration", j);
                    jSONObject.put("has_setting", C3322sf.m14819lr().m14898zk() > 0);
                    return C3531ka.m15967lr().m15985ri("gid_status").m15980lr(jSONObject.toString());
                }
            }, false);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15235ri(boolean z, long j) {
        m15234ri(z, 0, "", null, j);
    }
}
