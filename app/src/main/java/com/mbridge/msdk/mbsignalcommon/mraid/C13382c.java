package com.mbridge.msdk.mbsignalcommon.mraid;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13387a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mraid.c */
/* JADX INFO: compiled from: MraidUriUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13382c {

    /* JADX INFO: renamed from: a */
    private static volatile ConcurrentHashMap<String, String> f37121a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    private static ArrayList<String> f37122b = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public static C13387a m38696a(WindVaneWebView windVaneWebView, String str) {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains(CampaignEx.JSON_KEY_MRAID)) {
            return null;
        }
        C13387a c13387a = new C13387a();
        c13387a.f37158d = C13207k0.m37712a("n+ztLkxpVTzBLkxgHN==");
        c13387a.f37159e = uri.getHost();
        if (f37122b.size() == 0) {
            m38698a();
        }
        if (!f37122b.contains(c13387a.f37159e) && windVaneWebView != null) {
            m38700a(windVaneWebView.getCampaignId(), c13387a.f37159e);
            C13380a.m38682a().m38692b(windVaneWebView, c13387a.f37159e);
            C13380a.m38682a().m38688a(windVaneWebView, c13387a.f37159e, "Specified command is not implemented");
            return null;
        }
        Set<String> setM38697a = m38697a(uri);
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : setM38697a) {
                jSONObject.put(str2, uri.getQueryParameter(str2));
            }
            c13387a.f37160f = jSONObject.toString();
            return c13387a;
        } catch (Exception e) {
            e.printStackTrace();
            return c13387a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m38701b(String str) {
        if (f37121a.containsKey(str)) {
            return f37121a.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static Set<String> m38697a(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int iIndexOf = encodedQuery.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = encodedQuery.length();
            }
            int iIndexOf2 = encodedQuery.indexOf(61, i);
            if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, iIndexOf2)));
            i = iIndexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: renamed from: a */
    private static void m38698a() {
        for (Method method : InterfaceC13381b.class.getDeclaredMethods()) {
            f37122b.add(method.getName());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m38700a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (f37121a.containsKey(str)) {
            String strConcat = f37121a.get(str);
            if (TextUtils.isEmpty(str2) || strConcat.contains(str2)) {
                return;
            }
            if (strConcat.length() > 0) {
                strConcat = strConcat.concat(",");
            }
            f37121a.put(str, strConcat.concat(str2));
            return;
        }
        f37121a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m38699a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f37121a.remove(str);
    }
}
