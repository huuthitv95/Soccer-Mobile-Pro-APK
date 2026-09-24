package com.mbridge.msdk.config.component.common.file;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.file.b */
/* JADX INFO: compiled from: FileDescription.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12753b {

    /* JADX INFO: renamed from: a */
    private String f33917a;

    /* JADX INFO: renamed from: b */
    private String f33918b;

    /* JADX INFO: renamed from: c */
    private String f33919c;

    /* JADX INFO: renamed from: d */
    private String f33920d;

    /* JADX INFO: renamed from: e */
    private String f33921e;

    /* JADX INFO: renamed from: f */
    private boolean f33922f;

    /* JADX INFO: renamed from: a */
    public String m35063a() {
        return this.f33919c + this.f33917a;
    }

    /* JADX INFO: renamed from: b */
    public void m35067b(String str) {
        this.f33917a = str;
    }

    /* JADX INFO: renamed from: c */
    public void m35069c(String str) {
        this.f33918b = str;
    }

    /* JADX INFO: renamed from: d */
    public String m35070d() {
        return this.f33921e;
    }

    /* JADX INFO: renamed from: e */
    public void m35072e(String str) {
        this.f33921e = str;
    }

    public String toString() {
        return "FileDescription{fileName='" + this.f33917a + "', fileType='" + this.f33918b + "', dirPath='" + this.f33919c + "', unZipDirPath='" + this.f33920d + "', unZipFilePath='" + this.f33921e + "', fileExists=" + this.f33922f + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: renamed from: a */
    public void m35064a(String str) {
        this.f33919c = str;
    }

    /* JADX INFO: renamed from: b */
    public String m35066b() {
        return this.f33918b;
    }

    /* JADX INFO: renamed from: c */
    public String m35068c() {
        return this.f33920d;
    }

    /* JADX INFO: renamed from: d */
    public void m35071d(String str) {
        this.f33920d = str;
    }

    /* JADX INFO: renamed from: e */
    public boolean m35073e() {
        return this.f33922f;
    }

    /* JADX INFO: renamed from: a */
    public void m35065a(boolean z) {
        this.f33922f = z;
    }
}
