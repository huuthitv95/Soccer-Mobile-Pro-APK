package com.mbridge.msdk.splash.manager;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.click.InterfaceC12693j;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13078l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.same.C13092c;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13200h;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.omsdk.C13439b;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.splash.middle.C13664d;
import com.mbridge.msdk.splash.middle.InterfaceC13661a;
import com.mbridge.msdk.splash.report.C13665a;
import com.mbridge.msdk.splash.signal.C13678b;
import com.mbridge.msdk.splash.signal.C13679c;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b */
/* JADX INFO: compiled from: BaseSplashShowManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13655b {

    /* JADX INFO: renamed from: b */
    private CampaignEx f38196b;

    /* JADX INFO: renamed from: c */
    protected MBSplashView f38197c;

    /* JADX INFO: renamed from: d */
    protected C13664d f38198d;

    /* JADX INFO: renamed from: e */
    protected C12682a f38199e;

    /* JADX INFO: renamed from: f */
    private boolean f38200f;

    /* JADX INFO: renamed from: g */
    private TextView f38201g;

    /* JADX INFO: renamed from: h */
    private View f38202h;

    /* JADX INFO: renamed from: i */
    protected String f38203i;

    /* JADX INFO: renamed from: j */
    private String f38204j;

    /* JADX INFO: renamed from: k */
    protected MBridgeIds f38205k;

    /* JADX INFO: renamed from: q */
    protected boolean f38211q;

    /* JADX INFO: renamed from: r */
    private boolean f38212r;

    /* JADX INFO: renamed from: s */
    protected Context f38213s;

    /* JADX INFO: renamed from: u */
    private ImageView f38215u;

    /* JADX INFO: renamed from: v */
    private i f38216v;

    /* JADX INFO: renamed from: w */
    private AdSession f38217w;

    /* JADX INFO: renamed from: a */
    protected final String f38195a = "SplashShowManager";

    /* JADX INFO: renamed from: l */
    protected int f38206l = 5;

    /* JADX INFO: renamed from: m */
    protected String f38207m = "点击跳过|";

    /* JADX INFO: renamed from: n */
    protected String f38208n = "点击跳过|";

    /* JADX INFO: renamed from: o */
    protected String f38209o = "秒";

    /* JADX INFO: renamed from: p */
    protected String f38210p = "秒后自动关闭";

    /* JADX INFO: renamed from: t */
    protected boolean f38214t = true;

    /* JADX INFO: renamed from: x */
    private View.OnClickListener f38218x = new a();

    /* JADX INFO: renamed from: y */
    public Handler f38219y = new b(Looper.getMainLooper());

    /* JADX INFO: renamed from: z */
    private boolean f38220z = true;

    /* JADX INFO: renamed from: A */
    protected InterfaceC12693j f38194A = new e();

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$a */
    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C13655b.this.f38200f) {
                C13655b.this.m39861b(1);
                C13655b.this.m39848d(-1);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$b */
    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MBSplashView mBSplashView;
            MBSplashWebview splashWebview;
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                if (!C13655b.this.f38212r) {
                    C13655b.this.m39852i();
                }
                C13655b c13655b = C13655b.this;
                if (c13655b.f38206l <= 0) {
                    c13655b.m39861b(2);
                    return;
                }
                if (C13084b.f35793f) {
                    C13655b.this.m39866f();
                } else {
                    C13655b c13655b2 = C13655b.this;
                    if (c13655b2.f38211q) {
                        C13655b.this.m39866f();
                    } else {
                        int i2 = c13655b2.f38206l - 1;
                        c13655b2.f38206l = i2;
                        c13655b2.m39848d(i2);
                        C13655b c13655b3 = C13655b.this;
                        if (!c13655b3.f38214t) {
                            c13655b3.m39867g();
                        }
                    }
                }
                C13655b.this.f38219y.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            if (i != 2 || C13655b.this.f38196b == null || !C13655b.this.f38196b.isActiveOm() || (mBSplashView = C13655b.this.f38197c) == null || (splashWebview = mBSplashView.getSplashWebview()) == null) {
                return;
            }
            try {
                C13655b.this.f38217w = splashWebview.getAdSession();
                if (C13655b.this.f38217w != null) {
                    AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(C13655b.this.f38217w);
                    adEventsCreateAdEvents.loaded();
                    adEventsCreateAdEvents.impressionOccurred();
                }
                C13219q0.m37813a("OMSDK", "adSession.impressionOccurred()");
            } catch (Throwable th) {
                C13219q0.m37813a("OMSDK", th.getMessage());
                if (C13655b.this.f38196b != null) {
                    String requestId = C13655b.this.f38196b.getRequestId();
                    String requestIdNotice = C13655b.this.f38196b.getRequestIdNotice();
                    String id = C13655b.this.f38196b.getId();
                    new C13146h(splashWebview.getContext()).m37370a(requestId, requestIdNotice, id, C13655b.this.f38203i, "fetch OM failed, exception" + th.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$c */
    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    /* JADX INFO: loaded from: classes9.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13655b.this.m39854k();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$d */
    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    class d implements InterfaceC13083a {
        d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            String string;
            C13655b.this.m39866f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b("SplashShowManager", th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) C13655b.this.f38197c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            String string;
            C13655b.this.m39867g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b("SplashShowManager", th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) C13655b.this.f38197c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            String string;
            C13655b.this.m39867g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b("SplashShowManager", th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) C13655b.this.f38197c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$e */
    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    class e implements InterfaceC12693j {
        e() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            C13227u0.m37860a(campaign, C13655b.this.f38197c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            C13227u0.m37860a(campaign, C13655b.this.f38197c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            C13227u0.m37863b(campaign, C13655b.this.f38197c);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$f */
    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f38226a;

        f(int i) {
            this.f38226a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13655b.this.m39834a(this.f38226a);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$g */
    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f38228a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f38229b;

        g(Context context, CampaignEx campaignEx) {
            this.f38228a = context;
            this.f38229b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13020j.m36706a(C13017g.m36693a(this.f38228a)).m36709b(this.f38229b.getId());
            } catch (Exception unused) {
                C13219q0.m37816b("SplashShowManager", "campain can't insert db");
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$h */
    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    class h implements InterfaceC13083a {
        h() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            C13655b.this.m39866f();
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            C13655b.this.m39867g();
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            C13655b.this.m39867g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$i */
    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    private class i implements InterfaceC13661a {
        private i() {
        }

        /* synthetic */ i(C13655b c13655b, a aVar) {
            this();
        }

        @Override // com.mbridge.msdk.splash.middle.InterfaceC13661a
        /* JADX INFO: renamed from: a */
        public void mo39869a(int i) {
            C13219q0.m37816b("SplashShowManager", "resetCountdown" + i);
            C13655b c13655b = C13655b.this;
            c13655b.f38206l = i;
            c13655b.f38219y.removeMessages(1);
            C13655b.this.f38219y.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.mbridge.msdk.splash.middle.InterfaceC13661a
        /* JADX INFO: renamed from: a */
        public void mo39870a(int i, int i2) {
            if (i == 1) {
                C13655b.this.f38219y.removeMessages(1);
            }
            if (i == 2) {
                C13655b c13655b = C13655b.this;
                c13655b.f38206l = i2;
                c13655b.f38219y.removeMessages(1);
                C13655b.this.f38219y.sendEmptyMessageDelayed(1, 1000L);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.InterfaceC13661a
        /* JADX INFO: renamed from: a */
        public void mo39871a(CampaignEx campaignEx) {
            C13655b.this.mo39862b(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.splash.middle.InterfaceC13661a
        /* JADX INFO: renamed from: a */
        public void mo39872a(boolean z) {
            if (z) {
                C13655b.this.f38219y.removeMessages(1);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.InterfaceC13661a
        /* JADX INFO: renamed from: a */
        public void mo39873a(boolean z, String str) {
            try {
                if (C13655b.this.f38198d != null) {
                    if (TextUtils.isEmpty(str)) {
                        C13655b c13655b = C13655b.this;
                        c13655b.f38198d.m40011a(c13655b.f38205k);
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(C13655b.this.f38196b));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    C13655b.this.mo39862b(campaignWithBackData, true, str);
                }
            } catch (Exception e) {
                C13219q0.m37816b("SplashShowManager", e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.splash.middle.InterfaceC13661a
        public void close() {
            C13655b.this.m39861b(1);
        }

        @Override // com.mbridge.msdk.splash.middle.InterfaceC13661a
        public void toggleCloseBtn(int i) {
            MBSplashView mBSplashView = C13655b.this.f38197c;
            if (mBSplashView != null) {
                mBSplashView.changeCloseBtnState(i);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.InterfaceC13661a
        public void triggerCloseBtn(Object obj, String str) {
            C13655b.this.m39861b(1);
        }
    }

    public C13655b(Context context, String str, String str2) {
        this.f38203i = str2;
        this.f38204j = str;
        this.f38205k = new MBridgeIds(str, str2);
        this.f38213s = context;
        if (this.f38201g == null) {
            TextView textView = new TextView(context);
            this.f38201g = textView;
            textView.setGravity(1);
            this.f38201g.setTextIsSelectable(false);
            this.f38201g.setPadding(C13229v0.m37876a(context, 5.0f), C13229v0.m37876a(context, 5.0f), C13229v0.m37876a(context, 5.0f), C13229v0.m37876a(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f38201g.getLayoutParams();
            this.f38201g.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(C13229v0.m37876a(context, 100.0f), C13229v0.m37876a(context, 50.0f)) : layoutParams);
            m39850e();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39833a() {
        RelativeLayout.LayoutParams layoutParams;
        CampaignEx campaignEx = this.f38196b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f38203i);
            C13084b.m37036b().m37040a(this.f38203i, 3);
            C13084b.m37036b().m37046a(this.f38203i, this.f38196b);
        }
        if (C13084b.m37036b().m37050a()) {
            MBSplashView mBSplashView = this.f38197c;
            if (mBSplashView == null || !mBSplashView.isDynamicView()) {
                C13084b.m37036b().m37047a(this.f38203i, new d());
                FeedBackButton feedBackButtonM37039a = C13084b.m37036b().m37039a(this.f38203i);
                if (feedBackButtonM37039a != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) feedBackButtonM37039a.getLayoutParams();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        layoutParams = null;
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(C13084b.f35792e, C13084b.f35791d);
                    }
                    layoutParams.topMargin = C13229v0.m37876a(C13008c.m36588n().m36542d(), 10.0f);
                    layoutParams.leftMargin = C13229v0.m37876a(C13008c.m36588n().m36542d(), 10.0f);
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonM37039a.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(feedBackButtonM37039a);
                    }
                    MBSplashView mBSplashView2 = this.f38197c;
                    if (mBSplashView2 != null) {
                        mBSplashView2.addView(feedBackButtonM37039a, layoutParams);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39834a(int i2) {
        MBSplashView mBSplashView;
        try {
            C13664d c13664d = this.f38198d;
            if (c13664d != null) {
                c13664d.m40012a(this.f38205k, i2);
                this.f38198d = null;
                C13665a.m40026a(this.f38203i, this.f38196b);
            }
            ImageView imageView = this.f38215u;
            if (imageView != null && imageView.getParent() != null && (mBSplashView = this.f38197c) != null) {
                mBSplashView.removeView(this.f38215u);
                this.f38215u.setVisibility(8);
            }
            this.f38212r = false;
            C13665a.m40025a(this.f38203i, i2, this.f38196b);
            Handler handler = this.f38219y;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e2) {
            C13219q0.m37816b("SplashShowManager", e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39835a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f38218x);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39836a(CampaignEx campaignEx) {
        m39842b(campaignEx, C13008c.m36588n().m36542d(), this.f38203i);
        m39837a(campaignEx, C13008c.m36588n().m36542d(), this.f38203i);
        m39845c(campaignEx, C13008c.m36588n().m36542d(), this.f38203i);
        campaignEx.setReport(true);
        C13091b.m37104a(this.f38203i, campaignEx, "splash");
    }

    /* JADX INFO: renamed from: a */
    private void m39837a(CampaignEx campaignEx, Context context, String str) {
        C13008c.m36588n().m36527a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new g(context, campaignEx)).start();
            C12682a.m34606a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, C12701a.f33766m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m36915p() == null) {
            return;
        }
        C12682a.m34607a(context, campaignEx, str, campaignEx.getNativeVideoTracking().m36915p(), false, false);
    }

    /* JADX INFO: renamed from: a */
    private void m39839a(String str) {
        C13664d c13664d = this.f38198d;
        if (c13664d != null) {
            c13664d.m40015a(this.f38205k, "web show failed:" + str);
        }
        MBSplashView mBSplashView = this.f38197c;
        if (mBSplashView == null || mBSplashView.getParent() == null || !(this.f38197c.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.f38197c.getParent()).removeView(this.f38197c);
    }

    /* JADX INFO: renamed from: b */
    private void m39841b(CampaignEx campaignEx) {
        if (campaignEx.isHasMBTplMark()) {
            return;
        }
        m39837a(campaignEx, C13008c.m36588n().m36542d(), this.f38203i);
        campaignEx.setReport(true);
        C13091b.m37104a(this.f38203i, campaignEx, "splash");
        m39842b(campaignEx, C13008c.m36588n().m36542d(), this.f38203i);
        m39845c(campaignEx, C13008c.m36588n().m36542d(), this.f38203i);
    }

    /* JADX INFO: renamed from: b */
    private void m39842b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                C12682a.m34606a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, C12701a.f33767n);
            } catch (Throwable th) {
                C13219q0.m37816b("SplashShowManager", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m39845c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx2 = campaignEx;
                    Context context2 = context;
                    String str2 = str;
                    C12682a.m34605a(context2, campaignEx2, str2, it.next(), false, true);
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Throwable th) {
                C13219q0.m37816b("SplashShowManager", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m39848d(int i2) {
        MBSplashView mBSplashView = this.f38197c;
        if (mBSplashView != null) {
            mBSplashView.updateCountdown(i2);
            if (this.f38197c.getSplashSignalCommunicationImpl() != null) {
                this.f38197c.getSplashSignalCommunicationImpl().m40070c(i2);
            }
        }
        if (i2 < 0) {
            this.f38206l = i2;
            return;
        }
        C13664d c13664d = this.f38198d;
        if (c13664d != null) {
            c13664d.m40014a(this.f38205k, i2 * 1000);
        }
        if (this.f38202h == null) {
            m39853j();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m39850e() {
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (contextM36542d != null) {
            String strM36550i = C13008c.m36588n().m36550i();
            int identifier = contextM36542d.getResources().getIdentifier("mbridge_splash_count_time_can_skip", TypedValues.Custom.S_STRING, strM36550i);
            int identifier2 = contextM36542d.getResources().getIdentifier("mbridge_splash_count_time_can_skip_not", TypedValues.Custom.S_STRING, strM36550i);
            int identifier3 = contextM36542d.getResources().getIdentifier("mbridge_splash_count_time_can_skip_s", TypedValues.Custom.S_STRING, strM36550i);
            this.f38208n = contextM36542d.getResources().getString(identifier);
            String string = contextM36542d.getResources().getString(identifier2);
            this.f38210p = string;
            this.f38207m = string;
            this.f38209o = contextM36542d.getResources().getString(identifier3);
            this.f38201g.setBackgroundResource(contextM36542d.getResources().getIdentifier("mbridge_splash_close_bg", "drawable", C13008c.m36588n().m36550i()));
            this.f38201g.setTextColor(contextM36542d.getResources().getColor(contextM36542d.getResources().getIdentifier("mbridge_splash_count_time_skip_text_color", "color", strM36550i)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public synchronized void m39852i() {
        MBSplashView mBSplashView;
        if (this.f38196b == null) {
            return;
        }
        this.f38212r = true;
        if (this.f38198d != null && (mBSplashView = this.f38197c) != null) {
            if (mBSplashView.getContext() != null && (this.f38197c.getContext() instanceof Activity) && ((Activity) this.f38197c.getContext()).isFinishing()) {
                C13219q0.m37813a("SplashShowManager", "Activity is finishing");
            }
            if (this.f38197c.isShown()) {
                this.f38198d.m40016b(this.f38205k);
            } else {
                this.f38198d.m40015a(this.f38205k, "SplashView or container is not visibility");
            }
        }
        if (!this.f38196b.isReport()) {
            MBSplashView mBSplashView2 = this.f38197c;
            if (mBSplashView2 == null || mBSplashView2.isDynamicView()) {
                m39836a(this.f38196b);
            } else {
                m39841b(this.f38196b);
            }
            C13665a.m40019a(C13008c.m36588n().m36542d(), this.f38196b, this.f38203i);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m39853j() {
        String str;
        if (this.f38200f) {
            str = this.f38208n + this.f38206l + this.f38209o;
        } else {
            str = this.f38206l + this.f38210p;
        }
        this.f38201g.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m39854k() {
        MBSplashView mBSplashView;
        MBSplashWebview splashWebview;
        View splashWebview2 = this.f38197c.getSplashWebview();
        if (splashWebview2 == null) {
            splashWebview2 = this.f38197c.getSplashNativeView();
        }
        C13078l c13078lM37697a = C13200h.m37697a(splashWebview2, this.f38196b.getImpReportType());
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f38196b);
        if (c13078lM37697a.m36937a()) {
            C13200h.m37698a(arrayList, c13078lM37697a);
        } else if (this.f38220z) {
            this.f38220z = false;
            this.f38197c.postDelayed(new c(), 200L);
            return;
        } else {
            C13200h.m37698a(arrayList, c13078lM37697a);
            if (this.f38196b.getLocalCheckShow() == 1) {
                m39839a("ad env is not available");
                return;
            }
        }
        CampaignEx campaignEx = this.f38196b;
        if (campaignEx != null && campaignEx.isActiveOm() && (mBSplashView = this.f38197c) != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            try {
                AdSession adSessionM38945a = C13439b.m38945a(C13008c.m36588n().m36542d(), splashWebview, splashWebview.getUrl(), this.f38196b);
                this.f38217w = adSessionM38945a;
                if (adSessionM38945a != null) {
                    splashWebview.setAdSession(adSessionM38945a);
                    this.f38217w.registerAdView(splashWebview);
                    this.f38217w.start();
                }
                C13219q0.m37813a("OMSDK", "adSession.start()");
            } catch (Throwable th) {
                C13219q0.m37813a("OMSDK", th.getMessage());
                CampaignEx campaignEx2 = this.f38196b;
                if (campaignEx2 != null) {
                    String requestId = campaignEx2.getRequestId();
                    String requestIdNotice = this.f38196b.getRequestIdNotice();
                    String id = this.f38196b.getId();
                    new C13146h(splashWebview.getContext()).m37370a(requestId, requestIdNotice, id, this.f38203i, "fetch OM failed, exception" + th.getMessage());
                }
            }
        }
        C13657d.m39886b(this.f38203i);
        this.f38219y.removeMessages(1);
        this.f38219y.sendEmptyMessageDelayed(1, 1000L);
        this.f38219y.sendEmptyMessageDelayed(2, 1000L);
        m39860b();
        if (!this.f38196b.isMraid()) {
            m39833a();
        }
        C12684c.m34654a(C13008c.m36588n().m36542d(), this.f38196b.getMaitve(), this.f38196b.getMaitve_src());
        try {
            BitmapDrawable bitmapDrawableM36524a = C13008c.m36588n().m36524a(this.f38203i, this.f38196b.getAdType());
            if (bitmapDrawableM36524a != null) {
                if (this.f38215u == null) {
                    this.f38215u = new ImageView(C13008c.m36588n().m36542d());
                }
                if (this.f38215u.getVisibility() != 0) {
                    this.f38215u.setVisibility(0);
                }
                C13229v0.m37880a(this.f38215u, bitmapDrawableM36524a, this.f38197c.getResources().getDisplayMetrics());
                if (this.f38215u.getParent() == null) {
                    this.f38197c.addView(this.f38215u, new ViewGroup.LayoutParams(-1, -1));
                }
                AdSession adSession = this.f38217w;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(this.f38215u, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39855a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f38218x);
        }
        this.f38202h = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public void m39856a(CampaignEx campaignEx, MBSplashView mBSplashView) {
        m39859a(this.f38200f);
        this.f38196b = campaignEx;
        this.f38197c = mBSplashView;
        C13678b splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl();
        if (splashSignalCommunicationImpl == null) {
            splashSignalCommunicationImpl = new C13678b(mBSplashView.getContext(), this.f38204j, this.f38203i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            splashSignalCommunicationImpl.m40067a(arrayList);
        }
        splashSignalCommunicationImpl.m40069b(this.f38206l);
        splashSignalCommunicationImpl.m40063a(this.f38200f ? 1 : 0);
        if (this.f38216v == null) {
            this.f38216v = new i(this, null);
        }
        splashSignalCommunicationImpl.m40065a(this.f38216v);
        mBSplashView.setSplashSignalCommunicationImpl(splashSignalCommunicationImpl);
        boolean zIsHasMBTplMark = campaignEx.isHasMBTplMark();
        View view = this.f38202h;
        if (view == null) {
            if (zIsHasMBTplMark) {
                this.f38201g.setVisibility(8);
            }
            m39853j();
            m39835a(this.f38201g);
            mBSplashView.setCloseView(this.f38201g);
        } else {
            if (zIsHasMBTplMark) {
                view.setVisibility(8);
            }
            m39835a(this.f38202h);
            mBSplashView.setCloseView(this.f38202h);
        }
        C13185b1.m37633a(mBSplashView.getSplashWebview() != null ? mBSplashView.getSplashWebview() : mBSplashView.getSplashNativeView(), this.f38196b.getLocalRequestId(), this.f38196b.getLocalAllowTrackClick(), mBSplashView.getAllowClickSplashTouchListener());
        mBSplashView.show(campaignEx);
        this.f38220z = true;
        m39854k();
    }

    /* JADX INFO: renamed from: a */
    protected void m39857a(CampaignEx campaignEx, boolean z, String str) {
        if (this.f38199e == null) {
            C12682a c12682a = new C12682a(C13008c.m36588n().m36542d(), this.f38203i);
            this.f38199e = c12682a;
            c12682a.m34632a(this.f38194A);
        }
        campaignEx.setCampaignUnitId(this.f38203i);
        this.f38199e.m34633a(campaignEx);
        if (!this.f38196b.isReportClick()) {
            this.f38196b.setReportClick(true);
            C13665a.m40018a(C13008c.m36588n().m36542d(), campaignEx);
        }
        C13664d c13664d = this.f38198d;
        if (c13664d != null) {
            c13664d.m40011a(this.f38205k);
            m39861b(3);
        }
        if (!z || TextUtils.isEmpty(str)) {
            return;
        }
        C13665a.m40024a(campaignEx, this.f38203i, str);
    }

    /* JADX INFO: renamed from: a */
    public void m39858a(C13664d c13664d) {
        this.f38198d = c13664d;
    }

    /* JADX INFO: renamed from: a */
    public void m39859a(boolean z) {
        this.f38200f = z;
        if (z) {
            this.f38207m = this.f38208n;
        } else {
            this.f38207m = this.f38210p;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m39860b() {
        MBSplashView mBSplashView;
        Context context;
        CampaignEx campaignEx = this.f38196b;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() != 1 || (mBSplashView = this.f38197c) == null || mBSplashView.getSplashWebview() == null || this.f38197c.isDynamicView() || !this.f38196b.isMraid() || (context = this.f38197c.getContext()) == null) {
            return;
        }
        try {
            int iM37707a = C13203i0.m37707a(context, "mbridge_splash_notice", "drawable");
            int iM37876a = C13229v0.m37876a(context, 35.0f);
            int iM37876a2 = C13229v0.m37876a(context, 9.0f);
            ImageView imageView = new ImageView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM37876a, iM37876a);
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            layoutParams.setMargins(iM37876a2, iM37876a2, iM37876a2, iM37876a2);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackgroundResource(iM37707a);
            C13229v0.m37892a(3, imageView, this.f38196b, context, true, new h());
            this.f38197c.addView(imageView);
        } catch (Throwable th) {
            C13219q0.m37816b("SplashShowManager", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    protected void m39861b(int i2) {
        CampaignEx campaignEx;
        MBSplashWebview splashWebview;
        MBSplashView mBSplashView = this.f38197c;
        if (mBSplashView != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            splashWebview.finishAdSession();
        }
        if (this.f38219y == null || (campaignEx = this.f38196b) == null || !campaignEx.isActiveOm()) {
            m39834a(i2);
        } else {
            this.f38219y.postDelayed(new f(i2), 1500L);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo39862b(CampaignEx campaignEx, boolean z, String str) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public String m39863c() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f38196b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return C13092c.m37122b(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public void m39864c(int i2) {
        this.f38206l = i2;
    }

    /* JADX INFO: renamed from: d */
    public String m39865d() {
        CampaignEx campaignEx = this.f38196b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f38196b.getRequestId();
    }

    /* JADX INFO: renamed from: f */
    public void m39866f() {
        Handler handler;
        this.f38214t = false;
        if (this.f38197c != null && this.f38206l > 0 && (handler = this.f38219y) != null) {
            handler.removeMessages(1);
        }
        MBSplashView mBSplashView = this.f38197c;
        if (mBSplashView != null) {
            mBSplashView.onPause();
            MBSplashWebview splashWebview = this.f38197c.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestoryed()) {
                return;
            }
            C13679c.m40078a(splashWebview, "onSystemPause", "");
        }
    }

    /* JADX INFO: renamed from: g */
    public void m39867g() {
        MBSplashView mBSplashView;
        Handler handler;
        this.f38214t = true;
        if (this.f38197c != null && this.f38206l > 0 && (handler = this.f38219y) != null) {
            handler.removeMessages(1);
            View splashWebview = this.f38197c.getSplashWebview();
            if (splashWebview == null) {
                splashWebview = this.f38197c.getSplashNativeView();
            }
            CampaignEx campaignEx = this.f38196b;
            if (campaignEx != null ? C13200h.m37704b(campaignEx, null, splashWebview, campaignEx.getImpReportType()) : true) {
                this.f38219y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
        if (C13084b.f35793f || (mBSplashView = this.f38197c) == null) {
            return;
        }
        mBSplashView.onResume();
        MBSplashWebview splashWebview2 = this.f38197c.getSplashWebview();
        if (splashWebview2 == null || splashWebview2.isDestoryed()) {
            return;
        }
        C13679c.m40078a(splashWebview2, "onSystemPause", "");
    }

    /* JADX INFO: renamed from: h */
    public void m39868h() {
        if (this.f38198d != null) {
            this.f38198d = null;
        }
        if (this.f38216v != null) {
            this.f38216v = null;
        }
        if (this.f38218x != null) {
            this.f38218x = null;
        }
        MBSplashView mBSplashView = this.f38197c;
        if (mBSplashView != null) {
            mBSplashView.destroy();
        }
        C13084b.m37036b().m37054d(this.f38203i);
    }
}
