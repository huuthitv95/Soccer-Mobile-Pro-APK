package com.ironsource;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.vungle.ads.internal.signals.SignalManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.H3 */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC11465H3 {
    Day("d", SignalManager.TWENTY_FOUR_HOURS_MILLIS),
    Hour(CmcdData.Factory.STREAMING_FORMAT_HLS, 3600000),
    Second(CmcdData.Factory.STREAMING_FORMAT_SS, 1000);


    /* JADX INFO: renamed from: c */
    public static final a f24413c = new a(null);

    /* JADX INFO: renamed from: a */
    private final String f24418a;

    /* JADX INFO: renamed from: b */
    private final long f24419b;

    /* JADX INFO: renamed from: com.ironsource.H3$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC11465H3 m25979a(String str) {
            for (EnumC11465H3 enumC11465H3 : EnumC11465H3.values()) {
                if (Intrinsics.areEqual(enumC11465H3.f24418a, str)) {
                    return enumC11465H3;
                }
            }
            return null;
        }

        private a() {
        }
    }

    EnumC11465H3(String str, long j) {
        this.f24418a = str;
        this.f24419b = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m25978a(Integer num) {
        return ((long) (num != null ? num.intValue() : 1)) * this.f24419b;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ long m25975a(EnumC11465H3 enumC11465H3, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i & 1) != 0) {
            num = 1;
        }
        return enumC11465H3.m25978a(num);
    }
}
