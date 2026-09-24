package com.bytedance.sdk.openadsdk.core.bgr.p195fi;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.p056lr.C1982ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bytedance.sdk.component.p160lr.p161ri.xha;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3402co;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3409qt;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3410ri;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3411sf;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.jbs;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p239ri.C3413ri;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.fi.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3113ri {

    /* JADX INFO: renamed from: ri */
    public static final InterfaceC1994ri f9947ri = new C1982ri();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public static void m12647ik(C1996ik c1996ik, wjv wjvVar, AdSlot adSlot) {
        if (m12655ri(c1996ik)) {
            C3410ri c3410riM15489ri = C3413ri.m15489ri(wjvVar, (String) null, -1, c1996ik);
            c3410riM15489ri.m15446ri(new jbs(c1996ik.slm(), c1996ik.m6304di()));
            C3413ri.m15487lr(c3410riM15489ri);
        }
    }

    /* JADX INFO: renamed from: lr */
    private static void m12648lr(C1996ik c1996ik, wjv wjvVar, AdSlot adSlot) {
        if (m12655ri(c1996ik)) {
            long jM6303co = c1996ik.m6300aw() ? c1996ik.m6303co() : c1996ik.m6304di();
            C3410ri c3410riM15489ri = C3413ri.m15489ri(wjvVar, (String) null, -1, c1996ik);
            c3410riM15489ri.m15446ri(new C3411sf(c1996ik.slm(), jM6303co));
            C3521ka.m15949ri("load_video_start", c3410riM15489ri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static void m12649lr(C1996ik c1996ik, wjv wjvVar, AdSlot adSlot, long j) {
        if (m12655ri(c1996ik)) {
            C3410ri c3410riM15489ri = C3413ri.m15489ri(wjvVar, (String) null, -1, c1996ik);
            C3402co c3402co = new C3402co();
            c3402co.m15416ri(c1996ik.slm());
            c3402co.m15415ri(c1996ik.m6304di());
            c3402co.m15414lr(j);
            if (c1996ik.m6333uq() == 1) {
                c3402co.m15413ik(1L);
            } else {
                c3402co.m15413ik(0L);
            }
            c3410riM15489ri.m15446ri(c3402co);
            C3521ka.m15949ri("load_video_success", c3410riM15489ri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static void m12650lr(C1996ik c1996ik, wjv wjvVar, AdSlot adSlot, long j, int i, String str) {
        if (m12655ri(c1996ik)) {
            C3410ri c3410riM15489ri = C3413ri.m15489ri(wjvVar, (String) null, -1, c1996ik);
            C3409qt c3409qt = new C3409qt();
            c3409qt.m15439ri(c1996ik.slm());
            c3409qt.m15438ri(c1996ik.m6304di());
            c3409qt.m15435lr(j);
            c3409qt.m15437ri(i);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            c3409qt.m15436lr(str);
            c3409qt.m15434ik("");
            c3410riM15489ri.m15446ri(c3409qt);
            C3413ri.m15497ri(c3410riM15489ri);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m12651ri(final C1996ik c1996ik, final InterfaceC1994ri.ri riVar) {
        wjv wjvVar;
        AdSlot adSlot;
        if ((c1996ik.m6304di() > 0 || c1996ik.m6300aw()) && c1996ik.m6323nr() != -2) {
            if (c1996ik.m6323nr() != 1) {
                c1996ik.m6308fi(6000);
                c1996ik.m6305di(6000);
                c1996ik.xha(6000);
                boolean z = c1996ik.m6306fi("material_meta") != null && (c1996ik.m6306fi("material_meta") instanceof wjv);
                boolean z2 = c1996ik.m6306fi("ad_slot") != null && (c1996ik.m6306fi("ad_slot") instanceof AdSlot);
                if (z && z2) {
                    wjv wjvVar2 = (wjv) c1996ik.m6306fi("material_meta");
                    AdSlot adSlot2 = (AdSlot) c1996ik.m6306fi("ad_slot");
                    m12648lr(c1996ik, wjvVar2, adSlot2);
                    wjvVar = wjvVar2;
                    adSlot = adSlot2;
                } else {
                    wjvVar = null;
                    adSlot = null;
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final AdSlot adSlot3 = adSlot;
                final wjv wjvVar3 = wjvVar;
                final InterfaceC1994ri.ri riVar2 = new InterfaceC1994ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.fi.ri.1
                    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                    /* JADX INFO: renamed from: lr */
                    public void mo6288lr(C1996ik c1996ik2, int i) {
                        AdSlot adSlot4;
                        InterfaceC1994ri.ri riVar3 = riVar;
                        if (riVar3 != null) {
                            riVar3.mo6289ri(c1996ik2, i);
                        }
                        wjv wjvVar4 = wjvVar3;
                        if (wjvVar4 != null && (adSlot4 = adSlot3) != null) {
                            C3113ri.m12647ik(c1996ik, wjvVar4, adSlot4);
                        }
                        c1996ik.m6302bu();
                    }

                    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo6289ri(C1996ik c1996ik2, int i) {
                        InterfaceC1994ri.ri riVar3 = riVar;
                        if (riVar3 != null) {
                            riVar3.mo6289ri(c1996ik2, i);
                        }
                        if (wjvVar3 == null || adSlot3 == null) {
                            return;
                        }
                        C3113ri.m12649lr(c1996ik, wjvVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    }

                    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo6290ri(C1996ik c1996ik2, int i, String str) {
                        InterfaceC1994ri.ri riVar3 = riVar;
                        if (riVar3 != null) {
                            riVar3.mo6290ri(c1996ik2, i, str);
                        }
                        if (wjvVar3 == null || adSlot3 == null) {
                            return;
                        }
                        C3113ri.m12650lr(c1996ik, wjvVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, i, str);
                    }
                };
                if (m12656ri(c1996ik.slm())) {
                    AbstractRunnableC2676ik abstractRunnableC2676ik = new AbstractRunnableC2676ik("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.bgr.fi.ri.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                C3113ri.f9947ri.mo6245ri(C3299nr.m14642ri(), c1996ik, riVar2);
                            } catch (Throwable th) {
                                th.getMessage();
                            }
                        }
                    };
                    if (dzy.m16391di()) {
                        dzy.m16396ik((Runnable) abstractRunnableC2676ik);
                        return;
                    } else {
                        abstractRunnableC2676ik.run();
                        return;
                    }
                }
                if (riVar != null) {
                    riVar.mo6290ri(c1996ik, 404, "unexpected url: " + c1996ik.slm());
                }
                m12650lr(c1996ik, wjvVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, -1, "video url is invalid");
                return;
            }
        }
        if (riVar != null) {
            riVar.mo6289ri(c1996ik, 100);
        }
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m12655ri(C1996ik c1996ik) {
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m12656ri(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str2 = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str2 = "https:" + str.substring(4);
        } else {
            str2 = str;
        }
        return xha.m10013ik(str2) != null;
    }
}
