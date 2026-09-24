package com.mbridge.msdk.mbsignalcommon.windvane;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.windvane.i */
/* JADX INFO: compiled from: WindVaneUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13395i {

    /* JADX INFO: renamed from: a */
    private static final String[] f37188a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};

    /* JADX INFO: renamed from: b */
    private static final Pattern f37189b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: c */
    private static final Pattern f37190c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: d */
    private static final Pattern f37191d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: e */
    private static final Pattern f37192e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: f */
    private static Map<String, String> f37193f = new HashMap();

    static {
        for (EnumC13390d enumC13390d : EnumC13390d.values()) {
            f37193f.put(enumC13390d.m38719h(), enumC13390d.m38718g());
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m38737a(String str) {
        char[] cArr = {'\'', AbstractJsonLexerKt.STRING_ESC};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 255) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        stringBuffer.append(cCharAt);
                        break;
                    }
                    if (cArr[i2] == cCharAt) {
                        stringBuffer.append("\\" + cCharAt);
                        break;
                    }
                    i2++;
                }
            } else {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(cCharAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(cCharAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase2);
            }
        }
        return new String(stringBuffer);
    }

    /* JADX INFO: renamed from: b */
    public static String m38738b(String str) {
        String str2 = f37193f.get(m38740d(str));
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: c */
    public static Pattern m38739c(String str) {
        if ("wv_hybrid:".equals(str)) {
            return f37192e;
        }
        if ("mraid:".equals(str)) {
            return f37190c;
        }
        if ("ssp:".equals(str)) {
            return f37191d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return f37192e;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m38740d(String str) {
        String path;
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (iLastIndexOf = path.lastIndexOf(".")) == -1) ? "" : path.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m38741e(String str) {
        return m38738b(str).startsWith("image");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m38742f(String str) {
        for (String str2 : f37188a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
