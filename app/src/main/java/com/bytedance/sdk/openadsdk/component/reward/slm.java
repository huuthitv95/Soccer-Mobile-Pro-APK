package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.AbstractC1993lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.xha.C2009lr;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.component.utils.C2728su;
import com.bytedance.sdk.component.utils.C2730vr;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
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

/* JADX INFO: loaded from: classes3.dex */
public class slm {

    /* JADX INFO: renamed from: ri */
    private static volatile slm f9531ri;

    /* JADX INFO: renamed from: fi */
    private AbstractRunnableC2676ik f9533fi;

    /* JADX INFO: renamed from: lr */
    private final Context f9536lr;

    /* JADX INFO: renamed from: ik */
    private final AtomicBoolean f9534ik = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ka */
    private final List<C3051lr> f9535ka = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: di */
    private final C2728su.ri f9532di = new C2728su.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.6
        @Override // com.bytedance.sdk.component.utils.C2728su.ri
        /* JADX INFO: renamed from: ri */
        public void mo10299ri(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (slm.this.f9533fi == null) {
                    slm.this.f9533fi = new C2989ik("net connect task", slm.this.f9535ka);
                }
                com.bytedance.sdk.component.utils.jbs.m10235ri().post(slm.this.f9533fi);
            }
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.slm$ik */
    private static class C3050ik implements PAGRewardedAdLoadListener {

        /* JADX INFO: renamed from: ik */
        private final AtomicInteger f9558ik;

        /* JADX INFO: renamed from: ka */
        private final C3289ri f9559ka;

        /* JADX INFO: renamed from: lr */
        private final AtomicBoolean f9560lr;

        /* JADX INFO: renamed from: ri */
        private final PAGRewardedAdLoadListener f9561ri;

        private C3050ik(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, C3289ri c3289ri) {
            this.f9560lr = new AtomicBoolean(false);
            this.f9561ri = pAGRewardedAdLoadListener;
            this.f9559ka = c3289ri;
            this.f9558ik = new AtomicInteger(m12205ri());
        }

