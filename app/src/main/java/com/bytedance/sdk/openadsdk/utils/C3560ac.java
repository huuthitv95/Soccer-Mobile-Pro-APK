package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2735zf;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ac */
/* JADX INFO: loaded from: classes3.dex */
public class C3560ac {

    /* JADX INFO: renamed from: ri */
    private static int f13123ri;

    /* JADX INFO: renamed from: lr */
    private static final LinkedHashMap<String, SoftReference<ri>> f13122lr = new LinkedHashMap<String, SoftReference<ri>>(f13123ri, 0.75f, true) { // from class: com.bytedance.sdk.openadsdk.utils.ac.1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, SoftReference<ri>> entry) {
            ri riVar;
            if (size() <= C3560ac.f13123ri) {
                return false;
            }
            SoftReference<ri> value = entry.getValue();
            if (value == null || (riVar = value.get()) == null || riVar.f13125ri == null) {
                return true;
            }
            try {
                C2735zf.m10345ri(riVar.f13125ri);
                return true;
            } catch (Throwable unused) {
                entry.getKey();
                return true;
            }
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ac$ri */
    private static class ri {

        /* JADX INFO: renamed from: lr */
        Bundle f13124lr;

        /* JADX INFO: renamed from: ri */
        C2634di f13125ri;

        ri(C2634di c2634di, Bundle bundle) {
            this.f13125ri = c2634di;
            this.f13124lr = bundle;
        }
    }

    /* JADX INFO: renamed from: lr */
    private static void m16359lr() {
        ri riVar;
        synchronized (f13122lr) {
            while (true) {
                LinkedHashMap<String, SoftReference<ri>> linkedHashMap = f13122lr;
                if (linkedHashMap.size() > f13123ri) {
                    SoftReference<ri> softReferenceRemove = linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                    if (softReferenceRemove != null && (riVar = softReferenceRemove.get()) != null && riVar.f13125ri != null) {
                        C2735zf.m10345ri(riVar.f13125ri);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static Bundle m16361ri(String str) {
        if (f13123ri <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<ri>> linkedHashMap = f13122lr;
        synchronized (linkedHashMap) {
            SoftReference<ri> softReference = linkedHashMap.get(str);
            if (softReference == null) {
                return null;
            }
            ri riVar = softReference.get();
            return riVar != null ? riVar.f13124lr : null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C2634di m16362ri(Context context, String str) {
        if (f13123ri <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<ri>> linkedHashMap = f13122lr;
        synchronized (linkedHashMap) {
            SoftReference<ri> softReferenceRemove = linkedHashMap.remove(str);
            if (softReferenceRemove == null) {
                return null;
            }
            ri riVar = softReferenceRemove.get();
            if (riVar != null && riVar.f13125ri != null) {
                m16364ri(riVar.f13125ri, context);
                return riVar.f13125ri;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m16363ri(WebView webView) {
        if (webView != null && f13123ri > 0) {
            try {
                webView.evaluateJavascript("[].forEach.call(document.querySelectorAll('audio,video'), function(audio) { try { audio.pause(); } catch(e) {} })", null);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m16364ri(C2634di c2634di, Context context) {
        try {
            if (c2634di.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) c2634di.getContext()).setBaseContext(context.getApplicationContext());
            }
        } catch (ClassCastException unused) {
        }
        ViewGroup viewGroup = (ViewGroup) c2634di.getParent();
        if (viewGroup != null) {
            try {
                viewGroup.removeView(c2634di);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16365ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar == null) {
            f13123ri = 0;
        } else {
            f13123ri = Math.max(0, wjvVar.xha());
        }
        m16359lr();
    }

    /* JADX INFO: renamed from: ri */
    public static void m16366ri(String str, C2634di c2634di, Bundle bundle) {
        if (f13123ri <= 0 || TextUtils.isEmpty(str) || c2634di == null) {
            return;
        }
        LinkedHashMap<String, SoftReference<ri>> linkedHashMap = f13122lr;
        synchronized (linkedHashMap) {
            m16363ri(c2634di.getWebView());
            m16364ri(c2634di, c2634di.getContext());
            synchronized (linkedHashMap) {
                linkedHashMap.put(str, new SoftReference<>(new ri(c2634di, bundle)));
            }
        }
        linkedHashMap.size();
    }
}
