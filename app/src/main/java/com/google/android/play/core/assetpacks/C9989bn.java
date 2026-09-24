package com.google.android.play.core.assetpacks;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bn */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9989bn extends AssetPackState {

    /* JADX INFO: renamed from: a */
    private final String f22083a;

    /* JADX INFO: renamed from: b */
    private final int f22084b;

    /* JADX INFO: renamed from: c */
    private final int f22085c;

    /* JADX INFO: renamed from: d */
    private final long f22086d;

    /* JADX INFO: renamed from: e */
    private final long f22087e;

    /* JADX INFO: renamed from: f */
    private final int f22088f;

    /* JADX INFO: renamed from: g */
    private final int f22089g;

    /* JADX INFO: renamed from: h */
    private final String f22090h;

    /* JADX INFO: renamed from: i */
    private final String f22091i;

    C9989bn(String str, int i, int i2, long j, long j2, int i3, int i4, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f22083a = str;
        this.f22084b = i;
        this.f22085c = i2;
        this.f22086d = j;
        this.f22087e = j2;
        this.f22088f = i3;
        this.f22089g = i4;
        if (str2 == null) {
            throw new NullPointerException("Null availableVersionTag");
        }
        this.f22090h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null installedVersionTag");
        }
        this.f22091i = str3;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String availableVersionTag() {
        return this.f22090h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long bytesDownloaded() {
        return this.f22086d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f22083a.equals(assetPackState.name()) && this.f22084b == assetPackState.status() && this.f22085c == assetPackState.errorCode() && this.f22086d == assetPackState.bytesDownloaded() && this.f22087e == assetPackState.totalBytesToDownload() && this.f22088f == assetPackState.transferProgressPercentage() && this.f22089g == assetPackState.updateAvailability() && this.f22090h.equals(assetPackState.availableVersionTag()) && this.f22091i.equals(assetPackState.installedVersionTag())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int errorCode() {
        return this.f22085c;
    }

    public final int hashCode() {
        int iHashCode = this.f22083a.hashCode() ^ 1000003;
        long j = this.f22087e;
        String str = this.f22090h;
        long j2 = this.f22086d;
        return (((((((((((((((iHashCode * 1000003) ^ this.f22084b) * 1000003) ^ this.f22085c) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f22088f) * 1000003) ^ this.f22089g) * 1000003) ^ str.hashCode()) * 1000003) ^ this.f22091i.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String installedVersionTag() {
        return this.f22091i;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String name() {
        return this.f22083a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int status() {
        return this.f22084b;
    }

    public final String toString() {
        return "AssetPackState{name=" + this.f22083a + ", status=" + this.f22084b + ", errorCode=" + this.f22085c + ", bytesDownloaded=" + this.f22086d + ", totalBytesToDownload=" + this.f22087e + ", transferProgressPercentage=" + this.f22088f + ", updateAvailability=" + this.f22089g + ", availableVersionTag=" + this.f22090h + ", installedVersionTag=" + this.f22091i + "}";
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long totalBytesToDownload() {
        return this.f22087e;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int transferProgressPercentage() {
        return this.f22088f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int updateAvailability() {
        return this.f22089g;
    }
}
