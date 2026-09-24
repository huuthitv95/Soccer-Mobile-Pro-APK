package com.mbridge.msdk.nativex.view;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.PlayerState;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.ironsource.C11341A5;
import com.ironsource.InterfaceC11669Sd;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13026n;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.same.webview.C13168a;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13194e1;
import com.mbridge.msdk.foundation.tools.C13195f;
import com.mbridge.msdk.foundation.tools.C13200h;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbnative.listener.C13339a;
import com.mbridge.msdk.mbnative.report.C13340a;
import com.mbridge.msdk.mbnative.report.C13341b;
import com.mbridge.msdk.mbsignalcommon.base.InterfaceC13348a;
import com.mbridge.msdk.mbsignalcommon.communication.C13374d;
import com.mbridge.msdk.mbsignalcommon.listener.C13377b;
import com.mbridge.msdk.mbsignalcommon.windvane.C13387a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.nativex.listener.AbstractC13399b;
import com.mbridge.msdk.nativex.listener.InterfaceC13398a;
import com.mbridge.msdk.nativex.view.mbfullview.BaseView;
import com.mbridge.msdk.nativex.view.mbfullview.C13436a;
import com.mbridge.msdk.nativex.view.mbfullview.MBridgeFullView;
import com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView;
import com.mbridge.msdk.omsdk.C13439b;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.out.OnMBMediaViewListenerPlus;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13640l;
import com.mbridge.msdk.video.signal.communication.IRewardCommunication;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.download.C14213l;
import com.mbridge.msdk.videocommon.listener.InterfaceC14217a;
import com.mbridge.msdk.videocommon.view.MyImageView;
import com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a;
import com.mbridge.msdk.widget.MBAdChoice;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.mediation.LevelPlayAdError;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseMBMediaView extends LinearLayout implements VideoPlayerStatusListener, IRewardCommunication {
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_1_LANDING_PAGE = 1;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_2_NORMAL_FULLSCREEN = 2;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_3_NORMAL_FULLSCREEN_ENDCARD = 3;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_4_NORMAL_FULLSCREEN_LP = 4;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_6_SMALLVIDEO = 6;
    public static final String TAG = "BaseMBMediaView";
    public static final int WHAT_VIEW_FULL_SCREEN = 2;
    public static final int WHAT_VIEW_SMALL_SCREEN = 1;

    /* JADX INFO: renamed from: n0 */
    private static int f37199n0 = 2;

    /* JADX INFO: renamed from: o0 */
    private static int f37200o0 = 1;

    /* JADX INFO: renamed from: A */
    private WindVaneWebViewForNV f37201A;

    /* JADX INFO: renamed from: B */
    private MyImageView f37202B;

    /* JADX INFO: renamed from: C */
    private ProgressBar f37203C;

    /* JADX INFO: renamed from: D */
    private View f37204D;

    /* JADX INFO: renamed from: E */
    private BaseView f37205E;

    /* JADX INFO: renamed from: F */
    private RelativeLayout f37206F;

    /* JADX INFO: renamed from: G */
    private RelativeLayout f37207G;

    /* JADX INFO: renamed from: H */
    private TextView f37208H;

    /* JADX INFO: renamed from: I */
    private ProgressBar f37209I;

    /* JADX INFO: renamed from: J */
    private RelativeLayout f37210J;

    /* JADX INFO: renamed from: K */
    private int f37211K;

    /* JADX INFO: renamed from: L */
    private Handler f37212L;

    /* JADX INFO: renamed from: M */
    private CampaignEx f37213M;

    /* JADX INFO: renamed from: N */
    private int f37214N;

    /* JADX INFO: renamed from: O */
    private int f37215O;

    /* JADX INFO: renamed from: P */
    private double f37216P;

    /* JADX INFO: renamed from: Q */
    private double f37217Q;

    /* JADX INFO: renamed from: R */
    private int f37218R;

    /* JADX INFO: renamed from: S */
    private int f37219S;

    /* JADX INFO: renamed from: T */
    private C13422w f37220T;

    /* JADX INFO: renamed from: U */
    private SensorManager f37221U;

    /* JADX INFO: renamed from: V */
    private Sensor f37222V;

    /* JADX INFO: renamed from: W */
    private C14202a f37223W;

    /* JADX INFO: renamed from: a */
    private boolean f37224a;

    /* JADX INFO: renamed from: a0 */
    private EnumC13418s f37225a0;

    /* JADX INFO: renamed from: b */
    private boolean f37226b;

    /* JADX INFO: renamed from: b0 */
    private OnMBMediaViewListener f37227b0;

    /* JADX INFO: renamed from: c */
    private boolean f37228c;

    /* JADX INFO: renamed from: c0 */
    private OnMBMediaViewListenerPlus f37229c0;

    /* JADX INFO: renamed from: d */
    private boolean f37230d;

    /* JADX INFO: renamed from: d0 */
    private int f37231d0;

    /* JADX INFO: renamed from: e */
    private boolean f37232e;

    /* JADX INFO: renamed from: e0 */
    private boolean f37233e0;

    /* JADX INFO: renamed from: f */
    private boolean f37234f;

    /* JADX INFO: renamed from: f0 */
    private boolean f37235f0;

    /* JADX INFO: renamed from: g */
    private boolean f37236g;

    /* JADX INFO: renamed from: g0 */
    private RelativeLayout f37237g0;

    /* JADX INFO: renamed from: h */
    private boolean f37238h;

    /* JADX INFO: renamed from: h0 */
    private ImageView f37239h0;

    /* JADX INFO: renamed from: i */
    private volatile boolean f37240i;

    /* JADX INFO: renamed from: i0 */
    private int f37241i0;

    /* JADX INFO: renamed from: j */
    private volatile boolean f37242j;

    /* JADX INFO: renamed from: j0 */
    private boolean f37243j0;

    /* JADX INFO: renamed from: k */
    private boolean f37244k;

    /* JADX INFO: renamed from: k0 */
    private Context f37245k0;

    /* JADX INFO: renamed from: l */
    private boolean f37246l;

    /* JADX INFO: renamed from: l0 */
    private boolean f37247l0;

    /* JADX INFO: renamed from: m */
    private ArrayList<String> f37248m;

    /* JADX INFO: renamed from: m0 */
    private Runnable f37249m0;

    /* JADX INFO: renamed from: n */
    private ArrayList<String> f37250n;

    /* JADX INFO: renamed from: o */
    private boolean f37251o;

    /* JADX INFO: renamed from: p */
    private boolean f37252p;

    /* JADX INFO: renamed from: q */
    private AdSession f37253q;

    /* JADX INFO: renamed from: r */
    private AdEvents f37254r;

    /* JADX INFO: renamed from: s */
    private MediaEvents f37255s;

    /* JADX INFO: renamed from: t */
    private int f37256t;

    /* JADX INFO: renamed from: u */
    protected boolean f37257u;

    /* JADX INFO: renamed from: v */
    private MediaViewPlayerView f37258v;

    /* JADX INFO: renamed from: w */
    private RelativeLayout f37259w;

    /* JADX INFO: renamed from: x */
    private RelativeLayout f37260x;

    /* JADX INFO: renamed from: y */
    private RelativeLayout f37261y;

    /* JADX INFO: renamed from: z */
    private WindVaneWebViewForNV f37262z;

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$a */
    class ViewOnClickListenerC13400a implements View.OnClickListener {
        ViewOnClickListenerC13400a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBMediaView.this.m38851l();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$b */
    class ViewOnClickListenerC13401b implements View.OnClickListener {
        ViewOnClickListenerC13401b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBMediaView.this.m38840g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$c */
    class C13402c extends AbstractViewOnClickListenerC14227a {
        C13402c() {
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            try {
                BaseMBMediaView.this.m38803a(view.getContext());
                if (BaseMBMediaView.this.f37255s != null) {
                    try {
                        BaseMBMediaView.this.f37255s.adUserInteraction(InteractionType.CLICK);
                        C13219q0.m37813a("omsdk", "bmnv adUserInteraction click");
                    } catch (Exception e) {
                        C13219q0.m37816b("omsdk", e.getMessage());
                    }
                }
            } catch (Exception e2) {
                C13219q0.m37816b(BaseMBMediaView.TAG, e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$d */
    class RunnableC13403d implements Runnable {
        RunnableC13403d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseMBMediaView.this.f37252p = true;
            if (BaseMBMediaView.this.f37238h) {
                TextView unused = BaseMBMediaView.this.f37208H;
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$e */
    class C13404e extends AbstractC13399b {
        C13404e() {
        }

        @Override // com.mbridge.msdk.nativex.listener.AbstractC13399b
        /* JADX INFO: renamed from: a */
        public void mo38751a() {
            BaseMBMediaView.this.exitFullScreen();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$f */
    class C13405f extends C13377b {
        C13405f() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            BaseMBMediaView.this.f37233e0 = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            BaseMBMediaView.this.f37233e0 = false;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$g */
    class RunnableC13406g implements Runnable {
        RunnableC13406g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13436a.m38928a(BaseMBMediaView.this.getContext()).m38934a(BaseMBMediaView.this.f37205E, BaseMBMediaView.this.f37240i);
                if (BaseMBMediaView.this.f37241i0 == 0) {
                    BaseMBMediaView.this.m38780O();
                } else {
                    BaseMBMediaView.this.m38783P();
                }
                BaseMBMediaView.this.m38869u();
                BaseMBMediaView.this.m38856o();
                BaseMBMediaView.this.m38874x();
                if (BaseMBMediaView.this.f37201A != null) {
                    BaseMBMediaView.this.f37201A.orientation(BaseMBMediaView.this.f37240i);
                }
            } catch (Exception e) {
                C13219q0.m37816b(BaseMBMediaView.TAG, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$h */
    class RunnableC13407h implements Runnable {
        RunnableC13407h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!BaseMBMediaView.this.f37238h) {
                    BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                    if (baseMBMediaView.m38811a((View) baseMBMediaView)) {
                        BaseMBMediaView.this.m38814a0();
                    } else {
                        BaseMBMediaView.this.m38752A();
                    }
                }
                BaseMBMediaView.this.f37212L.postDelayed(this, 300L);
            } catch (Exception e) {
                C13219q0.m37816b(BaseMBMediaView.TAG, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$i */
    static /* synthetic */ class C13408i {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f37271a;

        static {
            int[] iArr = new int[BaseView.EnumC13435a.values().length];
            f37271a = iArr;
            try {
                iArr[BaseView.EnumC13435a.FULL_MIDDLE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37271a[BaseView.EnumC13435a.FULL_TOP_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$j */
    class HandlerC13409j extends Handler {
        HandlerC13409j() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            if (message != null) {
                try {
                    int i = message.what;
                    if (i == 1) {
                        BaseMBMediaView.this.m38788S();
                        return;
                    }
                    if (i == 3 && (obj = message.obj) != null && (obj instanceof View)) {
                        if (BaseMBMediaView.this.m38811a((View) obj)) {
                            BaseMBMediaView.this.m38760E();
                        }
                    }
                } catch (Exception e) {
                    C13219q0.m37816b(BaseMBMediaView.TAG, e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$k */
    class C13410k extends AbstractViewOnClickListenerC14227a {
        C13410k() {
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            try {
                if (!BaseMBMediaView.this.f37238h) {
                    BaseMBMediaView.this.m38774L();
                }
                BaseMBMediaView.this.f37258v.showSoundIndicator(true);
                BaseMBMediaView.this.f37258v.showProgressView(true);
                if (BaseMBMediaView.this.f37230d && !BaseMBMediaView.this.f37238h && (BaseMBMediaView.this.f37204D == null || BaseMBMediaView.this.f37204D.getParent() == null)) {
                    if (!BaseMBMediaView.this.f37258v.halfLoadingViewisVisible() && BaseMBMediaView.this.f37258v.isPlaying()) {
                        BaseMBMediaView.this.m38880a();
                        return;
                    }
                    C13219q0.m37818c(BaseMBMediaView.TAG, "is loading or no playing return;");
                    return;
                }
                if (BaseMBMediaView.this.f37238h) {
                    C13219q0.m37818c(BaseMBMediaView.TAG, "fullScreenShowUI");
                    BaseMBMediaView.this.m38851l();
                    return;
                }
                if (BaseMBMediaView.this.f37245k0 != null) {
                    BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                    baseMBMediaView.m38803a(baseMBMediaView.f37245k0);
                } else {
                    BaseMBMediaView.this.m38803a(view.getContext());
                }
                if (BaseMBMediaView.this.f37255s != null) {
                    try {
                        BaseMBMediaView.this.f37255s.adUserInteraction(InteractionType.CLICK);
                        C13219q0.m37813a("omsdk", "mnv adUserInteraction click");
                    } catch (Exception e) {
                        C13219q0.m37816b("omsdk", e.getMessage());
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37817b(BaseMBMediaView.TAG, th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$l */
    class C13411l implements InterfaceC13101c {

        /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$l$a */
        class a extends AbstractViewOnClickListenerC14227a {
            a() {
            }

            @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
            /* JADX INFO: renamed from: a */
            protected void mo38475a(View view) {
                if (BaseMBMediaView.this.f37245k0 == null) {
                    BaseMBMediaView.this.m38803a(view.getContext());
                } else {
                    BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                    baseMBMediaView.m38803a(baseMBMediaView.f37245k0);
                }
            }
        }

        C13411l() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (BaseMBMediaView.this.f37202B == null || BaseMBMediaView.this.f37225a0 != EnumC13418s.BIG_IMAGE) {
                return;
            }
            if (bitmap != null) {
                BaseMBMediaView.this.f37218R = bitmap.getWidth();
                BaseMBMediaView.this.f37219S = bitmap.getHeight();
                BaseMBMediaView.this.f37202B.setImageUrl(str);
                BaseMBMediaView.this.f37202B.setImageBitmap(bitmap);
            }
            C13185b1.m37632a(BaseMBMediaView.this.f37202B, BaseMBMediaView.this.f37213M.getLocalRequestId(), BaseMBMediaView.this.f37213M.getLocalAllowTrackClick());
            BaseMBMediaView.this.f37202B.setOnClickListener(new a());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$m */
    class C13412m extends AbstractViewOnClickListenerC14227a {
        C13412m() {
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            if (BaseMBMediaView.this.f37245k0 != null) {
                BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                baseMBMediaView.m38803a(baseMBMediaView.f37245k0);
            } else {
                BaseMBMediaView.this.m38803a(view.getContext());
            }
            C13219q0.m37818c(BaseMBMediaView.TAG, "CLICK WEBVIEW LAYOUT ");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$n */
    class C13413n implements NativeListener.NativeTrackingListener {
        C13413n() {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            try {
                BaseMBMediaView.this.m38854n();
                BaseMBMediaView.this.m38853m();
                BaseMBMediaView.this.m38810a(campaign, str);
            } catch (Exception e) {
                C13219q0.m37816b(BaseMBMediaView.TAG, e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return true;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            try {
                BaseMBMediaView.this.m38854n();
                BaseMBMediaView.this.m38853m();
                BaseMBMediaView.this.m38821b(campaign, str);
            } catch (Exception e) {
                C13219q0.m37816b(BaseMBMediaView.TAG, e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            try {
                BaseMBMediaView.this.m38795Y();
                BaseMBMediaView.this.m38793W();
                BaseMBMediaView.this.m38828c(campaign, str);
            } catch (Exception e) {
                C13219q0.m37816b(BaseMBMediaView.TAG, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$o */
    class RunnableC13414o implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f37278a;

        RunnableC13414o(String str) {
            this.f37278a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BaseMBMediaView.this.m38768I();
                BaseMBMediaView.this.m38829c(this.f37278a);
                C13229v0.m37896a(BaseMBMediaView.this.f37213M.getCampaignUnitId(), BaseMBMediaView.this.f37213M, C13088a.f35882x);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b(BaseMBMediaView.TAG, e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$p */
    class C13415p extends MediaViewPlayerView.C13433h {
        C13415p(MediaViewPlayerView mediaViewPlayerView) {
            super(mediaViewPlayerView);
        }

        @Override // com.mbridge.msdk.nativex.view.MediaViewPlayerView.C13433h
        /* JADX INFO: renamed from: a */
        public void mo38883a() {
            int nvT2 = BaseMBMediaView.this.f37213M.getNvT2();
            if (!BaseMBMediaView.this.f37238h || (nvT2 != 3 && nvT2 != 4)) {
                super.mo38883a();
                return;
            }
            WindVaneWebViewForNV endCardWebview = BaseMBMediaView.this.getEndCardWebview();
            if (endCardWebview == null) {
                super.mo38883a();
                return;
            }
            View viewM38860q = BaseMBMediaView.this.m38860q();
            if (viewM38860q == null) {
                super.mo38883a();
                return;
            }
            if (nvT2 == 3 && BaseMBMediaView.this.f37233e0) {
                C13436a.m38928a(BaseMBMediaView.this.getContext()).m38931a(viewM38860q, BaseMBMediaView.this.f37205E);
                C13340a.m38560a(BaseMBMediaView.this.getContext(), BaseMBMediaView.this.f37213M, BaseMBMediaView.this.f37213M.getCampaignUnitId());
            } else {
                if (nvT2 != 4) {
                    super.mo38883a();
                    return;
                }
                C13436a.m38928a(BaseMBMediaView.this.getContext()).m38931a(viewM38860q, BaseMBMediaView.this.f37205E);
                String clickURL = BaseMBMediaView.this.f37213M.getClickURL();
                if (!TextUtils.isEmpty(clickURL)) {
                    C12682a.m34606a(BaseMBMediaView.this.getContext(), BaseMBMediaView.this.f37213M, BaseMBMediaView.this.getUnitId(), BaseMBMediaView.this.getAddNVT2ToNoticeURL(), true, false, C12701a.f33768o);
                    BaseMBMediaView.this.f37201A.loadUrl(clickURL);
                }
            }
            endCardWebview.webViewShow(BaseMBMediaView.this.f37213M, BaseMBMediaView.this.getUnitId());
            endCardWebview.orientation(BaseMBMediaView.this.f37240i);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$q */
    class ViewOnClickListenerC13416q implements View.OnClickListener {
        ViewOnClickListenerC13416q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBMediaView.this.exitFullScreen();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$r */
    class ViewOnKeyListenerC13417r implements View.OnKeyListener {
        ViewOnKeyListenerC13417r() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            try {
                if (keyEvent.getKeyCode() != 4) {
                    return false;
                }
                BaseMBMediaView.this.m38840g();
                return true;
            } catch (Throwable th) {
                C13219q0.m37816b(BaseMBMediaView.TAG, th.getMessage());
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$s */
    private enum EnumC13418s {
        BIG_IMAGE,
        VIDEO,
        GIF
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$t */
    private static final class RunnableC13419t implements Runnable {

        /* JADX INFO: renamed from: a */
        WeakReference<BaseMBMediaView> f37287a;

        public RunnableC13419t(BaseMBMediaView baseMBMediaView) {
            this.f37287a = new WeakReference<>(baseMBMediaView);
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseMBMediaView baseMBMediaView = this.f37287a.get();
            if (baseMBMediaView != null) {
                try {
                    if (baseMBMediaView.f37225a0 == null || baseMBMediaView.f37225a0 != EnumC13418s.BIG_IMAGE) {
                        return;
                    }
                    baseMBMediaView.m38791U();
                    baseMBMediaView.f37225a0 = EnumC13418s.VIDEO;
                    baseMBMediaView.changeNoticeURL();
                } catch (Throwable th) {
                    C13219q0.m37817b(BaseMBMediaView.TAG, th.getMessage(), th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$v */
    private static final class C13421v implements InterfaceC13348a {
        private C13421v() {
        }

        /* synthetic */ C13421v(HandlerC13409j handlerC13409j) {
            this();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.base.InterfaceC13348a
        /* JADX INFO: renamed from: a */
        public boolean mo38605a(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (C13227u0.a.m37868b(str)) {
                        C13227u0.m37858a(C13008c.m36588n().m36542d(), str, (NativeListener.NativeTrackingListener) null);
                        return true;
                    }
                    if (URLUtil.isNetworkUrl(str)) {
                        return false;
                    }
                    C13227u0.m37856a(C13008c.m36588n().m36542d(), str, (BaseTrackingListener) null);
                    return true;
                }
            } catch (Exception e) {
                C13219q0.m37816b(BaseMBMediaView.TAG, e.getMessage());
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$w */
    private class C13422w implements SensorEventListener {

        /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$w$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C13436a.m38928a(BaseMBMediaView.this.getContext()).m38934a(BaseMBMediaView.this.f37205E, BaseMBMediaView.this.f37240i);
                    BaseMBMediaView.this.m38780O();
                    BaseMBMediaView.this.m38869u();
                    BaseMBMediaView.this.m38856o();
                    BaseMBMediaView.this.m38874x();
                    if (BaseMBMediaView.this.f37201A != null) {
                        BaseMBMediaView.this.f37201A.orientation(BaseMBMediaView.this.f37240i);
                    }
                } catch (Exception e) {
                    C13219q0.m37816b(BaseMBMediaView.TAG, e.getMessage());
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$w$b */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C13436a.m38928a(BaseMBMediaView.this.getContext()).m38934a(BaseMBMediaView.this.f37205E, BaseMBMediaView.this.f37240i);
                    BaseMBMediaView.this.m38783P();
                    BaseMBMediaView.this.m38869u();
                    BaseMBMediaView.this.m38856o();
                    BaseMBMediaView.this.m38874x();
                    if (BaseMBMediaView.this.f37201A != null) {
                        BaseMBMediaView.this.f37201A.orientation(BaseMBMediaView.this.f37240i);
                    }
                } catch (Exception e) {
                    C13219q0.m37816b(BaseMBMediaView.TAG, e.getMessage());
                }
            }
        }

        private C13422w() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            int iRound;
            if (BaseMBMediaView.this.f37243j0) {
                return;
            }
            try {
                float[] fArr = sensorEvent.values;
                float f = -fArr[0];
                float f2 = -fArr[1];
                float f3 = -fArr[2];
                if (((f * f) + (f2 * f2)) * 4.0f >= f3 * f3) {
                    iRound = 90 - Math.round(((float) Math.atan2(-f2, f)) * 57.29578f);
                    while (iRound >= 360) {
                        iRound -= 360;
                    }
                    while (iRound < 0) {
                        iRound += 360;
                    }
                } else {
                    iRound = -1;
                }
                float allScreenWidth = BaseMBMediaView.this.getAllScreenWidth();
                int iM37933h = C13229v0.m37933h(BaseMBMediaView.this.getContext());
                if ((iRound > 45 && iRound < 135) || (iRound > 225 && iRound < 315)) {
                    if (allScreenWidth < iM37933h || BaseMBMediaView.this.f37242j) {
                        return;
                    }
                    BaseMBMediaView.this.f37240i = true;
                    BaseMBMediaView.this.f37242j = true;
                    BaseMBMediaView.this.f37212L.postDelayed(new a(), 200L);
                    return;
                }
                if (((iRound <= 135 || iRound >= 225) && ((iRound <= 315 || iRound >= 360) && ((iRound < 0 || iRound > 45) && iRound != -1))) || allScreenWidth > iM37933h || !BaseMBMediaView.this.f37242j) {
                    return;
                }
                BaseMBMediaView.this.f37240i = false;
                BaseMBMediaView.this.f37242j = false;
                BaseMBMediaView.this.f37212L.postDelayed(new b(), 200L);
            } catch (Throwable th) {
                C13219q0.m37817b(BaseMBMediaView.TAG, th.getMessage(), th);
            }
        }

        /* synthetic */ C13422w(BaseMBMediaView baseMBMediaView, HandlerC13409j handlerC13409j) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$x */
    private static final class C13423x implements InterfaceC14217a {

        /* JADX INFO: renamed from: a */
        WeakReference<BaseMBMediaView> f37292a;

        public C13423x(BaseMBMediaView baseMBMediaView) {
            this.f37292a = new WeakReference<>(baseMBMediaView);
        }

        @Override // com.mbridge.msdk.videocommon.listener.InterfaceC14217a
        /* JADX INFO: renamed from: a */
        public void mo34468a(String str) {
            BaseMBMediaView baseMBMediaView = this.f37292a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.f37212L.post(new RunnableC13419t(baseMBMediaView));
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.InterfaceC14217a
        /* JADX INFO: renamed from: a */
        public void mo34469a(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$y */
    private static final class C13424y extends WebViewClient {

        /* JADX INFO: renamed from: a */
        WeakReference<BaseMBMediaView> f37293a;

        public C13424y(BaseMBMediaView baseMBMediaView) {
            this.f37293a = new WeakReference<>(baseMBMediaView);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                BaseMBMediaView baseMBMediaView = this.f37293a.get();
                if (baseMBMediaView == null || baseMBMediaView.f37225a0 == null || baseMBMediaView.f37225a0 != EnumC13418s.BIG_IMAGE) {
                    return;
                }
                baseMBMediaView.m38787R();
                baseMBMediaView.f37225a0 = EnumC13418s.GIF;
                baseMBMediaView.changeNoticeURL();
            } catch (Exception e) {
                C13219q0.m37816b(BaseMBMediaView.TAG, e.getMessage());
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            C13219q0.m37816b(BaseMBMediaView.TAG, "WebView called onRenderProcessGone");
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
                    C13219q0.m37816b(BaseMBMediaView.TAG, th.getMessage());
                }
            }
            return true;
        }
    }

    public BaseMBMediaView(Context context) {
        super(context);
        this.f37224a = true;
        this.f37226b = true;
        this.f37228c = true;
        this.f37230d = true;
        this.f37232e = true;
        this.f37234f = false;
        this.f37236g = true;
        this.f37238h = false;
        this.f37240i = false;
        this.f37242j = false;
        this.f37244k = true;
        this.f37246l = true;
        this.f37248m = new ArrayList<>();
        this.f37250n = new ArrayList<>();
        this.f37251o = false;
        this.f37252p = false;
        this.f37253q = null;
        this.f37254r = null;
        this.f37255s = null;
        this.f37256t = 0;
        this.f37257u = false;
        this.f37223W = null;
        this.f37225a0 = null;
        this.f37233e0 = false;
        this.f37235f0 = false;
        this.f37243j0 = false;
        this.f37247l0 = false;
        this.f37249m0 = new RunnableC13407h();
        m38819b(context);
    }

    /* JADX INFO: renamed from: T */
    private void m38790T() {
        try {
            if (this.f37258v == null) {
                return;
            }
            C13157e c13157e = new C13157e();
            c13157e.m37501a("adtp", 42);
            if (TextUtils.isEmpty(this.f37213M.getBidToken())) {
                c13157e.m37501a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                c13157e.m37501a(CampaignEx.JSON_KEY_HB, 1);
            }
            C13185b1.m37632a(this.f37258v, this.f37213M.getLocalRequestId(), this.f37213M.getLocalAllowTrackClick());
            this.f37258v.setOnClickListener(new C13410k());
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public void m38791U() {
        m38870v();
        m38796Z();
    }

    /* JADX INFO: renamed from: V */
    private void m38792V() {
        try {
            C13229v0.m37894a((ImageView) this.f37202B);
            this.f37202B.setVisibility(0);
            this.f37259w.setVisibility(8);
            this.f37261y.setVisibility(8);
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public void m38793W() {
        try {
            ProgressBar progressBar = this.f37209I;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: X */
    private void m38794X() {
        try {
            this.f37259w.setVisibility(8);
            this.f37202B.setVisibility(8);
            this.f37261y.setVisibility(0);
            this.f37262z.setVisibility(0);
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m38795Y() {
        try {
            ProgressBar progressBar = this.f37203C;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: Z */
    private void m38796Z() {
        try {
            this.f37259w.setVisibility(0);
            this.f37202B.setVisibility(8);
            this.f37261y.setVisibility(8);
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m38814a0() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f37258v;
            if (mediaViewPlayerView == null || !mediaViewPlayerView.hasPrepare() || this.f37258v.isPlaying() || this.f37258v.isComplete() || !this.f37258v.hasPrepare()) {
                return;
            }
            this.f37258v.startOrPlayVideo();
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m38824b0() {
        C13422w c13422w;
        try {
            SensorManager sensorManager = this.f37221U;
            if (sensorManager == null || (c13422w = this.f37220T) == null) {
                return;
            }
            sensorManager.unregisterListener(c13422w);
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: c0 */
    private void m38832c0() {
        C14202a c14202a = this.f37223W;
        if (c14202a != null) {
            c14202a.m42484b((InterfaceC14217a) null);
        }
    }

    private float getAllScreenHeight() {
        try {
            float fM37933h = C13229v0.m37933h(getContext());
            return !this.f37240i ? fM37933h + C13229v0.m37911c(getContext()) : fM37933h;
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAllScreenWidth() {
        try {
            float fM37936i = C13229v0.m37936i(getContext());
            return this.f37240i ? fM37936i + C13229v0.m37911c(getContext()) : fM37936i;
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
            return 0.0f;
        }
    }

    private int getCDRate() {
        if (getUnitSetting() != null) {
            return getUnitSetting().m39646i();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindVaneWebViewForNV getEndCardWebview() {
        try {
            WindVaneWebViewForNV windVaneWebViewForNV = this.f37201A;
            if (windVaneWebViewForNV != null && this.f37235f0) {
                return windVaneWebViewForNV;
            }
            if (this.f37235f0) {
                return null;
            }
            m38822b(true);
            return null;
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
            return null;
        }
    }

    private String getPlayUrl() {
        try {
            if (this.f37213M == null) {
                return null;
            }
            C14202a c14202a = this.f37223W;
            if (c14202a != null && c14202a.m42504o() == 5) {
                String strM42505p = this.f37223W.m42505p();
                if (new File(strM42505p).exists() && (this.f37223W.m42509v() || this.f37223W.m42499j() == C13229v0.m37879a(new File(strM42505p)))) {
                    return strM42505p;
                }
            }
            String videoUrlEncode = this.f37213M.getVideoUrlEncode();
            if (C13182a1.m37597b(videoUrlEncode)) {
                return videoUrlEncode;
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
        return null;
    }

    private int getReadyRate() {
        if (getUnitSetting() != null) {
            return getUnitSetting().m39606C();
        }
        return 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getUnitId() {
        try {
            CampaignEx campaignEx = this.f37213M;
            if (campaignEx == null || !C13182a1.m37597b(campaignEx.getCampaignUnitId())) {
                return null;
            }
            return this.f37213M.getCampaignUnitId();
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
            return null;
        }
    }

    private C13640l getUnitSetting() {
        try {
            CampaignEx campaignEx = this.f37213M;
            if (campaignEx != null && !C13182a1.m37596a(campaignEx.getCampaignUnitId())) {
                String campaignUnitId = this.f37213M.getCampaignUnitId();
                String strM36533b = C13008c.m36588n().m36533b();
                if (!C13182a1.m37596a(campaignUnitId) && !C13182a1.m37596a(strM36533b)) {
                    C13640l c13640lM39720e = C13636h.m39706b().m39720e(strM36533b, campaignUnitId);
                    return c13640lM39720e != null ? c13640lM39720e : C13640l.m39753i(campaignUnitId);
                }
                return C13640l.m39753i(campaignUnitId);
            }
            return null;
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
            return null;
        }
    }

    private void setIsFrontDesk(boolean z) {
        MediaViewPlayerView mediaViewPlayerView = this.f37258v;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.setIsFrontDesk(z);
        }
    }

    private void setPlayViewParamsDefault(View view) {
        if (view == null) {
            return;
        }
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = -1;
            if (this.f37240i) {
                layoutParams.height = -1;
            } else {
                layoutParams.height = (((int) getAllScreenWidth()) * 9) / 16;
                layoutParams.addRule(13);
            }
            view.setLayoutParams(layoutParams);
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) {
        C13219q0.m37813a(TAG, "cai:" + str);
        if (TextUtils.isEmpty(str)) {
            C13374d.m38666a(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                String strOptString = new JSONObject(str).optString("packageName");
                if (TextUtils.isEmpty(strOptString)) {
                    C13374d.m38666a(obj, "packageName is empty");
                }
                int i = C13229v0.m37915c(C13008c.m36588n().m36542d(), strOptString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, C13374d.f37111b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i);
                    jSONObject.put("data", jSONObject2);
                    C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C13374d.m38666a(obj, e.getMessage());
                    C13219q0.m37813a(TAG, e.getMessage());
                }
            } catch (Throwable th) {
                C13374d.m38666a(obj, "exception: " + th.getLocalizedMessage());
                C13219q0.m37817b(TAG, "cai", th);
            }
        } catch (JSONException e2) {
            C13374d.m38666a(obj, "exception: " + e2.getLocalizedMessage());
            C13219q0.m37817b(TAG, "cai", e2);
        }
    }

    public boolean canShowVideo() {
        return m38799a(false) == EnumC13418s.VIDEO;
    }

    public void changeNoticeURL() {
        String str;
        CampaignEx campaignEx = this.f37213M;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (noticeUrl.contains("is_video")) {
                EnumC13418s enumC13418s = this.f37225a0;
                if (enumC13418s == EnumC13418s.VIDEO) {
                    if (noticeUrl.contains("is_video=2")) {
                        noticeUrl = noticeUrl.replace("is_video=2", "is_video=1");
                    }
                } else if (enumC13418s == EnumC13418s.BIG_IMAGE && noticeUrl.contains("is_video=1")) {
                    noticeUrl = noticeUrl.replace("is_video=1", "is_video=2");
                }
            } else {
                EnumC13418s enumC13418s2 = this.f37225a0;
                if (enumC13418s2 == EnumC13418s.VIDEO) {
                    str = "1";
                } else {
                    str = enumC13418s2 == EnumC13418s.BIG_IMAGE ? "2" : "";
                }
                StringBuilder sb = new StringBuilder(noticeUrl);
                if (noticeUrl.contains("?")) {
                    sb.append("&is_video=");
                    sb.append(str);
                } else {
                    sb.append("?is_video=");
                    sb.append(str);
                }
                noticeUrl = sb.toString();
            }
            this.f37213M.setNoticeUrl(noticeUrl);
        }
    }

    public void destory() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f37258v;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.release();
            }
            m38832c0();
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    public void exitFullScreen() {
        try {
            m38840g();
            if (this.f37226b) {
                this.f37258v.onClickPlayButton();
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    public String getAddNVT2ToNoticeURL() {
        CampaignEx campaignEx = this.f37213M;
        if (campaignEx == null) {
            return null;
        }
        String noticeUrl = campaignEx.getNoticeUrl();
        if (TextUtils.isEmpty(noticeUrl) || noticeUrl.contains(CampaignEx.JSON_KEY_NV_T2)) {
            return noticeUrl;
        }
        return noticeUrl + "&nv_t2=" + this.f37213M.getNvT2();
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f37213M);
            String strM38801a = m38801a(arrayList, getUnitId(), "MAL_17.0.91,3.0.1");
            String strEncodeToString = !TextUtils.isEmpty(strM38801a) ? Base64.encodeToString(strM38801a.getBytes(), 2) : "";
            C13219q0.m37816b(TAG, "getEndScreenInfo-mCampaign.name:" + this.f37213M.getAppName());
            C13392f.m38726a().m38731b(obj, strEncodeToString);
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    public BaseView getFullScreenViewByStyle(Context context, BaseView.EnumC13435a enumC13435a) {
        BaseView mBridgeFullView;
        BaseView baseView;
        int i = C13408i.f37271a[enumC13435a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                baseView = null;
            } else {
                mBridgeFullView = new MBridgeTopFullView(context);
            }
            if (baseView != null) {
                baseView.setStytle(enumC13435a);
            }
            return baseView;
        }
        mBridgeFullView = new MBridgeFullView(context);
        baseView = mBridgeFullView;
        if (baseView != null) {
            baseView.setStytle(enumC13435a);
        }
        return baseView;
    }

    public float getMediaContentAspectRatio() {
        float f = 0.0f;
        try {
            CampaignEx campaignEx = this.f37213M;
            if (campaignEx != null) {
                String videoResolution = !TextUtils.isEmpty(campaignEx.getVideoUrlEncode()) ? this.f37213M.getVideoResolution() : this.f37213M.getImageSize();
                if (!TextUtils.isEmpty(videoResolution)) {
                    String[] strArrSplit = videoResolution.split("x");
                    if (strArrSplit.length == 2) {
                        f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
                    }
                }
                C13219q0.m37816b(TAG, "resource ratio is : " + f);
            }
            return f;
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
            return f;
        }
    }

    public BaseView.EnumC13435a handleViewStyleResult(Context context) {
        int nvT2 = this.f37213M.getNvT2();
        if (nvT2 == 1) {
            m38803a(context);
            return null;
        }
        if (nvT2 == 2 || nvT2 == 3 || nvT2 == 4) {
            return BaseView.EnumC13435a.FULL_MIDDLE_VIEW;
        }
        if (nvT2 != 6) {
            return null;
        }
        return BaseView.EnumC13435a.FULL_TOP_VIEW;
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
    }

    public void hideEndCardWebViewCloseBtn() {
        ImageView imageView = this.f37239h0;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        this.f37239h0.setVisibility(8);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            Context context = this.f37245k0;
            if (context != null) {
                m38803a(context);
            } else {
                if (!(obj instanceof C13387a) || (windVaneWebView = ((C13387a) obj).f37156b) == null) {
                    return;
                }
                m38803a(windVaneWebView.getContext());
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    public boolean ismCurIsFullScreen() {
        return this.f37238h;
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f37228c) {
                m38754B();
            }
            this.f37236g = isHardwareAccelerated();
            this.f37241i0 = getOrientation();
            m38778N();
            this.f37212L.postDelayed(this.f37249m0, 300L);
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
        C13219q0.m37818c("omsdk", "base media end");
        MediaEvents mediaEvents = this.f37255s;
        if (mediaEvents != null) {
            mediaEvents.bufferFinish();
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
        C13219q0.m37818c("omsdk", "base media start");
        MediaEvents mediaEvents = this.f37255s;
        if (mediaEvents != null) {
            mediaEvents.bufferStart();
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingTimeOut(String str) {
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f37243j0) {
            int i = this.f37241i0;
            int i2 = configuration.orientation;
            if (i == i2) {
                return;
            }
            this.f37241i0 = i2;
            this.f37240i = i2 == 0;
            this.f37242j = this.f37241i0 == 0;
            this.f37212L.postDelayed(new RunnableC13406g(), 200L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.f37253q != null) {
                MediaViewPlayerView mediaViewPlayerView = this.f37258v;
                if (mediaViewPlayerView != null) {
                    mediaViewPlayerView.unregisterView();
                }
                this.f37253q.finish();
                this.f37253q = null;
            }
            if (this.f37255s != null) {
                this.f37255s = null;
            }
            if (this.f37254r != null) {
                this.f37254r = null;
            }
            this.f37212L.removeCallbacks(this.f37249m0);
            m38756C();
            m38824b0();
            m38832c0();
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        try {
            this.f37214N = getHeight();
            int width = getWidth();
            this.f37215O = width;
            if (width == 0) {
                this.f37215O = getMeasuredWidth();
            }
            if (this.f37214N == 0) {
                this.f37214N = getMeasuredHeight();
            }
            if (this.f37215O == 0 && this.f37214N == 0) {
                this.f37215O = (int) getAllScreenWidth();
            }
            EnumC13418s enumC13418s = this.f37225a0;
            if (enumC13418s != EnumC13418s.VIDEO || this.f37238h) {
                if (enumC13418s == EnumC13418s.BIG_IMAGE && !this.f37238h) {
                    m38856o();
                    return;
                } else {
                    if (enumC13418s != EnumC13418s.GIF || this.f37238h) {
                        return;
                    }
                    m38874x();
                    return;
                }
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (this.f37214N == 0 || ((layoutParams != null && layoutParams.height == -2) || (layoutParams != null && layoutParams.height == -1))) {
                this.f37214N = (int) ((((double) this.f37215O) * this.f37217Q) / this.f37216P);
            }
            m38869u();
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        MediaEvents mediaEvents = this.f37255s;
        if (mediaEvents != null) {
            mediaEvents.complete();
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        try {
            C13219q0.m37818c("error", str);
            RunnableC13414o runnableC13414o = new RunnableC13414o(str);
            if (C13009d.m36589a().m36605e()) {
                C13167a.m37543b().execute(runnableC13414o);
            } else {
                runnableC13414o.run();
            }
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i, int i2) {
        int i3;
        String str;
        m38818b(i);
        m38802a(i, i2);
        MediaEvents mediaEvents = this.f37255s;
        if (mediaEvents != null) {
            int i4 = (i * 100) / i2;
            int i5 = ((i + 1) * 100) / i2;
            if (i4 <= 25 && 25 < i5) {
                mediaEvents.firstQuartile();
            } else if (i4 <= 50 && 50 < i5) {
                mediaEvents.midpoint();
            } else if (i4 <= 75 && 75 < i5) {
                mediaEvents.thirdQuartile();
            }
        }
        if (getReadyRate() == 100 || this.f37247l0) {
            return;
        }
        int cDRate = getCDRate();
        int readyRate = getReadyRate();
        if (readyRate == 0) {
            return;
        }
        if (cDRate > readyRate) {
            cDRate = readyRate / 2;
        }
        if (cDRate < 0 || i < (i3 = (i2 * cDRate) / 100)) {
            return;
        }
        if (this.f37213M.getAdType() == 94 || this.f37213M.getAdType() == 287) {
            str = this.f37213M.getRequestId() + this.f37213M.getId() + this.f37213M.getVideoUrlEncode();
        } else {
            str = this.f37213M.getId() + this.f37213M.getVideoUrlEncode() + this.f37213M.getBidToken();
        }
        C14202a c14202aM42516a = C14203b.getInstance().m42516a(getUnitId(), str);
        if (c14202aM42516a != null) {
            c14202aM42516a.m42473A();
            this.f37247l0 = true;
            C13219q0.m37816b(TAG, "CDRate is : " + i3 + " and start download !");
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i, int i2) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        C13219q0.m37818c("errorstr", str);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i) {
        MediaEvents mediaEvents = this.f37255s;
        if (mediaEvents != null) {
            try {
                mediaEvents.start(i, this.f37234f ? 1.0f : 0.0f);
            } catch (IllegalArgumentException e) {
                C13219q0.m37813a("omsdk", e.getMessage());
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        try {
            this.f37232e = z;
            if (this.f37225a0 == EnumC13418s.VIDEO) {
                setIsFrontDesk(z);
            }
            m38863r();
            requestLayout();
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        C13219q0.m37816b(TAG, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            C13374d.m38666a(obj, "params is null");
            return;
        }
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextM36542d == null) {
            try {
                if ((obj instanceof C13387a) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                    contextM36542d = windVaneWebView.getContext();
                }
            } catch (Exception e) {
                C13219q0.m37816b(TAG, e.getMessage());
            }
        }
        if (contextM36542d == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                C12684c.m34659c(contextM36542d, strOptString);
            } else if (iOptInt == 2) {
                C12684c.m34661e(contextM36542d, strOptString);
            }
        } catch (JSONException e2) {
            C13219q0.m37816b(TAG, e2.getMessage());
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    public void setAllowLoopPlay(boolean z) {
        this.f37226b = z;
    }

    public void setAllowScreenChange(boolean z) {
        this.f37228c = z;
    }

    public void setAllowVideoRefresh(boolean z) {
        this.f37224a = z;
    }

    public void setFollowActivityOrientation(boolean z) {
        this.f37243j0 = z;
    }

    public void setFullScreenViewBackgroundColor(int i) {
        this.f37256t = i;
    }

    public void setIsAllowFullScreen(boolean z) {
        this.f37230d = z;
    }

    public void setNativeAd(Campaign campaign) {
        String str;
        if (campaign == null) {
            return;
        }
        try {
            CampaignEx campaignEx = this.f37213M;
            if (campaignEx == null || campaignEx != campaign) {
                m38777M();
                m38859p();
                CampaignEx campaignEx2 = (CampaignEx) campaign;
                this.f37213M = campaignEx2;
                if (campaignEx2.getMediaViewHolder() == null) {
                    CampaignEx.C13065b c13065b = new CampaignEx.C13065b();
                    c13065b.f35622a = this.f37213M.getAdvImpList();
                    this.f37213M.setMediaViewHolder(c13065b);
                }
                if (this.f37213M.getAdType() == 94 || this.f37213M.getAdType() == 287) {
                    str = this.f37213M.getRequestId() + this.f37213M.getId() + this.f37213M.getVideoUrlEncode();
                } else {
                    str = this.f37213M.getId() + this.f37213M.getVideoUrlEncode() + this.f37213M.getBidToken();
                }
                this.f37223W = C14203b.getInstance().m42516a(getUnitId(), str);
                if (this.f37251o) {
                    if (this.f37253q != null) {
                        MediaViewPlayerView mediaViewPlayerView = this.f37258v;
                        if (mediaViewPlayerView != null) {
                            mediaViewPlayerView.unregisterView();
                        }
                        this.f37253q.finish();
                        this.f37253q = null;
                    }
                    if (this.f37255s != null) {
                        this.f37255s = null;
                    }
                    if (this.f37254r != null) {
                        this.f37254r = null;
                    }
                }
                CampaignEx campaignEx3 = this.f37213M;
                if (campaignEx3 != null && campaignEx3.isActiveOm()) {
                    this.f37253q = C13439b.m38946a(getContext(), TextUtils.isEmpty(this.f37213M.getVideoUrlEncode()), this.f37213M.getOmid(), this.f37213M.getRequestId(), this.f37213M.getId(), getUnitId(), "", this.f37213M.getRequestIdNotice());
                }
                if (this.f37251o) {
                    m38778N();
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    public void setOnMediaViewListener(OnMBMediaViewListener onMBMediaViewListener) {
        this.f37227b0 = onMBMediaViewListener;
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
    }

    public void setProgressVisibility(boolean z) {
        this.f37244k = z;
        MediaViewPlayerView mediaViewPlayerView = this.f37258v;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showProgressView(z);
        }
    }

    public void setSoundIndicatorVisibility(boolean z) {
        this.f37246l = z;
        MediaViewPlayerView mediaViewPlayerView = this.f37258v;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showSoundIndicator(z);
        }
    }

    public void setVideoSoundOnOff(boolean z) {
        this.f37234f = z;
        MediaViewPlayerView mediaViewPlayerView = this.f37258v;
        if (mediaViewPlayerView != null) {
            if (z) {
                mediaViewPlayerView.openSound();
            } else {
                mediaViewPlayerView.closeSound();
            }
        }
    }

    public void showEndCardWebViewCloseBtn() {
        ImageView imageView = this.f37239h0;
        if (imageView == null || imageView.getVisibility() == 0) {
            return;
        }
        this.f37239h0.setVisibility(0);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str).optInt("state", 1);
                } catch (Exception e) {
                    C13219q0.m37816b(TAG, e.getMessage());
                }
            }
            C13219q0.m37816b(TAG, "SHOW CLOSE BTN ");
            showEndCardWebViewCloseBtn();
            C13392f.m38726a().m38731b(obj, m38800a(0));
        } catch (Exception e2) {
            C13219q0.m37816b(TAG, e2.getMessage());
            C13392f.m38726a().m38729a(obj, m38800a(1));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            exitFullScreen();
            C13392f.m38726a().m38731b(obj, m38800a(0));
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
            C13392f.m38726a().m38729a(obj, m38800a(1));
        }
    }

    public void updateViewManger(boolean z) {
        C13436a c13436aM38928a = C13436a.m38928a(getContext());
        if (c13436aM38928a != null) {
            try {
                c13436aM38928a.m38933a(this.f37205E);
                c13436aM38928a.m38937a(z, !this.f37258v.isComplete(), this.f37205E);
                c13436aM38928a.m38936a(z, this.f37205E, this.f37231d0);
            } catch (NullPointerException e) {
                e.printStackTrace();
                return;
            }
        }
        BaseView baseView = this.f37205E;
        if (!(baseView instanceof MBridgeTopFullView) || c13436aM38928a == null) {
            return;
        }
        c13436aM38928a.m38935a(!z, baseView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public void m38752A() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f37258v;
            if (mediaViewPlayerView != null && mediaViewPlayerView.hasPrepare() && this.f37258v.isPlaying()) {
                m38878z();
            }
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: B */
    private void m38754B() {
        try {
            SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
            this.f37221U = sensorManager;
            this.f37222V = sensorManager.getDefaultSensor(1);
            C13422w c13422w = new C13422w(this, null);
            this.f37220T = c13422w;
            this.f37221U.registerListener(c13422w, this.f37222V, 2);
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: C */
    private void m38756C() {
        Handler handler = this.f37212L;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: D */
    private void m38759D() {
        if (this.f37213M.isReportClick()) {
            return;
        }
        this.f37213M.setReportClick(true);
        CampaignEx campaignEx = this.f37213M;
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || this.f37213M.getNativeVideoTracking().m36901i() == null) {
            return;
        }
        Context context = getContext();
        CampaignEx campaignEx2 = this.f37213M;
        C12682a.m34607a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.f37213M.getNativeVideoTracking().m36901i(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public void m38760E() {
        CampaignEx campaignEx = this.f37213M;
        if (campaignEx == null || campaignEx.getMediaViewHolder() == null) {
            return;
        }
        C13008c.m36588n().m36527a(getContext());
        C13341b.m38566a(this.f37213M, getContext(), getUnitId(), (C13339a) null);
        CampaignEx.C13065b mediaViewHolder = this.f37213M.getMediaViewHolder();
        if (!mediaViewHolder.f35633l && this.f37225a0 == EnumC13418s.VIDEO && C13182a1.m37597b(this.f37213M.getImpressionURL())) {
            mediaViewHolder.f35633l = true;
            String impressionURL = this.f37213M.getImpressionURL();
            if (!impressionURL.contains("is_video=1")) {
                StringBuilder sb = new StringBuilder(impressionURL);
                if (impressionURL.contains("?")) {
                    sb.append("&is_video=1");
                } else {
                    sb.append("?is_video=1");
                }
                impressionURL = sb.toString();
            }
            Context context = getContext();
            CampaignEx campaignEx2 = this.f37213M;
            C12682a.m34606a(context, campaignEx2, campaignEx2.getCampaignUnitId(), impressionURL, false, true, C12701a.f33766m);
        }
    }

    /* JADX INFO: renamed from: F */
    private void m38762F() {
        CampaignEx campaignEx = this.f37213M;
        if (campaignEx == null || campaignEx.getMediaViewHolder() == null || this.f37213M.getMediaViewHolder().f35626e || TextUtils.isEmpty(this.f37213M.getCampaignUnitId()) || this.f37213M.getNativeVideoTracking() == null || this.f37213M.getNativeVideoTracking().m36899h() == null) {
            return;
        }
        this.f37213M.getMediaViewHolder().f35626e = true;
        m38839f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public void m38764G() {
        CampaignEx.C13065b mediaViewHolder;
        CampaignEx campaignEx = this.f37213M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f35627f || this.f37213M.getNativeVideoTracking() == null || this.f37213M.getNativeVideoTracking().m36919r() == null) {
            return;
        }
        mediaViewHolder.f35627f = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.f37213M;
        C12682a.m34607a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.f37213M.getNativeVideoTracking().m36919r(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public void m38766H() {
        CampaignEx.C13065b mediaViewHolder;
        CampaignEx campaignEx = this.f37213M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f35628g || this.f37213M.getNativeVideoTracking() == null || this.f37213M.getNativeVideoTracking().m36921s() == null) {
            return;
        }
        mediaViewHolder.f35628g = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.f37213M;
        C12682a.m34607a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.f37213M.getNativeVideoTracking().m36921s(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public void m38768I() {
        CampaignEx campaignEx = this.f37213M;
        if (campaignEx == null || campaignEx.getMediaViewHolder() == null || this.f37213M.getMediaViewHolder().f35625d || TextUtils.isEmpty(this.f37213M.getCampaignUnitId()) || this.f37213M.getNativeVideoTracking() == null || this.f37213M.getNativeVideoTracking().m36911n() == null) {
            return;
        }
        this.f37213M.getMediaViewHolder().f35625d = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.f37213M;
        C12682a.m34607a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.f37213M.getNativeVideoTracking().m36911n(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public void m38770J() {
        CampaignEx.C13065b mediaViewHolder;
        CampaignEx campaignEx = this.f37213M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f35630i || this.f37213M.getNativeVideoTracking() == null || this.f37213M.getNativeVideoTracking().m36925u() == null) {
            return;
        }
        mediaViewHolder.f35630i = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.f37213M;
        C12682a.m34607a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.f37213M.getNativeVideoTracking().m36925u(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public void m38772K() {
        CampaignEx.C13065b mediaViewHolder;
        CampaignEx campaignEx = this.f37213M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f35631j || this.f37213M.getNativeVideoTracking() == null || this.f37213M.getNativeVideoTracking().m36929x() == null) {
            return;
        }
        mediaViewHolder.f35631j = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.f37213M;
        C12682a.m34607a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.f37213M.getNativeVideoTracking().m36929x(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public void m38774L() {
        CampaignEx.C13065b mediaViewHolder;
        CampaignEx campaignEx = this.f37213M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f35632k || this.f37213M.getNativeVideoTracking() == null || this.f37213M.getNativeVideoTracking().m36930y() == null) {
            return;
        }
        mediaViewHolder.f35632k = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.f37213M;
        C12682a.m34607a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.f37213M.getNativeVideoTracking().m36930y(), false, false);
    }

    /* JADX INFO: renamed from: M */
    private void m38777M() {
        this.f37232e = true;
        this.f37236g = true;
        this.f37238h = false;
        this.f37240i = false;
        this.f37242j = false;
        this.f37252p = false;
    }

    /* JADX INFO: renamed from: N */
    private void m38778N() {
        AdSession adSession;
        try {
            this.f37225a0 = m38799a(true);
            changeNoticeURL();
            EnumC13418s enumC13418s = this.f37225a0;
            if (enumC13418s == EnumC13418s.BIG_IMAGE) {
                CampaignEx campaignEx = this.f37213M;
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode()) && (adSession = this.f37253q) != null) {
                    try {
                        adSession.registerAdView(this.f37202B);
                        this.f37254r = AdEvents.createAdEvents(this.f37253q);
                        this.f37253q.start();
                        AdEvents adEvents = this.f37254r;
                        if (adEvents != null) {
                            adEvents.impressionOccurred();
                        }
                    } catch (Exception e) {
                        C13219q0.m37813a("omsdk", e.getMessage());
                    }
                }
                m38792V();
                m38844i();
            } else if (enumC13418s == EnumC13418s.VIDEO) {
                m38791U();
            } else if (enumC13418s == EnumC13418s.GIF) {
                m38846j();
                m38787R();
            }
            this.f37251o = true;
        } catch (Throwable th) {
            C13219q0.m37817b(TAG, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public void m38780O() {
        try {
            if (this.f37207G == null && this.f37239h0 == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 30.0f), C13229v0.m37876a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            if (this.f37231d0 == 0 && C13195f.m37673a(getContext())) {
                layoutParams.rightMargin = C13229v0.m37911c(getContext()) + C13229v0.m37876a(getContext(), 8.0f);
            } else {
                layoutParams.rightMargin = C13229v0.m37876a(getContext(), 8.0f);
            }
            layoutParams.topMargin = C13229v0.m37876a(getContext(), 8.0f);
            RelativeLayout relativeLayout = this.f37207G;
            if (relativeLayout != null) {
                relativeLayout.setLayoutParams(layoutParams);
            }
            ImageView imageView = this.f37239h0;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            updateViewManger(true);
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public void m38783P() {
        try {
            if (this.f37207G == null && this.f37239h0 == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 30.0f), C13229v0.m37876a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = C13229v0.m37876a(getContext(), 8.0f);
            layoutParams.rightMargin = C13229v0.m37876a(getContext(), 8.0f);
            RelativeLayout relativeLayout = this.f37207G;
            if (relativeLayout != null) {
                relativeLayout.setLayoutParams(layoutParams);
            }
            ImageView imageView = this.f37239h0;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            updateViewManger(false);
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: Q */
    private void m38784Q() {
        try {
            this.f37204D.setFocusableInTouchMode(true);
            this.f37204D.requestFocus();
            this.f37204D.setOnKeyListener(new ViewOnKeyListenerC13417r());
            this.f37204D.setOnClickListener(new ViewOnClickListenerC13400a());
            this.f37207G.setOnClickListener(new ViewOnClickListenerC13401b());
            CampaignEx campaignEx = this.f37213M;
            if (campaignEx != null) {
                C13185b1.m37632a(this.f37208H, campaignEx.getLocalRequestId(), this.f37213M.getLocalAllowTrackClick());
            }
            this.f37208H.setOnClickListener(new C13402c());
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public void m38787R() {
        m38794X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m38788S() {
        try {
            if (getVisibility() != 0) {
                return;
            }
            CampaignEx campaignEx = this.f37213M;
            if (C13200h.m37704b(campaignEx, this.f37245k0, this, campaignEx.getImpReportType())) {
                C13640l unitSetting = getUnitSetting();
                int i = 0;
                int iM39666s = unitSetting != null ? unitSetting.m39666s() : 0;
                CampaignEx campaignEx2 = this.f37213M;
                if (campaignEx2 == null || campaignEx2.getImpReportType() != 1) {
                    i = iM39666s;
                }
                Message messageObtainMessage = this.f37212L.obtainMessage();
                messageObtainMessage.what = 3;
                messageObtainMessage.obj = this;
                this.f37212L.sendMessageDelayed(messageObtainMessage, (i == 0 ? 0L : ((long) i) * 1000) + 300);
            }
            if (this.f37225a0 == EnumC13418s.VIDEO) {
                MediaViewPlayerView mediaViewPlayerView = this.f37258v;
                if (mediaViewPlayerView == null) {
                    m38817b();
                    return;
                }
                if (this.f37213M != mediaViewPlayerView.getCampaign()) {
                    this.f37258v.release();
                    m38817b();
                    if (getParent() != null) {
                        ((View) getParent()).invalidate();
                    }
                    requestLayout();
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    private void m38837e() {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f37227b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onVideoAdClicked(this.f37213M);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f37229c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoAdClicked(this.f37213M);
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: f */
    private void m38839f() {
        try {
            CampaignEx campaignEx = this.f37213M;
            if (campaignEx == null || campaignEx.getNativeVideoTracking() == null) {
                return;
            }
            String[] strArrM36899h = this.f37213M.getNativeVideoTracking().m36899h();
            int i = this.f37240i ? f37199n0 : f37200o0;
            for (String str : strArrM36899h) {
                if (!TextUtils.isEmpty(str)) {
                    Context context = getContext();
                    CampaignEx campaignEx2 = this.f37213M;
                    C12682a.m34605a(context, campaignEx2, campaignEx2.getCampaignUnitId(), str + "&orienation=" + i, false, false);
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m38840g() {
        try {
            FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(R.id.content);
            FrameLayout frameLayout2 = (FrameLayout) getRootView().findViewById(100);
            RelativeLayout relativeLayout = (RelativeLayout) getRootView().findViewById(101);
            RelativeLayout relativeLayout2 = (RelativeLayout) getRootView().findViewById(103);
            if (relativeLayout2 == null && relativeLayout != null) {
                relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(103);
            }
            RelativeLayout relativeLayout3 = (RelativeLayout) getRootView().findViewById(C13203i0.m37707a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            if (relativeLayout3 == null && relativeLayout2 != null) {
                relativeLayout3 = (RelativeLayout) relativeLayout2.findViewById(C13203i0.m37707a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            }
            RelativeLayout relativeLayout4 = (RelativeLayout) getRootView().findViewById(C13203i0.m37707a(getContext(), "mbridge_full_player_parent", "id"));
            if (relativeLayout4 == null && relativeLayout3 != null) {
                relativeLayout4 = (RelativeLayout) relativeLayout3.findViewById(C13203i0.m37707a(getContext(), "mbridge_full_player_parent", "id"));
            }
            ProgressBar progressBar = (ProgressBar) getRootView().findViewById(C13203i0.m37707a(getContext(), "mbridge_full_pb_loading", "id"));
            RelativeLayout relativeLayout5 = (RelativeLayout) getRootView().findViewById(C13203i0.m37707a(getContext(), "mbridge_full_rl_install", "id"));
            LinearLayout linearLayout = (LinearLayout) getRootView().findViewById(C13203i0.m37707a(getContext(), "mbridge_full_ll_pro_dur", "id"));
            ViewGroup viewGroup = frameLayout2 != null ? (ViewGroup) frameLayout2.getParent() : null;
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(linearLayout);
            } else if (linearLayout != null && linearLayout.getParent() != null) {
                ((ViewGroup) linearLayout.getParent()).removeView(linearLayout);
            }
            RelativeLayout relativeLayout6 = this.f37237g0;
            if (relativeLayout6 != null) {
                if (relativeLayout2 != null) {
                    relativeLayout2.removeView(relativeLayout6);
                } else if (relativeLayout6.getParent() != null) {
                    ((ViewGroup) this.f37237g0.getParent()).removeView(this.f37237g0);
                }
                this.f37201A.setBackListener(null);
                this.f37201A.setObject(null);
                this.f37201A = null;
                this.f37237g0 = null;
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(relativeLayout5);
            } else if (relativeLayout5 != null && relativeLayout5.getParent() != null) {
                ((ViewGroup) relativeLayout5.getParent()).removeView(relativeLayout5);
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(progressBar);
            } else if (progressBar != null && progressBar.getParent() != null) {
                ((ViewGroup) progressBar.getParent()).removeView(progressBar);
            }
            if (relativeLayout4 != null) {
                relativeLayout4.removeView(this.f37258v);
            }
            if (relativeLayout3 != null) {
                relativeLayout3.removeView(relativeLayout4);
            } else if (relativeLayout4 != null && relativeLayout4.getParent() != null) {
                ((ViewGroup) relativeLayout4.getParent()).removeView(relativeLayout4);
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(relativeLayout3);
            } else if (relativeLayout3 == null || relativeLayout3.getParent() == null) {
                BaseView baseView = this.f37205E;
                if (baseView != null) {
                    baseView.removeView(this.f37206F);
                }
            } else {
                ((ViewGroup) relativeLayout3.getParent()).removeView(relativeLayout3);
            }
            if (relativeLayout != null) {
                relativeLayout.removeView(relativeLayout2);
            } else if (relativeLayout2 == null || relativeLayout2.getParent() == null) {
                View view = this.f37204D;
                if (view != null) {
                    ((ViewGroup) view).removeView(this.f37205E);
                    ((ViewGroup) this.f37204D.getParent()).removeView(this.f37204D);
                }
            } else {
                ((ViewGroup) relativeLayout2.getParent()).removeView(relativeLayout2);
            }
            if (frameLayout != null) {
                if (relativeLayout != null) {
                    frameLayout.removeView(relativeLayout);
                } else {
                    frameLayout.removeView(this.f37204D);
                    if (this.f37204D.getParent() != null) {
                        ((ViewGroup) this.f37204D.getParent()).removeView(this.f37204D);
                        this.f37204D.setVisibility(8);
                    }
                }
            }
            setVisibility(0);
            requestLayout();
            if (viewGroup != null) {
                if (this.f37258v.getParent() != null && this.f37258v.getParent() != viewGroup) {
                    ((ViewGroup) this.f37258v.getParent()).removeView(this.f37258v);
                }
                viewGroup.addView(this.f37258v, this.f37211K);
                viewGroup.removeView(frameLayout2);
                viewGroup.invalidate();
            }
            m38834d();
            this.f37238h = false;
            MediaViewPlayerView mediaViewPlayerView = this.f37258v;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.setExitFullScreen();
                if (this.f37234f) {
                    this.f37258v.openSound();
                } else {
                    this.f37258v.closeSound();
                }
                this.f37258v.gonePauseView();
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: h */
    private void m38842h() {
        try {
            m38837e();
            if (this.f37213M != null && !C13182a1.m37596a(getUnitId())) {
                m38759D();
                C12682a c12682a = new C12682a(getContext(), getUnitId());
                c12682a.m34636a(new C13413n());
                c12682a.m34633a(this.f37213M);
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    private void m38844i() {
        try {
            CampaignEx campaignEx = this.f37213M;
            if (campaignEx == null) {
                return;
            }
            String imageUrl = campaignEx.getImageUrl();
            if (!C13182a1.m37596a(imageUrl) && getContext() != null) {
                C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(imageUrl, new C13411l());
            }
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: j */
    private void m38846j() {
        try {
            CampaignEx campaignEx = this.f37213M;
            if (campaignEx == null) {
                return;
            }
            String gifUrl = campaignEx.getGifUrl();
            if (!C13182a1.m37596a(gifUrl) && getContext() != null) {
                this.f37262z.loadDataWithBaseURL(null, "<!DOCTYPE html><html lang=\"en\"><head>  <meta charset=\"UTF-8\">  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">  <title>Document</title>  <style>  *{    margin: 0;    padding: 0;  }  html, body{    width: 100%;    height: 100%;  }  body{    background-image: url('gifUrl');    background-position: center;    background-size: contain;    background-repeat: no-repeat;  }  </style></head><body></body></html>".replace("gifUrl", gifUrl), "text/html", C11341A5.f23802O, null);
                this.f37262z.setInterceptTouch(true);
                CampaignEx campaignEx2 = this.f37213M;
                if (campaignEx2 != null) {
                    C13185b1.m37632a(this.f37261y, campaignEx2.getLocalRequestId(), this.f37213M.getLocalAllowTrackClick());
                }
                this.f37261y.setOnClickListener(new C13412m());
            }
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: k */
    private boolean m38849k() {
        try {
            this.f37206F = this.f37205E.getMBridgeFullPlayContainer();
            this.f37210J = this.f37205E.getMBridgeFullPlayerParent();
            this.f37207G = this.f37205E.getMBridgeFullClose();
            this.f37208H = this.f37205E.getMBridgeFullTvInstall();
            this.f37209I = this.f37205E.getMBridgeFullPb();
            return true;
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m38851l() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f37258v;
            if (mediaViewPlayerView == null) {
                return;
            }
            mediaViewPlayerView.onClickPlayerView();
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m38853m() {
        try {
            ProgressBar progressBar = this.f37209I;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m38854n() {
        try {
            ProgressBar progressBar = this.f37203C;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m38856o() {
        int i;
        int i2;
        int i3;
        try {
            if (this.f37225a0 != EnumC13418s.BIG_IMAGE || (i = this.f37215O) == 0 || (i2 = this.f37219S) == 0 || (i3 = this.f37218R) == 0) {
                return;
            }
            int i4 = (i * i2) / i3;
            MyImageView myImageView = this.f37202B;
            if (myImageView == null || i4 == 0) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) myImageView.getLayoutParams();
            layoutParams.width = this.f37215O;
            layoutParams.height = i4;
            this.f37202B.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: p */
    private void m38859p() {
        try {
            this.f37240i = C13229v0.m37936i(getContext()) >= C13229v0.m37933h(getContext());
            this.f37242j = this.f37240i;
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public View m38860q() {
        try {
            this.f37237g0 = new RelativeLayout(getContext());
            this.f37237g0.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            ImageView imageView = new ImageView(getContext());
            this.f37239h0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 30.0f), C13229v0.m37876a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = C13229v0.m37876a(getContext(), 8.0f);
            layoutParams.rightMargin = C13229v0.m37876a(getContext(), 8.0f);
            this.f37239h0.setLayoutParams(layoutParams);
            this.f37239h0.setBackgroundResource(C13203i0.m37707a(getContext(), "mbridge_nativex_close", "drawable"));
            this.f37239h0.setOnClickListener(new ViewOnClickListenerC13416q());
            this.f37201A.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f37237g0.addView(this.f37201A);
            this.f37237g0.addView(this.f37239h0);
            return this.f37237g0;
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    private void m38863r() {
        try {
            if (this.f37238h) {
                MediaViewPlayerView mediaViewPlayerView = this.f37258v;
                if (mediaViewPlayerView == null) {
                    C13219q0.m37816b(TAG, "fullscreen playerview is null return");
                    return;
                }
                if (!this.f37232e) {
                    mediaViewPlayerView.pause();
                    return;
                }
                if (mediaViewPlayerView.isPlaying()) {
                    C13219q0.m37818c(TAG, "fullscreen windowfocuse true isPlaying do nothing return");
                    return;
                }
                MediaViewPlayerView mediaViewPlayerView2 = this.f37258v;
                if (mediaViewPlayerView2 == null || mediaViewPlayerView2.isComplete() || this.f37258v.getIsActiviePause()) {
                    return;
                }
                this.f37258v.onClickPlayButton();
            }
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: s */
    private void m38864s() {
        try {
            m38859p();
            m38804a(this.f37206F, getAllScreenWidth(), getAllScreenHeight());
            C13436a.m38928a(getContext()).m38934a(this.f37205E, this.f37240i);
            if (this.f37240i) {
                m38780O();
            } else {
                m38783P();
            }
            this.f37212L.postDelayed(new RunnableC13403d(), 3000L);
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: t */
    private void m38866t() {
        this.f37212L = new HandlerC13409j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m38869u() {
        try {
            if (this.f37225a0 != EnumC13418s.VIDEO || this.f37259w == null) {
                return;
            }
            int allScreenWidth = (int) getAllScreenWidth();
            int iM37933h = C13229v0.m37933h(getContext());
            if (this.f37238h) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f37206F.getLayoutParams();
                layoutParams.width = allScreenWidth;
                layoutParams.height = iM37933h;
                layoutParams.addRule(13);
                this.f37206F.setLayoutParams(layoutParams);
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f37259w.getLayoutParams();
                layoutParams2.width = this.f37215O;
                layoutParams2.height = this.f37214N;
                layoutParams2.addRule(13);
                this.f37259w.setLayoutParams(layoutParams2);
            }
            m38788S();
            if (this.f37238h) {
                m38804a(this.f37258v, allScreenWidth, iM37933h);
            } else {
                m38804a(this.f37258v, this.f37215O, this.f37214N);
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: v */
    private void m38870v() {
        String[] strArrSplit;
        try {
            CampaignEx campaignEx = this.f37213M;
            if (campaignEx == null || C13182a1.m37596a(campaignEx.getVideoResolution()) || (strArrSplit = this.f37213M.getVideoResolution().split("x")) == null || strArrSplit.length != 2) {
                return;
            }
            String str = strArrSplit[0];
            String str2 = strArrSplit[1];
            double dM37946m = C13229v0.m37946m(str);
            double dM37946m2 = C13229v0.m37946m(str2);
            if (dM37946m <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || dM37946m2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            this.f37216P = dM37946m;
            this.f37217Q = dM37946m2;
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: w */
    private void m38873w() {
        int iM37707a = C13203i0.m37707a(getContext(), "mbridge_nativex_mbmediaview", "layout");
        if (!C13203i0.m37709a(iM37707a)) {
            C13219q0.m37816b(TAG, "can not find mediaview resource");
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(iM37707a, (ViewGroup) null);
        this.f37260x = (RelativeLayout) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_rl_mediaview_root", "id"));
        this.f37259w = (RelativeLayout) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_ll_playerview_container", "id"));
        this.f37202B = (MyImageView) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_my_big_img", "id"));
        this.f37203C = (ProgressBar) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_native_pb", "id"));
        this.f37261y = (RelativeLayout) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_nativex_webview_layout", "id"));
        this.f37262z = (WindVaneWebViewForNV) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_nativex_webview_layout_webview", "id"));
        this.f37260x.setClickable(true);
        addView(viewInflate, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m38874x() {
        RelativeLayout relativeLayout;
        int i;
        int i2;
        try {
            if (this.f37225a0 == EnumC13418s.GIF) {
                int i3 = this.f37215O;
                if (i3 == 0 || (i = this.f37219S) == 0 || (i2 = this.f37218R) == 0) {
                    if (i3 == 0 || (relativeLayout = this.f37261y) == null) {
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                    int i4 = this.f37215O;
                    layoutParams.width = i4;
                    layoutParams.height = (i4 * LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED) / InterfaceC11669Sd.c.f25686d;
                    layoutParams.addRule(13);
                    this.f37261y.setLayoutParams(layoutParams);
                    return;
                }
                int i5 = (i3 * i) / i2;
                RelativeLayout relativeLayout2 = this.f37261y;
                if (relativeLayout2 == null || i5 == 0) {
                    return;
                }
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams();
                layoutParams2.width = this.f37215O;
                layoutParams2.height = i5;
                layoutParams2.addRule(13);
                this.f37261y.setLayoutParams(layoutParams2);
            }
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m38876y() {
        try {
            C13640l unitSetting = getUnitSetting();
            if (unitSetting == null) {
                return false;
            }
            int iM39615L = unitSetting.m39615L();
            if (iM39615L == 1) {
                return C13229v0.m37949n(getContext());
            }
            if (iM39615L == 2) {
                return false;
            }
            if (iM39615L == 3) {
                return !C13223s0.m37831a().m37842a("s_a_w_n_c", true) || C13229v0.m37944l(getContext());
            }
            return C13229v0.m37949n(getContext());
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: z */
    private void m38878z() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f37258v;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.pause();
            }
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    public void setOnMediaViewListener(OnMBMediaViewListenerPlus onMBMediaViewListenerPlus) {
        this.f37229c0 = onMBMediaViewListenerPlus;
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$u */
    private static final class C13420u implements InterfaceC13398a {

        /* JADX INFO: renamed from: a */
        WeakReference<BaseMBMediaView> f37288a;

        public C13420u(BaseMBMediaView baseMBMediaView) {
            this.f37288a = new WeakReference<>(baseMBMediaView);
        }

        @Override // com.mbridge.msdk.nativex.listener.InterfaceC13398a
        /* JADX INFO: renamed from: a */
        public void mo38745a() {
            BaseMBMediaView baseMBMediaView = this.f37288a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.m38772K();
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.InterfaceC13398a
        /* JADX INFO: renamed from: b */
        public void mo38747b() {
            BaseMBMediaView baseMBMediaView = this.f37288a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.m38764G();
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.InterfaceC13398a
        /* JADX INFO: renamed from: c */
        public void mo38749c() {
            BaseMBMediaView baseMBMediaView = this.f37288a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.m38766H();
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.InterfaceC13398a
        /* JADX INFO: renamed from: d */
        public void mo38750d() {
            BaseMBMediaView baseMBMediaView = this.f37288a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.m38770J();
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.InterfaceC13398a
        /* JADX INFO: renamed from: a */
        public void mo38746a(String str) {
            BaseMBMediaView baseMBMediaView = this.f37288a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.m38881a(str);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.InterfaceC13398a
        /* JADX INFO: renamed from: b */
        public void mo38748b(String str) {
            BaseMBMediaView baseMBMediaView = this.f37288a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.m38882b(str);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m38834d() {
        try {
            this.f37258v.showSoundIndicator(this.f37246l);
            this.f37258v.showProgressView(this.f37244k);
            OnMBMediaViewListener onMBMediaViewListener = this.f37227b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onExitFullscreen();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f37229c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onExitFullscreen();
            }
            MediaEvents mediaEvents = this.f37255s;
            if (mediaEvents != null) {
                mediaEvents.playerStateChange(PlayerState.NORMAL);
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    private void m38826c() {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f37227b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onEnterFullscreen();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f37229c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onEnterFullscreen();
            }
            MediaEvents mediaEvents = this.f37255s;
            if (mediaEvents != null) {
                mediaEvents.playerStateChange(PlayerState.FULLSCREEN);
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private void m38819b(Context context) {
        try {
            m38866t();
            m38873w();
            this.f37245k0 = context;
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38810a(Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f37227b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onFinishRedirection(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f37229c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onFinishRedirection(campaign, str);
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m38821b(Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f37227b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onRedirectionFailed(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f37229c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onRedirectionFailed(campaign, str);
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m38828c(Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f37227b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onStartRedirection(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f37229c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onStartRedirection(campaign, str);
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m38881a(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f37250n.contains(str)) {
                return;
            }
            this.f37250n.add(str);
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f37229c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoComplete();
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    protected void m38882b(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f37248m.contains(str)) {
                return;
            }
            this.f37248m.add(str);
            OnMBMediaViewListener onMBMediaViewListener = this.f37227b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onVideoStart();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f37229c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoStart();
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m38829c(String str) {
        String str2;
        C13080n c13080n;
        try {
            C13026n c13026nM36744a = C13026n.m36744a(C13017g.m36693a(getContext()));
            if (!TextUtils.isEmpty(this.f37213M.getNoticeUrl())) {
                int iM37770s = C13211m0.m37770s(getContext());
                str2 = str;
                c13080n = new C13080n("2000021", iM37770s, this.f37213M.getNoticeUrl(), str2, C13211m0.m37732a(getContext(), iM37770s));
            } else {
                str2 = str;
                if (TextUtils.isEmpty(this.f37213M.getClickURL())) {
                    c13080n = null;
                } else {
                    int iM37770s2 = C13211m0.m37770s(getContext());
                    c13080n = new C13080n("2000021", iM37770s2, this.f37213M.getClickURL(), str2, C13211m0.m37732a(getContext(), iM37770s2));
                }
            }
            if (c13080n == null) {
                str2 = str2;
                return;
            }
            str2 = str2;
            c13080n.m36962b(this.f37213M.getId());
            c13080n.m37006v(this.f37213M.getVideoUrlEncode());
            c13080n.m36988m(str2);
            c13080n.m36990n(this.f37213M.getRequestId());
            c13080n.m36992o(this.f37213M.getRequestIdNotice());
            c13080n.m37004u(getUnitId());
            c13026nM36744a.m36745a(c13080n);
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38803a(Context context) {
        m38842h();
    }

    /* JADX INFO: renamed from: a */
    private EnumC13418s m38799a(boolean z) {
        try {
            CampaignEx campaignEx = this.f37213M;
            if (campaignEx != null) {
                if (C13182a1.m37596a(campaignEx.getVideoUrlEncode())) {
                    EnumC13418s enumC13418s = C13182a1.m37597b(this.f37213M.getImageUrl()) ? EnumC13418s.BIG_IMAGE : null;
                    if (C13182a1.m37597b(this.f37213M.getGifUrl())) {
                        if (C13182a1.m37596a(this.f37213M.getImageUrl())) {
                            enumC13418s = EnumC13418s.GIF;
                        }
                        this.f37262z.setWebViewClient(new C13424y(this));
                        m38846j();
                    }
                    return enumC13418s;
                }
                if (this.f37236g && this.f37223W != null) {
                    if (C13182a1.m37597b(this.f37213M.getVideoUrlEncode()) && C13182a1.m37596a(this.f37213M.getImageUrl())) {
                        return EnumC13418s.VIDEO;
                    }
                    if (C13182a1.m37597b(this.f37213M.getVideoUrlEncode()) && C13182a1.m37597b(this.f37213M.getImageUrl())) {
                        if (C14213l.m42590a(this.f37223W, getReadyRate())) {
                            return EnumC13418s.VIDEO;
                        }
                        EnumC13418s enumC13418s2 = EnumC13418s.BIG_IMAGE;
                        if (z && this.f37224a) {
                            this.f37223W.m42484b(new C13423x(this));
                        }
                        return enumC13418s2;
                    }
                } else {
                    return EnumC13418s.BIG_IMAGE;
                }
            }
            return null;
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
            return EnumC13418s.BIG_IMAGE;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m38817b() {
        try {
            if (this.f37213M == null) {
                C13219q0.m37818c(TAG, "campaign is null addPlayerView return");
            }
            MediaViewPlayerView mediaViewPlayerView = this.f37258v;
            if (mediaViewPlayerView != null && mediaViewPlayerView.getParent() != null) {
                ((ViewGroup) this.f37258v.getParent()).removeView(this.f37258v);
            }
            m38796Z();
            MediaViewPlayerView mediaViewPlayerView2 = new MediaViewPlayerView(getContext());
            this.f37258v = mediaViewPlayerView2;
            mediaViewPlayerView2.showProgressView(this.f37244k);
            this.f37258v.showSoundIndicator(this.f37246l);
            if (this.f37234f) {
                this.f37258v.openSound();
            } else {
                this.f37258v.closeSound();
            }
            this.f37258v.setAllowLoopPlay(this.f37226b);
            try {
                this.f37258v.initPlayerViewData(getPlayUrl(), this.f37213M, m38876y(), this, this.f37223W, getUnitId());
                this.f37258v.setOnMediaViewPlayerViewListener(new C13420u(this));
                this.f37259w.addView(this.f37258v, -1, -1);
                m38790T();
                AdSession adSession = this.f37253q;
                if (adSession != null) {
                    MediaViewPlayerView mediaViewPlayerView3 = this.f37258v;
                    if (mediaViewPlayerView3 != null) {
                        mediaViewPlayerView3.registerView(adSession);
                    }
                    this.f37254r = AdEvents.createAdEvents(this.f37253q);
                    this.f37255s = MediaEvents.createMediaEvents(this.f37253q);
                    this.f37253q.start();
                    this.f37254r.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                    MediaViewPlayerView mediaViewPlayerView4 = this.f37258v;
                    if (mediaViewPlayerView4 != null) {
                        mediaViewPlayerView4.setVideoEvents(this.f37255s);
                    }
                    try {
                        AdEvents adEvents = this.f37254r;
                        if (adEvents != null) {
                            adEvents.impressionOccurred();
                        }
                    } catch (Exception e) {
                        C13219q0.m37813a("omsdk", e.getMessage());
                    }
                }
            } catch (Throwable th) {
                th = th;
                C13219q0.m37816b(TAG, th.getMessage());
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m38830c(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m38811a(View view) {
        try {
            CampaignEx campaignEx = this.f37213M;
            return !C13194e1.m37670a(view, campaignEx == null ? 0 : campaignEx.getImpReportType());
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m38818b(int i) {
        CampaignEx.C13065b mediaViewHolder;
        Map<Integer, String> map;
        try {
            CampaignEx campaignEx = this.f37213M;
            if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f35623b || (map = mediaViewHolder.f35622a) == null || map.size() <= 0) {
                return;
            }
            Map<Integer, String> map2 = mediaViewHolder.f35622a;
            Iterator<Map.Entry<Integer, String>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, String> next = it.next();
                Integer key = next.getKey();
                String value = next.getValue();
                if (i >= key.intValue() && !TextUtils.isEmpty(value)) {
                    Context context = getContext();
                    CampaignEx campaignEx2 = this.f37213M;
                    C12682a.m34605a(context, campaignEx2, campaignEx2.getCampaignUnitId(), value, false, false);
                    it.remove();
                }
            }
            if (map2.size() <= 0) {
                mediaViewHolder.f35623b = true;
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private void m38822b(boolean z) {
        try {
            int nvT2 = this.f37213M.getNvT2();
            if (this.f37201A == null) {
                WindVaneWebViewForNV windVaneWebViewForNV = new WindVaneWebViewForNV(getContext());
                this.f37201A = windVaneWebViewForNV;
                windVaneWebViewForNV.setObject(this);
                this.f37201A.setBackListener(new C13404e());
                this.f37201A.setWebViewListener(new C13405f());
            }
            if (nvT2 != 3) {
                if (nvT2 == 4) {
                    this.f37235f0 = true;
                    CampaignEx campaignEx = this.f37213M;
                    if (campaignEx != null) {
                        C13168a c13168a = new C13168a(campaignEx);
                        c13168a.m37548a(this.f37213M.getAppName());
                        this.f37201A.setDownloadListener(c13168a);
                        this.f37201A.setFilter(new C13421v(null));
                        return;
                    }
                    return;
                }
                return;
            }
            String str = this.f37213M.getendcard_url();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f37213M.getMediaViewHolder();
            if (str.contains(".zip") && str.contains(ResourceManager.KEY_MD5FILENAME)) {
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
                if (C13182a1.m37597b(h5ResAddress)) {
                    this.f37235f0 = true;
                    this.f37201A.loadUrl(h5ResAddress);
                    return;
                }
                return;
            }
            String htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(str);
            if (C13182a1.m37597b(htmlContentFromUrl)) {
                C13219q0.m37813a(TAG, "load html...");
                this.f37235f0 = true;
                this.f37201A.loadDataWithBaseURL(str, htmlContentFromUrl, "text/html", "UTF-8", null);
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m38880a() {
        WindowInsets rootWindowInsets;
        CampaignEx campaignEx;
        try {
            if (getRootView() != null && (getRootView() instanceof ViewGroup)) {
                BaseView.EnumC13435a enumC13435aHandleViewStyleResult = handleViewStyleResult(getContext());
                if (enumC13435aHandleViewStyleResult == null) {
                    return;
                }
                BaseView fullScreenViewByStyle = getFullScreenViewByStyle(getContext(), enumC13435aHandleViewStyleResult);
                this.f37205E = fullScreenViewByStyle;
                if (fullScreenViewByStyle != null && m38849k()) {
                    C13436a c13436aM38928a = C13436a.m38928a(getContext());
                    BaseView baseView = this.f37205E;
                    c13436aM38928a.m38932a(baseView.style, this.f37213M, baseView);
                    this.f37238h = true;
                    this.f37252p = false;
                    MediaViewPlayerView mediaViewPlayerView = this.f37258v;
                    if (mediaViewPlayerView != null) {
                        mediaViewPlayerView.setEnterFullScreen();
                        this.f37258v.setIsActivePause(false);
                    }
                    m38826c();
                    FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(R.id.content);
                    RelativeLayout relativeLayout = new RelativeLayout(getContext());
                    this.f37204D = relativeLayout;
                    relativeLayout.setClickable(true);
                    ViewGroup viewGroup = (ViewGroup) this.f37258v.getParent();
                    int childCount = viewGroup.getChildCount();
                    int i = 0;
                    while (i < childCount && viewGroup.getChildAt(i) != this.f37258v) {
                        i++;
                    }
                    this.f37211K = i;
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    frameLayout2.setId(100);
                    viewGroup.addView(frameLayout2, i, new ViewGroup.LayoutParams(getWidth(), getHeight()));
                    viewGroup.removeView(this.f37258v);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    relativeLayout.setId(101);
                    new RelativeLayout.LayoutParams(-1, -1);
                    this.f37210J.addView(this.f37258v, new RelativeLayout.LayoutParams(-1, -1));
                    if (this.f37210J != null && (campaignEx = this.f37213M) != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                        try {
                            MBAdChoice mBAdChoice = new MBAdChoice(C13008c.m36588n().m36542d());
                            mBAdChoice.setCampaign(this.f37213M);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C13229v0.m37876a(C13008c.m36588n().m36542d(), 12.0f), C13229v0.m37876a(C13008c.m36588n().m36542d(), 12.0f));
                            layoutParams2.addRule(11);
                            layoutParams2.addRule(12);
                            this.f37210J.addView(mBAdChoice, layoutParams2);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (this.f37257u) {
                        m38805a(frameLayout);
                    }
                    frameLayout.addView(relativeLayout, layoutParams);
                    int i2 = C13408i.f37271a[this.f37205E.style.ordinal()] != 2 ? ViewCompat.MEASURED_STATE_MASK : -1;
                    int i3 = this.f37256t;
                    if (i3 != 0) {
                        relativeLayout.setBackgroundColor(i3);
                    } else {
                        relativeLayout.setBackgroundColor(i2);
                    }
                    this.f37205E.setId(103);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                    int[] iArr = new int[2];
                    frameLayout.getLocationInWindow(iArr);
                    int i4 = iArr[1];
                    this.f37231d0 = i4;
                    if (i4 == 0 && (rootWindowInsets = getRootWindowInsets()) != null) {
                        layoutParams3.setMargins(0, rootWindowInsets.getStableInsetTop(), 0, 0);
                    }
                    relativeLayout.addView(this.f37205E, layoutParams3);
                    m38864s();
                    m38784Q();
                    MediaViewPlayerView mediaViewPlayerView2 = this.f37258v;
                    if (mediaViewPlayerView2 != null) {
                        mediaViewPlayerView2.openSound();
                        MediaViewPlayerView mediaViewPlayerView3 = this.f37258v;
                        mediaViewPlayerView3.setMediaViewPlayListener(new C13415p(mediaViewPlayerView3));
                    }
                    m38822b(false);
                    m38762F();
                    return;
                }
                return;
            }
            C13219q0.m37818c(TAG, "rootView is null");
        } catch (Exception e2) {
            C13219q0.m37816b(TAG, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38805a(FrameLayout frameLayout) {
        BitmapDrawable bitmapDrawableM36524a;
        if (frameLayout == null || (bitmapDrawableM36524a = C13008c.m36588n().m36524a(getUnitId(), this.f37213M.getAdType())) == null) {
            return;
        }
        ImageView imageView = new ImageView(C13008c.m36588n().m36542d());
        C13229v0.m37880a(imageView, bitmapDrawableM36524a, getResources().getDisplayMetrics());
        this.f37205E.addView(imageView, new RelativeLayout.LayoutParams(-1, -1));
        AdSession adSession = this.f37253q;
        if (adSession != null) {
            adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38804a(View view, float f, float f2) {
        if (view == null) {
            return;
        }
        try {
            double d = this.f37216P;
            double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                double d3 = this.f37217Q;
                if (d3 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    double d4 = d / d3;
                    if (f > 0.0f && f2 > 0.0f) {
                        d2 = f / f2;
                    }
                    double dM37873a = C13229v0.m37873a(Double.valueOf(d4));
                    double dM37873a2 = C13229v0.m37873a(Double.valueOf(d2));
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f37259w.getLayoutParams();
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    boolean z = m38830c(getContext()) && this.f37240i;
                    int i = -1;
                    if (dM37873a > dM37873a2) {
                        double d5 = (((double) f) * this.f37217Q) / this.f37216P;
                        layoutParams2.width = -1;
                        if (!z) {
                            i = (int) d5;
                        }
                        layoutParams2.height = i;
                        layoutParams2.addRule(13);
                        layoutParams.width = this.f37215O;
                        layoutParams.height = (int) d5;
                        layoutParams.addRule(13);
                    } else if (dM37873a < dM37873a2) {
                        double d6 = ((double) f2) * d4;
                        layoutParams2.width = z ? -1 : (int) d6;
                        layoutParams2.height = -1;
                        layoutParams2.addRule(13);
                        layoutParams.width = (int) d6;
                        layoutParams.height = this.f37214N;
                        layoutParams.addRule(13);
                    } else {
                        layoutParams2.width = -1;
                        layoutParams2.height = -1;
                        layoutParams.width = this.f37215O;
                        layoutParams.height = this.f37214N;
                        layoutParams.addRule(13);
                    }
                    if (!this.f37238h) {
                        this.f37259w.setLayoutParams(layoutParams);
                    }
                    view.setLayoutParams(layoutParams2);
                    return;
                }
            }
            setPlayViewParamsDefault(view);
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38802a(int i, int i2) {
        CampaignEx.C13065b mediaViewHolder;
        try {
            CampaignEx campaignEx = this.f37213M;
            if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f35629h || i2 == 0) {
                return;
            }
            List<Map<Integer, String>> listM36922t = this.f37213M.getNativeVideoTracking().m36922t();
            int i3 = ((i + 1) * 100) / i2;
            if (listM36922t != null) {
                int i4 = 0;
                while (i4 < listM36922t.size()) {
                    Map<Integer, String> map = listM36922t.get(i4);
                    if (map != null && map.size() > 0) {
                        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<Integer, String> next = it.next();
                            int iIntValue = next.getKey().intValue();
                            String value = next.getValue();
                            if (iIntValue <= i3 && !TextUtils.isEmpty(value)) {
                                Context context = getContext();
                                CampaignEx campaignEx2 = this.f37213M;
                                C12682a.m34607a(context, campaignEx2, campaignEx2.getCampaignUnitId(), new String[]{value}, false, true);
                                it.remove();
                                listM36922t.remove(i4);
                                i4--;
                            }
                        }
                    }
                    i4++;
                }
                if (listM36922t.size() <= 0) {
                    mediaViewHolder.f35629h = true;
                }
            }
        } catch (Throwable unused) {
            C13219q0.m37816b(TAG, "reportPlayPercentageData error");
        }
    }

    /* JADX INFO: renamed from: a */
    private String m38800a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            C13219q0.m37816b(TAG, "code to string is error");
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private String m38801a(List<CampaignEx> list, String str, String str2) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            JSONArray camplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaignList", camplistToJson);
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("sdk_info", str2);
            return jSONObject.toString();
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
            return null;
        }
    }

    public BaseMBMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37224a = true;
        this.f37226b = true;
        this.f37228c = true;
        this.f37230d = true;
        this.f37232e = true;
        this.f37234f = false;
        this.f37236g = true;
        this.f37238h = false;
        this.f37240i = false;
        this.f37242j = false;
        this.f37244k = true;
        this.f37246l = true;
        this.f37248m = new ArrayList<>();
        this.f37250n = new ArrayList<>();
        this.f37251o = false;
        this.f37252p = false;
        this.f37253q = null;
        this.f37254r = null;
        this.f37255s = null;
        this.f37256t = 0;
        this.f37257u = false;
        this.f37223W = null;
        this.f37225a0 = null;
        this.f37233e0 = false;
        this.f37235f0 = false;
        this.f37243j0 = false;
        this.f37247l0 = false;
        this.f37249m0 = new RunnableC13407h();
        m38819b(context);
    }
}
