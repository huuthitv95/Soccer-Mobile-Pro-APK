package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C10116o;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.eq */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10073eq {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22380a = new C10116o("VerifySliceTaskHandler");

    /* JADX INFO: renamed from: b */
    private final C9983bh f22381b;

    C10073eq(C9983bh c9983bh) {
        this.f22381b = c9983bh;
    }

    /* JADX INFO: renamed from: b */
    private final void m22696b(C10072ep c10072ep, File file) {
        try {
            File fileM22571o = this.f22381b.m22571o(c10072ep.f22256l, c10072ep.f22376a, c10072ep.f22377b, c10072ep.f22378c);
            if (!fileM22571o.exists()) {
                throw new C10013ck(String.format("Cannot find metadata files for slice %s.", c10072ep.f22378c), c10072ep.f22255k);
            }
            try {
                if (!C10046dq.m22662a(C10071eo.m22694a(file, fileM22571o)).equals(c10072ep.f22379d)) {
                    throw new C10013ck(String.format("Verification failed for slice %s.", c10072ep.f22378c), c10072ep.f22255k);
                }
                f22380a.m22752d("Verification of slice %s of pack %s successful.", c10072ep.f22378c, c10072ep.f22256l);
            } catch (IOException e) {
                throw new C10013ck(String.format("Could not digest file during verification for slice %s.", c10072ep.f22378c), e, c10072ep.f22255k);
            } catch (NoSuchAlgorithmException e2) {
                throw new C10013ck("SHA256 algorithm not supported.", e2, c10072ep.f22255k);
            }
        } catch (IOException e3) {
            throw new C10013ck(String.format("Could not reconstruct slice archive during verification for slice %s.", c10072ep.f22378c), e3, c10072ep.f22255k);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m22697a(C10072ep c10072ep) {
        File fileM22572p = this.f22381b.m22572p(c10072ep.f22256l, c10072ep.f22376a, c10072ep.f22377b, c10072ep.f22378c);
        if (!fileM22572p.exists()) {
            throw new C10013ck(String.format("Cannot find unverified files for slice %s.", c10072ep.f22378c), c10072ep.f22255k);
        }
        m22696b(c10072ep, fileM22572p);
        File fileM22573q = this.f22381b.m22573q(c10072ep.f22256l, c10072ep.f22376a, c10072ep.f22377b, c10072ep.f22378c);
        if (!fileM22573q.exists()) {
            fileM22573q.mkdirs();
        }
        if (!fileM22572p.renameTo(fileM22573q)) {
            throw new C10013ck(String.format("Failed to move slice %s after verification.", c10072ep.f22378c), c10072ep.f22255k);
        }
    }
}
