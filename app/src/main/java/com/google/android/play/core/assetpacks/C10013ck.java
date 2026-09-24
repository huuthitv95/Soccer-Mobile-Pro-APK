package com.google.android.play.core.assetpacks;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ck */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10013ck extends RuntimeException {

    /* JADX INFO: renamed from: a */
    final int f22179a;

    C10013ck(String str) {
        super(str);
        this.f22179a = -1;
    }

    C10013ck(String str, int i) {
        super(str);
        this.f22179a = i;
    }

    C10013ck(String str, Exception exc) {
        super(str, exc);
        this.f22179a = -1;
    }

    C10013ck(String str, Exception exc, int i) {
        super(str, exc);
        this.f22179a = i;
    }
}
