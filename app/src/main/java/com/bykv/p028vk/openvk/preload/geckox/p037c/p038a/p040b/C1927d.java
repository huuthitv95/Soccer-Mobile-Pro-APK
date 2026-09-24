package com.bykv.p028vk.openvk.preload.geckox.p037c.p038a.p040b;

import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.C1910b;
import com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a;
import com.bykv.p028vk.openvk.preload.geckox.buffer.p036a.C1914a;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p038a.p039a.C1922b;
import com.bykv.p028vk.openvk.preload.geckox.utils.BsPatch;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1965b;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b;
import java.io.File;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.a.b.d */
/* JADX INFO: compiled from: MergePatchSingleFileInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1927d extends AbstractC1886d<Pair<InterfaceC1913a, UpdatePackage>, Pair<InterfaceC1913a, UpdatePackage>> {

    /* JADX INFO: renamed from: d */
    private C1910b f4387d;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Object mo5832a(InterfaceC1882b<Pair<InterfaceC1913a, UpdatePackage>> interfaceC1882b, Pair<InterfaceC1913a, UpdatePackage> pair) throws Throwable {
        GeckoLogger.m6040d("gecko-debug-tag", "start merge patch single file, channel:", ((UpdatePackage) pair.second).getChannel());
        InterfaceC1913a interfaceC1913a = (InterfaceC1913a) pair.first;
        File fileMo5980f = interfaceC1913a.mo5980f();
        interfaceC1913a.mo5970a();
        interfaceC1913a.mo5979e();
        File parentFile = fileMo5980f.getParentFile().getParentFile();
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File file = new File(parentFile, updatePackage.getLocalVersion() + File.separator + "res");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            throw new RuntimeException("can not found old full single file,:" + file.getAbsolutePath());
        }
        File file2 = fileArrListFiles[0];
        File file3 = new File(fileMo5980f.getParentFile(), "res" + File.separator + C1922b.m5997a(updatePackage, updatePackage.getFullPackage().getUrlList().get(0)));
        C1965b.m6075a(file3);
        try {
            try {
                BsPatch.m6059a(file2, fileMo5980f, file3.getParentFile(), file3.getName());
                C1965b.m6075a(fileMo5980f);
                this.f4387d.m5922a();
                InterfaceC1913a interfaceC1913aM5981a = C1914a.m5981a(file3, file3.length());
                try {
                    return interfaceC1882b.mo5836a(new Pair<>(interfaceC1913aM5981a, updatePackage));
                } finally {
                    interfaceC1913aM5981a.mo5979e();
                }
            } catch (Exception e) {
                throw new RuntimeException("merge patch single file failed, channel：" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + e.getMessage(), e);
            }
        } catch (Throwable th) {
            C1965b.m6075a(fileMo5980f);
            throw th;
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    protected final void mo5848a(Object... objArr) {
        super.mo5848a(objArr);
        this.f4387d = (C1910b) objArr[0];
    }
}
