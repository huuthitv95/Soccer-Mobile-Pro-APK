package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URL;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.c1 */
/* JADX INFO: compiled from: UriUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13188c1 {
    /* JADX INFO: renamed from: a */
    public static String m37644a(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? "" : new URL(str).getHost();
        } catch (Exception e) {
            C13219q0.m37816b("UriUtil", e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m37646b(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : new URL(str).getPath();
        } catch (Exception e) {
            C13219q0.m37816b("UriUtil", e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m37647c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            if (URLUtil.isValidUrl(str) || m37649e(str)) {
                return Uri.parse(str).getQueryParameterNames().size();
            }
            return 0;
        } catch (Exception e) {
            C13219q0.m37816b("UriUtil", e.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m37648d(String str) {
        try {
            Uri uri = Uri.parse(str);
            return uri.getScheme() + "://" + uri.getHost() + uri.getPath();
        } catch (Exception e) {
            C13219q0.m37816b("UriUtil", e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m37649e(String str) {
        return str != null && str.length() > 5 && str.substring(0, 6).equalsIgnoreCase("tcp://");
    }

    /* JADX INFO: renamed from: a */
    public static String m37645a(String str, String str2) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : Uri.parse(str).getQueryParameter(str2);
        } catch (Exception e) {
            C13219q0.m37816b("UriUtil", e.getMessage());
            return "";
        }
    }
}
