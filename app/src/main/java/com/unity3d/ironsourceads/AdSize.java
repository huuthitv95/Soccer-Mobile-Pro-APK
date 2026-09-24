package com.unity3d.ironsourceads;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.ironsource.mediationsdk.C12357j;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class AdSize {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final int f41378a;

    /* JADX INFO: renamed from: b */
    private final int f41379b;

    /* JADX INFO: renamed from: c */
    private final String f41380c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final AdSize banner() {
            return new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, C12357j.f31263a, null);
        }

        @JvmStatic
        public final AdSize large() {
            return new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, C12357j.f31264b, null);
        }

        @JvmStatic
        public final AdSize leaderboard() {
            return new AdSize(728, 90, C12357j.f31266d, null);
        }

        @JvmStatic
        public final AdSize mediumRectangle() {
            return new AdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, C12357j.f31269g, null);
        }
    }

    private AdSize(int i, int i2, String str) {
        this.f41378a = i;
        this.f41379b = i2;
        this.f41380c = str;
    }

    public /* synthetic */ AdSize(int i, int i2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str);
    }

    @JvmStatic
    public static final AdSize banner() {
        return Companion.banner();
    }

    @JvmStatic
    public static final AdSize large() {
        return Companion.large();
    }

    @JvmStatic
    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    @JvmStatic
    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.f41379b;
    }

    public final String getSizeDescription() {
        return this.f41380c;
    }

    public final int getWidth() {
        return this.f41378a;
    }
}
