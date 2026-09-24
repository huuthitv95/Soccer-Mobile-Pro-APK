package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzalz {
    private static final zzgtl zza = zzgtl.zza(zzgsk.zzc(AbstractJsonLexerKt.COLON));
    private static final zzgtl zzb = zzgtl.zza(zzgsk.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    public final int zzb(zzafq zzafqVar, zzagp zzagpVar, List list) throws IOException {
        byte b;
        char c;
        int i = this.zzd;
        if (i == 0) {
            long jZzo = zzafqVar.zzo();
            zzagpVar.zza = (jZzo == -1 || jZzo < 8) ? 0L : jZzo - 8;
            this.zzd = 1;
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            char c2 = 2819;
            short s = 2817;
            short s2 = 2816;
            short s3 = 2192;
            if (i != 2) {
                long jZzn = zzafqVar.zzn();
                int iZzo = (int) ((zzafqVar.zzo() - zzafqVar.zzn()) - ((long) this.zze));
                zzes zzesVar = new zzes(iZzo);
                zzafqVar.zzc(zzesVar.zzi(), 0, iZzo);
                int i3 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i3 >= list2.size()) {
                        zzagpVar.zza = 0L;
                        return 1;
                    }
                    zzaly zzalyVar = (zzaly) list2.get(i3);
                    zzesVar.zzh((int) (zzalyVar.zza - jZzn));
                    zzesVar.zzk(4);
                    int iZzC = zzesVar.zzC();
                    switch (zzesVar.zzK(iZzC, StandardCharsets.UTF_8)) {
                        case "SlowMotion_Data":
                            b = 0;
                            break;
                        case "Super_SlowMotion_Edit_Data":
                            b = 3;
                            break;
                        case "Super_SlowMotion_Data":
                            b = 1;
                            break;
                        case "Super_SlowMotion_Deflickering_On":
                            b = 4;
                            break;
                        case "Super_SlowMotion_BGM":
                            b = 2;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        c = 2192;
                    } else if (b == 1) {
                        c = 2816;
                    } else if (b == 2) {
                        c = 2817;
                    } else if (b == 3) {
                        c = c2;
                    } else {
                        if (b != 4) {
                            throw zzat.zzb("Invalid SEF name", null);
                        }
                        c = 2820;
                    }
                    int i4 = zzalyVar.zzb - (iZzC + 8);
                    if (c == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List listZze = zzb.zze(zzesVar.zzK(i4, StandardCharsets.UTF_8));
                        for (int i5 = 0; i5 < listZze.size(); i5++) {
                            List listZze2 = zza.zze((CharSequence) listZze.get(i5));
                            if (listZze2.size() != 3) {
                                throw zzat.zzb(null, null);
                            }
                            try {
                                arrayList.add(new zzajp(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                            } catch (NumberFormatException e) {
                                throw zzat.zzb(null, e);
                            }
                        }
                        list.add(new zzajq(arrayList));
                    } else if (c != 2816 && c != 2817 && c != c2 && c != 2820) {
                        throw new IllegalStateException();
                    }
                    i3++;
                    c2 = 2819;
                }
            } else {
                long jZzo2 = zzafqVar.zzo();
                int i6 = this.zze - 20;
                zzes zzesVar2 = new zzes(i6);
                zzafqVar.zzc(zzesVar2.zzi(), 0, i6);
                int i7 = 0;
                while (i7 < i6 / 12) {
                    zzesVar2.zzk(i2);
                    short sZzw = zzesVar2.zzw();
                    if (sZzw == s3 || sZzw == s2 || sZzw == s || sZzw == 2819 || sZzw == 2820) {
                        this.zzc.add(new zzaly(sZzw, (jZzo2 - ((long) this.zze)) - ((long) zzesVar2.zzC()), zzesVar2.zzC()));
                    } else {
                        zzesVar2.zzk(8);
                    }
                    i7++;
                    i6 = i6;
                    i2 = 2;
                    s = 2817;
                    s2 = 2816;
                    s3 = 2192;
                }
                List list3 = this.zzc;
                if (list3.isEmpty()) {
                    zzagpVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzagpVar.zza = ((zzaly) list3.get(0)).zza;
                }
            }
        } else {
            zzes zzesVar3 = new zzes(8);
            zzafqVar.zzc(zzesVar3.zzi(), 0, 8);
            this.zze = zzesVar3.zzC() + 8;
            if (zzesVar3.zzB() != 1397048916) {
                zzagpVar.zza = 0L;
            } else {
                zzagpVar.zza = zzafqVar.zzn() - ((long) (this.zze - 12));
                this.zzd = 2;
            }
        }
        return 1;
    }
}
