package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.AbstractC1993lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.component.utils.C2728su;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.bgr.C2901ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3331uq;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.bgr.p195fi.C3113ri;
import com.bytedance.sdk.openadsdk.core.bgr.p196ik.C3116ri;
import com.bytedance.sdk.openadsdk.core.bgr.p199ri.C3126lr;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3281fr;
import com.bytedance.sdk.openadsdk.core.model.C3282ik;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.igq;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p266uq.p268ri.C3550ka;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2987di {

    /* JADX INFO: renamed from: ri */
    private static volatile C2987di f9122ri;

    /* JADX INFO: renamed from: fi */
    private AbstractRunnableC2676ik f9124fi;

    /* JADX INFO: renamed from: lr */
    private final Context f9127lr;

    /* JADX INFO: renamed from: ik */
    private final AtomicBoolean f9125ik = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ka */
    private final List<ik> f9126ka = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: di */
    private final C2728su.ri f9123di = new C2728su.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.6
        @Override // com.bytedance.sdk.component.utils.C2728su.ri
        /* JADX INFO: renamed from: ri */
        public void mo10299ri(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (C2987di.this.f9124fi == null) {
                    C2987di.this.f9124fi = new C2989ik("fsv net connect task", C2987di.this.f9126ka);
                }
                com.bytedance.sdk.component.utils.jbs.m10235ri().post(C2987di.this.f9124fi);
            }
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.di$ik */
    private static class ik extends AbstractRunnableC2676ik {

        /* JADX INFO: renamed from: ik */
        final C3289ri f9149ik;

        /* JADX INFO: renamed from: lr */
        final AdSlot f9150lr;

        /* JADX INFO: renamed from: ri */
        final wjv f9151ri;

        ik(wjv wjvVar, AdSlot adSlot, C3289ri c3289ri) {
            super("Fullscreen Task");
            this.f9151ri = wjvVar;
            this.f9150lr = adSlot;
            this.f9149ik = c3289ri;
        }

        @Override // java.lang.Runnable
        public void run() {
            wjv wjvVar = this.f9151ri;
            if (wjvVar == null || wjvVar.m14389eu() == null) {
                return;
            }
            C3126lr c3126lrM14345ri = wjv.m14345ri(CacheDirFactory.getICacheDir(this.f9151ri.m14476qf()).mo6274ri(), this.f9151ri);
            c3126lrM14345ri.m6328ri("material_meta", this.f9151ri);
            c3126lrM14345ri.m6328ri("ad_slot", this.f9150lr);
            C3113ri.m12651ri(c3126lrM14345ri, new AbstractC1993lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.ik.1
                @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo6289ri(C1996ik c1996ik, int i) {
                    C2988fi.m11683ri(C3299nr.m14642ri()).m11686ri(ik.this.f9150lr, ik.this.f9149ik);
                }

                @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo6290ri(C1996ik c1996ik, int i, String str) {
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.di$lr */
    /* JADX INFO: loaded from: classes9.dex */
    private static class lr implements PAGInterstitialAdLoadListener {

        /* JADX INFO: renamed from: ik */
        private final AtomicInteger f9153ik;

        /* JADX INFO: renamed from: ka */
        private final C3289ri f9154ka;

        /* JADX INFO: renamed from: lr */
        private final AtomicBoolean f9155lr;

        /* JADX INFO: renamed from: ri */
        private final PAGInterstitialAdLoadListener f9156ri;

        private lr(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, C3289ri c3289ri) {
            this.f9155lr = new AtomicBoolean(false);
            this.f9156ri = pAGInterstitialAdLoadListener;
            this.f9154ka = c3289ri;
            this.f9153ik = new AtomicInteger(m11679ri());
        }

        /* JADX INFO: renamed from: ri */
        private int m11679ri() {
            if (!this.f9154ka.m14249fi()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.f9154ka.m14252ka().size(); i2++) {
                wjv wjvVar = this.f9154ka.m14252ka().get(i2);
                if (wjvVar != null && !C3279dw.m14090ik(wjvVar) && wjvVar.m14389eu() != null) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
        public void onError(int i, String str) {
            if (this.f9153ik.decrementAndGet() > 0 || !this.f9155lr.compareAndSet(false, true)) {
                return;
            }
            this.f9156ri.onError(i, str);
            C3521ka.m15952ri("choose_ad_load_error", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.lr.1
                @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                /* JADX INFO: renamed from: ri */
                public InterfaceC3530ik mo11574ri() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", lr.this.f9154ka.m14253lr());
                    return C3531ka.m15967lr().m15985ri("choose_ad_load_error").m15980lr(jSONObject.toString());
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.f9153ik.decrementAndGet();
            if (this.f9156ri == null || !this.f9155lr.compareAndSet(false, true)) {
                return;
            }
            this.f9156ri.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.di$ri */
    private static class ri implements PAGInterstitialAdLoadListener {

        /* JADX INFO: renamed from: fi */
        private final boolean f9158fi;

        /* JADX INFO: renamed from: ik */
        private final C3289ri f9159ik;

        /* JADX INFO: renamed from: ka */
        private final PAGInterstitialAdLoadListener f9160ka;

        /* JADX INFO: renamed from: lr */
        private final AdSlot f9161lr;

        /* JADX INFO: renamed from: ri */
        private final Context f9162ri;

        public ri(Context context, AdSlot adSlot, C3289ri c3289ri, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z) {
            this.f9162ri = context;
            this.f9161lr = adSlot;
            this.f9159ik = c3289ri;
            this.f9160ka = pAGInterstitialAdLoadListener;
            this.f9158fi = z;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
        public void onError(int i, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.f9160ka;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            C2987di.m11663ri(this.f9162ri).m11664ri(this.f9161lr, this.f9159ik, this.f9160ka, pAGInterstitialAd, this.f9158fi);
        }
    }

    private C2987di(Context context) {
        this.f9127lr = context == null ? C3299nr.m14642ri() : context.getApplicationContext();
        m11658lr();
    }

    /* JADX INFO: renamed from: ik */
    private void m11655ik() {
        if (this.f9125ik.get()) {
            this.f9125ik.set(false);
            try {
                C2728su.m10297ri(this.f9123di);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m11656ik(AdSlot adSlot) {
        C2988fi.m11683ri(this.f9127lr).m11687ri(adSlot.getCodeId());
    }

    /* JADX INFO: renamed from: lr */
    private void m11658lr() {
        if (this.f9125ik.get()) {
            return;
        }
        this.f9125ik.set(true);
        C2728su.m10298ri(this.f9123di, this.f9127lr);
    }

    /* JADX INFO: renamed from: lr */
    private void m11659lr(final AdSlot adSlot) {
        igq igqVar = new igq();
        igqVar.f11278ik = 2;
        if (C3299nr.m14639ka().m14836co(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            igqVar.jbs = 2;
        }
        C3299nr.m14638ik().mo12638ri(adSlot, igqVar, 8, new C3331uq() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.1

            /* JADX INFO: renamed from: ri */
            boolean f9130ri = false;

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.ihz
            /* JADX INFO: renamed from: ri */
            public String mo11676ri() {
                return C2988fi.m11683ri(C2987di.this.f9127lr).m11684ri(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10890ri(int i, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10891ri(C3289ri c3289ri, C3282ik c3282ik) {
                if (this.f9130ri || c3289ri.m14252ka() == null || c3289ri.m14252ka().isEmpty()) {
                    return;
                }
                C2987di.this.m11670ri(c3289ri, new C3001nr(C2987di.this.f9127lr, c3289ri), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.ihz
            /* JADX INFO: renamed from: ri */
            public boolean mo11677ri(C3289ri c3289ri) {
                boolean zM11689ri = C2988fi.m11683ri(C2987di.this.f9127lr).m11689ri(c3289ri);
                this.f9130ri = zM11689ri;
                return zM11689ri;
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    private void m11660lr(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        igq igqVar = new igq();
        igqVar.f11278ik = 1;
        if (C3299nr.m14639ka().m14836co(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            igqVar.jbs = 2;
        }
        C3299nr.m14638ik().mo12638ri(adSlot, igqVar, 8, new C3331uq() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.2

            /* JADX INFO: renamed from: ri */
            boolean f9135ri = false;

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.ihz
            /* JADX INFO: renamed from: ri */
            public String mo11676ri() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strM11684ri = C2988fi.m11683ri(C2987di.this.f9127lr).m11684ri(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strM11684ri)) {
                    return null;
                }
                return strM11684ri;
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10890ri(int i, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10891ri(C3289ri c3289ri, C3282ik c3282ik) {
                C3289ri c3289ri2;
                if (c3289ri.m14252ka() == null || c3289ri.m14252ka().isEmpty()) {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                    if (pAGInterstitialAdLoadListener2 != null) {
                        pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.jbs.m13550ri(-3));
                        c3282ik.m14181ri(-3);
                        c3282ik.m14175ik(5);
                        C3282ik.m14172ri(c3282ik);
                        return;
                    }
                    return;
                }
                C3001nr c3001nr = new C3001nr(C2987di.this.f9127lr, c3289ri);
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    C3550ka.m16268ri().m16271ri(c3289ri.m14252ka().isEmpty() ? null : c3289ri.m14252ka().get(0));
                    C3521ka.m15947ri(c3289ri.m14248di(), System.currentTimeMillis() - jCurrentTimeMillis);
                }
                if (pAGInterstitialAdLoadListener == null || C3299nr.m14639ka().m14896zf() != 0) {
                    c3289ri2 = c3289ri;
                } else {
                    C2987di.this.m11664ri(adSlot, c3289ri, pAGInterstitialAdLoadListener, c3001nr.m11773ri(), this.f9135ri);
                    c3289ri2 = c3289ri;
                }
                C2987di.this.m11670ri(c3289ri2, c3001nr, adSlot, false, pAGInterstitialAdLoadListener);
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.ihz
            /* JADX INFO: renamed from: ri */
            public boolean mo11677ri(C3289ri c3289ri) {
                boolean zM11689ri = C2988fi.m11683ri(C2987di.this.f9127lr).m11689ri(c3289ri);
                this.f9135ri = zM11689ri;
                return zM11689ri;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static C2987di m11663ri(Context context) {
        if (f9122ri == null) {
            synchronized (C2987di.class) {
                if (f9122ri == null) {
                    f9122ri = new C2987di(context);
                }
            }
        }
        return f9122ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11664ri(final AdSlot adSlot, final C3289ri c3289ri, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, final boolean z) {
        C3332vr.m14978lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.3
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    C2987di.this.m11656ik(adSlot);
                } else {
                    C2988fi.m11683ri(C2987di.this.f9127lr).m11686ri(adSlot, c3289ri);
                    C2987di.this.m11656ik(adSlot);
                }
            }
        });
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m11665ri(ik ikVar) {
        if (ikVar == null) {
            return;
        }
        if (this.f9126ka.size() > 0) {
            this.f9126ka.remove(0);
        }
        this.f9126ka.add(ikVar);
    }

    /* JADX INFO: renamed from: ri */
    private void m11669ri(C3289ri c3289ri) {
        C3281fr c3281frM14258qt = c3289ri.m14258qt();
        int iSlm = c3289ri.m14257mj() ? 10 : 1;
        if (c3281frM14258qt != null) {
            iSlm = c3281frM14258qt.slm();
        }
        for (final int i = 0; i < c3289ri.m14252ka().size() && i < iSlm; i++) {
            C3116ri.m12672ri().m12686ri(c3289ri.m14252ka().get(i), new C3116ri.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.4
                @Override // com.bytedance.sdk.openadsdk.core.bgr.p196ik.C3116ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo11678ri(boolean z) {
                    C2707ac.m10205ri("ScreenVideoLoadM", "onCachedResponse: i=" + i + ", isSuccess=" + z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11670ri(C3289ri c3289ri, C3001nr c3001nr, AdSlot adSlot, boolean z, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        if (!z) {
            C2901ri.m11167ri().m11178ri(c3289ri.m14248di());
        }
        AdSlot adSlot2 = adSlot;
        lr lrVar = new lr(new ri(this.f9127lr, adSlot2, c3289ri, pAGInterstitialAdLoadListener, false), c3289ri);
        m11669ri(c3289ri);
        int i = 0;
        while (i < c3289ri.m14252ka().size()) {
            wjv wjvVar = c3289ri.m14252ka().get(i);
            int iM14453nd = wjvVar.m14453nd();
            if (i == 0 && iM14453nd == 43) {
                wjvVar.m14389eu().m6340di(0);
            }
            C3001nr c3001nr2 = c3001nr;
            boolean z2 = z;
            AdSlot adSlot3 = adSlot2;
            m11671ri(c3289ri, wjvVar, c3001nr2, adSlot3, z2, lrVar);
            adSlot2 = adSlot3;
            if (c3289ri.m14257mj() && wjvVar.m14453nd() != 43) {
                return;
            }
            i++;
            c3001nr = c3001nr2;
            z = z2;
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m11671ri(final C3289ri c3289ri, wjv wjvVar, C3001nr c3001nr, final AdSlot adSlot, final boolean z, lr lrVar) {
        final C3001nr c3001nr2;
        final lr lrVar2;
        if (z && !C3279dw.m14090ik(wjvVar) && wjv.m14332fi(wjvVar) && C3299nr.m14639ka().m14883su(adSlot.getCodeId()).f11591ka == 1 && !C2724nr.m10256ka(this.f9127lr)) {
            m11665ri(new ik(wjvVar, adSlot, c3289ri));
            return;
        }
        boolean z2 = false;
        boolean z3 = lrVar != null && C3299nr.m14639ka().m14896zf() == 1;
        if (C3279dw.m14090ik(wjvVar)) {
            c3001nr2 = c3001nr;
            lrVar2 = lrVar;
            if (z) {
                C2988fi.m11683ri(this.f9127lr).m11686ri(adSlot, c3289ri);
            }
        } else if (wjv.m14332fi(wjvVar)) {
            if (wjvVar.m14389eu() != null) {
                C3126lr c3126lrM14345ri = wjv.m14345ri(CacheDirFactory.getICacheDir(wjvVar.m14476qf()).mo6274ri(), wjvVar);
                c3126lrM14345ri.m6328ri("material_meta", wjvVar);
                c3126lrM14345ri.m6328ri("ad_slot", adSlot);
                c3001nr2 = c3001nr;
                lrVar2 = lrVar;
                C3113ri.m12651ri(c3126lrM14345ri, new AbstractC1993lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.5
                    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo6289ri(C1996ik c1996ik, int i) {
                        c3001nr2.m11772lr();
                        if (z) {
                            C2988fi.m11683ri(C2987di.this.f9127lr).m11686ri(adSlot, c3289ri);
                        } else {
                            if (lrVar2 == null || C3299nr.m14639ka().m14896zf() != 1) {
                                return;
                            }
                            lrVar2.onAdLoaded(c3001nr2.m11773ri());
                        }
                    }

                    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo6290ri(C1996ik c1996ik, int i, String str) {
                        if (lrVar2 == null || C3299nr.m14639ka().m14896zf() != 1) {
                            return;
                        }
                        lrVar2.onError(i, str);
                    }
                });
            } else {
                c3001nr2 = c3001nr;
                lrVar2 = lrVar;
                z2 = z3;
            }
            z3 = z2;
        } else {
            c3001nr2 = c3001nr;
            lrVar2 = lrVar;
            if (z) {
                C2988fi.m11683ri(this.f9127lr).m11686ri(adSlot, c3289ri);
            }
        }
        if (z3) {
            lrVar2.onAdLoaded(c3001nr2.m11773ri());
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f9124fi != null) {
            try {
                com.bytedance.sdk.component.utils.jbs.m10235ri().removeCallbacks(this.f9124fi);
            } catch (Exception unused) {
            }
            this.f9124fi = null;
        }
        m11655ik();
    }

    /* JADX INFO: renamed from: ri */
    public void m11672ri() {
        try {
            C2988fi.m11683ri(this.f9127lr).m11685ri();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11673ri(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        m11659lr(adSlot);
    }

    /* JADX INFO: renamed from: ri */
    public void m11674ri(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        m11660lr(adSlot, pAGInterstitialAdLoadListener);
    }

    /* JADX INFO: renamed from: ri */
    public void m11675ri(String str, wjv wjvVar) {
        C2988fi.m11683ri(this.f9127lr).m11688ri(str, wjvVar);
    }
}
