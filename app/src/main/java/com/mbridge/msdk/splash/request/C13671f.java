package com.mbridge.msdk.splash.request;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.request.f */
/* JADX INFO: compiled from: SplashV3ParamsEntity.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13671f {

    /* JADX INFO: renamed from: a */
    private int f38367a;

    /* JADX INFO: renamed from: b */
    private String f38368b;

    /* JADX INFO: renamed from: c */
    private int f38369c;

    /* JADX INFO: renamed from: d */
    private int f38370d;

    /* JADX INFO: renamed from: e */
    private int f38371e;

    /* JADX INFO: renamed from: a */
    public int m40039a() {
        return this.f38371e;
    }

    /* JADX INFO: renamed from: a */
    public void m40040a(int i) {
        this.f38371e = i;
    }

    /* JADX INFO: renamed from: a */
    public void m40041a(String str) {
        this.f38368b = str;
    }

    /* JADX INFO: renamed from: b */
    public int m40042b() {
        return this.f38370d;
    }

    /* JADX INFO: renamed from: b */
    public void m40043b(int i) {
        this.f38370d = i;
    }

    /* JADX INFO: renamed from: c */
    public int m40044c() {
        return this.f38369c;
    }

    /* JADX INFO: renamed from: c */
    public void m40045c(int i) {
        this.f38369c = i;
    }

    /* JADX INFO: renamed from: d */
    public int m40046d() {
        return this.f38367a;
    }

    /* JADX INFO: renamed from: d */
    public void m40047d(int i) {
        this.f38367a = i;
    }

    /* JADX INFO: renamed from: e */
    public String m40048e() {
        return this.f38368b;
    }

    public String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f38367a + ", session_id='" + this.f38368b + "', offset=" + this.f38369c + ", expectWidth=" + this.f38370d + ", expectHeight=" + this.f38371e + AbstractJsonLexerKt.END_OBJ;
    }
}
