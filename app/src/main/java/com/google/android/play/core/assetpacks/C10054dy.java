package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C10097aq;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.dy */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10054dy {

    /* JADX INFO: renamed from: a */
    private final C9983bh f22316a;

    /* JADX INFO: renamed from: b */
    private final C10034de f22317b;

    /* JADX INFO: renamed from: c */
    private final C10017co f22318c;

    /* JADX INFO: renamed from: d */
    private final C10057ea f22319d;

    /* JADX INFO: renamed from: e */
    private final C10097aq f22320e;

    /* JADX INFO: renamed from: f */
    private final C10097aq f22321f;

    C10054dy(C9983bh c9983bh, C10097aq c10097aq, C10034de c10034de, C10097aq c10097aq2, C10017co c10017co, C10057ea c10057ea) {
        this.f22316a = c9983bh;
        this.f22320e = c10097aq;
        this.f22317b = c10034de;
        this.f22321f = c10097aq2;
        this.f22318c = c10017co;
        this.f22319d = c10057ea;
    }

    /* JADX INFO: renamed from: a */
    public final void m22671a(final C10052dw c10052dw) {
        C9983bh c9983bh = this.f22316a;
        String str = c10052dw.f22256l;
        int i = c10052dw.f22311a;
        long j = c10052dw.f22312b;
        File fileM22566j = c9983bh.m22566j(str, i, j);
        File fileM22568l = c9983bh.m22568l(str, i, j);
        if (!fileM22566j.exists() || !fileM22568l.exists()) {
            throw new C10013ck(String.format("Cannot find pack files to move for pack %s.", c10052dw.f22256l), c10052dw.f22255k);
        }
        File fileM22564h = this.f22316a.m22564h(c10052dw.f22256l, c10052dw.f22311a, c10052dw.f22312b);
        fileM22564h.mkdirs();
        if (!fileM22566j.renameTo(fileM22564h)) {
            throw new C10013ck("Cannot move merged pack files to final location.", c10052dw.f22255k);
        }
        new File(this.f22316a.m22564h(c10052dw.f22256l, c10052dw.f22311a, c10052dw.f22312b), "merge.tmp").delete();
        File fileM22565i = this.f22316a.m22565i(c10052dw.f22256l, c10052dw.f22311a, c10052dw.f22312b);
        fileM22565i.mkdirs();
        if (!fileM22568l.renameTo(fileM22565i)) {
            throw new C10013ck("Cannot move metadata files to final location.", c10052dw.f22255k);
        }
        try {
            this.f22319d.m22674b(c10052dw.f22256l, c10052dw.f22311a, c10052dw.f22312b, c10052dw.f22313c);
            ((Executor) this.f22321f.mo22526a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.dx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22314a.m22672b(c10052dw);
                }
            });
            this.f22317b.m22644k(c10052dw.f22256l, c10052dw.f22311a, c10052dw.f22312b);
            this.f22318c.m22625c(c10052dw.f22256l);
            ((InterfaceC10145y) this.f22320e.mo22526a()).mo22523h(c10052dw.f22255k, c10052dw.f22256l);
        } catch (IOException e) {
            throw new C10013ck(String.format("Could not write asset pack version tag for pack %s: %s", c10052dw.f22256l, e.getMessage()), c10052dw.f22255k);
        }
    }

    /* JADX INFO: renamed from: b */
    final /* synthetic */ void m22672b(C10052dw c10052dw) {
        this.f22316a.m22551B(c10052dw.f22256l, c10052dw.f22311a, c10052dw.f22312b);
    }
}
