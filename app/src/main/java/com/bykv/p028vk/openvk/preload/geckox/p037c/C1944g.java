package com.bykv.p028vk.openvk.preload.geckox.p037c;

import android.net.Uri;
import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p028vk.openvk.preload.geckox.p035b.C1911a;
import com.bykv.p028vk.openvk.preload.geckox.p035b.C1912b;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1893k;
import java.util.List;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.g */
/* JADX INFO: compiled from: RetryFullDownloadInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1944g extends AbstractC1893k<UpdatePackage, Pair<Uri, UpdatePackage>> {

    /* JADX INFO: renamed from: d */
    private int f4404d = 0;

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1893k
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Pair<Uri, UpdatePackage> mo5872a() {
        UpdatePackage updatePackageG = m5874g();
        List<String> urlList = updatePackageG.getFullPackage().getUrlList();
        int i = this.f4404d;
        this.f4404d = i + 1;
        return new Pair<>(Uri.parse(urlList.get(i)), updatePackageG);
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1893k
    /* JADX INFO: renamed from: a */
    protected final boolean mo5873a(Throwable th) {
        GeckoLogger.m6043w("gecko-debug-tag", "full update failed and retry", th);
        if (this.f4404d >= m5874g().getFullPackage().getUrlList().size()) {
            return false;
        }
        return (th instanceof C1911a) || (th instanceof C1912b);
    }
}
