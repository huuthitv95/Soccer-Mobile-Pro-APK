package com.google.android.gms.games.internal;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.ads.AdError;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzap extends com.google.android.gms.internal.games_v2.zza implements IInterface {
    zzap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.IGamesService");
    }

    public final void zzA(zzam zzamVar, String str, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(6504, parcelZza);
    }

    public final void zzB(zzam zzamVar, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(6503, parcelZza);
    }

    public final void zzC(zzam zzamVar, Bundle bundle, int i, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, bundle);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        zzc(5021, parcelZza);
    }

    public final void zzD(zzam zzamVar, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(5020, parcelZza);
    }

    public final void zzE(zzam zzamVar, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(17001, parcelZza);
    }

    public final void zzF(zzam zzamVar, String str, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(13006, parcelZza);
    }

    public final void zzG(zzam zzamVar, String str, int i, boolean z, boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z2);
        zzc(9020, parcelZza);
    }

    public final void zzH(zzam zzamVar, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(12002, parcelZza);
    }

    public final void zzI(zzam zzamVar, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(5019, parcelZza);
    }

    public final void zzJ(zzam zzamVar, String str, boolean z, int i) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        parcelZza.writeInt(i);
        zzc(15001, parcelZza);
    }

    public final void zzK(zzao zzaoVar, long j) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzaoVar);
        parcelZza.writeLong(j);
        zzc(15501, parcelZza);
    }

    public final void zzL(zzam zzamVar, String str, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(27003, parcelZza);
    }

    public final void zzM(zzam zzamVar, String str, String str2, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, snapshotMetadataChangeEntity);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, contents);
        zzc(12033, parcelZza);
    }

    public final void zzN(zzam zzamVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, bundle);
        zzc(5023, parcelZza);
    }

    public final void zzO(zzam zzamVar, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, bundle);
        zzc(AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, parcelZza);
    }

    public final void zzP(IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, bundle);
        zzc(IronSourceConstants.errorCode_loadException, parcelZza);
    }

    public final void zzQ(zzam zzamVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        zzc(5002, parcelZza);
    }

    public final void zzR(zzam zzamVar, String str, long j, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        parcelZza.writeString(str2);
        zzc(AdError.LOAD_CALLED_WHILE_SHOWING_AD, parcelZza);
    }

    public final void zzS(zzam zzamVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, bundle);
        zzc(5024, parcelZza);
    }

    public final int zzd() throws RemoteException {
        Parcel parcelZzb = zzb(12036, zza());
        int i = parcelZzb.readInt();
        parcelZzb.recycle();
        return i;
    }

    public final int zze() throws RemoteException {
        Parcel parcelZzb = zzb(12035, zza());
        int i = parcelZzb.readInt();
        parcelZzb.recycle();
        return i;
    }

    public final PendingIntent zzf() throws RemoteException {
        Parcel parcelZzb = zzb(25015, zza());
        PendingIntent pendingIntent = (PendingIntent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, PendingIntent.CREATOR);
        parcelZzb.recycle();
        return pendingIntent;
    }

    public final Intent zzg() throws RemoteException {
        Parcel parcelZzb = zzb(9005, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, Intent.CREATOR);
        parcelZzb.recycle();
        return intent;
    }

    public final Intent zzh() throws RemoteException {
        Parcel parcelZzb = zzb(9003, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, Intent.CREATOR);
        parcelZzb.recycle();
        return intent;
    }

    public final Intent zzi(PlayerEntity playerEntity) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, playerEntity);
        Parcel parcelZzb = zzb(15503, parcelZza);
        Intent intent = (Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, Intent.CREATOR);
        parcelZzb.recycle();
        return intent;
    }

    public final Intent zzj(String str, String str2, String str3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        Parcel parcelZzb = zzb(25016, parcelZza);
        Intent intent = (Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, Intent.CREATOR);
        parcelZzb.recycle();
        return intent;
    }

    public final Intent zzk(String str, int i, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        Parcel parcelZzb = zzb(18001, parcelZza);
        Intent intent = (Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, Intent.CREATOR);
        parcelZzb.recycle();
        return intent;
    }

    public final Intent zzl() throws RemoteException {
        Parcel parcelZzb = zzb(9010, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, Intent.CREATOR);
        parcelZzb.recycle();
        return intent;
    }

    public final Intent zzm(String str, boolean z, boolean z2, int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z2);
        parcelZza.writeInt(i);
        Parcel parcelZzb = zzb(12001, parcelZza);
        Intent intent = (Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, Intent.CREATOR);
        parcelZzb.recycle();
        return intent;
    }

    public final DataHolder zzn() throws RemoteException {
        Parcel parcelZzb = zzb(5013, zza());
        DataHolder dataHolder = (DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcelZzb, DataHolder.CREATOR);
        parcelZzb.recycle();
        return dataHolder;
    }

    public final String zzo() throws RemoteException {
        Parcel parcelZzb = zzb(5012, zza());
        String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    public final void zzp() throws RemoteException {
        zzc(IronSourceConstants.errorCode_showFailed, zza());
    }

    public final void zzq(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzc(5001, parcelZza);
    }

    public final void zzr(zzam zzamVar, String str, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, snapshotMetadataChangeEntity);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, contents);
        zzc(12007, parcelZza);
    }

    public final void zzs(zzam zzamVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        zzc(12020, parcelZza);
    }

    public final void zzt(Contents contents) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, contents);
        zzc(12019, parcelZza);
    }

    public final void zzu(zzam zzamVar, String str, String str2, int i, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        zzc(ConnectionsStatusCodes.STATUS_ALREADY_ADVERTISING, parcelZza);
    }

    public final void zzv(zzam zzamVar, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, bundle);
        zzc(5025, parcelZza);
    }

    public final void zzw(String str, int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        zzc(12017, parcelZza);
    }

    public final void zzx(zzam zzamVar, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(6001, parcelZza);
    }

    public final void zzy(zzam zzamVar, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        zzc(12016, parcelZza);
    }

    public final void zzz(zzam zzamVar, boolean z, String[] strArr) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzamVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(parcelZza, z);
        parcelZza.writeStringArray(strArr);
        zzc(12031, parcelZza);
    }
}
