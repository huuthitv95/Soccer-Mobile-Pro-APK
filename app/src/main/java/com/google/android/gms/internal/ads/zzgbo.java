package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgbo implements zzgae {
    private final CoroutineScope zza;
    private final zzgrz zzb;
    private final Mutex zzc;
    private final Mutex zzd;
    private final Mutex zze;
    private boolean zzf;
    private zzgac zzg;
    private boolean zzh;
    private final DataStore zzi;
    private final zzdwk zzj;

    public zzgbo(DataStore adQualityDataStore, zzgaq coroutineScopeProvider, zzdwk dataPinger, zzgan clock) {
        Intrinsics.checkNotNullParameter(adQualityDataStore, "adQualityDataStore");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(dataPinger, "dataPinger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.zzj = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = new zzgrz();
        this.zzc = MutexKt.Mutex$default(false, 1, null);
        this.zzd = MutexKt.Mutex$default(false, 1, null);
        this.zze = MutexKt.Mutex$default(false, 1, null);
        this.zzi = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzA(Continuation continuation) throws Throwable {
        zzgaw zzgawVar;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        if (continuation instanceof zzgaw) {
            zzgawVar = (zzgaw) continuation;
            int i = zzgawVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzgawVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzgawVar = new zzgaw(this, continuation);
            }
        } else {
            zzgawVar = new zzgaw(this, continuation);
        }
        Object obj = zzgawVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzgawVar.zzd;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.zze;
                zzgawVar.zza = mutex;
                zzgawVar.zzd = 1;
                if (mutex.lock(null, zzgawVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) zzgawVar.zza;
                try {
                    ResultKt.throwOnFailure(obj);
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) zzgawVar.zza;
            ResultKt.throwOnFailure(obj);
            mutex = mutex3;
            DataStore dataStore = this.zzi;
            zzgax zzgaxVar = new zzgax(null);
            zzgawVar.zza = mutex;
            zzgawVar.zzd = 2;
            Object objUpdateData = dataStore.updateData(zzgaxVar, zzgawVar);
            if (objUpdateData != coroutine_suspended) {
                mutex2 = mutex;
                obj = objUpdateData;
                mutex2.unlock(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzB(long j, Continuation continuation) throws Throwable {
        zzgav zzgavVar;
        Mutex mutex;
        if (continuation instanceof zzgav) {
            zzgavVar = (zzgav) continuation;
            int i = zzgavVar.zze;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzgavVar.zze = i - Integer.MIN_VALUE;
            } else {
                zzgavVar = new zzgav(this, continuation);
            }
        } else {
            zzgavVar = new zzgav(this, continuation);
        }
        Object obj = zzgavVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzgavVar.zze;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.zzc;
            zzgavVar.zzb = mutex2;
            zzgavVar.zza = j;
            zzgavVar.zze = 1;
            if (mutex2.lock(null, zzgavVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = zzgavVar.zza;
            mutex = (Mutex) zzgavVar.zzb;
            ResultKt.throwOnFailure(obj);
        }
        try {
            zzgac zzgacVar = this.zzg;
            if (zzgacVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzgacVar = null;
            }
            zzgac zzgacVar2 = this.zzg;
            if (zzgacVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzgacVar2 = null;
            }
            long jZzi = j - zzgacVar2.zzi();
            zzgac zzgacVar3 = this.zzg;
            if (zzgacVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzgacVar3 = null;
            }
            zzgacVar.zzb(jZzi - zzgacVar3.zzg());
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzC(Continuation continuation) throws Throwable {
        zzgba zzgbaVar;
        Mutex mutex;
        Mutex mutex2;
        zzgad zzgadVar;
        Mutex mutex3;
        if (continuation instanceof zzgba) {
            zzgbaVar = (zzgba) continuation;
            int i = zzgbaVar.zze;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzgbaVar.zze = i - Integer.MIN_VALUE;
            } else {
                zzgbaVar = new zzgba(this, continuation);
            }
        } else {
            zzgbaVar = new zzgba(this, continuation);
        }
        Object objUpdateData = zzgbaVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzgbaVar.zze;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUpdateData);
                mutex = this.zzc;
                zzgbaVar.zza = mutex;
                zzgbaVar.zze = 1;
                if (mutex.lock(null, zzgbaVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex3 = (Mutex) zzgbaVar.zza;
                    try {
                        ResultKt.throwOnFailure(objUpdateData);
                        mutex3.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        mutex3.unlock(null);
                        throw th;
                    }
                }
                mutex2 = (Mutex) zzgbaVar.zzb;
                zzgadVar = (zzgad) zzgbaVar.zza;
                ResultKt.throwOnFailure(objUpdateData);
                try {
                    DataStore dataStore = this.zzi;
                    zzgbb zzgbbVar = new zzgbb(zzgadVar, null);
                    zzgbaVar.zza = mutex2;
                    zzgbaVar.zzb = null;
                    zzgbaVar.zze = 3;
                    objUpdateData = dataStore.updateData(zzgbbVar, zzgbaVar);
                    if (objUpdateData != coroutine_suspended) {
                        mutex3 = mutex2;
                        mutex3.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    mutex3 = mutex2;
                    mutex3.unlock(null);
                    throw th;
                }
            }
            mutex = (Mutex) zzgbaVar.zza;
            ResultKt.throwOnFailure(objUpdateData);
            zzgac zzgacVar = this.zzg;
            if (zzgacVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzgacVar = null;
            }
            zzgad zzgadVar2 = (zzgad) zzgacVar.zzbu();
            mutex.unlock(null);
            Intrinsics.checkNotNull(zzgadVar2);
            mutex2 = this.zze;
            zzgbaVar.zza = zzgadVar2;
            zzgbaVar.zzb = mutex2;
            zzgbaVar.zze = 2;
            if (mutex2.lock(null, zzgbaVar) != coroutine_suspended) {
                zzgadVar = zzgadVar2;
                DataStore dataStore2 = this.zzi;
                zzgbb zzgbbVar2 = new zzgbb(zzgadVar, null);
                zzgbaVar.zza = mutex2;
                zzgbaVar.zzb = null;
                zzgbaVar.zze = 3;
                objUpdateData = dataStore2.updateData(zzgbbVar2, zzgbaVar);
                if (objUpdateData != coroutine_suspended) {
                    mutex3 = mutex2;
                    mutex3.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex.unlock(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    private static final boolean zzD(zzgad zzgadVar) {
        boolean z;
        List listZzk = zzgadVar.zzk();
        Long l = listZzk != null ? (Long) CollectionsKt.lastOrNull(listZzk) : null;
        boolean z2 = zzgadVar.zzl() > zzgadVar.zzm() && !zzgadVar.zzd();
        if (l != null) {
            if (zzgadVar.zzi() - l.longValue() > 5000) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z2 || z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (zzA(r0) == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzgbo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzs(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgbo.zzs(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzt(String str, Continuation continuation) throws Throwable {
        zzgbd zzgbdVar;
        String str2;
        Mutex mutex;
        long j;
        if (continuation instanceof zzgbd) {
            zzgbdVar = (zzgbd) continuation;
            int i = zzgbdVar.zze;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzgbdVar.zze = i - Integer.MIN_VALUE;
            } else {
                zzgbdVar = new zzgbd(this, continuation);
            }
        } else {
            zzgbdVar = new zzgbd(this, continuation);
        }
        Object obj = zzgbdVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzgbdVar.zze;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.zzc;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgbdVar.zzf = str;
            zzgbdVar.zza = mutex2;
            zzgbdVar.zzb = jCurrentTimeMillis;
            zzgbdVar.zze = 1;
            if (mutex2.lock(null, zzgbdVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            mutex = mutex2;
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = zzgbdVar.zzb;
            mutex = (Mutex) zzgbdVar.zza;
            str2 = zzgbdVar.zzf;
            ResultKt.throwOnFailure(obj);
        }
        try {
            if (this.zzf) {
                return Unit.INSTANCE;
            }
            this.zzf = true;
            zzidl zzidlVarZzcc = zzgad.zzp().zzcc();
            Intrinsics.checkNotNullExpressionValue(zzidlVarZzcc, "toBuilder(...)");
            zzgac zzgacVar = (zzgac) zzidlVarZzcc;
            this.zzg = zzgacVar;
            if (zzgacVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzgacVar = null;
            }
            zzgacVar.zza(str2);
            zzgacVar.zzj(j);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:31:0x0085, B:33:0x0089, B:34:0x008f), top: B:50:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        if (zzC(r0) != r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzu(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.internal.ads.zzgaz
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.gms.internal.ads.zzgaz r0 = (com.google.android.gms.internal.ads.zzgaz) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgaz r0 = new com.google.android.gms.internal.ads.zzgaz
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.zzc
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.zze
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L52
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            kotlin.ResultKt.throwOnFailure(r11)
            goto La8
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3c:
            kotlin.ResultKt.throwOnFailure(r11)
            goto La0
        L40:
            long r5 = r0.zzb
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L85
        L4a:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L61
        L52:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlinx.coroutines.sync.Mutex r2 = r10.zzd
            r0.zza = r2
            r0.zze = r6
            java.lang.Object r11 = r2.lock(r7, r0)
            if (r11 == r1) goto Lb5
        L61:
            boolean r11 = r10.zzh     // Catch: java.lang.Throwable -> Lb0
            if (r11 == 0) goto L6b
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb0
            r2.unlock(r7)
            return r11
        L6b:
            r10.zzh = r6     // Catch: java.lang.Throwable -> Lb0
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb0
            r2.unlock(r7)
            kotlinx.coroutines.sync.Mutex r2 = r10.zzc
            long r8 = java.lang.System.currentTimeMillis()
            r0.zza = r2
            r0.zzb = r8
            r0.zze = r5
            java.lang.Object r11 = r2.lock(r7, r0)
            if (r11 == r1) goto Lb5
            r5 = r8
        L85:
            com.google.android.gms.internal.ads.zzgac r11 = r10.zzg     // Catch: java.lang.Throwable -> Lab
            if (r11 != 0) goto L8f
            java.lang.String r11 = "adQualityDataBuilder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)     // Catch: java.lang.Throwable -> Lab
            r11 = r7
        L8f:
            r11.zzo(r5)     // Catch: java.lang.Throwable -> Lab
            r2.unlock(r7)
            r0.zza = r7
            r0.zze = r4
            java.lang.Object r11 = r10.zzB(r5, r0)
            if (r11 != r1) goto La0
            goto Lb5
        La0:
            r0.zze = r3
            java.lang.Object r11 = r10.zzC(r0)
            if (r11 == r1) goto Lb5
        La8:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        Lab:
            r11 = move-exception
            r2.unlock(r7)
            throw r11
        Lb0:
            r11 = move-exception
            r2.unlock(r7)
            throw r11
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgbo.zzu(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x007e A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008e A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d9 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010d A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzv(Continuation continuation) throws Throwable {
        zzgbn zzgbnVar;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzgac zzgacVar;
        zzgac zzgacVar2;
        zzgac zzgacVar3;
        zzgac zzgacVar4;
        zzgac zzgacVar5;
        zzgac zzgacVar6;
        long jLongValue;
        zzgac zzgacVar7;
        zzgac zzgacVar8;
        if (continuation instanceof zzgbn) {
            zzgbnVar = (zzgbn) continuation;
            int i = zzgbnVar.zze;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzgbnVar.zze = i - Integer.MIN_VALUE;
            } else {
                zzgbnVar = new zzgbn(this, continuation);
            }
        } else {
            zzgbnVar = new zzgbn(this, continuation);
        }
        Object obj = zzgbnVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzgbnVar.zze;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.zzd;
                zzgbnVar.zza = mutex;
                zzgbnVar.zze = 1;
                if (mutex.lock(null, zzgbnVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                mutex = (Mutex) zzgbnVar.zza;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = zzgbnVar.zzb;
                mutex2 = (Mutex) zzgbnVar.zza;
                ResultKt.throwOnFailure(obj);
            }
            try {
                zzgacVar = this.zzg;
                if (zzgacVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                    zzgacVar = null;
                }
                if (zzgacVar.zzr() > 0) {
                    zzgacVar6 = this.zzg;
                    if (zzgacVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgacVar6 = null;
                    }
                    List listZzq = zzgacVar6.zzq();
                    Intrinsics.checkNotNullExpressionValue(listZzq, "getAdClickTimestampsMsList(...)");
                    Object objLast = CollectionsKt.last((List<? extends Object>) listZzq);
                    Intrinsics.checkNotNullExpressionValue(objLast, "last(...)");
                    jLongValue = j - ((Number) objLast).longValue();
                    zzgacVar7 = this.zzg;
                    if (zzgacVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgacVar7 = null;
                    }
                    zzgacVar7.zzt();
                    if (jLongValue < 5000) {
                        zzgacVar8 = this.zzg;
                        if (zzgacVar8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                            zzgacVar8 = null;
                        }
                        zzgacVar8.zzd(zzgacVar8.zzc() + 1);
                    }
                }
                zzgacVar2 = this.zzg;
                if (zzgacVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                    zzgacVar2 = null;
                }
                if (zzgacVar2.zzn() > 0) {
                    zzgacVar4 = this.zzg;
                    if (zzgacVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgacVar4 = null;
                    }
                    List listZzm = zzgacVar4.zzm();
                    Intrinsics.checkNotNullExpressionValue(listZzm, "getAppBackgroundTimestampsMsList(...)");
                    Object objLast2 = CollectionsKt.last((List<? extends Object>) listZzm);
                    Intrinsics.checkNotNullExpressionValue(objLast2, "last(...)");
                    long jLongValue2 = j - ((Number) objLast2).longValue();
                    zzgacVar5 = this.zzg;
                    if (zzgacVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgacVar5 = null;
                    }
                    zzgacVar5.zzh(zzgacVar5.zzg() + jLongValue2);
                }
                zzgacVar3 = this.zzg;
                if (zzgacVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                    zzgacVar3 = null;
                }
                zzgacVar3.zzp(j);
                return Unit.INSTANCE;
            } finally {
                mutex2.unlock(null);
            }
            if (!this.zzh) {
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                return unit;
            }
            this.zzh = false;
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            Mutex mutex3 = this.zzc;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgbnVar.zza = mutex3;
            zzgbnVar.zzb = jCurrentTimeMillis;
            zzgbnVar.zze = 2;
            if (mutex3.lock(null, zzgbnVar) != coroutine_suspended) {
                mutex2 = mutex3;
                j = jCurrentTimeMillis;
                zzgacVar = this.zzg;
                if (zzgacVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                    zzgacVar = null;
                }
                if (zzgacVar.zzr() > 0) {
                    zzgacVar6 = this.zzg;
                    if (zzgacVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgacVar6 = null;
                    }
                    List listZzq2 = zzgacVar6.zzq();
                    Intrinsics.checkNotNullExpressionValue(listZzq2, "getAdClickTimestampsMsList(...)");
                    Object objLast3 = CollectionsKt.last((List<? extends Object>) listZzq2);
                    Intrinsics.checkNotNullExpressionValue(objLast3, "last(...)");
                    jLongValue = j - ((Number) objLast3).longValue();
                    zzgacVar7 = this.zzg;
                    if (zzgacVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgacVar7 = null;
                    }
                    zzgacVar7.zzt();
                    if (jLongValue < 5000) {
                        zzgacVar8 = this.zzg;
                        if (zzgacVar8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                            zzgacVar8 = null;
                        }
                        zzgacVar8.zzd(zzgacVar8.zzc() + 1);
                    }
                }
                zzgacVar2 = this.zzg;
                if (zzgacVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                    zzgacVar2 = null;
                }
                if (zzgacVar2.zzn() > 0) {
                    zzgacVar4 = this.zzg;
                    if (zzgacVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgacVar4 = null;
                    }
                    List listZzm2 = zzgacVar4.zzm();
                    Intrinsics.checkNotNullExpressionValue(listZzm2, "getAppBackgroundTimestampsMsList(...)");
                    Object objLast4 = CollectionsKt.last((List<? extends Object>) listZzm2);
                    Intrinsics.checkNotNullExpressionValue(objLast4, "last(...)");
                    long jLongValue3 = j - ((Number) objLast4).longValue();
                    zzgacVar5 = this.zzg;
                    if (zzgacVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgacVar5 = null;
                    }
                    zzgacVar5.zzh(zzgacVar5.zzg() + jLongValue3);
                }
                zzgacVar3 = this.zzg;
                if (zzgacVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                    zzgacVar3 = null;
                }
                zzgacVar3.zzp(j);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        if (zzz(r14, r0) == r1) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzw(kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgbo.zzw(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[Catch: all -> 0x0106, TRY_ENTER, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0098 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
    
        if (zzz(r15, r0) == r1) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzx(kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgbo.zzx(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzy(Continuation continuation) throws Throwable {
        zzgbf zzgbfVar;
        Mutex mutex;
        long j;
        if (continuation instanceof zzgbf) {
            zzgbfVar = (zzgbf) continuation;
            int i = zzgbfVar.zze;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzgbfVar.zze = i - Integer.MIN_VALUE;
            } else {
                zzgbfVar = new zzgbf(this, continuation);
            }
        } else {
            zzgbfVar = new zzgbf(this, continuation);
        }
        Object obj = zzgbfVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzgbfVar.zze;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.zzc;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgbfVar.zzb = mutex2;
            zzgbfVar.zza = jCurrentTimeMillis;
            zzgbfVar.zze = 1;
            if (mutex2.lock(null, zzgbfVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = zzgbfVar.zza;
            mutex = (Mutex) zzgbfVar.zzb;
            ResultKt.throwOnFailure(obj);
        }
        try {
            zzgac zzgacVar = this.zzg;
            if (zzgacVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzgacVar = null;
            }
            zzgacVar.zzs(j);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzz(String str, Continuation continuation) throws Throwable {
        zzgat zzgatVar;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        if (continuation instanceof zzgat) {
            zzgatVar = (zzgat) continuation;
            int i = zzgatVar.zze;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzgatVar.zze = i - Integer.MIN_VALUE;
            } else {
                zzgatVar = new zzgat(this, continuation);
            }
        } else {
            zzgatVar = new zzgat(this, continuation);
        }
        Object obj = zzgatVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzgatVar.zze;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.zze;
                zzgatVar.zza = str;
                zzgatVar.zzb = mutex;
                zzgatVar.zze = 1;
                if (mutex.lock(null, zzgatVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) zzgatVar.zza;
                try {
                    ResultKt.throwOnFailure(obj);
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) zzgatVar.zzb;
            String str2 = (String) zzgatVar.zza;
            ResultKt.throwOnFailure(obj);
            mutex = mutex3;
            str = str2;
            DataStore dataStore = this.zzi;
            zzgau zzgauVar = new zzgau(str, null);
            zzgatVar.zza = mutex;
            zzgatVar.zzb = null;
            zzgatVar.zze = 2;
            Object objUpdateData = dataStore.updateData(zzgauVar, zzgatVar);
            if (objUpdateData != coroutine_suspended) {
                Mutex mutex4 = mutex;
                obj = objUpdateData;
                mutex2 = mutex4;
                mutex2.unlock(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgae
    public final void zza() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzgbi(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgae
    public final void zzb(String gwsQueryId) {
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        zzgsc.zza(this.zza, this.zzb, new zzgbc(this, gwsQueryId, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgae
    public final void zzc() {
        zzgsc.zza(this.zza, this.zzb, new zzgay(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgae
    public final void zzd() {
        zzgsc.zza(this.zza, this.zzb, new zzgbm(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgae
    public final void zze() {
        zzgsc.zza(this.zza, this.zzb, new zzgbg(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgae
    public final void zzf() {
        zzgsc.zza(this.zza, this.zzb, new zzgbk(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgae
    public final void zzg() {
        zzgsc.zza(this.zza, this.zzb, new zzgbe(this, null));
    }
}
