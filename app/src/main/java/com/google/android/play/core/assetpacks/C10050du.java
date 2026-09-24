package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C10116o;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.du */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10050du {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22308a = new C10116o("MergeSliceTaskHandler");

    /* JADX INFO: renamed from: b */
    private final C9983bh f22309b;

    C10050du(C9983bh c9983bh) {
        this.f22309b = c9983bh;
    }

    /* JADX INFO: renamed from: b */
    private static void m22669b(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                throw new C10013ck("File clashing with existing file from other slice: ".concat(file2.toString()));
            }
            if (!file.renameTo(file2)) {
                throw new C10013ck("Unable to move file: ".concat(String.valueOf(String.valueOf(file))));
            }
            return;
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            m22669b(file3, new File(file2, file3.getName()));
        }
        if (!file.delete()) {
            throw new C10013ck("Unable to delete directory: ".concat(String.valueOf(String.valueOf(file))));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m22670a(C10049dt c10049dt) {
        File fileM22573q = this.f22309b.m22573q(c10049dt.f22256l, c10049dt.f22305a, c10049dt.f22306b, c10049dt.f22307c);
        if (!fileM22573q.exists()) {
            throw new C10013ck(String.format("Cannot find verified files for slice %s.", c10049dt.f22307c), c10049dt.f22255k);
        }
        File fileM22566j = this.f22309b.m22566j(c10049dt.f22256l, c10049dt.f22305a, c10049dt.f22306b);
        if (!fileM22566j.exists()) {
            fileM22566j.mkdirs();
        }
        m22669b(fileM22573q, fileM22566j);
        try {
            this.f22309b.m22550A(c10049dt.f22256l, c10049dt.f22305a, c10049dt.f22306b, this.f22309b.m22558b(c10049dt.f22256l, c10049dt.f22305a, c10049dt.f22306b) + 1);
        } catch (IOException e) {
            f22308a.m22750b("Writing merge checkpoint failed with %s.", e.getMessage());
            throw new C10013ck("Writing merge checkpoint failed.", e, c10049dt.f22255k);
        }
    }
}
