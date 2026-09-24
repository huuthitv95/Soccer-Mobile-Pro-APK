package com.bytedance.sdk.component.jbs;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.jbs.p157lr.C2639ri;
import com.bytedance.sdk.component.jbs.p158ri.C2642ri;
import com.bytedance.sdk.component.utils.C2709ay;
import com.bytedance.sdk.component.utils.C2735zf;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.model.AdPayload;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.jbs.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2634di extends FrameLayout {

    /* JADX INFO: renamed from: jc */
    private static ka f7411jc;

    /* JADX INFO: renamed from: ac */
    private boolean f7412ac;

    /* JADX INFO: renamed from: aw */
    private boolean f7413aw;

    /* JADX INFO: renamed from: ay */
    private boolean f7414ay;
    private volatile WebView bgr;

    /* JADX INFO: renamed from: bu */
    private C2640ri f7415bu;

    /* JADX INFO: renamed from: co */
    private long f7416co;

    /* JADX INFO: renamed from: di */
    private JSONObject f7417di;

    /* JADX INFO: renamed from: dw */
    private float f7418dw;
    private Context dzy;
    private long feb;

    /* JADX INFO: renamed from: fi */
    private String f7419fi;

    /* JADX INFO: renamed from: fr */
    private WebViewClient f7420fr;
    private lr hcw;

    /* JADX INFO: renamed from: ig */
    private AtomicBoolean f7421ig;
    private float igq;
    private boolean ihz;

    /* JADX INFO: renamed from: ik */
    public int f7422ik;
    private float jbs;

    /* JADX INFO: renamed from: ka */
    private C2639ri f7423ka;

    /* JADX INFO: renamed from: kt */
    private long f7424kt;

    /* JADX INFO: renamed from: lr */
    public int f7425lr;

    /* JADX INFO: renamed from: mj */
    private float f7426mj;

    /* JADX INFO: renamed from: nr */
    private List<String> f7427nr;

    /* JADX INFO: renamed from: oh */
    private C2709ay f7428oh;
    private int ory;

    /* JADX INFO: renamed from: pv */
    private AtomicBoolean f7429pv;

    /* JADX INFO: renamed from: qd */
    private AtomicBoolean f7430qd;

    /* JADX INFO: renamed from: qt */
    private long f7431qt;

    /* JADX INFO: renamed from: ri */
    public int f7432ri;

    /* JADX INFO: renamed from: sf */
    private long f7433sf;
    private C2640ri.ri slm;
    private fi srn;

    /* JADX INFO: renamed from: su */
    private ik f7434su;
    private C2637ka tan;

    /* JADX INFO: renamed from: uq */
    private boolean f7435uq;

    /* JADX INFO: renamed from: vr */
    private View f7436vr;
    private boolean wjv;

    /* JADX INFO: renamed from: xd */
    private AttributeSet f7437xd;
    private boolean xha;

    /* JADX INFO: renamed from: zf */
    private float f7438zf;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.jbs.di$fi */
    public interface fi {
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.jbs.di$ik */
    public enum ik {
        ADS(AbstractC13068b.JSON_KEY_ADS),
        ADS_V3("ads_v3"),
        ENDCARD(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD),
        USER_AGENT(C11540L6.f24966d0),
        PLAYABLE("playable"),
        DSP("dsp"),
        PRIVACY(ShareConstants.WEB_DIALOG_PARAM_PRIVACY),
        VAST_ENDCARD("vast_endcard"),
        EASY_PLAYABLE("easy_playable"),
        LANDING_PAGE("landing_page"),
        LANDING_PAGE_LOADING("lp_loading"),
        LANDING_PAGE_PRE_RENDER("lp_pre_render");


        /* JADX INFO: renamed from: aw */
        public final String f7450aw;

        ik(String str) {
            this.f7450aw = str;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.jbs.di$ka */
    public interface ka {
        /* JADX INFO: renamed from: ri */
        WebView mo9791ri(Context context, AttributeSet attributeSet, int i, ik ikVar);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.jbs.di$lr */
    public interface lr {
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.jbs.di$ri */
    public static class ri extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.jbs.di.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
    }

    public C2634di(Context context, ik ikVar) {
        this(m9764ri(context), false, ikVar);
    }

    public C2634di(Context context, boolean z, ik ikVar) {
        super(m9764ri(context));
        this.f7426mj = 0.0f;
        this.jbs = 0.0f;
        this.f7431qt = 0L;
        this.f7433sf = 0L;
        this.f7416co = 0L;
        this.f7413aw = false;
        this.igq = 20.0f;
        this.f7418dw = 50.0f;
        this.f7429pv = new AtomicBoolean();
        this.f7421ig = new AtomicBoolean();
        this.f7430qd = new AtomicBoolean();
        this.dzy = context;
        this.f7434su = ikVar;
        if (z) {
            return;
        }
        try {
            this.bgr = m9765ri((AttributeSet) null, 0);
            m9772di();
        } catch (Throwable unused) {
        }
        m9762lr(m9764ri(context));
    }

    /* JADX INFO: renamed from: ac */
    private void m9759ac() {
        try {
            WebSettings settings = this.bgr.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void ihz() {
        if (this.f7428oh == null) {
            this.f7430qd.set(false);
            this.f7428oh = new C2709ay(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.jbs.di.1
        };
        this.f7430qd.set(true);
    }

    /* JADX INFO: renamed from: ik */
    private static void m9760ik(Context context) {
    }

    /* JADX INFO: renamed from: ik */
    private static boolean m9761ik(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m9762lr(Context context) {
        m9760ik(context);
        m9759ac();
        tan();
    }

    /* JADX INFO: renamed from: lr */
    private static boolean m9763lr(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ri */
    private static Context m9764ri(Context context) {
        return context;
    }

    /* JADX INFO: renamed from: ri */
    private WebView m9765ri(AttributeSet attributeSet, int i) {
        ka kaVar = f7411jc;
        if (kaVar != null) {
            return kaVar.mo9791ri(getContext(), attributeSet, i, this.f7434su);
        }
        return attributeSet == null ? new WebView(m9764ri(this.dzy)) : new WebView(m9764ri(this.dzy), attributeSet);
    }

    /* JADX INFO: renamed from: ri */
    private void m9766ri(MotionEvent motionEvent) {
        if (!this.xha || this.f7423ka == null) {
            return;
        }
        if ((this.f7419fi == null && this.f7417di == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f7426mj = motionEvent.getRawX();
                this.jbs = motionEvent.getRawY();
                this.f7431qt = System.currentTimeMillis();
                this.f7417di = new JSONObject();
                if (this.bgr != null) {
                    this.f7424kt = this.f7431qt;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.f7417di.put("start_x", String.valueOf(this.f7426mj));
                this.f7417di.put("start_y", String.valueOf(this.jbs));
                this.f7417di.put("offset_x", String.valueOf(motionEvent.getRawX() - this.f7426mj));
                this.f7417di.put("offset_y", String.valueOf(motionEvent.getRawY() - this.jbs));
                this.f7417di.put("url", String.valueOf(getUrl()));
                this.f7417di.put(ViewHierarchyConstants.TAG_KEY, "");
                this.f7433sf = System.currentTimeMillis();
                if (this.bgr != null) {
                    this.feb = this.f7433sf;
                }
                this.f7417di.put("down_time", this.f7431qt);
                this.f7417di.put("up_time", this.f7433sf);
                if (C2642ri.m9829ri().m9830lr() != null) {
                    long j = this.f7416co;
                    long j2 = this.f7431qt;
                    if (j != j2) {
                        this.f7416co = j2;
                        C2642ri.m9829ri().m9830lr().mo9826ri(this.f7423ka, this.f7419fi, "in_web_click", this.f7417di, this.f7433sf - this.f7431qt);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.bgr.getSettings()) != null) {
                if (Uri.parse(str).getScheme().equalsIgnoreCase(C11744X3.i.f26356b)) {
                    settings.setJavaScriptEnabled(false);
                } else {
                    settings.setJavaScriptEnabled(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void setWebViewProvider(ka kaVar) {
        f7411jc = kaVar;
    }

    private void tan() {
        if (this.bgr == null) {
            return;
        }
        try {
            this.bgr.removeJavascriptInterface("searchBoxJavaBridge_");
            this.bgr.removeJavascriptInterface("accessibility");
            this.bgr.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a_ */
    public void m9767a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.bgr.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: aw */
    public void m9768aw() {
        if (this.bgr != null) {
            this.bgr.onResume();
        }
    }

    /* JADX INFO: renamed from: b_ */
    public void m9769b_(String str) {
        try {
            this.bgr.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void bgr() {
        try {
            this.bgr.clearHistory();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: bu */
    public void m9770bu() {
        try {
            this.bgr.clearView();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: co */
    public void m9771co() {
        try {
            this.bgr.goForward();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.bgr == null) {
            return;
        }
        try {
            this.bgr.computeScroll();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: di */
    public void m9772di() {
        if (this.bgr != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.bgr.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.bgr, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: fi */
    public void m9773fi() {
        try {
            if (this.bgr == null) {
                this.bgr = m9765ri(this.f7437xd, 0);
            }
            m9772di();
            m9762lr(m9764ri(this.dzy));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public View getArbitrageLoadingView() {
        return this.f7436vr;
    }

    public int getContentHeight() {
        if (this.bgr == null) {
            return 0;
        }
        try {
            return this.bgr.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.f7424kt;
    }

    public long getLandingPageClickEnd() {
        return this.feb;
    }

    public C2639ri getMaterialMeta() {
        return this.f7423ka;
    }

    public String getOriginalUrl() {
        String url;
        if (this.bgr == null) {
            return null;
        }
        try {
            String originalUrl = this.bgr.getOriginalUrl();
            return (originalUrl == null || !originalUrl.startsWith("data:text/html") || (url = this.bgr.getUrl()) == null || !url.startsWith(AdPayload.FILE_SCHEME)) ? originalUrl : url;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.bgr == null) {
            return 0;
        }
        try {
            return this.bgr.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public ik getScene() {
        return this.f7434su;
    }

    @Override // android.view.View
    public String getTag() {
        return this.f7419fi;
    }

    public String getUrl() {
        if (this.bgr == null) {
            return null;
        }
        try {
            return this.bgr.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.bgr == null) {
            return "";
        }
        try {
            return this.bgr.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.bgr;
    }

    public WebViewClient getWebViewClient() {
        return this.f7420fr;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m9774ik() {
        return this.f7435uq;
    }

    public boolean jbs() {
        if (this.bgr == null) {
            return false;
        }
        try {
            return this.bgr.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k_ */
    public boolean m9775k_() {
        return this.f7412ac;
    }

    /* JADX INFO: renamed from: ka */
    public boolean m9776ka() {
        return this.wjv;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m9777lr() {
        return this.ihz;
    }

    /* JADX INFO: renamed from: mj */
    public void m9778mj() {
        try {
            this.bgr.reload();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: nr */
    public void m9779nr() {
        try {
            this.bgr.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7429pv.set(true);
        if (!this.f7421ig.get() || this.f7430qd.get()) {
            return;
        }
        ihz();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7429pv.set(false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentM9781ri;
        try {
            m9766ri(motionEvent);
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.f7413aw && (viewParentM9781ri = m9781ri(this)) != null) {
                viewParentM9781ri.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    /* JADX INFO: renamed from: qt */
    public void m9780qt() {
        try {
            this.bgr.goBack();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.bgr.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ri */
    protected ViewParent m9781ri(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (m9763lr(view2) || m9761ik(view2)) ? parent : m9781ri(view2);
    }

    /* JADX INFO: renamed from: ri */
    public void m9782ri(int i, long j) {
        if (this.bgr == null || !(this.bgr instanceof C2635fi)) {
            return;
        }
        this.tan = new C2637ka(this.dzy, this.f7415bu, i, j, this);
        if (!TextUtils.isEmpty(this.f7419fi)) {
            this.tan.m9798ri(this.f7419fi);
        }
        ((C2635fi) this.bgr).setTouchListenerProxy(this.tan);
    }

    /* JADX INFO: renamed from: ri */
    public void m9783ri(Object obj, String str) {
        try {
            this.bgr.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m9784ri(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.bgr.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m9785ri(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.bgr.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m9786ri(boolean z) {
        try {
            this.bgr.clearCache(z);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m9787ri(boolean z, int i, int i2, List<Integer> list, int i3, List<String> list2) {
        if (z && this.bgr != null && (this.bgr instanceof C2635fi)) {
            this.f7415bu = new C2640ri(this.dzy, i, i2, list, i3);
            this.f7427nr = list2;
            if (!TextUtils.isEmpty(this.f7419fi)) {
                this.f7415bu.m9823ri(this.f7419fi);
            }
            ((C2635fi) this.bgr).setTouchListenerProxy(this.f7415bu);
            this.slm = this.f7415bu.m9822ri();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m9788ri(boolean z, View view) {
        if (z) {
            this.f7436vr = view;
            view.setVisibility(8);
            View view2 = this.f7436vr;
            if (view2 == null || view2.getParent() != null) {
                return;
            }
            addView(this.f7436vr, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.bgr.getSettings().setAllowFileAccess(z);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.bgr.setAlpha(f);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        try {
            this.bgr.setBackgroundColor(i);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.bgr.getSettings().setBuiltInZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i) {
        try {
            this.bgr.getSettings().setCacheMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i) {
        this.ory = i;
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.bgr.getSettings().setDatabaseEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f) {
        this.f7438zf = f;
    }

    public void setDefaultFontSize(int i) {
        try {
            this.bgr.getSettings().setDefaultFontSize(i);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.bgr.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.bgr.getSettings().setDisplayZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.bgr.getSettings().setDomStorageEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.bgr.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.f7413aw = z;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.bgr.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.bgr.getSettings().setJavaScriptEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z) {
        this.xha = z;
    }

    public void setLandingPageClickBegin(long j) {
        this.f7424kt = j;
    }

    public void setLandingPageClickEnd(long j) {
        this.feb = j;
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
        try {
            this.bgr.setLayerType(i, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.bgr.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.bgr.getSettings().setLoadWithOverviewMode(z);
        } catch (Throwable unused) {
        }
    }

    public void setLpPreRender(boolean z) {
        this.f7412ac = z;
    }

    public void setMaterialMeta(C2639ri c2639ri) {
        this.f7423ka = c2639ri;
    }

    public void setMixedContentMode(int i) {
        try {
            this.bgr.getSettings().setMixedContentMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.bgr.setNetworkAvailable(z);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(lr lrVar) {
        this.hcw = lrVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        try {
            this.bgr.setOverScrollMode(i);
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setPreError(boolean z) {
        this.f7414ay = z;
    }

    public void setPreFinish(boolean z) {
        this.f7435uq = z;
    }

    public void setPreProgressHundred(boolean z) {
        this.wjv = z;
    }

    public void setPreStart(boolean z) {
        this.ihz = z;
    }

    public void setRecycler(boolean z) {
        if (this.bgr == null || !(this.bgr instanceof C2635fi)) {
            return;
        }
        ((C2635fi) this.bgr).setRecycler(z);
    }

    public void setShakeValue(float f) {
        this.igq = f;
    }

    public void setSupportZoom(boolean z) {
        try {
            this.bgr.getSettings().setSupportZoom(z);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.f7419fi = str;
        C2640ri c2640ri = this.f7415bu;
        if (c2640ri != null) {
            c2640ri.m9823ri(str);
        }
        C2637ka c2637ka = this.tan;
        if (c2637ka != null) {
            c2637ka.m9798ri(str);
        }
    }

    public void setTouchStateListener(fi fiVar) {
        this.srn = fiVar;
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.bgr.getSettings().setUseWideViewPort(z);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.bgr.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            this.bgr.setVisibility(i);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.bgr.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebView(WebView webView) {
        this.bgr = webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof fi) {
                setTouchStateListener((fi) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new ri();
            }
            this.f7420fr = webViewClient;
            this.bgr.setWebViewClient(new xha(this.slm, webViewClient, this.f7427nr));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f) {
        this.f7418dw = f;
    }

    /* JADX INFO: renamed from: sf */
    public boolean m9789sf() {
        if (this.bgr == null) {
            return false;
        }
        try {
            return this.bgr.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void slm() {
        if (this.bgr == null) {
            return;
        }
        if (this.f7434su != ik.ADS && this.f7434su != ik.ADS_V3) {
            C2735zf.m10345ri(this);
        } else {
            try {
                this.bgr.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: vr */
    public void m9790vr() {
        if (this.bgr == null) {
            return;
        }
        try {
            this.bgr.onPause();
        } catch (Throwable unused) {
        }
    }

    public void xha() {
        try {
            this.bgr.stopLoading();
        } catch (Throwable unused) {
        }
    }
}
