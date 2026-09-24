package com.ironsource;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.pg */
/* JADX INFO: loaded from: classes6.dex */
public final class C12430pg {
    /* JADX INFO: renamed from: a */
    public static final boolean m33116a(View view, Rect rect) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        return view.isShown() && view.hasWindowFocus() && view.getGlobalVisibleRect(rect);
    }
}
