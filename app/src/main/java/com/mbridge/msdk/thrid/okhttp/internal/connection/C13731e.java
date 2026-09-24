package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import java.io.IOException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.connection.e */
/* JADX INFO: compiled from: RouteException.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13731e extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private IOException f38826a;

    /* JADX INFO: renamed from: b */
    private IOException f38827b;

    public C13731e(IOException iOException) {
        super(iOException);
        this.f38826a = iOException;
        this.f38827b = iOException;
    }

    /* JADX INFO: renamed from: a */
    public void m40336a(IOException iOException) {
        C13723c.m40283a((Throwable) this.f38826a, (Throwable) iOException);
        this.f38827b = iOException;
    }

    /* JADX INFO: renamed from: d */
    public IOException m40337d() {
        return this.f38826a;
    }

    /* JADX INFO: renamed from: g */
    public IOException m40338g() {
        return this.f38827b;
    }
}
