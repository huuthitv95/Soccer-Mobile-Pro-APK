package com.chartboost.sdk.impl;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.df */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3712df {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.df$a */
    public static final class a extends AbstractC3712df {

        /* JADX INFO: renamed from: a */
        public final double f13836a;

        public a(double d) {
            super(null);
            this.f13836a = d;
        }

        /* JADX INFO: renamed from: a */
        public final double m17301a() {
            return this.f13836a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Double.compare(this.f13836a, ((a) obj).f13836a) == 0;
        }

        public int hashCode() {
            return UByte$$ExternalSyntheticBackport0.m43483m(this.f13836a);
        }

        public String toString() {
            return "Fraction(fraction=" + this.f13836a + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.df$b */
    public static final class b extends AbstractC3712df {

        /* JADX INFO: renamed from: a */
        public final long f13837a;

        public b(long j) {
            super(null);
            this.f13837a = j;
        }

        /* JADX INFO: renamed from: a */
        public final long m17302a() {
            return this.f13837a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f13837a == ((b) obj).f13837a;
        }

        public int hashCode() {
            return UByte$$ExternalSyntheticBackport0.m43485m(this.f13837a);
        }

        public String toString() {
            return "TimeMs(ms=" + this.f13837a + ")";
        }
    }

    public AbstractC3712df() {
    }

    public /* synthetic */ AbstractC3712df(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
