package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.E4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11412E4 implements InterfaceC11458Ge<String> {

    /* JADX INFO: renamed from: a */
    private final String f24233a;

    /* JADX INFO: renamed from: b */
    private final String f24234b;

    public C11412E4(String encryptedResponse, String descriptionKey) {
        Intrinsics.checkNotNullParameter(encryptedResponse, "encryptedResponse");
        Intrinsics.checkNotNullParameter(descriptionKey, "descriptionKey");
        this.f24233a = encryptedResponse;
        this.f24234b = descriptionKey;
    }

    @Override // com.ironsource.InterfaceC11458Ge
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String mo25659a() {
        String value = C11453G9.m25865b(this.f24234b, this.f24233a);
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        Intrinsics.checkNotNullExpressionValue(value, "value");
        return value;
    }
}
