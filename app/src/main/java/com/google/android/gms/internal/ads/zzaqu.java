package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.extractor.p007ts.TsExtractor;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaqu implements zzaqm {
    final /* synthetic */ zzaqw zza;
    private final zzer zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzaqu(zzaqw zzaqwVar, int i) {
        Objects.requireNonNull(zzaqwVar);
        this.zza = zzaqwVar;
        this.zzb = new zzer(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza(zzfh zzfhVar, zzafs zzafsVar, zzara zzaraVar) {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzb(zzes zzesVar) {
        int i;
        if (zzesVar.zzs() != 2) {
            return;
        }
        zzaqw zzaqwVar = this.zza;
        zzfh zzfhVar = (zzfh) zzaqwVar.zzh().get(0);
        if ((zzesVar.zzs() & 128) != 0) {
            zzesVar.zzk(1);
            int iZzt = zzesVar.zzt();
            int i2 = 3;
            zzesVar.zzk(3);
            zzer zzerVar = this.zzb;
            zzesVar.zzl(zzerVar, 2);
            zzerVar.zzh(3);
            int i3 = 13;
            zzaqwVar.zzq(zzerVar.zzj(13));
            zzesVar.zzl(zzerVar, 2);
            int i4 = 4;
            zzerVar.zzh(4);
            int i5 = 12;
            zzesVar.zzk(zzerVar.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int iZzd = zzesVar.zzd();
            while (iZzd > 0) {
                int i6 = 5;
                zzesVar.zzl(zzerVar, 5);
                int iZzj = zzerVar.zzj(8);
                zzerVar.zzh(i2);
                int iZzj2 = zzerVar.zzj(i3);
                zzerVar.zzh(i4);
                int iZzj3 = zzerVar.zzj(i5);
                int iZzg = zzesVar.zzg();
                int i7 = iZzg + iZzj3;
                String str = null;
                ArrayList arrayList = null;
                int i8 = -1;
                int iZzs = 0;
                while (zzesVar.zzg() < i7) {
                    int iZzs2 = zzesVar.zzs();
                    int iZzg2 = zzesVar.zzg() + zzesVar.zzs();
                    if (iZzg2 > i7) {
                        break;
                    }
                    if (iZzs2 == i6) {
                        long jZzz = zzesVar.zzz();
                        if (jZzz == 1094921523) {
                            zzaqwVar = zzaqwVar;
                            i8 = 129;
                        } else if (jZzz == 1161904947) {
                            zzaqwVar = zzaqwVar;
                            zzerVar = zzerVar;
                            iZzd = iZzd;
                            i8 = 135;
                            iZzg2 = iZzg2;
                        } else if (jZzz == 1094921524) {
                            zzaqwVar = zzaqwVar;
                            i8 = 172;
                        } else if (jZzz == 1212503619) {
                            i = 36;
                            i8 = i;
                        }
                    } else if (iZzs2 == 106) {
                        zzaqwVar = zzaqwVar;
                        i8 = 129;
                    } else if (iZzs2 == 122) {
                        zzaqwVar = zzaqwVar;
                        zzerVar = zzerVar;
                        iZzd = iZzd;
                        i8 = 135;
                        iZzg2 = iZzg2;
                    } else {
                        if (iZzs2 == 127) {
                            int iZzs3 = zzesVar.zzs();
                            if (iZzs3 == 21) {
                                zzaqwVar = zzaqwVar;
                                i8 = 172;
                            } else if (iZzs3 == 14) {
                                i = 136;
                            } else if (iZzs3 == 33) {
                                i = TsExtractor.TS_STREAM_TYPE_DTS_UHD;
                            }
                        } else if (iZzs2 == 123) {
                            i = 138;
                        } else if (iZzs2 == 10) {
                            String strTrim = zzesVar.zzK(3, StandardCharsets.UTF_8).trim();
                            iZzs = zzesVar.zzs();
                            str = strTrim;
                        } else if (iZzs2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (zzesVar.zzg() < iZzg2) {
                                int i9 = iZzg2;
                                String strTrim2 = zzesVar.zzK(3, StandardCharsets.UTF_8).trim();
                                int iZzs4 = zzesVar.zzs();
                                int i10 = iZzd;
                                byte[] bArr = new byte[4];
                                zzesVar.zzm(bArr, 0, 4);
                                arrayList2.add(new zzaqx(strTrim2, iZzs4, bArr));
                                iZzd = i10;
                                iZzg2 = i9;
                                zzerVar = zzerVar;
                                zzaqwVar = zzaqwVar;
                            }
                            zzaqwVar = zzaqwVar;
                            iZzg2 = iZzg2;
                            zzerVar = zzerVar;
                            iZzd = iZzd;
                            arrayList = arrayList2;
                            i8 = 89;
                        } else {
                            zzaqwVar = zzaqwVar;
                            iZzg2 = iZzg2;
                            zzerVar = zzerVar;
                            iZzd = iZzd;
                            if (iZzs2 == 111) {
                                i8 = 257;
                            }
                        }
                        i8 = i;
                    }
                    zzesVar.zzk(iZzg2 - zzesVar.zzg());
                    iZzd = iZzd;
                    zzerVar = zzerVar;
                    zzaqwVar = zzaqwVar;
                    i6 = 5;
                }
                zzaqw zzaqwVar2 = zzaqwVar;
                zzer zzerVar2 = zzerVar;
                int i11 = iZzd;
                zzesVar.zzh(i7);
                zzaqy zzaqyVar = new zzaqy(i8, str, iZzs, arrayList, Arrays.copyOfRange(zzesVar.zzi(), iZzg, i7));
                if (iZzj == 6 || iZzj == 5) {
                    iZzj = zzaqyVar.zza;
                }
                iZzd = i11 - (iZzj3 + 5);
                if (!zzaqwVar2.zzk().get(iZzj2)) {
                    zzarb zzarbVarZzb = zzaqwVar2.zzi().zzb(iZzj, zzaqyVar);
                    sparseIntArray.put(iZzj2, iZzj2);
                    sparseArray.put(iZzj2, zzarbVarZzb);
                }
                i4 = 4;
                zzerVar = zzerVar2;
                zzaqwVar = zzaqwVar2;
                i2 = 3;
                i3 = 13;
                i5 = 12;
            }
            zzaqw zzaqwVar3 = zzaqwVar;
            int size = sparseIntArray.size();
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                zzaqwVar3.zzk().put(iKeyAt, true);
                zzaqwVar3.zzl().put(iValueAt, true);
                zzarb zzarbVar = (zzarb) sparseArray.valueAt(i12);
                if (zzarbVar != null) {
                    zzarbVar.zza(zzfhVar, zzaqwVar3.zzm(), new zzara(iZzt, iKeyAt, 8192));
                    zzaqwVar3.zzj().put(iValueAt, zzarbVar);
                }
            }
            zzaqwVar3.zzj().remove(this.zze);
            zzaqwVar3.zzo(0);
            if (zzaqwVar3.zzn() == 0) {
                zzaqwVar3.zzm().zzv();
                zzaqwVar3.zzp(true);
            }
        }
    }
}
