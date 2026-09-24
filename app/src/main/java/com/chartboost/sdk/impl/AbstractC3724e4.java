package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.e4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3724e4 {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e4$a */
    public static final class a extends AbstractC3724e4 {

        /* JADX INFO: renamed from: a */
        public final List f14008a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List clickTrackingUrls) {
            super(null);
            Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
            this.f14008a = clickTrackingUrls;
        }

        /* JADX INFO: renamed from: a */
        public final List m17476a() {
            return this.f14008a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f14008a, ((a) obj).f14008a);
        }

        public int hashCode() {
            return this.f14008a.hashCode();
        }

        public String toString() {
            return "CtaClick(clickTrackingUrls=" + this.f14008a + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e4$b */
    public static final class b extends AbstractC3724e4 {

        /* JADX INFO: renamed from: a */
        public final List f14009a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List clickTrackingUrls) {
            super(null);
            Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
            this.f14009a = clickTrackingUrls;
        }

        /* JADX INFO: renamed from: a */
        public final List m17477a() {
            return this.f14009a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f14009a, ((b) obj).f14009a);
        }

        public int hashCode() {
            return this.f14009a.hashCode();
        }

        public String toString() {
            return "GeneralClick(clickTrackingUrls=" + this.f14009a + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e4$c */
    public static final class c extends AbstractC3724e4 {

        /* JADX INFO: renamed from: a */
        public final List f14010a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List clickTrackingUrls) {
            super(null);
            Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
            this.f14010a = clickTrackingUrls;
        }

        /* JADX INFO: renamed from: a */
        public final List m17478a() {
            return this.f14010a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f14010a, ((c) obj).f14010a);
        }

        public int hashCode() {
            return this.f14010a.hashCode();
        }

        public String toString() {
            return "VastCompanionClick(clickTrackingUrls=" + this.f14010a + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e4$d */
    public static final class d extends AbstractC3724e4 {

        /* JADX INFO: renamed from: a */
        public final List f14011a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List clickTrackingUrls) {
            super(null);
            Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
            this.f14011a = clickTrackingUrls;
        }

        /* JADX INFO: renamed from: a */
        public final List m17479a() {
            return this.f14011a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f14011a, ((d) obj).f14011a);
        }

        public int hashCode() {
            return this.f14011a.hashCode();
        }

        public String toString() {
            return "VastVideoClick(clickTrackingUrls=" + this.f14011a + ")";
        }
    }

    public AbstractC3724e4() {
    }

    public /* synthetic */ AbstractC3724e4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
