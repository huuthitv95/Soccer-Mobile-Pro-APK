package com.bykv.p028vk.openvk.preload.geckox.p037c;

import com.bykv.p028vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1880a;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.a */
/* JADX INFO: compiled from: FileTypeBranchInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1920a extends AbstractC1880a<UpdatePackage, UpdatePackage> {
    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1880a
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ String mo5833a(UpdatePackage updatePackage) {
        int packageType = updatePackage.getPackageType();
        if (packageType == 0) {
            return "branch_zip";
        }
        if (packageType == 1) {
            return "branch_single_file";
        }
        throw new RuntimeException("unknow file type: ".concat(String.valueOf(packageType)));
    }
}
