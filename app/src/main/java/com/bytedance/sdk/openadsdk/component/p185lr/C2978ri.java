package com.bytedance.sdk.openadsdk.component.p185lr;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.xha;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3331uq;
import com.bytedance.sdk.openadsdk.core.bgr.p195fi.C3113ri;
import com.bytedance.sdk.openadsdk.core.bgr.p199ri.C3126lr;
import com.bytedance.sdk.openadsdk.core.jbs;
import com.bytedance.sdk.openadsdk.core.model.C3282ik;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.igq;
import com.bytedance.sdk.openadsdk.core.wjv;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.C3504lr;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.p257ri.C3507ik;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.p257ri.C3508lr;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.utils.C3582pv;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2978ri {

    /* JADX INFO: renamed from: ri */
    private static volatile C2978ri f9072ri;

    /* JADX INFO: renamed from: lr */
    private final wjv f9073lr = C3299nr.m14638ik();

    private C2978ri() {
    }

    /* JADX INFO: renamed from: ri */
    private PAGNativeAd m11581ri(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot) {
        if (wjvVar.ajz() != 2) {
            return new C3504lr(context, wjvVar, 5, adSlot);
        }
        return wjvVar.m14389eu() != null ? new C3508lr(context, wjvVar, adSlot) : new C3507ik(context, wjvVar, adSlot);
    }

    /* JADX INFO: renamed from: ri */
    public static C2978ri m11582ri() {
        if (f9072ri == null) {
            synchronized (C2978ri.class) {
                if (f9072ri == null) {
                    f9072ri = new C2978ri();
                }
            }
        }
        return f9072ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11584ri(C3289ri c3289ri, C3282ik c3282ik, Context context, AdSlot adSlot, xha xhaVar, C3582pv c3582pv) {
        if (c3289ri.m14252ka() == null || c3289ri.m14252ka().isEmpty()) {
            xhaVar.onError(-3, jbs.m13550ri(-3));
            c3282ik.m14181ri(-3);
            c3282ik.m14175ik(4);
            C3282ik.m14172ri(c3282ik);
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.wjv> listM14252ka = c3289ri.m14252ka();
        ArrayList arrayList = new ArrayList(listM14252ka.size());
        for (com.bytedance.sdk.openadsdk.core.model.wjv wjvVar : listM14252ka) {
            if (com.bytedance.sdk.openadsdk.core.model.wjv.m14332fi(wjvVar) || (wjvVar != null && wjvVar.pye())) {
                PAGNativeAd pAGNativeAdM11581ri = m11581ri(context, wjvVar, adSlot);
                if (xhaVar instanceof PAGNativeAdLoadListener) {
                    arrayList.add(pAGNativeAdM11581ri);
                }
            }
            if (com.bytedance.sdk.openadsdk.core.model.wjv.m14332fi(wjvVar) && wjvVar.m14389eu() != null && wjvVar.m14389eu().m6364sf() != null) {
                if (C3299nr.m14639ka().m14845fi(String.valueOf(wjvVar.m14545ur())) && C3299nr.m14639ka().m14895zb()) {
                    if (wjvVar.m14389eu() != null) {
                        wjvVar.m14389eu().m6340di(1);
                    }
                    if (wjvVar.kvj() != null) {
                        wjvVar.kvj().m6340di(1);
                    }
                    C3126lr c3126lrM14345ri = com.bytedance.sdk.openadsdk.core.model.wjv.m14345ri(CacheDirFactory.getICacheDir(wjvVar.m14476qf()).mo6270ik(), wjvVar);
                    c3126lrM14345ri.m6328ri("material_meta", wjvVar);
                    c3126lrM14345ri.m6328ri("ad_slot", adSlot);
                    C3113ri.m12651ri(c3126lrM14345ri, null);
                }
                IPBroadcastReceiver.m15814lr(context, wjvVar);
            }
        }
        boolean z = xhaVar instanceof PAGNativeAdLoadListener;
        if (!z || arrayList.isEmpty()) {
            xhaVar.onError(-4, jbs.m13550ri(-4));
            c3282ik.m14181ri(-4);
            c3282ik.m14175ik(4);
            C3282ik.m14172ri(c3282ik);
            return;
        }
        if (adSlot != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
            C3521ka.m15947ri(listM14252ka.get(0), c3582pv.m16570ka());
        }
        if (z) {
            ((PAGNativeAdLoadListener) xhaVar).onAdLoaded(arrayList.get(0));
        }
        if (c3282ik.m14173fi() == null || c3282ik.m14173fi().isEmpty()) {
            return;
        }
        c3282ik.m14175ik(4);
        C3282ik.m14172ri(c3282ik);
    }

    /* JADX INFO: renamed from: ri */
    public void m11585ri(final Context context, final AdSlot adSlot, final xha xhaVar) {
        final C3582pv c3582pvM16567lr = C3582pv.m16567lr();
        this.f9073lr.mo12638ri(adSlot, new igq(), 5, new C3331uq() { // from class: com.bytedance.sdk.openadsdk.component.lr.ri.1
            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10890ri(int i, String str) {
                xhaVar.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10891ri(C3289ri c3289ri, C3282ik c3282ik) {
                C2978ri.this.m11584ri(c3289ri, c3282ik, context, adSlot, xhaVar, c3582pvM16567lr);
            }
        });
    }
}
