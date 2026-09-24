package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.jbs.C2635fi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.zf */
/* JADX INFO: loaded from: classes3.dex */
public class C2735zf {

    /* JADX INFO: renamed from: ri */
    private static final HashMap<String, ri> f7801ri = new HashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.zf$ri */
    private static class ri {

        /* JADX INFO: renamed from: ka */
        private final String f7805ka;

        /* JADX INFO: renamed from: lr */
        public final int f7806lr;

        /* JADX INFO: renamed from: ri */
        public final HashSet<String> f7807ri = new HashSet<>();

        /* JADX INFO: renamed from: ik */
        private final ArrayList<WebView> f7804ik = new ArrayList<>();

        public ri(String str, JSONObject jSONObject) {
            this.f7805ka = str;
            this.f7806lr = jSONObject.optInt("max_count");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("scene");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.f7807ri.add(strOptString);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ik */
        public int m10347ik() {
            return this.f7804ik.size();
        }

        /* JADX INFO: renamed from: lr */
        public WebView m10348lr() {
            if (this.f7804ik.isEmpty()) {
                return null;
            }
            return this.f7804ik.remove(0);
        }

        /* JADX INFO: renamed from: ri */
        public HashSet<String> m10349ri() {
            return this.f7807ri;
        }

        /* JADX INFO: renamed from: ri */
        public boolean m10350ri(WebView webView) {
            if (webView != null && this.f7804ik.size() < this.f7806lr && !this.f7804ik.contains(webView)) {
                Context context = webView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    if (webView instanceof C2635fi) {
                        ((C2635fi) webView).setRecycler(true);
                    }
                    ViewParent parent = webView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(webView);
                    }
                    this.f7804ik.add(webView);
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: lr */
    public static WebView m10337lr(Context context, AttributeSet attributeSet, int i, C2634di.ik ikVar) {
        return m10341ri(context, attributeSet, i, ikVar, true);
    }

    /* JADX INFO: renamed from: lr */
    public static void m10338lr(C2634di c2634di) {
        if (c2634di == null) {
            return;
        }
        try {
            c2634di.removeAllViews();
            c2634di.xha();
            c2634di.setWebChromeClient(null);
            c2634di.setWebViewClient(null);
            c2634di.setDownloadListener(null);
            c2634di.setJavaScriptEnabled(true);
            c2634di.setCacheMode(-1);
            c2634di.setSupportZoom(false);
            c2634di.setUseWideViewPort(true);
            c2634di.setJavaScriptCanOpenWindowsAutomatically(true);
            c2634di.setDomStorageEnabled(true);
            c2634di.setBuiltInZoomControls(false);
            c2634di.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            c2634di.setLoadWithOverviewMode(false);
            c2634di.setDefaultTextEncodingName("UTF-8");
            c2634di.setDefaultFontSize(16);
            WebView webView = c2634di.getWebView();
            if (webView instanceof C2635fi) {
                ((C2635fi) webView).m9793ri();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m10339lr(C2634di.ik ikVar) {
        return (ikVar == null || f7801ri.get(ikVar.f7450aw) == null) ? false : true;
    }

    /* JADX INFO: renamed from: ri */
    public static int m10340ri(C2634di.ik ikVar) {
        ri riVar;
        if (ikVar == null || (riVar = f7801ri.get(ikVar.f7450aw)) == null) {
            return 0;
        }
        return riVar.m10347ik();
    }

    /* JADX INFO: renamed from: ri */
    private static WebView m10341ri(Context context, AttributeSet attributeSet, int i, C2634di.ik ikVar, boolean z) {
        WebView webViewM10348lr;
        ri riVar;
        if (ikVar == null || attributeSet != null || i != 0 || (riVar = f7801ri.get(ikVar.f7450aw)) == null) {
            webViewM10348lr = null;
        } else {
            webViewM10348lr = riVar.m10348lr();
            if (webViewM10348lr != null) {
                if (webViewM10348lr instanceof C2635fi) {
                    ((C2635fi) webViewM10348lr).setRecycler(false);
                }
                m10344ri(ikVar, false);
            }
        }
        if (webViewM10348lr != null || !z) {
            return webViewM10348lr;
        }
        if (!(context instanceof MutableContextWrapper)) {
            context = new MutableContextWrapper(context);
        }
        m10344ri(ikVar, true);
        return i != 0 ? new C2635fi(context, attributeSet, i) : new C2635fi(context, attributeSet);
    }

    /* JADX INFO: renamed from: ri */
    public static C2634di m10342ri(Context context, AttributeSet attributeSet, int i, C2634di.ik ikVar) {
        WebView webViewM10341ri = m10341ri(context, attributeSet, i, ikVar, false);
        if (webViewM10341ri == null) {
            return null;
        }
        C2634di c2634di = new C2634di(context, true, ikVar);
        c2634di.setWebView(webViewM10341ri);
        c2634di.m9773fi();
        return c2634di;
    }

    /* JADX INFO: renamed from: ri */
    private static void m10343ri(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            Context context = webView.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m10344ri(final C2634di.ik ikVar, final boolean z) {
        wjv.m10320ri("webview_allocate", new wjv.AbstractC2732ri() { // from class: com.bytedance.sdk.component.utils.zf.1
            @Override // com.bytedance.sdk.component.utils.wjv.AbstractC2732ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10323ri() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z ? 1 : 0);
                    jSONObject.put("scene", ikVar.f7450aw);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m10345ri(C2634di c2634di) {
        WebView webView;
        if (c2634di == null || (webView = c2634di.getWebView()) == null) {
            return;
        }
        ri riVar = f7801ri.get(c2634di.getScene().f7450aw);
        if (riVar == null || !riVar.m10350ri(webView)) {
            m10343ri(webView);
        } else {
            m10338lr(c2634di);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m10346ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    ri riVar = new ri(next, jSONObject.getJSONObject(next));
                    Iterator<String> it = riVar.m10349ri().iterator();
                    while (it.hasNext()) {
                        f7801ri.put(it.next(), riVar);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
