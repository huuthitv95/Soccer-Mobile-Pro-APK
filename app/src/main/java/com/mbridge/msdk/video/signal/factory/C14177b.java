package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.p291bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.signal.InterfaceC14078a;
import com.mbridge.msdk.video.signal.InterfaceC14079b;
import com.mbridge.msdk.video.signal.InterfaceC14080c;
import com.mbridge.msdk.video.signal.InterfaceC14173d;
import com.mbridge.msdk.video.signal.InterfaceC14175f;
import com.mbridge.msdk.video.signal.InterfaceC14178g;
import com.mbridge.msdk.video.signal.InterfaceC14180i;
import com.mbridge.msdk.video.signal.InterfaceC14199j;
import com.mbridge.msdk.video.signal.impl.C14189i;
import com.mbridge.msdk.video.signal.impl.C14190j;
import com.mbridge.msdk.video.signal.impl.C14191k;
import com.mbridge.msdk.video.signal.impl.C14193m;
import com.mbridge.msdk.video.signal.impl.C14194n;
import com.mbridge.msdk.video.signal.impl.C14195o;
import com.mbridge.msdk.video.signal.impl.C14197q;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.factory.b */
/* JADX INFO: compiled from: JSFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14177b extends C14176a {

    /* JADX INFO: renamed from: h */
    private Activity f40898h;

    /* JADX INFO: renamed from: i */
    private WebView f40899i;

    /* JADX INFO: renamed from: j */
    private MBridgeVideoView f40900j;

    /* JADX INFO: renamed from: k */
    private MBridgeContainerView f40901k;

    /* JADX INFO: renamed from: l */
    private CampaignEx f40902l;

    /* JADX INFO: renamed from: m */
    private MBridgeBTContainer f40903m;

    /* JADX INFO: renamed from: n */
    private InterfaceC14078a.a f40904n;

    /* JADX INFO: renamed from: o */
    private String f40905o;

    /* JADX INFO: renamed from: p */
    private List<CampaignEx> f40906p;

    public C14177b(Activity activity) {
        this.f40898h = activity;
    }

    public C14177b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, InterfaceC14078a.a aVar) {
        this.f40898h = activity;
        this.f40899i = webView;
        this.f40900j = mBridgeVideoView;
        this.f40901k = mBridgeContainerView;
        this.f40902l = campaignEx;
        this.f40904n = aVar;
        this.f40905o = mBridgeVideoView.getUnitId();
    }

    public C14177b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f40898h = activity;
        this.f40903m = mBridgeBTContainer;
        this.f40899i = webView;
    }

    /* JADX INFO: renamed from: a */
    public void m42342a(C14191k c14191k) {
        this.f40892b = c14191k;
    }

    /* JADX INFO: renamed from: a */
    public void m42343a(List<CampaignEx> list) {
        this.f40906p = list;
    }

    @Override // com.mbridge.msdk.video.signal.factory.C14176a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14079b getActivityProxy() {
        WebView webView = this.f40899i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f40891a == null) {
            this.f40891a = new C14189i(webView);
        }
        return this.f40891a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.C14176a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14180i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f40901k;
        if (mBridgeContainerView == null || (activity = this.f40898h) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f40896f == null) {
            this.f40896f = new C14195o(activity, mBridgeContainerView);
        }
        return this.f40896f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.C14176a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14080c getJSBTModule() {
        if (this.f40898h == null || this.f40903m == null) {
            return super.getJSBTModule();
        }
        if (this.f40897g == null) {
            this.f40897g = new C14190j(this.f40898h, this.f40903m);
        }
        return this.f40897g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.C14176a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14173d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f40898h;
        if (activity == null || (campaignEx = this.f40902l) == null) {
            return super.getJSCommon();
        }
        if (this.f40892b == null) {
            this.f40892b = new C14191k(activity, campaignEx);
        }
        if (this.f40902l.getDynamicTempCode() == 5 && (list = this.f40906p) != null) {
            InterfaceC14173d interfaceC14173d = this.f40892b;
            if (interfaceC14173d instanceof C14191k) {
                ((C14191k) interfaceC14173d).m42375a(list);
            }
        }
        this.f40892b.setActivity(this.f40898h);
        this.f40892b.setUnitId(this.f40905o);
        this.f40892b.mo42209a(this.f40904n);
        return this.f40892b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.C14176a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14175f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f40901k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f40895e == null) {
            this.f40895e = new C14193m(mBridgeContainerView);
        }
        return this.f40895e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.C14176a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14178g getJSNotifyProxy() {
        WebView webView = this.f40899i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f40894d == null) {
            this.f40894d = new C14194n(webView);
        }
        return this.f40894d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.C14176a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14199j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f40900j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f40893c == null) {
            this.f40893c = new C14197q(mBridgeVideoView);
        }
        return this.f40893c;
    }
}
