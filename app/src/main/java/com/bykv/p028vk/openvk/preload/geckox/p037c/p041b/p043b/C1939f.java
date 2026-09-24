package com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p043b;

import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a;
import com.bykv.p028vk.openvk.preload.geckox.buffer.stream.C1917a;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1965b;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1971h;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b;
import java.io.File;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.b.b.f */
/* JADX INFO: compiled from: UnZipMergedZipInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1939f extends AbstractC1886d<Pair<InterfaceC1913a, UpdatePackage>, Pair<File, UpdatePackage>> {
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private static Object a2(InterfaceC1882b<Pair<File, UpdatePackage>> interfaceC1882b, Pair<InterfaceC1913a, UpdatePackage> pair) throws Throwable {
        GeckoLogger.m6040d("gecko-debug-tag", "start unzip merged zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        InterfaceC1913a interfaceC1913a = (InterfaceC1913a) pair.first;
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        interfaceC1913a.mo5976b(0L);
        File parentFile = interfaceC1913a.mo5980f().getParentFile();
        try {
            C1971h.m6086a(new C1917a(interfaceC1913a), parentFile.getAbsolutePath(), updatePackage.getChannel());
            interfaceC1913a.mo5970a();
            File file = new File(parentFile, "res");
            C1965b.m6075a(file);
            if (new File(parentFile, updatePackage.getChannel()).renameTo(file)) {
                return interfaceC1882b.mo5836a(new Pair<>(interfaceC1913a.mo5980f(), updatePackage));
            }
            throw new RuntimeException("rename unzip merged zip file failed:" + parentFile.getAbsolutePath());
        } catch (Exception e) {
            throw new RuntimeException("unzip merged zip file failed, channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + e.getMessage(), e);
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5832a(InterfaceC1882b<Pair<File, UpdatePackage>> interfaceC1882b, Pair<InterfaceC1913a, UpdatePackage> pair) throws Throwable {
        return a2(interfaceC1882b, pair);
    }
}
