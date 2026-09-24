package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapj implements zzaqz {
    private final List zza;

    public zzapj() {
        this(0);
    }

    public zzapj(int i, List list) {
        this.zza = list;
    }

    private final zzaqp zzc(zzaqy zzaqyVar) {
        return new zzaqp(zze(zzaqyVar), "video/mp2t");
    }

    private final zzare zzd(zzaqy zzaqyVar) {
        return new zzare(zze(zzaqyVar), "video/mp2t");
    }

    private final List zze(zzaqy zzaqyVar) {
        String str;
        int i;
        List listSingletonList;
        zzes zzesVar = new zzes(zzaqyVar.zze);
        List arrayList = this.zza;
        while (zzesVar.zzd() > 0) {
            int iZzs = zzesVar.zzs();
            int iZzg = zzesVar.zzg() + zzesVar.zzs();
            if (iZzs == 134) {
                arrayList = new ArrayList();
                int iZzs2 = zzesVar.zzs() & 31;
                for (int i2 = 0; i2 < iZzs2; i2++) {
                    String strZzK = zzesVar.zzK(3, StandardCharsets.UTF_8);
                    int iZzs3 = zzesVar.zzs();
                    boolean z = (iZzs3 & 128) != 0;
                    if (z) {
                        i = iZzs3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZzs = (byte) zzesVar.zzs();
                    zzesVar.zzk(1);
                    if (z) {
                        int i3 = bZzs & SignedBytes.MAX_POWER_OF_TWO;
                        int i4 = zzdp.zza;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzt zztVar = new zzt();
                    zztVar.zzo(str);
                    zztVar.zze(strZzK);
                    zztVar.zzL(i);
                    zztVar.zzr(listSingletonList);
                    arrayList.add(zztVar.zzO());
                }
            }
            zzesVar.zzh(iZzg);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final SparseArray zza() {
        return new SparseArray();
    }

    public zzapj(int i) {
        this.zza = zzgvz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final zzarb zzb(int i, zzaqy zzaqyVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzaqf(new zzapy(zzaqyVar.zzb, zzaqyVar.zza(), "video/mp2t"));
            }
            if (i == 21) {
                return new zzaqf(new zzapw("video/mp2t"));
            }
            if (i == 27) {
                return new zzaqf(new zzapt(zzc(zzaqyVar), false, false, "video/mp2t"));
            }
            if (i == 36) {
                return new zzaqf(new zzapv(zzc(zzaqyVar), "video/mp2t"));
            }
            if (i == 45) {
                return new zzaqf(new zzapz("video/mp2t"));
            }
            if (i == 89) {
                return new zzaqf(new zzapl(zzaqyVar.zzd, "video/mp2t"));
            }
            if (i == 172) {
                return new zzaqf(new zzapf(zzaqyVar.zzb, zzaqyVar.zza(), "video/mp2t"));
            }
            if (i == 257) {
                return new zzaqn(new zzaqe("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzaqf(new zzapk(zzaqyVar.zzb, zzaqyVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i) {
                            case 15:
                                return new zzaqf(new zzapi(false, zzaqyVar.zzb, zzaqyVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzaqf(new zzapr(zzd(zzaqyVar), "video/mp2t"));
                            case 17:
                                return new zzaqf(new zzapx(zzaqyVar.zzb, zzaqyVar.zza(), "video/mp2t"));
                            default:
                                switch (i) {
                                    case 134:
                                        return new zzaqn(new zzaqe("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                    }
                    return new zzaqf(new zzapk(zzaqyVar.zzb, zzaqyVar.zza(), 4096, "video/mp2t"));
                }
                return new zzaqf(new zzapc(zzaqyVar.zzb, zzaqyVar.zza(), "video/mp2t"));
            }
        }
        return new zzaqf(new zzapo(zzd(zzaqyVar), "video/mp2t"));
    }
}
