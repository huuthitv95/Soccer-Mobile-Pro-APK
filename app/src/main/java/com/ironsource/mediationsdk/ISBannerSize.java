package com.ironsource.mediationsdk;

import android.content.Context;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.ironsource.C11663S7;
import com.unity3d.mediation.LevelPlayAdSize;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes6.dex */
public class ISBannerSize {

    /* JADX INFO: renamed from: a */
    private final int f30975a;

    /* JADX INFO: renamed from: b */
    private final int f30976b;

    /* JADX INFO: renamed from: c */
    private final String f30977c;

    /* JADX INFO: renamed from: d */
    private boolean f30978d;

    /* JADX INFO: renamed from: e */
    C11663S7 f30979e;
    public static final ISBannerSize BANNER = C12357j.m32528a(C12357j.f31263a, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final ISBannerSize LARGE = C12357j.m32528a(C12357j.f31264b, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90);
    public static final ISBannerSize RECTANGLE = C12357j.m32528a(C12357j.f31265c, 300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    /* JADX INFO: renamed from: f */
    protected static final ISBannerSize f30974f = C12357j.m32527a();
    public static final ISBannerSize SMART = C12357j.m32528a(C12357j.f31267e, 0, 0);

    public ISBannerSize(int i, int i2) {
        this("CUSTOM", i, i2);
    }

    public static int getMaximalAdaptiveHeight(int i) {
        return C12357j.m32542b(i);
    }

    /* JADX INFO: renamed from: a */
    void m32234a(C11663S7 c11663s7) {
        if (C12357j.m32541a(c11663s7, this.f30975a, this.f30976b)) {
            this.f30979e = c11663s7;
        }
    }

    public String getDescription() {
        return this.f30977c;
    }

    public int getHeight() {
        return this.f30976b;
    }

    public int getWidth() {
        return this.f30975a;
    }

    public boolean isAdaptive() {
        return this.f30978d;
    }

    public boolean isSmart() {
        return this.f30977c.equals(C12357j.f31267e);
    }

    public void setAdaptive(boolean z) {
        this.f30978d = z;
    }

    public LevelPlayAdSize toLevelPlayAdSize(Context context) {
        if (isAdaptive()) {
            return LevelPlayAdSize.createAdaptiveAdSize(context, Integer.valueOf(this.f30979e.m27459d()));
        }
        String description = getDescription();
        description.hashCode();
        description.hashCode();
        switch (description) {
            case "RECTANGLE":
            case "MEDIUM_RECTANGLE":
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            case "LARGE":
                return LevelPlayAdSize.LARGE;
            case "BANNER":
                return LevelPlayAdSize.BANNER;
            case "CUSTOM":
                return LevelPlayAdSize.createCustomSize(this.f30975a, this.f30976b);
            default:
                return LevelPlayAdSize.BANNER;
        }
    }

    public ISBannerSize(String str, int i, int i2) {
        this.f30977c = str;
        this.f30975a = i;
        this.f30976b = i2;
        this.f30979e = new C11663S7(i, i2);
    }
}
