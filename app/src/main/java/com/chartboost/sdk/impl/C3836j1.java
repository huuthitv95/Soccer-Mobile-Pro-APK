package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.j1 */
/* JADX INFO: loaded from: classes3.dex */
public class C3836j1 {

    /* JADX INFO: renamed from: a */
    public static C3836j1 f14812a = new C3836j1();

    /* JADX INFO: renamed from: b */
    public static C3836j1 m18133b() {
        return f14812a;
    }

    /* JADX INFO: renamed from: a */
    public Task m18134a(Context context) {
        try {
            return AppSet.getClient(context).getAppSetIdInfo();
        } catch (Exception e) {
            C4048sb.m19410b("Cannot retrieve appSetId client", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m18135a() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: a */
    public boolean m18136a(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence);
    }
}
