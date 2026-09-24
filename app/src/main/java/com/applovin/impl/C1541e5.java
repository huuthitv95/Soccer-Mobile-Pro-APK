package com.applovin.impl;

import com.applovin.impl.mediation.C1655h;
import com.applovin.mediation.MaxError;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.applovin.impl.e5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1541e5 {

    /* JADX INFO: renamed from: a */
    private final C1551f5 f1423a;

    /* JADX INFO: renamed from: b */
    private final String f1424b;

    /* JADX INFO: renamed from: c */
    private final String f1425c;

    /* JADX INFO: renamed from: d */
    private final String f1426d;

    /* JADX INFO: renamed from: e */
    private final MaxError f1427e;

    /* JADX INFO: renamed from: f */
    private final long f1428f;

    /* JADX INFO: renamed from: g */
    private final long f1429g;

    /* JADX INFO: renamed from: h */
    private final boolean f1430h;

    /* JADX INFO: renamed from: com.applovin.impl.e5$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2503a(C1541e5 c1541e5);
    }

    private C1541e5(C1551f5 c1551f5, C1655h c1655h, String str, MaxError maxError, long j, long j2) {
        this(c1551f5, str, maxError, j, j2, c1655h != null ? c1655h.m3575i() : null, c1655h != null ? c1655h.m3567b() : null, false);
    }

    private C1541e5(C1551f5 c1551f5, String str, MaxError maxError, long j, long j2, String str2, String str3, boolean z) {
        this.f1423a = c1551f5;
        this.f1426d = str;
        this.f1427e = maxError;
        this.f1428f = j;
        this.f1429g = j2;
        this.f1424b = str2;
        this.f1425c = str3;
        this.f1430h = z;
    }

    /* JADX INFO: renamed from: a */
    public static C1541e5 m2492a(C1541e5 c1541e5) {
        return new C1541e5(c1541e5.m2501f(), c1541e5.m2500e(), c1541e5.m2498c(), c1541e5.f1428f, c1541e5.f1429g, c1541e5.m2499d(), c1541e5.m2496a(), true);
    }

    /* JADX INFO: renamed from: a */
    public static C1541e5 m2493a(C1551f5 c1551f5, C1655h c1655h, MaxError maxError, long j, long j2) {
        if (c1551f5 != null) {
            return new C1541e5(c1551f5, c1655h, null, maxError, j, j2);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    /* JADX INFO: renamed from: a */
    public static C1541e5 m2494a(C1551f5 c1551f5, C1655h c1655h, String str, long j, long j2) {
        if (c1551f5 == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (c1655h != null) {
            return new C1541e5(c1551f5, c1655h, str, null, j, j2);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    /* JADX INFO: renamed from: a */
    public static C1541e5 m2495a(C1551f5 c1551f5, MaxError maxError) {
        return m2493a(c1551f5, (C1655h) null, maxError, -1L, -1L);
    }

    /* JADX INFO: renamed from: a */
    public String m2496a() {
        return this.f1425c;
    }

    /* JADX INFO: renamed from: b */
    public long m2497b() {
        return this.f1429g;
    }

    /* JADX INFO: renamed from: c */
    public MaxError m2498c() {
        return this.f1427e;
    }

    /* JADX INFO: renamed from: d */
    public String m2499d() {
        return this.f1424b;
    }

    /* JADX INFO: renamed from: e */
    public String m2500e() {
        return this.f1426d;
    }

    /* JADX INFO: renamed from: f */
    public C1551f5 m2501f() {
        return this.f1423a;
    }

    /* JADX INFO: renamed from: g */
    public boolean m2502g() {
        return this.f1430h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f1423a);
        sb.append(", mSdkVersion='");
        sb.append(this.f1424b);
        sb.append("', mAdapterVersion='");
        sb.append(this.f1425c);
        sb.append("', mSignalDataLength='");
        String str = this.f1426d;
        sb.append(str != null ? str.length() : 0);
        sb.append("', mErrorMessage=");
        MaxError maxError = this.f1427e;
        sb.append(maxError != null ? maxError.getMessage() : "");
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
