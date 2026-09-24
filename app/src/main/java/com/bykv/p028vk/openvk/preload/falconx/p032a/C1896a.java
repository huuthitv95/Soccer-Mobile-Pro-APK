package com.bykv.p028vk.openvk.preload.falconx.p032a;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a;
import com.bykv.p028vk.openvk.preload.p029a.p031b.C1884b;
import com.ironsource.C11341A5;
import com.ironsource.C11744X3;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.falconx.a.a */
/* JADX INFO: compiled from: WebResourceUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1896a {

    /* JADX INFO: renamed from: a */
    private final Map<Class<? extends AbstractC1886d<?, ?>>, C1884b> f4285a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static WebResourceResponse m5881a(InputStream inputStream, Map<String, String> map) {
        if (inputStream == null) {
            return null;
        }
        try {
            String strReplace = map.get("content-type");
            String[] strArrSplit = new String[0];
            if (TextUtils.isEmpty(strReplace)) {
                strReplace = map.get("Content-Type");
            }
            if (!TextUtils.isEmpty(strReplace) && strReplace != null) {
                strReplace = strReplace.replace(" ", "");
                strArrSplit = strReplace.split(";");
            }
            String str = "";
            String strSubstring = str;
            for (String str2 : strArrSplit) {
                if (!TextUtils.isEmpty(str2)) {
                    int iIndexOf = str2.indexOf(C11744X3.j.f26434b);
                    if (iIndexOf == -1) {
                        str = str2;
                    } else if (str2.contains(C11341A5.f23801N)) {
                        strSubstring = str2.substring(iIndexOf + 1);
                    }
                }
            }
            if (strReplace != null ? strReplace.contains("font/ttf") : false) {
                return new WebResourceResponse(str, strSubstring, 200, "OK", map, inputStream);
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, strSubstring, inputStream);
            webResourceResponse.setResponseHeaders(map);
            return webResourceResponse;
        } catch (Throwable th) {
            Log.e("WebResourceUtils", "getResponseWithHeaders error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m5882a(JSONObject jSONObject, String str, Class<T> cls) {
        Object objOpt;
        if (jSONObject.has(str) && (objOpt = jSONObject.opt(str)) != null && objOpt != JSONObject.NULL) {
            try {
                if (cls == Double.class) {
                    if (objOpt instanceof Double) {
                        return (T) ((Double) objOpt);
                    }
                    if (objOpt instanceof Number) {
                        return (T) Double.valueOf(((Number) objOpt).doubleValue());
                    }
                    return null;
                }
                if (cls == Integer.class) {
                    if (objOpt instanceof Integer) {
                        return (T) ((Integer) objOpt);
                    }
                    if (objOpt instanceof Number) {
                        return (T) Integer.valueOf(((Number) objOpt).intValue());
                    }
                    return null;
                }
                if (cls == Long.class) {
                    if (objOpt instanceof Long) {
                        return (T) ((Long) objOpt);
                    }
                    if (objOpt instanceof Number) {
                        return (T) Long.valueOf(((Number) objOpt).longValue());
                    }
                    return null;
                }
                if (cls == String.class) {
                    if (objOpt instanceof String) {
                        return (T) ((String) objOpt);
                    }
                    return null;
                }
                if (cls == Boolean.class && (objOpt instanceof Boolean)) {
                    return (T) ((Boolean) objOpt);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1883a m5883a(Class<? extends AbstractC1886d<?, ?>> cls) {
        C1884b c1884b;
        synchronized (this.f4285a) {
            c1884b = this.f4285a.get(cls);
        }
        return c1884b;
    }

    /* JADX INFO: renamed from: a */
    public final void m5884a(Class<? extends AbstractC1886d<?, ?>> cls, AbstractC1883a abstractC1883a) {
        synchronized (this.f4285a) {
            C1884b c1884b = this.f4285a.get(cls);
            if (c1884b == null) {
                c1884b = new C1884b(new AbstractC1883a[0]);
                this.f4285a.put(cls, c1884b);
            }
            c1884b.m5844a(abstractC1883a);
        }
    }
}
