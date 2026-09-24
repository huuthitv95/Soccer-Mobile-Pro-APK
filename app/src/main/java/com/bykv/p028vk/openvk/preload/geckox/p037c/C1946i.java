package com.bykv.p028vk.openvk.preload.geckox.p037c;

import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.i */
/* JADX INFO: compiled from: TerminalInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1946i extends AbstractC1886d<Pair<String, Long>, Pair<String, Long>> {
    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo5832a(InterfaceC1882b<Pair<String, Long>> interfaceC1882b, Pair<String, Long> pair) throws Throwable {
        Pair<String, Long> pair2 = pair;
        GeckoLogger.m6040d("gecko-debug-tag", "update success:", pair2);
        return interfaceC1882b.mo5836a(pair2);
    }
}
