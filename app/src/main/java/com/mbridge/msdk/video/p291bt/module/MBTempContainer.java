package com.mbridge.msdk.video.p291bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.gadsme.nativeplugin.BuildConfig;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.ironsource.C12538u;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.same.report.C13162o;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13190d0;
import com.mbridge.msdk.foundation.tools.C13195f;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.mraid.C13382c;
import com.mbridge.msdk.mbsignalcommon.mraid.C13383d;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13948a;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13953f;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import com.mbridge.msdk.video.module.listener.impl.C14059a;
import com.mbridge.msdk.video.module.listener.impl.C14060b;
import com.mbridge.msdk.video.module.listener.impl.C14061c;
import com.mbridge.msdk.video.module.listener.impl.C14064f;
import com.mbridge.msdk.video.module.listener.impl.C14066h;
import com.mbridge.msdk.video.module.listener.impl.C14071m;
import com.mbridge.msdk.video.module.listener.impl.C14072n;
import com.mbridge.msdk.video.module.report.C14075b;
import com.mbridge.msdk.video.p291bt.component.C13893d;
import com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13931b;
import com.mbridge.msdk.video.p291bt.module.orglistener.C13934c;
import com.mbridge.msdk.video.p291bt.module.orglistener.C13935d;
import com.mbridge.msdk.video.p291bt.module.orglistener.C13936e;
import com.mbridge.msdk.video.p291bt.module.orglistener.C13937f;
import com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import com.mbridge.msdk.video.signal.factory.C14177b;
import com.mbridge.msdk.video.signal.impl.AbstractC14181a;
import com.mbridge.msdk.video.signal.impl.C14191k;
import com.mbridge.msdk.videocommon.C14200a;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.setting.C14221a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MBTempContainer extends MBTempContainerDiff {

    /* JADX INFO: renamed from: s0 */
    private static final String f39724s0 = "MBTempContainer";

    /* JADX INFO: renamed from: A */
    private int f39725A;

    /* JADX INFO: renamed from: B */
    private int f39726B;

    /* JADX INFO: renamed from: C */
    private boolean f39727C;

    /* JADX INFO: renamed from: D */
    private int f39728D;

    /* JADX INFO: renamed from: E */
    private int f39729E;

    /* JADX INFO: renamed from: F */
    private int f39730F;

    /* JADX INFO: renamed from: G */
    private int f39731G;

    /* JADX INFO: renamed from: H */
    private int f39732H;

    /* JADX INFO: renamed from: I */
    private String f39733I;

    /* JADX INFO: renamed from: J */
    private String f39734J;

    /* JADX INFO: renamed from: K */
    private List<CampaignEx> f39735K;

    /* JADX INFO: renamed from: L */
    private int f39736L;

    /* JADX INFO: renamed from: M */
    private C13154c f39737M;

    /* JADX INFO: renamed from: N */
    protected boolean f39738N;

    /* JADX INFO: renamed from: O */
    private LayoutInflater f39739O;

    /* JADX INFO: renamed from: P */
    protected boolean f39740P;

    /* JADX INFO: renamed from: Q */
    protected InterfaceC13904k f39741Q;

    /* JADX INFO: renamed from: R */
    protected WindVaneWebView f39742R;

    /* JADX INFO: renamed from: S */
    protected MBridgeContainerView f39743S;

    /* JADX INFO: renamed from: T */
    protected Handler f39744T;

    /* JADX INFO: renamed from: U */
    private int f39745U;

    /* JADX INFO: renamed from: V */
    private int f39746V;

    /* JADX INFO: renamed from: W */
    protected Runnable f39747W;

    /* JADX INFO: renamed from: a0 */
    protected Runnable f39748a0;

    /* JADX INFO: renamed from: b0 */
    private View f39749b0;

    /* JADX INFO: renamed from: c0 */
    private boolean f39750c0;

    /* JADX INFO: renamed from: d0 */
    private boolean f39751d0;

    /* JADX INFO: renamed from: e0 */
    private boolean f39752e0;

    /* JADX INFO: renamed from: f0 */
    private boolean f39753f0;

    /* JADX INFO: renamed from: g0 */
    private boolean f39754g0;

    /* JADX INFO: renamed from: h0 */
    private boolean f39755h0;

    /* JADX INFO: renamed from: i0 */
    private boolean f39756i0;

    /* JADX INFO: renamed from: j0 */
    private boolean f39757j0;

    /* JADX INFO: renamed from: k0 */
    private boolean f39758k0;

    /* JADX INFO: renamed from: l0 */
    private boolean f39759l0;

    /* JADX INFO: renamed from: m0 */
    private C13383d f39760m0;

    /* JADX INFO: renamed from: n0 */
    private AdSession f39761n0;

    /* JADX INFO: renamed from: o0 */
    private MediaEvents f39762o0;

    /* JADX INFO: renamed from: p0 */
    private AdEvents f39763p0;

    /* JADX INFO: renamed from: q0 */
    private Runnable f39764q0;

    /* JADX INFO: renamed from: r */
    private View f39765r;

    /* JADX INFO: renamed from: r0 */
    private boolean f39766r0;

    /* JADX INFO: renamed from: s */
    private CampaignEx f39767s;

    /* JADX INFO: renamed from: t */
    private C14202a f39768t;

    /* JADX INFO: renamed from: u */
    private InterfaceC13939h f39769u;

    /* JADX INFO: renamed from: v */
    private InterfaceC13931b f39770v;

    /* JADX INFO: renamed from: w */
    private InterfaceC13948a f39771w;

    /* JADX INFO: renamed from: x */
    private int f39772x;

    /* JADX INFO: renamed from: y */
    private String f39773y;

    /* JADX INFO: renamed from: z */
    private C14177b f39774z;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$a */
    class RunnableC13894a implements Runnable {
        RunnableC13894a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBTempContainer.this.f39749b0.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$b */
    class RunnableC13895b implements Runnable {
        RunnableC13895b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBTempContainer.this.getActivityProxy().mo42228a() == 0) {
                MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
            } else {
                MBTempContainer.this.f39745U = -3;
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$c */
    class RunnableC13896c implements Runnable {
        RunnableC13896c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBTempContainer.this.getActivityProxy().mo42228a() == 0) {
                MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
            } else {
                MBTempContainer.this.f39745U = -4;
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$d */
    class C13897d implements MBridgeVideoView.InterfaceC14055u {
        C13897d() {
        }

        @Override // com.mbridge.msdk.video.module.MBridgeVideoView.InterfaceC14055u
        /* JADX INFO: renamed from: a */
        public void mo41597a() {
            if (MBTempContainer.this.f39767s != null) {
                MBTempContainer.this.m41566l();
                if (!MBTempContainer.this.f39767s.isDynamicView() || !((AbstractJSContainer) MBTempContainer.this).f40889p || MBTempContainer.this.f39767s.isCampaignIsFiltered()) {
                    MBTempContainer.this.f39769u.mo39290a(MBTempContainer.this.f39737M);
                }
                C13937f.m41690a(MBTempContainer.this.getContext(), MBTempContainer.this.f39767s, ((AbstractJSContainer) MBTempContainer.this).f40877d, MBTempContainer.this.f39772x);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$e */
    class C13898e implements InterfaceC13953f {
        C13898e() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13953f
        /* JADX INFO: renamed from: a */
        public void mo41598a() {
            MBTempContainer.this.m41586w();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$f */
    class RunnableC13899f implements Runnable {
        RunnableC13899f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBTempContainer.this.f39749b0 != null) {
                MBTempContainer.this.f39749b0.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$g */
    class RunnableC13900g implements Runnable {
        RunnableC13900g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractJSContainer) MBTempContainer.this).f40876c != null) {
                ((AbstractJSContainer) MBTempContainer.this).f40876c.finish();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$h */
    class C13901h implements InterfaceC13083a {
        C13901h() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            String string;
            MBTempContainer.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(MBTempContainer.f39724s0, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBTempContainer.this.f39742R, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            String string;
            MBTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(MBTempContainer.f39724s0, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBTempContainer.this.f39742R, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            String string;
            MBTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(MBTempContainer.f39724s0, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBTempContainer.this.f39742R, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$i */
    class C13902i implements C13383d.b {
        C13902i() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.C13383d.b
        /* JADX INFO: renamed from: a */
        public void mo38122a(double d) {
            MBridgeContainerView mBridgeContainerView;
            C13219q0.m37816b(MBTempContainer.f39724s0, "volume is : " + d);
            try {
                if (!MBTempContainer.this.f39767s.isMraid() || (mBridgeContainerView = MBTempContainer.this.f39743S) == null || mBridgeContainerView.getH5EndCardView() == null) {
                    return;
                }
                MBTempContainer.this.f39743S.getH5EndCardView().volumeChange(d);
            } catch (Exception e) {
                C13219q0.m37816b(MBTempContainer.f39724s0, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$j */
    class RunnableC13903j implements Runnable {
        RunnableC13903j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBTempContainer.this.f39749b0.setBackgroundColor(0);
            MBTempContainer.this.f39749b0.setVisibility(0);
            MBTempContainer.this.f39749b0.bringToFront();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$k */
    public interface InterfaceC13904k {

        /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$k$a */
        public static class a implements InterfaceC13904k {

            /* JADX INFO: renamed from: a */
            private boolean f39785a = false;

            @Override // com.mbridge.msdk.video.p291bt.module.MBTempContainer.InterfaceC13904k
            /* JADX INFO: renamed from: a */
            public void mo41599a(boolean z) {
                this.f39785a = z;
            }

            @Override // com.mbridge.msdk.video.p291bt.module.MBTempContainer.InterfaceC13904k
            public void onError(String str) {
                C13219q0.m37816b("ActivityErrorListener", str);
                this.f39785a = true;
            }
        }

        /* JADX INFO: renamed from: a */
        void mo41599a(boolean z);

        void onError(String str);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$l */
    private static final class C13905l extends AppletSchemeCallBack {

        /* JADX INFO: renamed from: a */
        private CampaignEx f39786a;

        public C13905l(CampaignEx campaignEx) {
            this.f39786a = campaignEx;
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        protected void onRequestFailed(int i, String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a(MBTempContainer.f39724s0, "request wx scheme failed: errorCode: " + i + " errorMessage: " + str);
            }
            try {
                CampaignEx campaignEx = this.f39786a;
                if (campaignEx != null) {
                    campaignEx.setClickURL(str2);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b(MBTempContainer.f39724s0, e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        protected void onRequestStart() {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a(MBTempContainer.f39724s0, "start request wx scheme");
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        protected void onRequestSuccess(String str) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a(MBTempContainer.f39724s0, "request wx scheme success");
            }
            try {
                CampaignEx campaignEx = this.f39786a;
                if (campaignEx != null) {
                    campaignEx.setDeepLinkUrl(str);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b(MBTempContainer.f39724s0, e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$m */
    private final class C13906m extends C14059a {
        public C13906m(Activity activity, CampaignEx campaignEx) {
            super(activity, campaignEx);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
        @Override // com.mbridge.msdk.video.module.listener.impl.C14059a, com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
        /* JADX INFO: renamed from: a */
        public void mo41600a(int i, Object obj) {
            if (C13884b.m41421a()) {
                MBTempContainer.this.setChinaJsCommonContext();
            }
            if (i == 108) {
                if (C13884b.m41421a()) {
                    MBTempContainer mBTempContainer = MBTempContainer.this;
                    mBTempContainer.setChinaCallBackStatus(mBTempContainer.f39742R);
                }
                MBTempContainer.this.getJSCommon().mo42209a(new AbstractC14181a.b(MBTempContainer.this.getJSCommon(), new C13908o(MBTempContainer.this, null)));
                MBTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
            } else if (i == 113) {
                MBTempContainer.this.f39769u.mo39295a(true, ((AbstractJSContainer) MBTempContainer.this).f40878e, ((AbstractJSContainer) MBTempContainer.this).f40877d);
            } else if (i == 117) {
                MBridgeVideoView mBridgeVideoView = MBTempContainer.this.mbridgeVideoView;
                if (mBridgeVideoView != null) {
                    mBridgeVideoView.setVisible(4);
                }
                MBTempContainer.this.f39757j0 = true;
                MBTempContainer.this.f39769u.mo39293a(((AbstractJSContainer) MBTempContainer.this).f40878e, ((AbstractJSContainer) MBTempContainer.this).f40877d);
            } else if (i == 126 || i == 128) {
                MBTempContainer.this.f39769u.mo39295a(false, ((AbstractJSContainer) MBTempContainer.this).f40878e, ((AbstractJSContainer) MBTempContainer.this).f40877d);
            } else if (i != 131) {
                switch (i) {
                    case 103:
                    case 104:
                        MBTempContainer.this.onAdClose();
                        break;
                    case 105:
                        if (C13884b.m41421a()) {
                            MBTempContainer.this.setChinaCTACallBack();
                        }
                        MBTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                        break;
                    case 106:
                        if (!C13884b.m41421a()) {
                            MBTempContainer.this.f39769u.mo39295a(true, ((AbstractJSContainer) MBTempContainer.this).f40878e, ((AbstractJSContainer) MBTempContainer.this).f40877d);
                        } else {
                            MBTempContainer mBTempContainer2 = MBTempContainer.this;
                            mBTempContainer2.setChinaBrowserCallBack(mBTempContainer2.f39770v, MBTempContainer.this.f39773y, MBTempContainer.this.f39769u, MBTempContainer.this.f39767s);
                            if (((AbstractJSContainer) MBTempContainer.this).f40876c != null && MBTempContainer.this.f39767s != null) {
                                MBTempContainer.this.onAdClose();
                            }
                        }
                        break;
                }
            } else {
                MBTempContainer.this.f39769u.mo39295a(true, ((AbstractJSContainer) MBTempContainer.this).f40878e, ((AbstractJSContainer) MBTempContainer.this).f40877d);
            }
            super.mo41600a(i, obj);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$n */
    /* JADX INFO: loaded from: classes9.dex */
    private final class C13907n extends C14064f {
        private C13907n() {
        }

        /* synthetic */ C13907n(MBTempContainer mBTempContainer, RunnableC13895b runnableC13895b) {
            this();
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
        /* JADX INFO: renamed from: a */
        public void mo41600a(int i, Object obj) {
            super.mo41600a(i, obj);
            try {
                String string = obj instanceof JSONObject ? obj.toString() : (String) obj;
                if (((AbstractJSContainer) MBTempContainer.this).f40884k && !TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    int iOptInt = jSONObject.optInt("type");
                    int iOptInt2 = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
                    if (iOptInt == 2) {
                        MBTempContainer.this.f39725A = C13088a.f35838D;
                    } else if (iOptInt != 3) {
                        MBTempContainer.this.f39725A = C13088a.f35840F;
                    } else {
                        MBTempContainer.this.f39725A = C13088a.f35839E;
                    }
                    MBTempContainer.this.f39726B = iOptInt2;
                }
            } catch (Exception unused) {
                C13219q0.m37816b("NotifyListener", "PlayableResultListener ERROR");
            }
            if (i == 120) {
                MBTempContainer.this.f39769u.mo39293a(((AbstractJSContainer) MBTempContainer.this).f40878e, ((AbstractJSContainer) MBTempContainer.this).f40877d);
            }
            if (i == 131) {
                MBTempContainer.this.getJSCommon().click(4, obj != null ? obj.toString() : "");
                return;
            }
            if (i == 126) {
                MBTempContainer.this.f39769u.mo39295a(false, ((AbstractJSContainer) MBTempContainer.this).f40878e, ((AbstractJSContainer) MBTempContainer.this).f40877d);
                return;
            }
            if (i == 127) {
                MBTempContainer.this.f39751d0 = true;
                MBTempContainer.this.f39769u.mo39290a(MBTempContainer.this.f39737M);
                MBTempContainer.this.f39769u.mo39293a(((AbstractJSContainer) MBTempContainer.this).f40878e, ((AbstractJSContainer) MBTempContainer.this).f40877d);
                MBTempContainer.this.getJSContainerModule().showEndcard(100);
                return;
            }
            switch (i) {
                case 100:
                    MBTempContainer.this.f39758k0 = true;
                    MBTempContainer mBTempContainer = MBTempContainer.this;
                    mBTempContainer.f39744T.postDelayed(mBTempContainer.f39764q0, 250L);
                    MBTempContainer.this.f39769u.mo39290a(MBTempContainer.this.f39737M);
                    break;
                case 101:
                case 102:
                    MBTempContainer.this.getJSCommon().mo42223f();
                    break;
                case 103:
                    MBTempContainer.this.f39751d0 = true;
                    if (!MBTempContainer.this.f39767s.isMraid()) {
                        MBTempContainer.this.getJSCommon().mo42223f();
                    } else {
                        MBTempContainer.this.onAdClose();
                    }
                    break;
                case 104:
                    MBTempContainer.this.onAdClose();
                    break;
                case 105:
                    if (C13884b.m41421a()) {
                        MBTempContainer.this.setChinaCTACallBack();
                    }
                    MBTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$o */
    private class C13908o extends AbstractC14181a.a {
        private C13908o() {
        }

        /* synthetic */ C13908o(MBTempContainer mBTempContainer, RunnableC13895b runnableC13895b) {
            this();
        }

        @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a.a, com.mbridge.msdk.video.signal.InterfaceC14078a.a
        /* JADX INFO: renamed from: a */
        public void mo41601a() {
            super.mo41601a();
            MBTempContainer mBTempContainer = MBTempContainer.this;
            Handler handler = mBTempContainer.f39744T;
            if (handler != null) {
                handler.removeCallbacks(mBTempContainer.f39747W);
            }
        }

        @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a.a, com.mbridge.msdk.video.signal.InterfaceC14078a.a
        /* JADX INFO: renamed from: a */
        public void mo41602a(int i, String str) {
            super.mo41602a(i, str);
            MBTempContainer.this.defaultLoad(i, str);
        }

        @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a.a, com.mbridge.msdk.video.signal.InterfaceC14078a.a
        /* JADX INFO: renamed from: a */
        public void mo41603a(boolean z) {
            if (MBTempContainer.this.f39762o0 != null) {
                try {
                    MBTempContainer.this.f39762o0.adUserInteraction(InteractionType.CLICK);
                    C13219q0.m37813a("omsdk", "mbtc adUserInteraction click");
                } catch (Exception e) {
                    C13219q0.m37816b("omsdk", e.getMessage());
                }
            }
            super.mo41603a(z);
            MBTempContainer.this.f39769u.mo39295a(z, ((AbstractJSContainer) MBTempContainer.this).f40878e, ((AbstractJSContainer) MBTempContainer.this).f40877d);
        }

        @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a.a, com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            MBTempContainer.this.f39755h0 = true;
            MBTempContainer.this.m41569m();
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String strOptString = new JSONObject(MBTempContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && strOptString.equals(BuildConfig.VERSION_NAME) && ((AbstractJSContainer) MBTempContainer.this).f40876c != null) {
                        if (((AbstractJSContainer) MBTempContainer.this).f40889p) {
                            MBTempContainer.this.onAdClose();
                        } else {
                            ((AbstractJSContainer) MBTempContainer.this).f40876c.finish();
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (MBTempContainer.this.f39766r0) {
                MBTempContainer.this.onResume();
            }
        }

        @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a.a, com.mbridge.msdk.video.signal.InterfaceC14078a.a
        public void onInitSuccess() {
            super.onInitSuccess();
            MBTempContainer.this.receiveSuccess();
        }

        @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a.a, com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            MBTempContainer.this.m41569m();
            MBTempContainer.this.f39755h0 = true;
        }

        @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a.a, com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            MBTempContainer.this.m41589y();
            if (MBTempContainer.this.f39766r0) {
                MBTempContainer.this.onPause();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$p */
    private final class C13909p extends C14064f {
        private C13909p() {
        }

        /* synthetic */ C13909p(MBTempContainer mBTempContainer, RunnableC13895b runnableC13895b) {
            this();
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
        /* JADX INFO: renamed from: a */
        public void mo41600a(int i, Object obj) {
            String string;
            super.mo41600a(i, obj);
            if (((AbstractJSContainer) MBTempContainer.this).f40884k) {
                try {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = new JSONObject(str);
                            MBTempContainer.this.f39725A = jSONObject.getInt("Alert_window_status");
                            MBTempContainer.this.f39726B = jSONObject.getInt("complete_info");
                        }
                    }
                } catch (Exception e) {
                    C13219q0.m37816b("NotifyListener", e.getMessage());
                }
            }
            if (i != 2) {
                if (i == 121) {
                    MBTempContainer.this.f39751d0 = true;
                    MBTempContainer.this.f39769u.mo39296b(((AbstractJSContainer) MBTempContainer.this).f40878e, ((AbstractJSContainer) MBTempContainer.this).f40877d);
                    MBTempContainer.this.f39756i0 = false;
                    return;
                }
                if (i == 16) {
                    if (C13884b.m41421a()) {
                        MBTempContainer.this.onAdClose();
                        return;
                    } else {
                        MBTempContainer.this.getJSCommon().mo42223f();
                        return;
                    }
                }
                if (i == 17) {
                    MBTempContainer.this.f39751d0 = true;
                    MBridgeContainerView mBridgeContainerView = MBTempContainer.this.f39743S;
                    if (mBridgeContainerView != null) {
                        mBridgeContainerView.setRewardStatus(true);
                        return;
                    }
                    return;
                }
                switch (i) {
                    case 10:
                        MBTempContainer.this.f39756i0 = true;
                        if (MBTempContainer.this.f39767s != null && !C13223s0.m37831a().m37842a("i_l_s_t_r_i", false)) {
                            MBTempContainer.this.m41566l();
                            if (!MBTempContainer.this.f39767s.isDynamicView() || !((AbstractJSContainer) MBTempContainer.this).f40889p || MBTempContainer.this.f39767s.isCampaignIsFiltered()) {
                                MBTempContainer.this.f39769u.mo39290a(MBTempContainer.this.f39737M);
                            }
                            C13937f.m41690a(MBTempContainer.this.getContext(), MBTempContainer.this.f39767s, ((AbstractJSContainer) MBTempContainer.this).f40877d, MBTempContainer.this.f39772x);
                            break;
                        }
                        break;
                }
            }
            if (i == 12) {
                try {
                    string = obj instanceof String ? obj.toString() : "Play error but has no message.";
                } catch (Throwable th) {
                    C13219q0.m37816b("NotifyListener", th.getMessage());
                }
                C13937f.m41691a(MBTempContainer.this.getContext(), MBTempContainer.this.f39767s, ((AbstractJSContainer) MBTempContainer.this).f40877d, string, MBTempContainer.this.f39772x);
                if (!MBTempContainer.this.f39756i0) {
                    if (((AbstractJSContainer) MBTempContainer.this).f40879f.m42686C() == 0) {
                        MBTempContainer.this.f39769u.mo39291a(MBTempContainer.this.f39737M, "play error");
                        MBTempContainer.this.f39756i0 = false;
                        MBTempContainer.this.onAdClose();
                        return;
                    } else {
                        MBTempContainer.this.m41566l();
                        if (MBTempContainer.this.f39767s == null || !MBTempContainer.this.f39767s.isDynamicView() || !((AbstractJSContainer) MBTempContainer.this).f40889p || MBTempContainer.this.f39767s.isCampaignIsFiltered()) {
                            MBTempContainer.this.f39769u.mo39290a(MBTempContainer.this.f39737M);
                        }
                    }
                }
            }
            MBTempContainer.this.getJSVideoModule().videoOperate(i == 2 ? 6 : 3);
            MBTempContainer.this.f39756i0 = false;
            if (MBTempContainer.this.f39762o0 == null || i != 2) {
                return;
            }
            C13219q0.m37816b("omsdk", "mbtc skip");
            try {
                MBTempContainer.this.f39762o0.skipped();
                MBTempContainer.this.f39762o0 = null;
            } catch (Exception e2) {
                C13219q0.m37813a("omsdk", e2.getMessage());
            }
        }
    }

    public MBTempContainer(Context context) {
        super(context);
        this.f39772x = 1;
        this.f39773y = "";
        this.f39725A = C13088a.f35840F;
        this.f39727C = false;
        this.f39733I = "";
        this.f39735K = new ArrayList();
        this.f39736L = 0;
        this.f39738N = false;
        this.f39740P = false;
        this.f39741Q = new InterfaceC13904k.a();
        this.f39744T = new Handler();
        this.f39745U = 0;
        this.f39746V = 0;
        this.f39747W = new RunnableC13895b();
        this.f39748a0 = new RunnableC13896c();
        this.f39750c0 = false;
        this.f39751d0 = false;
        this.f39752e0 = false;
        this.f39754g0 = false;
        this.f39755h0 = false;
        this.f39756i0 = false;
        this.f39757j0 = false;
        this.f39758k0 = false;
        this.f39759l0 = false;
        this.f39761n0 = null;
        this.f39762o0 = null;
        this.f39763p0 = null;
        this.f39764q0 = new RunnableC13899f();
        this.f39766r0 = false;
        init(context);
    }

    public MBTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39772x = 1;
        this.f39773y = "";
        this.f39725A = C13088a.f35840F;
        this.f39727C = false;
        this.f39733I = "";
        this.f39735K = new ArrayList();
        this.f39736L = 0;
        this.f39738N = false;
        this.f39740P = false;
        this.f39741Q = new InterfaceC13904k.a();
        this.f39744T = new Handler();
        this.f39745U = 0;
        this.f39746V = 0;
        this.f39747W = new RunnableC13895b();
        this.f39748a0 = new RunnableC13896c();
        this.f39750c0 = false;
        this.f39751d0 = false;
        this.f39752e0 = false;
        this.f39754g0 = false;
        this.f39755h0 = false;
        this.f39756i0 = false;
        this.f39757j0 = false;
        this.f39758k0 = false;
        this.f39759l0 = false;
        this.f39761n0 = null;
        this.f39762o0 = null;
        this.f39763p0 = null;
        this.f39764q0 = new RunnableC13899f();
        this.f39766r0 = false;
        init(context);
    }

    /* JADX INFO: renamed from: A */
    private void m41519A() {
        AppletsModel appletsModel;
        if (this.f39767s == null) {
            return;
        }
        try {
            appletsModel = AppletModelManager.getInstance().get(this.f39767s);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            appletsModel = null;
        }
        if (appletsModel != null) {
            try {
                if (appletsModel.can(0)) {
                    appletsModel.setUserClick(false);
                    appletsModel.requestWxAppletsScheme(0, new C13905l(this.f39767s));
                }
            } catch (Exception e2) {
                appletsModel.clearRequestState();
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private int m41542a(int i, int i2) {
        List<CampaignEx> list;
        if (i < 0 || (list = this.f39735K) == null || list.size() == 0 || i2 <= 1) {
            return i;
        }
        int videoLength = 0;
        for (int i3 = 0; i3 < i2 - 1; i3++) {
            if (this.f39735K.get(i3) != null) {
                videoLength += this.f39735K.get(i3).getVideoLength();
            }
        }
        if (i > videoLength) {
            return i - videoLength;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    private void m41549b(int i, String str) {
        try {
            C13080n c13080n = new C13080n();
            c13080n.m36982j("2000037");
            c13080n.m36978h("code=" + i + ",desc=" + str);
            CampaignEx campaignEx = this.f39767s;
            c13080n.m37002t((campaignEx == null || campaignEx.getRewardTemplateMode() == null) ? "" : this.f39767s.getRewardTemplateMode().m36781j());
            c13080n.m37004u(this.f40877d);
            CampaignEx campaignEx2 = this.f39767s;
            c13080n.m36962b(campaignEx2 != null ? campaignEx2.getId() : "");
            CampaignEx campaignEx3 = this.f39767s;
            if (campaignEx3 != null && !TextUtils.isEmpty(campaignEx3.getRequestId())) {
                c13080n.m36990n(this.f39767s.getRequestId());
            }
            CampaignEx campaignEx4 = this.f39767s;
            if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getRequestIdNotice())) {
                c13080n.m36992o(this.f39767s.getRequestIdNotice());
            }
            int iM37770s = C13211m0.m37770s(getContext());
            c13080n.m36965c(iM37770s);
            c13080n.m36986l(C13211m0.m37732a(getContext(), iM37770s));
            C13162o.m37531i(c13080n);
        } catch (Throwable th) {
            C13219q0.m37817b(f39724s0, th.getMessage(), th);
        }
    }

    private int getBufferTimeout() {
        try {
            C14221a c14221aM42670c = C14222b.m42658b().m42670c();
            if (c14221aM42670c == null) {
                C14222b.m42658b().m42660a();
            }
            if (c14221aM42670c != null) {
                return (int) c14221aM42670c.m42653i();
            }
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    private int getCloseBtnTime() {
        CampaignEx campaignEx = this.f39767s;
        if (campaignEx == null) {
            return 1;
        }
        boolean zM37917c = C13229v0.m37917c(MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE, campaignEx.getendcard_url());
        int iM37924e = C13229v0.m37924e(this.f39767s.getendcard_url(), MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE);
        if (!zM37917c || iM37924e < 0) {
            return this.f39767s.getCbd() > -2 ? this.f39767s.getCbd() : this.f40879f.m42728i();
        }
        return iM37924e;
    }

    /* JADX INFO: renamed from: k */
    private void m41564k() {
        if (this.f40879f == null) {
            this.f40879f = C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), this.f40877d, this.f40884k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m41566l() {
        try {
            C13157e c13157e = new C13157e();
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView == null || mBridgeVideoView.notifyListener == null) {
                c13157e.m37501a("notify_listener", 0);
            } else {
                c13157e.m37501a("notify_listener", 1);
                InterfaceC14058a interfaceC14058a = this.mbridgeVideoView.notifyListener;
                if (interfaceC14058a instanceof C14072n) {
                    c13157e.m37501a("listener_type", 1);
                } else if (interfaceC14058a instanceof C14071m) {
                    c13157e.m37501a("listener_type", 2);
                } else {
                    c13157e.m37501a("listener_type", 3);
                }
            }
            C13154c c13154c = this.f39737M;
            if (c13154c != null) {
                c13154c.m37423a("2000130", c13157e);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m41569m() {
        if (isLoadSuccess()) {
            this.f40876c.runOnUiThread(new RunnableC13894a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdClose() {
        int i;
        try {
            InterfaceC13931b interfaceC13931b = this.f39770v;
            if (interfaceC13931b == null) {
                Activity activity = this.f40876c;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            if (this.f40884k && ((i = this.f40886m) == C13088a.f35842H || i == C13088a.f35843I)) {
                boolean z = true;
                if (this.f39726B != 1) {
                    z = false;
                }
                interfaceC13931b.mo41645a(z, this.f39725A);
            }
            this.f39770v.mo41644a(this.f39773y, this.f39751d0, this.f40881h);
        } catch (Exception unused) {
            Activity activity2 = this.f40876c;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m41574q() {
        AdSession adSession = this.f39761n0;
        if (adSession != null) {
            try {
                MBridgeContainerView mBridgeContainerView = this.f39743S;
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                adSession.addFriendlyObstruction(mBridgeContainerView, friendlyObstructionPurpose, null);
                View view = this.f39749b0;
                if (view != null) {
                    this.f39761n0.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
                }
                WindVaneWebView windVaneWebView = this.f39742R;
                if (windVaneWebView != null) {
                    this.f39761n0.addFriendlyObstruction(windVaneWebView, friendlyObstructionPurpose, null);
                }
                this.mbridgeVideoView.setVideoEvents(this.f39762o0);
                this.f39761n0.start();
                if (this.f39763p0 != null) {
                    VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    C13219q0.m37813a("omsdk", "bt:   adEvents.loaded");
                    this.f39763p0.loaded(vastPropertiesCreateVastPropertiesForNonSkippableMedia);
                    this.f39763p0.impressionOccurred();
                }
            } catch (Exception e) {
                C13219q0.m37813a("omsdk", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private void m41576r() {
        CampaignEx campaignEx;
        int i;
        boolean z = true;
        try {
            this.f39750c0 = true;
            CampaignEx campaignEx2 = this.f39767s;
            if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 2) {
                this.f39751d0 = true;
            }
            MediaEvents mediaEvents = this.f39762o0;
            if (mediaEvents != null && !this.f39751d0) {
                try {
                    mediaEvents.skipped();
                    this.f39762o0 = null;
                } catch (Exception e) {
                    C13219q0.m37813a("omsdk", e.getMessage());
                }
            }
            InterfaceC13939h interfaceC13939h = this.f39769u;
            if (interfaceC13939h != null) {
                if (this.f40884k && ((i = this.f40886m) == C13088a.f35842H || i == C13088a.f35843I)) {
                    if (this.f39726B != 1) {
                        z = false;
                    }
                    interfaceC13939h.mo39294a(z, this.f39725A);
                }
                if (!this.f39751d0) {
                    this.f40881h.m42624a(0);
                }
                this.f39737M.m37421a(this.f39767s);
                this.f39769u.mo39292a(this.f39737M, this.f39751d0, this.f40881h);
            }
            this.f39744T.removeCallbacks(this.f39764q0);
            if ((!this.f40884k && !this.f40889p) || ((campaignEx = this.f39767s) != null && campaignEx.isDynamicView())) {
                m41582u();
            }
            if (!this.f40889p) {
                if (this.f40884k) {
                    C14200a.m42400b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f39767s);
                } else {
                    C14200a.m42400b(94, this.f39767s);
                }
            }
            MBridgeContainerView mBridgeContainerView = this.f39743S;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.release();
            }
        } catch (Throwable th) {
            C13219q0.m37817b(f39724s0, th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: s */
    private void m41578s() {
        C13146h c13146h = new C13146h(getContext());
        CampaignEx campaignEx = this.f39767s;
        if (campaignEx != null) {
            c13146h.m37372b(campaignEx.getRequestId(), this.f39767s.getRequestIdNotice(), this.f39767s.getId(), this.f40877d, C13382c.m38701b(this.f39767s.getId()), this.f39767s.isBidCampaign());
            C13382c.m38699a(this.f39767s.getId());
            this.f39753f0 = true;
        }
    }

    /* JADX INFO: renamed from: t */
    private void m41580t() {
        Runnable runnable;
        int i = this.f39745U;
        if (i == -3) {
            runnable = this.f39747W;
        } else {
            runnable = i == -4 ? this.f39748a0 : null;
        }
        if (runnable != null) {
            runnable.run();
            this.f39745U = 0;
        }
    }

    /* JADX INFO: renamed from: u */
    private void m41582u() {
        if (this.f39751d0) {
            if (C13884b.m41421a() && checkChinaSendToServerDiff(this.f39769u)) {
                return;
            }
            C13219q0.m37813a(f39724s0, "sendToServerRewardInfo");
            C14075b.m42198a(this.f39767s, this.f40881h, this.f40877d, this.f40880g, this.f39734J);
        }
    }

    /* JADX INFO: renamed from: v */
    private void m41584v() {
        getJSCommon().setAdEvents(this.f39763p0);
        getJSCommon().setAdSession(this.f39761n0);
        getJSCommon().setVideoEvents(this.f39762o0);
        getJSCommon().mo42225g(this.f40883j);
        getJSCommon().setUnitId(this.f40877d);
        getJSCommon().setRewardUnitSetting(this.f40879f);
        getJSCommon().mo42209a(new C13908o(this, null));
        CampaignEx campaignEx = this.f39767s;
        if (campaignEx != null) {
            if (campaignEx.isMraid() || this.f39767s.isActiveOm()) {
                C13383d c13383d = new C13383d(getContext());
                this.f39760m0 = c13383d;
                c13383d.m38705c();
                this.f39760m0.m38702a();
                this.f39760m0.m38703a(new C13902i());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m41586w() {
        try {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("temp_container", getWidth() + "x" + getHeight());
            if (this.f39742R != null) {
                c13157e.m37501a("web_view", this.f39742R.getWidth() + "x" + this.f39742R.getHeight());
            }
            if (this.mbridgeVideoView != null) {
                c13157e.m37501a("mbridge_video_view", this.mbridgeVideoView.getWidth() + "x" + this.mbridgeVideoView.getHeight());
                if (this.mbridgeVideoView.mPlayerView != null) {
                    c13157e.m37501a("player_view", this.mbridgeVideoView.mPlayerView.getWidth() + "x" + this.mbridgeVideoView.mPlayerView.getHeight());
                }
            }
            C13154c c13154c = this.f39737M;
            if (c13154c != null) {
                c13154c.m37423a("2000136", c13157e);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m41589y() {
        if (isLoadSuccess()) {
            this.f40876c.runOnUiThread(new RunnableC13903j());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    /* JADX INFO: renamed from: b */
    protected void mo41591b(String str) {
        InterfaceC13939h interfaceC13939h = this.f39769u;
        if (interfaceC13939h != null) {
            interfaceC13939h.mo39291a(this.f39737M, str);
        }
        super.mo41591b(str);
    }

    public boolean canBackPress() {
        MBridgeContainerView mBridgeContainerView = this.f39743S;
        return mBridgeContainerView == null || mBridgeContainerView.canBackPress();
    }

    public void defaultLoad(int i, String str) {
        int i2;
        superDefaultLoad(i, str);
        CampaignEx campaignEx = this.f39767s;
        if (campaignEx != null && !campaignEx.isDynamicView()) {
            this.f39767s.setTemplateRenderSucc(false);
        }
        if (!isLoadSuccess()) {
            m41549b(i, str);
            Activity activity = this.f40876c;
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        RunnableC13895b runnableC13895b = null;
        if (this.f39767s.getPlayable_ads_without_video() == 2) {
            this.f39743S.setCampaign(this.f39767s);
            this.f39743S.addOrderViewData(this.f39735K);
            this.f39743S.setUnitID(this.f40877d);
            this.f39743S.setCloseDelayTime(getCloseBtnTime());
            this.f39743S.setPlayCloseBtnTm(this.f40879f.m42754u());
            this.f39743S.setNotifyListener(new C14066h(this.f39767s, this.f39768t, this.f40881h, getInnerPlacementId(), this.f40877d, new C13907n(this, runnableC13895b), this.f40879f.m42682A(), this.f40889p));
            this.f39743S.preLoadData(this.f39774z);
            this.f39774z.getJSCommon().mo42225g(this.f40883j);
            this.f39743S.showPlayableView();
        } else {
            m41549b(i, str);
            this.f39749b0.setVisibility(8);
            loadModuleDatas();
            int iM42690E = this.f40879f.m42690E();
            int h5CloseType = getH5CloseType();
            int i3 = h5CloseType != 0 ? h5CloseType : iM42690E;
            CampaignEx campaignEx2 = this.f39767s;
            if (campaignEx2 != null && campaignEx2.isDynamicView()) {
                this.mbridgeVideoView.setContainerViewOnNotifyListener(new C13906m(this.f40876c, this.f39767s));
            }
            CampaignEx campaignEx3 = this.f39767s;
            int iM42692F = (campaignEx3 == null || campaignEx3.getVst() <= -2) ? this.f40879f.m42692F() : this.f39767s.getVst();
            CampaignEx campaignEx4 = this.f39767s;
            if (campaignEx4 != null && campaignEx4.getDynamicTempCode() == 5 && (i2 = this.f39772x) > 1) {
                iM42692F = m41542a(iM42692F, i2);
                this.f39767s.setVst(iM42692F);
            }
            int i4 = iM42692F;
            this.mbridgeVideoView.setVideoSkipTime(i4);
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            mBridgeVideoView.setNotifyListener(new C14071m(mBridgeVideoView, this.f39743S, this.f39767s, this.f40881h, this.f39768t, getInnerPlacementId(), this.f40877d, i3, i4, new C13909p(this, runnableC13895b), this.f40879f.m42682A(), this.f40889p, this.f40879f.m42686C()));
            this.mbridgeVideoView.setAdSession(this.f39761n0);
            this.mbridgeVideoView.setVideoEvents(this.f39762o0);
            this.mbridgeVideoView.defaultShow();
            MBridgeContainerView mBridgeContainerView = this.f39743S;
            mBridgeContainerView.setNotifyListener(new C14060b(this.mbridgeVideoView, mBridgeContainerView, this.f39767s, this.f40881h, this.f39768t, getInnerPlacementId(), this.f40877d, new C13906m(this.f40876c, this.f39767s), this.f40879f.m42682A(), this.f40889p));
            this.f39743S.defaultShow();
        }
        m41574q();
    }

    public int findID(String str) {
        return C13203i0.m37707a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return C13203i0.m37707a(getContext(), str, "layout");
    }

    public MBridgeContainerView findMBridgeContainerView() {
        return (MBridgeContainerView) findViewById(findID("mbridge_video_templete_container"));
    }

    public MBridgeVideoView findMBridgeVideoView() {
        return (MBridgeVideoView) findViewById(findID("mbridge_video_templete_videoview"));
    }

    public WindVaneWebView findWindVaneWebView() {
        try {
            if (!this.f40889p) {
                C14200a.a aVarM42394a = this.f40884k ? C14200a.m42394a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f39767s) : C14200a.m42394a(94, this.f39767s);
                if (aVarM42394a == null || !aVarM42394a.m42410c()) {
                    return null;
                }
                if (this.f40884k) {
                    C14200a.m42400b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f39767s);
                } else {
                    C14200a.m42400b(94, this.f39767s);
                }
                WindVaneWebView windVaneWebViewM42409b = aVarM42394a.m42409b();
                if (this.f39754g0) {
                    windVaneWebViewM42409b.setWebViewTransparent();
                }
                return windVaneWebViewM42409b;
            }
            CampaignEx campaignEx = this.f39767s;
            if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
                return null;
            }
            C14200a.a aVarM42399b = C14200a.m42399b(this.f40877d + "_" + this.f39767s.getId() + "_" + this.f39767s.getRequestId() + "_" + this.f39767s.getRewardTemplateMode().m36781j());
            if (aVarM42399b != null) {
                return aVarM42399b.m42409b();
            }
            return null;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    public AdEvents getAdEvents() {
        return this.f39763p0;
    }

    public AdSession getAdSession() {
        return this.f39761n0;
    }

    public CampaignEx getCampaign() {
        return this.f39767s;
    }

    protected RelativeLayout.LayoutParams getContentLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    protected int getH5CloseType() {
        C14191k c14191kM42339b = m42339b(this.f39767s);
        if (c14191kM42339b != null) {
            return c14191kM42339b.m42353l();
        }
        return 0;
    }

    protected int getH5DialogRole() {
        if (getJSCommon() != null) {
            return getJSCommon().mo42218d();
        }
        return 1;
    }

    protected int getH5MuteState() {
        C14191k c14191kM42339b = m42339b(this.f39767s);
        if (c14191kM42339b != null) {
            return c14191kM42339b.m42354m();
        }
        return 0;
    }

    public String getInstanceId() {
        return this.f39773y;
    }

    protected boolean getIsShowingTransparent() {
        C14191k c14191kM42339b = m42339b(this.f39767s);
        if (c14191kM42339b != null) {
            return c14191kM42339b.m42357p();
        }
        return false;
    }

    public int getLayoutID() {
        return findLayout(this.f39754g0 ? "mbridge_reward_activity_video_templete_transparent" : "mbridge_reward_activity_video_templete");
    }

    public MediaEvents getVideoEvents() {
        return this.f39762o0;
    }

    public void init(Context context) {
        this.f39739O = LayoutInflater.from(context);
    }

    public boolean initViews() {
        View viewFindViewById = findViewById(findID("mbridge_video_templete_progressbar"));
        this.f39749b0 = viewFindViewById;
        return viewFindViewById != null;
    }

    public boolean isHasDestoryed() {
        return this.f39727C;
    }

    public boolean isLoadSuccess() {
        return this.f39740P;
    }

    public void loadModuleDatas() {
        int i;
        int i2;
        int h5MuteState = getH5MuteState();
        if (h5MuteState != 0) {
            this.f40883j = h5MuteState;
        }
        int iM42690E = this.f40879f.m42690E();
        int h5CloseType = getH5CloseType();
        int i3 = h5CloseType != 0 ? h5CloseType : iM42690E;
        this.mbridgeVideoView.setSoundState(this.f40883j);
        this.mbridgeVideoView.setCampaign(this.f39767s);
        this.mbridgeVideoView.setPlayURL(this.f39768t.m42501l());
        CampaignEx campaignEx = this.f39767s;
        int iM42692F = (campaignEx == null || campaignEx.getVst() <= -2) ? this.f40879f.m42692F() : this.f39767s.getVst();
        CampaignEx campaignEx2 = this.f39767s;
        if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (i2 = this.f39772x) > 1) {
            iM42692F = m41542a(iM42692F, i2);
            this.f39767s.setVst(iM42692F);
        }
        int i4 = iM42692F;
        this.mbridgeVideoView.setVideoSkipTime(i4);
        this.mbridgeVideoView.setCloseAlert(this.f40879f.m42725h());
        this.mbridgeVideoView.setBufferTimeout(getBufferTimeout());
        RunnableC13895b runnableC13895b = null;
        this.mbridgeVideoView.setNotifyListener(new C14072n(this.f39774z, this.f39767s, this.f40881h, this.f39768t, getInnerPlacementId(), this.f40877d, i3, i4, new C13909p(this, runnableC13895b), this.f40879f.m42682A(), this.f40889p, this.f40879f.m42686C()));
        this.mbridgeVideoView.setShowingTransparent(this.f39754g0);
        this.mbridgeVideoView.setAdSession(this.f39761n0);
        if (this.f40884k && ((i = this.f40886m) == C13088a.f35842H || i == C13088a.f35843I)) {
            this.mbridgeVideoView.setIVRewardEnable(i, this.f40887n, this.f40888o);
            this.mbridgeVideoView.setDialogRole(getH5DialogRole());
        }
        this.f39743S.setCampaign(this.f39767s);
        this.f39743S.addOrderViewData(this.f39735K);
        this.f39743S.setUnitID(this.f40877d);
        this.f39743S.setCloseDelayTime(getCloseBtnTime());
        this.f39743S.setPlayCloseBtnTm(this.f40879f.m42754u());
        this.f39743S.setVideoInteractiveType(this.f40879f.m42688D());
        this.f39743S.setEndscreenType(this.f40879f.m42738m());
        this.f39743S.setVideoSkipTime(i4);
        this.f39743S.setShowingTransparent(this.f39754g0);
        this.f39743S.setJSFactory(this.f39774z);
        this.f39774z.getJSCommon().mo42225g(this.f40883j);
        if (this.f39767s.getPlayable_ads_without_video() == 2) {
            this.f39743S.setNotifyListener(new C14066h(this.f39767s, this.f39768t, this.f40881h, getInnerPlacementId(), this.f40877d, new C13907n(this, runnableC13895b), this.f40879f.m42682A(), this.f40889p));
            this.f39743S.preLoadData(this.f39774z);
            this.f39743S.showPlayableView();
        } else {
            this.f39743S.setNotifyListener(new C14061c(this.f39774z, this.f39767s, this.f40881h, this.f39768t, getInnerPlacementId(), this.f40877d, new C13906m(this.f40876c, this.f39767s), this.f40879f.m42682A(), this.f40889p));
            this.f39743S.preLoadData(this.f39774z);
            this.mbridgeVideoView.preLoadData(this.f39774z);
        }
        if (this.f39754g0) {
            this.f39743S.setMBridgeClickMiniCardViewTransparent();
        }
    }

    /* JADX INFO: renamed from: n */
    protected boolean m41592n() {
        this.f39742R = findWindVaneWebView();
        MBridgeVideoView mBridgeVideoViewFindMBridgeVideoView = findMBridgeVideoView();
        this.mbridgeVideoView = mBridgeVideoViewFindMBridgeVideoView;
        mBridgeVideoViewFindMBridgeVideoView.setVideoLayout(this.f39767s);
        this.mbridgeVideoView.setIsIV(this.f40884k);
        this.mbridgeVideoView.setUnitId(this.f40877d);
        this.mbridgeVideoView.setCamPlayOrderCallback(this.f39771w, this.f39735K, this.f39772x, this.f39736L);
        if (this.f40889p) {
            this.mbridgeVideoView.setNotchPadding(this.f39729E, this.f39730F, this.f39731G, this.f39732H);
        }
        MBridgeContainerView mBridgeContainerViewFindMBridgeContainerView = findMBridgeContainerView();
        this.f39743S = mBridgeContainerViewFindMBridgeContainerView;
        if (this.f40889p) {
            mBridgeContainerViewFindMBridgeContainerView.setNotchPadding(this.f39728D, this.f39729E, this.f39730F, this.f39731G, this.f39732H);
        }
        if (C13223s0.m37831a().m37842a("i_l_s_t_r_i", false)) {
            this.mbridgeVideoView.setPlayerViewAttachListener(new C13897d());
        }
        this.mbridgeVideoView.setIPlayVideoViewLayoutCallBack(new C13898e());
        return (this.mbridgeVideoView == null || this.f39743S == null || !initViews()) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    protected boolean m41593o() {
        if (this.mbridgeVideoView == null) {
            return false;
        }
        if (C13884b.m41421a()) {
            return this.mbridgeVideoView.isShowingAlertView() || checkChinaShowingAlertViewState() || this.mbridgeVideoView.isRewardPopViewShowing();
        }
        return this.mbridgeVideoView.isShowingAlertView() || this.mbridgeVideoView.isRewardPopViewShowing();
    }

    public void onBackPressed() {
        MBridgeContainerView mBridgeContainerView;
        MBridgeContainerView mBridgeContainerView2;
        MBridgeVideoView mBridgeVideoView;
        MBridgeVideoView mBridgeVideoView2;
        if (this.f39754g0 && (mBridgeVideoView2 = this.mbridgeVideoView) != null) {
            mBridgeVideoView2.notifyVideoClose();
            return;
        }
        CampaignEx campaignEx = this.f39767s;
        if (((campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f39767s.getRewardTemplateMode().m36782k() == 5002010) || this.f39756i0) && (mBridgeVideoView = this.mbridgeVideoView) != null) {
            if (!mBridgeVideoView.isMiniCardShowing()) {
                this.mbridgeVideoView.onBackPress();
                return;
            }
            MBridgeContainerView mBridgeContainerView3 = this.f39743S;
            if (mBridgeContainerView3 != null) {
                mBridgeContainerView3.onMiniEndcardBackPress();
                return;
            }
            return;
        }
        if (this.f39758k0 && (mBridgeContainerView2 = this.f39743S) != null) {
            mBridgeContainerView2.onPlayableBackPress();
            return;
        }
        if (this.f39757j0 && (mBridgeContainerView = this.f39743S) != null) {
            mBridgeContainerView.onEndcardBackPress();
        }
        if (getJSCommon().mo42212a()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().mo42234e();
                return;
            }
            return;
        }
        if (!canBackPress()) {
            C13219q0.m37813a(f39724s0, "onBackPressed can't excute");
            return;
        }
        Activity activity = this.f40876c;
        if (activity == null || this.f40889p || this.f39759l0) {
            return;
        }
        this.f39759l0 = true;
        activity.onBackPressed();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        m41564k();
        try {
            m41519A();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        this.f39759l0 = false;
        try {
            if (this.f40889p) {
                CampaignEx campaignEx = this.f39767s;
                if (campaignEx == null || !campaignEx.isDynamicView()) {
                    this.f39769u = new C13934c(this.f39770v, this.f39773y);
                } else {
                    this.f39769u = new C13935d(getContext(), this.f40884k, this.f40879f, this.f39767s, this.f39769u, getInnerPlacementId(), this.f40877d);
                }
            } else {
                this.f39769u = new C13935d(getContext(), this.f40884k, this.f40879f, this.f39767s, this.f39769u, getInnerPlacementId(), this.f40877d);
            }
            registerErrorListener(new C13936e(this.f39737M, this.f39769u));
            m42336a(this.f40879f, this.f39767s);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (!C13203i0.m37709a(layoutID)) {
                mo41591b("layoutID not found");
                return;
            }
            View viewInflate = this.f39739O.inflate(layoutID, (ViewGroup) null);
            this.f39765r = viewInflate;
            addView(viewInflate, getContentLayoutParams());
            m41595x();
            if (m41592n()) {
                this.f39740P = true;
                m41594p();
                return;
            }
            this.f39741Q.onError("not found View IDS");
            Activity activity = this.f40876c;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            mo41591b("onCreate error" + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.f39727C) {
            return;
        }
        this.f39727C = true;
        super.onDestroy();
        try {
            if (C13884b.m41421a()) {
                setChinaDestroy();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.releasePlayer();
            }
            WindVaneWebView windVaneWebView = this.f39742R;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f39742R.clearWebView();
                this.f39742R.release();
            }
            if (this.f39770v != null) {
                this.f39770v = null;
            }
            this.f39744T.removeCallbacks(this.f39747W);
            this.f39744T.removeCallbacks(this.f39748a0);
            getJSCommon().release();
            if (this.f40884k) {
                C13636h.m39706b().m39726h(this.f40877d);
            }
            if (!this.f39750c0) {
                m41576r();
            }
            if (!this.f39753f0) {
                m41578s();
            }
            C13383d c13383d = this.f39760m0;
            if (c13383d != null) {
                c13383d.m38706d();
            }
            if (this.f39761n0 != null) {
                C13219q0.m37816b("omsdk", "tc onDestroy");
                this.f39761n0.removeAllFriendlyObstructions();
                this.f39761n0.finish();
                this.f39761n0 = null;
            }
            if (!this.f40889p) {
                if (isLoadSuccess()) {
                    this.f39744T.postDelayed(new RunnableC13900g(), 100L);
                } else {
                    Activity activity = this.f40876c;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
            if (!this.f39753f0) {
                m41578s();
            }
            C13893d.m41513c().m41462a(this.f39773y);
        } catch (Throwable th) {
            C13219q0.m37813a(f39724s0, th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onPause() {
        super.onPause();
        this.f39752e0 = true;
        try {
            getJSVideoModule().videoOperate(2);
            MBridgeContainerView mBridgeContainerView = this.f39743S;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnPause();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityPause();
            }
        } catch (Throwable th) {
            C13219q0.m37817b(f39724s0, th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        Activity activity;
        super.onResume();
        m41580t();
        try {
            if (this.mbridgeVideoView != null && !m41593o() && !this.mbridgeVideoView.isMiniCardShowing() && !C13084b.f35793f) {
                this.mbridgeVideoView.setCover(false);
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityResume();
            }
            MBridgeContainerView mBridgeContainerView = this.f39743S;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnResume();
            }
            if (this.f39752e0 && !m41593o() && !C13084b.f35793f) {
                getJSVideoModule().videoOperate(1);
            }
            Activity activity2 = this.f40876c;
            if (activity2 != null) {
                C13229v0.m37893a(activity2.getWindow().getDecorView());
            }
            if (this.f39754g0 && this.f39755h0 && (activity = this.f40876c) != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            C13219q0.m37817b(f39724s0, th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onStop() {
        super.onStop();
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setCover(true);
            this.mbridgeVideoView.onActivityStop();
        }
    }

    /* JADX INFO: renamed from: p */
    protected void m41594p() {
        ViewGroup viewGroup;
        List<CampaignEx> list;
        WindVaneWebView windVaneWebView = this.f39742R;
        CampaignEx campaignEx = this.f39767s;
        if (campaignEx != null) {
            C13185b1.m37632a(windVaneWebView, campaignEx.getLocalRequestId(), this.f39767s.getLocalAllowTrackClick());
        }
        this.f39774z = new C14177b(this.f40876c, windVaneWebView, this.mbridgeVideoView, this.f39743S, this.f39767s, new C13908o(this, null));
        CampaignEx campaignEx2 = this.f39767s;
        if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (list = this.f39735K) != null) {
            this.f39774z.m42343a(list);
        }
        registerJsFactory(this.f39774z);
        C13084b.m37036b().m37047a(this.f40877d + "_1", new C13901h());
        m41574q();
        if (windVaneWebView == null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f39765r.findViewById(C13203i0.m37707a(getContext(), "mbridge_video_templete_webview_parent", "id"));
        windVaneWebView.setApiManagerJSFactory(this.f39774z);
        if (windVaneWebView.getParent() != null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        if (windVaneWebView.getObject() instanceof C14191k) {
            m41584v();
            getJSContainerModule().readyStatus(((C14191k) windVaneWebView.getObject()).m42384v());
            m41596z();
            ((C14191k) windVaneWebView.getObject()).f40919m.onInitSuccess();
            if (this.f40889p) {
                getJSCommon().setWebViewFront(this.f39746V);
            }
        }
        if (getJSCommon().mo42213b() == 1 && (viewGroup = (ViewGroup) this.f39765r.findViewById(C13203i0.m37707a(getContext(), "mbridge_video_templete_webview_parent", "id"))) != null) {
            ((ViewGroup) this.f39765r).removeView(viewGroup);
            ((ViewGroup) this.f39765r).addView(viewGroup, 1);
        }
        viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
    }

    public void preload() {
    }

    public void receiveSuccess() {
        C13219q0.m37813a(f39724s0, "receiveSuccess ,start hybrid");
        this.f39744T.removeCallbacks(this.f39748a0);
        this.f39744T.postDelayed(this.f39764q0, 250L);
    }

    public void registerErrorListener(InterfaceC13904k interfaceC13904k) {
        this.f39741Q = interfaceC13904k;
    }

    public void setAdEvents(AdEvents adEvents) {
        this.f39763p0 = adEvents;
        C14177b c14177b = this.f39774z;
        if (c14177b == null || c14177b.getJSCommon() == null) {
            return;
        }
        this.f39774z.getJSCommon().setAdEvents(adEvents);
    }

    public void setAdSession(AdSession adSession) {
        this.f39761n0 = adSession;
        C14177b c14177b = this.f39774z;
        if (c14177b != null && c14177b.getJSCommon() != null) {
            this.f39774z.getJSCommon().setAdSession(adSession);
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setAdSession(adSession);
        }
    }

    public void setCamPlayOrderCallback(InterfaceC13948a interfaceC13948a, int i) {
        this.f39771w = interfaceC13948a;
        this.f39772x = i;
    }

    public void setCampOrderViewData(List<CampaignEx> list, int i) {
        if (list != null) {
            this.f39735K = list;
        }
        this.f39736L = i;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f39767s = campaignEx;
        if (campaignEx != null) {
            C13154c c13154cM37489b = C13156d.m37475b().m37489b(campaignEx.getCurrentLocalRid());
            this.f39737M = c13154cM37489b;
            if (c13154cM37489b == null) {
                this.f39737M = new C13154c();
            }
            this.f39737M.m37446i(campaignEx.getCurrentLocalRid());
            this.f39737M.m37421a(campaignEx);
            if (TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && !TextUtils.isEmpty(this.f40877d)) {
                campaignEx.setCampaignUnitId(this.f40877d);
            }
            AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
            if (appletsModel != null) {
                this.f39766r0 = appletsModel.isSupportWxScheme();
            }
            C13084b.m37036b().m37046a(campaignEx.getCampaignUnitId() + "_1", campaignEx);
        }
    }

    public void setCampaignDownLoadTask(C14202a c14202a) {
        this.f39768t = c14202a;
    }

    public void setCampaignExpired(boolean z) {
        try {
            CampaignEx campaignEx = this.f39767s;
            if (campaignEx != null) {
                if (!z) {
                    campaignEx.setSpareOfferFlag(0);
                    this.f39767s.setCbt(0);
                    return;
                }
                campaignEx.setSpareOfferFlag(1);
                if (!C13884b.m41421a()) {
                    C14223c c14223c = this.f40879f;
                    if (c14223c != null) {
                        if (c14223c.m42682A() == 1) {
                            this.f39767s.setCbt(1);
                            return;
                        } else {
                            this.f39767s.setCbt(0);
                            return;
                        }
                    }
                    return;
                }
                if (this.f40885l) {
                    this.f39767s.setCbt(0);
                    return;
                }
                C14223c c14223c2 = this.f40879f;
                if (c14223c2 != null) {
                    if (c14223c2.m42682A() == 1) {
                        this.f39767s.setCbt(1);
                    } else {
                        this.f39767s.setCbt(0);
                    }
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b(f39724s0, e.getMessage());
        }
    }

    public void setDeveloperExtraData(String str) {
        this.f39734J = str;
    }

    public void setInstanceId(String str) {
        this.f39773y = str;
    }

    public void setJSFactory(C14177b c14177b) {
        this.f39774z = c14177b;
    }

    public void setMBridgeTempCallback(InterfaceC13931b interfaceC13931b) {
        this.f39770v = interfaceC13931b;
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setMediaPlayerUrl(String str) {
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        this.f39728D = i;
        this.f39729E = i2;
        this.f39730F = i3;
        this.f39731G = i4;
        this.f39732H = i5;
        String strM37652a = C13190d0.m37652a(i, i2, i3, i4, i5);
        this.f39733I = strM37652a;
        C13219q0.m37816b(f39724s0, strM37652a);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.f39733I)) {
            getJSCommon().mo42210a(this.f39733I);
            if (this.f39742R != null && !TextUtils.isEmpty(this.f39733I)) {
                C13392f.m38726a().m38728a((WebView) this.f39742R, "oncutoutfetched", Base64.encodeToString(this.f39733I.getBytes(), 0));
            }
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setNotchPadding(i2, i3, i4, i5);
        }
        MBridgeContainerView mBridgeContainerView = this.f39743S;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.setNotchPadding(i, i2, i3, i4, i5);
        }
    }

    public void setShowRewardListener(InterfaceC13939h interfaceC13939h) {
        this.f39769u = interfaceC13939h;
    }

    public void setShowingTransparent() {
        Activity activity;
        boolean isShowingTransparent = getIsShowingTransparent();
        this.f39754g0 = isShowingTransparent;
        if (isShowingTransparent) {
            return;
        }
        int iM37707a = C13203i0.m37707a(getContext(), "mbridge_reward_theme", "style");
        if (!C13203i0.m37709a(iM37707a) || (activity = this.f40876c) == null) {
            return;
        }
        activity.setTheme(iM37707a);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f39762o0 = mediaEvents;
        C14177b c14177b = this.f39774z;
        if (c14177b != null && c14177b.getJSCommon() != null) {
            this.f39774z.getJSCommon().setVideoEvents(mediaEvents);
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setVideoEvents(mediaEvents);
        }
    }

    public void setWebViewFront(int i) {
        this.f39746V = i;
    }

    public void superDefaultLoad(int i, String str) {
        this.f39744T.removeCallbacks(this.f39747W);
        this.f39744T.removeCallbacks(this.f39748a0);
        this.f39741Q.mo41599a(true);
        WindVaneWebView windVaneWebView = this.f39742R;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: x */
    protected void m41595x() {
        if (this.f39738N) {
            setMatchParent();
        }
    }

    /* JADX INFO: renamed from: z */
    protected void m41596z() {
        int iM37930g;
        int iM37927f;
        try {
            if (this.f39742R != null) {
                int i = getResources().getConfiguration().orientation;
                if (getIsShowingTransparent()) {
                    iM37930g = C13229v0.m37936i(getContext());
                    iM37927f = C13229v0.m37933h(getContext());
                    if (C13195f.m37673a(getContext())) {
                        int iM37911c = C13229v0.m37911c(getContext());
                        if (i == 2) {
                            iM37930g += iM37911c;
                        } else {
                            iM37927f += iM37911c;
                        }
                    }
                } else {
                    iM37930g = C13229v0.m37930g(getContext());
                    iM37927f = C13229v0.m37927f(getContext());
                }
                int iM36778g = this.f39767s.getRewardTemplateMode().m36778g();
                if (m42335a(this.f39767s) == 1) {
                    iM36778g = i;
                }
                getJSNotifyProxy().mo42345a(i, iM36778g, iM37930g, iM37927f);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C13088a.f35870l, C13229v0.m37918d(getContext()));
                try {
                    if (this.f40881h != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", this.f40881h.m42626c());
                        jSONObject2.put("amount", this.f40881h.m42623a());
                        jSONObject2.put("id", this.f40882i);
                        jSONObject.put("userId", this.f40880g);
                        jSONObject.put(C12538u.f32489j, jSONObject2);
                        jSONObject.put("playVideoMute", this.f40883j);
                        jSONObject.put("extra", this.f39734J);
                    }
                } catch (JSONException e) {
                    C13219q0.m37813a(f39724s0, e.getMessage());
                } catch (Exception e2) {
                    C13219q0.m37813a(f39724s0, e2.getMessage());
                }
                String string = jSONObject.toString();
                C13157e c13157e = new C13157e();
                c13157e.m37501a("type", 2);
                C13156d.m37475b().m37483a("2000133", this.f39767s, c13157e);
                getJSNotifyProxy().mo42348a(string);
                C13392f.m38726a().m38728a((WebView) this.f39742R, "oncutoutfetched", Base64.encodeToString(this.f39733I.getBytes(), 0));
                getJSCommon().mo42215b(true);
                if (C13884b.m41421a()) {
                    setChinaCallBackStatus(this.f39742R);
                }
                loadModuleDatas();
                this.f39744T.postDelayed(this.f39747W, 2000L);
            }
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                e3.printStackTrace();
            }
        }
    }
}
