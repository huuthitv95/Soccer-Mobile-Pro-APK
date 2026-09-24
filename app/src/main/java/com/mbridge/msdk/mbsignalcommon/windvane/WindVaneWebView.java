package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.base.C13349b;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* JADX INFO: loaded from: classes6.dex */
public class WindVaneWebView extends BaseWebView {

    /* JADX INFO: renamed from: d */
    protected C13396j f37140d;

    /* JADX INFO: renamed from: e */
    protected InterfaceC13388b f37141e;

    /* JADX INFO: renamed from: f */
    protected C13391e f37142f;

    /* JADX INFO: renamed from: g */
    private Object f37143g;

    /* JADX INFO: renamed from: h */
    private Object f37144h;

    /* JADX INFO: renamed from: i */
    private String f37145i;

    /* JADX INFO: renamed from: j */
    private InterfaceC13389c f37146j;

    /* JADX INFO: renamed from: k */
    private String f37147k;

    /* JADX INFO: renamed from: l */
    private String f37148l;

    /* JADX INFO: renamed from: m */
    private CampaignEx f37149m;

    /* JADX INFO: renamed from: n */
    private int f37150n;

    /* JADX INFO: renamed from: o */
    private boolean f37151o;

    /* JADX INFO: renamed from: p */
    private float f37152p;

    /* JADX INFO: renamed from: q */
    private float f37153q;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView$a */
    class RunnableC13386a implements Runnable {
        RunnableC13386a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WindVaneWebView.this.f37151o = true;
            WindVaneWebView.this.destroy();
        }
    }

    public WindVaneWebView(Context context) {
        super(context);
        this.f37151o = false;
        this.f37152p = 0.0f;
        this.f37153q = 0.0f;
    }

    public void clearWebView() {
        if (this.f37151o) {
            return;
        }
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    public CampaignEx getCampaignEx() {
        return this.f37149m;
    }

    public String getCampaignId() {
        return this.f37145i;
    }

    public Object getJsObject(String str) {
        C13391e c13391e = this.f37142f;
        if (c13391e == null) {
            return null;
        }
        return c13391e.m38721a(str);
    }

    public String getLocalRequestId() {
        return this.f37148l;
    }

    public Object getMraidObject() {
        return this.f37144h;
    }

    public Object getObject() {
        return this.f37143g;
    }

    public String getRid() {
        return this.f37147k;
    }

    public InterfaceC13388b getSignalCommunication() {
        return this.f37141e;
    }

    public InterfaceC13389c getWebViewListener() {
        return this.f37146j;
    }

    public boolean isDestoryed() {
        return this.f37151o;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C13349b c13349b = this.mWebViewClient;
        if (c13349b != null && (c13349b.m38606a() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f37152p = motionEvent.getRawX();
                    this.f37153q = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f37152p;
                    float y = motionEvent.getY() - this.f37153q;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y >= 0.0f || (-1.0f) * y <= 48) && (y <= 0.0f || y <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        C13391e c13391e = this.f37142f;
        if (c13391e == null) {
            return;
        }
        c13391e.m38725a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.f37151o) {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("type", Integer.valueOf(this.f37150n));
                if (this.f37149m != null) {
                    C13156d.m37475b().m37483a("2000135", this.f37149m, c13157e);
                }
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f37143g = null;
            int iM37901b = C13229v0.m37901b(getContext());
            if (iM37901b == 0) {
                this.f37151o = true;
                destroy();
            } else {
                new Handler().postDelayed(new RunnableC13386a(), iM37901b * 1000);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        C13391e c13391e = this.f37142f;
        if (c13391e != null) {
            c13391e.m38723a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        C13391e c13391e = this.f37142f;
        if (c13391e != null) {
            c13391e.m38724a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f37149m = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f37145i = str;
    }

    public void setLocalRequestId(String str) {
        this.f37148l = str;
    }

    public void setMraidObject(Object obj) {
        this.f37144h = obj;
    }

    public void setObject(Object obj) {
        this.f37143g = obj;
    }

    public void setRid(String str) {
        this.f37147k = str;
    }

    public void setSignalCommunication(InterfaceC13388b interfaceC13388b) {
        this.f37141e = interfaceC13388b;
        interfaceC13388b.mo38714a(this);
    }

    public void setTempTypeForMetrics(int i) {
        this.f37150n = i;
    }

    public void setWebViewChromeClient(C13396j c13396j) {
        this.f37140d = c13396j;
        setWebChromeClient(c13396j);
    }

    public void setWebViewListener(InterfaceC13389c interfaceC13389c) {
        this.f37146j = interfaceC13389c;
        C13396j c13396j = this.f37140d;
        if (c13396j != null) {
            c13396j.m38743a(interfaceC13389c);
        }
        C13349b c13349b = this.mWebViewClient;
        if (c13349b != null) {
            c13349b.m38608a(interfaceC13389c);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    /* JADX INFO: renamed from: a */
    protected void mo38604a() {
        super.mo38604a();
        getSettings().setSavePassword(false);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f37140d == null) {
            this.f37140d = new C13396j(this);
        }
        setWebViewChromeClient(this.f37140d);
        C13397k c13397k = new C13397k();
        this.mWebViewClient = c13397k;
        setWebViewClient(c13397k);
        if (this.f37141e == null) {
            InterfaceC13388b c13394h = new C13394h(this.f37040a);
            this.f37141e = c13394h;
            setSignalCommunication(c13394h);
        }
        this.f37142f = new C13391e(this.f37040a, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37151o = false;
        this.f37152p = 0.0f;
        this.f37153q = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37151o = false;
        this.f37152p = 0.0f;
        this.f37153q = 0.0f;
    }
}
