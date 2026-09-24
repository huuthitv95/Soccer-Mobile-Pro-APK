package com.chartboost.sdk.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.jj */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3854jj {
    TIMESTAMP("[TIMESTAMP]"),
    CACHEBUSTING("[CACHEBUSTING]"),
    ERRORCODE("[ERRORCODE]"),
    REASON("[REASON]"),
    LIMITADTRACKING("[LIMITADTRACKING]"),
    APPBUNDLE("[APPBUNDLE]"),
    OMIDPARTNER("[OMIDPARTNER]");


    /* JADX INFO: renamed from: d */
    public static final Map f14982d;

    /* JADX INFO: renamed from: b */
    public final String f14992b;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ EnumEntries f14991m = EnumEntriesKt.enumEntries(m18289a());

    /* JADX INFO: renamed from: c */
    public static final a f14981c = new a(null);

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jj$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC3854jj m18292a(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return (EnumC3854jj) EnumC3854jj.f14982d.get(token);
        }
    }

    static {
        EnumEntries enumEntriesM18291c = m18291c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(enumEntriesM18291c, 10)), 16));
        for (Object obj : enumEntriesM18291c) {
            linkedHashMap.put(((EnumC3854jj) obj).f14992b, obj);
        }
        f14982d = linkedHashMap;
    }

    EnumC3854jj(String str) {
        this.f14992b = str;
    }

    /* JADX INFO: renamed from: c */
    public static EnumEntries m18291c() {
        return f14991m;
    }
}
