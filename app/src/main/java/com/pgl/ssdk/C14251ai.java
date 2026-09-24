package com.pgl.ssdk;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.pgl.ssdk.ai */
/* JADX INFO: loaded from: classes7.dex */
public class C14251ai {
    /* JADX INFO: renamed from: a */
    public static String m42949a(String str) {
        String[] strArrM42950b = m42950b(str);
        ArrayList arrayList = new ArrayList();
        if (strArrM42950b != null && strArrM42950b.length > 0) {
            for (String str2 : strArrM42950b) {
                try {
                    Class.forName(str2);
                    arrayList.add(str2);
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String[] m42950b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("//");
    }
}
