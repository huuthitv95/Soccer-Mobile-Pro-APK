package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapo implements zzapm {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzahb zzb;
    private final zzare zzd;
    private final String zze;
    private final zzes zzf;
    private final zzaqd zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzapn zzi = new zzapn(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    zzapo(zzare zzareVar, String str) {
        zzes zzesVar;
        this.zzd = zzareVar;
        this.zze = str;
        if (zzareVar != null) {
            this.zzg = new zzaqd(178, 128);
            zzesVar = new zzes();
        } else {
            zzesVar = null;
            this.zzg = null;
        }
        this.zzf = zzesVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        zzgo.zzj(this.zzh);
        this.zzi.zza();
        zzaqd zzaqdVar = this.zzg;
        if (zzaqdVar != null) {
            zzaqdVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zza = zzaraVar.zzc();
        this.zzb = zzafsVar.zzu(zzaraVar.zzb(), 2);
        zzare zzareVar = this.zzd;
        if (zzareVar != null) {
            zzareVar.zza(zzafsVar, zzaraVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0104  */
    /* JADX WARN: Code duplicated, block: B:41:0x0133  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) {
        long j;
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        long j2;
        double d;
        int i5;
        int i6;
        this.zzb.getClass();
        int iZzg = zzesVar.zzg();
        int iZze = zzesVar.zze();
        byte[] bArrZzi = zzesVar.zzi();
        this.zzj += (long) zzesVar.zzd();
        this.zzb.zzc(zzesVar, zzesVar.zzd());
        while (true) {
            int iZzi = zzgo.zzi(bArrZzi, iZzg, iZze, this.zzh);
            if (iZzi == iZze) {
                break;
            }
            int i7 = iZzi + 3;
            int i8 = zzesVar.zzi()[i7] & 255;
            int i9 = iZzi - iZzg;
            if (!this.zzl) {
                if (i9 > 0) {
                    this.zzi.zzc(bArrZzi, iZzg, iZzi);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                zzapn zzapnVar = this.zzi;
                if (zzapnVar.zzb(i8, i10)) {
                    String str = this.zza;
                    str.getClass();
                    String str2 = this.zze;
                    byte[] bArrCopyOf = Arrays.copyOf(zzapnVar.zzc, zzapnVar.zza);
                    int i11 = bArrCopyOf[4] & 255;
                    byte b = bArrCopyOf[5];
                    int i12 = bArrCopyOf[6] & 255;
                    int i13 = (i11 << 4) | ((b & 255) >> 4);
                    int i14 = (bArrCopyOf[7] & 240) >> 4;
                    int i15 = ((b & Ascii.f22499SI) << 8) | i12;
                    if (i14 == 2) {
                        i2 = i15 * 4;
                        i3 = i13 * 3;
                    } else if (i14 != 3) {
                        if (i14 != 4) {
                            f = 1.0f;
                        } else {
                            i2 = i15 * Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                            i3 = i13 * 100;
                        }
                        zzt zztVar = new zzt();
                        zztVar.zza(str);
                        zztVar.zzn(str2);
                        zztVar.zzo("video/mpeg2");
                        zztVar.zzv(i13);
                        zztVar.zzw(i15);
                        zztVar.zzB(f);
                        zztVar.zzr(Collections.singletonList(bArrCopyOf));
                        zzv zzvVarZzO = zztVar.zzO();
                        i4 = (bArrCopyOf[7] & Ascii.f22499SI) - 1;
                        j2 = 0;
                        if (i4 >= 0 && i4 < 8) {
                            d = zzc[i4];
                            byte b2 = bArrCopyOf[zzapnVar.zzb + 9];
                            i5 = (b2 & 96) >> 5;
                            i6 = b2 & Ascii.f22502US;
                            if (i5 != i6) {
                                d *= (((double) i5) + 1.0d) / ((double) (i6 + 1));
                            }
                            j2 = (long) (1000000.0d / d);
                        }
                        Pair pairCreate = Pair.create(zzvVarZzO, Long.valueOf(j2));
                        this.zzb.zzA((zzv) pairCreate.first);
                        this.zzm = ((Long) pairCreate.second).longValue();
                        this.zzl = true;
                    } else {
                        i2 = i15 * 16;
                        i3 = i13 * 9;
                    }
                    f = i2 / i3;
                    zzt zztVar2 = new zzt();
                    zztVar2.zza(str);
                    zztVar2.zzn(str2);
                    zztVar2.zzo("video/mpeg2");
                    zztVar2.zzv(i13);
                    zztVar2.zzw(i15);
                    zztVar2.zzB(f);
                    zztVar2.zzr(Collections.singletonList(bArrCopyOf));
                    zzv zzvVarZzO2 = zztVar2.zzO();
                    i4 = (bArrCopyOf[7] & Ascii.f22499SI) - 1;
                    j2 = 0;
                    if (i4 >= 0) {
                        d = zzc[i4];
                        byte b3 = bArrCopyOf[zzapnVar.zzb + 9];
                        i5 = (b3 & 96) >> 5;
                        i6 = b3 & Ascii.f22502US;
                        if (i5 != i6) {
                            d *= (((double) i5) + 1.0d) / ((double) (i6 + 1));
                        }
                        j2 = (long) (1000000.0d / d);
                    }
                    Pair pairCreate2 = Pair.create(zzvVarZzO2, Long.valueOf(j2));
                    this.zzb.zzA((zzv) pairCreate2.first);
                    this.zzm = ((Long) pairCreate2.second).longValue();
                    this.zzl = true;
                }
            }
            zzaqd zzaqdVar = this.zzg;
            if (zzaqdVar != null) {
                if (i9 > 0) {
                    zzaqdVar.zzd(bArrZzi, iZzg, iZzi);
                    i = 0;
                } else {
                    i = -i9;
                }
                if (zzaqdVar.zze(i)) {
                    int iZza = zzgo.zza(zzaqdVar.zza, zzaqdVar.zzb);
                    zzes zzesVar2 = this.zzf;
                    String str3 = zzfk.zza;
                    zzesVar2.zzb(zzaqdVar.zza, iZza);
                    this.zzd.zzb(this.zzp, zzesVar2);
                }
                if (i8 == 178) {
                    if (zzesVar.zzi()[iZzi + 2] == 1) {
                        zzaqdVar.zzc(178);
                    }
                    i8 = 178;
                }
            }
            if (i8 == 0 || i8 == 179) {
                int i16 = iZze - iZzi;
                if (this.zzr && this.zzl) {
                    j = -9223372036854775807L;
                    long j3 = this.zzp;
                    if (j3 != -9223372036854775807L) {
                        j = -9223372036854775807L;
                        this.zzb.zze(j3, this.zzq ? 1 : 0, ((int) (this.zzj - this.zzo)) - i16, i16, null);
                    }
                } else {
                    j = -9223372036854775807L;
                }
                if (!this.zzk || this.zzr) {
                    this.zzo = this.zzj - ((long) i16);
                    long j4 = this.zzn;
                    if (j4 == j) {
                        long j5 = this.zzp;
                        j4 = j5 != j ? j5 + this.zzm : j;
                    }
                    this.zzp = j4;
                    z = false;
                    this.zzq = false;
                    this.zzn = j;
                    z2 = true;
                    this.zzk = true;
                } else {
                    z2 = true;
                    z = false;
                }
                this.zzr = i8 == 0 ? z2 : z;
            } else if (i8 == 184) {
                this.zzq = true;
            }
            iZzg = i7;
            iZze = iZze;
        }
        if (!this.zzl) {
            this.zzi.zzc(bArrZzi, iZzg, iZze);
        }
        zzaqd zzaqdVar2 = this.zzg;
        if (zzaqdVar2 != null) {
            zzaqdVar2.zzd(bArrZzi, iZzg, iZze);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
        zzahb zzahbVar = this.zzb;
        zzahbVar.getClass();
        if (z) {
            boolean z2 = this.zzq;
            long j = this.zzj - this.zzo;
            zzahbVar.zze(this.zzp, z2 ? 1 : 0, (int) j, 0, null);
        }
    }
}
