package com.applovin.mediation.nativeAds.adPlacer;

import com.applovin.impl.sdk.C1768p;
import java.util.Set;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* JADX INFO: renamed from: a */
    private final String f4187a;

    /* JADX INFO: renamed from: b */
    private String f4188b;

    /* JADX INFO: renamed from: c */
    private final Set f4189c = new TreeSet();

    /* JADX INFO: renamed from: d */
    private int f4190d = 0;

    /* JADX INFO: renamed from: e */
    private int f4191e = 256;

    /* JADX INFO: renamed from: f */
    private int f4192f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f4187a = str;
    }

    public void addFixedPosition(int i) {
        this.f4189c.add(Integer.valueOf(i));
    }

    public String getAdUnitId() {
        return this.f4187a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f4189c;
    }

    public int getMaxAdCount() {
        return this.f4191e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f4192f;
    }

    public String getPlacement() {
        return this.f4188b;
    }

    public int getRepeatingInterval() {
        return this.f4190d;
    }

    public boolean hasValidPositioning() {
        return !this.f4189c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f4190d >= 2;
    }

    public void resetFixedPositions() {
        this.f4189c.clear();
    }

    public void setMaxAdCount(int i) {
        this.f4191e = i;
    }

    public void setMaxPreloadedAdCount(int i) {
        this.f4192f = i;
    }

    public void setPlacement(String str) {
        this.f4188b = str;
    }

    public void setRepeatingInterval(int i) {
        if (i >= 2) {
            this.f4190d = i;
            C1768p.m5166g("MaxAdPlacerSettings", "Repeating interval set to " + i);
            return;
        }
        this.f4190d = 0;
        C1768p.m5169j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i + ", which is less than minimum value of 2");
    }

    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f4187a + "', fixedPositions=" + this.f4189c + ", repeatingInterval=" + this.f4190d + ", maxAdCount=" + this.f4191e + ", maxPreloadedAdCount=" + this.f4192f + AbstractJsonLexerKt.END_OBJ;
    }
}
