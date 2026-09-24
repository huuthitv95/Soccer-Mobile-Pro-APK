package com.google.android.play.core.assetpacks;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bp */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9991bp extends AbstractC10068el {

    /* JADX INFO: renamed from: a */
    private final int f22094a;

    /* JADX INFO: renamed from: b */
    private final String f22095b;

    /* JADX INFO: renamed from: c */
    private final long f22096c;

    /* JADX INFO: renamed from: d */
    private final long f22097d;

    /* JADX INFO: renamed from: e */
    private final int f22098e;

    C9991bp(int i, String str, long j, long j2, int i2) {
        this.f22094a = i;
        this.f22095b = str;
        this.f22096c = j;
        this.f22097d = j2;
        this.f22098e = i2;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC10068el
    /* JADX INFO: renamed from: a */
    final int mo22586a() {
        return this.f22094a;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC10068el
    /* JADX INFO: renamed from: b */
    final int mo22587b() {
        return this.f22098e;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC10068el
    /* JADX INFO: renamed from: c */
    final long mo22588c() {
        return this.f22096c;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC10068el
    /* JADX INFO: renamed from: d */
    final long mo22589d() {
        return this.f22097d;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC10068el
    /* JADX INFO: renamed from: e */
    final String mo22590e() {
        return this.f22095b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10068el) {
            AbstractC10068el abstractC10068el = (AbstractC10068el) obj;
            if (this.f22094a == abstractC10068el.mo22586a() && ((str = this.f22095b) != null ? str.equals(abstractC10068el.mo22590e()) : abstractC10068el.mo22590e() == null) && this.f22096c == abstractC10068el.mo22588c() && this.f22097d == abstractC10068el.mo22589d() && this.f22098e == abstractC10068el.mo22587b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22095b;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.f22094a;
        long j = this.f22096c;
        long j2 = this.f22097d;
        return ((((((iHashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f22098e;
    }

    public final String toString() {
        return "SliceCheckpoint{fileExtractionStatus=" + this.f22094a + ", filePath=" + this.f22095b + ", fileOffset=" + this.f22096c + ", remainingBytes=" + this.f22097d + ", previousChunk=" + this.f22098e + "}";
    }
}
