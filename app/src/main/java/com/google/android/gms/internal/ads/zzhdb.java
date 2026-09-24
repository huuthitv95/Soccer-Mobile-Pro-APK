package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdb implements zzhdp {
    private static final Charset zza = Charset.forName("UTF-8");
    private final InputStream zzb;

    private zzhdb(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzhdb zza(String str) {
        return new zzhdb(new ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(zziat zziatVar) throws IOException {
        if (!(zziatVar instanceof zziax)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!zziatVar.zzg().zzc()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long jZzc = zzhle.zzc(zziatVar.zzg().zzh());
            if (jZzc > 4294967295L || jZzc < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) jZzc;
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    @Override // com.google.android.gms.internal.ads.zzhdp
    public final zzhso zzb() throws IOException {
        byte b;
        int i;
        byte b2;
        zzhtb zzhtbVar;
        byte b3;
        zzhse zzhseVar;
        String str = "status";
        String str2 = "keyData";
        try {
            try {
                InputStream inputStream = this.zzb;
                int i2 = zzhea.zza;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i3 = inputStream.read(bArr);
                    InputStream inputStream2 = inputStream;
                    if (i3 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i3);
                    inputStream = inputStream2;
                }
                zziav zziavVarZze = zzhle.zzb(new String(byteArrayOutputStream.toByteArray(), zza)).zze();
                if (!zziavVarZze.zzc("key")) {
                    throw new zziaw("invalid keyset: no key");
                }
                zziat zziatVarZzh = zziavVarZze.zzh("key");
                if (!(zziatVarZzh instanceof zzias)) {
                    throw new zziaw("invalid keyset: key must be an array");
                }
                zzias zziasVarZzf = zziatVarZzh.zzf();
                if (zziasVarZzf.zzb() == 0) {
                    throw new zziaw("invalid keyset: key is empty");
                }
                zzhsl zzhslVarZzh = zzhso.zzh();
                if (zziavVarZze.zzc("primaryKeyId")) {
                    zzhslVarZzh.zza(zzc(zziavVarZze.zzh("primaryKeyId")));
                }
                int i4 = 0;
                while (i4 < zziasVarZzf.zzb()) {
                    zziav zziavVarZze2 = zziasVarZzf.zzc(i4).zze();
                    if (!zziavVarZze2.zzc(str2) || !zziavVarZze2.zzc(str) || !zziavVarZze2.zzc("keyId") || !zziavVarZze2.zzc("outputPrefixType")) {
                        throw new zziaw("invalid key");
                    }
                    zziat zziatVarZzh2 = zziavVarZze2.zzh(str2);
                    if (!(zziatVarZzh2 instanceof zziav)) {
                        throw new zziaw("invalid key: keyData must be an object");
                    }
                    zzhsm zzhsmVarZze = zzhsn.zze();
                    String strZzd = zziavVarZze2.zzh(str).zzd();
                    String str3 = str;
                    int iHashCode = strZzd.hashCode();
                    String str4 = str2;
                    int i5 = i4;
                    if (iHashCode != -891611359) {
                        if (iHashCode != 478389753) {
                            if (iHashCode == 1053567612 && strZzd.equals("DISABLED")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                        } else if (strZzd.equals("DESTROYED")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (strZzd.equals("ENABLED")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        i = 3;
                    } else if (b == 1) {
                        i = 4;
                    } else {
                        if (b != 2) {
                            String.valueOf(strZzd);
                            throw new zziaw("unknown status: ".concat(String.valueOf(strZzd)));
                        }
                        i = 5;
                    }
                    zzhsmVarZze.zze(i);
                    zzhsmVarZze.zzc(zzc(zziavVarZze2.zzh("keyId")));
                    String strZzd2 = zziavVarZze2.zzh("outputPrefixType").zzd();
                    switch (strZzd2) {
                        case "LEGACY":
                            b2 = 2;
                            break;
                        case "RAW":
                            b2 = 1;
                            break;
                        case "TINK":
                            b2 = 0;
                            break;
                        case "CRUNCHY":
                            b2 = 3;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0) {
                        zzhtbVar = zzhtb.TINK;
                    } else if (b2 == 1) {
                        zzhtbVar = zzhtb.RAW;
                    } else if (b2 == 2) {
                        zzhtbVar = zzhtb.LEGACY;
                    } else {
                        if (b2 != 3) {
                            String.valueOf(strZzd2);
                            throw new zziaw("unknown output prefix type: ".concat(String.valueOf(strZzd2)));
                        }
                        zzhtbVar = zzhtb.CRUNCHY;
                    }
                    zzhsmVarZze.zzd(zzhtbVar);
                    zziav zziavVarZze3 = zziatVarZzh2.zze();
                    if (!zziavVarZze3.zzc("typeUrl") || !zziavVarZze3.zzc("value") || !zziavVarZze3.zzc("keyMaterialType")) {
                        throw new zziaw("invalid keyData");
                    }
                    byte[] bArrZza = zzhyx.zza(zziavVarZze3.zzh("value").zzd(), 2);
                    zzhsd zzhsdVarZzd = zzhsf.zzd();
                    zzhsdVarZzd.zza(zziavVarZze3.zzh("typeUrl").zzd());
                    zzicn zzicnVar = zzicn.zza;
                    zzhsdVarZzd.zzb(zzicn.zzt(bArrZza, 0, bArrZza.length));
                    String strZzd3 = zziavVarZze3.zzh("keyMaterialType").zzd();
                    switch (strZzd3) {
                        case "REMOTE":
                            b3 = 3;
                            break;
                        case "SYMMETRIC":
                            b3 = 0;
                            break;
                        case "ASYMMETRIC_PRIVATE":
                            b3 = 1;
                            break;
                        case "ASYMMETRIC_PUBLIC":
                            b3 = 2;
                            break;
                        default:
                            b3 = -1;
                            break;
                    }
                    if (b3 == 0) {
                        zzhseVar = zzhse.SYMMETRIC;
                    } else if (b3 == 1) {
                        zzhseVar = zzhse.ASYMMETRIC_PRIVATE;
                    } else if (b3 == 2) {
                        zzhseVar = zzhse.ASYMMETRIC_PUBLIC;
                    } else {
                        if (b3 != 3) {
                            String.valueOf(strZzd3);
                            throw new zziaw("unknown key material type: ".concat(String.valueOf(strZzd3)));
                        }
                        zzhseVar = zzhse.REMOTE;
                    }
                    zzhsdVarZzd.zzc(zzhseVar);
                    zzhsmVarZze.zza((zzhsf) zzhsdVarZzd.zzbu());
                    zzhslVarZzh.zzb((zzhsn) zzhsmVarZze.zzbu());
                    i4 = i5 + 1;
                    str = str3;
                    str2 = str4;
                }
                zzhso zzhsoVar = (zzhso) zzhslVarZzh.zzbu();
                this.zzb.close();
                return zzhsoVar;
            } catch (Throwable th) {
                this.zzb.close();
                throw th;
            }
        } catch (zziaw | IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
