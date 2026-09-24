package com.vungle.ads.internal.network.converters;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Converter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m43475d2 = {"Lcom/vungle/ads/internal/network/converters/Converter;", "In", "Out", "", "convert", "responseBody", "(Ljava/lang/Object;)Ljava/lang/Object;", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public interface Converter<In, Out> {
    Out convert(In responseBody) throws IOException;
}
