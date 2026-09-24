package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.EnumC12789c;
import com.mbridge.msdk.config.component.load.downloader.InterfaceC12814h;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.p */
/* JADX INFO: compiled from: RequestBuilder.java */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC12805p<T> {
    /* JADX INFO: renamed from: a */
    InterfaceC12805p<T> mo35397a(EnumC12789c enumC12789c);

    /* JADX INFO: renamed from: a */
    InterfaceC12805p<T> mo35398a(InterfaceC12814h interfaceC12814h);

    C12793d<T> build();

    InterfaceC12805p<T> withHttpRetryCounter(int i);

    InterfaceC12805p<T> withTimeout(long j);
}
