package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.AbstractC13711b0;
import com.mbridge.msdk.thrid.okhttp.C13785u;
import com.mbridge.msdk.thrid.okio.InterfaceC13795e;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http.h */
/* JADX INFO: compiled from: RealResponseBody.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13742h extends AbstractC13711b0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    private final String f38874a;

    /* JADX INFO: renamed from: b */
    private final long f38875b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC13795e f38876c;

    public C13742h(@Nullable String str, long j, InterfaceC13795e interfaceC13795e) {
        this.f38874a = str;
        this.f38875b = j;
        this.f38876c = interfaceC13795e;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13711b0
    /* JADX INFO: renamed from: k */
    public long mo40201k() {
        return this.f38875b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13711b0
    /* JADX INFO: renamed from: l */
    public C13785u mo40202l() {
        String str = this.f38874a;
        if (str != null) {
            return C13785u.m40767b(str);
        }
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13711b0
    /* JADX INFO: renamed from: m */
    public InterfaceC13795e mo40203m() {
        return this.f38876c;
    }
}
