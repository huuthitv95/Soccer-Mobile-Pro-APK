package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ce */
/* JADX INFO: loaded from: classes6.dex */
public final class C12136ce {

    /* JADX INFO: renamed from: c */
    public static final a f30178c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final int f30179d = 2070;

    /* JADX INFO: renamed from: e */
    public static final int f30180e = 2080;

    /* JADX INFO: renamed from: f */
    public static final int f30181f = 2090;

    /* JADX INFO: renamed from: g */
    public static final int f30182g = 2100;

    /* JADX INFO: renamed from: h */
    public static final int f30183h = 2110;

    /* JADX INFO: renamed from: a */
    private final int f30184a;

    /* JADX INFO: renamed from: b */
    private final String f30185b;

    /* JADX INFO: renamed from: com.ironsource.ce$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C12136ce(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f30184a = i;
        this.f30185b = errorMessage;
    }

    /* JADX INFO: renamed from: a */
    public final int m31271a() {
        return this.f30184a;
    }

    /* JADX INFO: renamed from: b */
    public final String m31273b() {
        return this.f30185b;
    }

    /* JADX INFO: renamed from: c */
    public final int m31274c() {
        return this.f30184a;
    }

    /* JADX INFO: renamed from: d */
    public final String m31275d() {
        return this.f30185b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12136ce)) {
            return false;
        }
        C12136ce c12136ce = (C12136ce) obj;
        return this.f30184a == c12136ce.f30184a && Intrinsics.areEqual(this.f30185b, c12136ce.f30185b);
    }

    public int hashCode() {
        return (this.f30184a * 31) + this.f30185b.hashCode();
    }

    public String toString() {
        return "SdkError(errorCode=" + this.f30184a + ", errorMessage=" + this.f30185b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C12136ce(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        int errorCode = error.getErrorCode();
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "error.errorMessage");
        this(errorCode, errorMessage);
    }

    /* JADX INFO: renamed from: a */
    public final C12136ce m31272a(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new C12136ce(i, errorMessage);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12136ce m31270a(C12136ce c12136ce, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c12136ce.f30184a;
        }
        if ((i2 & 2) != 0) {
            str = c12136ce.f30185b;
        }
        return c12136ce.m31272a(i, str);
    }
}
