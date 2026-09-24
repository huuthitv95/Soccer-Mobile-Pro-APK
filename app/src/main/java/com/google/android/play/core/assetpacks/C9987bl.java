package com.google.android.play.core.assetpacks;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bl */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9987bl extends AssetLocation {

    /* JADX INFO: renamed from: a */
    private final String f22077a;

    /* JADX INFO: renamed from: b */
    private final long f22078b;

    /* JADX INFO: renamed from: c */
    private final long f22079c;

    C9987bl(String str, long j, long j2) {
        if (str == null) {
            throw new NullPointerException("Null path");
        }
        this.f22077a = str;
        this.f22078b = j;
        this.f22079c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetLocation) {
            AssetLocation assetLocation = (AssetLocation) obj;
            if (this.f22077a.equals(assetLocation.path()) && this.f22078b == assetLocation.offset() && this.f22079c == assetLocation.size()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f22077a.hashCode() ^ 1000003;
        long j = this.f22079c;
        long j2 = j ^ (j >>> 32);
        long j3 = this.f22078b;
        return (((iHashCode * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) j2);
    }

    @Override // com.google.android.play.core.assetpacks.AssetLocation
    public final long offset() {
        return this.f22078b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetLocation
    public final String path() {
        return this.f22077a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetLocation
    public final long size() {
        return this.f22079c;
    }

    public final String toString() {
        return "AssetLocation{path=" + this.f22077a + ", offset=" + this.f22078b + ", size=" + this.f22079c + "}";
    }
}
