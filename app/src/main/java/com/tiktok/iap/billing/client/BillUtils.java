package com.tiktok.iap.billing.client;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class BillUtils {
    private static final Pattern P_JSON = Pattern.compile("jsonString='(.*?)'");

    public static String parserJsonFromProductDetail(String data) {
        if (TextUtils.isEmpty(data) || !data.contains("jsonString=")) {
            return null;
        }
        try {
            Matcher matcher = P_JSON.matcher(data);
            if (matcher.find()) {
                return matcher.group(1);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
