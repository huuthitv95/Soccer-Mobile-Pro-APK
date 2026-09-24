package com.bytedance.sdk.component.adexpress.dynamic.p120lr;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2479ri {
    /* JADX INFO: renamed from: ri */
    public static int m8734ri(xha xhaVar) {
        if (xhaVar == null) {
            return 0;
        }
        String strM8703ig = xhaVar.m8703ig();
        String strM8695ay = xhaVar.m8695ay();
        if (TextUtils.isEmpty(strM8695ay) || TextUtils.isEmpty(strM8703ig) || !strM8695ay.equals("creative")) {
            return 0;
        }
        if (strM8703ig.equals("shake")) {
            return 2;
        }
        if (strM8703ig.equals("twist")) {
            return 3;
        }
        return strM8703ig.equals("slide") ? 1 : 0;
    }
}
