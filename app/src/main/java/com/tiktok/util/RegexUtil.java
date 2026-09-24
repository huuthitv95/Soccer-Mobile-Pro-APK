package com.tiktok.util;

import android.text.TextUtils;
import com.tiktok.appevents.TTUserInfo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class RegexUtil {
    public static String replaceAllToHash(String regex, String origin) {
        try {
            if (!TextUtils.isEmpty(regex) && !TextUtils.isEmpty(origin)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile(regex).matcher(origin);
                while (matcher.find()) {
                    matcher.appendReplacement(stringBuffer, TTUserInfo.toSha256(matcher.group()));
                }
                matcher.appendTail(stringBuffer);
                return stringBuffer.toString();
            }
            return origin;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean validateAppId(String appId) {
        try {
            return Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]*(\\.[a-zA-Z][a-zA-Z0-9_]*)+$").matcher(appId).matches();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean validateTTAppId(String ttAppId) {
        try {
            return Pattern.compile("^(\\d+,)*\\d+$").matcher(ttAppId).matches();
        } catch (Throwable unused) {
            return false;
        }
    }
}
