package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.webkit.ProxyConfig;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13197f1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.C13246b;

/* JADX INFO: loaded from: classes4.dex */
public class DomainMBCommonActivity extends Activity {

    /* JADX INFO: renamed from: a */
    String f33364a = "";

    /* JADX INFO: renamed from: b */
    private final BrowserView.InterfaceC13242e f33365b = new C12648a();
    protected BrowserView browserView;

    /* JADX INFO: renamed from: c */
    private CampaignEx f33366c;

    /* JADX INFO: renamed from: com.mbridge.msdk.activity.DomainMBCommonActivity$a */
    class C12648a implements BrowserView.InterfaceC13242e {
        C12648a() {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
        /* JADX INFO: renamed from: a */
        public void mo34364a() {
            DomainMBCommonActivity.this.finish();
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
        /* JADX INFO: renamed from: a */
        public void mo34365a(WebView webView, String str) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
        public void onPageFinished(WebView webView, String str) {
            C13219q0.m37816b("MBCommonActivity", "onPageFinished  " + str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C13219q0.m37816b("MBCommonActivity", "onPageStarted  " + str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
        public void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C13219q0.m37816b("MBCommonActivity", "shouldOverrideUrlLoading  " + str);
            if (C13227u0.a.m37868b(str) && C13227u0.a.m37866a(DomainMBCommonActivity.this, str, null)) {
                DomainMBCommonActivity.this.finish();
            }
            return DomainMBCommonActivity.this.m34362a(webView, str);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34361a() {
        String stringExtra = getIntent().getStringExtra("url");
        this.f33364a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, "Error: no data", 0).show();
            return;
        }
        this.f33366c = (CampaignEx) getIntent().getSerializableExtra("mvcommon");
        if (C13246b.f36474a.containsKey(this.f33364a)) {
            BrowserView browserView = C13246b.f36474a.get(this.f33364a);
            this.browserView = browserView;
            if (browserView != null) {
                browserView.setListener(this.f33365b);
            }
        } else {
            BrowserView browserView2 = new BrowserView(this, this.f33366c);
            this.browserView = browserView2;
            browserView2.setListener(this.f33365b);
            this.browserView.loadUrl(this.f33364a);
        }
        BrowserView browserView3 = this.browserView;
        if (browserView3 != null) {
            C13197f1.m37674a(browserView3);
            setContentView(this.browserView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m34362a(WebView webView, String str) {
        Intent uri;
        String str2;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri2 = Uri.parse(str);
            if (!uri2.getScheme().equals(ProxyConfig.MATCH_HTTP) && !uri2.getScheme().equals("https")) {
                if (uri2.getScheme().equals(SDKConstants.PARAM_INTENT) || uri2.getScheme().equals("android-app")) {
                    String stringExtra = null;
                    if (uri2.getScheme().equals(SDKConstants.PARAM_INTENT)) {
                        uri = Intent.parseUri(str, 1);
                    } else {
                        uri = uri2.getScheme().equals("android-app") ? Intent.parseUri(str, 2) : null;
                    }
                    if (uri != null) {
                        uri.setComponent(null);
                        uri.setSelector(null);
                    }
                    if (uri == null) {
                        str2 = "";
                    } else {
                        try {
                            str2 = uri.getPackage();
                        } catch (Throwable th) {
                            C13219q0.m37816b("MBCommonActivity", th.getMessage());
                        }
                    }
                    if (!TextUtils.isEmpty(str2) && getPackageManager().getLaunchIntentForPackage(str2) != null) {
                        if (uri != null) {
                            uri.setFlags(268435456);
                        }
                        startActivityForResult(uri, 0);
                        finish();
                        return true;
                    }
                    if (uri != null) {
                        try {
                            stringExtra = uri.getStringExtra("browser_fallback_url");
                        } catch (Throwable th2) {
                            C13219q0.m37816b("MBCommonActivity", th2.getMessage());
                        }
                    }
                    if (!TextUtils.isEmpty(stringExtra)) {
                        Uri uri3 = Uri.parse(str);
                        if (!uri3.getScheme().equals(ProxyConfig.MATCH_HTTP) && !uri3.getScheme().equals("https")) {
                            str = stringExtra;
                        }
                        webView.loadUrl(stringExtra);
                        return false;
                    }
                    C13219q0.m37816b("MBCommonActivity", th.getMessage());
                    return false;
                }
                if (C12684c.m34660d(this, str)) {
                    C13219q0.m37816b("MBCommonActivity", "openDeepLink");
                    finish();
                    return true;
                }
                if (!TextUtils.isEmpty(str)) {
                    return !(str.startsWith(ProxyConfig.MATCH_HTTP) || str.startsWith("https"));
                }
            }
            return false;
        } catch (Throwable th3) {
            C13219q0.m37816b("MBCommonActivity", th3.getMessage());
            return false;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            C13219q0.m37816b("MBCommonActivity", th.getMessage());
        }
        if (C13008c.m36588n().m36542d() == null) {
            C13008c.m36588n().m36535b(getApplicationContext());
        }
        C13008c.m36588n().m36527a(this);
        m34361a();
    }
}
