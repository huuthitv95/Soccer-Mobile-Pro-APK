package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2523lr;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2525ri;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2717fi;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.jbs.p220ri.C3239lr;
import com.bytedance.sdk.openadsdk.core.model.C3286nr;
import com.bytedance.sdk.openadsdk.core.model.C3287oh;
import com.bytedance.sdk.openadsdk.core.p200co.C3155ka;
import com.bytedance.sdk.openadsdk.core.p218fi.C3212ri;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi;
import com.bytedance.sdk.openadsdk.p236ka.C3393aw;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import com.ironsource.C11341A5;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C3237qt extends C3348fi {

    /* JADX INFO: renamed from: co */
    private static final byte[] f10868co = {-119, 80, 78, 71, Ascii.f22490CR, 10, Ascii.SUB, 10, 0, 0, 0, Ascii.f22490CR, 73, 72, 68, 82, 0, 0, 0, 1, 0, 0, 0, 1, 8, 6, 0, 0, 0, Ascii.f22502US, Ascii.NAK, -60, -119, 0, 0, 0, 10, 73, 68, 65, 84, 120, -100, 99, 96, 96, 96, 96, 0, 0, 0, 3, 0, 1, -2, 60, -79, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};

    /* JADX INFO: renamed from: lr */
    private final com.bytedance.sdk.openadsdk.core.model.wjv f10869lr;

    /* JADX INFO: renamed from: qt */
    private C2500aw f10870qt;

    /* JADX INFO: renamed from: ri */
    public ArrayList<Integer> f10871ri;

    /* JADX INFO: renamed from: sf */
    private boolean f10872sf;

    public C3237qt(Context context, dzy dzyVar, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, C3393aw c3393aw, C2500aw c2500aw) {
        super(context, dzyVar, wjvVar.m14533tn(), c3393aw, false);
        this.f10872sf = false;
        this.f10871ri = new ArrayList<>();
        this.f10869lr = wjvVar;
        this.f10870qt = c2500aw;
        this.f10872sf = C3606fi.m16703ri("inject_data_normal_open", 0) == 1;
    }

    /* JADX INFO: renamed from: fi */
    private WebResourceResponse m13685fi() {
        InputStream inputStreamOpenRawResource;
        int iJbs = C3304qt.m14669lr().jbs();
        if (iJbs == 0) {
            return null;
        }
        Resources resources = C3299nr.m14642ri().getResources();
        if (resources != null) {
            try {
                TypedValue typedValue = new TypedValue();
                resources.getValueForDensity(iJbs, 0, typedValue, true);
                inputStreamOpenRawResource = (typedValue.string == null || !typedValue.string.toString().endsWith(".xml")) ? resources.openRawResource(iJbs) : new ByteArrayInputStream(f10868co);
            } catch (Resources.NotFoundException e) {
                C2707ac.m10196ik("ExpressClient", e.toString());
                inputStreamOpenRawResource = null;
            }
        } else {
            inputStreamOpenRawResource = null;
        }
        if (inputStreamOpenRawResource != null) {
            return new WebResourceResponse(com.bytedance.sdk.component.adexpress.p124ka.jbs.EnumC2494ri.IMAGE.m8818ri(), "UTF-8", inputStreamOpenRawResource);
        }
        return null;
    }

    /* JADX INFO: renamed from: fi */
    private WebResourceResponse m13686fi(String str) {
        InputStream inputStreamM13475ri;
        if (TextUtils.isEmpty(str) || (inputStreamM13475ri = C3212ri.m13464ri().m13475ri(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("audio/*", "UTF-8", inputStreamM13475ri);
        m13696ri(webResourceResponse);
        return webResourceResponse;
    }

    /* JADX INFO: renamed from: ik */
    private C2525ri m13687ik(String str, com.bytedance.sdk.component.adexpress.p124ka.jbs.EnumC2494ri enumC2494ri) {
        C3287oh.ri riVarM14225di;
        JSONArray jSONArrayM14232ik;
        C3287oh c3287ohM14575zv = this.f10869lr.m14575zv();
        if (c3287ohM14575zv == null || (riVarM14225di = c3287ohM14575zv.m14225di()) == null || (jSONArrayM14232ik = riVarM14225di.m14232ik()) == null || jSONArrayM14232ik.length() <= 0) {
            return null;
        }
        return m13694ri(jSONArrayM14232ik, str, enumC2494ri);
    }

    /* JADX INFO: renamed from: ka */
    private WebResourceResponse m13688ka(String str, com.bytedance.sdk.component.adexpress.p124ka.jbs.EnumC2494ri enumC2494ri) {
        InputStream inputStreamM13605lr;
        if (TextUtils.isEmpty(str) || (inputStreamM13605lr = bgr.m13605lr(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(enumC2494ri.m8818ri(), "UTF-8", inputStreamM13605lr);
        m13696ri(webResourceResponse);
        return webResourceResponse;
    }

    /* JADX INFO: renamed from: ka */
    private String m13689ka() {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10869lr;
        if (wjvVar == null) {
            return null;
        }
        if (wjvVar.sez() != null) {
            return this.f10869lr.sez().m14600sf();
        }
        if (this.f10869lr.m14575zv() != null) {
            return "v3";
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    private C2525ri m13690lr(String str, com.bytedance.sdk.component.adexpress.p124ka.jbs.EnumC2494ri enumC2494ri) {
        C3287oh.ri riVarM14225di;
        JSONArray jSONArrayM14234lr;
        C3287oh c3287ohM14575zv = this.f10869lr.m14575zv();
        if (c3287ohM14575zv == null || (riVarM14225di = c3287ohM14575zv.m14225di()) == null || (jSONArrayM14234lr = riVarM14225di.m14234lr()) == null || jSONArrayM14234lr.length() <= 0) {
            return null;
        }
        return m13694ri(jSONArrayM14234lr, str, enumC2494ri);
    }

    /* JADX INFO: renamed from: ri */
    private WebResourceResponse m13691ri(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamM15836ri = C3491ka.m15836ri(str, str2);
            if (inputStreamM15836ri == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(com.bytedance.sdk.component.adexpress.p124ka.jbs.EnumC2494ri.IMAGE.m8818ri(), C11341A5.f23802O, inputStreamM15836ri);
            try {
                m13696ri(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th) {
                th = th;
                webResourceResponse = webResourceResponse2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        C2707ac.m10206ri("ExpressClient", "get image WebResourceResponse error", th);
        return webResourceResponse;
    }

    /* JADX INFO: renamed from: ri */
    private C2525ri m13692ri(WebView webView, String str) {
        C3286nr c3286nr = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals("local://pag_open_icon_id") || str.equals(C3239lr.f10885ri)) {
            C2525ri c2525ri = new C2525ri();
            c2525ri.m9131ri(5);
            c2525ri.m9132ri(m13685fi());
            return c2525ri;
        }
        com.bytedance.sdk.openadsdk.core.model.wjv.C3296ri c3296riSez = this.f10869lr.sez();
        if (c3296riSez != null && !TextUtils.isEmpty(str) && str.equals(c3296riSez.m14591lr())) {
            C2525ri c2525ri2 = new C2525ri();
            c2525ri2.m9131ri(5);
            WebResourceResponse webResourceResponseM13686fi = m13686fi(str);
            c2525ri2.m9132ri(webResourceResponseM13686fi);
            boolean z = webResourceResponseM13686fi != null;
            Boolean.valueOf(z);
            C3212ri.m13464ri().m13477ri(z);
            return c2525ri2;
        }
        com.bytedance.sdk.component.adexpress.p124ka.jbs.EnumC2494ri enumC2494riM8817ri = com.bytedance.sdk.component.adexpress.p124ka.jbs.m8817ri(str);
        if (bgr.m13607lr(this.f10869lr)) {
            C2525ri c2525riM13693ri = m13693ri(str, enumC2494riM8817ri);
            if (c2525riM13693ri != null) {
                return c2525riM13693ri;
            }
            C2525ri c2525riM13690lr = m13690lr(str, enumC2494riM8817ri);
            if (c2525riM13690lr != null) {
                Log.d("ExpressClient", "interceptTemplate: Hit fetch file cache url=".concat(String.valueOf(str)));
                return c2525riM13690lr;
            }
            C2525ri c2525riM13687ik = m13687ik(str, enumC2494riM8817ri);
            if (c2525riM13687ik != null) {
                return c2525riM13687ik;
            }
        }
        if (enumC2494riM8817ri != com.bytedance.sdk.component.adexpress.p124ka.jbs.EnumC2494ri.IMAGE) {
            for (C3286nr c3286nr2 : this.f10869lr.rbz()) {
                if (!TextUtils.isEmpty(c3286nr2.m14220ri()) && !TextUtils.isEmpty(str)) {
                    String strM14220ri = c3286nr2.m14220ri();
                    if (strM14220ri.startsWith("https")) {
                        strM14220ri = strM14220ri.replaceFirst("https", ProxyConfig.MATCH_HTTP);
                    }
                    if ((str.startsWith("https") ? str.replaceFirst("https", ProxyConfig.MATCH_HTTP) : str).equals(strM14220ri)) {
                        c3286nr = c3286nr2;
                        break;
                    }
                }
            }
        }
        if (enumC2494riM8817ri != com.bytedance.sdk.component.adexpress.p124ka.jbs.EnumC2494ri.IMAGE && c3286nr == null) {
            return C2523lr.m9116ri(str, enumC2494riM8817ri, "", m13689ka());
        }
        C2525ri c2525ri3 = new C2525ri();
        c2525ri3.m9131ri(5);
        c2525ri3.m9132ri(m13691ri(str, C3239lr.m13708ri(this.f10869lr, str)));
        return c2525ri3;
    }

    /* JADX INFO: renamed from: ri */
    private C2525ri m13693ri(String str, com.bytedance.sdk.component.adexpress.p124ka.jbs.EnumC2494ri enumC2494ri) {
        C3287oh.ri riVarM14225di;
        JSONArray jSONArrayM14236ri;
        C3287oh c3287ohM14575zv = this.f10869lr.m14575zv();
        if (c3287ohM14575zv != null && (riVarM14225di = c3287ohM14575zv.m14225di()) != null && (jSONArrayM14236ri = riVarM14225di.m14236ri()) != null && jSONArrayM14236ri.length() > 0) {
            for (int i = 0; i < jSONArrayM14236ri.length(); i++) {
                if (TextUtils.equals(C3155ka.m13171ri(jSONArrayM14236ri.optString(i), C3322sf.m14819lr().m14827ac()), str) && enumC2494ri == com.bytedance.sdk.component.adexpress.p124ka.jbs.EnumC2494ri.IMAGE) {
                    C2525ri c2525ri = new C2525ri();
                    c2525ri.m9131ri(5);
                    c2525ri.m9132ri(m13691ri(str, C2717fi.m10220ri(str)));
                    return c2525ri;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private C2525ri m13694ri(JSONArray jSONArray, String str, com.bytedance.sdk.component.adexpress.p124ka.jbs.EnumC2494ri enumC2494ri) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (TextUtils.equals(C3155ka.m13171ri(jSONArray.optString(i), C3322sf.m14819lr().m14827ac()), str)) {
                    C2525ri c2525ri = new C2525ri();
                    c2525ri.m9131ri(5);
                    c2525ri.m9132ri(m13688ka(str, enumC2494ri));
                    return c2525ri;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private void m13695ri(long j, long j2, String str, int i) {
        if (this.f11804di == null || this.f11804di.m15371lr() == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.p124ka.jbs.EnumC2494ri enumC2494riM8817ri = com.bytedance.sdk.component.adexpress.p124ka.jbs.m8817ri(str);
        if (enumC2494riM8817ri == com.bytedance.sdk.component.adexpress.p124ka.jbs.EnumC2494ri.HTML) {
            this.f11804di.m15371lr().mo15589ri(str, j, j2, i);
        } else if (enumC2494riM8817ri == com.bytedance.sdk.component.adexpress.p124ka.jbs.EnumC2494ri.JS) {
            this.f11804di.m15371lr().mo15586lr(str, j, j2, i);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13696ri(WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, ProxyConfig.MATCH_ALL_SCHEMES);
        webResourceResponse.setResponseHeaders(map);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.xha = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f11809mj = false;
        super.onPageStarted(webView, str, bitmap);
        C2500aw c2500aw = this.f10870qt;
        if (c2500aw != null && c2500aw.wjv() && this.f10872sf) {
            this.f10870qt.m8883ik();
            com.bytedance.sdk.component.utils.bgr.m10210ri(webView, "javascript:window.SDK_INJECT_DATA=" + this.f10870qt.m8883ik());
        }
    }

    /* JADX INFO: renamed from: ri */
    public int m13697ri() {
        for (Integer num : this.f10871ri) {
            if (num.intValue() == 3 || num.intValue() == 2 || num.intValue() == -1) {
                return num.intValue();
            }
        }
        return TextUtils.isEmpty(m13689ka()) ? -1 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th) {
            C2707ac.m10206ri("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        String str2;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2525ri c2525riM13692ri = m13692ri(webView, str);
            str2 = str;
            try {
                m13695ri(jCurrentTimeMillis, System.currentTimeMillis(), str2, (c2525riM13692ri == null || c2525riM13692ri.m9130ri() == null) ? 2 : 1);
                if (c2525riM13692ri != null && c2525riM13692ri.m9129lr() != 5) {
                    c2525riM13692ri.m9129lr();
                    this.f10871ri.add(Integer.valueOf(c2525riM13692ri.m9129lr()));
                }
                if (c2525riM13692ri != null && c2525riM13692ri.m9130ri() != null) {
                    return c2525riM13692ri.m9130ri();
                }
            } catch (Throwable th) {
                th = th;
                C2707ac.m10206ri("ExpressClient", "shouldInterceptRequest error2", th);
            }
        } catch (Throwable th2) {
            th = th2;
            str2 = str;
        }
        return super.shouldInterceptRequest(webView, str2);
    }
}
