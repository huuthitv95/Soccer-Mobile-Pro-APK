package com.mbridge.msdk.foundation.webview;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.fragment.BaseFragment;
import com.mbridge.msdk.foundation.tools.C13227u0;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewFragment extends BaseFragment {

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.WebViewFragment$a */
    class C13244a implements BrowserView.InterfaceC13242e {
        C13244a() {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
        /* JADX INFO: renamed from: a */
        public void mo34364a() {
            WebViewFragment.this.getActivity().finish();
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
        /* JADX INFO: renamed from: a */
        public void mo34365a(WebView webView, String str) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (C13227u0.a.m37868b(str) && C13227u0.a.m37866a(WebViewFragment.this.getActivity().getApplicationContext(), str, null)) {
                WebViewFragment.this.getActivity().finish();
            }
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
        public void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC13242e
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        BrowserView browserView = new BrowserView(getActivity());
        browserView.loadUrl(getActivity().getIntent().getExtras().getString(NotificationCompat.CATEGORY_MESSAGE));
        browserView.setListener(new C13244a());
        return browserView;
    }
}
