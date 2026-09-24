package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ic */
/* JADX INFO: loaded from: classes3.dex */
public final class C3824ic extends AbstractC3762fj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3824ic(String elementName, Integer num) {
        super("Missing required element: " + elementName + ".", num);
        Intrinsics.checkNotNullParameter(elementName, "elementName");
    }

    public /* synthetic */ C3824ic(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 101 : num);
    }
}
