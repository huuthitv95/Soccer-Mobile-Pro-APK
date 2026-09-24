package com.mbridge.msdk.splash.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.ironsource.C11744X3;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13190d0;
import com.mbridge.msdk.foundation.tools.C13197f1;
import com.mbridge.msdk.foundation.tools.C13200h;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.mraid.C13380a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.splash.signal.C13678b;
import com.mbridge.msdk.splash.signal.C13679c;
import com.unity3d.ads.BuildConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MBSplashView extends RelativeLayout {

    /* JADX INFO: renamed from: u */
    private static String f38497u = "MBSplashView";

    /* JADX INFO: renamed from: a */
    private int f38498a;

    /* JADX INFO: renamed from: b */
    private MBSplashWebview f38499b;

    /* JADX INFO: renamed from: c */
    private C13701a f38500c;

    /* JADX INFO: renamed from: d */
    private ViewGroup f38501d;

    /* JADX INFO: renamed from: e */
    private View f38502e;

    /* JADX INFO: renamed from: f */
    private View f38503f;

    /* JADX INFO: renamed from: g */
    private int f38504g;

    /* JADX INFO: renamed from: h */
    private boolean f38505h;

    /* JADX INFO: renamed from: i */
    private boolean f38506i;

    /* JADX INFO: renamed from: j */
    private boolean f38507j;

    /* JADX INFO: renamed from: k */
    private ViewGroup f38508k;

    /* JADX INFO: renamed from: l */
    private View f38509l;

    /* JADX INFO: renamed from: m */
    private boolean f38510m;

    /* JADX INFO: renamed from: n */
    private boolean f38511n;

    /* JADX INFO: renamed from: o */
    private RelativeLayout.LayoutParams f38512o;

    /* JADX INFO: renamed from: p */
    private C13678b f38513p;

    /* JADX INFO: renamed from: q */
    private DyCountDownListener f38514q;

    /* JADX INFO: renamed from: r */
    private boolean f38515r;

    /* JADX INFO: renamed from: s */
    private View.OnTouchListener f38516s;

    /* JADX INFO: renamed from: t */
    private boolean f38517t;

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.MBSplashView$a */
    class ViewOnTouchListenerC13698a implements View.OnTouchListener {
        ViewOnTouchListenerC13698a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !MBSplashView.this.f38515r;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.MBSplashView$b */
    class RunnableC13699b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f38519a;

        RunnableC13699b(CampaignEx campaignEx) {
            this.f38519a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashView.this.m40138b(this.f38519a);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.MBSplashView$c */
    class RunnableC13700c implements Runnable {
        RunnableC13700c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13219q0.m37813a(MBSplashView.f38497u, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBSplashView.this.f38499b.getLocationOnScreen(iArr);
                    C13219q0.m37816b(MBSplashView.f38497u, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", C13229v0.m37902b(C13008c.m36588n().m36542d(), (float) iArr[0]));
                    jSONObject.put("startY", C13229v0.m37902b(C13008c.m36588n().m36542d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    C13219q0.m37817b(MBSplashView.f38497u, th.getMessage(), th);
                }
                int[] iArr2 = new int[2];
                MBSplashView.this.f38499b.getLocationInWindow(iArr2);
                MBSplashView.transInfoForMraid(MBSplashView.this.f38499b, iArr2[0], iArr2[1], MBSplashView.this.f38499b.getWidth(), MBSplashView.this.f38499b.getHeight());
                C13392f.m38726a().m38728a((WebView) MBSplashView.this.f38499b, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public MBSplashView(Context context) {
        this(context, null);
    }

    public MBSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38515r = true;
        this.f38516s = new ViewOnTouchListenerC13698a();
        this.f38517t = true;
        m40137b();
    }

    /* JADX INFO: renamed from: a */
    private void m40133a(CampaignEx campaignEx) {
        View view;
        View view2;
        View view3;
        this.f38517t = true;
        if (this.f38503f != null) {
            if (this.f38501d == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f38501d = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f38498a == 2) {
                this.f38504g = C13229v0.m37930g(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f38501d.getId());
                if (!this.f38510m || (view2 = this.f38509l) == null) {
                    MBSplashWebview mBSplashWebview = this.f38499b;
                    if (mBSplashWebview != null && mBSplashWebview.getParent() == null) {
                        addView(this.f38499b, layoutParams);
                    }
                    m40138b(campaignEx);
                } else {
                    if (view2.getParent() != null) {
                        C13197f1.m37674a(this.f38509l);
                    }
                    addView(this.f38509l, layoutParams);
                }
                ViewGroup viewGroup = this.f38501d;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i = this.f38512o.width;
                    C13197f1.m37674a(this.f38503f);
                    int i2 = this.f38504g / 4;
                    if (i > i2) {
                        this.f38501d.addView(this.f38503f, i2, -1);
                        i = i2;
                    } else {
                        this.f38501d.addView(this.f38503f, i, -1);
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f38501d, layoutParams2);
                }
            } else {
                this.f38504g = C13229v0.m37927f(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f38501d.getId());
                if (!this.f38510m || (view = this.f38509l) == null) {
                    MBSplashWebview mBSplashWebview2 = this.f38499b;
                    if (mBSplashWebview2 != null && mBSplashWebview2.getParent() == null) {
                        addView(this.f38499b, layoutParams3);
                    }
                    m40138b(campaignEx);
                } else {
                    if (view.getParent() != null) {
                        C13197f1.m37674a(this.f38509l);
                    }
                    addView(this.f38509l, layoutParams3);
                }
                ViewGroup viewGroup2 = this.f38501d;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i3 = this.f38512o.height;
                    int i4 = this.f38504g / 4;
                    if (i3 > i4) {
                        i3 = i4;
                    }
                    C13197f1.m37674a(this.f38503f);
                    this.f38501d.addView(this.f38503f, -1, i3);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i3);
                    layoutParams4.addRule(12);
                    addView(this.f38501d, layoutParams4);
                }
            }
        } else if (!this.f38510m || (view3 = this.f38509l) == null) {
            MBSplashWebview mBSplashWebview3 = this.f38499b;
            if (mBSplashWebview3 != null && mBSplashWebview3.getParent() == null) {
                addView(this.f38499b, new ViewGroup.LayoutParams(-1, -1));
            }
            m40138b(campaignEx);
        } else {
            if (view3.getParent() != null) {
                C13197f1.m37674a(this.f38509l);
            }
            addView(this.f38509l, new ViewGroup.LayoutParams(-1, -1));
        }
        View view4 = this.f38502e;
        if (view4 != null) {
            if (view4.getParent() != null) {
                bringChildToFront(this.f38502e);
                return;
            }
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 100.0f), C13229v0.m37876a(getContext(), 30.0f));
            layoutParams5.addRule(10);
            layoutParams5.addRule(11);
            layoutParams5.rightMargin = C13229v0.m37876a(getContext(), 10.0f);
            layoutParams5.topMargin = C13229v0.m37876a(getContext(), 10.0f);
            addView(this.f38502e, layoutParams5);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m40137b() {
        setBackgroundColor(0);
        this.f38498a = getResources().getConfiguration().orientation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m40138b(CampaignEx campaignEx) {
        View view = this.f38499b;
        if (view != null) {
            if (view == null) {
                view = this.f38509l;
            }
            if (campaignEx != null ? C13200h.m37704b(campaignEx, null, view, campaignEx.getImpReportType()) : true) {
                this.f38499b.setObject(this.f38513p);
                this.f38499b.post(new RunnableC13700c());
            } else if (this.f38517t) {
                this.f38517t = false;
                this.f38499b.postDelayed(new RunnableC13699b(campaignEx), 200L);
            }
        }
    }

    public static void transInfoForMraid(WebView webView, int i, int i2, int i3, int i4) {
        String str;
        C13219q0.m37816b(f38497u, "transInfoForMraid");
        try {
            int i5 = C13008c.m36588n().m36542d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i5 == 2) {
                str = C11744X3.i.f26320C;
            } else {
                str = i5 == 1 ? C11744X3.i.f26322D : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float fM37760n = C13211m0.m37760n(C13008c.m36588n().m36542d());
            float fM37757m = C13211m0.m37757m(C13008c.m36588n().m36542d());
            HashMap mapM37776v = C13211m0.m37776v(C13008c.m36588n().m36542d());
            int iIntValue = ((Integer) mapM37776v.get("width")).intValue();
            int iIntValue2 = ((Integer) mapM37776v.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", BuildConfig.FLAVOR);
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            float f = i;
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            C13380a.m38682a().m38691b(webView, f, f2, f3, f4);
            C13380a.m38682a().m38687a(webView, f, f2, f3, f4);
            C13380a.m38682a().m38690b(webView, fM37760n, fM37757m);
            C13380a.m38682a().m38686a(webView, iIntValue, iIntValue2);
            C13380a.m38682a().m38689a(webView, map);
            C13380a.m38682a().m38684a(webView);
        } catch (Throwable th) {
            C13219q0.m37817b(f38497u, "transInfoForMraid", th);
        }
    }

    public void changeCloseBtnState(int i) {
        View view = this.f38502e;
        if (view != null) {
            if (i == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f38507j = false;
        this.f38506i = false;
        this.f38505h = false;
    }

    public void destroy() {
        removeAllViews();
        ViewGroup viewGroup = this.f38508k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        MBSplashWebview mBSplashWebview = this.f38499b;
        if (mBSplashWebview == null || mBSplashWebview.isDestoryed()) {
            return;
        }
        this.f38499b.finishAdSession();
        C13679c.m40078a(this.f38499b, "onSystemDestory", "");
        this.f38499b.release();
        this.f38499b = null;
    }

    public View.OnTouchListener getAllowClickSplashTouchListener() {
        return this.f38516s;
    }

    public View getCloseView() {
        return this.f38502e;
    }

    public ViewGroup getDevContainer() {
        return this.f38508k;
    }

    public View getIconVg() {
        return this.f38503f;
    }

    public View getSplashNativeView() {
        return this.f38509l;
    }

    public C13678b getSplashSignalCommunicationImpl() {
        return this.f38513p;
    }

    public MBSplashWebview getSplashWebview() {
        return this.f38499b;
    }

    public boolean isAttach() {
        return this.f38511n;
    }

    public boolean isDynamicView() {
        return this.f38510m;
    }

    public boolean isH5Ready() {
        return this.f38505h;
    }

    public boolean isImageReady() {
        return this.f38507j;
    }

    public boolean isVideoReady() {
        return this.f38506i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38511n = true;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m40137b();
    }

    public void onPause() {
        View view = this.f38509l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.f38509l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(false);
    }

    public void resetLoadState() {
        this.f38506i = false;
        this.f38505h = false;
    }

    public void setAllowClickSplash(boolean z) {
        this.f38515r = z;
        setOnTouchListener(this.f38516s);
    }

    public void setCloseView(View view) {
        this.f38502e = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.f38508k = viewGroup;
    }

    public void setDyCountDownListener(DyCountDownListener dyCountDownListener) {
        this.f38514q = dyCountDownListener;
    }

    public void setDynamicView(boolean z) {
        this.f38510m = z;
    }

    public void setH5Ready(boolean z) {
        this.f38505h = z;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f38503f = view;
        this.f38512o = layoutParams;
    }

    public void setImageReady(boolean z) {
        this.f38507j = z;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        View view = this.f38509l;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setNotchPadding(i, i2, i3, i4);
        }
        if (this.f38499b != null) {
            C13392f.m38726a().m38728a((WebView) this.f38499b, "oncutoutfetched", Base64.encodeToString(C13190d0.m37652a(-999, i, i2, i3, i4).getBytes(), 0));
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.f38509l = view;
        }
    }

    public void setSplashSignalCommunicationImpl(C13678b c13678b) {
        this.f38513p = c13678b;
        MBSplashWebview mBSplashWebview = this.f38499b;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(c13678b);
        }
    }

    public void setSplashWebView() {
        if (this.f38499b == null) {
            try {
                MBSplashWebview mBSplashWebview = new MBSplashWebview(getContext());
                this.f38499b = mBSplashWebview;
                C13678b c13678b = this.f38513p;
                if (c13678b != null) {
                    mBSplashWebview.setObject(c13678b);
                }
                C13701a c13701a = this.f38500c;
                if (c13701a != null) {
                    this.f38499b.setWebViewClient(c13701a);
                    return;
                }
                C13701a c13701a2 = new C13701a();
                this.f38500c = c13701a2;
                this.f38499b.setWebViewClient(c13701a2);
            } catch (Throwable th) {
                C13219q0.m37816b(f38497u, th.getMessage());
            }
        }
    }

    public void setVideoReady(boolean z) {
        this.f38506i = z;
    }

    public void show(CampaignEx campaignEx) {
        ViewGroup viewGroup;
        if (this.f38513p != null && (viewGroup = this.f38508k) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f38513p.m40064a(this.f38508k.getContext());
            C13701a c13701a = this.f38500c;
            if (c13701a != null) {
                c13701a.m40139a(this.f38513p.m40062a());
            }
        }
        m40133a(campaignEx);
        clearResState();
    }

    public void updateCountdown(int i) {
        DyCountDownListener dyCountDownListener;
        View view;
        if (this.f38499b != null && !this.f38510m) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("countdown", i);
                C13392f.m38726a().m38728a((WebView) this.f38499b, "updateCountdown", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (this.f38510m && (view = this.f38509l) != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).updateCountDown(i);
        }
        if (!this.f38510m || (dyCountDownListener = this.f38514q) == null) {
            return;
        }
        dyCountDownListener.getCountDownValue(i);
    }
}
