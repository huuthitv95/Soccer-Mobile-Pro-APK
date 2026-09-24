package com.iab.omid.library.vungle.adsession;

import com.iab.omid.library.vungle.utils.C11316g;

/* JADX INFO: loaded from: classes6.dex */
public final class UniversalAdId {
    private final String idRegistry;
    private final String universalAdIdValue;

    private UniversalAdId(String str, String str2) {
        this.universalAdIdValue = str;
        this.idRegistry = str2;
    }

    public static UniversalAdId createUniversalAdId(String str, String str2) {
        C11316g.m25161a(str, "UniversalADID is null or empty");
        C11316g.m25161a(str2, "UniversalADID registry is null or empty");
        return new UniversalAdId(str, str2);
    }

    public String toString() {
        return String.format("%s; %s", this.universalAdIdValue, this.idRegistry);
    }
}
