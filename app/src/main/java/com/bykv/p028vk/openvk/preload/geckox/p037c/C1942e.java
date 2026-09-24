package com.bykv.p028vk.openvk.preload.geckox.p037c;

import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1970g;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.e */
/* JADX INFO: compiled from: LoadLocalChannelVersionInterceptorMulti.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1942e extends AbstractC1886d<String, Map<String, List<Pair<String, Long>>>> {

    /* JADX INFO: renamed from: d */
    private File f4402d;

    /* JADX INFO: renamed from: e */
    private List<String> f4403e;

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo5832a(InterfaceC1882b<Map<String, List<Pair<String, Long>>>> interfaceC1882b, String str) throws Throwable {
        Long lM6084a;
        GeckoLogger.m6040d("gecko-debug-tag", "get local channel version:", str);
        HashMap map = new HashMap();
        for (String str2 : this.f4403e) {
            File file = new File(this.f4402d, str2);
            String[] list = file.list();
            ArrayList arrayList = new ArrayList();
            if (list != null && list.length > 0) {
                for (String str3 : list) {
                    File file2 = new File(file, str3);
                    if (file2.isDirectory() && (lM6084a = C1970g.m6084a(file2)) != null) {
                        arrayList.add(new Pair<>(str3, lM6084a));
                    }
                }
            }
            map.put(str2, arrayList);
        }
        return interfaceC1882b.mo5836a(map);
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    protected final void mo5848a(Object... objArr) {
        super.mo5848a(objArr);
        this.f4402d = (File) objArr[0];
        this.f4403e = (List) objArr[1];
    }
}
