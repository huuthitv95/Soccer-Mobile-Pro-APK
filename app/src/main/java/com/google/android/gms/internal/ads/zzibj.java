package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzibj extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzibc();
    zzibi zza;
    int zzb;
    int zzc;
    final zzibi zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzibe zzh;
    private zzibg zzi;

    public zzibj() {
        this(zze, true);
    }

    private final void zzf(zzibi zzibiVar, zzibi zzibiVar2) {
        zzibi zzibiVar3 = zzibiVar.zza;
        zzibiVar.zza = null;
        if (zzibiVar2 != null) {
            zzibiVar2.zza = zzibiVar3;
        }
        if (zzibiVar3 == null) {
            this.zza = zzibiVar2;
        } else if (zzibiVar3.zzb == zzibiVar) {
            zzibiVar3.zzb = zzibiVar2;
        } else {
            zzibiVar3.zzc = zzibiVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0080 A[SYNTHETIC] */
    private final void zzg(zzibi zzibiVar, boolean z) {
        while (zzibiVar != null) {
            zzibi zzibiVar2 = zzibiVar.zzb;
            zzibi zzibiVar3 = zzibiVar.zzc;
            boolean z2 = false;
            int i = zzibiVar2 != null ? zzibiVar2.zzi : 0;
            int i2 = zzibiVar3 != null ? zzibiVar3.zzi : 0;
            int i3 = i - i2;
            boolean z3 = true;
            if (i3 == -2) {
                zzibi zzibiVar4 = zzibiVar3.zzb;
                zzibi zzibiVar5 = zzibiVar3.zzc;
                int i4 = (zzibiVar4 != null ? zzibiVar4.zzi : 0) - (zzibiVar5 != null ? zzibiVar5.zzi : 0);
                if (i4 != -1) {
                    if (i4 == 0) {
                        if (!z) {
                        }
                        if (z3) {
                            return;
                        }
                    } else {
                        z3 = z;
                    }
                    zzi(zzibiVar3);
                    zzh(zzibiVar);
                    if (z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                zzh(zzibiVar);
                z3 = z2;
                if (z3) {
                    return;
                }
            } else if (i3 == 2) {
                zzibi zzibiVar6 = zzibiVar2.zzb;
                zzibi zzibiVar7 = zzibiVar2.zzc;
                int i5 = (zzibiVar6 != null ? zzibiVar6.zzi : 0) - (zzibiVar7 != null ? zzibiVar7.zzi : 0);
                if (i5 != 1) {
                    if (i5 == 0) {
                        if (!z) {
                        }
                        if (z3) {
                            return;
                        }
                    } else {
                        z3 = z;
                    }
                    zzh(zzibiVar2);
                    zzi(zzibiVar);
                    if (z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                zzi(zzibiVar);
                z3 = z2;
                if (z3) {
                    return;
                }
            } else if (i3 == 0) {
                zzibiVar.zzi = i + 1;
                if (z) {
                    return;
                }
            } else {
                zzibiVar.zzi = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            zzibiVar = zzibiVar.zza;
        }
    }

    private final void zzh(zzibi zzibiVar) {
        zzibi zzibiVar2 = zzibiVar.zzb;
        zzibi zzibiVar3 = zzibiVar.zzc;
        zzibi zzibiVar4 = zzibiVar3.zzb;
        zzibi zzibiVar5 = zzibiVar3.zzc;
        zzibiVar.zzc = zzibiVar4;
        if (zzibiVar4 != null) {
            zzibiVar4.zza = zzibiVar;
        }
        zzf(zzibiVar, zzibiVar3);
        zzibiVar3.zzb = zzibiVar;
        zzibiVar.zza = zzibiVar3;
        int iMax = Math.max(zzibiVar2 != null ? zzibiVar2.zzi : 0, zzibiVar4 != null ? zzibiVar4.zzi : 0) + 1;
        zzibiVar.zzi = iMax;
        zzibiVar3.zzi = Math.max(iMax, zzibiVar5 != null ? zzibiVar5.zzi : 0) + 1;
    }

    private final void zzi(zzibi zzibiVar) {
        zzibi zzibiVar2 = zzibiVar.zzb;
        zzibi zzibiVar3 = zzibiVar.zzc;
        zzibi zzibiVar4 = zzibiVar2.zzb;
        zzibi zzibiVar5 = zzibiVar2.zzc;
        zzibiVar.zzb = zzibiVar5;
        if (zzibiVar5 != null) {
            zzibiVar5.zza = zzibiVar;
        }
        zzf(zzibiVar, zzibiVar2);
        zzibiVar2.zzc = zzibiVar;
        zzibiVar.zza = zzibiVar2;
        int iMax = Math.max(zzibiVar3 != null ? zzibiVar3.zzi : 0, zzibiVar5 != null ? zzibiVar5.zzi : 0) + 1;
        zzibiVar.zzi = iMax;
        zzibiVar2.zzi = Math.max(iMax, zzibiVar4 != null ? zzibiVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzibi zzibiVar = this.zzd;
        zzibiVar.zze = zzibiVar;
        zzibiVar.zzd = zzibiVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzb(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzibe zzibeVar = this.zzh;
        if (zzibeVar != null) {
            return zzibeVar;
        }
        zzibe zzibeVar2 = new zzibe(this);
        this.zzh = zzibeVar2;
        return zzibeVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzibi zzibiVarZzb = zzb(obj);
        if (zzibiVarZzb != null) {
            return zzibiVarZzb.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzibg zzibgVar = this.zzi;
        if (zzibgVar != null) {
            return zzibgVar;
        }
        zzibg zzibgVar2 = new zzibg(this);
        this.zzi = zzibgVar2;
        return zzibgVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzibi zzibiVarZza = zza(obj, true);
        Object obj3 = zzibiVarZza.zzh;
        zzibiVarZza.zzh = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzibi zzibiVarZze = zze(obj);
        if (zzibiVarZze != null) {
            return zzibiVarZze.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    final zzibi zza(Object obj, boolean z) {
        int iCompareTo;
        zzibi zzibiVar;
        Comparator comparator = this.zzf;
        zzibi zzibiVar2 = this.zza;
        if (zzibiVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(zzibiVar2.zzf) : comparator.compare(obj, zzibiVar2.zzf);
                if (iCompareTo == 0) {
                    return zzibiVar2;
                }
                zzibi zzibiVar3 = iCompareTo < 0 ? zzibiVar2.zzb : zzibiVar2.zzc;
                if (zzibiVar3 == null) {
                    break;
                }
                zzibiVar2 = zzibiVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i = iCompareTo;
        if (!z) {
            return null;
        }
        zzibi zzibiVar4 = this.zzd;
        if (zzibiVar2 != null) {
            zzibi zzibiVar5 = zzibiVar2;
            zzibiVar = new zzibi(this.zzg, zzibiVar5, obj, zzibiVar4, zzibiVar4.zze);
            if (i < 0) {
                zzibiVar5.zzb = zzibiVar;
            } else {
                zzibiVar5.zzc = zzibiVar;
            }
            zzg(zzibiVar5, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                String name = obj.getClass().getName();
                String.valueOf(name);
                throw new ClassCastException(String.valueOf(name).concat(" is not Comparable"));
            }
            zzibiVar = new zzibi(this.zzg, null, obj, zzibiVar4, zzibiVar4.zze);
            this.zza = zzibiVar;
        }
        this.zzb++;
        this.zzc++;
        return zzibiVar;
    }

    final zzibi zzb(Object obj) {
        if (obj != null) {
            try {
                return zza(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    final zzibi zzc(Map.Entry entry) {
        zzibi zzibiVarZzb = zzb(entry.getKey());
        if (zzibiVarZzb == null || !Objects.equals(zzibiVarZzb.zzh, entry.getValue())) {
            return null;
        }
        return zzibiVarZzb;
    }

    final void zzd(zzibi zzibiVar, boolean z) {
        zzibi zzibiVar2;
        zzibi zzibiVar3;
        int i;
        if (z) {
            zzibi zzibiVar4 = zzibiVar.zze;
            zzibiVar4.zzd = zzibiVar.zzd;
            zzibiVar.zzd.zze = zzibiVar4;
        }
        zzibi zzibiVar5 = zzibiVar.zzb;
        zzibi zzibiVar6 = zzibiVar.zzc;
        zzibi zzibiVar7 = zzibiVar.zza;
        int i2 = 0;
        if (zzibiVar5 == null || zzibiVar6 == null) {
            if (zzibiVar5 != null) {
                zzf(zzibiVar, zzibiVar5);
                zzibiVar.zzb = null;
            } else if (zzibiVar6 != null) {
                zzf(zzibiVar, zzibiVar6);
                zzibiVar.zzc = null;
            } else {
                zzf(zzibiVar, null);
            }
            zzg(zzibiVar7, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzibiVar5.zzi > zzibiVar6.zzi) {
            do {
                zzibiVar3 = zzibiVar5;
                zzibiVar5 = zzibiVar5.zzc;
            } while (zzibiVar5 != null);
        } else {
            do {
                zzibiVar2 = zzibiVar6;
                zzibiVar6 = zzibiVar6.zzb;
            } while (zzibiVar6 != null);
            zzibiVar3 = zzibiVar2;
        }
        zzd(zzibiVar3, false);
        zzibi zzibiVar8 = zzibiVar.zzb;
        if (zzibiVar8 != null) {
            i = zzibiVar8.zzi;
            zzibiVar3.zzb = zzibiVar8;
            zzibiVar8.zza = zzibiVar3;
            zzibiVar.zzb = null;
        } else {
            i = 0;
        }
        zzibi zzibiVar9 = zzibiVar.zzc;
        if (zzibiVar9 != null) {
            i2 = zzibiVar9.zzi;
            zzibiVar3.zzc = zzibiVar9;
            zzibiVar9.zza = zzibiVar3;
            zzibiVar.zzc = null;
        }
        zzibiVar3.zzi = Math.max(i, i2) + 1;
        zzf(zzibiVar, zzibiVar3);
    }

    final zzibi zze(Object obj) {
        zzibi zzibiVarZzb = zzb(obj);
        if (zzibiVarZzb != null) {
            zzd(zzibiVarZzb, true);
        }
        return zzibiVarZzb;
    }

    public zzibj(Comparator comparator, boolean z) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z;
        this.zzd = new zzibi(z);
    }

    public zzibj(boolean z) {
        this(zze, false);
    }
}
