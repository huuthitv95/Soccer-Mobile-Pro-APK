package com.bykv.p028vk.openvk.preload.geckox.p037c;

import android.net.Uri;
import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p028vk.openvk.preload.geckox.p035b.C1911a;
import com.bykv.p028vk.openvk.preload.geckox.p035b.C1912b;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1893k;
import java.util.List;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.h */
/* JADX INFO: compiled from: RetryPatchDownloadInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1945h extends AbstractC1893k<UpdatePackage, Pair<Uri, UpdatePackage>> {

    /* JADX INFO: renamed from: d */
    private int f4405d = 0;

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1893k
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Pair<Uri, UpdatePackage> mo5872a() {
        UpdatePackage updatePackageG = m5874g();
        List<String> urlList = updatePackageG.getPatch().getUrlList();
        int i = this.f4405d;
        this.f4405d = i + 1;
        return new Pair<>(Uri.parse(urlList.get(i)), updatePackageG);
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1893k
    /* JADX INFO: renamed from: a */
    protected final boolean mo5873a(Throwable th) {
        GeckoLogger.m6043w("gecko-debug-tag", "patch update failed", th);
        if (this.f4405d >= m5874g().getPatch().getUrlList().size()) {
            return false;
        }
        return (th instanceof C1911a) || (th instanceof C1912b);
    }
}
