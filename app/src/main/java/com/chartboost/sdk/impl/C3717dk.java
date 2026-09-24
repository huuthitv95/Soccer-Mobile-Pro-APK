package com.chartboost.sdk.impl;

import java.util.Iterator;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.dk */
/* JADX INFO: loaded from: classes3.dex */
public final class C3717dk {

    /* JADX INFO: renamed from: i */
    public static final a f13877i = new a(null);

    /* JADX INFO: renamed from: a */
    public final long f13878a;

    /* JADX INFO: renamed from: b */
    public final int f13879b;

    /* JADX INFO: renamed from: c */
    public final int f13880c;

    /* JADX INFO: renamed from: d */
    public final long f13881d;

    /* JADX INFO: renamed from: e */
    public final long f13882e;

    /* JADX INFO: renamed from: f */
    public final long f13883f;

    /* JADX INFO: renamed from: g */
    public final int f13884g;

    /* JADX INFO: renamed from: h */
    public final b f13885h;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.dk$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3717dk m17349a(JSONObject config) {
            Intrinsics.checkNotNullParameter(config, "config");
            long jOptLong = config.optLong("maxBytes", 52428800L);
            int iOptInt = config.optInt("maxUnitsPerTimeWindow", 10);
            int iOptInt2 = config.optInt("maxUnitsPerTimeWindowCellular", 10);
            long jOptLong2 = config.optLong("timeWindow", 18000L);
            long jOptLong3 = config.optLong("timeWindowCellular", 18000L);
            long jOptLong4 = config.optLong("ttl", 604800L);
            int iOptInt3 = config.optInt("bufferSize", 3);
            String strOptString = config.optString("videoPlayer", AbstractC3740ek.f14127a);
            b.a aVar = b.f13886c;
            Intrinsics.checkNotNull(strOptString);
            return new C3717dk(jOptLong, iOptInt, iOptInt2, jOptLong2, jOptLong3, jOptLong4, iOptInt3, aVar.m17353a(strOptString));
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.dk$b */
    public enum b {
        EXO_PLAYER("exoplayer"),
        MEDIA_PLAYER("mediaplayer");


        /* JADX INFO: renamed from: b */
        public final String f13891b;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ EnumEntries f13890g = EnumEntriesKt.enumEntries(m17350a());

        /* JADX INFO: renamed from: c */
        public static final a f13886c = new a(null);

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.dk$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final b m17353a(String value) {
                Object next;
                Intrinsics.checkNotNullParameter(value, "value");
                Iterator<E> it = b.m17351b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((b) next).m17352c(), value));
                b bVar = (b) next;
                return bVar == null ? b.EXO_PLAYER : bVar;
            }
        }

        b(String str) {
            this.f13891b = str;
        }

        /* JADX INFO: renamed from: b */
        public static EnumEntries m17351b() {
            return f13890g;
        }

        /* JADX INFO: renamed from: c */
        public final String m17352c() {
            return this.f13891b;
        }
    }

    public C3717dk(long j, int i, int i2, long j2, long j3, long j4, int i3, b videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        this.f13878a = j;
        this.f13879b = i;
        this.f13880c = i2;
        this.f13881d = j2;
        this.f13882e = j3;
        this.f13883f = j4;
        this.f13884g = i3;
        this.f13885h = videoPlayer;
    }

    public /* synthetic */ C3717dk(long j, int i, int i2, long j2, long j3, long j4, int i3, b bVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 52428800L : j, (i4 & 2) != 0 ? 10 : i, (i4 & 4) == 0 ? i2 : 10, (i4 & 8) != 0 ? 18000L : j2, (i4 & 16) == 0 ? j3 : 18000L, (i4 & 32) != 0 ? 604800L : j4, (i4 & 64) != 0 ? 3 : i3, (i4 & 128) != 0 ? b.EXO_PLAYER : bVar);
    }

    /* JADX INFO: renamed from: a */
    public static final C3717dk m17340a(JSONObject jSONObject) {
        return f13877i.m17349a(jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public final int m17341a() {
        return this.f13884g;
    }

    /* JADX INFO: renamed from: b */
    public final long m17342b() {
        return this.f13878a;
    }

    /* JADX INFO: renamed from: c */
    public final int m17343c() {
        return this.f13879b;
    }

    /* JADX INFO: renamed from: d */
    public final int m17344d() {
        return this.f13880c;
    }

    /* JADX INFO: renamed from: e */
    public final long m17345e() {
        return this.f13881d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3717dk)) {
            return false;
        }
        C3717dk c3717dk = (C3717dk) obj;
        return this.f13878a == c3717dk.f13878a && this.f13879b == c3717dk.f13879b && this.f13880c == c3717dk.f13880c && this.f13881d == c3717dk.f13881d && this.f13882e == c3717dk.f13882e && this.f13883f == c3717dk.f13883f && this.f13884g == c3717dk.f13884g && this.f13885h == c3717dk.f13885h;
    }

    /* JADX INFO: renamed from: f */
    public final long m17346f() {
        return this.f13882e;
    }

    /* JADX INFO: renamed from: g */
    public final long m17347g() {
        return this.f13883f;
    }

    /* JADX INFO: renamed from: h */
    public final b m17348h() {
        return this.f13885h;
    }

    public int hashCode() {
        return (((((((((((((UByte$$ExternalSyntheticBackport0.m43485m(this.f13878a) * 31) + this.f13879b) * 31) + this.f13880c) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f13881d)) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f13882e)) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f13883f)) * 31) + this.f13884g) * 31) + this.f13885h.hashCode();
    }

    public String toString() {
        return "VideoPreCachingModel(maxBytes=" + this.f13878a + ", maxUnitsPerTimeWindow=" + this.f13879b + ", maxUnitsPerTimeWindowCellular=" + this.f13880c + ", timeWindow=" + this.f13881d + ", timeWindowCellular=" + this.f13882e + ", ttl=" + this.f13883f + ", bufferSize=" + this.f13884g + ", videoPlayer=" + this.f13885h + ")";
    }
}
