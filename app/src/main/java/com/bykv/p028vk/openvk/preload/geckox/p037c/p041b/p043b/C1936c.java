package com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p043b;

import android.net.Uri;
import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.C1910b;
import com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a;
import com.bykv.p028vk.openvk.preload.geckox.buffer.p036a.C1914a;
import com.bykv.p028vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p028vk.openvk.preload.geckox.p035b.C1911a;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b;
import java.io.File;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.b.b.c */
/* JADX INFO: compiled from: DownloadPatchZipInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1936c extends AbstractC1886d<Pair<Uri, UpdatePackage>, Pair<InterfaceC1913a, UpdatePackage>> {

    /* JADX INFO: renamed from: d */
    private C1910b f4390d;

    /* JADX INFO: renamed from: e */
    private File f4391e;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Object mo5832a(InterfaceC1882b<Pair<InterfaceC1913a, UpdatePackage>> interfaceC1882b, Pair<Uri, UpdatePackage> pair) throws Throwable {
        GeckoLogger.m6040d("gecko-debug-tag", "start download patch zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String string = ((Uri) pair.first).toString();
        long length = updatePackage.getPatch().getLength();
        File file = new File(this.f4391e, updatePackage.getAccessKey() + File.separator + updatePackage.getChannel() + File.separator + updatePackage.getVersion() + "--updating");
        file.mkdirs();
        File file2 = new File(file, "patch.tmp");
        this.f4390d.m5922a();
        InterfaceC1913a interfaceC1913aM5981a = C1914a.m5981a(file2, length);
        try {
            this.f4390d.m5929i().downloadFile(string, length, new BufferOutputStream(interfaceC1913aM5981a));
            try {
                return interfaceC1882b.mo5836a(new Pair<>(interfaceC1913aM5981a, updatePackage));
            } finally {
                interfaceC1913aM5981a.mo5979e();
            }
        } catch (Throwable th) {
            interfaceC1913aM5981a.mo5979e();
            throw new C1911a("download patch zip failed, url:" + string + ", channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + th.getMessage(), th);
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    protected final void mo5848a(Object... objArr) {
        super.mo5848a(objArr);
        this.f4390d = (C1910b) objArr[0];
        this.f4391e = (File) objArr[1];
    }
}
