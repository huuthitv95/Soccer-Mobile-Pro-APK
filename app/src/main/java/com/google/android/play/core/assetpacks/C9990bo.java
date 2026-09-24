package com.google.android.play.core.assetpacks;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bo */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9990bo extends AssetPackStates {

    /* JADX INFO: renamed from: a */
    private final long f22092a;

    /* JADX INFO: renamed from: b */
    private final Map f22093b;

    C9990bo(long j, Map map) {
        this.f22092a = j;
        this.f22093b = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackStates) {
            AssetPackStates assetPackStates = (AssetPackStates) obj;
            if (this.f22092a == assetPackStates.totalBytes() && this.f22093b.equals(assetPackStates.packStates())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f22092a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f22093b.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackStates
    public final Map<String, AssetPackState> packStates() {
        return this.f22093b;
    }

    public final String toString() {
        return "AssetPackStates{totalBytes=" + this.f22092a + ", packStates=" + this.f22093b.toString() + "}";
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackStates
    public final long totalBytes() {
        return this.f22092a;
    }
}
