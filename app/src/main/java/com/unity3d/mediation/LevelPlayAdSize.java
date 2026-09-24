package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C12221h1;
import com.ironsource.C12313m0;
import com.ironsource.mediationsdk.C12357j;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayAdSize {

    /* JADX INFO: renamed from: f */
    private static final int f41458f = 320;

    /* JADX INFO: renamed from: g */
    private static final int f41459g = 50;

    /* JADX INFO: renamed from: h */
    private static final int f41460h = 320;

    /* JADX INFO: renamed from: i */
    private static final int f41461i = 90;

    /* JADX INFO: renamed from: j */
    private static final int f41462j = 300;

    /* JADX INFO: renamed from: k */
    private static final int f41463k = 250;

    /* JADX INFO: renamed from: m */
    private static final int f41465m = 90;

    /* JADX INFO: renamed from: a */
    private int f41466a;

    /* JADX INFO: renamed from: b */
    private int f41467b;

    /* JADX INFO: renamed from: c */
    private final String f41468c;

    /* JADX INFO: renamed from: d */
    private final boolean f41469d;

    /* JADX INFO: renamed from: e */
    private final LevelPlayAdSize f41470e;
    public static final Companion Companion = new Companion(null);
    public static final LevelPlayAdSize BANNER = new LevelPlayAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, C12357j.f31263a, false, null, 16, null);
    public static final LevelPlayAdSize MEDIUM_RECTANGLE = new LevelPlayAdSize(300, 250, C12357j.f31269g, false, null, 16, null);

    /* JADX INFO: renamed from: l */
    private static final int f41464l = 728;
    public static final LevelPlayAdSize LEADERBOARD = new LevelPlayAdSize(f41464l, 90, C12357j.f31266d, false, null, 16, null);
    public static final LevelPlayAdSize LARGE = new LevelPlayAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, C12357j.f31264b, false, null, 16, null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ LevelPlayAdSize createAdaptiveAdSize$default(Companion companion, Context context, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        @JvmStatic
        public final LevelPlayAdSize createAdSize$mediationsdk_release(String adSize) {
            Intrinsics.checkNotNullParameter(adSize, "adSize");
            int iHashCode = adSize.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && adSize.equals(C12357j.f31263a)) {
                            return LevelPlayAdSize.BANNER;
                        }
                    } else if (adSize.equals(C12357j.f31266d)) {
                        return LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (adSize.equals(C12357j.f31264b)) {
                    return LevelPlayAdSize.LARGE;
                }
            } else if (adSize.equals(C12357j.f31269g)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            throw new IllegalArgumentException("Wrong Ad Size");
        }

        @JvmStatic
        public final LevelPlayAdSize createAdaptiveAdSize(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }

        @JvmStatic
        public final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C12221h1(new C12313m0()).m31579a(context, num);
        }

        @JvmStatic
        public final LevelPlayAdSize createCustomSize(int i, int i2) {
            return new LevelPlayAdSize(i, i2, "CUSTOM", false, null, 16, null);
        }
    }

    public LevelPlayAdSize(int i, int i2, String str, boolean z, LevelPlayAdSize levelPlayAdSize) {
        this.f41466a = i;
        this.f41467b = i2;
        this.f41468c = str;
        this.f41469d = z;
        this.f41470e = levelPlayAdSize;
    }

    public /* synthetic */ LevelPlayAdSize(int i, int i2, String str, boolean z, LevelPlayAdSize levelPlayAdSize, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : str, z, (i3 & 16) != 0 ? null : levelPlayAdSize);
    }

    @JvmStatic
    public static final LevelPlayAdSize createAdaptiveAdSize(Context context) {
        return Companion.createAdaptiveAdSize(context);
    }

    @JvmStatic
    public static final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
        return Companion.createAdaptiveAdSize(context, num);
    }

    @JvmStatic
    public static final LevelPlayAdSize createCustomSize(int i, int i2) {
        return Companion.createCustomSize(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(LevelPlayAdSize.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.unity3d.mediation.LevelPlayAdSize");
        LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
        return this.f41466a == levelPlayAdSize.f41466a && this.f41467b == levelPlayAdSize.f41467b && Intrinsics.areEqual(this.f41468c, levelPlayAdSize.f41468c);
    }

    public final String getDescription() {
        return String.valueOf(this.f41468c);
    }

    public final LevelPlayAdSize getFallbackAdSize$mediationsdk_release() {
        return this.f41470e;
    }

    public final int getHeight() {
        return this.f41467b;
    }

    public final int getWidth() {
        return this.f41466a;
    }

    public int hashCode() {
        int i = ((this.f41466a * 31) + this.f41467b) * 31;
        String str = this.f41468c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAdaptive() {
        return this.f41469d;
    }

    public String toString() {
        return this.f41468c + " " + this.f41466a + "x" + this.f41467b;
    }
}
