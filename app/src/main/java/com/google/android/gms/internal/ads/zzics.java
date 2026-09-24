package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzics implements zzifp {
    private final zzicr zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzics(zzicr zzicrVar) {
        zziee.zza(zzicrVar, "input");
        this.zza = zzicrVar;
        zzicrVar.zzd = this;
    }

    private final void zzQ(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw new zzief("Protocol message tag had invalid wire type.");
        }
    }

    private final void zzR(Object obj, zzifu zzifuVar, zzidb zzidbVar) throws IOException {
        zzicr zzicrVar = this.zza;
        int iZzo = zzicrVar.zzo();
        zzicrVar.zzJ();
        int iZzB = zzicrVar.zzB(iZzo);
        zzicrVar.zza++;
        zzifuVar.zzg(obj, this, zzidbVar);
        zzicrVar.zzb(0);
        zzicrVar.zza--;
        zzicrVar.zzC(iZzB);
    }

    private final Object zzS(zzifu zzifuVar, zzidb zzidbVar) throws IOException {
        Object objZza = zzifuVar.zza();
        zzR(objZza, zzifuVar, zzidbVar);
        zzifuVar.zzk(objZza);
        return objZza;
    }

    private final void zzT(Object obj, zzifu zzifuVar, zzidb zzidbVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzifuVar.zzg(obj, this, zzidbVar);
            if (this.zzb != this.zzc) {
                throw new zzieg("Failed to parse the message.");
            }
            this.zzc = i;
        } catch (Throwable th) {
            this.zzc = i;
            throw th;
        }
    }

    private final Object zzU(zzigu zziguVar, Class cls, zzidb zzidbVar) throws IOException {
        zzigu zziguVar2 = zzigu.DOUBLE;
        switch (zziguVar) {
            case DOUBLE:
                return Double.valueOf(zze());
            case FLOAT:
                return Float.valueOf(zzf());
            case INT64:
                return Long.valueOf(zzh());
            case UINT64:
                return Long.valueOf(zzg());
            case INT32:
                return Integer.valueOf(zzi());
            case FIXED64:
                return Long.valueOf(zzj());
            case FIXED32:
                return Integer.valueOf(zzk());
            case BOOL:
                return Boolean.valueOf(zzl());
            case STRING:
                return zzn();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                zzQ(2);
                return zzS(zzifm.zza().zzb(cls), zzidbVar);
            case BYTES:
                return zzq();
            case UINT32:
                return Integer.valueOf(zzr());
            case ENUM:
                return Integer.valueOf(zzs());
            case SFIXED32:
                return Integer.valueOf(zzt());
            case SFIXED64:
                return Long.valueOf(zzu());
            case SINT32:
                return Integer.valueOf(zzv());
            case SINT64:
                return Long.valueOf(zzw());
        }
    }

    private final void zzV(int i) throws IOException {
        if (this.zza.zzE() != i) {
            throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void zzW(int i) throws IOException {
        if ((i & 3) != 0) {
            throw new zzieg("Failed to parse the message.");
        }
    }

    private static final void zzX(int i) throws IOException {
        if ((i & 7) != 0) {
            throw new zzieg("Failed to parse the message.");
        }
    }

    public static zzics zza(zzicr zzicrVar) {
        Object obj = zzicrVar.zzd;
        return obj != null ? (zzics) obj : new zzics(zzicrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzA(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar = this.zza;
                int iZzE = zzicrVar.zzE() + zzicrVar.zzo();
                do {
                    zzieqVar.zzd(zzicrVar.zzg());
                } while (zzicrVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzicr zzicrVar2 = this.zza;
                zzieqVar.zzd(zzicrVar2.zzg());
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar3 = this.zza;
                int iZzE2 = zzicrVar3.zzE() + zzicrVar3.zzo();
                do {
                    list.add(Long.valueOf(zzicrVar3.zzg()));
                } while (zzicrVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzicr zzicrVar4 = this.zza;
                list.add(Long.valueOf(zzicrVar4.zzg()));
                if (zzicrVar4.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzB(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzids) {
            zzids zzidsVar = (zzids) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar = this.zza;
                int iZzE = zzicrVar.zzE() + zzicrVar.zzo();
                do {
                    zzidsVar.zzi(zzicrVar.zzh());
                } while (zzicrVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzicr zzicrVar2 = this.zza;
                zzidsVar.zzi(zzicrVar2.zzh());
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar3 = this.zza;
                int iZzE2 = zzicrVar3.zzE() + zzicrVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzicrVar3.zzh()));
                } while (zzicrVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzicr zzicrVar4 = this.zza;
                list.add(Integer.valueOf(zzicrVar4.zzh()));
                if (zzicrVar4.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzC(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar = this.zza;
                int iZzo = zzicrVar.zzo();
                zzX(iZzo);
                int iZzE = zzicrVar.zzE() + iZzo;
                do {
                    zzieqVar.zzd(zzicrVar.zzi());
                } while (zzicrVar.zzE() < iZzE);
                return;
            }
            do {
                zzicr zzicrVar2 = this.zza;
                zzieqVar.zzd(zzicrVar2.zzi());
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar3 = this.zza;
                int iZzo2 = zzicrVar3.zzo();
                zzX(iZzo2);
                int iZzE2 = zzicrVar3.zzE() + iZzo2;
                do {
                    list.add(Long.valueOf(zzicrVar3.zzi()));
                } while (zzicrVar3.zzE() < iZzE2);
                return;
            }
            do {
                zzicr zzicrVar4 = this.zza;
                list.add(Long.valueOf(zzicrVar4.zzi()));
                if (zzicrVar4.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzD(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzids) {
            zzids zzidsVar = (zzids) list;
            int i = this.zzb & 7;
            if (i == 2) {
                zzicr zzicrVar = this.zza;
                int iZzo = zzicrVar.zzo();
                zzW(iZzo);
                int iZzE = zzicrVar.zzE() + iZzo;
                do {
                    zzidsVar.zzi(zzicrVar.zzj());
                } while (zzicrVar.zzE() < iZzE);
                return;
            }
            if (i != 5) {
                throw new zzief("Protocol message tag had invalid wire type.");
            }
            do {
                zzicr zzicrVar2 = this.zza;
                zzidsVar.zzi(zzicrVar2.zzj());
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzicr zzicrVar3 = this.zza;
                int iZzo2 = zzicrVar3.zzo();
                zzW(iZzo2);
                int iZzE2 = zzicrVar3.zzE() + iZzo2;
                do {
                    list.add(Integer.valueOf(zzicrVar3.zzj()));
                } while (zzicrVar3.zzE() < iZzE2);
                return;
            }
            if (i2 != 5) {
                throw new zzief("Protocol message tag had invalid wire type.");
            }
            do {
                zzicr zzicrVar4 = this.zza;
                list.add(Integer.valueOf(zzicrVar4.zzj()));
                if (zzicrVar4.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzE(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzicd) {
            zzicd zzicdVar = (zzicd) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar = this.zza;
                int iZzE = zzicrVar.zzE() + zzicrVar.zzo();
                do {
                    zzicdVar.zzg(zzicrVar.zzk());
                } while (zzicrVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzicr zzicrVar2 = this.zza;
                zzicdVar.zzg(zzicrVar2.zzk());
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar3 = this.zza;
                int iZzE2 = zzicrVar3.zzE() + zzicrVar3.zzo();
                do {
                    list.add(Boolean.valueOf(zzicrVar3.zzk()));
                } while (zzicrVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzicr zzicrVar4 = this.zza;
                list.add(Boolean.valueOf(zzicrVar4.zzk()));
                if (zzicrVar4.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    public final void zzF(List list, boolean z) throws IOException {
        int iZza;
        int iZza2;
        if ((this.zzb & 7) != 2) {
            throw new zzief("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzien) && !z) {
            zzien zzienVar = (zzien) list;
            do {
                zzq();
                zzienVar.zzb();
                zzicr zzicrVar = this.zza;
                if (zzicrVar.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            do {
                list.add(z ? zzn() : zzm());
                zzicr zzicrVar2 = this.zza;
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar2.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzG(List list, zzifu zzifuVar, zzidb zzidbVar) throws IOException {
        int iZza;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw new zzief("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzS(zzifuVar, zzidbVar));
            zzicr zzicrVar = this.zza;
            if (zzicrVar.zzD() || this.zzd != 0) {
                return;
            } else {
                iZza = zzicrVar.zza();
            }
        } while (iZza == i);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    @Deprecated
    public final void zzH(List list, zzifu zzifuVar, zzidb zzidbVar) throws IOException {
        int iZza;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw new zzief("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZza = zzifuVar.zza();
            zzT(objZza, zzifuVar, zzidbVar);
            zzifuVar.zzk(objZza);
            list.add(objZza);
            zzicr zzicrVar = this.zza;
            if (zzicrVar.zzD() || this.zzd != 0) {
                return;
            } else {
                iZza = zzicrVar.zza();
            }
        } while (iZza == i);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzJ(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzids) {
            zzids zzidsVar = (zzids) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar = this.zza;
                int iZzE = zzicrVar.zzE() + zzicrVar.zzo();
                do {
                    zzidsVar.zzi(zzicrVar.zzo());
                } while (zzicrVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzicr zzicrVar2 = this.zza;
                zzidsVar.zzi(zzicrVar2.zzo());
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar3 = this.zza;
                int iZzE2 = zzicrVar3.zzE() + zzicrVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzicrVar3.zzo()));
                } while (zzicrVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzicr zzicrVar4 = this.zza;
                list.add(Integer.valueOf(zzicrVar4.zzo()));
                if (zzicrVar4.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzK(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzids) {
            zzids zzidsVar = (zzids) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar = this.zza;
                int iZzE = zzicrVar.zzE() + zzicrVar.zzo();
                do {
                    zzidsVar.zzi(zzicrVar.zzp());
                } while (zzicrVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzicr zzicrVar2 = this.zza;
                zzidsVar.zzi(zzicrVar2.zzp());
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar3 = this.zza;
                int iZzE2 = zzicrVar3.zzE() + zzicrVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzicrVar3.zzp()));
                } while (zzicrVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzicr zzicrVar4 = this.zza;
                list.add(Integer.valueOf(zzicrVar4.zzp()));
                if (zzicrVar4.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzL(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzids) {
            zzids zzidsVar = (zzids) list;
            int i = this.zzb & 7;
            if (i == 2) {
                zzicr zzicrVar = this.zza;
                int iZzo = zzicrVar.zzo();
                zzW(iZzo);
                int iZzE = zzicrVar.zzE() + iZzo;
                do {
                    zzidsVar.zzi(zzicrVar.zzq());
                } while (zzicrVar.zzE() < iZzE);
                return;
            }
            if (i != 5) {
                throw new zzief("Protocol message tag had invalid wire type.");
            }
            do {
                zzicr zzicrVar2 = this.zza;
                zzidsVar.zzi(zzicrVar2.zzq());
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzicr zzicrVar3 = this.zza;
                int iZzo2 = zzicrVar3.zzo();
                zzW(iZzo2);
                int iZzE2 = zzicrVar3.zzE() + iZzo2;
                do {
                    list.add(Integer.valueOf(zzicrVar3.zzq()));
                } while (zzicrVar3.zzE() < iZzE2);
                return;
            }
            if (i2 != 5) {
                throw new zzief("Protocol message tag had invalid wire type.");
            }
            do {
                zzicr zzicrVar4 = this.zza;
                list.add(Integer.valueOf(zzicrVar4.zzq()));
                if (zzicrVar4.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzM(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar = this.zza;
                int iZzo = zzicrVar.zzo();
                zzX(iZzo);
                int iZzE = zzicrVar.zzE() + iZzo;
                do {
                    zzieqVar.zzd(zzicrVar.zzr());
                } while (zzicrVar.zzE() < iZzE);
                return;
            }
            do {
                zzicr zzicrVar2 = this.zza;
                zzieqVar.zzd(zzicrVar2.zzr());
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar3 = this.zza;
                int iZzo2 = zzicrVar3.zzo();
                zzX(iZzo2);
                int iZzE2 = zzicrVar3.zzE() + iZzo2;
                do {
                    list.add(Long.valueOf(zzicrVar3.zzr()));
                } while (zzicrVar3.zzE() < iZzE2);
                return;
            }
            do {
                zzicr zzicrVar4 = this.zza;
                list.add(Long.valueOf(zzicrVar4.zzr()));
                if (zzicrVar4.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzN(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzids) {
            zzids zzidsVar = (zzids) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar = this.zza;
                int iZzE = zzicrVar.zzE() + zzicrVar.zzo();
                do {
                    zzidsVar.zzi(zzicrVar.zzs());
                } while (zzicrVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzicr zzicrVar2 = this.zza;
                zzidsVar.zzi(zzicrVar2.zzs());
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar3 = this.zza;
                int iZzE2 = zzicrVar3.zzE() + zzicrVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzicrVar3.zzs()));
                } while (zzicrVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzicr zzicrVar4 = this.zza;
                list.add(Integer.valueOf(zzicrVar4.zzs()));
                if (zzicrVar4.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzO(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar = this.zza;
                int iZzE = zzicrVar.zzE() + zzicrVar.zzo();
                do {
                    zzieqVar.zzd(zzicrVar.zzt());
                } while (zzicrVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzicr zzicrVar2 = this.zza;
                zzieqVar.zzd(zzicrVar2.zzt());
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar3 = this.zza;
                int iZzE2 = zzicrVar3.zzE() + zzicrVar3.zzo();
                do {
                    list.add(Long.valueOf(zzicrVar3.zzt()));
                } while (zzicrVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzicr zzicrVar4 = this.zza;
                list.add(Long.valueOf(zzicrVar4.zzt()));
                if (zzicrVar4.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzP(Map map, zzieu zzieuVar, zzidb zzidbVar) throws IOException {
        zzQ(2);
        zzicr zzicrVar = this.zza;
        int iZzB = zzicrVar.zzB(zzicrVar.zzo());
        Object obj = zzieuVar.zzd;
        Object objZzU = zzieuVar.zzb;
        Object objZzU2 = obj;
        while (true) {
            try {
                int iZzb = zzb();
                if (iZzb == Integer.MAX_VALUE || zzicrVar.zzD()) {
                    break;
                }
                if (iZzb == 1) {
                    objZzU = zzU(zzieuVar.zza, null, null);
                } else if (iZzb != 2) {
                    try {
                        if (!zzd()) {
                            throw new zzieg("Unable to parse map entry.");
                        }
                    } catch (zzief e) {
                        if (!zzd()) {
                            throw new zzieg("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objZzU2 = zzU(zzieuVar.zzc, obj.getClass(), zzidbVar);
                }
            } catch (Throwable th) {
                this.zza.zzC(iZzB);
                throw th;
            }
        }
        map.put(objZzU, objZzU2);
        this.zza.zzC(iZzB);
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final int zzb() throws IOException {
        int iZza = this.zzd;
        if (iZza != 0) {
            this.zzb = iZza;
            this.zzd = 0;
        } else {
            iZza = this.zza.zza();
            this.zzb = iZza;
        }
        if (iZza == 0 || iZza == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZza >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final int zzc() {
        return this.zzb;
    }

    public final boolean zzd() throws IOException {
        int i;
        zzicr zzicrVar = this.zza;
        if (zzicrVar.zzD() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return zzicrVar.zzc(i);
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final double zze() throws IOException {
        zzQ(1);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final float zzf() throws IOException {
        zzQ(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final long zzg() throws IOException {
        zzQ(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final long zzh() throws IOException {
        zzQ(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final int zzi() throws IOException {
        zzQ(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final long zzj() throws IOException {
        zzQ(1);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final int zzk() throws IOException {
        zzQ(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final boolean zzl() throws IOException {
        zzQ(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final String zzm() throws IOException {
        zzQ(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final String zzn() throws IOException {
        zzQ(2);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzo(Object obj, zzifu zzifuVar, zzidb zzidbVar) throws IOException {
        zzQ(2);
        zzR(obj, zzifuVar, zzidbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzp(Object obj, zzifu zzifuVar, zzidb zzidbVar) throws IOException {
        zzQ(3);
        zzT(obj, zzifuVar, zzidbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final zzicn zzq() throws IOException {
        zzQ(2);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final int zzr() throws IOException {
        zzQ(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final int zzs() throws IOException {
        zzQ(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final int zzt() throws IOException {
        zzQ(5);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final long zzu() throws IOException {
        zzQ(1);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final int zzv() throws IOException {
        zzQ(0);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final long zzw() throws IOException {
        zzQ(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzx(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzicy) {
            zzicy zzicyVar = (zzicy) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar = this.zza;
                int iZzo = zzicrVar.zzo();
                zzX(iZzo);
                int iZzE = zzicrVar.zzE() + iZzo;
                do {
                    zzicyVar.zzg(zzicrVar.zzd());
                } while (zzicrVar.zzE() < iZzE);
                return;
            }
            do {
                zzicr zzicrVar2 = this.zza;
                zzicyVar.zzg(zzicrVar2.zzd());
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar3 = this.zza;
                int iZzo2 = zzicrVar3.zzo();
                zzX(iZzo2);
                int iZzE2 = zzicrVar3.zzE() + iZzo2;
                do {
                    list.add(Double.valueOf(zzicrVar3.zzd()));
                } while (zzicrVar3.zzE() < iZzE2);
                return;
            }
            do {
                zzicr zzicrVar4 = this.zza;
                list.add(Double.valueOf(zzicrVar4.zzd()));
                if (zzicrVar4.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzy(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzidi) {
            zzidi zzidiVar = (zzidi) list;
            int i = this.zzb & 7;
            if (i == 2) {
                zzicr zzicrVar = this.zza;
                int iZzo = zzicrVar.zzo();
                zzW(iZzo);
                int iZzE = zzicrVar.zzE() + iZzo;
                do {
                    zzidiVar.zzg(zzicrVar.zze());
                } while (zzicrVar.zzE() < iZzE);
                return;
            }
            if (i != 5) {
                throw new zzief("Protocol message tag had invalid wire type.");
            }
            do {
                zzicr zzicrVar2 = this.zza;
                zzidiVar.zzg(zzicrVar2.zze());
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzicr zzicrVar3 = this.zza;
                int iZzo2 = zzicrVar3.zzo();
                zzW(iZzo2);
                int iZzE2 = zzicrVar3.zzE() + iZzo2;
                do {
                    list.add(Float.valueOf(zzicrVar3.zze()));
                } while (zzicrVar3.zzE() < iZzE2);
                return;
            }
            if (i2 != 5) {
                throw new zzief("Protocol message tag had invalid wire type.");
            }
            do {
                zzicr zzicrVar4 = this.zza;
                list.add(Float.valueOf(zzicrVar4.zze()));
                if (zzicrVar4.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzz(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar = this.zza;
                int iZzE = zzicrVar.zzE() + zzicrVar.zzo();
                do {
                    zzieqVar.zzd(zzicrVar.zzf());
                } while (zzicrVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzicr zzicrVar2 = this.zza;
                zzieqVar.zzd(zzicrVar2.zzf());
                if (zzicrVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzicrVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzief("Protocol message tag had invalid wire type.");
                }
                zzicr zzicrVar3 = this.zza;
                int iZzE2 = zzicrVar3.zzE() + zzicrVar3.zzo();
                do {
                    list.add(Long.valueOf(zzicrVar3.zzf()));
                } while (zzicrVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzicr zzicrVar4 = this.zza;
                list.add(Long.valueOf(zzicrVar4.zzf()));
                if (zzicrVar4.zzD()) {
                    return;
                } else {
                    iZza = zzicrVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final void zzI(List list) throws IOException {
        int iZza;
        if ((this.zzb & 7) != 2) {
            throw new zzief("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzq());
            zzicr zzicrVar = this.zza;
            if (zzicrVar.zzD()) {
                return;
            } else {
                iZza = zzicrVar.zza();
            }
        } while (iZza == this.zzb);
        this.zzd = iZza;
    }
}
