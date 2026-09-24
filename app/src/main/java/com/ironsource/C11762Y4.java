package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: renamed from: com.ironsource.Y4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11762Y4 {

    /* JADX INFO: renamed from: a */
    public static final C11762Y4 f26580a = new C11762Y4();

    private C11762Y4() {
    }

    /* JADX INFO: renamed from: a */
    private final int m28007a(Context context, int i) {
        return MathKt.roundToInt(i / context.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: b */
    public final int m28009b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m28007a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    /* JADX INFO: renamed from: a */
    public final int m28008a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m28007a(context, context.getResources().getDisplayMetrics().heightPixels);
    }
}
