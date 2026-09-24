package com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p042a;

import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1965b;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b;
import java.io.File;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.b.a.c */
/* JADX INFO: compiled from: RenameFullZipChannelInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1932c extends AbstractC1886d<Pair<File, UpdatePackage>, Pair<String, Long>> {
    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo5832a(InterfaceC1882b<Pair<String, Long>> interfaceC1882b, Pair<File, UpdatePackage> pair) throws Throwable {
        Pair<File, UpdatePackage> pair2 = pair;
        GeckoLogger.m6040d("gecko-debug-tag", "start active full zip file, channel:", ((UpdatePackage) pair2.second).getChannel());
        File parentFile = ((File) pair2.first).getParentFile();
        long version = ((UpdatePackage) pair2.second).getVersion();
        File file = new File(parentFile.getParentFile(), String.valueOf(version));
        C1965b.m6075a(file);
        if (parentFile.renameTo(file)) {
            return interfaceC1882b.mo5836a(new Pair<>(((UpdatePackage) pair2.second).getChannel(), Long.valueOf(version)));
        }
        throw new RuntimeException("active full zip file failed:" + parentFile.getAbsolutePath());
    }
}
