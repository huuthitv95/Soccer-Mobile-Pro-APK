package com.mbridge.msdk.dycreator.error;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.error.a */
/* JADX INFO: compiled from: DyError.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12974a {

    /* JADX INFO: renamed from: a */
    private int f35355a;

    /* JADX INFO: renamed from: b */
    private String f35356b;

    public C12974a(EnumC12975b enumC12975b) {
        if (enumC12975b != null) {
            this.f35355a = enumC12975b.m36377g();
            this.f35356b = enumC12975b.m36378h();
        }
    }

    public String toString() {
        return "DyError{errorCode=" + this.f35355a + AbstractJsonLexerKt.END_OBJ;
    }

    public C12974a(int i, String str) {
        this.f35355a = i;
        this.f35356b = str;
    }
}