        /* JADX INFO: renamed from: ri */
        private int m12205ri() {
            if (!this.f9559ka.m14249fi()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.f9559ka.m14252ka().size(); i2++) {
                wjv wjvVar = this.f9559ka.m14252ka().get(i2);
                if (wjvVar != null && !C3279dw.m14090ik(wjvVar) && wjvVar.m14389eu() != null) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
        public void onError(int i, String str) {
            if (this.f9558ik.decrementAndGet() > 0 || this.f9561ri == null || !this.f9560lr.compareAndSet(false, true)) {
                return;
            }
            this.f9561ri.onError(i, str);
            C3521ka.m15952ri("choose_ad_load_error", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.ik.1
                @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                /* JADX INFO: renamed from: ri */
                public InterfaceC3530ik mo11574ri() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", C3050ik.this.f9559ka.m14253lr());
                    return C3531ka.m15967lr().m15985ri("choose_ad_load_error").m15980lr(jSONObject.toString());
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.f9558ik.decrementAndGet();
            if (this.f9561ri == null || !this.f9560lr.compareAndSet(false, true)) {
                return;
            }
            this.f9561ri.onAdLoaded(pAGRewardedAd);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.slm$lr */
    public static class C3051lr extends AbstractRunnableC2676ik {

        /* JADX INFO: renamed from: ik */
        final C3289ri f9563ik;

        /* JADX INFO: renamed from: lr */
        final AdSlot f9564lr;

        /* JADX INFO: renamed from: ri */
        final wjv f9565ri;

        C3051lr(wjv wjvVar, AdSlot adSlot, C3289ri c3289ri) {
            super("Reward Task");
            this.f9565ri = wjvVar;
            this.f9564lr = adSlot;
            this.f9563ik = c3289ri;
        }

        @Override // java.lang.Runnable
        public void run() {
            wjv wjvVar = this.f9565ri;
            if (wjvVar == null || wjvVar.m14389eu() == null) {
                return;
            }
            C3126lr c3126lrM14345ri = wjv.m14345ri(CacheDirFactory.getICacheDir(this.f9565ri.m14476qf()).mo6274ri(), this.f9565ri);
            c3126lrM14345ri.m6328ri("material_meta", this.f9565ri);
            c3126lrM14345ri.m6328ri("ad_slot", this.f9564lr);
            C3113ri.m12651ri(c3126lrM14345ri, new AbstractC1993lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.lr.1
                @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo6289ri(C1996ik c1996ik, int i) {
                    C3077vr.m12315ri(C3299nr.m14642ri()).m12318ri(C3051lr.this.f9564lr, C3051lr.this.f9563ik);
                }

                @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo6290ri(C1996ik c1996ik, int i, String str) {
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.slm$ri */
    private static class C3052ri implements PAGRewardedAdLoadListener {

        /* JADX INFO: renamed from: fi */
        private final boolean f9567fi;

        /* JADX INFO: renamed from: ik */
        private final C3289ri f9568ik;

        /* JADX INFO: renamed from: ka */
        private final PAGRewardedAdLoadListener f9569ka;

        /* JADX INFO: renamed from: lr */
        private final AdSlot f9570lr;

        /* JADX INFO: renamed from: ri */
        private final Context f9571ri;

        public C3052ri(Context context, AdSlot adSlot, C3289ri c3289ri, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z) {
            this.f9571ri = context;
            this.f9570lr = adSlot;
            this.f9568ik = c3289ri;
            this.f9569ka = pAGRewardedAdLoadListener;
            this.f9567fi = z;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
        public void onError(int i, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.f9569ka;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            slm.m12192ri(this.f9571ri).m12193ri(this.f9570lr, this.f9568ik, this.f9569ka, pAGRewardedAd, this.f9567fi);
        }
    }

    private slm(Context context) {
        this.f9536lr = context == null ? C3299nr.m14642ri() : context.getApplicationContext();
        m12187lr();
    }

    /* JADX INFO: renamed from: ik */
    private void m12184ik() {
        if (this.f9534ik.get()) {
            this.f9534ik.set(false);
            try {
                C2728su.m10297ri(this.f9532di);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m12185ik(AdSlot adSlot) {
        C3077vr.m12315ri(this.f9536lr).m12319ri(adSlot.getCodeId());
    }

    /* JADX INFO: renamed from: lr */
    private void m12187lr() {
        if (this.f9534ik.get()) {
            return;
        }
        this.f9534ik.set(true);
        C2728su.m10298ri(this.f9532di, this.f9536lr);
    }

    /* JADX INFO: renamed from: lr */
    private void m12188lr(final AdSlot adSlot) {
        igq igqVar = new igq();
        igqVar.f11280lr = 2;
        if (C3299nr.m14639ka().m14836co(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            igqVar.jbs = 2;
        }
        C3299nr.m14638ik().mo12638ri(adSlot, igqVar, 7, new C3331uq() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.1

            /* JADX INFO: renamed from: ri */
            boolean f9539ri = false;

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.ihz
            /* JADX INFO: renamed from: ri */
            public String mo11676ri() {
                return C3077vr.m12315ri(slm.this.f9536lr).m12316ri(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10890ri(int i, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10891ri(C3289ri c3289ri, C3282ik c3282ik) {
                if (this.f9539ri || c3289ri.m14252ka() == null || c3289ri.m14252ka().isEmpty()) {
                    return;
                }
                slm.this.m12199ri(c3289ri, new tan(slm.this.f9536lr, c3289ri, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.ihz
            /* JADX INFO: renamed from: ri */
            public boolean mo11677ri(C3289ri c3289ri) {
                boolean zM12321ri = C3077vr.m12315ri(slm.this.f9536lr).m12321ri(c3289ri);
                this.f9539ri = zM12321ri;
                return zM12321ri;
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    private void m12189lr(final AdSlot adSlot, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (C2730vr.m10314ik()) {
            C2009lr.m6445ri(adSlot.getBidAdm());
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        igq igqVar = new igq();
        igqVar.f11280lr = 1;
        if (C3299nr.m14639ka().m14836co(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            igqVar.jbs = 2;
        }
        C3299nr.m14638ik().mo12638ri(adSlot, igqVar, 7, new C3331uq() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.2

            /* JADX INFO: renamed from: ri */
            boolean f9544ri = false;

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.ihz
            /* JADX INFO: renamed from: ri */
            public String mo11676ri() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strM12316ri = C3077vr.m12315ri(slm.this.f9536lr).m12316ri(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strM12316ri)) {
                    return null;
                }
                return strM12316ri;
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10890ri(int i, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10891ri(C3289ri c3289ri, C3282ik c3282ik) {
                C3289ri c3289ri2;
                if (c3289ri.m14252ka() == null || c3289ri.m14252ka().isEmpty()) {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                    if (pAGRewardedAdLoadListener2 != null) {
                        pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.jbs.m13550ri(-3));
                        c3282ik.m14181ri(-3);
                        c3282ik.m14175ik(6);
                        C3282ik.m14172ri(c3282ik);
                        return;
                    }
                    return;
                }
                tan tanVar = new tan(slm.this.f9536lr, c3289ri, adSlot);
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    C3550ka.m16268ri().m16271ri(c3289ri.m14252ka().isEmpty() ? null : c3289ri.m14252ka().get(0));
                    C3521ka.m15947ri(c3289ri.m14248di(), System.currentTimeMillis() - jCurrentTimeMillis);
                }
                if (pAGRewardedAdLoadListener == null || C3299nr.m14639ka().m14896zf() != 0) {
                    c3289ri2 = c3289ri;
                } else {
                    slm.this.m12193ri(adSlot, c3289ri, pAGRewardedAdLoadListener, tanVar.m12210ri(), this.f9544ri);
                    c3289ri2 = c3289ri;
                }
                slm.this.m12199ri(c3289ri2, tanVar, adSlot, false, pAGRewardedAdLoadListener);
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.ihz
            /* JADX INFO: renamed from: ri */
            public boolean mo11677ri(C3289ri c3289ri) {
                boolean zM12321ri = C3077vr.m12315ri(slm.this.f9536lr).m12321ri(c3289ri);
                this.f9544ri = zM12321ri;
                return zM12321ri;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static slm m12192ri(Context context) {
        if (f9531ri == null) {
            synchronized (slm.class) {
                if (f9531ri == null) {
                    f9531ri = new slm(context);
                }
            }
        }
        return f9531ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m12193ri(final AdSlot adSlot, final C3289ri c3289ri, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, final boolean z) {
        C3332vr.m14978lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    slm.this.m12185ik(adSlot);
                } else {
                    C3077vr.m12315ri(slm.this.f9536lr).m12318ri(adSlot, c3289ri);
                    slm.this.m12185ik(adSlot);
                }
            }
        });
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m12194ri(C3051lr c3051lr) {
        if (c3051lr == null) {
            return;
        }
        if (this.f9535ka.size() > 0) {
            this.f9535ka.remove(0);
        }
        this.f9535ka.add(c3051lr);
    }

    /* JADX INFO: renamed from: ri */
    private void m12198ri(C3289ri c3289ri) {
        C3281fr c3281frM14258qt = c3289ri.m14258qt();
        int iSlm = c3289ri.m14257mj() ? 10 : 1;
        if (c3281frM14258qt != null) {
            iSlm = c3281frM14258qt.slm();
        }
        for (final int i = 0; i < c3289ri.m14252ka().size(); i++) {
            wjv wjvVar = c3289ri.m14252ka().get(i);
            if (i >= iSlm) {
                return;
            }
            C3116ri.m12672ri().m12686ri(wjvVar, new C3116ri.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.3
                @Override // com.bytedance.sdk.openadsdk.core.bgr.p196ik.C3116ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo11678ri(boolean z) {
                    C2707ac.m10205ri("RewardVideoLoadManager", "onCachedResponse: i=" + i + ", isSuccess=" + z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m12199ri(C3289ri c3289ri, tan tanVar, AdSlot adSlot, boolean z, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (!z) {
            C2901ri.m11167ri().m11178ri(c3289ri.m14248di());
        }
        AdSlot adSlot2 = adSlot;
        C3050ik c3050ik = new C3050ik(new C3052ri(this.f9536lr, adSlot2, c3289ri, pAGRewardedAdLoadListener, false), c3289ri);
        m12198ri(c3289ri);
        int i = 0;
        while (i < c3289ri.m14252ka().size()) {
            wjv wjvVar = c3289ri.m14252ka().get(i);
            int iM14453nd = wjvVar.m14453nd();
            if (i == 0 && iM14453nd == 43) {
                wjvVar.m14389eu().m6340di(0);
            }
            tan tanVar2 = tanVar;
            boolean z2 = z;
            AdSlot adSlot3 = adSlot2;
            m12200ri(c3289ri, wjvVar, tanVar2, adSlot3, z2, c3050ik);
            adSlot2 = adSlot3;
            if (c3289ri.m14257mj() && iM14453nd != 43) {
                return;
            }
            i++;
            tanVar = tanVar2;
            z = z2;
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m12200ri(final C3289ri c3289ri, wjv wjvVar, tan tanVar, final AdSlot adSlot, final boolean z, C3050ik c3050ik) {
        final tan tanVar2;
        final C3050ik c3050ik2;
        if (z && !C3279dw.m14090ik(wjvVar) && C3299nr.m14639ka().m14883su(adSlot.getCodeId()).f11591ka == 1 && !C2724nr.m10256ka(this.f9536lr)) {
            m12194ri(new C3051lr(wjvVar, adSlot, c3289ri));
            return;
        }
        boolean z2 = false;
        boolean z3 = c3050ik != null && C3299nr.m14639ka().m14896zf() == 1;
        if (C3279dw.m14090ik(wjvVar)) {
            tanVar2 = tanVar;
            c3050ik2 = c3050ik;
            if (z) {
                C3077vr.m12315ri(this.f9536lr).m12318ri(adSlot, c3289ri);
            }
        } else {
            if (wjvVar.m14389eu() != null) {
                C3126lr c3126lrM14345ri = wjv.m14345ri(CacheDirFactory.getICacheDir(wjvVar.m14476qf()).mo6274ri(), wjvVar);
                c3126lrM14345ri.m6328ri("material_meta", wjvVar);
                c3126lrM14345ri.m6328ri("ad_slot", adSlot);
                tanVar2 = tanVar;
                c3050ik2 = c3050ik;
                C3113ri.m12651ri(c3126lrM14345ri, new AbstractC1993lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.4
                    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo6289ri(C1996ik c1996ik, int i) {
                        tanVar2.m12209lr();
                        if (z) {
                            C3077vr.m12315ri(slm.this.f9536lr).m12318ri(adSlot, c3289ri);
                        } else {
                            if (c3050ik2 == null || C3299nr.m14639ka().m14896zf() != 1) {
                                return;
                            }
                            c3050ik2.onAdLoaded(tanVar2.m12210ri());
                        }
                    }

                    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo6290ri(C1996ik c1996ik, int i, String str) {
                        if (c3050ik2 == null || C3299nr.m14639ka().m14896zf() != 1) {
                            return;
                        }
                        c3050ik2.onError(i, str);
                    }
                });
            } else {
                tanVar2 = tanVar;
                c3050ik2 = c3050ik;
                z2 = z3;
            }
            z3 = z2;
        }
        if (z3) {
            c3050ik2.onAdLoaded(tanVar2.m12210ri());
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f9533fi != null) {
            try {
                com.bytedance.sdk.component.utils.jbs.m10235ri().removeCallbacks(this.f9533fi);
            } catch (Exception unused) {
            }
            this.f9533fi = null;
        }
        m12184ik();
    }

    /* JADX INFO: renamed from: ri */
    public void m12201ri() {
        try {
            C3077vr.m12315ri(this.f9536lr).m12317ri();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12202ri(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        m12188lr(adSlot);
    }

    /* JADX INFO: renamed from: ri */
    public void m12203ri(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        m12189lr(adSlot, pAGRewardedAdLoadListener);
    }

    /* JADX INFO: renamed from: ri */
    public void m12204ri(String str, wjv wjvVar) {
        C3077vr.m12315ri(this.f9536lr).m12320ri(str, wjvVar);
    }
}
