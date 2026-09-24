package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.a */
/* JADX INFO: compiled from: BackPointBrowserViewListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13245a implements BrowserView.InterfaceC13242e {

    /* JADX INFO: renamed from: o */
    private static String f36451o = "a";

    /* JADX INFO: renamed from: a */
    private int f36452a;

    /* JADX INFO: renamed from: c */
    private String f36454c;

    /* JADX INFO: renamed from: d */
    private boolean f36455d;

    /* JADX INFO: renamed from: e */
    private BaseTrackingListener f36456e;

    /* JADX INFO: renamed from: f */
    private BrowserView f36457f;

    /* JADX INFO: renamed from: g */
    private CampaignEx f36458g;

    /* JADX INFO: renamed from: h */
    private C12682a f36459h;

    /* JADX INFO: renamed from: i */
    private Context f36460i;

    /* JADX INFO: renamed from: k */
    private JumpLoaderResult f36462k;

    /* JADX INFO: renamed from: n */
    private long f36465n;

    /* JADX INFO: renamed from: b */
    private boolean f36453b = true;

    /* JADX INFO: renamed from: l */
    private boolean f36463l = false;

    /* JADX INFO: renamed from: m */
    private final Runnable f36464m = new a();

    /* JADX INFO: renamed from: j */
    private Handler f36461j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.a$a */
    /* JADX INFO: compiled from: BackPointBrowserViewListener.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13219q0.m37816b(C13245a.f36451o, "webview js！超时上限：" + C13245a.this.f36452a + "ms");
            if (C13245a.this.f36459h != null && C13245a.this.f36462k != null) {
                C13245a.this.f36462k.setSuccess(false);
                C13245a.this.f36462k.setUrl(C13245a.this.f36454c);
                C13245a.this.f36462k.setType(2);
                C13245a.this.f36462k.setExceptionMsg("linktype 8 time out");
                C13245a.this.f36459h.m34631a(C13245a.this.f36462k, C13245a.this.f36458g, 1, false);
            }
            C13245a c13245a = C13245a.this;
            if (c13245a.m37986b(null, c13245a.f36454c) && !C13245a.this.f36463l) {
                C13245a.this.f36463l = true;
                C13245a c13245a2 = C13245a.this;
                c13245a2.m37980a(c13245a2.f36460i, C13245a.this.f36454c, C13245a.this.f36458g);
            }
            if (C13245a.this.f36456e != null) {
                C13245a.this.f36456e.onFinishRedirection(C13245a.this.f36458g, C13245a.this.f36454c);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.a$b */
    /* JADX INFO: compiled from: BackPointBrowserViewListener.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f36467a;

        b(String str) {
            this.f36467a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C13245a.this.f36459h != null && C13245a.this.f36462k != null) {
                C13245a.this.f36462k.setSuccess(true);
                C13245a.this.f36462k.setUrl(this.f36467a);
                C13245a.this.f36462k.setType(2);
                C13245a.this.f36459h.m34631a(C13245a.this.f36462k, C13245a.this.f36458g, 1, true);
            }
            if (C13245a.this.f36456e != null) {
                C13245a.this.f36456e.onFinishRedirection(C13245a.this.f36458g, this.f36467a);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.a$c */
    /* JADX INFO: compiled from: BackPointBrowserViewListener.java */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f36469a;

        c(String str) {
            this.f36469a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C13245a.this.f36456e != null) {
                C13245a.this.f36456e.onFinishRedirection(C13245a.this.f36458g, this.f36469a);
            }
            if (C13245a.this.f36459h == null || C13245a.this.f36462k == null) {
                return;
            }
            C13245a.this.f36462k.setSuccess(true);
            C13245a.this.f36462k.setUrl(this.f36469a);
            C13245a.this.f36462k.setType(2);
            C13245a.this.f36459h.m34631a(C13245a.this.f36462k, C13245a.this.f36458g, 1, true);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.a$d */
    /* JADX INFO: compiled from: BackPointBrowserViewListener.java */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f36471a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f36472b;

        d(String str, String str2) {
            this.f36471a = str;
            this.f36472b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C13245a.this.f36456e != null) {
                C13245a.this.f36456e.onFinishRedirection(C13245a.this.f36458g, this.f36471a);
            }
            if (C13245a.this.f36459h == null || C13245a.this.f36462k == null) {
                return;
            }
            C13245a.this.f36462k.setSuccess(false);
            C13245a.this.f36462k.setUrl(this.f36471a);
            C13245a.this.f36462k.setType(2);
            C13245a.this.f36462k.setExceptionMsg(this.f36472b);
            C13245a.this.f36459h.m34631a(C13245a.this.f36462k, C13245a.this.f36458g, 1, true);
        }
    }

    public C13245a(Context context, CampaignEx campaignEx, C12682a c12682a, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.f36452a = 10000;
        this.f36462k = null;
        this.f36460i = context;
        this.f36458g = campaignEx;
        this.f36457f = browserView;
        this.f36456e = baseTrackingListener;
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        c13635gM39718d = c13635gM39718d == null ? C13636h.m39706b().m39708a() : c13635gM39718d;
        this.f36459h = c12682a;
        this.f36462k = new JumpLoaderResult();
        this.f36452a = (int) c13635gM39718d.m39562s0();
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
    /* JADX INFO: renamed from: a */
    public void mo34364a() {
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
    public void onPageFinished(WebView webView, String str) {
        C13219q0.m37816b(f36451o, "onPageFinished1  " + str);
        if (this.f36453b) {
            this.f36465n = 0L;
            this.f36453b = false;
            C13167a.m37546e().execute(new c(str));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m37988c();
            Uri uri = Uri.parse(str);
            if ((uri.getScheme().equals(ProxyConfig.MATCH_HTTP) || uri.getScheme().equals("https")) && !this.f36463l) {
                this.f36463l = true;
                m37980a(this.f36460i, str, this.f36458g);
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f36465n == 0) {
            this.f36465n = System.currentTimeMillis();
            if (!this.f36455d) {
                this.f36455d = true;
                m37991d();
            }
            this.f36463l = false;
        }
        this.f36454c = str;
        this.f36453b = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        C13219q0.m37820d(f36451o, str);
        m37988c();
        C13167a.m37546e().execute(new d(str2, str));
        if (!m37986b(webView, str2) || this.f36463l) {
            return;
        }
        this.f36463l = true;
        m37980a(this.f36460i, str2, this.f36458g);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C13219q0.m37816b(f36451o, "shouldOverrideUrlLoading1  " + str);
        this.f36453b = false;
        if (C13227u0.a.m37868b(str) && C13227u0.a.m37866a(this.f36460i, str, null)) {
            this.f36463l = true;
        }
        boolean zM37989c = m37989c(webView, str);
        if (zM37989c) {
            this.f36465n = 0L;
            this.f36453b = false;
            m37988c();
            C13167a.m37546e().execute(new b(str));
        }
        return zM37989c;
    }

    /* JADX INFO: renamed from: c */
    private boolean m37989c(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals(ProxyConfig.MATCH_HTTP) && !uri.getScheme().equals("https")) {
                if (uri.getScheme().equals(SDKConstants.PARAM_INTENT)) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2) && this.f36460i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            uri2.setFlags(268435456);
                            this.f36460i.startActivity(uri2);
                            this.f36463l = true;
                            return true;
                        }
                        try {
                            String stringExtra = uri2.getStringExtra("browser_fallback_url");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                Uri uri3 = Uri.parse(str);
                                if (!uri3.getScheme().equals(ProxyConfig.MATCH_HTTP) && !uri3.getScheme().equals("https")) {
                                    str = stringExtra;
                                }
                                webView.loadUrl(stringExtra);
                                return false;
                            }
                        } catch (Throwable th) {
                            C13219q0.m37816b(f36451o, th.getMessage());
                        }
                    } catch (Throwable th2) {
                        C13219q0.m37816b(f36451o, th2.getMessage());
                    }
                    C13219q0.m37816b(f36451o, th.getMessage());
                    return false;
                }
                if (C12684c.m34660d(this.f36460i, str)) {
                    C13219q0.m37816b(f36451o, "openDeepLink");
                    this.f36463l = true;
                    return true;
                }
            }
            return false;
        } catch (Throwable th3) {
            C13219q0.m37816b(f36451o, th3.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m37991d() {
        this.f36461j.postDelayed(this.f36464m, this.f36452a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public boolean m37986b(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals(ProxyConfig.MATCH_HTTP) && !uri.getScheme().equals("https")) {
                if (uri.getScheme().equals(SDKConstants.PARAM_INTENT)) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2) && this.f36460i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            return false;
                        }
                    } catch (Throwable th) {
                        C13219q0.m37816b(f36451o, th.getMessage());
                    }
                    try {
                        String stringExtra = uri2.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri uri3 = Uri.parse(str);
                            if (uri3.getScheme().equals(ProxyConfig.MATCH_HTTP) || uri3.getScheme().equals("https")) {
                                return true;
                            }
                            str = stringExtra;
                        }
                    } catch (Throwable th2) {
                        C13219q0.m37816b(f36451o, th2.getMessage());
                    }
                }
                if (C12684c.m34660d(this.f36460i, str)) {
                    C13219q0.m37816b(f36451o, "openDeepLink");
                    return false;
                }
            }
            return true;
        } catch (Throwable th3) {
            C13219q0.m37816b(f36451o, th3.getMessage());
            return true;
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
    /* JADX INFO: renamed from: a */
    public void mo34365a(WebView webView, String str) {
        if (this.f36465n == 0) {
            this.f36465n = System.currentTimeMillis();
            if (!this.f36455d) {
                this.f36455d = true;
                m37991d();
            }
        }
        this.f36454c = str;
        this.f36453b = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m37980a(Context context, String str, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        if (campaignEx != null) {
            campaignEx.getCurrentLocalRid();
        }
        try {
            int i = MBCommonActivity.f33377e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C13246b.f36474a.put(str, this.f36457f);
            if (C13227u0.a.m37870d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            C13219q0.m37818c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
        } catch (Exception unused) {
            C13227u0.m37857a(context, str, this.f36456e, campaignEx, new ArrayList());
        }
    }

    /* JADX INFO: renamed from: c */
    private void m37988c() {
        this.f36461j.removeCallbacks(this.f36464m);
    }
}
