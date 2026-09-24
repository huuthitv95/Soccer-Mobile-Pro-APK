package com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p043b;

import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a;
import com.bykv.p028vk.openvk.preload.geckox.buffer.stream.C1917a;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1967d;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.b.b.a */
/* JADX INFO: compiled from: CheckMergedZipMD5Interceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1934a extends AbstractC1886d<Pair<InterfaceC1913a, UpdatePackage>, Pair<InterfaceC1913a, UpdatePackage>> {
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private static Object a2(InterfaceC1882b<Pair<InterfaceC1913a, UpdatePackage>> interfaceC1882b, Pair<InterfaceC1913a, UpdatePackage> pair) throws Throwable {
        GeckoLogger.m6040d("gecko-debug-tag", "start check merged zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        InterfaceC1913a interfaceC1913a = (InterfaceC1913a) pair.first;
        interfaceC1913a.mo5976b(0L);
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        try {
            C1967d.m6081a(new C1917a(interfaceC1913a), updatePackage.getFullPackage().getMd5());
            return interfaceC1882b.mo5836a(pair);
        } catch (Throwable th) {
            interfaceC1913a.mo5979e();
            throw new RuntimeException("check merged zip file failed, channel:" + updatePackage.getChannel() + ", pkg id：" + updatePackage.getPatch().getId() + ", caused by:" + th.getMessage(), th);
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5832a(InterfaceC1882b<Pair<InterfaceC1913a, UpdatePackage>> interfaceC1882b, Pair<InterfaceC1913a, UpdatePackage> pair) throws Throwable {
        return a2(interfaceC1882b, pair);
    }
}
