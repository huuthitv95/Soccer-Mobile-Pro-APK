package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.AbstractC1677p0;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinWebViewBase extends WebView {
    public AppLovinWebViewBase(Context context) {
        super(context);
    }

    protected void applySettings(AbstractC1736b abstractC1736b) {
        Boolean boolM2050m;
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
        int iM4542j0 = abstractC1736b.m4542j0();
        if (iM4542j0 >= 0) {
            setLayerType(iM4542j0, null);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(abstractC1736b.m4475C());
        if (abstractC1736b.m4571z0()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        C1503l c1503lM4544k0 = abstractC1736b.m4544k0();
        if (c1503lM4544k0 != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState pluginStateM2039b = c1503lM4544k0.m2039b();
            if (pluginStateM2039b != null) {
                settings.setPluginState(pluginStateM2039b);
            }
            Boolean boolM2042e = c1503lM4544k0.m2042e();
            if (boolM2042e != null) {
                settings.setAllowFileAccess(boolM2042e.booleanValue());
            }
            Boolean boolM2046i = c1503lM4544k0.m2046i();
            if (boolM2046i != null) {
                settings.setLoadWithOverviewMode(boolM2046i.booleanValue());
            }
            Boolean boolM2054q = c1503lM4544k0.m2054q();
            if (boolM2054q != null) {
                settings.setUseWideViewPort(boolM2054q.booleanValue());
            }
            Boolean boolM2041d = c1503lM4544k0.m2041d();
            if (boolM2041d != null) {
                settings.setAllowContentAccess(boolM2041d.booleanValue());
            }
            Boolean boolM2053p = c1503lM4544k0.m2053p();
            if (boolM2053p != null) {
                settings.setBuiltInZoomControls(boolM2053p.booleanValue());
            }
            Boolean boolM2045h = c1503lM4544k0.m2045h();
            if (boolM2045h != null) {
                settings.setDisplayZoomControls(boolM2045h.booleanValue());
            }
            Boolean boolM2049l = c1503lM4544k0.m2049l();
            if (boolM2049l != null) {
                settings.setSaveFormData(boolM2049l.booleanValue());
            }
            Boolean boolM2040c = c1503lM4544k0.m2040c();
            if (boolM2040c != null) {
                settings.setGeolocationEnabled(boolM2040c.booleanValue());
            }
            Boolean boolM2047j = c1503lM4544k0.m2047j();
            if (boolM2047j != null) {
                settings.setNeedInitialFocus(boolM2047j.booleanValue());
            }
            Boolean boolM2043f = c1503lM4544k0.m2043f();
            if (boolM2043f != null) {
                settings.setAllowFileAccessFromFileURLs(boolM2043f.booleanValue());
            }
            Boolean boolM2044g = c1503lM4544k0.m2044g();
            if (boolM2044g != null) {
                settings.setAllowUniversalAccessFromFileURLs(boolM2044g.booleanValue());
            }
            Boolean boolM2052o = c1503lM4544k0.m2052o();
            if (boolM2052o != null) {
                settings.setLoadsImagesAutomatically(boolM2052o.booleanValue());
            }
            Boolean boolM2051n = c1503lM4544k0.m2051n();
            if (boolM2051n != null) {
                settings.setBlockNetworkImage(boolM2051n.booleanValue());
            }
            Integer numM2038a = c1503lM4544k0.m2038a();
            if (numM2038a != null) {
                settings.setMixedContentMode(numM2038a.intValue());
            }
            Boolean boolM2048k = c1503lM4544k0.m2048k();
            if (boolM2048k != null) {
                settings.setOffscreenPreRaster(boolM2048k.booleanValue());
            }
            if (!AbstractC1677p0.m3814h() || (boolM2050m = c1503lM4544k0.m2050m()) == null) {
                return;
            }
            settings.setAlgorithmicDarkeningAllowed(boolM2050m.booleanValue());
        }
    }
}
