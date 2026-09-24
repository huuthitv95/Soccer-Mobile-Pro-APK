package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.games.internal.zzh;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class MostRecentGameInfoEntity extends zzh implements zza {
    public static final Parcelable.Creator<MostRecentGameInfoEntity> CREATOR = new zzb();
    private final String zza;
    private final String zzb;
    private final long zzc;
    private final Uri zzd;
    private final Uri zze;
    private final Uri zzf;

    public MostRecentGameInfoEntity(zza zzaVar) {
        this.zza = zzaVar.zze();
        this.zzb = zzaVar.zzf();
        this.zzc = zzaVar.zza();
        this.zzd = zzaVar.zzd();
        this.zze = zzaVar.zzc();
        this.zzf = zzaVar.zzb();
    }

    MostRecentGameInfoEntity(String str, String str2, long j, Uri uri, Uri uri2, Uri uri3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = uri;
        this.zze = uri2;
        this.zzf = uri3;
    }

    static int zzg(zza zzaVar) {
        return Objects.hashCode(zzaVar.zze(), zzaVar.zzf(), Long.valueOf(zzaVar.zza()), zzaVar.zzd(), zzaVar.zzc(), zzaVar.zzb());
    }

    static String zzh(zza zzaVar) {
        return Objects.toStringHelper(zzaVar).add("GameId", zzaVar.zze()).add("GameName", zzaVar.zzf()).add("ActivityTimestampMillis", Long.valueOf(zzaVar.zza())).add("GameIconUri", zzaVar.zzd()).add("GameHiResUri", zzaVar.zzc()).add("GameFeaturedUri", zzaVar.zzb()).toString();
    }

    static boolean zzi(zza zzaVar, Object obj) {
        if (!(obj instanceof zza)) {
            return false;
        }
        if (zzaVar == obj) {
            return true;
        }
        zza zzaVar2 = (zza) obj;
        return Objects.equal(zzaVar2.zze(), zzaVar.zze()) && Objects.equal(zzaVar2.zzf(), zzaVar.zzf()) && Objects.equal(Long.valueOf(zzaVar2.zza()), Long.valueOf(zzaVar.zza())) && Objects.equal(zzaVar2.zzd(), zzaVar.zzd()) && Objects.equal(zzaVar2.zzc(), zzaVar.zzc()) && Objects.equal(zzaVar2.zzb(), zzaVar.zzb());
    }

    public final boolean equals(Object obj) {
        return zzi(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }

    public final int hashCode() {
        return zzg(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final String toString() {
        return zzh(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final Uri zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final String zzf() {
        return this.zzb;
    }
}
