package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.xj */
/* JADX INFO: loaded from: classes3.dex */
public final class C4166xj {

    /* JADX INFO: renamed from: a */
    public long f16973a;

    /* JADX INFO: renamed from: b */
    public int f16974b;

    /* JADX INFO: renamed from: c */
    public int f16975c;

    /* JADX INFO: renamed from: d */
    public long f16976d;

    /* JADX INFO: renamed from: e */
    public long f16977e;

    /* JADX INFO: renamed from: f */
    public long f16978f;

    /* JADX INFO: renamed from: g */
    public int f16979g;

    /* JADX INFO: renamed from: h */
    public final C3769g3 f16980h;

    /* JADX INFO: renamed from: i */
    public volatile long f16981i;

    /* JADX INFO: renamed from: j */
    public volatile int f16982j;

    public C4166xj(long j, int i, int i2, long j2, long j3, long j4, int i3, C3769g3 c3769g3) {
        this.f16973a = j;
        this.f16974b = i;
        this.f16975c = i2;
        this.f16976d = j2;
        this.f16977e = j3;
        this.f16978f = j4;
        this.f16979g = i3;
        this.f16980h = c3769g3;
    }

    /* JADX INFO: renamed from: a */
    public final void m19980a() {
        C4048sb.m19408a("addDownloadToTimeWindow() - timeWindowStartTimeStamp " + this.f16981i + ", timeWindowCachedVideosCount " + this.f16982j, (Throwable) null, 2, (Object) null);
        if (this.f16981i == 0) {
            this.f16981i = AbstractC3760fh.m17736a();
        }
        this.f16982j++;
    }

    /* JADX INFO: renamed from: a */
    public final void m19981a(int i) {
        this.f16979g = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19982a(long j) {
        return AbstractC3760fh.m17736a() - j > this.f16978f * ((long) 1000);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19983a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return m19982a(file.lastModified());
    }

    /* JADX INFO: renamed from: b */
    public final long m19984b() {
        return this.f16973a;
    }

    /* JADX INFO: renamed from: b */
    public final void m19985b(int i) {
        this.f16974b = i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19986b(long j) {
        return j >= this.f16973a;
    }

    /* JADX INFO: renamed from: c */
    public final int m19987c() {
        C3769g3 c3769g3 = this.f16980h;
        return (c3769g3 == null || !c3769g3.m17756d()) ? this.f16974b : this.f16975c;
    }

    /* JADX INFO: renamed from: c */
    public final void m19988c(int i) {
        this.f16975c = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m19989c(long j) {
        this.f16973a = j;
    }

    /* JADX INFO: renamed from: d */
    public final long m19990d() {
        return m19994f() - m19992e();
    }

    /* JADX INFO: renamed from: d */
    public final void m19991d(long j) {
        this.f16976d = j;
    }

    /* JADX INFO: renamed from: e */
    public final long m19992e() {
        return AbstractC3760fh.m17736a() - this.f16981i;
    }

    /* JADX INFO: renamed from: e */
    public final void m19993e(long j) {
        this.f16977e = j;
    }

    /* JADX INFO: renamed from: f */
    public final long m19994f() {
        C3769g3 c3769g3 = this.f16980h;
        return ((c3769g3 == null || !c3769g3.m17756d()) ? this.f16976d : this.f16977e) * ((long) 1000);
    }

    /* JADX INFO: renamed from: f */
    public final void m19995f(long j) {
        this.f16978f = j;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m19996g() {
        m19997h();
        boolean z = this.f16982j >= m19987c();
        if (z) {
            C3851jg.m18281a("Video loading limit reached, will resume in timeToResetWindow: " + m19990d());
        }
        C4048sb.m19408a("isMaxCountForTimeWindowReached() - " + z, (Throwable) null, 2, (Object) null);
        return z;
    }

    /* JADX INFO: renamed from: h */
    public final void m19997h() {
        C4048sb.m19408a("resetWindowWhenTimeReached()", (Throwable) null, 2, (Object) null);
        if (m19992e() > m19994f()) {
            C4048sb.m19408a("resetWindowWhenTimeReached() - timer and count reset", (Throwable) null, 2, (Object) null);
            C3851jg.m18281a("Video loading limit reset");
            this.f16982j = 0;
            this.f16981i = 0L;
        }
    }

    /* JADX INFO: renamed from: i */
    public final long m19998i() {
        return m19994f() - (AbstractC3760fh.m17736a() - this.f16981i);
    }
}
