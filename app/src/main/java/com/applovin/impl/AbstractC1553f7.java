package com.applovin.impl;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.applovin.impl.f7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1553f7 {
    /* JADX INFO: renamed from: a */
    public static Boolean m2619a(int i, String str) {
        if (!m2620a(str)) {
            return null;
        }
        String[] strArrSplit = str.split("~", -1);
        List listAsList = Arrays.asList(strArrSplit[1].split("\\."));
        String strValueOf = String.valueOf(i);
        boolean zContains = listAsList.contains(strValueOf);
        if (strArrSplit[0].equals("1")) {
            return Boolean.valueOf(zContains);
        }
        if (zContains) {
            return Boolean.TRUE;
        }
        if (Arrays.asList(strArrSplit[2].split("\\.")).contains(strValueOf)) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2620a(String str) {
        if (str != null && str.length() >= 2) {
            String[] strArrSplit = str.split("~", -1);
            if (strArrSplit.length == 2 && "1".equals(strArrSplit[0])) {
                return Pattern.matches("(\\d+(\\.\\d+)*)?", strArrSplit[1]);
            }
            if (strArrSplit.length == 3 && "2".equals(strArrSplit[0]) && Pattern.matches("(\\d+(\\.\\d+)*)?", strArrSplit[1]) && strArrSplit[2].length() >= 3 && strArrSplit[2].startsWith("dv.") && Pattern.matches("(\\d+(\\.\\d+)*)?", strArrSplit[2].substring(3))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2621a(String str, int i) {
        return str != null && i >= 0 && str.length() > i && str.charAt(i) == '1';
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2622b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : str.split("\\.")) {
            if (!m2623c(str2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m2623c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^[a-zA-Z\\d_-]*$");
    }
}
