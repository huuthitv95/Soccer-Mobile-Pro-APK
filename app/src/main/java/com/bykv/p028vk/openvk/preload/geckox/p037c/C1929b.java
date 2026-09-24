package com.bykv.p028vk.openvk.preload.geckox.p037c;

import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1892j;
import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.List;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.b */
/* JADX INFO: compiled from: FullPatchRetryInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1929b extends AbstractC1892j<UpdatePackage, UpdatePackage> {
    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1892j
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ String mo5869a(UpdatePackage updatePackage) {
        UpdatePackage updatePackage2 = updatePackage;
        UpdatePackage.Package patch = updatePackage2.getPatch();
        if (patch == null) {
            GeckoLogger.m6040d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
            return MessengerShareContentUtility.WEBVIEW_RATIO_FULL;
        }
        List<String> urlList = patch.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            GeckoLogger.m6040d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
            return MessengerShareContentUtility.WEBVIEW_RATIO_FULL;
        }
        GeckoLogger.m6040d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
        return "patch";
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1892j
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ String mo5870a(UpdatePackage updatePackage, Throwable th, String str) {
        UpdatePackage updatePackage2 = updatePackage;
        if ("patch".equals(str)) {
            GeckoLogger.m6040d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
            return MessengerShareContentUtility.WEBVIEW_RATIO_FULL;
        }
        throw new RuntimeException("full update failed, caused by:" + th.getMessage(), th);
    }
}
