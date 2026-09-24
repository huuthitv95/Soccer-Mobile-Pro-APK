package com.applovin.sdk;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.ironsource.mediationsdk.C12357j;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* JADX INFO: renamed from: a */
    private final String f4205a;

    /* JADX INFO: renamed from: b */
    private final int f4206b;

    /* JADX INFO: renamed from: c */
    private final int f4207c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, C12357j.f31263a);
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i, int i2, String str) {
        this.f4206b = i;
        this.f4207c = i2;
        this.f4205a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if (C12357j.f31263a.equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException("Unknown Ad Size: " + str);
    }

    public int getHeight() {
        return this.f4207c;
    }

    public String getLabel() {
        return this.f4205a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f4206b;
    }

    public String toString() {
        return getLabel();
    }
}
