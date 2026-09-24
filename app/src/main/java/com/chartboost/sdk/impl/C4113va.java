package com.chartboost.sdk.impl;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.va */
/* JADX INFO: loaded from: classes3.dex */
public final class C4113va {

    /* JADX INFO: renamed from: a */
    public final String f16577a;

    /* JADX INFO: renamed from: b */
    public final String f16578b;

    /* JADX INFO: renamed from: c */
    public final b f16579c;

    /* JADX INFO: renamed from: d */
    public final a f16580d;

    /* JADX INFO: renamed from: e */
    public final a f16581e;

    /* JADX INFO: renamed from: f */
    public final a f16582f;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.va$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final double f16583a;

        /* JADX INFO: renamed from: b */
        public final double f16584b;

        public a(double d, double d2) {
            this.f16583a = d;
            this.f16584b = d2;
        }

        public /* synthetic */ a(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
        }

        /* JADX INFO: renamed from: a */
        public final double m19687a() {
            return this.f16584b;
        }

        /* JADX INFO: renamed from: b */
        public final double m19688b() {
            return this.f16583a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.f16583a, aVar.f16583a) == 0 && Double.compare(this.f16584b, aVar.f16584b) == 0;
        }

        public int hashCode() {
            return (UByte$$ExternalSyntheticBackport0.m43483m(this.f16583a) * 31) + UByte$$ExternalSyntheticBackport0.m43483m(this.f16584b);
        }

        public String toString() {
            return "DoubleSize(width=" + this.f16583a + ", height=" + this.f16584b + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.va$b */
    public enum b {
        TOP_LEFT(0),
        TOP_RIGHT(1),
        BOTTOM_LEFT(2),
        BOTTOM_RIGHT(3);


        /* JADX INFO: renamed from: b */
        public final int f16592b;

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ EnumEntries f16591i = EnumEntriesKt.enumEntries(m19689a());

        /* JADX INFO: renamed from: c */
        public static final a f16585c = new a(null);

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.va$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final b m19692a(int i) {
                Object next;
                Iterator<E> it = b.m19690b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((b) next).m19691c() != i);
                b bVar = (b) next;
                return bVar == null ? b.TOP_LEFT : bVar;
            }
        }

        b(int i) {
            this.f16592b = i;
        }

        /* JADX INFO: renamed from: b */
        public static EnumEntries m19690b() {
            return f16591i;
        }

        /* JADX INFO: renamed from: c */
        public final int m19691c() {
            return this.f16592b;
        }
    }

    public C4113va(String imageUrl, String clickthroughUrl, b position, a margin, a padding, a size) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(clickthroughUrl, "clickthroughUrl");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f16577a = imageUrl;
        this.f16578b = clickthroughUrl;
        this.f16579c = position;
        this.f16580d = margin;
        this.f16581e = padding;
        this.f16582f = size;
    }

    public /* synthetic */ C4113va(String str, String str2, b bVar, a aVar, a aVar2, a aVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? b.TOP_LEFT : bVar, (i & 8) != 0 ? new a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 3, null) : aVar, (i & 16) != 0 ? new a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 3, null) : aVar2, (i & 32) != 0 ? new a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 3, null) : aVar3);
    }

    /* JADX INFO: renamed from: a */
    public final String m19682a() {
        return this.f16578b;
    }

    /* JADX INFO: renamed from: b */
    public final String m19683b() {
        return this.f16577a;
    }

    /* JADX INFO: renamed from: c */
    public final a m19684c() {
        return this.f16580d;
    }

    /* JADX INFO: renamed from: d */
    public final b m19685d() {
        return this.f16579c;
    }

    /* JADX INFO: renamed from: e */
    public final a m19686e() {
        return this.f16582f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4113va)) {
            return false;
        }
        C4113va c4113va = (C4113va) obj;
        return Intrinsics.areEqual(this.f16577a, c4113va.f16577a) && Intrinsics.areEqual(this.f16578b, c4113va.f16578b) && this.f16579c == c4113va.f16579c && Intrinsics.areEqual(this.f16580d, c4113va.f16580d) && Intrinsics.areEqual(this.f16581e, c4113va.f16581e) && Intrinsics.areEqual(this.f16582f, c4113va.f16582f);
    }

    public int hashCode() {
        return (((((((((this.f16577a.hashCode() * 31) + this.f16578b.hashCode()) * 31) + this.f16579c.hashCode()) * 31) + this.f16580d.hashCode()) * 31) + this.f16581e.hashCode()) * 31) + this.f16582f.hashCode();
    }

    public String toString() {
        return "InfoIcon(imageUrl=" + this.f16577a + ", clickthroughUrl=" + this.f16578b + ", position=" + this.f16579c + ", margin=" + this.f16580d + ", padding=" + this.f16581e + ", size=" + this.f16582f + ")";
    }
}
