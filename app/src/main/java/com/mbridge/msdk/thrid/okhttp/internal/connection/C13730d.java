package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.C13713c0;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.connection.d */
/* JADX INFO: compiled from: RouteDatabase.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13730d {

    /* JADX INFO: renamed from: a */
    private final Set<C13713c0> f38825a = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public synchronized void m40333a(C13713c0 c13713c0) {
        this.f38825a.remove(c13713c0);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m40334b(C13713c0 c13713c0) {
        this.f38825a.add(c13713c0);
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m40335c(C13713c0 c13713c0) {
        return this.f38825a.contains(c13713c0);
    }
}
