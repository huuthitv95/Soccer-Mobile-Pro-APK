package com.mbridge.msdk.dycreator.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.dycreator.engine.C12972b;
import java.io.File;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.utils.f */
/* JADX INFO: compiled from: InflaterUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12983f {

    /* JADX INFO: renamed from: b */
    private static volatile C12983f f35378b;

    /* JADX INFO: renamed from: a */
    private C12972b f35379a;

    private C12983f(Context context) {
        this.f35379a = null;
        C12972b c12972bM36361a = C12972b.m36361a();
        this.f35379a = c12972bM36361a;
        c12972bM36361a.m36365a(context, "");
    }

    /* JADX INFO: renamed from: a */
    public static C12983f m36417a(Context context) {
        if (f35378b == null) {
            synchronized (C12983f.class) {
                if (f35378b == null) {
                    f35378b = new C12983f(context.getApplicationContext());
                }
            }
        }
        return f35378b;
    }

    /* JADX INFO: renamed from: a */
    public View m36419a(String str) {
        if (new File(str).exists()) {
            return this.f35379a.m36373e(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public View m36418a(ViewGroup viewGroup, String str) {
        if (viewGroup != null && !TextUtils.isEmpty(str)) {
            if (viewGroup.getId() == str.hashCode()) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getId() == str.hashCode()) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    m36418a((ViewGroup) childAt, str);
                }
            }
        }
        return null;
    }
}
