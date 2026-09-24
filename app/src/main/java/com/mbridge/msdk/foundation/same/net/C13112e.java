package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.toolbox.C13117a;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.e */
/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13112e<T> {

    /* JADX INFO: renamed from: a */
    public C13113a f35956a = null;

    /* JADX INFO: renamed from: b */
    public C13117a f35957b;

    /* JADX INFO: renamed from: c */
    public T f35958c;

    private C13112e(T t, C13117a c13117a) {
        this.f35958c = t;
        this.f35957b = c13117a;
    }

    /* JADX INFO: renamed from: a */
    public static <T> C13112e<T> m37195a(T t, C13117a c13117a) {
        return new C13112e<>(t, c13117a);
    }
}
