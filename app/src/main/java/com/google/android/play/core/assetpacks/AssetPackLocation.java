package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AssetPackLocation {

    /* JADX INFO: renamed from: a */
    private static final AssetPackLocation f21965a = new C9988bm(1, null, null);

    /* JADX INFO: renamed from: a */
    static AssetPackLocation m22475a() {
        return f21965a;
    }

    public abstract String assetsPath();

    public abstract int packStorageMethod();

    public abstract String path();
}
