package com.bykv.p028vk.openvk.preload.geckox.p037c;

import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1970g;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.d */
/* JADX INFO: compiled from: LoadLocalChannelVersionInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1941d extends AbstractC1886d<List<String>, List<Pair<String, Long>>> {

    /* JADX INFO: renamed from: d */
    private File f4400d;

    /* JADX INFO: renamed from: e */
    private String f4401e;

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo5832a(InterfaceC1882b<List<Pair<String, Long>>> interfaceC1882b, List<String> list) throws Throwable {
        List<String> list2 = list;
        GeckoLogger.m6040d("gecko-debug-tag", "get local channel version:", list2);
        File file = new File(this.f4400d, this.f4401e);
        ArrayList arrayList = new ArrayList();
        for (String str : list2) {
            Long lM6084a = C1970g.m6084a(new File(file, str));
            arrayList.add(new Pair<>(str, Long.valueOf(lM6084a == null ? 0L : lM6084a.longValue())));
        }
        return interfaceC1882b.mo5836a(arrayList);
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    protected final void mo5848a(Object... objArr) {
        super.mo5848a(objArr);
        this.f4400d = (File) objArr[0];
        this.f4401e = (String) objArr[1];
    }
}
