package com.unity3d.mediation;

import com.ironsource.C12136ce;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayInitError {

    /* JADX INFO: renamed from: a */
    private final int f41473a;

    /* JADX INFO: renamed from: b */
    private final String f41474b;

    public LevelPlayInitError(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f41473a = i;
        this.f41474b = errorMessage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(C12136ce sdkError) {
        this(sdkError.m31274c(), sdkError.m31275d());
        Intrinsics.checkNotNullParameter(sdkError, "sdkError");
    }

    public final int getErrorCode() {
        return this.f41473a;
    }

    public final String getErrorMessage() {
        return this.f41474b;
    }

    public String toString() {
        return "LevelPlayError(errorCode=" + this.f41473a + ", errorMessage='" + this.f41474b + "')";
    }
}
