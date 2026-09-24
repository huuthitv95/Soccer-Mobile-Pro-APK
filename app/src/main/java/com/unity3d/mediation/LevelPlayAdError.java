package com.unity3d.mediation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayAdError {
    public static final C14639a Companion = new C14639a(null);
    public static final int ERROR_CODE_INVALID_AD_UNIT_ID = 626;
    public static final int ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK = 625;
    public static final int ERROR_CODE_LOAD_FAILED_ALREADY_CALLED = 627;
    public static final int ERROR_CODE_LOAD_WHILE_SHOW = 629;
    public static final int ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED = 624;
    public static final int ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK = 628;
    public static final int ERROR_CODE_SHOW_WHILE_LOAD = 631;
    public static final int ERROR_CODE_SHOW_WHILE_SHOW = 630;

    /* JADX INFO: renamed from: a */
    private final IronSourceError f41448a;

    /* JADX INFO: renamed from: b */
    private final String f41449b;

    /* JADX INFO: renamed from: c */
    private final String f41450c;

    /* JADX INFO: renamed from: com.unity3d.mediation.LevelPlayAdError$a */
    public static final class C14639a {
        private C14639a() {
        }

        public /* synthetic */ C14639a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LevelPlayAdError(IronSourceError ironSourceError, String adId, String str) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f41448a = ironSourceError;
        this.f41449b = adId;
        this.f41450c = str;
    }

    public /* synthetic */ LevelPlayAdError(IronSourceError ironSourceError, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ironSourceError, str, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdError(String adId, String adUnitId, int i, String errorMessage) {
        this(new IronSourceError(i, errorMessage), adId, adUnitId);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }

    public final String getAdId() {
        return this.f41449b;
    }

    public final String getAdUnitId() {
        return this.f41450c;
    }

    public final int getErrorCode() {
        IronSourceError ironSourceError = this.f41448a;
        if (ironSourceError != null) {
            return ironSourceError.getErrorCode();
        }
        return 0;
    }

    public final String getErrorMessage() {
        IronSourceError ironSourceError = this.f41448a;
        String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        return errorMessage == null ? "" : errorMessage;
    }

    public String toString() {
        String str = this.f41450c;
        IronSourceError ironSourceError = this.f41448a;
        return "adUnitId: " + str + " " + (ironSourceError != null ? ironSourceError.toString() : null);
    }
}
