package com.bytedance.sdk.openadsdk.core.p221ka;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.ory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends PAGBannerAd {

    /* JADX INFO: renamed from: di */
    private C3254fi f11045di;

    /* JADX INFO: renamed from: fi */
    private boolean f11046fi;

    /* JADX INFO: renamed from: ik */
    protected AdSlot f11047ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private boolean f11048ka;

    /* JADX INFO: renamed from: lr */
    protected wjv f11049lr;

    /* JADX INFO: renamed from: mj */
    private int f11050mj;

    /* JADX INFO: renamed from: qt */
    private final AtomicBoolean f11051qt = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ri */
    protected Context f11052ri;

    /* JADX INFO: renamed from: sf */
    private List<C3263ri> f11053sf;
    private boolean xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka.xha$ri */
    public interface InterfaceC3266ri {
        /* JADX INFO: renamed from: ri */
        void mo13880ri();
    }

    public xha(Context context, wjv wjvVar, AdSlot adSlot) {
        this.f11050mj = 0;
        this.jbs = 0;
        this.f11052ri = context;
        this.f11049lr = wjvVar;
        this.f11047ik = adSlot;
        this.f11050mj = (int) adSlot.getExpressViewAcceptedWidth();
        this.jbs = (int) this.f11047ik.getExpressViewAcceptedHeight();
        m13884ri(this.f11049lr);
        m13881lr(wjvVar);
    }

    /* JADX INFO: renamed from: lr */
    private void m13881lr(wjv wjvVar) {
        C3289ri c3289riM14428ka;
        if (wjvVar == null || (c3289riM14428ka = wjvVar.m14428ka()) == null) {
            return;
        }
        this.f11053sf = new ArrayList();
        int size = c3289riM14428ka.m14252ka().size();
        if (!this.xha) {
            this.f11053sf.add(new C3263ri(this.f11052ri, wjvVar, this.f11047ik, this, false));
            return;
        }
        this.f11045di = new C3254fi(c3289riM14428ka.xha(), this.f11052ri, this.f11050mj, this.jbs);
        for (int i = 0; i < size; i++) {
            this.f11047ik.setExpressViewAccepted(((this.f11050mj - C3583qd.m16581ik(this.f11052ri, c3289riM14428ka.xha().m14321fi())) - C3583qd.m16581ik(this.f11052ri, c3289riM14428ka.xha().m14320di())) - (C3583qd.m16581ik(this.f11052ri, c3289riM14428ka.xha().xha()) * 2), this.jbs);
            wjv wjvVar2 = c3289riM14428ka.m14252ka().get(i);
            if (i != 0) {
                m13883ri(i, wjvVar2);
            }
            C3263ri c3263ri = new C3263ri(this.f11052ri, wjvVar2, this.f11047ik, this, true);
            c3263ri.m13875ri(i);
            this.f11053sf.add(c3263ri);
        }
        this.f11045di.m13795ri(this.f11053sf);
    }

    /* JADX INFO: renamed from: ri */
    private void m13883ri(int i, wjv wjvVar) {
        if (i != 0) {
            if (!TextUtils.isEmpty(wjvVar.m14410id())) {
                wjvVar.bgr("0");
            }
            Map<String, Object> mapIyl = wjvVar.iyl();
            if (mapIyl == null || !mapIyl.containsKey("price")) {
                return;
            }
            mapIyl.put("price", "0");
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX INFO: renamed from: ri */
    private void m13884ri(wjv wjvVar) {
        C3289ri c3289riM14428ka;
        boolean z;
        if (wjvVar == null || (c3289riM14428ka = wjvVar.m14428ka()) == null) {
            return;
        }
        if (c3289riM14428ka.m14257mj()) {
            z = c3289riM14428ka.m14252ka().size() > 1;
        }
        this.xha = z;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        try {
            List<C3263ri> list = this.f11053sf;
            if (list == null || list.isEmpty()) {
                return;
            }
            if (this.xha) {
                this.f11045di.m13792ri();
            } else {
                this.f11053sf.get(0).xha();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public PAGBannerSize getBannerSize() {
        return this.f11047ik != null ? new PAGBannerSize(this.f11050mj, this.jbs) : new PAGBannerSize(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        try {
            List<C3263ri> list = this.f11053sf;
            if (list != null && !list.isEmpty()) {
                return this.xha ? this.f11045di.m13790lr() : this.f11053sf.get(0).m13874ri();
            }
        } catch (Throwable unused) {
        }
        return new View(this.f11052ri);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        wjv wjvVar = this.f11049lr;
        if (wjvVar == null || wjvVar.iyl() == null) {
            return null;
        }
        try {
            return this.f11049lr.iyl().get(str);
        } catch (Throwable th) {
            C2707ac.m10196ik("PAGBannerAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        wjv wjvVar = this.f11049lr;
        if (wjvVar != null) {
            return wjvVar.iyl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.f11046fi) {
            return;
        }
        ory.m16565ri(this.f11049lr, d, str, str2);
        this.f11046fi = true;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m13885ri() {
        return this.xha;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(final PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        List<C3263ri> list = this.f11053sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.f11053sf.size(); i++) {
            this.f11053sf.get(i).m13876ri(new PAGBannerAdInteractionCallback() { // from class: com.bytedance.sdk.openadsdk.core.ka.xha.1
                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback
                public void onAdShowFailed(PAGErrorModel pAGErrorModel) {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdShowFailed(pAGErrorModel);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2;
                    if (!xha.this.f11051qt.compareAndSet(false, true) || (pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback) == null) {
                        return;
                    }
                    pAGBannerAdInteractionCallback2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(final PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        List<C3263ri> list = this.f11053sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.f11053sf.size(); i++) {
            this.f11053sf.get(i).m13877ri(new PAGBannerAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.xha.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2;
                    if (!xha.this.f11051qt.compareAndSet(false, true) || (pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener) == null) {
                        return;
                    }
                    pAGBannerAdInteractionListener2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.f11048ka) {
            return;
        }
        ory.m16564ri(this.f11049lr, d);
        this.f11048ka = true;
    }
}
