package com.unity3d.services.store.gpbl.bridges.billingclient;

import kotlin.Metadata;

/* JADX INFO: compiled from: FallbackException.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m43475d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/FallbackException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "detectedVersion", "", "(I)V", "getDetectedVersion", "()I", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class FallbackException extends Exception {
    private final int detectedVersion;

    public FallbackException(int i) {
        this.detectedVersion = i;
    }

    public final int getDetectedVersion() {
        return this.detectedVersion;
    }
}
