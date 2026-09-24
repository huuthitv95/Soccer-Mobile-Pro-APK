package com.mbridge.msdk.mbnative.controller;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.f */
/* JADX INFO: compiled from: Views.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13336f {
    /* JADX INFO: renamed from: a */
    public static View m38553a(Context context, View view) {
        View viewM38552a = m38552a(context);
        return viewM38552a != null ? viewM38552a : m38554a(view);
    }

    /* JADX INFO: renamed from: a */
    private static View m38552a(Context context) {
        if (context != null && (context instanceof Activity)) {
            return ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static View m38554a(View view) {
        if (view == null) {
            return null;
        }
        try {
            ViewCompat.isAttachedToWindow(view);
        } catch (Throwable unused) {
        }
        try {
            View rootView = view.getRootView();
            if (rootView == null) {
                return null;
            }
            View viewFindViewById = rootView.findViewById(R.id.content);
            return viewFindViewById != null ? viewFindViewById : rootView;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
