package com.google.android.play.core.assetpacks;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bm */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9988bm extends AssetPackLocation {

    /* JADX INFO: renamed from: a */
    private final int f22080a;

    /* JADX INFO: renamed from: b */
    private final String f22081b;

    /* JADX INFO: renamed from: c */
    private final String f22082c;

    C9988bm(int i, String str, String str2) {
        this.f22080a = i;
        this.f22081b = str;
        this.f22082c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final String assetsPath() {
        return this.f22082c;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackLocation) {
            AssetPackLocation assetPackLocation = (AssetPackLocation) obj;
            if (this.f22080a == assetPackLocation.packStorageMethod() && ((str = this.f22081b) != null ? str.equals(assetPackLocation.path()) : assetPackLocation.path() == null) && ((str2 = this.f22082c) != null ? str2.equals(assetPackLocation.assetsPath()) : assetPackLocation.assetsPath() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22081b;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.f22080a;
        String str2 = this.f22082c;
        return ((iHashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final int packStorageMethod() {
        return this.f22080a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final String path() {
        return this.f22081b;
    }

    public final String toString() {
        return "AssetPackLocation{packStorageMethod=" + this.f22080a + ", path=" + this.f22081b + ", assetsPath=" + this.f22082c + "}";
    }
}
