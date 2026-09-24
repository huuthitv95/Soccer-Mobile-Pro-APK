package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.net.MailTo;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.h0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9154h0 extends AbstractC9174o {
    /* JADX INFO: renamed from: a */
    public static HashMap m21964a(Uri uri) {
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            map.put(str, uri.getQueryParameter(str));
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21965a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21966a(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("googlechrome://navigate?url=" + str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            IAlog.m21950f("Failed opening chrome for a special uri.", new Object[0]);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m21967c(String str) {
        return str.startsWith("http%3A%2F%2F") || str.startsWith("https%3A%2F%2F") || str.startsWith("%");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m21968d(String str) {
        if (!str.startsWith("tel:") && !str.startsWith("voicemail:") && !str.startsWith("sms:") && !str.startsWith(MailTo.MAILTO_SCHEME) && !str.startsWith("geo:") && !str.startsWith("google.streetview:")) {
            try {
                new URL(str);
                return false;
            } catch (MalformedURLException unused) {
                IAlog.m21950f("Failed to open Url: %s", str);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m21969e(String str) {
        Uri uri;
        if (!AbstractC9195v.m22030a(str)) {
            return false;
        }
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            IAlog.m21945a("IAJavaUtil: getValidUri: Invalid url %s", str);
            uri = null;
        }
        if (uri != null && AbstractC9195v.m22030a(uri.getScheme())) {
            return AbstractC9195v.m22030a(uri.getHost());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m21970f(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!AbstractC9186s.m22012a() || IAConfigManager.f17654M.f17685q) {
            return (str.startsWith("http://") || str.startsWith("http%3A%2F%2F")) ? false : true;
        }
        return true;
    }
}
