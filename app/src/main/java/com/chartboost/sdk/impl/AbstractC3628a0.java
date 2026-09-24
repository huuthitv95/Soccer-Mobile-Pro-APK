package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Networking.EndpointRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.a0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3628a0 {

    /* JADX INFO: renamed from: a */
    public final String f13422a;

    /* JADX INFO: renamed from: b */
    public final EndpointRepository.EndPoint f13423b;

    /* JADX INFO: renamed from: c */
    public final EndpointRepository.EndPoint f13424c;

    /* JADX INFO: renamed from: d */
    public final boolean f13425d;

    /* JADX INFO: renamed from: e */
    public final boolean f13426e;

    /* JADX INFO: renamed from: f */
    public final boolean f13427f;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.a0$a */
    public static final class a extends AbstractC3628a0 {

        /* JADX INFO: renamed from: g */
        public static final a f13428g = new a();

        public a() {
            super("Banner", EndpointRepository.EndPoint.BANNER_GET, EndpointRepository.EndPoint.BANNER_SHOW, true, false, 16, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 312973325;
        }

        public String toString() {
            return "Banner";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.a0$b */
    public static final class b extends AbstractC3628a0 {

        /* JADX INFO: renamed from: g */
        public static final b f13429g = new b();

        public b() {
            super("Interstitial", EndpointRepository.EndPoint.INTERSTITIAL_GET, EndpointRepository.EndPoint.INTERSTITIAL_SHOW, false, false, 24, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 743805773;
        }

        public String toString() {
            return "Interstitial";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.a0$c */
    public static final class c extends AbstractC3628a0 {

        /* JADX INFO: renamed from: g */
        public static final c f13430g = new c();

        public c() {
            super("Rewarded", EndpointRepository.EndPoint.REWARDED_GET, EndpointRepository.EndPoint.REWARDED_SHOW, false, false, 8, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1735897263;
        }

        public String toString() {
            return "Rewarded";
        }
    }

    public AbstractC3628a0(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z, boolean z2) {
        this.f13422a = str;
        this.f13423b = endPoint;
        this.f13424c = endPoint2;
        this.f13425d = z;
        this.f13426e = z2;
        this.f13427f = !z;
    }

    public /* synthetic */ AbstractC3628a0(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, endPoint, endPoint2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, null);
    }

    public /* synthetic */ AbstractC3628a0(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, endPoint, endPoint2, z, z2);
    }

    /* JADX INFO: renamed from: a */
    public final EndpointRepository.EndPoint m16770a() {
        return this.f13423b;
    }

    /* JADX INFO: renamed from: b */
    public final String m16771b() {
        return this.f13422a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16772c() {
        return this.f13425d;
    }

    /* JADX INFO: renamed from: d */
    public final EndpointRepository.EndPoint m16773d() {
        return this.f13424c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m16774e() {
        return this.f13427f;
    }
}
