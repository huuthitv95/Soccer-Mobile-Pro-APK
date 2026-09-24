package com.vungle.ads.internal.network.converters;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.p300io.CloseableKt;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: EmptyResponseConverter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, m43475d2 = {"Lcom/vungle/ads/internal/network/converters/EmptyResponseConverter;", "Lcom/vungle/ads/internal/network/converters/Converter;", "Lokhttp3/ResponseBody;", "Ljava/lang/Void;", "()V", "convert", "responseBody", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class EmptyResponseConverter implements Converter<ResponseBody, Void> {
    @Override // com.vungle.ads.internal.network.converters.Converter
    public Void convert(ResponseBody responseBody) throws IOException {
        if (responseBody != null) {
            ResponseBody responseBody2 = responseBody;
            try {
                responseBody2.close();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(responseBody2, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(responseBody2, th);
                    throw th2;
                }
            }
        }
        return null;
    }
}
