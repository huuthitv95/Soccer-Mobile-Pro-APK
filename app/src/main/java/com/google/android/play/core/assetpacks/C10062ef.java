package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C10093am;
import com.google.android.play.core.assetpacks.internal.C10097aq;
import com.google.android.play.core.assetpacks.internal.C10116o;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ef */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10062ef {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22346a = new C10116o("PatchSliceTaskHandler");

    /* JADX INFO: renamed from: b */
    private final C9983bh f22347b;

    /* JADX INFO: renamed from: c */
    private final C10097aq f22348c;

    C10062ef(C9983bh c9983bh, C10097aq c10097aq) {
        this.f22347b = c9983bh;
        this.f22348c = c10097aq;
    }

    /* JADX INFO: renamed from: a */
    public final void m22676a(C10061ee c10061ee) {
        C9983bh c9983bh = this.f22347b;
        String str = c10061ee.f22256l;
        int i = c10061ee.f22338a;
        long j = c10061ee.f22339b;
        File fileM22564h = c9983bh.m22564h(str, i, j);
        File file = new File(c9983bh.m22565i(str, i, j), c10061ee.f22343f);
        try {
            InputStream inputStream = c10061ee.f22345h;
            InputStream gZIPInputStream = c10061ee.f22342e != 2 ? inputStream : new GZIPInputStream(inputStream, 8192);
            try {
                C9986bk c9986bk = new C9986bk(fileM22564h, file);
                File fileM22572p = this.f22347b.m22572p(c10061ee.f22256l, c10061ee.f22340c, c10061ee.f22341d, c10061ee.f22343f);
                if (!fileM22572p.exists()) {
                    fileM22572p.mkdirs();
                }
                C10069em c10069em = new C10069em(this.f22347b, c10061ee.f22256l, c10061ee.f22340c, c10061ee.f22341d, c10061ee.f22343f);
                C10093am.m22713a(c9986bk, gZIPInputStream, new C10016cn(fileM22572p, c10069em), c10061ee.f22344g);
                c10069em.m22689i(0);
                gZIPInputStream.close();
                f22346a.m22752d("Patching and extraction finished for slice %s of pack %s.", c10061ee.f22343f, c10061ee.f22256l);
                ((InterfaceC10145y) this.f22348c.mo22526a()).mo22522g(c10061ee.f22255k, c10061ee.f22256l, c10061ee.f22343f, 0);
                try {
                    c10061ee.f22345h.close();
                } catch (IOException unused) {
                    f22346a.m22753e("Could not close file for slice %s of pack %s.", c10061ee.f22343f, c10061ee.f22256l);
                }
            } catch (Throwable th) {
                try {
                    gZIPInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            f22346a.m22750b("IOException during patching %s.", e.getMessage());
            throw new C10013ck(String.format("Error patching slice %s of pack %s.", c10061ee.f22343f, c10061ee.f22256l), e, c10061ee.f22255k);
        }
    }
}
