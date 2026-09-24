package com.mbridge.msdk.foundation.same.net.exception;

import com.mbridge.msdk.foundation.same.net.toolbox.C13117a;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.exception.a */
/* JADX INFO: compiled from: CommonError.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13113a extends Exception {

    /* JADX INFO: renamed from: a */
    public int f35959a;

    /* JADX INFO: renamed from: b */
    public String f35960b;

    /* JADX INFO: renamed from: c */
    public C13117a f35961c;

    public C13113a(int i, C13117a c13117a) {
        this.f35959a = i;
        this.f35961c = c13117a;
    }

    public C13113a(int i, C13117a c13117a, String str) {
        this.f35959a = i;
        this.f35961c = c13117a;
        this.f35960b = str;
    }
}
