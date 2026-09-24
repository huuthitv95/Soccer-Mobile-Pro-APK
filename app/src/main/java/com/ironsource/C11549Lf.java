package com.ironsource;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.ironsource.Lf */
/* JADX INFO: loaded from: classes6.dex */
public final class C11549Lf {

    /* JADX INFO: renamed from: a */
    public static final C11549Lf f25085a = new C11549Lf();

    /* JADX INFO: renamed from: b */
    private static final String f25086b = ",";

    /* JADX INFO: renamed from: c */
    private static final String f25087c = "[";

    /* JADX INFO: renamed from: d */
    private static final String f25088d = "]";

    /* JADX INFO: renamed from: e */
    private static final int f25089e = 118;

    private C11549Lf() {
    }

    /* JADX INFO: renamed from: a */
    public final List<Object> m26441a(Object... items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return CollectionsKt.listOf(Arrays.copyOf(items, items.length));
    }

    /* JADX INFO: renamed from: b */
    public final String m26442b(List<? extends Object> methodArgs) {
        Intrinsics.checkNotNullParameter(methodArgs, "methodArgs");
        String str = new String();
        for (Object obj : methodArgs) {
            str = ((Object) (((Object) str) + (obj instanceof List ? f25085a.m26437a((List<?>) obj) : f25085a.m26436a(obj)))) + f25086b;
        }
        return StringsKt.removeSuffix(str, (CharSequence) f25086b);
    }

    /* JADX INFO: renamed from: a */
    private final String m26437a(List<?> list) {
        Iterator<?> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = ((Object) str) + f25085a.m26436a(it.next()) + f25086b;
        }
        return ((Object) StringsKt.removeSuffix(str, (CharSequence) f25086b)) + "]";
    }

    /* JADX INFO: renamed from: a */
    private final String m26436a(Object obj) {
        if (obj instanceof String) {
            return "'" + obj + "'";
        }
        return String.valueOf(obj);
    }

    /* JADX INFO: renamed from: a */
    public final AdInfo m26439a(LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(levelPlayAdInfo, "<this>");
        return new AdInfo(new C11698U8(levelPlayAdInfo), null);
    }

    /* JADX INFO: renamed from: a */
    public final IronSourceError m26440a(LevelPlayAdError levelPlayAdError) {
        Intrinsics.checkNotNullParameter(levelPlayAdError, "<this>");
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    /* JADX INFO: renamed from: a */
    public final ViewGroup.LayoutParams m26438a(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        layoutParams.bottomMargin = m26435a(context, 118);
        return layoutParams;
    }

    /* JADX INFO: renamed from: a */
    private final int m26435a(Context context, int i) {
        Resources resources;
        DisplayMetrics displayMetrics;
        return (int) (i * ((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density));
    }
}
