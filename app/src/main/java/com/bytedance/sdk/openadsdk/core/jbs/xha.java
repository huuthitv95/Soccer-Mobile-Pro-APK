package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.C2730vr;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3331uq;
import com.bytedance.sdk.openadsdk.core.bgr.p195fi.C3113ri;
import com.bytedance.sdk.openadsdk.core.bgr.p199ri.C3126lr;
import com.bytedance.sdk.openadsdk.core.model.C3282ik;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.igq;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.utils.C3582pv;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: ik */
    private final Context f10915ik;

    /* JADX INFO: renamed from: ka */
    private PAGBannerAdLoadListener f10916ka;

    /* JADX INFO: renamed from: mj */
    private com.bytedance.sdk.openadsdk.core.model.wjv f10918mj;

    /* JADX INFO: renamed from: ri */
    private AdSlot f10919ri;

    /* JADX INFO: renamed from: fi */
    private final AtomicBoolean f10914fi = new AtomicBoolean(false);

    /* JADX INFO: renamed from: di */
    private int f10913di = 5;
    private final C3582pv xha = C3582pv.m16566ik();

    /* JADX INFO: renamed from: lr */
    private final com.bytedance.sdk.openadsdk.core.wjv f10917lr = C3299nr.m14638ik();

    private xha(Context context) {
        if (context != null) {
            this.f10915ik = context.getApplicationContext();
        } else {
            this.f10915ik = C3299nr.m14642ri();
        }
    }

    /* JADX INFO: renamed from: ri */
    private PAGBannerAd m13748ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        int width;
        int height;
        PAGBannerSize pAGBannerSizeVkd = wjvVar.vkd();
        float fMin = Math.min(this.f10919ri.getExpressViewAcceptedHeight(), 250.0f);
        if (pAGBannerSizeVkd != null) {
            width = pAGBannerSizeVkd.getWidth();
            height = pAGBannerSizeVkd.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        float expressViewAcceptedWidth = width > 0 ? width : this.f10919ri.getExpressViewAcceptedWidth();
        if (height > 0) {
            fMin = height;
        }
        this.f10919ri.setExpressViewAccepted(expressViewAcceptedWidth, fMin);
        return new com.bytedance.sdk.openadsdk.core.p221ka.xha(this.f10915ik, wjvVar, this.f10919ri);
    }

    /* JADX INFO: renamed from: ri */
    public static xha m13749ri(Context context) {
        return new xha(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13751ri(int i, String str) {
        PAGBannerAdLoadListener pAGBannerAdLoadListener;
        if (!this.f10914fi.getAndSet(false) || (pAGBannerAdLoadListener = this.f10916ka) == null) {
            return;
        }
        pAGBannerAdLoadListener.onError(i, str);
    }

    /* JADX INFO: renamed from: ri */
    private void m13752ri(final AdSlot adSlot) {
        if (adSlot == null) {
            return;
        }
        igq igqVar = new igq();
        igqVar.jbs = 2;
        this.f10917lr.mo12638ri(adSlot, igqVar, this.f10913di, new C3331uq() { // from class: com.bytedance.sdk.openadsdk.core.jbs.xha.1
            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10890ri(int i, String str) {
                xha.this.m13751ri(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10891ri(C3289ri c3289ri, C3282ik c3282ik) {
                xha.this.m13756ri(c3289ri, c3282ik, adSlot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13756ri(C3289ri c3289ri, C3282ik c3282ik, AdSlot adSlot) {
        if (c3289ri.m14252ka() == null || c3289ri.m14252ka().isEmpty()) {
            m13751ri(-3, com.bytedance.sdk.openadsdk.core.jbs.m13550ri(-3));
            c3282ik.m14181ri(-3);
            c3282ik.m14175ik(8);
            C3282ik.m14172ri(c3282ik);
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVarJbs = c3289ri.jbs();
        this.f10918mj = wjvVarJbs;
        m13759ri(wjvVarJbs, adSlot);
        if (C2730vr.m10314ik()) {
            Log.e("ExpressAdLoadManager", "onAdLoad: net work response duration = " + this.xha.m16570ka() + "run in  " + Thread.currentThread().getName());
        }
        if (this.f10914fi.getAndSet(false)) {
            dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.xha.2
                @Override // java.lang.Runnable
                public void run() {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (xha.this.f10918mj != null) {
                        xha xhaVar = xha.this;
                        xhaVar.m13757ri(xhaVar.f10918mj, jElapsedRealtime);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13757ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, long j) {
        if (this.f10916ka != null) {
            PAGBannerAd pAGBannerAdM13748ri = m13748ri(wjvVar);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jM16570ka = this.xha.m16570ka();
            if (!TextUtils.isEmpty(this.f10919ri.getBidAdm())) {
                C3521ka.m15947ri(wjvVar, jM16570ka);
            }
            this.f10916ka.onAdLoaded(pAGBannerAdM13748ri);
            m13758ri(wjvVar, jM16570ka, j, jElapsedRealtime);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13758ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final long j, final long j2, final long j3) {
        try {
            if (!C3299nr.m14639ka().m14862nd() || !C3606fi.m16699ka() || this.f10913di != 1 || wjvVar == null || wjvVar.lsq() == null || wjvVar.lsq().isEmpty() || wjvVar.m14428ka().m14259ri() == null) {
                return;
            }
            final JSONObject jSONObjectM14259ri = wjvVar.m14428ka().m14259ri();
            C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, jSONObjectM14259ri.optString(ViewHierarchyConstants.TAG_KEY, ""), "load_ad_time", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.core.jbs.xha.3
                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: ik */
                public JSONObject mo11121ik() {
                    try {
                        long jOptLong = jSONObjectM14259ri.optLong("callback_start", 0L);
                        long j4 = j2;
                        long j5 = j4 - jOptLong;
                        long j6 = j3 - j4;
                        JSONObject jSONObjectOptJSONObject = jSONObjectM14259ri.optJSONObject("extra_data");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new JSONObject();
                        }
                        jSONObjectOptJSONObject.put("thread_dispatch_duration", j5);
                        jSONObjectOptJSONObject.put("build_banner_ad_duration", j6);
                        jSONObjectOptJSONObject.put("ad_load_duration_full", j);
                        return jSONObjectOptJSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: lr */
                public JSONObject mo10797lr() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", jSONObjectM14259ri.optLong("duration", 0L));
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13759ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot) {
        for (com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 : wjvVar.lsq()) {
            if (com.bytedance.sdk.openadsdk.core.model.wjv.m14332fi(wjvVar2) && wjvVar2.m14389eu() != null && wjvVar2.m14389eu().m6364sf() != null) {
                if (C3299nr.m14639ka().m14845fi(String.valueOf(wjvVar2.m14545ur())) && C3299nr.m14639ka().m14895zb()) {
                    C3126lr c3126lrM14345ri = com.bytedance.sdk.openadsdk.core.model.wjv.m14345ri(CacheDirFactory.getICacheDir(wjvVar2.m14476qf()).mo6270ik(), wjvVar2);
                    c3126lrM14345ri.m6328ri("material_meta", wjvVar2);
                    c3126lrM14345ri.m6328ri("ad_slot", adSlot);
                    C3113ri.m12651ri(c3126lrM14345ri, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13760ri(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.common.xha xhaVar) {
        this.xha.m16569fi();
        if (this.f10914fi.get()) {
            return;
        }
        this.f10913di = i;
        this.f10914fi.set(true);
        this.f10919ri = adSlot;
        if (xhaVar instanceof PAGBannerAdLoadListener) {
            this.f10916ka = (PAGBannerAdLoadListener) xhaVar;
        }
        m13752ri(adSlot);
    }
}
