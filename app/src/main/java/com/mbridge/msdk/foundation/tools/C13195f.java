package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.f */
/* JADX INFO: compiled from: BaseDomainSameTool.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13195f {
    /* JADX INFO: renamed from: a */
    public static boolean m37673a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android")) > 0;
        } catch (Throwable th) {
            C13219q0.m37817b("DomainSameTool", th.getMessage(), th);
            return false;
        }
    }
}
