package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.ironsource.C11744X3;
import com.mbridge.msdk.advanced.signal.C12675a;
import com.mbridge.msdk.advanced.signal.C12676b;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.mraid.C13380a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.widget.MBAdChoice;
import com.unity3d.ads.BuildConfig;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class MBNativeAdvancedView extends RelativeLayout {

    /* JADX INFO: renamed from: i */
    private static String f33590i = "MBAdvancedNativeView";

    /* JADX INFO: renamed from: a */
    private MBNativeAdvancedWebview f33591a;

    /* JADX INFO: renamed from: b */
    private View f33592b;

    /* JADX INFO: renamed from: c */
    private boolean f33593c;

    /* JADX INFO: renamed from: d */
    private boolean f33594d;

    /* JADX INFO: renamed from: e */
    private boolean f33595e;

    /* JADX INFO: renamed from: f */
    MBAdChoice f33596f;

    /* JADX INFO: renamed from: g */
    private C12676b f33597g;

    /* JADX INFO: renamed from: h */
    private Context f33598h;

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.view.MBNativeAdvancedView$a */
    class C12677a implements InterfaceC13083a {
        C12677a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(MBNativeAdvancedView.f33590i, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(MBNativeAdvancedView.f33590i, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(MBNativeAdvancedView.f33590i, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.view.MBNativeAdvancedView$b */
    class RunnableC12678b implements Runnable {
        RunnableC12678b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13219q0.m37813a(MBNativeAdvancedView.f33590i, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBNativeAdvancedView.this.f33591a.getLocationOnScreen(iArr);
                    C13219q0.m37816b(MBNativeAdvancedView.f33590i, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", C13229v0.m37902b(C13008c.m36588n().m36542d(), (float) iArr[0]));
                    jSONObject.put("startY", C13229v0.m37902b(C13008c.m36588n().m36542d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    C13219q0.m37817b(MBNativeAdvancedView.f33590i, th.getMessage(), th);
                }
                C13392f.m38726a().m38728a((WebView) MBNativeAdvancedView.this.f33591a, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public MBNativeAdvancedView(Context context) {
        this(context, null);
    }

    public MBNativeAdvancedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBNativeAdvancedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33598h = context;
    }

    /* JADX INFO: renamed from: b */
    private void m34589b() {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f33591a;
        if (mBNativeAdvancedWebview != null && mBNativeAdvancedWebview.getParent() == null) {
            addView(this.f33591a, new ViewGroup.LayoutParams(-1, -1));
        }
        m34590c();
        View view = this.f33592b;
        if (view != null) {
            if (view.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 28.0f), C13229v0.m37876a(getContext(), 16.0f));
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.rightMargin = C13229v0.m37876a(getContext(), 2.0f);
                layoutParams.topMargin = C13229v0.m37876a(getContext(), 2.0f);
                addView(this.f33592b, layoutParams);
            } else {
                bringChildToFront(this.f33592b);
            }
        }
        if (this.f33596f == null) {
            MBAdChoice mBAdChoice = new MBAdChoice(getContext());
            this.f33596f = mBAdChoice;
            mBAdChoice.setFeedbackDialogEventListener(new C12677a());
        }
    }

    /* JADX INFO: renamed from: c */
    private void m34590c() {
        int[] iArr = new int[2];
        this.f33591a.getLocationInWindow(iArr);
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f33591a;
        transInfoForMraid(mBNativeAdvancedWebview, iArr[0], iArr[1], mBNativeAdvancedWebview.getWidth(), this.f33591a.getHeight());
        MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f33591a;
        if (mBNativeAdvancedWebview2 != null) {
            mBNativeAdvancedWebview2.setObject(this.f33597g);
            this.f33591a.post(new RunnableC12678b());
        }
    }

    public static void transInfoForMraid(WebView webView, int i, int i2, int i3, int i4) {
        String str;
        C13219q0.m37816b(f33590i, "transInfoForMraid");
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
            map.put("placementType", "inline");
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
            C13219q0.m37817b(f33590i, "transInfoForMraid", th);
        }
    }

    public void changeCloseBtnState(int i) {
        View view = this.f33592b;
        if (view != null) {
            if (i == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f33595e = false;
        this.f33594d = false;
        this.f33593c = false;
    }

    public void clearResStateAndRemoveClose() {
        clearResState();
        View view = this.f33592b;
        if (view != null && view.getParent() != null) {
            removeView(this.f33592b);
        }
        MBAdChoice mBAdChoice = this.f33596f;
        if (mBAdChoice == null || mBAdChoice.getParent() == null) {
            return;
        }
        removeView(this.f33596f);
    }

    public void destroy() {
        removeAllViews();
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f33591a;
        if (mBNativeAdvancedWebview != null && !mBNativeAdvancedWebview.isDestoryed()) {
            this.f33591a.release();
            C12675a.m34574a(this.f33591a, "onSystemDestory", "");
        }
        if (this.f33598h != null) {
            this.f33598h = null;
        }
    }

    public C12676b getAdvancedNativeSignalCommunicationImpl() {
        return this.f33597g;
    }

    public MBNativeAdvancedWebview getAdvancedNativeWebview() {
        return this.f33591a;
    }

    public View getCloseView() {
        return this.f33592b;
    }

    public boolean isEndCardReady() {
        return this.f33595e;
    }

    public boolean isH5Ready() {
        return this.f33593c;
    }

    public boolean isVideoReady() {
        return this.f33594d;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void resetLoadState() {
        this.f33595e = false;
        this.f33594d = false;
        this.f33593c = false;
    }

    public void setAdChoiceCampaign(CampaignEx campaignEx) {
        MBAdChoice mBAdChoice = this.f33596f;
        if (mBAdChoice != null) {
            mBAdChoice.setCampaign(campaignEx);
            if (this.f33596f.getParent() != null) {
                bringChildToFront(this.f33596f);
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(C13008c.m36588n().m36542d(), 6.0f), C13229v0.m37876a(C13008c.m36588n().m36542d(), 6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            addView(this.f33596f, layoutParams);
        }
    }

    public void setAdvancedNativeSignalCommunicationImpl(C12676b c12676b) {
        this.f33597g = c12676b;
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f33591a;
        if (mBNativeAdvancedWebview != null) {
            mBNativeAdvancedWebview.setObject(c12676b);
        }
    }

    public void setAdvancedNativeWebview(MBNativeAdvancedWebview mBNativeAdvancedWebview) {
        this.f33591a = mBNativeAdvancedWebview;
        C12676b c12676b = this.f33597g;
        if (c12676b != null) {
            mBNativeAdvancedWebview.setObject(c12676b);
        }
    }

    public void setCloseView(View view) {
        this.f33592b = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setEndCardReady(boolean z) {
        this.f33595e = z;
    }

    public void setH5Ready(boolean z) {
        this.f33593c = z;
    }

    public void setVideoReady(boolean z) {
        this.f33594d = z;
    }

    public void show() {
        m34589b();
        clearResState();
    }
}
