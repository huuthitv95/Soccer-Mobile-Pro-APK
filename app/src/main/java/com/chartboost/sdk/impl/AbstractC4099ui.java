package com.chartboost.sdk.impl;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ui */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4099ui {

    /* JADX INFO: renamed from: a */
    public static final Regex f16499a = new Regex("^market://details\\?id=(.*)$");

    /* JADX INFO: renamed from: a */
    public static final String m19603a(C4055si c4055si) {
        List<String> groupValues;
        MatchResult matchResultMatchEntire = f16499a.matchEntire(c4055si.m19439b());
        if (matchResultMatchEntire == null || (groupValues = matchResultMatchEntire.getGroupValues()) == null) {
            return null;
        }
        return (String) CollectionsKt.getOrNull(groupValues, 1);
    }

    /* JADX INFO: renamed from: b */
    public static final C4055si m19604b(C4055si c4055si) {
        Intrinsics.checkNotNullParameter(c4055si, "<this>");
        String strM19603a = m19603a(c4055si);
        if (strM19603a == null) {
            return c4055si;
        }
        String str = String.format("https://play.google.com/store/apps/details?id=%s", Arrays.copyOf(new Object[]{strM19603a}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        C4055si c4055siM19436a = C4055si.m19436a(c4055si, str, null, false, 6, null);
        return c4055siM19436a == null ? c4055si : c4055siM19436a;
    }
}
