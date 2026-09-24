package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaaq extends zzaaw implements zzmv {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgxt zzc = zzgxt.zzc(zzzz.zza);
    public final Context zza;
    private final Object zzd;
    private zzaae zze;
    private Thread zzf;
    private zzace zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzzl zzj;

    public zzaaq(Context context) {
        zzzl zzzlVar = new zzzl();
        zzaae zzaaeVar = zzaae.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzzlVar;
        if (zzaaeVar instanceof zzaae) {
            this.zze = zzaaeVar;
        } else {
            zzaad zzaadVar = new zzaad(zzaaeVar, bArr);
            zzaadVar.zzx((zzbl) zzaaeVar);
            this.zze = new zzaae(zzaadVar, bArr);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzef.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    private static Pair zzA(zzaar[] zzaarVarArr, int i) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzaar zzaarVar = zzaarVarArr[i2];
            if (zzaarVar != null && zzaarVar.zza.zzc == i) {
                return Pair.create(zzaarVar, Integer.valueOf(i2));
            }
        }
        return null;
    }

    private static final Pair zzB(int i, zzaav zzaavVar, int[][][] iArr, zzaah zzaahVar, Comparator comparator) {
        RandomAccess randomAccessZzj;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == zzaavVar.zza(i2)) {
                zzzf zzzfVarZzb = zzaavVar.zzb(i2);
                for (int i3 = 0; i3 < zzzfVarZzb.zzb; i3++) {
                    zzbg zzbgVarZza = zzzfVarZzb.zza(i3);
                    List listZza = zzaahVar.zza(i2, zzbgVarZza, iArr[i2][i3]);
                    int i4 = zzbgVarZza.zza;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        zzaai zzaaiVar = (zzaai) listZza.get(i5);
                        int iZza = zzaaiVar.zza();
                        if (!zArr[i5] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessZzj = zzgvz.zzj(zzaaiVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzaaiVar);
                                for (int i7 = i6; i7 < i4; i7++) {
                                    zzaai zzaaiVar2 = (zzaai) listZza.get(i7);
                                    if (zzaaiVar2.zza() == 2 && zzaaiVar.zzc(zzaaiVar2)) {
                                        arrayList2.add(zzaaiVar2);
                                        zArr[i7] = true;
                                    }
                                }
                                randomAccessZzj = arrayList2;
                            }
                            arrayList.add(randomAccessZzj);
                        }
                        i5 = i6;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((zzaai) list.get(i8)).zzc;
        }
        zzaai zzaaiVar3 = (zzaai) list.get(0);
        return Pair.create(new zzaar(zzaaiVar3.zzb, iArr2, 0), Integer.valueOf(zzaaiVar3.zza));
    }

    protected static String zzi(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int zzj(zzv zzvVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String strZzi = zzi(str);
        String strZzi2 = zzi(zzvVar.zzd);
        if (strZzi2 == null || strZzi == null) {
            return (z && strZzi2 == null) ? 1 : 0;
        }
        if (strZzi2.startsWith(strZzi) || strZzi.startsWith(strZzi2)) {
            return 3;
        }
        String str2 = zzfk.zza;
        return strZzi2.split("-", 2)[0].equals(strZzi.split("-", 2)[0]) ? 2 : 0;
    }

    static /* synthetic */ int zzm(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    static /* synthetic */ int zzn(zzv zzvVar, zzgvz zzgvzVar) {
        for (int i = 0; i < zzgvzVar.size(); i++) {
            int i2 = 0;
            while (true) {
                List list = zzvVar.zzc;
                if (i2 < list.size()) {
                    if (((zzx) list.get(i2)).zzb.equals(zzgvzVar.get(i))) {
                        return i;
                    }
                    i2++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    protected static final zzaar zzp(int i, zzzf zzzfVar, int[][] iArr, zzaae zzaaeVar) throws zzje {
        int i2 = zzaaeVar.zzw.zzb;
        int i3 = 0;
        zzbg zzbgVar = null;
        zzaac zzaacVar = null;
        for (int i4 = 0; i4 < zzzfVar.zzb; i4++) {
            zzbg zzbgVarZza = zzzfVar.zza(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < zzbgVarZza.zza; i5++) {
                if (zzmw.CC.zzac(iArr2[i5], zzaaeVar.zzV)) {
                    zzaac zzaacVar2 = new zzaac(zzbgVarZza.zza(i5), iArr2[i5]);
                    if (zzaacVar == null || zzaacVar2.compareTo(zzaacVar) > 0) {
                        zzbgVar = zzbgVarZza;
                        i3 = i5;
                        zzaacVar = zzaacVar2;
                    }
                }
            }
        }
        if (zzbgVar == null) {
            return null;
        }
        return new zzaar(zzbgVar, new int[]{i3}, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzk() {
        boolean z;
        zzace zzaceVar;
        synchronized (this.zzd) {
            z = false;
            if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzaceVar = this.zzg) != null && zzaceVar.zzb()) {
                z = true;
            }
        }
        if (z) {
            zzt();
        }
    }

    private static void zzw(zzaav zzaavVar, zzbl zzblVar, zzaar[] zzaarVarArr) {
        HashMap map = new HashMap();
        for (int i = 0; i < 2; i++) {
            zzx(zzaavVar.zzb(i), zzblVar, map);
        }
        zzx(zzaavVar.zze(), zzblVar, map);
        for (int i2 = 0; i2 < 2; i2++) {
            if (((zzbh) map.get(Integer.valueOf(zzaavVar.zza(i2)))) != null) {
                throw null;
            }
        }
    }

    private static void zzx(zzzf zzzfVar, zzbl zzblVar, Map map) {
        for (int i = 0; i < zzzfVar.zzb; i++) {
            if (((zzbh) zzblVar.zzH.get(zzzfVar.zza(i))) != null) {
                throw null;
            }
        }
    }

    private static void zzy(zzaav zzaavVar, zzaae zzaaeVar, zzaar[] zzaarVarArr) {
        for (int i = 0; i < 2; i++) {
            zzzf zzzfVarZzb = zzaavVar.zzb(i);
            if (zzaaeVar.zzb(i, zzzfVarZzb)) {
                if (zzaaeVar.zzc(i, zzzfVarZzb) != null) {
                    throw null;
                }
                zzaarVarArr[i] = null;
            }
        }
    }

    private static void zzz(zzaav zzaavVar, zzaae zzaaeVar, zzaar[] zzaarVarArr) {
        for (int i = 0; i < 2; i++) {
            int iZza = zzaavVar.zza(i);
            if (zzaaeVar.zza(i) || zzaaeVar.zzI.contains(Integer.valueOf(iZza))) {
                zzaarVarArr[i] = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmv
    public final void zza(zzmu zzmuVar) {
        synchronized (this.zzd) {
            boolean z = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zzb() {
        zzace zzaceVar;
        synchronized (this.zzd) {
            Thread thread = this.zzf;
            if (thread != null) {
                zzgsw.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzaceVar = this.zzg) != null) {
            zzaceVar.zzg();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzaae zzc() {
        zzaae zzaaeVar;
        synchronized (this.zzd) {
            zzaaeVar = this.zze;
        }
        return zzaaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzk();
    }

    public final void zzf(zzaad zzaadVar) {
        boolean zEquals;
        zzaae zzaaeVar = new zzaae(zzaadVar, null);
        synchronized (this.zzd) {
            zEquals = this.zze.equals(zzaaeVar);
            this.zze = zzaaeVar;
        }
        if (zEquals) {
            return;
        }
        if (zzaaeVar.zzU && this.zza == null) {
            zzef.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final zzmv zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    protected final Pair zzh(zzaav zzaavVar, int[][][] iArr, final int[] iArr2, zzxc zzxcVar, zzbf zzbfVar) throws zzje {
        final zzaae zzaaeVar;
        zzzl zzzlVar;
        int[] iArr3;
        int length;
        zzaas zzaasVarZza;
        int i;
        int i2;
        final String languageTag;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        final boolean z;
        Context context3;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzaaeVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzfk.zzO(context3));
        }
        if (zzaaeVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzace(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzk();
                }
            }, this.zzi);
        }
        zzaar[] zzaarVarArr = new zzaar[2];
        zzw(zzaavVar, zzaaeVar, zzaarVarArr);
        zzy(zzaavVar, zzaaeVar, zzaarVarArr);
        zzz(zzaavVar, zzaaeVar, zzaarVarArr);
        Pair pairZzA = zzA(zzaarVarArr, 1);
        int i3 = 0;
        if (pairZzA == null) {
            int i4 = 0;
            while (true) {
                if (i4 >= 2) {
                    z = false;
                    break;
                }
                if (zzaavVar.zza(i4) == 2 && zzaavVar.zzb(i4).zzb > 0) {
                    z = true;
                    break;
                }
                i4++;
            }
            pairZzA = zzB(1, zzaavVar, iArr, new zzaah() { // from class: com.google.android.gms.internal.ads.zzzv
                @Override // com.google.android.gms.internal.ads.zzaah
                public final /* synthetic */ List zza(int i5, zzbg zzbgVar, int[] iArr4) {
                    final zzaaq zzaaqVar = this.zza;
                    final zzaae zzaaeVar2 = zzaaeVar;
                    zzgsx zzgsxVar = new zzgsx() { // from class: com.google.android.gms.internal.ads.zzzy
                        @Override // com.google.android.gms.internal.ads.zzgsx
                        public final /* synthetic */ boolean zza(Object obj) {
                            return zzaaqVar.zzl(zzaaeVar2, (zzv) obj);
                        }
                    };
                    int i6 = iArr2[i5];
                    int i7 = zzgvz.zzd;
                    zzgvw zzgvwVar = new zzgvw();
                    for (int i8 = 0; i8 < zzbgVar.zza; i8++) {
                        zzgvwVar.zzf(new zzzp(i5, zzbgVar, i8, zzaaeVar2, iArr4[i8], z, zzgsxVar, i6));
                    }
                    return zzgvwVar.zzi();
                }
            }, zzzq.zza);
            if (pairZzA != null) {
                zzaarVarArr[((Integer) pairZzA.second).intValue()] = (zzaar) pairZzA.first;
            }
        }
        final String str = pairZzA == null ? null : ((zzaar) pairZzA.first).zza.zza(((zzaar) pairZzA.first).zzb[0]).zzd;
        Pair pairZzA2 = zzA(zzaarVarArr, 2);
        Pair pairZzA3 = zzA(zzaarVarArr, 4);
        if (pairZzA2 == null && pairZzA3 == null) {
            int i5 = zzaaeVar.zzw.zzb;
            final Point pointZzQ = (!zzaaeVar.zzk || (context2 = this.zza) == null) ? null : zzfk.zzQ(context2);
            Pair pairZzB = zzB(2, zzaavVar, iArr, new zzaah() { // from class: com.google.android.gms.internal.ads.zzzu
                /* JADX WARN: Code duplicated, block: B:29:0x004d  */
                @Override // com.google.android.gms.internal.ads.zzaah
                public final /* synthetic */ List zza(int i6, zzbg zzbgVar, int[] iArr4) {
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    Point point;
                    zzbg zzbgVar2 = zzbgVar;
                    int i13 = zzaaq.zzb;
                    Point point2 = pointZzQ;
                    int i14 = iArr2[i6];
                    zzaae zzaaeVar2 = zzaaeVar;
                    int i15 = point2 != null ? point2.x : zzaaeVar2.zzi;
                    int i16 = point2 != null ? point2.y : zzaaeVar2.zzj;
                    boolean z2 = zzaaeVar2.zzl;
                    if (i15 == Integer.MAX_VALUE) {
                        i7 = -1;
                        i8 = Integer.MAX_VALUE;
                    } else if (i16 == Integer.MAX_VALUE) {
                        i8 = Integer.MAX_VALUE;
                        i7 = -1;
                    } else {
                        int i17 = Integer.MAX_VALUE;
                        for (int i18 = 0; i18 < zzbgVar2.zza; i18++) {
                            zzv zzvVarZza = zzbgVar2.zza(i18);
                            int i19 = zzvVarZza.zzw;
                            if (i19 > 0 && (i10 = zzvVarZza.zzx) > 0) {
                                if (!z2) {
                                    i11 = i16;
                                    i12 = i15;
                                } else if ((i19 > i10) != (i15 > i16)) {
                                    i12 = i16;
                                    i11 = i15;
                                } else {
                                    i11 = i16;
                                    i12 = i15;
                                }
                                int i20 = i19 * i11;
                                int i21 = i10 * i12;
                                if (i20 >= i21) {
                                    String str2 = zzfk.zza;
                                    point = new Point(i12, ((i21 + i19) - 1) / i19);
                                } else {
                                    String str3 = zzfk.zza;
                                    point = new Point(((i20 + i10) - 1) / i10, i11);
                                }
                                int i22 = i19 * i10;
                                if (i19 >= ((int) (point.x * 0.98f)) && i10 >= ((int) (point.y * 0.98f)) && i22 < i17) {
                                    i17 = i22;
                                }
                            }
                        }
                        i7 = -1;
                        i8 = i17;
                    }
                    int i23 = zzgvz.zzd;
                    zzgvw zzgvwVar = new zzgvw();
                    int i24 = 0;
                    while (i24 < zzbgVar2.zza) {
                        int iZzc = zzbgVar2.zza(i24).zzc();
                        if (i8 != Integer.MAX_VALUE) {
                            i9 = i7;
                            boolean z3 = iZzc != i9 && iZzc <= i8;
                            zzgvwVar.zzf(new zzaap(i6, zzbgVar2, i24, zzaaeVar2, iArr4[i24], str, i14, z3));
                            i24++;
                            zzbgVar2 = zzbgVar;
                            i7 = i9;
                        } else {
                            i9 = i7;
                        }
                        zzgvwVar.zzf(new zzaap(i6, zzbgVar2, i24, zzaaeVar2, iArr4[i24], str, i14, z3));
                        i24++;
                        zzbgVar2 = zzbgVar;
                        i7 = i9;
                    }
                    return zzgvwVar.zzi();
                }
            }, zzzt.zza);
            boolean z2 = zzaaeVar.zzE;
            Pair pairZzB2 = pairZzB == null ? zzB(4, zzaavVar, iArr, new zzaah() { // from class: com.google.android.gms.internal.ads.zzzx
                @Override // com.google.android.gms.internal.ads.zzaah
                public final /* synthetic */ List zza(int i6, zzbg zzbgVar, int[] iArr4) {
                    int i7 = zzaaq.zzb;
                    int i8 = zzgvz.zzd;
                    zzgvw zzgvwVar = new zzgvw();
                    for (int i9 = 0; i9 < zzbgVar.zza; i9++) {
                        zzgvwVar.zzf(new zzaab(i6, zzbgVar, i9, zzaaeVar, iArr4[i9]));
                    }
                    return zzgvwVar.zzi();
                }
            }, zzzr.zza) : null;
            if (pairZzB2 != null) {
                zzaarVarArr[((Integer) pairZzB2.second).intValue()] = (zzaar) pairZzB2.first;
            } else if (pairZzB != null) {
                zzaarVarArr[((Integer) pairZzB.second).intValue()] = (zzaar) pairZzB.first;
            }
        }
        if (zzA(zzaarVarArr, 3) == null) {
            int i6 = zzaaeVar.zzw.zzb;
            if (!zzaaeVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = null;
            } else {
                String str2 = zzfk.zza;
                languageTag = locale.toLanguageTag();
            }
            Pair pairZzB3 = zzB(3, zzaavVar, iArr, new zzaah() { // from class: com.google.android.gms.internal.ads.zzzw
                @Override // com.google.android.gms.internal.ads.zzaah
                public final /* synthetic */ List zza(int i7, zzbg zzbgVar, int[] iArr4) {
                    int i8 = zzaaq.zzb;
                    int i9 = zzgvz.zzd;
                    zzgvw zzgvwVar = new zzgvw();
                    for (int i10 = 0; i10 < zzbgVar.zza; i10++) {
                        zzgvwVar.zzf(new zzaag(i7, zzbgVar, i10, zzaaeVar, iArr4[i10], str, languageTag));
                    }
                    return zzgvwVar.zzi();
                }
            }, zzzs.zza);
            if (pairZzB3 != null) {
                zzaarVarArr[((Integer) pairZzB3.second).intValue()] = (zzaar) pairZzB3.first;
            }
        }
        int i7 = zzaaeVar.zzw.zzb;
        zzgwi zzgwiVar = new zzgwi();
        int i8 = 0;
        while (i8 < 2) {
            zzaar zzaarVar = zzaarVarArr[i8];
            if (zzaarVar == null || zzaaeVar.zza(i8)) {
                i2 = i3;
            } else {
                zzgwj zzgwjVar = zzaaeVar.zzI;
                zzbg zzbgVar = zzaarVar.zza;
                i2 = i3;
                if (!zzgwjVar.contains(Integer.valueOf(zzbgVar.zzc))) {
                    zzgwiVar.zzf(zzbgVar.zzb);
                    int i9 = i2;
                    while (true) {
                        int[] iArr4 = zzaarVar.zzb;
                        if (i9 < iArr4.length) {
                            String str3 = zzbgVar.zza(iArr4[i9]).zzn;
                            if (str3 != null) {
                                zzgwiVar.zzf(str3);
                            }
                            i9++;
                        }
                    }
                }
            }
            i8++;
            i3 = i2;
        }
        int i10 = i3;
        zzgwj zzgwjVarZzh = zzgwiVar.zzh();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = i10; i11 < 2; i11++) {
            if (zzaavVar.zza(i11) == 5) {
                zzzf zzzfVarZzb = zzaavVar.zzb(i11);
                for (int i12 = i10; i12 < zzzfVarZzb.zzb; i12++) {
                    zzbg zzbgVarZza = zzzfVarZzb.zza(i12);
                    arrayList.add(zzbgVarZza);
                    int[] iArr5 = (int[]) iArr[i11][i12].clone();
                    for (int i13 = i10; i13 < iArr5.length; i13++) {
                        String str4 = zzbgVarZza.zza(i13).zzn;
                        if (str4 != null && !zzgwjVarZzh.contains(str4)) {
                            iArr5[i13] = 128;
                        }
                    }
                    arrayList2.add(iArr5);
                }
            }
        }
        int i14 = 128;
        zzbg[] zzbgVarArr = new zzbg[arrayList.size()];
        zzfk.zzc(arrayList, zzbgVarArr);
        zzzf zzzfVar = new zzzf(zzbgVarArr);
        int[][] iArr6 = new int[arrayList2.size()][];
        zzfk.zzc(arrayList2, iArr6);
        int i15 = i10;
        while (i15 < 2) {
            if (zzaavVar.zza(i15) == 5) {
                zzaar zzaarVarZzp = zzp(5, zzzfVar, iArr6, zzaaeVar);
                zzaarVarArr[i15] = zzaarVarZzp;
                if (zzaarVarZzp == null) {
                    break;
                }
                i = i14;
                Arrays.fill(iArr6[zzzfVar.zzb(zzaarVarZzp.zza)], i);
            } else {
                i = i14;
            }
            i15++;
            i14 = i;
        }
        for (int i16 = i10; i16 < 2; i16++) {
            int iZza = zzaavVar.zza(i16);
            if (iZza != 2 && iZza != 1) {
                if (iZza != 3 && iZza != 4 && iZza != 5 && zzaarVarArr[i16] == null) {
                    zzaarVarArr[i16] = zzp(iZza, zzaavVar.zzb(i16), iArr[i16], zzaaeVar);
                }
            }
        }
        zzw(zzaavVar, zzaaeVar, zzaarVarArr);
        zzy(zzaavVar, zzaaeVar, zzaarVarArr);
        zzz(zzaavVar, zzaaeVar, zzaarVarArr);
        zzzl zzzlVar2 = this.zzj;
        zzabi zzabiVarZzu = zzu();
        zzgvz zzgvzVarZzd = zzzm.zzd(zzaarVarArr);
        zzaas[] zzaasVarArr = new zzaas[2];
        int i17 = i10;
        while (i17 < 2) {
            zzaar zzaarVar2 = zzaarVarArr[i17];
            if (zzaarVar2 == null || (length = (iArr3 = zzaarVar2.zzb).length) == 0) {
                zzzlVar = zzzlVar2;
            } else {
                if (length == 1) {
                    zzaasVarZza = new zzaat(zzaarVar2.zza, iArr3[i10], 0, 0, null);
                    zzzlVar = zzzlVar2;
                } else {
                    zzzlVar = zzzlVar2;
                    zzaasVarZza = zzzlVar.zza(zzaarVar2.zza, iArr3, 0, zzabiVarZzu, (zzgvz) zzgvzVarZzd.get(i17));
                }
                zzaasVarArr[i17] = zzaasVarZza;
            }
            i17++;
            zzzlVar2 = zzzlVar;
        }
        zzmx[] zzmxVarArr = new zzmx[2];
        for (int i18 = i10; i18 < 2; i18++) {
            zzmxVarArr[i18] = (zzaaeVar.zza(i18) || zzaaeVar.zzI.contains(Integer.valueOf(zzaavVar.zza(i18))) || (zzaavVar.zza(i18) != -2 && zzaasVarArr[i18] == null)) ? null : zzmx.zza;
        }
        boolean z3 = zzaaeVar.zzW;
        return Pair.create(zzmxVarArr, zzaasVarArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final /* synthetic */ boolean zzl(zzaae zzaaeVar, zzv zzvVar) {
        Boolean bool;
        zzace zzaceVar;
        zzace zzaceVar2;
        if (!zzaaeVar.zzU || ((bool = this.zzi) != null && bool.booleanValue())) {
            return true;
        }
        int i = zzvVar.zzH;
        byte b = -1;
        if (i != -1 && i > 2) {
            String str = zzvVar.zzp;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals("audio/eac3-joc")) {
                            b = 2;
                        }
                        break;
                    case 187078296:
                        if (str.equals("audio/ac3")) {
                            b = 0;
                        }
                        break;
                    case 187078297:
                        if (str.equals("audio/ac4")) {
                            b = 3;
                        }
                        break;
                    case 1504578661:
                        if (str.equals("audio/eac3")) {
                            b = 1;
                        }
                        break;
                }
                if ((b == 0 || b == 1 || b == 2 || b == 3) && (Build.VERSION.SDK_INT < 32 || (zzaceVar2 = this.zzg) == null || !zzaceVar2.zzb())) {
                    return true;
                }
            }
            return Build.VERSION.SDK_INT >= 32 && (zzaceVar = this.zzg) != null && zzaceVar.zzb() && zzaceVar.zzc() && this.zzg.zzd() && this.zzg.zze(this.zzh, zzvVar);
        }
        return true;
    }
}
