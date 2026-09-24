package com.bytedance.sdk.openadsdk.core.widget.p228ri;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.adexpress.p122fi.C2483fi;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2523lr;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.utils.tan;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3351lr implements InterfaceC3352ri {

    /* JADX INFO: renamed from: fi */
    private final boolean f11836fi;

    /* JADX INFO: renamed from: ik */
    private final AtomicInteger f11837ik;

    /* JADX INFO: renamed from: ka */
    private final MessageQueue f11838ka;

    /* JADX INFO: renamed from: lr */
    private C2634di f11839lr;

    /* JADX INFO: renamed from: ri */
    dzy f11840ri;

    public C3351lr(int i, boolean z, MessageQueue messageQueue) {
        this.f11837ik = new AtomicInteger(i);
        this.f11836fi = z;
        this.f11838ka = messageQueue;
    }

    /* JADX INFO: renamed from: ri */
    private void m15088ri(C2634di c2634di) {
        if (c2634di == null || c2634di.getWebView() == null) {
            return;
        }
        try {
            C3349ik.m15077ri(C3299nr.m14642ri()).m15081ri(false).m15082ri(c2634di.getWebView());
            c2634di.setVerticalScrollBarEnabled(false);
            c2634di.setHorizontalScrollBarEnabled(false);
            C3349ik.m15079ri(c2634di);
            c2634di.bgr();
            c2634di.setUserAgentString(tan.m16659ri(c2634di.getWebView(), BuildConfig.VERSION_CODE));
            c2634di.setMixedContentMode(0);
            c2634di.setJavaScriptEnabled(true);
            c2634di.setJavaScriptCanOpenWindowsAutomatically(true);
            c2634di.setDomStorageEnabled(true);
            c2634di.setDatabaseEnabled(true);
            c2634di.setCacheMode(-1);
            c2634di.setAllowFileAccess(false);
            c2634di.setSupportZoom(true);
            c2634di.setBuiltInZoomControls(true);
            c2634di.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            c2634di.setUseWideViewPort(true);
        } catch (Throwable th) {
            C2707ac.m10196ik("WebViewPool", th.toString());
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m15089lr() {
        if (this.f11837ik.get() <= 0) {
            return;
        }
        Objects.toString(this.f11837ik);
        String strM9110ka = C2523lr.m9110ka(null);
        if (this.f11836fi) {
            String strM9110ka2 = C2523lr.m9110ka("v3");
            if (strM9110ka != null && strM9110ka.equals(strM9110ka2)) {
                return;
            } else {
                strM9110ka = strM9110ka2;
            }
        }
        if (TextUtils.isEmpty(strM9110ka)) {
            return;
        }
        try {
            C2634di c2634di = new C2634di(new MutableContextWrapper(C3299nr.m14642ri()), this.f11836fi ? C2634di.ik.ADS_V3 : C2634di.ik.ADS);
            this.f11839lr = c2634di;
            if (c2634di.getWebView() == null) {
                return;
            }
            this.f11839lr.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.lr.1
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    return true;
                }
            });
            m15088ri(this.f11839lr);
            Uri uriBuild = Uri.parse(strM9110ka).buildUpon().appendQueryParameter("isPreLoad", "1").build();
            dzy dzyVar = new dzy(this.f11839lr.getContext());
            this.f11840ri = dzyVar;
            dzyVar.m13422lr(this.f11839lr).m13444ri(this).m13435ri(this.f11839lr);
            C2483fi.m8762ri().m8777ri(this.f11839lr, this.f11840ri);
            this.f11839lr.m9767a_(uriBuild.toString());
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.InterfaceC3352ri
    /* JADX INFO: renamed from: ri */
    public void mo15090ri() {
        MessageQueue messageQueue;
        if (this.f11836fi) {
            C2483fi.m8762ri().m8771lr(this.f11839lr);
        } else {
            C2483fi.m8762ri().m8765ik(this.f11839lr);
        }
        try {
            Integer.valueOf(this.f11837ik.get());
            Boolean.valueOf(this.f11836fi);
            this.f11837ik.decrementAndGet();
            if (this.f11837ik.get() <= 0 || (messageQueue = this.f11838ka) == null) {
                return;
            }
            messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.lr.2
                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    new C3351lr(C3351lr.this.f11837ik.get(), C3351lr.this.f11836fi, C3351lr.this.f11838ka).m15089lr();
                    return false;
                }
            });
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
