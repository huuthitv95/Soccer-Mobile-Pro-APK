package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.C12788b;
import com.mbridge.msdk.config.component.load.downloader.EnumC12789c;
import com.mbridge.msdk.config.component.load.downloader.InterfaceC12814h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.e */
/* JADX INFO: compiled from: DownloadRequestBuilder.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12794e<T> implements InterfaceC12805p<T> {

    /* JADX INFO: renamed from: a */
    long f34129a;

    /* JADX INFO: renamed from: b */
    C12788b<T> f34130b;

    /* JADX INFO: renamed from: c */
    EnumC12789c f34131c = EnumC12789c.MEDIUM;

    /* JADX INFO: renamed from: d */
    InterfaceC12814h f34132d;

    /* JADX INFO: renamed from: e */
    Map<String, String> f34133e;

    /* JADX INFO: renamed from: f */
    HashMap<String, List<String>> f34134f;

    /* JADX INFO: renamed from: g */
    long f34135g;

    /* JADX INFO: renamed from: h */
    int f34136h;

    /* JADX INFO: renamed from: i */
    long f34137i;

    /* JADX INFO: renamed from: j */
    String f34138j;

    /* JADX INFO: renamed from: k */
    long f34139k;

    public C12794e(C12788b<T> c12788b) {
        this.f34130b = c12788b;
    }

    /* JADX INFO: renamed from: a */
    public C12794e<T> m35396a(long j) {
        this.f34129a = j;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C12794e<T> m35399b(long j) {
        this.f34135g = j;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.InterfaceC12805p
    public C12793d<T> build() {
        return C12793d.m35361a(this);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC12805p<T> m35400c(long j) {
        this.f34139k = j;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.InterfaceC12805p
    public InterfaceC12805p<T> withTimeout(long j) {
        this.f34137i = j;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.InterfaceC12805p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C12794e<T> withHttpRetryCounter(int i) {
        this.f34136h = i;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.InterfaceC12805p
    /* JADX INFO: renamed from: a */
    public InterfaceC12805p<T> mo35398a(InterfaceC12814h interfaceC12814h) {
        this.f34132d = interfaceC12814h;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.InterfaceC12805p
    /* JADX INFO: renamed from: a */
    public InterfaceC12805p<T> mo35397a(EnumC12789c enumC12789c) {
        this.f34131c = enumC12789c;
        return this;
    }
}
