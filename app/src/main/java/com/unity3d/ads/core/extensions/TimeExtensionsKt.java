package com.unity3d.ads.core.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.TimeMark;

/* JADX INFO: compiled from: TimeExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m43475d2 = {"elapsedMillis", "", "Lkotlin/time/TimeMark;", "unity-ads_defaultRelease"}, m43476k = 2, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class TimeExtensionsKt {
    public static final double elapsedMillis(TimeMark timeMark) {
        Intrinsics.checkNotNullParameter(timeMark, "<this>");
        return Duration.m46327toDoubleimpl(timeMark.mo46281elapsedNowUwyO8pc(), DurationUnit.MILLISECONDS);
    }
}
