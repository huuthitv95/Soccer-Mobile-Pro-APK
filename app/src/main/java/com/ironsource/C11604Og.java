package com.ironsource;

import android.content.Context;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: renamed from: com.ironsource.Og */
/* JADX INFO: loaded from: classes6.dex */
public class C11604Og {

    /* JADX INFO: renamed from: a */
    private static String f25306a = "Og";

    /* JADX INFO: renamed from: a */
    public static FrameLayout m26776a(Context context, View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setVisibility(8);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout3.addView(view);
        frameLayout.addView(frameLayout2, layoutParams);
        frameLayout.addView(frameLayout3);
        return frameLayout;
    }

    /* JADX INFO: renamed from: b */
    private static void m26779b(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    /* JADX INFO: renamed from: a */
    public static void m26778a(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        try {
            m26777a(settings);
            m26779b(settings);
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            Logger.m33640e(f25306a, "setWebSettings - " + th.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m26777a(WebSettings webSettings) {
        webSettings.setDisplayZoomControls(false);
    }
}
