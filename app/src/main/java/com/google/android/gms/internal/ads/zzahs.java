package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzahs implements zzahl {
    public final zzgvz zza;
    private final int zzb;

    private zzahs(int i, zzgvz zzgvzVar) {
        this.zzb = i;
        this.zza = zzgvzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzahs zzb(int i, zzes zzesVar) {
        String str;
        zzahl zzahtVar;
        String str2;
        zzgvw zzgvwVar = new zzgvw();
        int iZze = zzesVar.zze();
        int iZzc = -2;
        while (zzesVar.zzd() > 8) {
            int iZzC = zzesVar.zzC();
            int iZzg = zzesVar.zzg() + zzesVar.zzC();
            zzesVar.zzf(iZzg);
            if (iZzC != 1414744396) {
                zzaht zzahtVar2 = null;
                switch (iZzC) {
                    case 1718776947:
                        if (iZzc != 2) {
                            if (iZzc == 1) {
                                int iZzu = zzesVar.zzu();
                                if (iZzu == 1) {
                                    str = "audio/raw";
                                } else if (iZzu == 85) {
                                    str = "audio/mpeg";
                                } else if (iZzu == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iZzu != 8192) {
                                    str = iZzu != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iZzu2 = zzesVar.zzu();
                                    int iZzC2 = zzesVar.zzC();
                                    zzesVar.zzk(6);
                                    int iZzB = zzfk.zzB(zzesVar.zzu(), ByteOrder.LITTLE_ENDIAN);
                                    int iZzu3 = zzesVar.zzd() > 0 ? zzesVar.zzu() : 0;
                                    zzt zztVar = new zzt();
                                    zztVar.zzo(str);
                                    zztVar.zzG(iZzu2);
                                    zztVar.zzH(iZzC2);
                                    if (str.equals("audio/raw") && iZzB != 0) {
                                        zztVar.zzI(iZzB);
                                    }
                                    if (str.equals("audio/mp4a-latm") && iZzu3 > 0) {
                                        byte[] bArr = new byte[iZzu3];
                                        zzesVar.zzm(bArr, 0, iZzu3);
                                        zztVar.zzr(zzgvz.zzj(bArr));
                                    }
                                    zzahtVar = new zzaht(zztVar.zzO());
                                } else {
                                    StringBuilder sb = new StringBuilder(String.valueOf(iZzu).length() + 43);
                                    sb.append("Ignoring track with unsupported format tag ");
                                    sb.append(iZzu);
                                    zzef.zzc("StreamFormatChunk", sb.toString());
                                }
                            } else {
                                zzef.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfk.zzR(iZzc)));
                            }
                            break;
                        } else {
                            zzesVar.zzk(4);
                            int iZzC3 = zzesVar.zzC();
                            int iZzC4 = zzesVar.zzC();
                            zzesVar.zzk(4);
                            int iZzC5 = zzesVar.zzC();
                            switch (iZzC5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzC5).length() + 44);
                                sb2.append("Ignoring track with unsupported compression ");
                                sb2.append(iZzC5);
                                zzef.zzc("StreamFormatChunk", sb2.toString());
                            } else {
                                zzt zztVar2 = new zzt();
                                zztVar2.zzv(iZzC3);
                                zztVar2.zzw(iZzC4);
                                zztVar2.zzo(str2);
                                zzahtVar2 = new zzaht(zztVar2.zzO());
                            }
                        }
                        zzahtVar = zzahtVar2;
                        break;
                    case 1751742049:
                        zzahtVar = zzahp.zzb(zzesVar);
                        break;
                    case 1752331379:
                        zzahtVar = zzahq.zzb(zzesVar);
                        break;
                    case 1852994675:
                        zzahtVar = zzahu.zzb(zzesVar);
                        break;
                    default:
                        zzahtVar = zzahtVar2;
                        break;
                }
            } else {
                zzahtVar = zzb(zzesVar.zzC(), zzesVar);
            }
            if (zzahtVar != null) {
                if (zzahtVar.zza() == 1752331379) {
                    iZzc = ((zzahq) zzahtVar).zzc();
                }
                zzgvwVar.zzf(zzahtVar);
            }
            zzesVar.zzh(iZzg);
            zzesVar.zzf(iZze);
        }
        return new zzahs(i, zzgvwVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final int zza() {
        return this.zzb;
    }

    public final zzahl zzc(Class cls) {
        zzgvz zzgvzVar = this.zza;
        int size = zzgvzVar.size();
        int i = 0;
        while (i < size) {
            zzahl zzahlVar = (zzahl) zzgvzVar.get(i);
            i++;
            if (zzahlVar.getClass() == cls) {
                return zzahlVar;
            }
        }
        return null;
    }
}
