package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewParameters;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13181a0;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.video.dynview.C13940a;
import com.mbridge.msdk.video.dynview.C13941b;
import com.mbridge.msdk.video.dynview.C13942c;
import com.mbridge.msdk.video.dynview.error.EnumC13946a;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13948a;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13953f;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13955h;
import com.mbridge.msdk.video.dynview.moffer.C13965a;
import com.mbridge.msdk.video.dynview.util.C13976a;
import com.mbridge.msdk.video.dynview.wrapper.C13987c;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import com.mbridge.msdk.video.module.listener.impl.C14067i;
import com.mbridge.msdk.video.module.report.C14075b;
import com.mbridge.msdk.video.signal.InterfaceC14199j;
import com.mbridge.msdk.video.signal.factory.C14177b;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.InterfaceC14235b;
import com.mbridge.msdk.widget.dialog.MBAlertDialog;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeVideoView extends MBridgeBaseView implements InterfaceC14199j {

    /* JADX INFO: renamed from: R0 */
    private static int f40392R0;

    /* JADX INFO: renamed from: S0 */
    private static int f40393S0;

    /* JADX INFO: renamed from: T0 */
    private static int f40394T0;

    /* JADX INFO: renamed from: U0 */
    private static int f40395U0;

    /* JADX INFO: renamed from: V0 */
    private static int f40396V0;

    /* JADX INFO: renamed from: W0 */
    private static boolean f40397W0;

    /* JADX INFO: renamed from: X0 */
    private static long f40398X0;

    /* JADX INFO: renamed from: A */
    private boolean f40399A;

    /* JADX INFO: renamed from: A0 */
    private int f40400A0;

    /* JADX INFO: renamed from: B */
    private FrameLayout f40401B;

    /* JADX INFO: renamed from: B0 */
    private int f40402B0;

    /* JADX INFO: renamed from: C */
    private MBridgeClickCTAView f40403C;

    /* JADX INFO: renamed from: C0 */
    private int f40404C0;

    /* JADX INFO: renamed from: D */
    private C14177b f40405D;

    /* JADX INFO: renamed from: D0 */
    private AcquireRewardPopViewParameters f40406D0;

    /* JADX INFO: renamed from: E */
    private int f40407E;

    /* JADX INFO: renamed from: E0 */
    private MBAcquireRewardPopView f40408E0;

    /* JADX INFO: renamed from: F */
    private int f40409F;

    /* JADX INFO: renamed from: F0 */
    private boolean f40410F0;

    /* JADX INFO: renamed from: G */
    private RelativeLayout f40411G;

    /* JADX INFO: renamed from: G0 */
    private RelativeLayout f40412G0;

    /* JADX INFO: renamed from: H */
    private boolean f40413H;

    /* JADX INFO: renamed from: H0 */
    private CollapsibleWebView f40414H0;

    /* JADX INFO: renamed from: I */
    private boolean f40415I;

    /* JADX INFO: renamed from: I0 */
    private RelativeLayout f40416I0;

    /* JADX INFO: renamed from: J */
    private boolean f40417J;

    /* JADX INFO: renamed from: J0 */
    private boolean f40418J0;

    /* JADX INFO: renamed from: K */
    private String f40419K;

    /* JADX INFO: renamed from: K0 */
    private int f40420K0;

    /* JADX INFO: renamed from: L */
    private int f40421L;

    /* JADX INFO: renamed from: L0 */
    private boolean f40422L0;

    /* JADX INFO: renamed from: M */
    private int f40423M;

    /* JADX INFO: renamed from: M0 */
    private boolean f40424M0;

    /* JADX INFO: renamed from: N */
    private int f40425N;

    /* JADX INFO: renamed from: N0 */
    private C14057w f40426N0;

    /* JADX INFO: renamed from: O */
    private MBAlertDialog f40427O;

    /* JADX INFO: renamed from: O0 */
    private boolean f40428O0;

    /* JADX INFO: renamed from: P */
    private InterfaceC14235b f40429P;

    /* JADX INFO: renamed from: P0 */
    private Runnable f40430P0;

    /* JADX INFO: renamed from: Q */
    private String f40431Q;

    /* JADX INFO: renamed from: Q0 */
    private final Runnable f40432Q0;

    /* JADX INFO: renamed from: R */
    private double f40433R;

    /* JADX INFO: renamed from: S */
    private double f40434S;

    /* JADX INFO: renamed from: T */
    private boolean f40435T;

    /* JADX INFO: renamed from: U */
    private boolean f40436U;

    /* JADX INFO: renamed from: V */
    private boolean f40437V;

    /* JADX INFO: renamed from: W */
    private boolean f40438W;

    /* JADX INFO: renamed from: a0 */
    private boolean f40439a0;

    /* JADX INFO: renamed from: b0 */
    private boolean f40440b0;

    /* JADX INFO: renamed from: c0 */
    private boolean f40441c0;

    /* JADX INFO: renamed from: d0 */
    private boolean f40442d0;

    /* JADX INFO: renamed from: e0 */
    private boolean f40443e0;

    /* JADX INFO: renamed from: f0 */
    private int f40444f0;

    /* JADX INFO: renamed from: g0 */
    private boolean f40445g0;

    /* JADX INFO: renamed from: h0 */
    private int f40446h0;
    public boolean hasBufferTimeout;

    /* JADX INFO: renamed from: i0 */
    private AdSession f40447i0;

    /* JADX INFO: renamed from: j0 */
    private MediaEvents f40448j0;

    /* JADX INFO: renamed from: k0 */
    private String f40449k0;

    /* JADX INFO: renamed from: l0 */
    private int f40450l0;

    /* JADX INFO: renamed from: m */
    private TextView f40451m;

    /* JADX INFO: renamed from: m0 */
    private int f40452m0;
    public List<CampaignEx> mCampOrderViewData;
    public int mCampaignSize;
    public int mCurrPlayNum;
    public int mCurrentPlayProgressTime;
    public int mMuteSwitch;
    public PlayerView mPlayerView;
    public SoundImageView mSoundImageView;

    /* JADX INFO: renamed from: n */
    private View f40453n;

    /* JADX INFO: renamed from: n0 */
    private int f40454n0;

    /* JADX INFO: renamed from: o */
    private RelativeLayout f40455o;

    /* JADX INFO: renamed from: o0 */
    private boolean f40456o0;

    /* JADX INFO: renamed from: p */
    private ImageView f40457p;

    /* JADX INFO: renamed from: p0 */
    private boolean f40458p0;

    /* JADX INFO: renamed from: q */
    private ProgressBar f40459q;

    /* JADX INFO: renamed from: q0 */
    private boolean f40460q0;

    /* JADX INFO: renamed from: r */
    private FeedBackButton f40461r;

    /* JADX INFO: renamed from: r0 */
    private boolean f40462r0;

    /* JADX INFO: renamed from: s */
    private ImageView f40463s;

    /* JADX INFO: renamed from: s0 */
    private boolean f40464s0;

    /* JADX INFO: renamed from: t */
    private MBridgeSegmentsProgressBar f40465t;

    /* JADX INFO: renamed from: t0 */
    private boolean f40466t0;
    public TextView tvFlag;

    /* JADX INFO: renamed from: u */
    private InterfaceC14058a f40467u;

    /* JADX INFO: renamed from: u0 */
    private boolean f40468u0;

    /* JADX INFO: renamed from: v */
    private InterfaceC14055u f40469v;

    /* JADX INFO: renamed from: v0 */
    private boolean f40470v0;

    /* JADX INFO: renamed from: w */
    private boolean f40471w;

    /* JADX INFO: renamed from: w0 */
    private boolean f40472w0;

    /* JADX INFO: renamed from: x */
    private InterfaceC13948a f40473x;

    /* JADX INFO: renamed from: x0 */
    private AlphaAnimation f40474x0;

    /* JADX INFO: renamed from: y */
    private InterfaceC13953f f40475y;

    /* JADX INFO: renamed from: y0 */
    private MBridgeBaitClickView f40476y0;

    /* JADX INFO: renamed from: z */
    private int f40477z;

    /* JADX INFO: renamed from: z0 */
    private int f40478z0;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$a */
    class RunnableC14035a implements Runnable {
        RunnableC14035a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeVideoView.this.f40442d0 = true;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$b */
    class RunnableC14036b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f40480a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f40481b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f40482c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f40483d;

        RunnableC14036b(int i, int i2, int i3, int i4) {
            this.f40480a = i;
            this.f40481b = i2;
            this.f40482c = i3;
            this.f40483d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeVideoView.this.f40455o == null) {
                return;
            }
            MBridgeVideoView.this.f40455o.setVisibility(0);
            CampaignEx campaignEx = MBridgeVideoView.this.f40202b;
            if (campaignEx == null || campaignEx.getAdSpaceT() == 2) {
                return;
            }
            MBridgeVideoView.this.f40455o.setPadding(this.f40480a, this.f40481b, this.f40482c, this.f40483d);
            MBridgeVideoView.this.f40455o.startAnimation(MBridgeVideoView.this.f40474x0);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$c */
    class C14037c implements InterfaceC13101c {

        /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$c$a */
        /* JADX INFO: loaded from: classes9.dex */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Bitmap f40486a;

            /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes7.dex */
            class RunnableC15567a implements Runnable {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ Bitmap f40488a;

                RunnableC15567a(Bitmap bitmap) {
                    this.f40488a = bitmap;
                }

                @Override // java.lang.Runnable
                public void run() {
                    MBridgeVideoView.this.f40457p.setVisibility(0);
                    MBridgeVideoView.this.f40457p.setImageBitmap(this.f40488a);
                }
            }

            a(Bitmap bitmap) {
                this.f40486a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    MBridgeVideoView.this.f40457p.post(new RunnableC15567a(C13181a0.m37594a(this.f40486a, 10)));
                } catch (Exception e) {
                    C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
                }
            }
        }

        C14037c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            C13219q0.m37816b(MBridgeBaseView.TAG, str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled() || MBridgeVideoView.this.f40457p == null) {
                        return;
                    }
                    C13167a.m37542a().execute(new a(bitmap));
                } catch (Throwable th) {
                    C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$d */
    class C14038d implements CollapsibleWebView.InterfaceC13357e {
        C14038d() {
        }

        /* JADX INFO: renamed from: a */
        private void m42147a(String str, String str2) {
            if (MBridgeVideoView.this.f40418J0) {
                return;
            }
            MBridgeVideoView.this.f40418J0 = true;
            if (str == null) {
                str = "";
            }
            if (MBridgeVideoView.this.f40412G0 != null && MBridgeVideoView.this.f40412G0.getVisibility() == 0) {
                MBridgeVideoView.this.f40412G0.setVisibility(8);
            }
            C13157e c13157e = new C13157e();
            c13157e.m37501a("result", 2);
            c13157e.m37501a("url", str);
            c13157e.m37501a("reason", str2);
            C13156d.m37475b().m37483a("m_webview_render", MBridgeVideoView.this.f40202b, c13157e);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.InterfaceC13357e
        /* JADX INFO: renamed from: a */
        public void mo38623a(View view, String str) {
            JSONObject jSONObject;
            if (MBridgeVideoView.this.f40418J0) {
                return;
            }
            MBridgeVideoView.this.f40418J0 = true;
            if (MBridgeVideoView.this.f40412G0 != null && MBridgeVideoView.this.f40412G0.getVisibility() != 0) {
                MBridgeVideoView.this.f40412G0.setVisibility(0);
            }
            Context context = MBridgeVideoView.this.getContext();
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            C12682a.m34606a(context, mBridgeVideoView.f40202b, mBridgeVideoView.getUnitId(), MBridgeVideoView.this.f40202b.getNoticeUrl(), true, false, C12701a.f33768o);
            try {
                MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                new C12682a(mBridgeVideoView2.f40201a, mBridgeVideoView2.f40431Q).m34641c(MBridgeVideoView.this.f40202b);
            } catch (Exception unused) {
            }
            C14075b.m42195a(C13008c.m36588n().m36542d().getApplicationContext(), MBridgeVideoView.this.f40202b);
            C13157e c13157e = new C13157e();
            c13157e.m37501a("result", 1);
            if (MBridgeVideoView.this.f40467u != null) {
                try {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put(C13088a.f35868j, MBridgeVideoView.this.m41939a(0));
                    } catch (JSONException e) {
                        e = e;
                        e.printStackTrace();
                    }
                } catch (JSONException e2) {
                    e = e2;
                    jSONObject = null;
                }
                MBridgeVideoView.this.f40467u.mo41600a(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, jSONObject);
                MBridgeVideoView.this.f40202b.setClickType(1);
                MBridgeVideoView.this.f40202b.setClickTempSource(1);
                MBridgeVideoView.this.f40202b.setTriggerClickSource(2);
                C13156d.m37475b().m37482a("2000149", MBridgeVideoView.this.f40202b);
                c13157e.m37501a("type", 9);
                ArrayList arrayList = new ArrayList();
                arrayList.add("web_view");
                c13157e.m37501a("click_path", arrayList.toString());
                C13156d.m37475b().m37483a("2000150", MBridgeVideoView.this.f40202b, c13157e);
            }
            c13157e.m37501a("url", str);
            C13156d.m37475b().m37483a("m_webview_render", MBridgeVideoView.this.f40202b, c13157e);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.InterfaceC13357e
        /* JADX INFO: renamed from: a */
        public void mo38624a(View view, Map<String, String> map) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.InterfaceC13357e
        /* JADX INFO: renamed from: b */
        public void mo38625b(View view, String str) {
            m42147a(str, "timeout");
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.InterfaceC13357e
        /* JADX INFO: renamed from: b */
        public void mo38626b(View view, Map<String, String> map) {
            String str;
            String str2 = "";
            if (map != null) {
                String str3 = map.get("url");
                str2 = str3 != null ? str3 : "";
                str = map.get("description");
            } else {
                str = "";
            }
            m42147a(str2, str);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$e */
    class C14039e extends WebViewClient {
        C14039e() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            C13219q0.m37816b(MBridgeBaseView.TAG, "WebView called onRenderProcessGone");
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th) {
                    C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$f */
    class C14040f implements CommonWebView.InterfaceC13365h {
        C14040f() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.InterfaceC13365h
        /* JADX INFO: renamed from: a */
        public void mo38646a() {
            if (MBridgeVideoView.this.f40416I0 != null) {
                MBridgeVideoView.this.f40416I0.setVisibility(0);
                C13157e c13157e = new C13157e();
                c13157e.m37501a("status", 1);
                C13156d.m37475b().m37483a("m_webview_zoom", MBridgeVideoView.this.f40202b, c13157e);
            }
            if (MBridgeVideoView.this.f40414H0 != null) {
                MBridgeVideoView.this.f40414H0.setCustomizedToolBarMarginWidthPixel(0, 0, 0, 0);
            }
            MBridgeVideoView.this.m42126p();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$g */
    class C14041g implements CommonWebView.InterfaceC13365h {
        C14041g() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.InterfaceC13365h
        /* JADX INFO: renamed from: a */
        public void mo38646a() {
            if (MBridgeVideoView.this.f40416I0 != null) {
                MBridgeVideoView.this.f40416I0.setVisibility(8);
                C13157e c13157e = new C13157e();
                c13157e.m37501a("status", 2);
                C13156d.m37475b().m37483a("m_webview_zoom", MBridgeVideoView.this.f40202b, c13157e);
            }
            if (MBridgeVideoView.this.f40414H0 != null) {
                MBridgeVideoView.this.f40414H0.setCustomizedToolBarMarginWidthPixel(0, MBridgeVideoView.this.f40420K0, 0, 0);
            }
            MBridgeVideoView.this.m42124o();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$h */
    class ViewOnClickListenerC14042h implements View.OnClickListener {
        ViewOnClickListenerC14042h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeVideoView.this.f40416I0 != null) {
                MBridgeVideoView.this.f40416I0.setVisibility(0);
            }
            if (MBridgeVideoView.this.f40412G0 != null) {
                MBridgeVideoView.this.f40412G0.setVisibility(8);
            }
            if (MBridgeVideoView.this.f40464s0) {
                return;
            }
            MBridgeVideoView.this.m42126p();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$i */
    class ViewOnClickListenerC14043i implements View.OnClickListener {
        ViewOnClickListenerC14043i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            if (mBridgeVideoView.notifyListener != null) {
                mBridgeVideoView.f40202b.setTriggerClickSource(2);
                MBridgeVideoView.this.m42084b("bait_click_clicked");
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$j */
    class C14044j implements AcquireRewardPopViewBehaviourListener {
        C14044j() {
        }

        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
        public void onOutOfContentClicked(float f, float f2) {
            if (MBridgeVideoView.this.f40467u != null) {
                MBridgeVideoView.this.f40467u.mo41600a(105, "");
            }
        }

        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
        public void onReceivedFail(String str) {
            MBridgeVideoView.this.f40417J = false;
            if (C13884b.m41422b()) {
                MBridgeVideoView.this.setCover(false);
            }
            MBridgeVideoView.this.m42126p();
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            C13148j.m37388a(mBridgeVideoView.f40202b, mBridgeVideoView.f40431Q, MBridgeVideoView.this.f40478z0, 2, str);
        }

        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
        public void onReceivedSuccess(int i) {
            MBridgeVideoView.this.f40417J = false;
            if (C13884b.m41422b()) {
                MBridgeVideoView.this.setCover(false);
            }
            int videoCompleteTime = MBridgeVideoView.this.getVideoCompleteTime() - i;
            MBridgeVideoView.this.f40202b.setVideoCompleteTime(videoCompleteTime);
            MBridgeVideoView.this.m42126p();
            InterfaceC14058a interfaceC14058a = MBridgeVideoView.this.notifyListener;
            if (interfaceC14058a != null) {
                interfaceC14058a.mo41600a(130, Integer.valueOf(videoCompleteTime));
            }
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            C13148j.m37388a(mBridgeVideoView.f40202b, mBridgeVideoView.f40431Q, MBridgeVideoView.this.f40478z0, 1, "");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$k */
    class RunnableC14045k implements Runnable {
        RunnableC14045k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeVideoView.this.f40401B != null) {
                MBridgeVideoView.this.f40401B.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$l */
    class C14046l implements InterfaceC13955h {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ViewGroup f40498a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f40499b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C13942c f40500c;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$l$a */
        class a extends AbstractViewOnClickListenerC14227a {
            a() {
            }

            @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
            /* JADX INFO: renamed from: a */
            protected void mo38475a(View view) {
                if (view instanceof TextView) {
                    MBridgeVideoView.this.f40202b.setTriggerClickSource(1);
                } else {
                    MBridgeVideoView.this.f40202b.setTriggerClickSource(2);
                }
                if (MBridgeVideoView.this.f40202b.getRewardTemplateMode() == null || MBridgeVideoView.this.f40202b.getRewardTemplateMode().m36782k() != 902) {
                    MBridgeVideoView.this.m42084b("video_play_click");
                } else {
                    MBridgeVideoView.this.m42108j();
                }
            }
        }

        C14046l(ViewGroup viewGroup, CampaignEx campaignEx, C13942c c13942c) {
            this.f40498a = viewGroup;
            this.f40499b = campaignEx;
            this.f40500c = c13942c;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13955h
        /* JADX INFO: renamed from: a */
        public void mo41638a(C13940a c13940a) {
            if (c13940a != null) {
                if (this.f40498a != null && c13940a.m41699b() != null) {
                    c13940a.m41699b().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f40498a.addView(c13940a.m41699b());
                }
                if (c13940a.m41695a() != null) {
                    for (View view : c13940a.m41695a()) {
                        C13185b1.m37632a(view, this.f40499b.getLocalRequestId(), this.f40499b.getLocalAllowTrackClick());
                        view.setOnClickListener(new a());
                    }
                }
                MBridgeVideoView.this.f40472w0 = c13940a.m41700c();
                MBridgeVideoView.this.m42120n();
                boolean unused = MBridgeVideoView.f40397W0 = false;
                MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                CampaignEx campaignEx = mBridgeVideoView.f40202b;
                if (campaignEx != null) {
                    campaignEx.setTemplateRenderSucc(mBridgeVideoView.f40472w0);
                }
                MBridgeVideoView.this.f40407E = this.f40500c.m41714j();
                MBridgeVideoView.this.f40409F = this.f40500c.m41709e();
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13955h
        /* JADX INFO: renamed from: a */
        public void mo41639a(EnumC13946a enumC13946a) {
            C13219q0.m37816b(MBridgeBaseView.TAG, "errorMsg：" + enumC13946a.m41772h());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$m */
    class RunnableC14047m implements Runnable {
        RunnableC14047m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeVideoView.this.f40400A0 <= 0) {
                MBridgeVideoView.this.showRewardPopView();
                MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                mBridgeVideoView.removeCallbacks(mBridgeVideoView.f40432Q0);
            } else {
                MBridgeVideoView.m42069W(MBridgeVideoView.this);
                MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                mBridgeVideoView2.postDelayed(mBridgeVideoView2.f40432Q0, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$n */
    class C14048n implements PlayerView.OnPlayerViewVisibleListener {
        C14048n() {
        }

        @Override // com.mbridge.msdk.playercommon.PlayerView.OnPlayerViewVisibleListener
        public void playerViewVisibleCallback() {
            if (MBridgeVideoView.this.f40471w) {
                return;
            }
            MBridgeVideoView.this.f40471w = true;
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            if (mBridgeVideoView.notifyListener == null || mBridgeVideoView.f40469v == null) {
                return;
            }
            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
            mBridgeVideoView2.notifyListener.mo41600a(20, mBridgeVideoView2.f40469v);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$o */
    class ViewOnClickListenerC14049o implements View.OnClickListener {
        ViewOnClickListenerC14049o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeVideoView.this.notifyListener != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(C13088a.f35868j, MBridgeVideoView.this.mPlayerView.buildH5JsonObject(0));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                MBridgeVideoView.this.f40202b.setClickTempSource(1);
                MBridgeVideoView.this.f40202b.setTriggerClickSource(2);
                MBridgeVideoView.this.notifyListener.mo41600a(1, jSONObject);
            }
            if (MBridgeVideoView.this.f40448j0 != null) {
                try {
                    MBridgeVideoView.this.f40448j0.adUserInteraction(InteractionType.CLICK);
                    C13219q0.m37813a("omsdk", "play video view:  click");
                } catch (Exception e2) {
                    C13219q0.m37816b("omsdk", e2.getMessage());
                }
            }
            MBridgeVideoView.this.setCTALayoutVisibleOrGone();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$p */
    class ViewOnClickListenerC14050p implements View.OnClickListener {
        ViewOnClickListenerC14050p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoView.this.f40202b.setClickTempSource(1);
            MBridgeVideoView.this.f40202b.setTriggerClickSource(2);
            C13156d.m37475b().m37482a("m_player_click", MBridgeVideoView.this.f40202b);
            if (MBridgeVideoView.this.notifyListener != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(C13088a.f35868j, MBridgeVideoView.this.mPlayerView.buildH5JsonObject(0));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                MBridgeVideoView.this.notifyListener.mo41600a(1, jSONObject);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$q */
    class ViewOnClickListenerC14051q implements View.OnClickListener {
        ViewOnClickListenerC14051q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C13157e c13157e = new C13157e();
            Integer num = 2;
            PlayerView playerView = MBridgeVideoView.this.mPlayerView;
            if (playerView != null) {
                c13157e.m37501a("mute_state", Boolean.valueOf(playerView.isSilent()));
                if (MBridgeVideoView.this.mPlayerView.isSilent()) {
                    num = 1;
                }
            }
            if (num.intValue() == 1) {
                MBridgeVideoView.this.mMuteSwitch = 2;
            } else {
                MBridgeVideoView.this.mMuteSwitch = 1;
            }
            InterfaceC14058a interfaceC14058a = MBridgeVideoView.this.notifyListener;
            if (interfaceC14058a != null) {
                interfaceC14058a.mo41600a(5, num);
            }
            C13156d.m37475b().m37483a("m_sound_click", MBridgeVideoView.this.f40202b, c13157e);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$r */
    class ViewOnClickListenerC14052r implements View.OnClickListener {
        ViewOnClickListenerC14052r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("type", 1);
                C13156d.m37475b().m37486a("2000152", c13157e);
                C13156d.m37475b().m37483a("2000148", MBridgeVideoView.this.f40202b, c13157e);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
            if (!MBridgeVideoView.this.f40445g0) {
                CampaignEx campaignEx = MBridgeVideoView.this.f40202b;
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || MBridgeVideoView.this.f40202b.getRewardTemplateMode().m36782k() != 5002010 || !MBridgeVideoView.this.f40464s0) {
                    MBridgeVideoView.this.m42144y();
                    return;
                }
                MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                if (mBridgeVideoView.notifyListener != null) {
                    mBridgeVideoView.f40422L0 = true;
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    mBridgeVideoView2.notifyListener.mo41600a(2, mBridgeVideoView2.m42089c(mBridgeVideoView2.f40464s0));
                    return;
                }
                return;
            }
            MBridgeVideoView.this.f40470v0 = true;
            CampaignEx campaignEx2 = MBridgeVideoView.this.f40202b;
            if (campaignEx2 != null && campaignEx2.getRewardTemplateMode() != null && MBridgeVideoView.this.f40202b.getRewardTemplateMode().m36782k() == 5002010 && MBridgeVideoView.this.f40464s0) {
                MBridgeVideoView mBridgeVideoView3 = MBridgeVideoView.this;
                if (mBridgeVideoView3.notifyListener != null) {
                    mBridgeVideoView3.f40422L0 = true;
                    MBridgeVideoView mBridgeVideoView4 = MBridgeVideoView.this;
                    mBridgeVideoView4.notifyListener.mo41600a(2, mBridgeVideoView4.m42089c(mBridgeVideoView4.f40464s0));
                    return;
                }
                return;
            }
            if (MBridgeVideoView.this.f40462r0) {
                MBridgeVideoView.this.m42144y();
                return;
            }
            InterfaceC14058a interfaceC14058a = MBridgeVideoView.this.notifyListener;
            if (interfaceC14058a != null) {
                interfaceC14058a.mo41600a(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, "");
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$s */
    class C14053s implements InterfaceC14235b {
        C14053s() {
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: a */
        public void mo37091a() {
            MBridgeVideoView.this.f40415I = false;
            MBridgeVideoView.this.f40460q0 = true;
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.f40415I);
            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
            C13148j.m37382a(mBridgeVideoView2.f40201a, mBridgeVideoView2.f40202b, mBridgeVideoView2.f40449k0, MBridgeVideoView.this.f40431Q, 1, 1, 1);
            if (MBridgeVideoView.this.f40445g0 && MBridgeVideoView.this.f40450l0 == C13088a.f35842H) {
                MBridgeVideoView mBridgeVideoView3 = MBridgeVideoView.this;
                if (mBridgeVideoView3.notifyListener != null) {
                    mBridgeVideoView3.f40422L0 = true;
                    MBridgeVideoView mBridgeVideoView4 = MBridgeVideoView.this;
                    mBridgeVideoView4.notifyListener.mo41600a(2, mBridgeVideoView4.m42089c(mBridgeVideoView4.f40464s0));
                    return;
                }
                return;
            }
            if (MBridgeVideoView.this.f40445g0 && MBridgeVideoView.this.f40450l0 == C13088a.f35843I) {
                MBridgeVideoView.this.m42126p();
                return;
            }
            MBridgeVideoView mBridgeVideoView5 = MBridgeVideoView.this;
            if (mBridgeVideoView5.notifyListener != null) {
                mBridgeVideoView5.f40422L0 = true;
                MBridgeVideoView.this.notifyListener.mo41600a(2, "");
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: b */
        public void mo37092b() {
            MBridgeVideoView.this.f40415I = false;
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.f40415I);
            if (MBridgeVideoView.this.f40445g0 && (MBridgeVideoView.this.f40450l0 == C13088a.f35843I || MBridgeVideoView.this.f40450l0 == C13088a.f35842H)) {
                MBridgeVideoView.this.f40458p0 = true;
                InterfaceC14058a interfaceC14058a = MBridgeVideoView.this.notifyListener;
                if (interfaceC14058a != null) {
                    interfaceC14058a.mo41600a(124, "");
                }
                MBridgeVideoView.this.f40468u0 = true;
                MBridgeVideoView.this.gonePlayingCloseView();
            }
            MBridgeVideoView.this.m42126p();
            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
            C13148j.m37382a(mBridgeVideoView2.f40201a, mBridgeVideoView2.f40202b, mBridgeVideoView2.f40449k0, MBridgeVideoView.this.f40431Q, 1, 0, 1);
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: c */
        public void mo37093c() {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$t */
    class C14054t implements InterfaceC13083a {
        C14054t() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            MBridgeVideoView.this.m42124o();
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            MBridgeVideoView.this.m42126p();
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            MBridgeVideoView.this.m42126p();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$u */
    public interface InterfaceC14055u {
        /* JADX INFO: renamed from: a */
        void mo41597a();
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$v */
    public static class C14056v {

        /* JADX INFO: renamed from: a */
        public int f40511a;

        /* JADX INFO: renamed from: b */
        public int f40512b;

        /* JADX INFO: renamed from: c */
        public boolean f40513c;

        public String toString() {
            return "ProgressData{curPlayPosition=" + this.f40511a + ", allDuration=" + this.f40512b + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$w */
    private static final class C14057w extends DefaultVideoPlayerStatusListener {

        /* JADX INFO: renamed from: a */
        private MBridgeVideoView f40514a;

        /* JADX INFO: renamed from: b */
        private int f40515b;

        /* JADX INFO: renamed from: c */
        private int f40516c;

        /* JADX INFO: renamed from: d */
        private int f40517d;

        /* JADX INFO: renamed from: e */
        private boolean f40518e;

        /* JADX INFO: renamed from: f */
        private MediaEvents f40519f;

        /* JADX INFO: renamed from: k */
        private boolean f40524k;

        /* JADX INFO: renamed from: l */
        private String f40525l;

        /* JADX INFO: renamed from: m */
        private CampaignEx f40526m;

        /* JADX INFO: renamed from: n */
        private int f40527n;

        /* JADX INFO: renamed from: o */
        private int f40528o;

        /* JADX INFO: renamed from: g */
        private C14056v f40520g = new C14056v();

        /* JADX INFO: renamed from: h */
        private boolean f40521h = false;

        /* JADX INFO: renamed from: i */
        private boolean f40522i = false;

        /* JADX INFO: renamed from: j */
        private boolean f40523j = false;

        /* JADX INFO: renamed from: p */
        private boolean f40529p = false;

        public C14057w(MBridgeVideoView mBridgeVideoView) {
            this.f40514a = mBridgeVideoView;
            if (mBridgeVideoView != null) {
                this.f40525l = mBridgeVideoView.getUnitId();
                this.f40526m = mBridgeVideoView.getCampaign();
            }
        }

        /* JADX INFO: renamed from: a */
        private void m42149a(int i) {
            if (i <= 0) {
                this.f40514a.f40451m.setBackgroundResource(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_shape_progress", "drawable"));
                return;
            }
            this.f40514a.f40451m.setBackgroundResource(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_time_count_num_bg", "drawable"));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C13229v0.m37876a(C13008c.m36588n().m36542d(), 30.0f));
            int iM37876a = C13229v0.m37876a(C13008c.m36588n().m36542d(), 5.0f);
            layoutParams.addRule(1, C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_native_endcard_feed_btn", "id"));
            layoutParams.setMargins(iM37876a, 0, 0, 0);
            this.f40514a.f40451m.setPadding(iM37876a, 0, iM37876a, 0);
            this.f40514a.f40451m.setLayoutParams(layoutParams);
        }

        /* JADX INFO: renamed from: a */
        private void m42150a(int i, int i2) {
            int i3;
            String str;
            int i4 = this.f40527n;
            if (i4 == 100 || this.f40529p || i4 == 0) {
                return;
            }
            if (this.f40528o > i4) {
                this.f40528o = i4 / 2;
            }
            int i5 = this.f40528o;
            if (i5 < 0 || i < (i3 = (i2 * i5) / 100)) {
                return;
            }
            if (this.f40526m.getAdType() == 94 || this.f40526m.getAdType() == 287) {
                str = this.f40526m.getRequestId() + this.f40526m.getId() + this.f40526m.getVideoUrlEncode();
            } else {
                str = this.f40526m.getId() + this.f40526m.getVideoUrlEncode() + this.f40526m.getBidToken();
            }
            C14202a c14202aM42516a = C14203b.getInstance().m42516a(this.f40525l, str);
            if (c14202aM42516a != null) {
                c14202aM42516a.m42473A();
                this.f40529p = true;
                C13219q0.m37816b("DefaultVideoPlayerStatusListener", "CDRate is : " + i3 + " and start download !");
            }
        }

        /* JADX INFO: renamed from: a */
        private void m42151a(int i, int i2, int i3) {
            StringBuilder sb;
            String str;
            String string;
            MBridgeVideoView mBridgeVideoView = this.f40514a;
            if (mBridgeVideoView == null) {
                return;
            }
            int i4 = 0;
            if (this.f40524k) {
                string = String.format("%s", Integer.valueOf(i2 - i3));
            } else {
                if (i > i2) {
                    i = i2;
                }
                int i5 = i <= 0 ? i2 - i3 : i - i3;
                if (i5 <= 0) {
                    string = i <= 0 ? "0" : (String) mBridgeVideoView.getContext().getResources().getText(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                } else {
                    if (i <= 0) {
                        sb = new StringBuilder();
                        sb.append(i5);
                        str = "";
                    } else {
                        sb = new StringBuilder();
                        sb.append(i5);
                        str = (String) this.f40514a.getContext().getResources().getText(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_view_reward_time_left", TypedValues.Custom.S_STRING));
                    }
                    sb.append(str);
                    string = sb.toString();
                    i4 = i5;
                }
                if (i4 < this.f40514a.f40404C0 && this.f40514a.f40408E0 != null && this.f40514a.f40417J) {
                    this.f40514a.f40408E0.onTimeLessThanReduce(i4);
                }
            }
            CampaignEx campaignEx = this.f40526m;
            if (campaignEx != null && campaignEx.getUseSkipTime() == 1) {
                int iMin = Math.min(this.f40514a.f40421L, i2);
                if (iMin >= i || iMin < 0) {
                    int i6 = i - i3;
                    if (this.f40524k) {
                        if (i6 > 0) {
                            string = i6 + ((String) this.f40514a.getContext().getResources().getText(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                        } else if (i6 == 0) {
                            this.f40514a.f40451m.setVisibility(4);
                        }
                    }
                } else {
                    int i7 = iMin - i3;
                    if (i7 > 0) {
                        string = i7 + ((String) this.f40514a.getContext().getResources().getText(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                    } else if (this.f40524k && i7 == 0) {
                        this.f40514a.f40451m.setVisibility(4);
                    }
                }
            }
            this.f40514a.f40451m.setText(string);
            if (this.f40514a.f40459q == null || this.f40514a.f40459q.getVisibility() != 0) {
                return;
            }
            this.f40514a.f40459q.setProgress(i3);
        }

        /* JADX INFO: renamed from: b */
        private void m42152b(int i) {
            MBridgeVideoView mBridgeVideoView = this.f40514a;
            if (mBridgeVideoView == null || mBridgeVideoView.f40451m == null) {
                return;
            }
            String str = "mbridge_reward_video_time_count_num_bg";
            if (this.f40526m.getDynamicTempCode() == 5) {
                MBridgeVideoView mBridgeVideoView2 = this.f40514a;
                if (mBridgeVideoView2.mCurrPlayNum > 1 && i <= 0) {
                    mBridgeVideoView2.f40451m.setBackgroundResource(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                    m42155e();
                    return;
                }
            }
            if (i <= 0) {
                str = "mbridge_reward_shape_progress";
            } else if (!this.f40524k || this.f40526m.getDynamicTempCode() == 5) {
                m42155e();
            }
            CampaignEx campaignEx = this.f40526m;
            if (campaignEx != null && campaignEx.getUseSkipTime() == 1 && this.f40524k) {
                m42155e();
            }
            this.f40514a.f40451m.setBackgroundResource(C13203i0.m37707a(C13008c.m36588n().m36542d(), str, "drawable"));
        }

        /* JADX INFO: renamed from: b */
        private void m42153b(int i, int i2, int i3) {
            int i4;
            StringBuilder sb;
            MBridgeVideoView mBridgeVideoView = this.f40514a;
            if (mBridgeVideoView == null) {
                return;
            }
            String string = (String) mBridgeVideoView.getContext().getResources().getText(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
            String str = (String) this.f40514a.getContext().getResources().getText(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_view_reward_time_left", TypedValues.Custom.S_STRING));
            if (i >= 0) {
                if (this.f40526m.getUseSkipTime() == 1) {
                    int iMin = Math.min(this.f40514a.f40421L, i);
                    if (iMin >= i || iMin <= 0) {
                        i4 = i - i3;
                        if (this.f40524k) {
                            if (i4 <= 0) {
                                this.f40514a.f40451m.setVisibility(4);
                            } else {
                                str = (String) this.f40514a.getContext().getResources().getText(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING));
                            }
                        }
                    } else {
                        i4 = iMin - i3;
                        if (i4 <= 0) {
                            i4 = i - i3;
                            if (this.f40524k) {
                                this.f40514a.f40451m.setVisibility(4);
                            }
                        } else {
                            str = (String) this.f40514a.getContext().getResources().getText(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING));
                        }
                    }
                } else {
                    i4 = i - i3;
                }
                if (i4 > 0) {
                    string = i4 + str;
                }
            } else {
                i4 = i2 - i3;
                if (i4 > 0) {
                    if (i <= 0) {
                        sb = new StringBuilder();
                        sb.append(i4);
                        sb.append("");
                    } else {
                        sb = new StringBuilder();
                        sb.append(i4);
                        sb.append(str);
                    }
                    string = sb.toString();
                } else if (i <= 0) {
                    string = "0";
                }
            }
            this.f40520g.f40511a = i3;
            this.f40514a.f40451m.setText(string);
            if (this.f40514a.f40459q != null && this.f40514a.f40459q.getVisibility() == 0) {
                this.f40514a.f40459q.setProgress(i3);
            }
            if (i4 >= this.f40514a.f40404C0 || this.f40514a.f40408E0 == null || !this.f40514a.f40417J) {
                return;
            }
            this.f40514a.f40408E0.onTimeLessThanReduce(i4);
        }

        /* JADX INFO: renamed from: c */
        private void m42154c() {
            int i;
            CampaignEx campaignEx;
            String str;
            if (!C13223s0.m37831a().m37842a("h_c_r_w_p_c", false) || (i = this.f40527n) == 100 || this.f40528o != 0 || this.f40529p || i == 0 || (campaignEx = this.f40526m) == null) {
                return;
            }
            try {
                if (campaignEx.getAdType() == 94 || this.f40526m.getAdType() == 287) {
                    str = this.f40526m.getRequestId() + this.f40526m.getId() + this.f40526m.getVideoUrlEncode();
                } else {
                    str = this.f40526m.getId() + this.f40526m.getVideoUrlEncode() + this.f40526m.getBidToken();
                }
                C14202a c14202aM42516a = C14203b.getInstance().m42516a(this.f40525l, str);
                if (c14202aM42516a != null) {
                    c14202aM42516a.m42473A();
                    this.f40529p = true;
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("DefaultVideoPlayerStatusListener", "CDRate is : 0  and start download when player create!");
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("DefaultVideoPlayerStatusListener", e.getMessage());
                }
            }
        }

        /* JADX INFO: renamed from: e */
        private void m42155e() {
            MBridgeVideoView mBridgeVideoView = this.f40514a;
            if (mBridgeVideoView == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mBridgeVideoView.f40451m.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = C13229v0.m37876a(C13008c.m36588n().m36542d(), 25.0f);
                this.f40514a.f40451m.setLayoutParams(layoutParams);
            }
            int iM37876a = C13229v0.m37876a(C13008c.m36588n().m36542d(), 5.0f);
            this.f40514a.f40451m.setPadding(iM37876a, 0, iM37876a, 0);
        }

        /* JADX INFO: renamed from: a */
        public int m42156a() {
            return this.f40515b;
        }

        /* JADX INFO: renamed from: a */
        public void m42157a(CampaignEx campaignEx) {
            this.f40526m = campaignEx;
        }

        /* JADX INFO: renamed from: a */
        public void m42158a(String str) {
            this.f40525l = str;
        }

        /* JADX INFO: renamed from: a */
        public void m42159a(boolean z) {
            this.f40524k = z;
        }

        /* JADX INFO: renamed from: b */
        public int m42160b() {
            return this.f40517d;
        }

        /* JADX INFO: renamed from: b */
        public void m42161b(int i, int i2) {
            this.f40527n = i;
            this.f40528o = i2;
            m42154c();
        }

        /* JADX INFO: renamed from: d */
        public void m42162d() {
            this.f40514a = null;
            boolean unused = MBridgeVideoView.f40397W0 = false;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                MediaEvents mediaEvents = this.f40519f;
                if (mediaEvents != null) {
                    mediaEvents.bufferFinish();
                    C13219q0.m37813a("omsdk", "play:  videoEvents.bufferFinish()");
                }
                this.f40514a.notifyListener.mo41600a(14, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if (this.f40519f != null) {
                    C13219q0.m37813a("omsdk", "play:  videoEvents.bufferStart()");
                    this.f40519f.bufferStart();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingTimeOut(String str) {
            try {
                MBridgeVideoView mBridgeVideoView = this.f40514a;
                mBridgeVideoView.hasBufferTimeout = true;
                mBridgeVideoView.notifyListener.mo41600a(13, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayCompleted() {
            MBridgeVideoView mBridgeVideoView;
            super.onPlayCompleted();
            this.f40514a.f40464s0 = true;
            CampaignEx campaignEx = this.f40526m;
            if (campaignEx != null) {
                if (this.f40524k && campaignEx.getRewardTemplateMode() != null && this.f40526m.getRewardTemplateMode().m36782k() == 5002010) {
                    this.f40514a.f40451m.setText("0");
                } else {
                    this.f40514a.f40451m.setText(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                }
                this.f40526m.setVideoPlayProgress(100);
                if (this.f40526m.getAdSpaceT() == 2) {
                    this.f40514a.f40453n.setVisibility(4);
                    if (this.f40514a.f40461r != null) {
                        this.f40514a.f40461r.setClickable(false);
                    }
                    SoundImageView soundImageView = this.f40514a.mSoundImageView;
                    if (soundImageView != null) {
                        soundImageView.setClickable(false);
                    }
                }
            } else {
                this.f40514a.f40451m.setText("0");
            }
            MediaEvents mediaEvents = this.f40519f;
            if (mediaEvents != null) {
                mediaEvents.complete();
                C13219q0.m37813a("omsdk", "play:  videoEvents.complete()");
            }
            this.f40514a.mPlayerView.setClickable(false);
            String strM42089c = this.f40514a.m42089c(true);
            CampaignEx campaignEx2 = this.f40526m;
            if (campaignEx2 != null && campaignEx2.getRewardTemplateMode() != null && this.f40526m.getRewardTemplateMode().m36782k() == 5002010) {
                this.f40514a.m42143x();
            }
            CampaignEx campaignEx3 = this.f40526m;
            if (campaignEx3 != null && campaignEx3.getDynamicTempCode() == 5 && (mBridgeVideoView = this.f40514a) != null && mBridgeVideoView.f40473x != null) {
                MBridgeVideoView mBridgeVideoView2 = this.f40514a;
                if (mBridgeVideoView2.mCampaignSize > mBridgeVideoView2.mCurrPlayNum) {
                    HashMap map = new HashMap();
                    map.put(C11744X3.i.f26338L, Integer.valueOf(this.f40514a.mCurrPlayNum));
                    int i = this.f40514a.mMuteSwitch;
                    if (i != 0) {
                        map.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i));
                    }
                    this.f40514a.f40473x.mo39337a(map);
                    return;
                }
            }
            MBridgeVideoView mBridgeVideoView3 = this.f40514a;
            if (mBridgeVideoView3 != null) {
                mBridgeVideoView3.notifyListener.mo41600a(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, "");
                this.f40514a.notifyListener.mo41600a(11, strM42089c);
            }
            int i2 = this.f40516c;
            this.f40515b = i2;
            this.f40514a.mCurrentPlayProgressTime = i2;
            boolean unused = MBridgeVideoView.f40397W0 = true;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayError(String str) {
            C13219q0.m37816b("DefaultVideoPlayerStatusListener", "errorStr" + str);
            super.onPlayError(str);
            MBridgeVideoView mBridgeVideoView = this.f40514a;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.notifyListener.mo41600a(12, str);
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayProgress(int i, int i2) {
            CampaignEx campaignEx;
            int videoCompleteTime;
            super.onPlayProgress(i, i2);
            if (MBridgeVideoView.f40398X0 == 0) {
                long unused = MBridgeVideoView.f40398X0 = System.currentTimeMillis();
            }
            if (!this.f40514a.f40424M0 && this.f40514a.f40475y != null) {
                this.f40514a.f40424M0 = true;
                this.f40514a.f40475y.mo41598a();
            }
            if (this.f40514a.f40205e) {
                CampaignEx campaignEx2 = this.f40526m;
                if (campaignEx2 != null) {
                    videoCompleteTime = campaignEx2.getVideoCompleteTime();
                    if (videoCompleteTime <= 0) {
                        videoCompleteTime = i2;
                    }
                    C13084b.m37036b().m37053b(this.f40526m.getCampaignUnitId() + "_1", i);
                } else {
                    videoCompleteTime = 0;
                }
                CampaignEx campaignEx3 = this.f40526m;
                if (campaignEx3 != null && campaignEx3.isDynamicView() && this.f40526m.getDynamicTempCode() == 5) {
                    try {
                        m42153b(videoCompleteTime, this.f40514a.f40477z, i);
                    } catch (Exception e) {
                        C13219q0.m37816b("DefaultVideoPlayerStatusListener", e.getMessage());
                    }
                } else {
                    m42151a(videoCompleteTime, i2, i);
                    this.f40520g.f40511a = i;
                }
            }
            this.f40516c = i2;
            C14056v c14056v = this.f40520g;
            c14056v.f40512b = i2;
            c14056v.f40513c = this.f40514a.f40468u0;
            this.f40515b = i;
            if (this.f40514a.f40463s != null) {
                this.f40514a.f40463s.setTag("" + this.f40515b);
            }
            MBridgeVideoView mBridgeVideoView = this.f40514a;
            mBridgeVideoView.mCurrentPlayProgressTime = i;
            mBridgeVideoView.notifyListener.mo41600a(15, this.f40520g);
            MediaEvents mediaEvents = this.f40519f;
            if (mediaEvents != null) {
                int i3 = (i * 100) / i2;
                int i4 = ((i + 1) * 100) / i2;
                if (i3 <= 25 && 25 < i4 && !this.f40521h) {
                    this.f40521h = true;
                    mediaEvents.firstQuartile();
                    C13219q0.m37813a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i3 <= 50 && 50 < i4 && !this.f40522i) {
                    this.f40522i = true;
                    mediaEvents.midpoint();
                    C13219q0.m37813a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i3 <= 75 && 75 < i4 && !this.f40523j) {
                    this.f40523j = true;
                    mediaEvents.thirdQuartile();
                    C13219q0.m37813a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            if (this.f40514a.f40445g0 && !this.f40514a.f40456o0 && this.f40514a.f40450l0 == C13088a.f35843I) {
                this.f40514a.m42144y();
            }
            try {
                MBridgeVideoView mBridgeVideoView2 = this.f40514a;
                if (mBridgeVideoView2 != null && mBridgeVideoView2.f40465t != null) {
                    int i5 = (i * 100) / i2;
                    this.f40514a.f40465t.setProgress(i5, this.f40514a.mCurrPlayNum - 1);
                    this.f40526m.setVideoPlayProgress(i5);
                }
                MBridgeVideoView mBridgeVideoView3 = this.f40514a;
                if (mBridgeVideoView3 != null) {
                    int i6 = mBridgeVideoView3.f40409F != -5 ? this.f40514a.f40409F : this.f40514a.f40407E;
                    if (i6 != -1 && i == i6 && (campaignEx = this.f40514a.f40202b) != null && campaignEx.isDynamicView()) {
                        this.f40514a.setCTALayoutVisibleOrGone();
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37816b("DefaultVideoPlayerStatusListener", th.getMessage());
            }
            m42150a(i, i2);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayStarted(int i) {
            PlayerView playerView;
            CampaignEx campaignEx;
            super.onPlayStarted(i);
            MBridgeVideoView mBridgeVideoView = this.f40514a;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.m42099g();
            }
            if (!this.f40518e) {
                MBridgeVideoView mBridgeVideoView2 = this.f40514a;
                if (mBridgeVideoView2 != null) {
                    mBridgeVideoView2.f40399A = true;
                    this.f40514a.notifyListener.mo41600a(10, this.f40520g);
                }
                this.f40518e = true;
            }
            this.f40517d = i;
            CampaignEx campaignEx2 = this.f40526m;
            if (campaignEx2 != null) {
                int videoCompleteTime = campaignEx2.getVideoCompleteTime();
                if (videoCompleteTime <= 0) {
                    videoCompleteTime = i;
                }
                if (this.f40526m.isDynamicView()) {
                    m42152b(videoCompleteTime);
                } else {
                    m42149a(videoCompleteTime);
                }
            }
            MBridgeVideoView mBridgeVideoView3 = this.f40514a;
            if (mBridgeVideoView3 != null && mBridgeVideoView3.f40459q != null) {
                this.f40514a.f40459q.setMax(i);
            }
            MBridgeVideoView mBridgeVideoView4 = this.f40514a;
            if (mBridgeVideoView4 != null && mBridgeVideoView4.f40455o != null && (campaignEx = this.f40526m) != null && campaignEx.getAdSpaceT() == 2) {
                this.f40514a.f40455o.setVisibility(0);
            }
            MBridgeVideoView mBridgeVideoView5 = this.f40514a;
            if (mBridgeVideoView5 != null && mBridgeVideoView5.f40451m != null && this.f40514a.f40451m.getVisibility() == 0) {
                this.f40514a.m42096f();
            }
            boolean unused = MBridgeVideoView.f40397W0 = false;
            if (this.f40514a != null && this.f40526m.isDynamicView()) {
                if (this.f40514a.f40409F != -5) {
                    if (this.f40514a.f40409F == 0) {
                        this.f40514a.setCTALayoutVisibleOrGone();
                    }
                } else if (this.f40514a.f40407E == 0) {
                    this.f40514a.setCTALayoutVisibleOrGone();
                }
            }
            MBridgeVideoView mBridgeVideoView6 = this.f40514a;
            if (mBridgeVideoView6 != null) {
                mBridgeVideoView6.showMoreOfferInPlayTemplate();
                this.f40514a.showBaitClickView();
                this.f40514a.m42129q();
            }
            if (this.f40519f != null) {
                try {
                    MBridgeVideoView mBridgeVideoView7 = this.f40514a;
                    this.f40519f.start(i, (mBridgeVideoView7 == null || (playerView = mBridgeVideoView7.mPlayerView) == null) ? 0.0f : playerView.getVolume());
                    C13219q0.m37813a("omsdk", "play video view:  videoEvents.start");
                } catch (Exception e) {
                    C13219q0.m37816b("omsdk", e.getMessage());
                }
            }
        }
    }

    public MBridgeVideoView(Context context) {
        super(context);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.f40471w = false;
        this.f40477z = 0;
        this.f40413H = false;
        this.f40415I = false;
        this.f40417J = false;
        this.f40431Q = "";
        this.f40435T = false;
        this.f40436U = false;
        this.f40437V = false;
        this.f40438W = false;
        this.f40439a0 = false;
        this.f40440b0 = false;
        this.f40441c0 = false;
        this.f40442d0 = false;
        this.f40443e0 = false;
        this.f40445g0 = false;
        this.f40446h0 = 2;
        this.f40456o0 = false;
        this.f40458p0 = false;
        this.f40460q0 = false;
        this.f40462r0 = true;
        this.f40464s0 = false;
        this.f40466t0 = false;
        this.f40468u0 = false;
        this.f40470v0 = false;
        this.f40472w0 = false;
        this.f40478z0 = 0;
        this.f40400A0 = 5;
        this.f40402B0 = 5;
        this.f40404C0 = 5;
        this.f40410F0 = false;
        this.f40418J0 = false;
        this.f40420K0 = 0;
        this.f40422L0 = false;
        this.f40424M0 = false;
        this.hasBufferTimeout = false;
        this.f40426N0 = new C14057w(this);
        this.f40428O0 = false;
        this.f40430P0 = new RunnableC14045k();
        this.f40432Q0 = new RunnableC14047m();
    }

    public MBridgeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.f40471w = false;
        this.f40477z = 0;
        this.f40413H = false;
        this.f40415I = false;
        this.f40417J = false;
        this.f40431Q = "";
        this.f40435T = false;
        this.f40436U = false;
        this.f40437V = false;
        this.f40438W = false;
        this.f40439a0 = false;
        this.f40440b0 = false;
        this.f40441c0 = false;
        this.f40442d0 = false;
        this.f40443e0 = false;
        this.f40445g0 = false;
        this.f40446h0 = 2;
        this.f40456o0 = false;
        this.f40458p0 = false;
        this.f40460q0 = false;
        this.f40462r0 = true;
        this.f40464s0 = false;
        this.f40466t0 = false;
        this.f40468u0 = false;
        this.f40470v0 = false;
        this.f40472w0 = false;
        this.f40478z0 = 0;
        this.f40400A0 = 5;
        this.f40402B0 = 5;
        this.f40404C0 = 5;
        this.f40410F0 = false;
        this.f40418J0 = false;
        this.f40420K0 = 0;
        this.f40422L0 = false;
        this.f40424M0 = false;
        this.hasBufferTimeout = false;
        this.f40426N0 = new C14057w(this);
        this.f40428O0 = false;
        this.f40430P0 = new RunnableC14045k();
        this.f40432Q0 = new RunnableC14047m();
    }

    /* JADX INFO: renamed from: W */
    static /* synthetic */ int m42069W(MBridgeVideoView mBridgeVideoView) {
        int i = mBridgeVideoView.f40400A0;
        mBridgeVideoView.f40400A0 = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: a */
    private int m42073a(CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), this.f40431Q, false).m42758w();
    }

    /* JADX INFO: renamed from: a */
    private String m42077a(int i, int i2) {
        if (i2 != 0) {
            try {
                return C13229v0.m37873a(Double.valueOf(i / i2)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    /* JADX INFO: renamed from: a */
    private void m42078a(ViewGroup viewGroup, CampaignEx campaignEx) {
        C13942c c13942cM41937b = new C13987c().m41937b(viewGroup, campaignEx);
        C13941b.m41701a().m41703a(c13942cM41937b, new C14046l(viewGroup, campaignEx, c13942cM41937b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m42084b(String str) {
        JSONObject jSONObject;
        if (this.f40467u != null) {
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx != null) {
                campaignEx.setClickTempSource(1);
                try {
                    CampaignEx.C13066c rewardTemplateMode = this.f40202b.getRewardTemplateMode();
                    String str2 = "";
                    if (rewardTemplateMode != null) {
                        str2 = rewardTemplateMode.m36782k() + "";
                    }
                    C13148j.m37386a(this.f40201a, str, this.f40202b.getCampaignUnitId(), this.f40202b.isBidCampaign(), this.f40202b.getRequestId(), this.f40202b.getRequestIdNotice(), this.f40202b.getId(), str2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(C13088a.f35868j, m41939a(0));
                } catch (JSONException e2) {
                    e = e2;
                    e.printStackTrace();
                }
            } catch (JSONException e3) {
                e = e3;
                jSONObject = null;
            }
            this.f40467u.mo41600a(105, jSONObject);
            if (C13008c.m36588n().m36542d() != null) {
                try {
                    C14075b.m42195a(C13008c.m36588n().m36542d().getApplicationContext(), this.f40202b);
                } catch (Exception e4) {
                    C13219q0.m37816b(MBridgeBaseView.TAG, e4.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m42085b(int i, int i2) {
        return i > 0 && i2 > 0 && C13229v0.m37930g(this.f40201a) >= i && C13229v0.m37927f(this.f40201a) >= i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public String m42089c(boolean z) {
        if (!this.f40445g0) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.f40456o0) {
                jSONObject.put("Alert_window_status", C13088a.f35840F);
            }
            if (this.f40460q0) {
                jSONObject.put("Alert_window_status", C13088a.f35838D);
            }
            if (this.f40458p0) {
                jSONObject.put("Alert_window_status", C13088a.f35839E);
            }
            jSONObject.put("complete_info", z ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            C13219q0.m37816b(MBridgeBaseView.TAG, "getIVRewardStatusString ERROR");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m42096f() {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f40431Q);
            C13084b.m37036b().m37046a(this.f40431Q + "_1", this.f40202b);
        }
        if (!C13084b.m37036b().m37050a()) {
            FeedBackButton feedBackButton = this.f40461r;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f40461r != null) {
            C13084b.m37036b().m37048a(this.f40431Q + "_1", this.f40461r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m42099g() {
        CollapsibleWebView collapsibleWebView = this.f40414H0;
        if (collapsibleWebView == null || this.f40202b == null || !TextUtils.isEmpty(collapsibleWebView.getUrl())) {
            return;
        }
        this.f40414H0.loadUrl(this.f40202b.getClickURL());
        this.f40414H0.setToolBarTitle(this.f40202b.getAppName());
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d == null) {
            c13635gM39718d = C13636h.m39706b().m39708a();
        }
        this.f40414H0.setPageLoadTimtout((int) c13635gM39718d.m39562s0());
        this.f40414H0.setPageLoadListener(new C14038d());
        this.f40414H0.setWebViewClient(new C14039e());
        this.f40414H0.setCollapseListener(new C14040f());
        this.f40414H0.setExpandListener(new C14041g());
        this.f40414H0.setExitsClickListener(new ViewOnClickListenerC14042h());
    }

    private int getCDRate() {
        return C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), this.f40431Q, false).m42722g();
    }

    private int getVideoAllDuration() {
        try {
            C14057w c14057w = this.f40426N0;
            int iM42160b = c14057w != null ? c14057w.m42160b() : 0;
            return iM42160b == 0 ? this.f40202b.getVideoLength() : iM42160b;
        } catch (Throwable th) {
            C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoCompleteTime() {
        int videoCompleteTime = 0;
        try {
            int videoAllDuration = getVideoAllDuration();
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx != null) {
                videoCompleteTime = campaignEx.getVideoCompleteTime();
                if (this.f40202b.getDynamicTempCode() != 5 && videoCompleteTime > videoAllDuration) {
                    videoCompleteTime = videoAllDuration;
                }
                if (videoCompleteTime > 0) {
                    return videoCompleteTime;
                }
            }
            return videoAllDuration;
        } catch (Throwable th) {
            C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
            return videoCompleteTime;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m42102h() {
        int iFindLayout = findLayout("mbridge_reward_videoview_item");
        if (C13203i0.m37709a(iFindLayout)) {
            this.f40203c.inflate(iFindLayout, this);
            m42120n();
        }
        f40397W0 = false;
        m42131r();
    }

    /* JADX INFO: renamed from: i */
    private void m42106i() {
        if (this.f40428O0 || this.f40442d0 || this.f40440b0) {
            return;
        }
        this.f40428O0 = true;
        int i = this.f40421L;
        if (i < 0) {
            return;
        }
        if (i == 0) {
            this.f40442d0 = true;
        } else {
            new Handler().postDelayed(new RunnableC14035a(), this.f40421L * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m42108j() {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.f40401B == null) {
            return;
        }
        if (this.f40403C == null) {
            addCTAView();
        }
        if (this.f40401B.getVisibility() != 0) {
            this.f40401B.setVisibility(0);
            postDelayed(this.f40430P0, 3000L);
        } else {
            this.f40401B.setVisibility(8);
            getHandler().removeCallbacks(this.f40430P0);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m42111k() {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || !C13182a1.m37597b(campaignEx.getVideoResolution())) {
            return;
        }
        String videoResolution = this.f40202b.getVideoResolution();
        C13219q0.m37818c(MBridgeBaseView.TAG, "MBridgeBaseView videoResolution:" + videoResolution);
        String[] strArrSplit = videoResolution.split("x");
        if (strArrSplit.length == 2) {
            if (C13229v0.m37946m(strArrSplit[0]) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.f40433R = C13229v0.m37946m(strArrSplit[0]);
            }
            if (C13229v0.m37946m(strArrSplit[1]) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.f40434S = C13229v0.m37946m(strArrSplit[1]);
            }
            C13219q0.m37818c(MBridgeBaseView.TAG, "MBridgeBaseView mVideoW:" + this.f40433R + "  mVideoH:" + this.f40434S);
        }
        if (this.f40433R <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f40433R = 1280.0d;
        }
        if (this.f40434S <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f40434S = 720.0d;
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m42115l() {
        try {
            this.mPlayerView = (PlayerView) findViewById(filterFindViewId(this.f40472w0, "mbridge_vfpv"));
            this.mSoundImageView = (SoundImageView) findViewById(filterFindViewId(this.f40472w0, "mbridge_sound_switch"));
            this.f40451m = (TextView) findViewById(filterFindViewId(this.f40472w0, "mbridge_tv_count"));
            View viewFindViewById = findViewById(filterFindViewId(this.f40472w0, "mbridge_rl_playing_close"));
            this.f40453n = viewFindViewById;
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(4);
            }
            this.f40455o = (RelativeLayout) findViewById(filterFindViewId(this.f40472w0, "mbridge_top_control"));
            this.f40457p = (ImageView) findViewById(filterFindViewId(this.f40472w0, "mbridge_videoview_bg"));
            this.f40459q = (ProgressBar) findViewById(filterFindViewId(this.f40472w0, "mbridge_video_progress_bar"));
            this.f40461r = (FeedBackButton) findViewById(filterFindViewId(this.f40472w0, "mbridge_native_endcard_feed_btn"));
            this.f40463s = (ImageView) findViewById(filterFindViewId(this.f40472w0, "mbridge_iv_link"));
            this.f40412G0 = (RelativeLayout) findViewById(filterFindViewId(this.f40472w0, "mbridge_reward_scale_webview_layout"));
            this.f40416I0 = (RelativeLayout) findViewById(filterFindViewId(this.f40472w0, "mbridge_reward_header_layout"));
            if (this.f40412G0 != null) {
                CollapsibleWebView collapsibleWebView = new CollapsibleWebView(getContext());
                this.f40414H0 = collapsibleWebView;
                this.f40412G0.addView(collapsibleWebView, new RelativeLayout.LayoutParams(-1, -1));
            }
            C13229v0.m37892a(1, this.f40463s, this.f40202b, this.f40201a, false, new C14054t());
            this.f40465t = (MBridgeSegmentsProgressBar) findViewById(filterFindViewId(this.f40472w0, "mbridge_reward_segment_progressbar"));
            this.f40401B = (FrameLayout) findViewById(filterFindViewId(this.f40472w0, "mbridge_reward_cta_layout"));
            this.f40476y0 = (MBridgeBaitClickView) findViewById(filterFindViewId(this.f40472w0, "mbridge_animation_click_view"));
            this.f40411G = (RelativeLayout) findViewById(filterFindViewId(this.f40472w0, "mbridge_reward_moreoffer_layout"));
            this.f40408E0 = (MBAcquireRewardPopView) findViewById(filterFindViewId(this.f40472w0, "mbridge_reward_popview"));
            this.tvFlag = (TextView) findViewById(filterFindViewId(this.f40472w0, "mbridge_tv_flag"));
            return isNotNULL(this.mPlayerView, this.mSoundImageView, this.f40451m, this.f40453n);
        } catch (Throwable th) {
            C13219q0.m37817b(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m42118m() {
        int videoCompleteTime = getVideoCompleteTime();
        int curPosition = (this.mPlayerView.getCurPosition() / 1000) + 1;
        if (this.f40202b.getDynamicTempCode() != 5 || this.mCurrPlayNum <= 1) {
            if ((videoCompleteTime <= 0 || curPosition >= videoCompleteTime) && videoCompleteTime != 0) {
                return false;
            }
        } else if (videoCompleteTime == 0 || videoCompleteTime <= 0 || curPosition >= videoCompleteTime) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m42120n() {
        PlayerView playerView;
        boolean zM42115l = m42115l();
        this.f40205e = zM42115l;
        if (!zM42115l) {
            C13219q0.m37816b(MBridgeBaseView.TAG, "MBridgeVideoView init fail");
        }
        if (C13223s0.m37831a().m37842a("i_l_s_t_r_i", false) && (playerView = this.mPlayerView) != null) {
            playerView.setNotifyListener(new C14048n());
        }
        mo41941d();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f40474x0 = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m42124o() {
        try {
            PlayerView playerView = this.mPlayerView;
            if (playerView != null) {
                playerView.onPause();
                CampaignEx campaignEx = this.f40202b;
                if (campaignEx != null && !campaignEx.isRewardPopViewShowed) {
                    removeCallbacks(this.f40432Q0);
                }
                if (C13884b.m41421a()) {
                    this.mPlayerView.setIsCovered(this.f40410F0 || this.f40415I || this.f40417J);
                }
                CampaignEx campaignEx2 = this.f40202b;
                if (campaignEx2 == null || campaignEx2.getNativeVideoTracking() == null || this.f40202b.isHasReportAdTrackPause()) {
                    return;
                }
                this.f40202b.setHasReportAdTrackPause(true);
                Context contextM36542d = C13008c.m36588n().m36542d();
                CampaignEx campaignEx3 = this.f40202b;
                C12682a.m34607a(contextM36542d, campaignEx3, this.f40431Q, campaignEx3.getNativeVideoTracking().m36921s(), false, false);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(MBridgeBaseView.TAG, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m42126p() {
        C14057w c14057w;
        RelativeLayout relativeLayout;
        try {
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || this.f40202b.getRewardTemplateMode().m36782k() != 5002010 || (relativeLayout = this.f40416I0) == null || relativeLayout.getVisibility() == 0) {
                if (!this.f40436U) {
                    boolean zPlayVideo = this.mPlayerView.playVideo();
                    CampaignEx campaignEx2 = this.f40202b;
                    if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() != 2 && !zPlayVideo && (c14057w = this.f40426N0) != null) {
                        c14057w.onPlayError("play video failed");
                    }
                    this.f40436U = true;
                    return;
                }
                MBAcquireRewardPopView mBAcquireRewardPopView = this.f40408E0;
                if (mBAcquireRewardPopView != null && this.f40417J) {
                    mBAcquireRewardPopView.onResume();
                }
                if (this.f40417J) {
                    return;
                }
                if (!C13884b.m41421a()) {
                    m42141w();
                } else {
                    if (this.f40410F0 || this.f40415I) {
                        return;
                    }
                    this.mPlayerView.setIsCovered(false);
                    m42141w();
                }
            }
        } catch (Exception e) {
            C13219q0.m37817b(MBridgeBaseView.TAG, e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m42129q() {
        String strM36781j;
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.f40413H) {
            return;
        }
        if (!TextUtils.isEmpty(this.f40202b.getMof_template_url())) {
            strM36781j = this.f40202b.getMof_template_url();
        } else if (this.f40202b.getRewardTemplateMode() == null) {
            return;
        } else {
            strM36781j = this.f40202b.getRewardTemplateMode().m36781j();
        }
        if (TextUtils.isEmpty(strM36781j)) {
            return;
        }
        try {
            String strM37645a = C13188c1.m37645a(strM36781j, "guideShow");
            String strM37645a2 = C13188c1.m37645a(strM36781j, "guideDelay");
            String strM37645a3 = C13188c1.m37645a(strM36781j, "guideTime");
            String strM37645a4 = C13188c1.m37645a(strM36781j, "guideRewardTime");
            if (!TextUtils.isEmpty(strM37645a)) {
                this.f40478z0 = Integer.parseInt(strM37645a);
            }
            if (!TextUtils.isEmpty(strM37645a2)) {
                int i = Integer.parseInt(strM37645a2);
                this.f40400A0 = i;
                if (i > 10 || i < 3) {
                    this.f40400A0 = 5;
                }
            }
            if (!TextUtils.isEmpty(strM37645a3)) {
                int i2 = Integer.parseInt(strM37645a3);
                this.f40402B0 = i2;
                if (i2 > 10 || i2 < 3) {
                    this.f40402B0 = 5;
                }
            }
            if (!TextUtils.isEmpty(strM37645a4)) {
                int i3 = Integer.parseInt(strM37645a4);
                this.f40404C0 = i3;
                if (i3 > 10 || i3 < 5) {
                    this.f40404C0 = 5;
                }
            }
            int i4 = this.f40478z0;
            if (i4 > 0 && i4 <= 2) {
                int videoCompleteTime = getVideoCompleteTime();
                if (videoCompleteTime == 0 || videoCompleteTime > this.f40400A0) {
                    int i5 = videoCompleteTime - this.f40400A0;
                    if (i5 >= 0 && this.f40404C0 > i5) {
                        this.f40404C0 = i5;
                    }
                    int videoAllDuration = getVideoAllDuration();
                    if (this.f40404C0 >= videoAllDuration) {
                        this.f40404C0 = videoAllDuration - this.f40400A0;
                    }
                    if (this.f40400A0 >= videoAllDuration) {
                        return;
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(this.f40202b.getAppName());
                    C13635g c13635gM39714b = C13636h.m39706b().m39714b(C13008c.m36588n().m36533b());
                    this.f40406D0 = new AcquireRewardPopViewParameters.Builder("", this.f40431Q, this.f40478z0, c13635gM39714b != null ? c13635gM39714b.m39527k() : "US").setAutoDismissTime(this.f40402B0).setReduceTime(this.f40404C0).setBehaviourListener(new C14044j()).setRightAnswerList(arrayList).build();
                    postDelayed(this.f40432Q0, 1000L);
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: r */
    private void m42131r() {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || campaignEx.getAdSpaceT() != 2 || this.tvFlag == null) {
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.tvFlag.setText("AD");
        } else {
            this.tvFlag.setText("广告");
        }
    }

    /* JADX INFO: renamed from: s */
    private void m42132s() {
        int iM36778g;
        int iM36782k;
        float fM37930g = C13229v0.m37930g(this.f40201a);
        float fM37927f = C13229v0.m37927f(this.f40201a);
        double d = this.f40433R;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            double d2 = this.f40434S;
            if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && fM37930g > 0.0f && fM37927f > 0.0f) {
                double d3 = d / d2;
                double d4 = fM37930g / fM37927f;
                C13219q0.m37818c(MBridgeBaseView.TAG, "videoWHDivide:" + d3 + "  screenWHDivide:" + d4);
                double dM37873a = C13229v0.m37873a(Double.valueOf(d3));
                double dM37873a2 = C13229v0.m37873a(Double.valueOf(d4));
                C13219q0.m37818c(MBridgeBaseView.TAG, "videoWHDivideFinal:" + dM37873a + "  screenWHDivideFinal:" + dM37873a2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mPlayerView.getLayoutParams();
                if (dM37873a > dM37873a2) {
                    double d5 = (((double) fM37930g) * this.f40434S) / this.f40433R;
                    layoutParams.width = -1;
                    layoutParams.height = (int) d5;
                    layoutParams.gravity = 17;
                } else if (dM37873a < dM37873a2) {
                    layoutParams.width = (int) (((double) fM37927f) * d3);
                    layoutParams.height = -1;
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                try {
                    CampaignEx campaignEx = this.f40202b;
                    if (campaignEx != null && campaignEx.isDynamicView()) {
                        if (this.f40202b.getRewardTemplateMode() != null) {
                            iM36782k = this.f40202b.getRewardTemplateMode().m36782k();
                            iM36778g = this.f40202b.getRewardTemplateMode().m36778g();
                        } else {
                            iM36778g = this.f40201a.getResources().getConfiguration().orientation;
                            iM36782k = TypedValues.Custom.TYPE_BOOLEAN;
                        }
                        if (iM36782k == 102 || iM36782k == 202) {
                            if (iM36778g == 1) {
                                layoutParams.width = -1;
                                layoutParams.gravity = 17;
                                layoutParams.height = (int) (this.f40434S / (this.f40433R / ((double) fM37930g)));
                            } else {
                                layoutParams.height = -1;
                                layoutParams.gravity = 17;
                                layoutParams.width = (int) (((double) fM37927f) * d3);
                            }
                        }
                        if (iM36782k == 202 && !TextUtils.isEmpty(this.f40202b.getImageUrl())) {
                            setBlurBackgroundImage(this.f40202b.getImageUrl());
                        }
                        if (iM36782k == 302 || iM36782k == 802 || iM36782k == 5002010) {
                            double d6 = this.f40433R;
                            double d7 = this.f40434S;
                            if (d6 / d7 > 1.0d) {
                                layoutParams.width = -1;
                                layoutParams.height = (int) ((d7 * ((double) fM37930g)) / d6);
                            } else {
                                int iM37876a = C13229v0.m37876a(getContext(), 220.0f);
                                layoutParams.width = (int) ((this.f40433R * ((double) iM37876a)) / this.f40434S);
                                layoutParams.height = iM37876a;
                            }
                        }
                    }
                } catch (Throwable th) {
                    C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
                }
                this.mPlayerView.setLayoutParams(layoutParams);
                setMatchParent();
                return;
            }
        }
        m42139v();
    }

    private void setBlurBackgroundImage(String str) {
        C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(str, new C14037c());
    }

    private void setPlayerViewRadius(int i) {
        if (i > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C13229v0.m37876a(getContext(), i));
            gradientDrawable.setColor(-1);
            gradientDrawable.setStroke(1, 0);
            setBackground(gradientDrawable);
            this.mPlayerView.setBackground(gradientDrawable);
            setClipToOutline(true);
            this.mPlayerView.setClipToOutline(true);
        }
    }

    /* JADX INFO: renamed from: t */
    private void m42135t() {
    }

    /* JADX INFO: renamed from: u */
    private void m42137u() {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null) {
            return;
        }
        if (campaignEx.getAdSpaceT() == 2) {
            m42135t();
        } else {
            m42132s();
        }
    }

    /* JADX INFO: renamed from: v */
    private void m42139v() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (isLandscape() || !this.f40205e) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mPlayerView.getLayoutParams();
            int iM37930g = C13229v0.m37930g(this.f40201a);
            layoutParams.width = -1;
            layoutParams.height = (iM37930g * 9) / 16;
            layoutParams.gravity = 17;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: w */
    private void m42141w() {
        if (this.f40464s0) {
            if (!this.f40466t0) {
                this.mPlayerView.seekToEndFrame();
            }
            this.f40466t0 = true;
        } else {
            this.mPlayerView.onResume();
        }
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || campaignEx.isRewardPopViewShowed) {
            return;
        }
        post(this.f40432Q0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m42143x() {
        if (!this.f40205e || this.f40453n.getVisibility() == 0) {
            return;
        }
        this.f40453n.setVisibility(0);
        this.f40439a0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m42144y() {
        int i;
        InterfaceC14058a interfaceC14058a;
        boolean z;
        try {
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f40202b.getRewardTemplateMode().m36782k() == 5002010 && this.f40422L0 && !(z = this.f40464s0)) {
                InterfaceC14058a interfaceC14058a2 = this.notifyListener;
                if (interfaceC14058a2 != null) {
                    this.f40422L0 = true;
                    interfaceC14058a2.mo41600a(2, m42089c(z));
                    return;
                }
                return;
            }
            if (!this.f40445g0 || ((i = this.f40450l0) != C13088a.f35842H && i != C13088a.f35843I)) {
                CampaignEx campaignEx2 = this.f40202b;
                if (campaignEx2 == null || campaignEx2.getAdSpaceT() == 2) {
                    InterfaceC14058a interfaceC14058a3 = this.notifyListener;
                    if (interfaceC14058a3 != null) {
                        this.f40422L0 = true;
                        interfaceC14058a3.mo41600a(2, "");
                        return;
                    }
                    return;
                }
                boolean zM42118m = m42118m();
                if (zM42118m && this.f40425N == 1 && !this.f40443e0) {
                    m42124o();
                    InterfaceC14058a interfaceC14058a4 = this.notifyListener;
                    if (interfaceC14058a4 != null) {
                        interfaceC14058a4.mo41600a(8, "");
                        return;
                    }
                    return;
                }
                if (this.notifyListener != null) {
                    this.f40422L0 = true;
                    if (this.f40202b.getAdType() == 94 && !zM42118m) {
                        this.notifyListener.mo41600a(17, "");
                    }
                    this.notifyListener.mo41600a(2, m42089c(!zM42118m));
                    return;
                }
                return;
            }
            if (this.f40456o0) {
                if (i != C13088a.f35843I || (interfaceC14058a = this.notifyListener) == null) {
                    return;
                }
                this.f40422L0 = true;
                interfaceC14058a.mo41600a(2, m42089c(this.f40464s0));
                return;
            }
            if (i == C13088a.f35843I && this.f40470v0) {
                InterfaceC14058a interfaceC14058a5 = this.notifyListener;
                if (interfaceC14058a5 != null) {
                    this.f40422L0 = true;
                    interfaceC14058a5.mo41600a(2, m42089c(this.f40464s0));
                    return;
                }
                return;
            }
            if (this.f40462r0) {
                int curPosition = this.mPlayerView.getCurPosition() / 1000;
                int videoLength = (int) ((curPosition / (this.mPlayerView.getDuration() == 0 ? this.f40202b.getVideoLength() : this.mPlayerView.getDuration())) * 100.0f);
                if (this.f40450l0 == C13088a.f35842H) {
                    m42124o();
                    int i2 = this.f40452m0;
                    if (i2 == C13088a.f35844J && videoLength >= this.f40454n0) {
                        InterfaceC14058a interfaceC14058a6 = this.notifyListener;
                        if (interfaceC14058a6 != null) {
                            this.f40422L0 = true;
                            interfaceC14058a6.mo41600a(2, m42089c(this.f40464s0));
                            return;
                        }
                        return;
                    }
                    if (i2 == C13088a.f35845K && curPosition >= this.f40454n0) {
                        InterfaceC14058a interfaceC14058a7 = this.notifyListener;
                        if (interfaceC14058a7 != null) {
                            this.f40422L0 = true;
                            interfaceC14058a7.mo41600a(2, m42089c(this.f40464s0));
                            return;
                        }
                        return;
                    }
                    InterfaceC14058a interfaceC14058a8 = this.notifyListener;
                    if (interfaceC14058a8 != null) {
                        interfaceC14058a8.mo41600a(8, "");
                    }
                }
                if (this.f40450l0 == C13088a.f35843I) {
                    int i3 = this.f40452m0;
                    if (i3 == C13088a.f35844J && videoLength >= this.f40454n0) {
                        m42124o();
                        InterfaceC14058a interfaceC14058a9 = this.notifyListener;
                        if (interfaceC14058a9 != null) {
                            interfaceC14058a9.mo41600a(8, "");
                            return;
                        }
                        return;
                    }
                    if (i3 != C13088a.f35845K || curPosition < this.f40454n0) {
                        return;
                    }
                    m42124o();
                    InterfaceC14058a interfaceC14058a10 = this.notifyListener;
                    if (interfaceC14058a10 != null) {
                        interfaceC14058a10.mo41600a(8, "");
                    }
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void addCTAView() {
        if (this.f40401B == null) {
            return;
        }
        if (this.f40403C == null) {
            MBridgeClickCTAView mBridgeClickCTAView = new MBridgeClickCTAView(getContext());
            this.f40403C = mBridgeClickCTAView;
            mBridgeClickCTAView.setCampaign(this.f40202b);
            this.f40403C.setUnitId(this.f40431Q);
            InterfaceC14058a interfaceC14058a = this.f40467u;
            if (interfaceC14058a != null) {
                this.f40403C.setNotifyListener(new C14067i(interfaceC14058a));
            }
            this.f40403C.preLoadData(this.f40405D);
        }
        this.f40401B.addView(this.f40403C);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void alertWebViewShowed() {
        this.f40415I = true;
        setShowingAlertViewCover(true);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void closeVideoOperate(int i, int i2) {
        if (i == 1) {
            this.f40470v0 = true;
            if (getVisibility() == 0) {
                m42144y();
            }
            try {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("type", 1);
                C13156d.m37475b().m37486a("2000152", c13157e);
                C13156d.m37475b().m37483a("2000148", this.f40202b, c13157e);
                C13156d.m37475b().m37482a("2000134", this.f40202b);
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
        if (i2 == 1) {
            gonePlayingCloseView();
        } else if (i2 == 2) {
            if (this.f40468u0 && getVisibility() == 0) {
                return;
            }
            m42143x();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    /* JADX INFO: renamed from: d */
    protected void mo41941d() {
        super.mo41941d();
        if (this.f40205e) {
            C13185b1.m37632a(this.mPlayerView, this.f40202b.getLocalRequestId(), this.f40202b.getLocalAllowTrackClick());
            if (!this.f40208h) {
                this.mPlayerView.setOnClickListener(new ViewOnClickListenerC14050p());
            } else if (C13976a.m41863b(this.f40202b) == -1 || C13976a.m41863b(this.f40202b) == 100) {
                this.mPlayerView.setOnClickListener(new ViewOnClickListenerC14049o());
            }
            SoundImageView soundImageView = this.mSoundImageView;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(new ViewOnClickListenerC14051q());
            }
            this.f40453n.setOnClickListener(new ViewOnClickListenerC14052r());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
        this.f40435T = true;
        showVideoLocation(0, 0, C13229v0.m37930g(this.f40201a), C13229v0.m37927f(this.f40201a), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.f40421L == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void dismissAllAlert() {
        MBAlertDialog mBAlertDialog = this.f40427O;
        if (mBAlertDialog != null) {
            mBAlertDialog.dismiss();
        }
        InterfaceC14058a interfaceC14058a = this.notifyListener;
        if (interfaceC14058a != null) {
            interfaceC14058a.mo41600a(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, "");
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public int getBorderViewHeight() {
        return f40396V0;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public int getBorderViewLeft() {
        return f40394T0;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public int getBorderViewRadius() {
        return f40392R0;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public int getBorderViewTop() {
        return f40393S0;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public int getBorderViewWidth() {
        return f40395U0;
    }

    public int getBufferTimeout() {
        return this.f40423M;
    }

    public int getCloseAlert() {
        return this.f40425N;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public String getCurrentProgress() {
        try {
            int iM42156a = this.f40426N0.m42156a();
            CampaignEx campaignEx = this.f40202b;
            int videoLength = campaignEx != null ? campaignEx.getVideoLength() : 0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", m42077a(iM42156a, videoLength));
            jSONObject.put("time", iM42156a);
            jSONObject.put("duration", videoLength + "");
            return jSONObject.toString();
        } catch (Throwable th) {
            C13219q0.m37817b(MBridgeBaseView.TAG, th.getMessage(), th);
            return JsonUtils.EMPTY_JSON;
        }
    }

    public int getMute() {
        return this.f40446h0;
    }

    public String getPlayURL() {
        return this.f40419K;
    }

    public String getUnitId() {
        return this.f40431Q;
    }

    public int getVideoSkipTime() {
        return this.f40421L;
    }

    public void gonePlayingCloseView() {
        if (this.f40205e && this.f40453n.getVisibility() != 8) {
            this.f40453n.setVisibility(8);
            this.f40439a0 = false;
        }
        m42106i();
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void hideAlertView(int i) {
        if (this.f40415I) {
            this.f40415I = false;
            this.f40456o0 = true;
            setShowingAlertViewCover(false);
            C13148j.m37382a(this.f40201a, this.f40202b, C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), this.f40431Q, false).m42710c(), this.f40431Q, 1, i, 1);
            if (i == 0) {
                m42126p();
                if (this.f40445g0) {
                    int i2 = this.f40450l0;
                    if (i2 == C13088a.f35843I || i2 == C13088a.f35842H) {
                        this.f40458p0 = true;
                        InterfaceC14058a interfaceC14058a = this.notifyListener;
                        if (interfaceC14058a != null) {
                            interfaceC14058a.mo41600a(124, "");
                        }
                        CampaignEx campaignEx = this.f40202b;
                        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f40202b.getRewardTemplateMode().m36782k() == 5002010) {
                            m42143x();
                            return;
                        } else {
                            this.f40468u0 = true;
                            gonePlayingCloseView();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            this.f40460q0 = true;
            boolean z = this.f40445g0;
            if (z && this.f40450l0 == C13088a.f35843I) {
                m42126p();
                return;
            }
            if (z && this.f40450l0 == C13088a.f35842H) {
                InterfaceC14058a interfaceC14058a2 = this.notifyListener;
                if (interfaceC14058a2 != null) {
                    this.f40422L0 = true;
                    interfaceC14058a2.mo41600a(2, m42089c(this.f40464s0));
                    return;
                }
                return;
            }
            InterfaceC14058a interfaceC14058a3 = this.notifyListener;
            if (interfaceC14058a3 != null) {
                this.f40422L0 = true;
                interfaceC14058a3.mo41600a(2, "");
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public boolean isH5Canvas() {
        return getLayoutParams().height < C13229v0.m37927f(this.f40201a.getApplicationContext());
    }

    public boolean isInstDialogShowing() {
        return this.f40410F0;
    }

    public boolean isMiniCardShowing() {
        return this.f40438W;
    }

    public boolean isRewardPopViewShowing() {
        return this.f40417J;
    }

    public boolean isShowingAlertView() {
        return this.f40415I;
    }

    public boolean isShowingTransparent() {
        return this.f40443e0;
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return false;
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int childCount = viewGroup.getChildCount();
        int i = iIndexOfChild + 1;
        boolean z = false;
        while (i <= childCount - 1) {
            if (viewGroup.getChildAt(i).getVisibility() == 0 && this.f40438W) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.f40440b0 = true;
            this.f40442d0 = false;
        } else if (i == 1) {
            this.f40441c0 = true;
        }
    }

    public void notifyVideoClose() {
        this.f40422L0 = true;
        this.notifyListener.mo41600a(2, "");
    }

    public void onActivityPause() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.f40408E0;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onPause();
            }
        } catch (Throwable th) {
            C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void onActivityResume() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.f40408E0;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onResume();
            }
        } catch (Throwable th) {
            C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void onActivityStop() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.f40408E0;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onStop();
            }
        } catch (Throwable th) {
            C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void onBackPress() {
        boolean z;
        if (this.f40438W || this.f40415I || this.f40458p0) {
            return;
        }
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f40202b.getRewardTemplateMode().m36782k() == 5002010 && (z = this.f40464s0)) {
            InterfaceC14058a interfaceC14058a = this.notifyListener;
            if (interfaceC14058a != null) {
                this.f40422L0 = true;
                interfaceC14058a.mo41600a(2, m42089c(z));
                return;
            }
            return;
        }
        if (this.f40439a0) {
            m42144y();
            return;
        }
        boolean z2 = this.f40440b0;
        if (z2 && this.f40441c0) {
            m42144y();
        } else {
            if (z2 || !this.f40442d0) {
                return;
            }
            m42144y();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CampaignEx campaignEx = this.f40202b;
        if ((campaignEx == null || !campaignEx.isDynamicView()) && this.f40205e && this.f40435T) {
            m42137u();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.f40430P0 != null) {
                getHandler().removeCallbacks(this.f40430P0);
            }
            if (this.f40478z0 != 0) {
                removeCallbacks(this.f40432Q0);
            }
        } catch (Throwable th) {
            C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void preLoadData(C14177b c14177b) {
        this.f40405D = c14177b;
        if (!this.f40205e) {
            InterfaceC14058a interfaceC14058a = this.notifyListener;
            if (interfaceC14058a != null) {
                interfaceC14058a.mo41600a(12, "MBridgeVideoView initSuccess false");
            }
        } else if (!TextUtils.isEmpty(this.f40419K) && this.f40202b != null) {
            AdSession adSession = this.f40447i0;
            if (adSession != null) {
                adSession.registerAdView(this.mPlayerView);
                SoundImageView soundImageView = this.mSoundImageView;
                if (soundImageView != null) {
                    this.f40447i0.addFriendlyObstruction(soundImageView, FriendlyObstructionPurpose.OTHER, null);
                }
                this.f40447i0.addFriendlyObstruction(this.f40451m, FriendlyObstructionPurpose.OTHER, null);
                this.f40447i0.addFriendlyObstruction(this.f40453n, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
            }
            m42111k();
            this.mPlayerView.initBufferIngParam(this.f40423M);
            this.mPlayerView.initVFPData(this.f40419K, this.f40202b.getVideoUrlEncode(), this.f40426N0);
            soundOperate(this.f40446h0, -1, null);
        }
        f40397W0 = false;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void progressBarOperate(int i) {
        ProgressBar progressBar;
        if (this.f40205e) {
            if (i == 1) {
                ProgressBar progressBar2 = this.f40459q;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    return;
                }
                return;
            }
            if (i != 2 || (progressBar = this.f40459q) == null) {
                return;
            }
            progressBar.setVisibility(0);
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void progressOperate(int i, int i2) {
        if (this.f40205e) {
            C13219q0.m37818c(MBridgeBaseView.TAG, "progressOperate progress:" + i);
            CampaignEx campaignEx = this.f40202b;
            int videoLength = campaignEx != null ? campaignEx.getVideoLength() : 0;
            if (i > 0 && i <= videoLength && this.mPlayerView != null) {
                C13219q0.m37818c(MBridgeBaseView.TAG, "progressOperate progress:" + i);
                this.mPlayerView.seekTo(i * 1000);
            }
            if (i2 == 1) {
                this.f40451m.setVisibility(8);
            } else if (i2 == 2) {
                this.f40451m.setVisibility(0);
            }
            if (this.f40451m.getVisibility() == 0) {
                m42096f();
            }
        }
    }

    public void releasePlayer() {
        try {
            PlayerView playerView = this.mPlayerView;
            if (playerView != null && !this.f40437V) {
                playerView.release();
                if (!TextUtils.isEmpty(this.f40419K)) {
                    C13157e c13157e = new C13157e();
                    long jCurrentTimeMillis = f40398X0;
                    if (jCurrentTimeMillis != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - f40398X0;
                    }
                    c13157e.m37501a("duration", Long.valueOf(jCurrentTimeMillis));
                    C13156d.m37475b().m37483a("2000146", this.f40202b, c13157e);
                }
            }
            C14057w c14057w = this.f40426N0;
            if (c14057w != null) {
                c14057w.m42162d();
            }
            if (this.f40467u != null) {
                this.f40467u = null;
            }
        } catch (Exception e) {
            C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void setAdSession(AdSession adSession) {
        this.f40447i0 = adSession;
    }

    public void setBufferTimeout(int i) {
        this.f40423M = i;
    }

    public void setCTALayoutVisibleOrGone() {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || this.f40401B == null) {
            return;
        }
        if (campaignEx.getRewardTemplateMode() == null || this.f40202b.getRewardTemplateMode().m36782k() != 902) {
            int i = this.f40409F;
            if (i != -5) {
                if (i == -3) {
                    return;
                }
                if (this.f40403C == null) {
                    addCTAView();
                }
                if (this.f40409F == -1) {
                    if (this.f40401B.getVisibility() != 0) {
                        this.f40401B.setVisibility(0);
                        postDelayed(this.f40430P0, 3000L);
                    } else {
                        this.f40401B.setVisibility(8);
                        getHandler().removeCallbacks(this.f40430P0);
                    }
                }
                if (this.f40409F >= 0) {
                    this.f40401B.setVisibility(0);
                    return;
                }
                return;
            }
            if (this.f40407E < -1) {
                return;
            }
            if (this.f40403C == null) {
                addCTAView();
            }
            int i2 = this.f40407E;
            if (i2 >= 0) {
                this.f40401B.setVisibility(0);
                return;
            }
            if (i2 == -1) {
                if (this.f40401B.getVisibility() != 0) {
                    this.f40401B.setVisibility(0);
                    postDelayed(this.f40430P0, 3000L);
                } else {
                    this.f40401B.setVisibility(8);
                    getHandler().removeCallbacks(this.f40430P0);
                }
            }
        }
    }

    public void setCamPlayOrderCallback(InterfaceC13948a interfaceC13948a, List<CampaignEx> list, int i, int i2) {
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar;
        this.f40473x = interfaceC13948a;
        this.mCampaignSize = list.size();
        this.mCurrPlayNum = i;
        this.f40477z = i2;
        this.mCampOrderViewData = list;
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || campaignEx.getDynamicTempCode() != 5) {
            CampaignEx campaignEx2 = this.f40202b;
            if (campaignEx2 == null || campaignEx2.getProgressBarShow() != 1 || (mBridgeSegmentsProgressBar = this.f40465t) == null) {
                return;
            }
            mBridgeSegmentsProgressBar.init(1, 3);
            this.f40465t.setVisibility(0);
            return;
        }
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar2 = this.f40465t;
        if (mBridgeSegmentsProgressBar2 == null || this.mCampOrderViewData == null) {
            return;
        }
        if (this.mCampaignSize > 1) {
            mBridgeSegmentsProgressBar2.setVisibility(0);
            this.f40465t.init(this.mCampaignSize, 2);
            for (int i3 = 0; i3 < this.mCampOrderViewData.size(); i3++) {
                int videoPlayProgress = this.mCampOrderViewData.get(i3).getVideoPlayProgress();
                if (videoPlayProgress > 0) {
                    this.f40465t.setProgress(videoPlayProgress, i3);
                }
                if (this.mCampOrderViewData.get(i3).isRewardPopViewShowed) {
                    this.f40413H = true;
                }
            }
            return;
        }
        CampaignEx campaignEx3 = this.f40202b;
        if (campaignEx3 == null || campaignEx3.getProgressBarShow() != 1) {
            this.f40465t.setVisibility(8);
            return;
        }
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar3 = this.f40465t;
        if (mBridgeSegmentsProgressBar3 != null) {
            mBridgeSegmentsProgressBar3.init(1, 3);
            this.f40465t.setVisibility(0);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        C14057w c14057w = this.f40426N0;
        if (c14057w != null) {
            c14057w.m42157a(campaignEx);
            this.f40426N0.m42161b(m42073a(campaignEx), getCDRate());
        }
    }

    public void setCloseAlert(int i) {
        this.f40425N = i;
    }

    public void setContainerViewOnNotifyListener(InterfaceC14058a interfaceC14058a) {
        this.f40467u = interfaceC14058a;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void setCover(boolean z) {
        if (this.f40205e) {
            this.mPlayerView.setIsCovered(z);
        }
    }

    public void setDialogRole(int i) {
        this.f40462r0 = i == 1;
        C13219q0.m37816b(MBridgeBaseView.TAG, i + " " + this.f40462r0);
    }

    public void setIPlayVideoViewLayoutCallBack(InterfaceC13953f interfaceC13953f) {
        this.f40475y = interfaceC13953f;
    }

    public void setIVRewardEnable(int i, int i2, int i3) {
        this.f40450l0 = i;
        this.f40452m0 = i2;
        this.f40454n0 = i3;
    }

    public void setInstDialogState(boolean z) {
        PlayerView playerView;
        this.f40410F0 = z;
        if (!C13884b.m41421a() || (playerView = this.mPlayerView) == null) {
            return;
        }
        playerView.setIsCovered(z);
    }

    public void setIsIV(boolean z) {
        this.f40445g0 = z;
        C14057w c14057w = this.f40426N0;
        if (c14057w != null) {
            c14057w.m42159a(z);
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void setMiniEndCardState(boolean z) {
        this.f40438W = z;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        RelativeLayout relativeLayout;
        MBridgeVideoView mBridgeVideoView;
        try {
            C13219q0.m37816b(MBridgeBaseView.TAG, "NOTCH VideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            int i5 = layoutParams.leftMargin;
            int i6 = layoutParams.rightMargin;
            int i7 = layoutParams.topMargin;
            int i8 = layoutParams.bottomMargin;
            this.f40420K0 = i3;
            if (Math.max(Math.max(i5, i6), Math.max(i7, i8)) <= Math.max(Math.max(i, i2), Math.max(i3, i4)) && (relativeLayout = this.f40455o) != null) {
                mBridgeVideoView = this;
                try {
                    relativeLayout.postDelayed(mBridgeVideoView.new RunnableC14036b(i, i3, i2, i4), 200L);
                } catch (Exception e) {
                    e = e;
                    C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
                    return;
                }
            } else {
                mBridgeVideoView = this;
            }
            if (mBridgeVideoView.f40451m.getVisibility() == 0) {
                m42096f();
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void setPlayURL(String str) {
        this.f40419K = str;
    }

    public void setPlayerViewAttachListener(InterfaceC14055u interfaceC14055u) {
        this.f40469v = interfaceC14055u;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void setScaleFitXY(int i) {
        this.f40444f0 = i;
    }

    public void setShowingAlertViewCover(boolean z) {
        MBAcquireRewardPopView mBAcquireRewardPopView;
        if (z && (mBAcquireRewardPopView = this.f40408E0) != null && this.f40417J && this.f40415I) {
            mBAcquireRewardPopView.onPause();
        }
        this.mPlayerView.setIsCovered(z);
    }

    public void setShowingTransparent(boolean z) {
        this.f40443e0 = z;
    }

    public void setSoundState(int i) {
        this.f40446h0 = i;
    }

    public void setUnitId(String str) {
        this.f40431Q = str;
        C14057w c14057w = this.f40426N0;
        if (c14057w != null) {
            c14057w.m42158a(str);
        }
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f40448j0 = mediaEvents;
        C14057w c14057w = this.f40426N0;
        if (c14057w != null) {
            c14057w.f40519f = mediaEvents;
        }
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            playerView.setVideoEvents(mediaEvents);
        }
    }

    public void setVideoLayout(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f40202b = campaignEx;
            this.f40208h = campaignEx.isDynamicView();
        }
        if (this.f40208h) {
            m42078a(this, campaignEx);
        } else {
            m42102h();
        }
    }

    public void setVideoSkipTime(int i) {
        this.f40421L = i;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void setVisible(int i) {
        setVisibility(i);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void showAlertView() {
        CampaignEx campaignEx;
        if (this.f40438W) {
            return;
        }
        if (this.f40429P == null) {
            this.f40429P = new C14053s();
        }
        if (this.f40427O == null) {
            MBAlertDialog mBAlertDialog = new MBAlertDialog(getContext(), this.f40429P);
            this.f40427O = mBAlertDialog;
            AdSession adSession = this.f40447i0;
            if (adSession != null) {
                adSession.addFriendlyObstruction(mBAlertDialog.getWindow().getDecorView(), FriendlyObstructionPurpose.NOT_VISIBLE, null);
            }
        }
        if (this.f40445g0) {
            this.f40427O.makeIVAlertView(this.f40450l0, this.f40431Q);
        } else {
            this.f40427O.makeRVAlertView(this.f40431Q);
        }
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            if (playerView.isComplete() && ((campaignEx = this.f40202b) == null || campaignEx.getRewardTemplateMode() == null || this.f40202b.getRewardTemplateMode().m36782k() != 5002010)) {
                return;
            }
            this.f40427O.show();
            this.f40456o0 = true;
            this.f40415I = true;
            setShowingAlertViewCover(true);
            String strM42710c = C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), this.f40431Q, false).m42710c();
            this.f40449k0 = strM42710c;
            C13148j.m37381a(this.f40201a, this.f40202b, strM42710c, this.f40431Q, 1, 1);
        }
    }

    public void showBaitClickView() {
        int i;
        MBridgeBaitClickView mBridgeBaitClickView;
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.f40202b.getRewardTemplateMode() == null) {
            return;
        }
        String strM36781j = this.f40202b.getRewardTemplateMode().m36781j();
        if (TextUtils.isEmpty(strM36781j)) {
            return;
        }
        try {
            String strM37645a = C13188c1.m37645a(strM36781j, "bait_click");
            if (TextUtils.isEmpty(strM37645a) || (i = Integer.parseInt(strM37645a)) == 0 || (mBridgeBaitClickView = this.f40476y0) == null) {
                return;
            }
            mBridgeBaitClickView.setVisibility(0);
            this.f40476y0.init(i);
            this.f40476y0.startAnimation();
            this.f40476y0.setOnClickListener(new ViewOnClickListenerC14043i());
        } catch (Exception e) {
            C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void showIVRewardAlertView(String str) {
        this.notifyListener.mo41600a(8, "");
    }

    public void showMoreOfferInPlayTemplate() {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || this.f40411G == null || !campaignEx.isDynamicView() || this.f40202b.getRewardTemplateMode() == null) {
            return;
        }
        String strM36781j = this.f40202b.getRewardTemplateMode().m36781j();
        if (TextUtils.isEmpty(strM36781j)) {
            return;
        }
        try {
            String strM37645a = C13188c1.m37645a(strM36781j, "mof");
            if (TextUtils.isEmpty(strM37645a) || Integer.parseInt(strM37645a) != 1) {
                return;
            }
            C13965a.m41789a().m41798a(this.f40202b, this, new C14067i(this.f40467u), 1);
        } catch (Exception e) {
            C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void showRewardPopView() {
        AcquireRewardPopViewParameters acquireRewardPopViewParameters;
        MBAcquireRewardPopView mBAcquireRewardPopView = this.f40408E0;
        if (mBAcquireRewardPopView == null || (acquireRewardPopViewParameters = this.f40406D0) == null) {
            return;
        }
        try {
            mBAcquireRewardPopView.init(acquireRewardPopViewParameters);
            this.f40408E0.setVisibility(0);
            setCover(true);
            m42124o();
            this.f40417J = true;
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx != null) {
                campaignEx.isRewardPopViewShowed = true;
            }
        } catch (Exception e) {
            C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        float f;
        if (this.f40205e) {
            this.f40455o.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.f40455o.getVisibility() != 0) {
                this.f40455o.setVisibility(0);
            }
            if (this.f40451m.getVisibility() == 0) {
                m42096f();
            }
            if (!m42085b(i3, i4) || this.f40435T) {
                m42137u();
                return;
            }
            f40393S0 = i6;
            f40394T0 = i7;
            f40395U0 = i8 + 4;
            f40396V0 = i9 + 4;
            float f2 = i3 / i4;
            try {
                f = (float) (this.f40433R / this.f40434S);
            } catch (Throwable th) {
                C13219q0.m37817b(MBridgeBaseView.TAG, th.getMessage(), th);
                f = 0.0f;
            }
            if (i5 > 0) {
                f40392R0 = i5;
                setPlayerViewRadius(i5);
            }
            if (Math.abs(f2 - f) > 0.1f && this.f40444f0 != 1) {
                m42137u();
                videoOperate(1);
                return;
            }
            m42137u();
            if (!this.f40443e0) {
                setLayoutParam(i2, i, i3, i4);
                return;
            }
            setLayoutCenter(i3, i4);
            if (f40397W0) {
                this.notifyListener.mo41600a(114, "");
            } else {
                this.notifyListener.mo41600a(116, "");
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void soundOperate(int i, int i2) {
        soundOperate(i, i2, "2");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void soundOperate(int i, int i2, String str) {
        InterfaceC14058a interfaceC14058a;
        SoundImageView soundImageView;
        if (this.f40205e) {
            this.f40446h0 = i;
            if (i == 1) {
                this.f40405D.getJSCommon().mo42225g(i);
                SoundImageView soundImageView2 = this.mSoundImageView;
                if (soundImageView2 != null) {
                    soundImageView2.setSoundStatus(false);
                }
                this.mPlayerView.closeSound();
                try {
                    MediaEvents mediaEvents = this.f40448j0;
                    if (mediaEvents != null) {
                        mediaEvents.volumeChange(0.0f);
                        C13219q0.m37813a("omsdk", "play video view:  mute");
                    }
                } catch (Exception e) {
                    C13219q0.m37813a("OMSDK", e.getMessage());
                }
            } else if (i == 2) {
                this.f40405D.getJSCommon().mo42225g(i);
                SoundImageView soundImageView3 = this.mSoundImageView;
                if (soundImageView3 != null) {
                    soundImageView3.setSoundStatus(true);
                }
                this.mPlayerView.openSound();
                try {
                    MediaEvents mediaEvents2 = this.f40448j0;
                    if (mediaEvents2 != null) {
                        mediaEvents2.volumeChange(1.0f);
                        C13219q0.m37813a("omsdk", "play video view:  unmute");
                    }
                } catch (Exception e2) {
                    C13219q0.m37813a("OMSDK", e2.getMessage());
                }
            }
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                SoundImageView soundImageView4 = this.mSoundImageView;
                if (soundImageView4 != null) {
                    soundImageView4.setVisibility(0);
                }
            } else if (i2 == 1) {
                SoundImageView soundImageView5 = this.mSoundImageView;
                if (soundImageView5 != null) {
                    soundImageView5.setVisibility(8);
                }
            } else if (i2 == 2 && (soundImageView = this.mSoundImageView) != null) {
                soundImageView.setVisibility(0);
            }
        }
        if (str == null || !str.equals("2") || (interfaceC14058a = this.notifyListener) == null) {
            return;
        }
        interfaceC14058a.mo41600a(7, Integer.valueOf(i));
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void videoOperate(int i) {
        C13219q0.m37813a(MBridgeBaseView.TAG, "VideoView videoOperate:" + i);
        if (this.f40205e) {
            if (i == 1) {
                if (getVisibility() == 0 && isfront()) {
                    C13219q0.m37813a(MBridgeBaseView.TAG, "VideoView videoOperate:play");
                    RelativeLayout relativeLayout = this.f40416I0;
                    if ((relativeLayout != null && relativeLayout.getVisibility() != 0) || this.f40415I || C13084b.f35793f) {
                        return;
                    }
                    if (!C13884b.m41421a()) {
                        m42126p();
                        return;
                    } else {
                        if (this.f40438W || this.f40410F0) {
                            return;
                        }
                        m42126p();
                        return;
                    }
                }
                return;
            }
            if (i == 2) {
                if (getVisibility() == 0 && isfront()) {
                    C13219q0.m37813a(MBridgeBaseView.TAG, "VideoView videoOperate:pause");
                    m42124o();
                    return;
                }
                return;
            }
            if (i == 3) {
                if (this.f40437V) {
                    return;
                }
                this.mPlayerView.stop();
                CampaignEx campaignEx = this.f40202b;
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || this.f40202b.getRewardTemplateMode().m36782k() != 5002010) {
                    this.mPlayerView.release();
                    this.f40437V = true;
                    if (TextUtils.isEmpty(this.f40419K)) {
                        return;
                    }
                    C13157e c13157e = new C13157e();
                    long jCurrentTimeMillis = f40398X0;
                    if (jCurrentTimeMillis != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - f40398X0;
                    }
                    c13157e.m37501a("duration", Long.valueOf(jCurrentTimeMillis));
                    C13156d.m37475b().m37483a("2000146", this.f40202b, c13157e);
                    return;
                }
                return;
            }
            if (i == 5) {
                if (C13884b.m41421a()) {
                    this.f40410F0 = true;
                    if (this.f40437V) {
                        return;
                    }
                    m42124o();
                    return;
                }
                return;
            }
            if (i == 4) {
                if (C13884b.m41421a()) {
                    this.f40410F0 = false;
                    if (this.f40437V || isMiniCardShowing()) {
                        return;
                    }
                    m42126p();
                    return;
                }
                return;
            }
            if (i != 6 || this.f40437V) {
                return;
            }
            this.mPlayerView.release();
            this.f40437V = true;
            if (TextUtils.isEmpty(this.f40419K)) {
                return;
            }
            C13157e c13157e2 = new C13157e();
            long jCurrentTimeMillis2 = f40398X0;
            if (jCurrentTimeMillis2 != 0) {
                jCurrentTimeMillis2 = System.currentTimeMillis() - f40398X0;
            }
            c13157e2.m37501a("duration", Long.valueOf(jCurrentTimeMillis2));
            C13156d.m37475b().m37483a("2000146", this.f40202b, c13157e2);
        }
    }
}
