package com.bytedance.sdk.openadsdk.p252ri.p256lr;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.C3128bu;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3090di;
import com.bytedance.sdk.openadsdk.tan.p262ik.C3534ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ri.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3504lr extends C3505mj implements InterfaceC1999ik.ik, InterfaceC1999ik.ka, C3534ri.ri {

    /* JADX INFO: renamed from: aw */
    private long f12690aw;

    /* JADX INFO: renamed from: co */
    private AdSlot f12691co;
    private final C3534ri jbs;

    /* JADX INFO: renamed from: mj */
    private InterfaceC3502ik f12692mj;

    /* JADX INFO: renamed from: qt */
    private boolean f12693qt;

    /* JADX INFO: renamed from: sf */
    private boolean f12694sf;

    public C3504lr(Context context, wjv wjvVar, int i, AdSlot adSlot) {
        super(context, wjvVar, i, true);
        this.f12693qt = false;
        this.f12694sf = true;
        this.f12698fi = i;
        this.f12691co = adSlot;
        this.jbs = new C3534ri();
        m15867ri(this.f12697di);
        mo15871ri("embeded_ad");
        this.f12700ka.m15896ri(this);
    }

    public C3504lr(Context context, wjv wjvVar, int i, AdSlot adSlot, C3506ri c3506ri, C3128bu c3128bu) {
        super(context, wjvVar, i, false);
        this.f12693qt = false;
        this.f12694sf = true;
        this.f12700ka = c3506ri;
        this.f12703ri = c3128bu;
        this.f12698fi = i;
        this.f12691co = adSlot;
        this.jbs = new C3534ri();
        m15867ri(this.f12697di);
        mo15871ri("embeded_ad");
        c3506ri.m15896ri(this);
    }

    /* JADX INFO: renamed from: ri */
    private void m15867ri(int i) {
        int iM14858lr = C3299nr.m14639ka().m14858lr(i);
        int iM10255ik = C2724nr.m10255ik(C3299nr.m14642ri());
        if (3 == iM14858lr) {
            this.f12693qt = false;
            this.f12694sf = false;
        } else {
            if (1 == iM14858lr && C3571ig.m16451ka(iM10255ik)) {
                this.f12693qt = false;
            } else if (2 == iM14858lr) {
                if (C3571ig.m16441fi(iM10255ik) || C3571ig.m16451ka(iM10255ik) || C3571ig.m16437di(iM10255ik)) {
                    this.f12693qt = false;
                }
            } else if (4 == iM14858lr) {
                this.f12693qt = true;
            } else if (5 == iM14858lr && (C3571ig.m16451ka(iM10255ik) || C3571ig.m16437di(iM10255ik))) {
            }
            this.f12694sf = true;
        }
        if (this.f12700ka != null) {
            this.f12700ka.m15898ri(this.f12693qt);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.tan.p262ik.C3534ri.ri
    /* JADX INFO: renamed from: di */
    public C3534ri mo15868di() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: fi */
    public View m15869fi() {
        C3120di c3120di;
        if (this.f12701lr != null && this.f12699ik != null) {
            if (wjv.m14332fi(this.f12701lr)) {
                try {
                    c3120di = new C3120di(this.f12699ik, this.f12701lr, this.f12703ri.m13016ri());
                    if (this.f12701lr != null && this.f12701lr.m14576zz()) {
                        C3090di c3090diM12812ri = c3120di.m12812ri((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        if (this.f12700ka != null) {
                            this.f12700ka.m15892ri(c3090diM12812ri);
                        }
                    }
                    this.f12703ri.m13019ri(c3120di.getNativeVideoController());
                    if (this.f12700ka != null) {
                        this.f12700ka.m15893ri(c3120di);
                    }
                    c3120di.setVideoAdClickListenerTTNativeAd(this);
                    c3120di.setAdCreativeClickListener(new C3120di.ri() { // from class: com.bytedance.sdk.openadsdk.ri.lr.lr.1
                        @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di.ri
                        /* JADX INFO: renamed from: ri */
                        public void mo12820ri(View view, int i) {
                            if (C3504lr.this.f12703ri != null) {
                                C3504lr.this.f12703ri.m13017ri(view, i);
                            }
                        }
                    });
                    c3120di.setControllerStatusCallBack(new C3120di.lr() { // from class: com.bytedance.sdk.openadsdk.ri.lr.lr.2
                        @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di.lr
                        /* JADX INFO: renamed from: ri */
                        public void mo12819ri(boolean z, long j, long j2, long j3, boolean z2) {
                            C3504lr.this.jbs.f12841ri = z;
                            C3504lr.this.jbs.f12837fi = j;
                            C3504lr.this.jbs.f12836di = j2;
                            C3504lr.this.jbs.xha = j3;
                            C3504lr.this.jbs.f12839ka = z2;
                        }
                    });
                    c3120di.setVideoAdLoadListener(this);
                    c3120di.setVideoAdInteractionListener(this);
                    if (5 == this.f12698fi) {
                        c3120di.setIsAutoPlay(this.f12693qt ? this.f12691co.isAutoPlay() : this.f12694sf);
                    } else {
                        c3120di.setIsAutoPlay(this.f12694sf);
                    }
                    c3120di.m12815ri(C3299nr.m14639ka().m14853ik(String.valueOf(this.f12697di)), "feedGetAdView");
                } catch (Exception e) {
                    ApmHelper.reportCustomError("", "getAdView null", e);
                    c3120di = null;
                }
            } else {
                c3120di = null;
            }
            if (wjv.m14332fi(this.f12701lr) && c3120di != null && c3120di.m12816ri(0L, true, false)) {
                return c3120di;
            }
            ApmHelper.reportCustomError(this.f12701lr.m14552vz() + "," + c3120di, "getAdView null", new RuntimeException());
        }
        return null;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: g_ */
    public void mo6390g_() {
        InterfaceC3502ik interfaceC3502ik = this.f12692mj;
        if (interfaceC3502ik != null) {
            interfaceC3502ik.mo13807ri(this);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: h_ */
    public void mo6391h_() {
        InterfaceC3502ik interfaceC3502ik = this.f12692mj;
        if (interfaceC3502ik != null) {
            interfaceC3502ik.mo13805lr(this);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: i_ */
    public void mo6392i_() {
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: j_ */
    public void mo6393j_() {
        InterfaceC3502ik interfaceC3502ik = this.f12692mj;
        if (interfaceC3502ik != null) {
            interfaceC3502ik.mo13804ik(this);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ka
    /* JADX INFO: renamed from: ri */
    public void mo6395ri(int i, int i2) {
        InterfaceC3502ik interfaceC3502ik = this.f12692mj;
        if (interfaceC3502ik != null) {
            interfaceC3502ik.mo13806ri(i, i2);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: ri */
    public void mo6394ri(long j, long j2) {
        this.f12690aw = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m15870ri(InterfaceC3502ik interfaceC3502ik) {
        this.f12692mj = interfaceC3502ik;
    }

    @Override // com.bytedance.sdk.openadsdk.p252ri.p256lr.C3505mj
    /* JADX INFO: renamed from: ri */
    protected void mo15871ri(String str) {
        super.mo15871ri(str);
    }

    @Override // com.bytedance.sdk.openadsdk.p252ri.p256lr.C3505mj, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        if (this.f12700ka != null) {
            this.f12700ka.m15882co();
        }
    }
}
