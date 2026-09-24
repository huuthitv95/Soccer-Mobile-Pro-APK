package com.chartboost.sdk.impl;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.p8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3979p8 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3682c8 f15790a;

    public C3979p8(InterfaceC3682c8 fileCaching) {
        Intrinsics.checkNotNullParameter(fileCaching, "fileCaching");
        this.f15790a = fileCaching;
    }

    /* JADX INFO: renamed from: a */
    public final File m19029a(C4087u6 c4087u6) {
        return AbstractC4109v6.m19652a(c4087u6, this.f15790a.mo17049c());
    }

    /* JADX INFO: renamed from: b */
    public final File m19030b(C4087u6 c4087u6) {
        return AbstractC4109v6.m19652a(c4087u6, this.f15790a.mo17046a());
    }

    /* JADX INFO: renamed from: c */
    public final void m19031c(C4087u6 download) throws IOException {
        Intrinsics.checkNotNullParameter(download, "download");
        if (C3851jg.f14967a.m18286d()) {
            m19030b(download).createNewFile();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19032d(C4087u6 download) {
        Intrinsics.checkNotNullParameter(download, "download");
        if (C3851jg.f14967a.m18286d()) {
            m19029a(download).delete();
            m19030b(download).delete();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m19033e(C4087u6 download) throws IOException {
        Intrinsics.checkNotNullParameter(download, "download");
        if (C3851jg.f14967a.m18286d()) {
            m19030b(download).delete();
            m19029a(download).createNewFile();
        }
    }
}
