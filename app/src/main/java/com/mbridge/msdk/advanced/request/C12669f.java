package com.mbridge.msdk.advanced.request;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.request.f */
/* JADX INFO: compiled from: NativeAdvancedV3ParamsEntity.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12669f {

    /* JADX INFO: renamed from: a */
    private int f33556a;

    /* JADX INFO: renamed from: b */
    private String f33557b;

    /* JADX INFO: renamed from: c */
    private int f33558c;

    /* JADX INFO: renamed from: d */
    private int f33559d;

    /* JADX INFO: renamed from: e */
    private int f33560e;

    /* JADX INFO: renamed from: a */
    public int m34550a() {
        return this.f33560e;
    }

    /* JADX INFO: renamed from: a */
    public void m34551a(int i) {
        this.f33560e = i;
    }

    /* JADX INFO: renamed from: a */
    public void m34552a(String str) {
        this.f33557b = str;
    }

    /* JADX INFO: renamed from: b */
    public int m34553b() {
        return this.f33559d;
    }

    /* JADX INFO: renamed from: b */
    public void m34554b(int i) {
        this.f33559d = i;
    }

    /* JADX INFO: renamed from: c */
    public int m34555c() {
        return this.f33558c;
    }

    /* JADX INFO: renamed from: c */
    public void m34556c(int i) {
        this.f33558c = i;
    }

    /* JADX INFO: renamed from: d */
    public int m34557d() {
        return this.f33556a;
    }

    /* JADX INFO: renamed from: d */
    public void m34558d(int i) {
        this.f33556a = i;
    }

    /* JADX INFO: renamed from: e */
    public String m34559e() {
        return this.f33557b;
    }

    public String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f33556a + ", session_id='" + this.f33557b + "', offset=" + this.f33558c + ", expectWidth=" + this.f33559d + ", expectHeight=" + this.f33560e + AbstractJsonLexerKt.END_OBJ;
    }
}
