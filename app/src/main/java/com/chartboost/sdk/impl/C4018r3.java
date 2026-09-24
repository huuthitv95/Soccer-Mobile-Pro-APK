package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.r3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4018r3 {

    /* JADX INFO: renamed from: c */
    public static final a f16111c = new a(null);

    /* JADX INFO: renamed from: a */
    public final String f16112a;

    /* JADX INFO: renamed from: b */
    public final long f16113b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r3$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4018r3 m19296a(String content) {
            Object next;
            Object next2;
            Intrinsics.checkNotNullParameter(content, "content");
            try {
                List<String> listLines = StringsKt.lines(content);
                Iterator<T> it = listLines.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!StringsKt.startsWith$default((String) next, "url=", false, 2, (Object) null));
                String str = (String) next;
                Iterator<T> it2 = listLines.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!StringsKt.startsWith$default((String) next2, "expiry=", false, 2, (Object) null));
                String str2 = (String) next2;
                if (str != null && str2 != null) {
                    String strSubstring = str.substring(4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    String strSubstring2 = str2.substring(7);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    Long longOrNull = StringsKt.toLongOrNull(strSubstring2);
                    if (longOrNull != null) {
                        return new C4018r3(strSubstring, longOrNull.longValue());
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public C4018r3(String originalUrl, long j) {
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.f16112a = originalUrl;
        this.f16113b = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m19293a() {
        return this.f16113b;
    }

    /* JADX INFO: renamed from: b */
    public final String m19294b() {
        return this.f16112a;
    }

    /* JADX INFO: renamed from: c */
    public final String m19295c() {
        return "url=" + this.f16112a + "\nexpiry=" + this.f16113b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4018r3)) {
            return false;
        }
        C4018r3 c4018r3 = (C4018r3) obj;
        return Intrinsics.areEqual(this.f16112a, c4018r3.f16112a) && this.f16113b == c4018r3.f16113b;
    }

    public int hashCode() {
        return (this.f16112a.hashCode() * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f16113b);
    }

    public String toString() {
        return "CacheMetadata(originalUrl=" + this.f16112a + ", expiryTimestampMillis=" + this.f16113b + ")";
    }
}
