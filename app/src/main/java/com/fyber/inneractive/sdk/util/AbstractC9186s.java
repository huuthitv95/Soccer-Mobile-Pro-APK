package com.fyber.inneractive.sdk.util;

import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.EnumC8397n;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.s */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9186s {
    /* JADX INFO: renamed from: a */
    public static FilterInputStream m22010a(HttpURLConnection httpURLConnection) {
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return TextUtils.equals("gzip", httpURLConnection.getContentEncoding()) ? new GZIPInputStream(inputStream) : new BufferedInputStream(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m22011a(String str, int i, int i2) throws Exception {
        String string;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.connect();
            FilterInputStream filterInputStreamM22010a = m22010a(httpURLConnection);
            String strM22013b = m22013b(httpURLConnection);
            if (!TextUtils.isEmpty(strM22013b)) {
                httpURLConnection.disconnect();
                return m22011a(strM22013b, i2, i);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                IAlog.m21945a("isResponseValid: found invalid response status: %s", Integer.toString(responseCode));
                string = null;
            } else {
                string = AbstractC9195v.m22033b((InputStream) filterInputStreamM22010a).toString();
            }
            httpURLConnection.disconnect();
            return string;
        } catch (Exception e) {
            IAlog.m21944a("getBodyFromUrl failed with exception", e, new Object[0]);
            throw e;
        } catch (Throwable th) {
            IAlog.m21944a("getBodyFromUrl failed with error", th, new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m22012a() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* JADX INFO: renamed from: b */
    public static String m22013b(HttpURLConnection httpURLConnection) throws Exception {
        int responseCode = httpURLConnection.getResponseCode();
        if ((responseCode <= 300 || responseCode >= 304) && responseCode != 307 && responseCode != 308) {
            return null;
        }
        IAlog.m21945a("getRedirectUrl: received redirect code %s", Integer.toString(responseCode));
        String headerField = httpURLConnection.getHeaderField(EnumC8397n.LOCATION.m20774a());
        if (!TextUtils.isEmpty(headerField)) {
            IAlog.m21945a("getRedirectUrl: redirecting target url: %s", headerField);
            return headerField;
        }
        throw new Exception("Server returned HTTP " + Integer.toString(responseCode) + " with empty location header!");
    }
}
