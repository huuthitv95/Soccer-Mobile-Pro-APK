package com.bykv.p028vk.openvk.preload.geckox.p033a.p034a;

import com.bykv.p028vk.openvk.preload.geckox.p033a.C1909c;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1965b;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.e */
/* JADX INFO: compiled from: FIFOCachePolicy.java */
/* JADX INFO: loaded from: classes3.dex */
final class C1906e extends AbstractC1903b {
    C1906e() {
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.p033a.p034a.AbstractC1903b
    /* JADX INFO: renamed from: a */
    public final void mo5907a() {
        Iterator<String> it = this.f4319e.iterator();
        while (it.hasNext()) {
            List<File> listM6076b = C1965b.m6076b(new File(this.f4318d, it.next()));
            if (listM6076b != null && listM6076b.size() > this.f4317c.f4309a) {
                for (File file : listM6076b.subList(0, listM6076b.size() - this.f4317c.f4309a)) {
                    C1909c.m5916b(file.getAbsolutePath());
                    if (this.f4317c.f4310b != null) {
                        file.getName();
                    }
                }
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.p033a.p034a.AbstractC1903b
    /* JADX INFO: renamed from: a */
    public final void mo5908a(C1902a c1902a, File file, List<String> list) {
        super.mo5908a(c1902a, file, list);
    }
}
