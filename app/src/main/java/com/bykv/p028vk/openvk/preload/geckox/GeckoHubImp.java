package com.bykv.p028vk.openvk.preload.geckox;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.bykv.p028vk.openvk.preload.falconx.loader.C1897a;
import com.bykv.p028vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.p028vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.p028vk.openvk.preload.geckox.net.INetWork;
import com.bykv.p028vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class GeckoHubImp {

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.GeckoHubImp$a */
    static class C1899a {

        /* JADX INFO: renamed from: a */
        private static GeckoHubImp f4290a = new GeckoHubImp();
    }

    private GeckoHubImp() {
    }

    public static GeckoHubImp inst(Context context) {
        C1919c.m5985a(context);
        return C1899a.f4290a;
    }

    public static void setRandomHost(String str) {
        C1919c.m5989a(str);
    }

    public static void setThreadPoolExecutorCallback(IThreadPoolCallback iThreadPoolCallback) {
        C1910b.m5918a(iThreadPoolCallback);
    }

    public WebResourceResponse findRes(ILoader iLoader, String str, String str2) {
        return C1919c.m5984a().m5994a(iLoader, str, str2).getWebResourceResponse();
    }

    public WebResourceResponseModel findResAndMsg(ILoader iLoader, String str, String str2) {
        return C1919c.m5984a().m5994a(iLoader, str, str2);
    }

    public C1897a getGeckoResLoader() {
        C1919c.m5984a();
        return C1919c.m5991b();
    }

    public int getResCount(ILoader iLoader, String str) {
        C1919c.m5984a();
        return C1919c.m5983a(iLoader, str);
    }

    public void preload(String str, IStatisticMonitor iStatisticMonitor, Set<String> set, INetWork iNetWork) {
        C1919c.m5984a().m5995a(str, iStatisticMonitor, set, iNetWork);
    }

    public void releaseGeckoResLoader(ILoader iLoader) {
        C1919c.m5984a();
        C1919c.m5988a(iLoader);
    }
}
