package com.bytedance.sdk.openadsdk.p252ri.p256lr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.C3128bu;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p221ka.xha;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3593su;
import com.bytedance.sdk.openadsdk.utils.ory;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ri.lr.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C3505mj extends PAGNativeAd {

    /* JADX INFO: renamed from: di */
    protected int f12697di;

    /* JADX INFO: renamed from: fi */
    protected int f12698fi;

    /* JADX INFO: renamed from: ik */
    protected final Context f12699ik;
    private boolean jbs;

    /* JADX INFO: renamed from: ka */
    protected C3506ri f12700ka;

    /* JADX INFO: renamed from: lr */
    protected final wjv f12701lr;

    /* JADX INFO: renamed from: mj */
    private boolean f12702mj;

    /* JADX INFO: renamed from: ri */
    protected C3128bu f12703ri;
    protected String xha;

    public C3505mj(Context context, wjv wjvVar, int i, boolean z) {
        this.f12701lr = wjvVar;
        this.f12699ik = context;
        this.f12698fi = i;
        this.f12697di = wjvVar.m14545ur();
        this.xha = C3571ig.m16444ik(i);
        if (z) {
            this.f12700ka = new C3506ri(context, wjvVar, this.xha);
            this.f12703ri = new C3128bu(context, this, wjvVar, m15872ri(i), this.f12700ka);
        }
    }

    /* JADX INFO: renamed from: ri */
    private String m15872ri(int i) {
        if (i != 1) {
            return i != 2 ? "embeded_ad" : "interaction";
        }
        return "banner_ad";
    }

    /* JADX INFO: renamed from: ri */
    private List<View> m15873ri(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                linkedList.add(list.get(i));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedList.add(list2.get(i2));
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        wjv wjvVar = this.f12701lr;
        if (wjvVar == null || wjvVar.iyl() == null) {
            return null;
        }
        try {
            return this.f12701lr.iyl().get(str);
        } catch (Throwable th) {
            C2707ac.m10196ik("TTNativeAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        wjv wjvVar = this.f12701lr;
        if (wjvVar != null) {
            return wjvVar.iyl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new C3503ka(m15874mj());
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.jbs) {
            return;
        }
        ory.m16565ri(this.f12701lr, d, str, str2);
        this.jbs = true;
    }

    /* JADX INFO: renamed from: mj */
    public C3506ri m15874mj() {
        return this.f12700ka;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null || list == null || list.size() <= 0) {
            return;
        }
        m15875ri(viewGroup, null, list, list2, view, new xha(pAGNativeAdInteractionListener));
    }

    /* JADX INFO: renamed from: ri */
    public void m15875ri(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, final InterfaceC3500di interfaceC3500di) {
        if (viewGroup == null || list2 == null || list2.size() <= 0) {
            return;
        }
        if (xha()) {
            list3 = m15873ri(list2, list3);
        }
        List<View> list4 = list3;
        if (view != null && interfaceC3500di != null && interfaceC3500di.mo15861lr()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ri.lr.mj.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    final String strM16658ri = C3593su.m16658ri();
                    TTDelegateActivity.m10600ri(C3505mj.this.f12701lr, strM16658ri, new xha.InterfaceC3266ri() { // from class: com.bytedance.sdk.openadsdk.ri.lr.mj.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.p221ka.xha.InterfaceC3266ri
                        /* JADX INFO: renamed from: ri */
                        public void mo13880ri() {
                            interfaceC3500di.mo15862ri();
                            C3304qt.m14669lr().m14682di(strM16658ri);
                            PAGMediaView pAGMediaViewM15890ri = C3505mj.this.m15874mj().m15890ri();
                            if (pAGMediaViewM15890ri != null) {
                                pAGMediaViewM15890ri.close();
                            }
                        }
                    });
                }
            });
        }
        this.f12703ri.m13018ri(viewGroup, list, list2, list4, interfaceC3500di);
        wjv wjvVar = this.f12701lr;
        C2889fi.m11110ri(viewGroup, this.f12701lr, (wjvVar == null || wjvVar.ajz() != 2) ? null : new C2889fi.ri(this.f12701lr.hpn()));
    }

    /* JADX INFO: renamed from: ri */
    protected void mo15871ri(String str) {
        this.xha = str;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.f12702mj) {
            return;
        }
        ory.m16564ri(this.f12701lr, d);
        this.f12702mj = true;
    }

    protected boolean xha() {
        wjv wjvVar = this.f12701lr;
        return (wjvVar == null || wjvVar.adz() == 5 || C3299nr.m14639ka().m14851ik(this.f12697di) != 1) ? false : true;
    }
}
