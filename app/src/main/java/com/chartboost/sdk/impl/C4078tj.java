package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.tj */
/* JADX INFO: loaded from: classes3.dex */
public final class C4078tj {

    /* JADX INFO: renamed from: a */
    public final String f16401a;

    /* JADX INFO: renamed from: b */
    public final String f16402b;

    /* JADX INFO: renamed from: c */
    public final File f16403c;

    /* JADX INFO: renamed from: d */
    public final File f16404d;

    /* JADX INFO: renamed from: e */
    public final long f16405e;

    /* JADX INFO: renamed from: f */
    public final String f16406f;

    /* JADX INFO: renamed from: g */
    public long f16407g;

    public C4078tj(String url, String filename, File file, File file2, long j, String queueFilePath, long j2) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(queueFilePath, "queueFilePath");
        this.f16401a = url;
        this.f16402b = filename;
        this.f16403c = file;
        this.f16404d = file2;
        this.f16405e = j;
        this.f16406f = queueFilePath;
        this.f16407g = j2;
    }

    public /* synthetic */ C4078tj(String str, String str2, File file, File file2, long j, String str3, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, file, file2, (i & 16) != 0 ? AbstractC3760fh.m17736a() : j, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? 0L : j2);
    }

    /* JADX INFO: renamed from: a */
    public final long m19505a() {
        return this.f16405e;
    }

    /* JADX INFO: renamed from: a */
    public final void m19506a(long j) {
        this.f16407g = j;
    }

    /* JADX INFO: renamed from: b */
    public final File m19507b() {
        return this.f16404d;
    }

    /* JADX INFO: renamed from: c */
    public final long m19508c() {
        return this.f16407g;
    }

    /* JADX INFO: renamed from: d */
    public final String m19509d() {
        return this.f16402b;
    }

    /* JADX INFO: renamed from: e */
    public final File m19510e() {
        return this.f16403c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4078tj)) {
            return false;
        }
        C4078tj c4078tj = (C4078tj) obj;
        return Intrinsics.areEqual(this.f16401a, c4078tj.f16401a) && Intrinsics.areEqual(this.f16402b, c4078tj.f16402b) && Intrinsics.areEqual(this.f16403c, c4078tj.f16403c) && Intrinsics.areEqual(this.f16404d, c4078tj.f16404d) && this.f16405e == c4078tj.f16405e && Intrinsics.areEqual(this.f16406f, c4078tj.f16406f) && this.f16407g == c4078tj.f16407g;
    }

    /* JADX INFO: renamed from: f */
    public final String m19511f() {
        return this.f16406f;
    }

    /* JADX INFO: renamed from: g */
    public final String m19512g() {
        return this.f16401a;
    }

    public int hashCode() {
        int iHashCode = ((this.f16401a.hashCode() * 31) + this.f16402b.hashCode()) * 31;
        File file = this.f16403c;
        int iHashCode2 = (iHashCode + (file == null ? 0 : file.hashCode())) * 31;
        File file2 = this.f16404d;
        return ((((((iHashCode2 + (file2 != null ? file2.hashCode() : 0)) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f16405e)) * 31) + this.f16406f.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f16407g);
    }

    public String toString() {
        return "VideoAsset(url=" + this.f16401a + ", filename=" + this.f16402b + ", localFile=" + this.f16403c + ", directory=" + this.f16404d + ", creationDate=" + this.f16405e + ", queueFilePath=" + this.f16406f + ", expectedFileSize=" + this.f16407g + ")";
    }
}
