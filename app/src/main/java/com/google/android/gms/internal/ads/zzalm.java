package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import androidx.media3.common.MimeTypes;
import com.google.firebase.sessions.settings.RemoteSettings;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzalm {
    public static void zza(int i, zzap zzapVar, zzt zztVar, zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(-9223372036854775807L, new zzao[0]);
        }
        if (zzapVar != null) {
            zzgvz zzgvzVarZzd = zzapVar.zzd(zzfu.class);
            int size = zzgvzVarZzd.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzfu zzfuVar = (zzfu) zzgvzVarZzd.get(i2);
                if (!zzfuVar.zza.equals("com.android.capture.fps") || i == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfuVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzl(zzapVar2);
        }
    }

    public static void zzb(int i, zzagi zzagiVar, zzt zztVar) {
        if (i == 1 && zzagiVar.zzb()) {
            zztVar.zzJ(zzagiVar.zza);
            zztVar.zzK(zzagiVar.zzb);
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0288 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:9:0x0030, B:11:0x003b, B:13:0x0047, B:16:0x0053, B:19:0x0060, B:22:0x006d, B:25:0x007a, B:28:0x0087, B:30:0x0093, B:38:0x00ae, B:39:0x00cc, B:40:0x00df, B:43:0x00eb, B:46:0x00f8, B:49:0x0105, B:52:0x0112, B:55:0x011f, B:58:0x012c, B:61:0x0139, B:64:0x0146, B:67:0x0153, B:70:0x0163, B:74:0x0177, B:76:0x017d, B:78:0x0192, B:79:0x0199, B:81:0x01a0, B:86:0x01ab, B:91:0x01b7, B:137:0x0288, B:92:0x01cc, B:94:0x01d3, B:96:0x01df, B:97:0x01f3, B:112:0x0220, B:115:0x022d, B:118:0x023a, B:121:0x0247, B:124:0x0253, B:127:0x025f, B:130:0x0269, B:133:0x0275, B:136:0x0281, B:138:0x02a5, B:139:0x02ac), top: B:144:0x0022 }] */
    public static zzao zzc(zzes zzesVar) {
        String str;
        zzao zzaixVar;
        int iZzg = zzesVar.zzg() + zzesVar.zzB();
        int iZzB = zzesVar.zzB();
        int i = (iZzB >> 24) & 255;
        zzao zzaoVarZzd = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = iZzB & ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int iZzB2 = zzesVar.zzB();
                    if (zzesVar.zzB() == 1684108385) {
                        zzesVar.zzk(8);
                        String strZzL = zzesVar.zzL(iZzB2 - 16);
                        zzaoVarZzd = new zzajb("und", strZzL, strZzL);
                    } else {
                        zzef.zzc("MetadataUtil", "Failed to parse comment attribute: ".concat(zzfy.zze(iZzB)));
                    }
                } else if (i2 == 7233901 || i2 == 7631467) {
                    zzaoVarZzd = zzd(iZzB, "TIT2", zzesVar);
                } else if (i2 == 6516589 || i2 == 7828084) {
                    zzaoVarZzd = zzd(iZzB, "TCOM", zzesVar);
                } else if (i2 == 6578553) {
                    zzaoVarZzd = zzd(iZzB, "TDRC", zzesVar);
                } else if (i2 == 4280916) {
                    zzaoVarZzd = zzd(iZzB, "TPE1", zzesVar);
                } else if (i2 == 7630703) {
                    zzaoVarZzd = zzd(iZzB, "TSSE", zzesVar);
                } else if (i2 == 6384738) {
                    zzaoVarZzd = zzd(iZzB, "TALB", zzesVar);
                } else if (i2 == 7108978) {
                    zzaoVarZzd = zzd(iZzB, "USLT", zzesVar);
                } else if (i2 == 6776174) {
                    zzaoVarZzd = zzd(iZzB, "TCON", zzesVar);
                } else if (i2 == 6779504) {
                    zzaoVarZzd = zzd(iZzB, "TIT1", zzesVar);
                } else if (i2 == 7173742) {
                    zzaoVarZzd = zzd(iZzB, "MVNM", zzesVar);
                } else if (i2 == 7173737) {
                    zzaoVarZzd = zze(iZzB, "MVIN", zzesVar, true, false);
                } else {
                    String strZze = zzfy.zze(iZzB);
                    StringBuilder sb = new StringBuilder(strZze.length() + 32);
                    sb.append("Skipped unknown metadata entry: ");
                    sb.append(strZze);
                    zzef.zza("MetadataUtil", sb.toString());
                }
            } else if (iZzB == 1735291493) {
                String strZza = zzaji.zza(zzf(zzesVar) - 1);
                if (strZza != null) {
                    zzaixVar = new zzajm("TCON", null, zzgvz.zzj(strZza));
                    zzaoVarZzd = zzaixVar;
                } else {
                    zzef.zzc("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (iZzB == 1684632427) {
                zzaoVarZzd = zzg(1684632427, "TPOS", zzesVar);
            } else if (iZzB == 1953655662) {
                zzaoVarZzd = zzg(1953655662, "TRCK", zzesVar);
            } else if (iZzB == 1953329263) {
                zzaoVarZzd = zze(1953329263, "TBPM", zzesVar, true, false);
            } else if (iZzB == 1668311404) {
                zzaoVarZzd = zze(1668311404, "TCMP", zzesVar, true, true);
            } else if (iZzB == 1668249202) {
                int iZzB3 = zzesVar.zzB();
                if (zzesVar.zzB() == 1684108385) {
                    int iZzB4 = zzesVar.zzB();
                    int i3 = zzald.zza;
                    int i4 = iZzB4 & ViewCompat.MEASURED_SIZE_MASK;
                    if (i4 == 13) {
                        str = "image/jpeg";
                    } else if (i4 == 14) {
                        str = MimeTypes.IMAGE_PNG;
                        i4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 30);
                        sb2.append("Unrecognized cover art flags: ");
                        sb2.append(i4);
                        zzef.zzc("MetadataUtil", sb2.toString());
                    } else {
                        zzesVar.zzk(4);
                        int i5 = iZzB3 - 16;
                        byte[] bArr = new byte[i5];
                        zzesVar.zzm(bArr, 0, i5);
                        zzaixVar = new zzaix(str, null, 3, bArr);
                        zzaoVarZzd = zzaixVar;
                    }
                } else {
                    zzef.zzc("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (iZzB == 1631670868) {
                zzaoVarZzd = zzd(1631670868, "TPE2", zzesVar);
            } else if (iZzB == 1936682605) {
                zzaoVarZzd = zzd(1936682605, "TSOT", zzesVar);
            } else if (iZzB == 1936679276) {
                zzaoVarZzd = zzd(1936679276, "TSOA", zzesVar);
            } else if (iZzB == 1936679282) {
                zzaoVarZzd = zzd(1936679282, "TSOP", zzesVar);
            } else if (iZzB == 1936679265) {
                zzaoVarZzd = zzd(1936679265, "TSO2", zzesVar);
            } else if (iZzB == 1936679791) {
                zzaoVarZzd = zzd(1936679791, "TSOC", zzesVar);
            } else if (iZzB == 1920233063) {
                zzaoVarZzd = zze(1920233063, "ITUNESADVISORY", zzesVar, false, false);
            } else if (iZzB == 1885823344) {
                zzaoVarZzd = zze(1885823344, "ITUNESGAPLESS", zzesVar, false, true);
            } else if (iZzB == 1936683886) {
                zzaoVarZzd = zzd(1936683886, "TVSHOWSORT", zzesVar);
            } else if (iZzB == 1953919848) {
                zzaoVarZzd = zzd(1953919848, "TVSHOW", zzesVar);
            } else if (iZzB == 757935405) {
                int i6 = -1;
                int i7 = -1;
                String strZzL2 = null;
                String strZzL3 = null;
                while (zzesVar.zzg() < iZzg) {
                    int iZzg2 = zzesVar.zzg();
                    int iZzB5 = zzesVar.zzB();
                    int iZzB6 = zzesVar.zzB();
                    zzesVar.zzk(4);
                    if (iZzB6 == 1835360622) {
                        strZzL2 = zzesVar.zzL(iZzB5 - 12);
                    } else {
                        int i8 = iZzB5 - 12;
                        if (iZzB6 == 1851878757) {
                            strZzL3 = zzesVar.zzL(i8);
                        } else {
                            if (iZzB6 == 1684108385) {
                                i7 = iZzB5;
                            }
                            if (iZzB6 == 1684108385) {
                                i6 = iZzg2;
                            }
                            zzesVar.zzk(i8);
                        }
                    }
                }
                if (strZzL2 != null && strZzL3 != null && i6 != -1) {
                    zzesVar.zzh(i6);
                    zzesVar.zzk(16);
                    zzaoVarZzd = new zzajj(strZzL2, strZzL3, zzesVar.zzL(i7 - 16));
                }
            } else {
                String strZze2 = zzfy.zze(iZzB);
                StringBuilder sb3 = new StringBuilder(strZze2.length() + 32);
                sb3.append("Skipped unknown metadata entry: ");
                sb3.append(strZze2);
                zzef.zza("MetadataUtil", sb3.toString());
            }
            zzesVar.zzh(iZzg);
            return zzaoVarZzd;
        } catch (Throwable th) {
            zzesVar.zzh(iZzg);
            throw th;
        }
    }

    private static zzajm zzd(int i, String str, zzes zzesVar) {
        int iZzB = zzesVar.zzB();
        if (zzesVar.zzB() == 1684108385) {
            zzesVar.zzk(8);
            return new zzajm(str, null, zzgvz.zzj(zzesVar.zzL(iZzB - 16)));
        }
        zzef.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzfy.zze(i)));
        return null;
    }

    private static zzajh zze(int i, String str, zzes zzesVar, boolean z, boolean z2) {
        int iZzf = zzf(zzesVar);
        if (z2) {
            iZzf = Math.min(1, iZzf);
        }
        if (iZzf >= 0) {
            return z ? new zzajm(str, null, zzgvz.zzj(Integer.toString(iZzf))) : new zzajb("und", str, Integer.toString(iZzf));
        }
        zzef.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzfy.zze(i)));
        return null;
    }

    private static int zzf(zzes zzesVar) {
        int iZzB = zzesVar.zzB();
        if (zzesVar.zzB() == 1684108385) {
            zzesVar.zzk(8);
            int i = iZzB - 16;
            if (i == 1) {
                return zzesVar.zzs();
            }
            if (i == 2) {
                return zzesVar.zzt();
            }
            if (i == 3) {
                return zzesVar.zzx();
            }
            if (i == 4 && (zzesVar.zzn() & 128) == 0) {
                return zzesVar.zzH();
            }
        }
        zzef.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzajm zzg(int i, String str, zzes zzesVar) {
        int iZzB = zzesVar.zzB();
        if (zzesVar.zzB() == 1684108385 && iZzB >= 22) {
            zzesVar.zzk(10);
            int iZzt = zzesVar.zzt();
            if (iZzt > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iZzt).length());
                sb.append(iZzt);
                String string = sb.toString();
                int iZzt2 = zzesVar.zzt();
                if (iZzt2 > 0) {
                    StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(iZzt2).length());
                    sb2.append(string);
                    sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
                    sb2.append(iZzt2);
                    string = sb2.toString();
                }
                return new zzajm(str, null, zzgvz.zzj(string));
            }
        }
        zzef.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzfy.zze(i)));
        return null;
    }
}
