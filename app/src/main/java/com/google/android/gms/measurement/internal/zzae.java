package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzae extends zzpg {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzae(zzpv zzpvVar) {
        super(zzpvVar);
    }

    private final zzy zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzf(int i, int i2) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zze.get(i2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0246  */
    /* JADX WARN: Code duplicated, block: B:106:0x0256  */
    /* JADX WARN: Code duplicated, block: B:108:0x0261  */
    /* JADX WARN: Code duplicated, block: B:112:0x028d A[Catch: SQLiteException -> 0x02c3, all -> 0x03ec, LOOP:11: B:112:0x028d->B:525:?, LOOP_START, TryCatch #8 {all -> 0x03ec, blocks: (B:110:0x0287, B:112:0x028d, B:114:0x029e, B:115:0x02a6, B:119:0x02be, B:128:0x02cb), top: B:449:0x027d }] */
    /* JADX WARN: Code duplicated, block: B:114:0x029e A[Catch: SQLiteException -> 0x02c3, all -> 0x03ec, TryCatch #8 {all -> 0x03ec, blocks: (B:110:0x0287, B:112:0x028d, B:114:0x029e, B:115:0x02a6, B:119:0x02be, B:128:0x02cb), top: B:449:0x027d }] */
    /* JADX WARN: Code duplicated, block: B:118:0x02ba A[PHI: r0 r6
  0x02ba: PHI (r0v72 java.util.Map) = (r0v57 java.util.Map), (r0v74 java.util.Map), (r0v51 java.util.Map) binds: [B:129:0x02e0, B:120:0x02c0, B:117:0x02b8] A[DONT_GENERATE, DONT_INLINE]
  0x02ba: PHI (r6v10 android.database.Cursor) = (r6v4 android.database.Cursor), (r6v11 android.database.Cursor), (r6v11 android.database.Cursor) binds: [B:129:0x02e0, B:120:0x02c0, B:117:0x02b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x02be A[Catch: SQLiteException -> 0x02c3, all -> 0x03ec, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x03ec, blocks: (B:110:0x0287, B:112:0x028d, B:114:0x029e, B:115:0x02a6, B:119:0x02be, B:128:0x02cb), top: B:449:0x027d }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:137:0x0306  */
    /* JADX WARN: Code duplicated, block: B:139:0x031d  */
    /* JADX WARN: Code duplicated, block: B:165:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:171:0x0401  */
    /* JADX WARN: Code duplicated, block: B:173:0x0421  */
    /* JADX WARN: Code duplicated, block: B:179:0x0436  */
    /* JADX WARN: Code duplicated, block: B:183:0x0452  */
    /* JADX WARN: Code duplicated, block: B:184:0x045b  */
    /* JADX WARN: Code duplicated, block: B:188:0x046b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0480  */
    /* JADX WARN: Code duplicated, block: B:201:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:204:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:206:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:208:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:209:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:214:0x050a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:242:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:248:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:254:0x0628  */
    /* JADX WARN: Code duplicated, block: B:261:0x0650  */
    /* JADX WARN: Code duplicated, block: B:263:0x065b  */
    /* JADX WARN: Code duplicated, block: B:270:0x067f  */
    /* JADX WARN: Code duplicated, block: B:272:0x0684 A[LOOP:3: B:255:0x062a->B:272:0x0684, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x068b  */
    /* JADX WARN: Code duplicated, block: B:278:0x0693  */
    /* JADX WARN: Code duplicated, block: B:298:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:302:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:304:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:308:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:314:0x071c  */
    /* JADX WARN: Code duplicated, block: B:316:0x0749 A[LOOP:5: B:312:0x0716->B:316:0x0749, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:320:0x0765  */
    /* JADX WARN: Code duplicated, block: B:324:0x077a  */
    /* JADX WARN: Code duplicated, block: B:327:0x0782  */
    /* JADX WARN: Code duplicated, block: B:330:0x0791  */
    /* JADX WARN: Code duplicated, block: B:332:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:336:0x07dd A[Catch: SQLiteException -> 0x0852, all -> 0x087b, LOOP:7: B:336:0x07dd->B:354:0x083d, LOOP_START, PHI: r4 r8
  0x07dd: PHI (r4v39 java.util.Iterator) = (r4v31 java.util.Iterator), (r4v43 java.util.Iterator) binds: [B:335:0x07db, B:354:0x083d] A[DONT_GENERATE, DONT_INLINE]
  0x07dd: PHI (r8v49 java.lang.String) = (r8v46 java.lang.String), (r8v51 java.lang.String) binds: [B:335:0x07db, B:354:0x083d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #14 {all -> 0x087b, blocks: (B:334:0x07d7, B:336:0x07dd, B:337:0x07e2, B:339:0x07f3, B:342:0x0805, B:344:0x0812, B:349:0x0830, B:370:0x0861, B:346:0x0819, B:348:0x0829, B:358:0x0848), top: B:454:0x07d7 }] */
    /* JADX WARN: Code duplicated, block: B:341:0x0803  */
    /* JADX WARN: Code duplicated, block: B:343:0x080e  */
    /* JADX WARN: Code duplicated, block: B:352:0x0838  */
    /* JADX WARN: Code duplicated, block: B:354:0x083d A[LOOP:7: B:336:0x07dd->B:354:0x083d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:357:0x0844  */
    /* JADX WARN: Code duplicated, block: B:360:0x084c A[PHI: r0 r13 r36
  0x084c: PHI (r0v120 java.util.Map) = (r0v122 java.util.Map), (r0v128 java.util.Map) binds: [B:371:0x0874, B:359:0x084a] A[DONT_GENERATE, DONT_INLINE]
  0x084c: PHI (r13v4 android.database.Cursor) = (r13v5 android.database.Cursor), (r13v6 android.database.Cursor) binds: [B:371:0x0874, B:359:0x084a] A[DONT_GENERATE, DONT_INLINE]
  0x084c: PHI (r36v4 java.util.Iterator) = (r36v5 java.util.Iterator), (r36v9 java.util.Iterator) binds: [B:371:0x0874, B:359:0x084a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:379:0x0883  */
    /* JADX WARN: Code duplicated, block: B:383:0x0893  */
    /* JADX WARN: Code duplicated, block: B:386:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:389:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:391:0x08de  */
    /* JADX WARN: Code duplicated, block: B:393:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:394:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:396:0x0923  */
    /* JADX WARN: Code duplicated, block: B:399:0x092d  */
    /* JADX WARN: Code duplicated, block: B:408:0x0978  */
    /* JADX WARN: Code duplicated, block: B:409:0x0981  */
    /* JADX WARN: Code duplicated, block: B:413:0x0994 A[PHI: r16 r37 r40
  0x0994: PHI (r16v8 java.lang.String) = (r16v9 java.lang.String), (r2v25 java.lang.String) binds: [B:412:0x0992, B:410:0x0982] A[DONT_GENERATE, DONT_INLINE]
  0x0994: PHI (r37v3 java.util.Map) = (r37v4 java.util.Map), (r37v5 java.util.Map) binds: [B:412:0x0992, B:410:0x0982] A[DONT_GENERATE, DONT_INLINE]
  0x0994: PHI (r40v3 androidx.collection.ArrayMap) = (r40v4 androidx.collection.ArrayMap), (r3v31 androidx.collection.ArrayMap) binds: [B:412:0x0992, B:410:0x0982] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:419:0x09bf  */
    /* JADX WARN: Code duplicated, block: B:432:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:492:0x05c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x05dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x05b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x05b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x067d A[EDGE_INSN: B:498:0x067d->B:269:0x067d BREAK  A[LOOP:3: B:255:0x062a->B:272:0x0684], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x070b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x06fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x075d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0757 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0836 A[EDGE_INSN: B:510:0x0836->B:351:0x0836 BREAK  A[LOOP:7: B:336:0x07dd->B:354:0x083d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x08a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x0999 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x098c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x0964 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x0a19 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x09b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x056c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x0430 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x048c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x047a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x03d9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x0207 A[EDGE_INSN: B:566:0x0207->B:81:0x0207 BREAK  A[LOOP:20: B:68:0x01bb->B:84:0x020e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a6 A[Catch: SQLiteException -> 0x021b, all -> 0x0a4d, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x021b, blocks: (B:61:0x01a0, B:63:0x01a6, B:67:0x01b6, B:68:0x01bb, B:69:0x01c5, B:70:0x01d5, B:72:0x01e4), top: B:450:0x01a0 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b6 A[Catch: SQLiteException -> 0x021b, all -> 0x0a4d, TRY_ENTER, TryCatch #10 {SQLiteException -> 0x021b, blocks: (B:61:0x01a0, B:63:0x01a6, B:67:0x01b6, B:68:0x01bb, B:69:0x01c5, B:70:0x01d5, B:72:0x01e4), top: B:450:0x01a0 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0209  */
    /* JADX WARN: Code duplicated, block: B:84:0x020e A[LOOP:20: B:68:0x01bb->B:84:0x020e, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v42, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    final List zza(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        int i;
        int i2;
        boolean z2;
        Map map;
        Cursor cursor;
        boolean z3;
        String str2;
        Cursor cursorQuery;
        Map map2;
        HashSet hashSet;
        HashSet<Integer> hashSet2;
        Map map3;
        com.google.android.gms.internal.measurement.zzic zzicVar;
        BitSet bitSet;
        BitSet bitSet2;
        ArrayMap arrayMap;
        com.google.android.gms.internal.measurement.zzic zzicVar2;
        List list3;
        int i3;
        boolean z4;
        Iterator it;
        com.google.android.gms.internal.measurement.zzie zzieVar;
        Long lValueOf;
        String str3;
        Map arrayMap2;
        SQLiteDatabase sQLiteDatabaseZzj;
        ?? r5;
        Cursor cursorRawQuery;
        ArrayMap arrayMap3;
        Iterator it2;
        Integer num;
        com.google.android.gms.internal.measurement.zzic zzicVar3;
        List list4;
        Map map4;
        HashSet hashSet3;
        Iterator it3;
        Integer numValueOf;
        List arrayList;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList2;
        zzaw zzawVarZzj;
        String str7;
        ContentValues contentValues;
        ArrayMap arrayMap4;
        Iterator it4;
        String strZzg;
        Map map5;
        Iterator it5;
        Iterator it6;
        boolean zZzd;
        Map map6;
        com.google.android.gms.internal.measurement.zzfr zzfrVar;
        zzio zzioVar;
        Integer numValueOf2;
        zzac zzacVar;
        Integer numValueOf3;
        zzaw zzawVarZzj2;
        String str8;
        ArrayMap arrayMap5;
        Cursor cursor2;
        String str9;
        Cursor cursorQuery2;
        Integer numValueOf4;
        List list5;
        List arrayList3;
        zzz zzzVar;
        ArrayMap arrayMap6;
        Iterator it7;
        com.google.android.gms.internal.measurement.zzhm zzhmVar;
        com.google.android.gms.internal.measurement.zzhm zzhmVarZza;
        zzpv zzpvVar;
        zzbd zzbdVarZzr;
        long j;
        String strZzh;
        Map map7;
        zzbd zzbdVar;
        Iterator it8;
        Integer num2;
        int iIntValue;
        Iterator it9;
        boolean zZzd2;
        Map map8;
        Iterator it10;
        long j2;
        zzaa zzaaVar;
        zzaw zzawVarZzj3;
        String str10;
        ArrayMap arrayMap7;
        String str11;
        Cursor cursor3;
        Cursor cursorQuery3;
        Cursor cursor4;
        Integer numValueOf5;
        List list6;
        List arrayList4;
        ArrayMap arrayMap8;
        int i4;
        Cursor cursorQuery4;
        List arrayList5;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l;
        this.zze = l2;
        Iterator it11 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it11.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhm) it11.next()).zzh())) {
                z2 = true;
                break;
            }
        }
        com.google.android.gms.internal.measurement.zzpq.zzb();
        zzio zzioVar2 = this.zzu;
        zzam zzamVarZzf = zzioVar2.zzf();
        String str12 = this.zza;
        zzgg zzggVar = zzgi.zzaE;
        boolean zZzx = zzamVarZzf.zzx(str12, zzggVar);
        com.google.android.gms.internal.measurement.zzpq.zzb();
        boolean zZzx2 = zzioVar2.zzf().zzx(this.zza, zzgi.zzaD);
        ?? r6 = zzggVar;
        if (z2) {
            zzaw zzawVarZzj4 = this.zzg.zzj();
            String str13 = this.zza;
            zzawVarZzj4.zzav();
            zzawVarZzj4.zzg();
            Preconditions.checkNotEmpty(str13);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                SQLiteDatabase sQLiteDatabaseZzj2 = zzawVarZzj4.zzj();
                sQLiteDatabaseZzj2.update("events", contentValues2, "app_id = ?", new String[]{str13});
                r6 = sQLiteDatabaseZzj2;
            } catch (SQLiteException e) {
                zzawVarZzj4.zzu.zzaW().zze().zzc("Error resetting session-scoped event counts. appId", zzhe.zzn(str13), e);
                r6 = "Error resetting session-scoped event counts. appId";
            }
        }
        Map map9 = Collections.EMPTY_MAP;
        String str14 = "data";
        String str15 = "audience_id";
        if (zZzx2 && zZzx) {
            zzaw zzawVarZzj5 = this.zzg.zzj();
            String str16 = this.zza;
            Preconditions.checkNotEmpty(str16);
            ArrayMap arrayMap9 = new ArrayMap();
            try {
                try {
                    cursorQuery4 = zzawVarZzj5.zzj().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str16}, null, null, null);
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzfj zzfjVar = (com.google.android.gms.internal.measurement.zzfj) ((com.google.android.gms.internal.measurement.zzfi) zzqa.zzp(com.google.android.gms.internal.measurement.zzfj.zzc(), cursorQuery4.getBlob(i2))).zzba();
                                    if (zzfjVar.zzo()) {
                                        Integer numValueOf6 = Integer.valueOf(cursorQuery4.getInt(i));
                                        List list7 = (List) arrayMap9.get(numValueOf6);
                                        if (list7 == null) {
                                            arrayList5 = new ArrayList();
                                            arrayMap9.put(numValueOf6, arrayList5);
                                        } else {
                                            arrayList5 = list7;
                                        }
                                        arrayList5.add(zzfjVar);
                                    }
                                } catch (IOException e2) {
                                    zzawVarZzj5.zzu.zzaW().zze().zzc("Failed to merge filter. appId", zzhe.zzn(str16), e2);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i = 0;
                                i2 = 1;
                            }
                            if (cursorQuery4 != null) {
                                cursorQuery4.close();
                            }
                            map = arrayMap9;
                        } else {
                            map9 = Collections.EMPTY_MAP;
                            if (cursorQuery4 != null) {
                                cursorQuery4.close();
                            }
                            map = map9;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        zzawVarZzj5.zzu.zzaW().zze().zzc("Database error querying filters. appId", zzhe.zzn(str16), e);
                        map9 = Collections.EMPTY_MAP;
                        if (cursorQuery4 != null) {
                        }
                        map = map9;
                        zzaw zzawVarZzj6 = this.zzg.zzj();
                        String str17 = this.zza;
                        zzawVarZzj6.zzav();
                        zzawVarZzj6.zzg();
                        Preconditions.checkNotEmpty(str17);
                        cursorQuery = zzawVarZzj6.zzj().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str17}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    arrayMap8 = new ArrayMap();
                                    while (true) {
                                        i4 = cursorQuery.getInt(0);
                                        try {
                                            arrayMap8.put(Integer.valueOf(i4), (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzib) zzqa.zzp(com.google.android.gms.internal.measurement.zzic.zze(), cursorQuery.getBlob(1))).zzba());
                                            z3 = z2;
                                            str2 = str14;
                                        } catch (IOException e4) {
                                            z3 = z2;
                                            str2 = str14;
                                            try {
                                                zzawVarZzj6.zzu.zzaW().zze().zzd("Failed to merge filter results. appId, audienceId, error", zzhe.zzn(str17), Integer.valueOf(i4), e4);
                                            } catch (SQLiteException e5) {
                                                e = e5;
                                                str15 = str15;
                                                zzawVarZzj6.zzu.zzaW().zze().zzc("Database error querying filter results. appId", zzhe.zzn(str17), e);
                                                Map map10 = Collections.EMPTY_MAP;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = map10;
                                                if (!map2.isEmpty()) {
                                                    hashSet = new HashSet(map2.keySet());
                                                    if (z3) {
                                                        String str18 = this.zza;
                                                        zzaw zzawVarZzj7 = this.zzg.zzj();
                                                        str3 = this.zza;
                                                        zzawVarZzj7.zzav();
                                                        zzawVarZzj7.zzg();
                                                        Preconditions.checkNotEmpty(str3);
                                                        arrayMap2 = new ArrayMap();
                                                        sQLiteDatabaseZzj = zzawVarZzj7.zzj();
                                                        try {
                                                            try {
                                                                cursorRawQuery = sQLiteDatabaseZzj.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) arrayMap2.get(numValueOf);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                arrayMap2.put(numValueOf, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                        if (cursorRawQuery != null) {
                                                                            cursorRawQuery.close();
                                                                        }
                                                                    } else {
                                                                        arrayMap2 = Collections.EMPTY_MAP;
                                                                        if (cursorRawQuery != null) {
                                                                            cursorRawQuery.close();
                                                                        }
                                                                    }
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    zzawVarZzj7.zzu.zzaW().zze().zzc("Database error querying scoped filters. appId", zzhe.zzn(str3), e);
                                                                    arrayMap2 = Collections.EMPTY_MAP;
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    Preconditions.checkNotEmpty(str18);
                                                                    Preconditions.checkNotNull(map2);
                                                                    arrayMap3 = new ArrayMap();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.intValue();
                                                                            zzicVar3 = (com.google.android.gms.internal.measurement.zzic) map2.get(num);
                                                                            list4 = (List) arrayMap2.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            map4 = arrayMap2;
                                                                            hashSet3 = hashSet;
                                                                            it3 = it2;
                                                                            arrayMap3.put(num, zzicVar3);
                                                                            arrayMap2 = map4;
                                                                            hashSet = hashSet3;
                                                                            it2 = it3;
                                                                        }
                                                                    }
                                                                    hashSet2 = hashSet;
                                                                    map3 = arrayMap3;
                                                                    for (Integer num3 : hashSet2) {
                                                                        num3.intValue();
                                                                        zzicVar = (com.google.android.gms.internal.measurement.zzic) map3.get(num3);
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        arrayMap = new ArrayMap();
                                                                        if (zzicVar != null) {
                                                                            for (com.google.android.gms.internal.measurement.zzhk zzhkVar : zzicVar.zzh()) {
                                                                                if (zzhkVar.zzh()) {
                                                                                    Map map11 = map3;
                                                                                    Integer numValueOf7 = Integer.valueOf(zzhkVar.zza());
                                                                                    if (zzhkVar.zzg()) {
                                                                                        lValueOf = Long.valueOf(zzhkVar.zzb());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    arrayMap.put(numValueOf7, lValueOf);
                                                                                    map3 = map11;
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map12 = map3;
                                                                        ArrayMap arrayMap10 = new ArrayMap();
                                                                        if (zzicVar != null) {
                                                                            it = zzicVar.zzj().iterator();
                                                                            while (it.hasNext()) {
                                                                                zzieVar = (com.google.android.gms.internal.measurement.zzie) it.next();
                                                                                if (!zzieVar.zzi()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        zzicVar2 = zzicVar;
                                                                        if (zzicVar2 != null) {
                                                                            i3 = 0;
                                                                            while (i3 < zzicVar2.zzd() * 64) {
                                                                                if (zzqa.zzy(zzicVar2.zzk(), i3)) {
                                                                                    z4 = zZzx;
                                                                                    this.zzu.zzaW().zzj().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i3));
                                                                                    bitSet2.set(i3);
                                                                                    if (zzqa.zzy(zzicVar2.zzi(), i3)) {
                                                                                        bitSet.set(i3);
                                                                                    }
                                                                                    i3++;
                                                                                    zZzx = z4;
                                                                                } else {
                                                                                    z4 = zZzx;
                                                                                }
                                                                                arrayMap.remove(Integer.valueOf(i3));
                                                                                i3++;
                                                                                zZzx = z4;
                                                                            }
                                                                        }
                                                                        boolean z5 = zZzx;
                                                                        com.google.android.gms.internal.measurement.zzic zzicVar4 = (com.google.android.gms.internal.measurement.zzic) map2.get(num3);
                                                                        if (!zZzx2) {
                                                                        }
                                                                        this.zzc.put(num3, new zzy(this, this.zza, zzicVar4, bitSet, bitSet2, arrayMap, arrayMap10, null));
                                                                        str2 = str2;
                                                                        map = map;
                                                                        str15 = str15;
                                                                        map2 = map2;
                                                                        zZzx = z5;
                                                                        map3 = map12;
                                                                    }
                                                                    str4 = str2;
                                                                    str5 = str15;
                                                                    str6 = "Skipping failed audience ID";
                                                                    if (!list.isEmpty()) {
                                                                        zzzVar = new zzz(this, null);
                                                                        arrayMap6 = new ArrayMap();
                                                                        it7 = list.iterator();
                                                                        while (it7.hasNext()) {
                                                                            zzhmVar = (com.google.android.gms.internal.measurement.zzhm) it7.next();
                                                                            zzhmVarZza = zzzVar.zza(this.zza, zzhmVar);
                                                                            if (zzhmVarZza != null) {
                                                                                zzpvVar = this.zzg;
                                                                                zzbdVarZzr = zzpvVar.zzj().zzr(this.zza, zzhmVar, zzhmVarZza.zzh());
                                                                                zzpvVar.zzj().zzV(zzbdVarZzr);
                                                                                if (z) {
                                                                                    continue;
                                                                                } else {
                                                                                    j = zzbdVarZzr.zzc;
                                                                                    strZzh = zzhmVarZza.zzh();
                                                                                    map7 = (Map) arrayMap6.get(strZzh);
                                                                                    if (map7 == null) {
                                                                                        zzawVarZzj3 = zzpvVar.zzj();
                                                                                        str10 = this.zza;
                                                                                        zzawVarZzj3.zzav();
                                                                                        zzawVarZzj3.zzg();
                                                                                        Preconditions.checkNotEmpty(str10);
                                                                                        Preconditions.checkNotEmpty(strZzh);
                                                                                        arrayMap7 = new ArrayMap();
                                                                                        try {
                                                                                            try {
                                                                                                str11 = str10;
                                                                                                try {
                                                                                                    cursorQuery3 = zzawVarZzj3.zzj().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strZzh}, null, null, null);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (cursorQuery3.moveToFirst()) {
                                                                                                                zzbdVar = zzbdVarZzr;
                                                                                                                while (true) {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            com.google.android.gms.internal.measurement.zzfj zzfjVar2 = (com.google.android.gms.internal.measurement.zzfj) ((com.google.android.gms.internal.measurement.zzfi) zzqa.zzp(com.google.android.gms.internal.measurement.zzfj.zzc(), cursorQuery3.getBlob(1))).zzba();
                                                                                                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                                            list6 = (List) arrayMap7.get(numValueOf5);
                                                                                                                            if (list6 == null) {
                                                                                                                                cursor4 = cursorQuery3;
                                                                                                                                try {
                                                                                                                                    arrayList4 = new ArrayList();
                                                                                                                                    arrayMap7.put(numValueOf5, arrayList4);
                                                                                                                                } catch (SQLiteException e7) {
                                                                                                                                    e = e7;
                                                                                                                                    cursor3 = cursor4;
                                                                                                                                    try {
                                                                                                                                        zzawVarZzj3.zzu.zzaW().zze().zzc("Database error querying filters. appId", zzhe.zzn(str11), e);
                                                                                                                                        map7 = Collections.EMPTY_MAP;
                                                                                                                                        if (cursor3 != null) {
                                                                                                                                            cursor3.close();
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th) {
                                                                                                                                        th = th;
                                                                                                                                        if (cursor3 != null) {
                                                                                                                                            cursor3.close();
                                                                                                                                        }
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th2) {
                                                                                                                                    th = th2;
                                                                                                                                    cursor3 = cursor4;
                                                                                                                                    if (cursor3 != null) {
                                                                                                                                        cursor3.close();
                                                                                                                                    }
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                cursor4 = cursorQuery3;
                                                                                                                                arrayList4 = list6;
                                                                                                                            }
                                                                                                                            arrayList4.add(zzfjVar2);
                                                                                                                        } catch (IOException e8) {
                                                                                                                            cursor4 = cursorQuery3;
                                                                                                                            zzawVarZzj3.zzu.zzaW().zze().zzc("Failed to merge filter. appId", zzhe.zzn(str11), e8);
                                                                                                                        }
                                                                                                                        if (!cursor4.moveToNext()) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        cursorQuery3 = cursor4;
                                                                                                                    } catch (SQLiteException e9) {
                                                                                                                        e = e9;
                                                                                                                        cursor4 = cursorQuery3;
                                                                                                                    }
                                                                                                                }
                                                                                                                if (cursor4 != null) {
                                                                                                                    cursor4.close();
                                                                                                                }
                                                                                                                map7 = arrayMap7;
                                                                                                            } else {
                                                                                                                zzbdVar = zzbdVarZzr;
                                                                                                                map7 = Collections.EMPTY_MAP;
                                                                                                                if (cursorQuery3 != null) {
                                                                                                                    cursorQuery3.close();
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (SQLiteException e10) {
                                                                                                            e = e10;
                                                                                                            cursor4 = cursorQuery3;
                                                                                                            zzbdVar = zzbdVarZzr;
                                                                                                        }
                                                                                                        arrayMap6.put(strZzh, map7);
                                                                                                    } catch (Throwable th3) {
                                                                                                        th = th3;
                                                                                                        cursor4 = cursorQuery3;
                                                                                                    }
                                                                                                } catch (SQLiteException e11) {
                                                                                                    e = e11;
                                                                                                    zzbdVar = zzbdVarZzr;
                                                                                                    cursor3 = null;
                                                                                                    zzawVarZzj3.zzu.zzaW().zze().zzc("Database error querying filters. appId", zzhe.zzn(str11), e);
                                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                                    if (cursor3 != null) {
                                                                                                        cursor3.close();
                                                                                                    }
                                                                                                    arrayMap6.put(strZzh, map7);
                                                                                                    it8 = map7.keySet().iterator();
                                                                                                    while (it8.hasNext()) {
                                                                                                        num2 = (Integer) it8.next();
                                                                                                        iIntValue = num2.intValue();
                                                                                                        if (this.zzb.contains(num2)) {
                                                                                                            this.zzu.zzaW().zzj().zzb("Skipping failed audience ID", num2);
                                                                                                        } else {
                                                                                                            it9 = ((List) map7.get(num2)).iterator();
                                                                                                            zZzd2 = true;
                                                                                                            while (true) {
                                                                                                                if (!it9.hasNext()) {
                                                                                                                    map8 = map7;
                                                                                                                    it10 = it8;
                                                                                                                    j2 = j;
                                                                                                                    break;
                                                                                                                }
                                                                                                                com.google.android.gms.internal.measurement.zzfj zzfjVar3 = (com.google.android.gms.internal.measurement.zzfj) it9.next();
                                                                                                                map8 = map7;
                                                                                                                it10 = it8;
                                                                                                                zzaaVar = new zzaa(this, this.zza, iIntValue, zzfjVar3);
                                                                                                                j2 = j;
                                                                                                                zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhmVarZza, j2, zzbdVar, zzf(iIntValue, zzfjVar3.zzb()));
                                                                                                                if (!zZzd2) {
                                                                                                                    this.zzb.add(num2);
                                                                                                                    break;
                                                                                                                }
                                                                                                                zzd(num2).zzc(zzaaVar);
                                                                                                                j = j2;
                                                                                                                map7 = map8;
                                                                                                                it8 = it10;
                                                                                                            }
                                                                                                            if (!zZzd2) {
                                                                                                                this.zzb.add(num2);
                                                                                                            }
                                                                                                            j = j2;
                                                                                                            map7 = map8;
                                                                                                            it8 = it10;
                                                                                                        }
                                                                                                    }
                                                                                                    it7 = it7;
                                                                                                    zzzVar = zzzVar;
                                                                                                }
                                                                                            } catch (Throwable th4) {
                                                                                                th = th4;
                                                                                                cursor3 = null;
                                                                                            }
                                                                                        } catch (SQLiteException e12) {
                                                                                            e = e12;
                                                                                            str11 = str10;
                                                                                        }
                                                                                    } else {
                                                                                        zzbdVar = zzbdVarZzr;
                                                                                    }
                                                                                    it8 = map7.keySet().iterator();
                                                                                    while (it8.hasNext()) {
                                                                                        num2 = (Integer) it8.next();
                                                                                        iIntValue = num2.intValue();
                                                                                        if (this.zzb.contains(num2)) {
                                                                                            this.zzu.zzaW().zzj().zzb("Skipping failed audience ID", num2);
                                                                                        } else {
                                                                                            it9 = ((List) map7.get(num2)).iterator();
                                                                                            zZzd2 = true;
                                                                                            while (true) {
                                                                                                if (!it9.hasNext()) {
                                                                                                    map8 = map7;
                                                                                                    it10 = it8;
                                                                                                    j2 = j;
                                                                                                    break;
                                                                                                }
                                                                                                com.google.android.gms.internal.measurement.zzfj zzfjVar4 = (com.google.android.gms.internal.measurement.zzfj) it9.next();
                                                                                                map8 = map7;
                                                                                                it10 = it8;
                                                                                                zzaaVar = new zzaa(this, this.zza, iIntValue, zzfjVar4);
                                                                                                j2 = j;
                                                                                                zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhmVarZza, j2, zzbdVar, zzf(iIntValue, zzfjVar4.zzb()));
                                                                                                if (!zZzd2) {
                                                                                                    this.zzb.add(num2);
                                                                                                    break;
                                                                                                }
                                                                                                zzd(num2).zzc(zzaaVar);
                                                                                                j = j2;
                                                                                                map7 = map8;
                                                                                                it8 = it10;
                                                                                            }
                                                                                            if (!zZzd2) {
                                                                                                this.zzb.add(num2);
                                                                                            }
                                                                                            j = j2;
                                                                                            map7 = map8;
                                                                                            it8 = it10;
                                                                                        }
                                                                                    }
                                                                                    it7 = it7;
                                                                                    zzzVar = zzzVar;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        arrayMap4 = new ArrayMap();
                                                                        it4 = list2.iterator();
                                                                        while (it4.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.zzio zzioVar3 = (com.google.android.gms.internal.measurement.zzio) it4.next();
                                                                            strZzg = zzioVar3.zzg();
                                                                            map5 = (Map) arrayMap4.get(strZzg);
                                                                            if (map5 == null) {
                                                                                zzawVarZzj2 = this.zzg.zzj();
                                                                                str8 = this.zza;
                                                                                zzawVarZzj2.zzav();
                                                                                zzawVarZzj2.zzg();
                                                                                Preconditions.checkNotEmpty(str8);
                                                                                Preconditions.checkNotEmpty(strZzg);
                                                                                arrayMap5 = new ArrayMap();
                                                                                try {
                                                                                    cursorQuery2 = zzawVarZzj2.zzj().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strZzg}, null, null, null);
                                                                                    try {
                                                                                        try {
                                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        com.google.android.gms.internal.measurement.zzfr zzfrVar2 = (com.google.android.gms.internal.measurement.zzfr) ((com.google.android.gms.internal.measurement.zzfq) zzqa.zzp(com.google.android.gms.internal.measurement.zzfr.zzc(), cursorQuery2.getBlob(1))).zzba();
                                                                                                        numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                        list5 = (List) arrayMap5.get(numValueOf4);
                                                                                                        if (list5 == null) {
                                                                                                            it5 = it4;
                                                                                                            try {
                                                                                                                arrayList3 = new ArrayList();
                                                                                                                arrayMap5.put(numValueOf4, arrayList3);
                                                                                                            } catch (SQLiteException e13) {
                                                                                                                e = e13;
                                                                                                                str9 = str8;
                                                                                                                zzawVarZzj2.zzu.zzaW().zze().zzc("Database error querying filters. appId", zzhe.zzn(str9), e);
                                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                                if (cursorQuery2 != null) {
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                                arrayMap4.put(strZzg, map5);
                                                                                                                for (Integer num4 : map5.keySet()) {
                                                                                                                    int iIntValue2 = num4.intValue();
                                                                                                                    if (this.zzb.contains(num4)) {
                                                                                                                        this.zzu.zzaW().zzj().zzb(str6, num4);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    it6 = ((List) map5.get(num4)).iterator();
                                                                                                                    zZzd = true;
                                                                                                                    while (true) {
                                                                                                                        if (it6.hasNext()) {
                                                                                                                            zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it6.next();
                                                                                                                            zzioVar = this.zzu;
                                                                                                                            map6 = map5;
                                                                                                                            if (Log.isLoggable(zzioVar.zzaW().zzr(), 2)) {
                                                                                                                                zzhc zzhcVarZzj = zzioVar.zzaW().zzj();
                                                                                                                                if (zzfrVar.zzj()) {
                                                                                                                                    numValueOf3 = Integer.valueOf(zzfrVar.zza());
                                                                                                                                } else {
                                                                                                                                    numValueOf3 = null;
                                                                                                                                }
                                                                                                                                zzhcVarZzj.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzioVar.zzj().zzf(zzfrVar.zze()));
                                                                                                                                zzioVar.zzaW().zzj().zzb("Filter definition", this.zzg.zzA().zzs(zzfrVar));
                                                                                                                            }
                                                                                                                            if (zzfrVar.zzj()) {
                                                                                                                            }
                                                                                                                            zzhc zzhcVarZzk = zzioVar.zzaW().zzk();
                                                                                                                            Object objZzn = zzhe.zzn(this.zza);
                                                                                                                            if (zzfrVar.zzj()) {
                                                                                                                                numValueOf2 = Integer.valueOf(zzfrVar.zza());
                                                                                                                            } else {
                                                                                                                                numValueOf2 = null;
                                                                                                                            }
                                                                                                                            zzhcVarZzk.zzc("Invalid property filter ID. appId, id", objZzn, String.valueOf(numValueOf2));
                                                                                                                            this.zzb.add(num4);
                                                                                                                            map5 = map6;
                                                                                                                            arrayMap4 = arrayMap4;
                                                                                                                            str6 = str6;
                                                                                                                        } else {
                                                                                                                            map6 = map5;
                                                                                                                            str6 = str6;
                                                                                                                            arrayMap4 = arrayMap4;
                                                                                                                        }
                                                                                                                        if (!zZzd) {
                                                                                                                            this.zzb.add(num4);
                                                                                                                        }
                                                                                                                        map5 = map6;
                                                                                                                        arrayMap4 = arrayMap4;
                                                                                                                        str6 = str6;
                                                                                                                        zzd(num4).zzc(zzacVar);
                                                                                                                        map5 = map6;
                                                                                                                        arrayMap4 = arrayMap4;
                                                                                                                        str6 = str6;
                                                                                                                    }
                                                                                                                }
                                                                                                                it4 = it5;
                                                                                                            }
                                                                                                        } else {
                                                                                                            it5 = it4;
                                                                                                            arrayList3 = list5;
                                                                                                        }
                                                                                                        arrayList3.add(zzfrVar2);
                                                                                                        str9 = str8;
                                                                                                    } catch (IOException e14) {
                                                                                                        it5 = it4;
                                                                                                        str9 = str8;
                                                                                                        zzawVarZzj2.zzu.zzaW().zze().zzc("Failed to merge filter", zzhe.zzn(str9), e14);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        it4 = it5;
                                                                                                        str8 = str9;
                                                                                                    } catch (SQLiteException e15) {
                                                                                                        e = e15;
                                                                                                        zzawVarZzj2.zzu.zzaW().zze().zzc("Database error querying filters. appId", zzhe.zzn(str9), e);
                                                                                                        map5 = Collections.EMPTY_MAP;
                                                                                                        if (cursorQuery2 != null) {
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (cursorQuery2 != null) {
                                                                                                    cursorQuery2.close();
                                                                                                }
                                                                                                map5 = arrayMap5;
                                                                                            } else {
                                                                                                it5 = it4;
                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                if (cursorQuery2 != null) {
                                                                                                    cursorQuery2.close();
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th5) {
                                                                                            th = th5;
                                                                                            cursor2 = cursorQuery2;
                                                                                            if (cursor2 != null) {
                                                                                                cursor2.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteException e16) {
                                                                                        e = e16;
                                                                                        it5 = it4;
                                                                                    }
                                                                                } catch (SQLiteException e17) {
                                                                                    e = e17;
                                                                                    it5 = it4;
                                                                                    str9 = str8;
                                                                                    cursorQuery2 = null;
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                    cursor2 = null;
                                                                                }
                                                                                arrayMap4.put(strZzg, map5);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            while (r4.hasNext()) {
                                                                                int iIntValue3 = num4.intValue();
                                                                                if (this.zzb.contains(num4)) {
                                                                                    this.zzu.zzaW().zzj().zzb(str6, num4);
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it6 = ((List) map5.get(num4)).iterator();
                                                                                zZzd = true;
                                                                                while (true) {
                                                                                    if (it6.hasNext()) {
                                                                                        zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it6.next();
                                                                                        zzioVar = this.zzu;
                                                                                        map6 = map5;
                                                                                        if (Log.isLoggable(zzioVar.zzaW().zzr(), 2)) {
                                                                                            zzhc zzhcVarZzj2 = zzioVar.zzaW().zzj();
                                                                                            if (zzfrVar.zzj()) {
                                                                                                numValueOf3 = Integer.valueOf(zzfrVar.zza());
                                                                                            } else {
                                                                                                numValueOf3 = null;
                                                                                            }
                                                                                            zzhcVarZzj2.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzioVar.zzj().zzf(zzfrVar.zze()));
                                                                                            zzioVar.zzaW().zzj().zzb("Filter definition", this.zzg.zzA().zzs(zzfrVar));
                                                                                        }
                                                                                        if (zzfrVar.zzj()) {
                                                                                        }
                                                                                        zzhc zzhcVarZzk2 = zzioVar.zzaW().zzk();
                                                                                        Object objZzn2 = zzhe.zzn(this.zza);
                                                                                        if (zzfrVar.zzj()) {
                                                                                            numValueOf2 = Integer.valueOf(zzfrVar.zza());
                                                                                        } else {
                                                                                            numValueOf2 = null;
                                                                                        }
                                                                                        zzhcVarZzk2.zzc("Invalid property filter ID. appId, id", objZzn2, String.valueOf(numValueOf2));
                                                                                        this.zzb.add(num4);
                                                                                        map5 = map6;
                                                                                        arrayMap4 = arrayMap4;
                                                                                        str6 = str6;
                                                                                    } else {
                                                                                        map6 = map5;
                                                                                        str6 = str6;
                                                                                        arrayMap4 = arrayMap4;
                                                                                    }
                                                                                    if (!zZzd) {
                                                                                        this.zzb.add(num4);
                                                                                    }
                                                                                    map5 = map6;
                                                                                    arrayMap4 = arrayMap4;
                                                                                    str6 = str6;
                                                                                    zzd(num4).zzc(zzacVar);
                                                                                    map5 = map6;
                                                                                    arrayMap4 = arrayMap4;
                                                                                    str6 = str6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    Set<Integer> setKeySet = this.zzc.keySet();
                                                                    setKeySet.removeAll(this.zzb);
                                                                    for (Integer num5 : setKeySet) {
                                                                        int iIntValue4 = num5.intValue();
                                                                        zzy zzyVar = (zzy) this.zzc.get(num5);
                                                                        Preconditions.checkNotNull(zzyVar);
                                                                        com.google.android.gms.internal.measurement.zzhi zzhiVarZza = zzyVar.zza(iIntValue4);
                                                                        arrayList2.add(zzhiVarZza);
                                                                        zzawVarZzj = this.zzg.zzj();
                                                                        str7 = this.zza;
                                                                        com.google.android.gms.internal.measurement.zzic zzicVarZzd = zzhiVarZza.zzd();
                                                                        zzawVarZzj.zzav();
                                                                        zzawVarZzj.zzg();
                                                                        Preconditions.checkNotEmpty(str7);
                                                                        Preconditions.checkNotNull(zzicVarZzd);
                                                                        byte[] bArrZzcd = zzicVarZzd.zzcd();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str7);
                                                                        contentValues.put(str5, num5);
                                                                        contentValues.put("current_results", bArrZzcd);
                                                                        try {
                                                                            try {
                                                                                if (zzawVarZzj.zzj().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    zzawVarZzj.zzu.zzaW().zze().zzb("Failed to insert filter results (got -1). appId", zzhe.zzn(str7));
                                                                                }
                                                                            } catch (SQLiteException e18) {
                                                                                e = e18;
                                                                                zzawVarZzj.zzu.zzaW().zze().zzc("Error storing filter results. appId", zzhe.zzn(str7), e);
                                                                            }
                                                                        } catch (SQLiteException e19) {
                                                                            e = e19;
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                                r5 = sQLiteDatabaseZzj;
                                                                if (r5 != 0) {
                                                                    r5.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e20) {
                                                            e = e20;
                                                            cursorRawQuery = null;
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            r5 = 0;
                                                            if (r5 != 0) {
                                                                r5.close();
                                                            }
                                                            throw th;
                                                        }
                                                        Preconditions.checkNotEmpty(str18);
                                                        Preconditions.checkNotNull(map2);
                                                        arrayMap3 = new ArrayMap();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.intValue();
                                                                zzicVar3 = (com.google.android.gms.internal.measurement.zzic) map2.get(num);
                                                                list4 = (List) arrayMap2.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                map4 = arrayMap2;
                                                                hashSet3 = hashSet;
                                                                it3 = it2;
                                                                arrayMap3.put(num, zzicVar3);
                                                                arrayMap2 = map4;
                                                                hashSet = hashSet3;
                                                                it2 = it3;
                                                            }
                                                        }
                                                        hashSet2 = hashSet;
                                                        map3 = arrayMap3;
                                                    } else {
                                                        hashSet2 = hashSet;
                                                        map3 = map2;
                                                    }
                                                    while (r16.hasNext()) {
                                                        num3.intValue();
                                                        zzicVar = (com.google.android.gms.internal.measurement.zzic) map3.get(num3);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        arrayMap = new ArrayMap();
                                                        if (zzicVar != null) {
                                                            while (r7.hasNext()) {
                                                                if (zzhkVar.zzh()) {
                                                                    Map map13 = map3;
                                                                    Integer numValueOf8 = Integer.valueOf(zzhkVar.zza());
                                                                    if (zzhkVar.zzg()) {
                                                                        lValueOf = Long.valueOf(zzhkVar.zzb());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    arrayMap.put(numValueOf8, lValueOf);
                                                                    map3 = map13;
                                                                }
                                                            }
                                                        }
                                                        Map map14 = map3;
                                                        ArrayMap arrayMap11 = new ArrayMap();
                                                        if (zzicVar != null) {
                                                            it = zzicVar.zzj().iterator();
                                                            while (it.hasNext()) {
                                                                zzieVar = (com.google.android.gms.internal.measurement.zzie) it.next();
                                                                if (!zzieVar.zzi()) {
                                                                }
                                                            }
                                                        }
                                                        zzicVar2 = zzicVar;
                                                        if (zzicVar2 != null) {
                                                            i3 = 0;
                                                            while (i3 < zzicVar2.zzd() * 64) {
                                                                if (zzqa.zzy(zzicVar2.zzk(), i3)) {
                                                                    z4 = zZzx;
                                                                    this.zzu.zzaW().zzj().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i3));
                                                                    bitSet2.set(i3);
                                                                    if (zzqa.zzy(zzicVar2.zzi(), i3)) {
                                                                        bitSet.set(i3);
                                                                    }
                                                                    i3++;
                                                                    zZzx = z4;
                                                                } else {
                                                                    z4 = zZzx;
                                                                }
                                                                arrayMap.remove(Integer.valueOf(i3));
                                                                i3++;
                                                                zZzx = z4;
                                                            }
                                                        }
                                                        boolean z6 = zZzx;
                                                        com.google.android.gms.internal.measurement.zzic zzicVar5 = (com.google.android.gms.internal.measurement.zzic) map2.get(num3);
                                                        if (!zZzx2) {
                                                        }
                                                        this.zzc.put(num3, new zzy(this, this.zza, zzicVar5, bitSet, bitSet2, arrayMap, arrayMap11, null));
                                                        str2 = str2;
                                                        map = map;
                                                        str15 = str15;
                                                        map2 = map2;
                                                        zZzx = z6;
                                                        map3 = map14;
                                                    }
                                                }
                                                str4 = str2;
                                                str5 = str15;
                                                str6 = "Skipping failed audience ID";
                                                if (!list.isEmpty()) {
                                                    zzzVar = new zzz(this, null);
                                                    arrayMap6 = new ArrayMap();
                                                    it7 = list.iterator();
                                                    while (it7.hasNext()) {
                                                        zzhmVar = (com.google.android.gms.internal.measurement.zzhm) it7.next();
                                                        zzhmVarZza = zzzVar.zza(this.zza, zzhmVar);
                                                        if (zzhmVarZza != null) {
                                                            zzpvVar = this.zzg;
                                                            zzbdVarZzr = zzpvVar.zzj().zzr(this.zza, zzhmVar, zzhmVarZza.zzh());
                                                            zzpvVar.zzj().zzV(zzbdVarZzr);
                                                            if (z) {
                                                                j = zzbdVarZzr.zzc;
                                                                strZzh = zzhmVarZza.zzh();
                                                                map7 = (Map) arrayMap6.get(strZzh);
                                                                if (map7 == null) {
                                                                    zzawVarZzj3 = zzpvVar.zzj();
                                                                    str10 = this.zza;
                                                                    zzawVarZzj3.zzav();
                                                                    zzawVarZzj3.zzg();
                                                                    Preconditions.checkNotEmpty(str10);
                                                                    Preconditions.checkNotEmpty(strZzh);
                                                                    arrayMap7 = new ArrayMap();
                                                                    str11 = str10;
                                                                    cursorQuery3 = zzawVarZzj3.zzj().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strZzh}, null, null, null);
                                                                    if (cursorQuery3.moveToFirst()) {
                                                                        zzbdVar = zzbdVarZzr;
                                                                        while (true) {
                                                                            com.google.android.gms.internal.measurement.zzfj zzfjVar5 = (com.google.android.gms.internal.measurement.zzfj) ((com.google.android.gms.internal.measurement.zzfi) zzqa.zzp(com.google.android.gms.internal.measurement.zzfj.zzc(), cursorQuery3.getBlob(1))).zzba();
                                                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                            list6 = (List) arrayMap7.get(numValueOf5);
                                                                            if (list6 == null) {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = new ArrayList();
                                                                                arrayMap7.put(numValueOf5, arrayList4);
                                                                            } else {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(zzfjVar5);
                                                                            if (!cursor4.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            cursorQuery3 = cursor4;
                                                                        }
                                                                        if (cursor4 != null) {
                                                                            cursor4.close();
                                                                        }
                                                                        map7 = arrayMap7;
                                                                    } else {
                                                                        zzbdVar = zzbdVarZzr;
                                                                        map7 = Collections.EMPTY_MAP;
                                                                        if (cursorQuery3 != null) {
                                                                            cursorQuery3.close();
                                                                        }
                                                                    }
                                                                    arrayMap6.put(strZzh, map7);
                                                                } else {
                                                                    zzbdVar = zzbdVarZzr;
                                                                }
                                                                it8 = map7.keySet().iterator();
                                                                while (it8.hasNext()) {
                                                                    num2 = (Integer) it8.next();
                                                                    iIntValue = num2.intValue();
                                                                    if (this.zzb.contains(num2)) {
                                                                        this.zzu.zzaW().zzj().zzb("Skipping failed audience ID", num2);
                                                                    } else {
                                                                        it9 = ((List) map7.get(num2)).iterator();
                                                                        zZzd2 = true;
                                                                        while (true) {
                                                                            if (!it9.hasNext()) {
                                                                                map8 = map7;
                                                                                it10 = it8;
                                                                                j2 = j;
                                                                                break;
                                                                            }
                                                                            com.google.android.gms.internal.measurement.zzfj zzfjVar6 = (com.google.android.gms.internal.measurement.zzfj) it9.next();
                                                                            map8 = map7;
                                                                            it10 = it8;
                                                                            zzaaVar = new zzaa(this, this.zza, iIntValue, zzfjVar6);
                                                                            j2 = j;
                                                                            zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhmVarZza, j2, zzbdVar, zzf(iIntValue, zzfjVar6.zzb()));
                                                                            if (!zZzd2) {
                                                                                this.zzb.add(num2);
                                                                                break;
                                                                            }
                                                                            zzd(num2).zzc(zzaaVar);
                                                                            j = j2;
                                                                            map7 = map8;
                                                                            it8 = it10;
                                                                        }
                                                                        if (!zZzd2) {
                                                                            this.zzb.add(num2);
                                                                        }
                                                                        j = j2;
                                                                        map7 = map8;
                                                                        it8 = it10;
                                                                    }
                                                                }
                                                                it7 = it7;
                                                                zzzVar = zzzVar;
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    arrayMap4 = new ArrayMap();
                                                    it4 = list2.iterator();
                                                    while (it4.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zzio zzioVar4 = (com.google.android.gms.internal.measurement.zzio) it4.next();
                                                        strZzg = zzioVar4.zzg();
                                                        map5 = (Map) arrayMap4.get(strZzg);
                                                        if (map5 == null) {
                                                            zzawVarZzj2 = this.zzg.zzj();
                                                            str8 = this.zza;
                                                            zzawVarZzj2.zzav();
                                                            zzawVarZzj2.zzg();
                                                            Preconditions.checkNotEmpty(str8);
                                                            Preconditions.checkNotEmpty(strZzg);
                                                            arrayMap5 = new ArrayMap();
                                                            cursorQuery2 = zzawVarZzj2.zzj().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strZzg}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                while (true) {
                                                                    com.google.android.gms.internal.measurement.zzfr zzfrVar3 = (com.google.android.gms.internal.measurement.zzfr) ((com.google.android.gms.internal.measurement.zzfq) zzqa.zzp(com.google.android.gms.internal.measurement.zzfr.zzc(), cursorQuery2.getBlob(1))).zzba();
                                                                    numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) arrayMap5.get(numValueOf4);
                                                                    if (list5 == null) {
                                                                        it5 = it4;
                                                                        arrayList3 = new ArrayList();
                                                                        arrayMap5.put(numValueOf4, arrayList3);
                                                                    } else {
                                                                        it5 = it4;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(zzfrVar3);
                                                                    str9 = str8;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it4 = it5;
                                                                    str8 = str9;
                                                                }
                                                                if (cursorQuery2 != null) {
                                                                    cursorQuery2.close();
                                                                }
                                                                map5 = arrayMap5;
                                                            } else {
                                                                it5 = it4;
                                                                map5 = Collections.EMPTY_MAP;
                                                                if (cursorQuery2 != null) {
                                                                    cursorQuery2.close();
                                                                }
                                                            }
                                                            arrayMap4.put(strZzg, map5);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        while (r4.hasNext()) {
                                                            int iIntValue5 = num4.intValue();
                                                            if (this.zzb.contains(num4)) {
                                                                this.zzu.zzaW().zzj().zzb(str6, num4);
                                                                break;
                                                                break;
                                                            }
                                                            it6 = ((List) map5.get(num4)).iterator();
                                                            zZzd = true;
                                                            while (true) {
                                                                if (it6.hasNext()) {
                                                                    zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it6.next();
                                                                    zzioVar = this.zzu;
                                                                    map6 = map5;
                                                                    if (Log.isLoggable(zzioVar.zzaW().zzr(), 2)) {
                                                                        zzhc zzhcVarZzj3 = zzioVar.zzaW().zzj();
                                                                        if (zzfrVar.zzj()) {
                                                                            numValueOf3 = Integer.valueOf(zzfrVar.zza());
                                                                        } else {
                                                                            numValueOf3 = null;
                                                                        }
                                                                        zzhcVarZzj3.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzioVar.zzj().zzf(zzfrVar.zze()));
                                                                        zzioVar.zzaW().zzj().zzb("Filter definition", this.zzg.zzA().zzs(zzfrVar));
                                                                    }
                                                                    if (zzfrVar.zzj()) {
                                                                    }
                                                                    zzhc zzhcVarZzk3 = zzioVar.zzaW().zzk();
                                                                    Object objZzn3 = zzhe.zzn(this.zza);
                                                                    if (zzfrVar.zzj()) {
                                                                        numValueOf2 = Integer.valueOf(zzfrVar.zza());
                                                                    } else {
                                                                        numValueOf2 = null;
                                                                    }
                                                                    zzhcVarZzk3.zzc("Invalid property filter ID. appId, id", objZzn3, String.valueOf(numValueOf2));
                                                                    this.zzb.add(num4);
                                                                    map5 = map6;
                                                                    arrayMap4 = arrayMap4;
                                                                    str6 = str6;
                                                                } else {
                                                                    map6 = map5;
                                                                    str6 = str6;
                                                                    arrayMap4 = arrayMap4;
                                                                }
                                                                if (!zZzd) {
                                                                    this.zzb.add(num4);
                                                                }
                                                                map5 = map6;
                                                                arrayMap4 = arrayMap4;
                                                                str6 = str6;
                                                                zzd(num4).zzc(zzacVar);
                                                                map5 = map6;
                                                                arrayMap4 = arrayMap4;
                                                                str6 = str6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                Set<Integer> setKeySet2 = this.zzc.keySet();
                                                setKeySet2.removeAll(this.zzb);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num5.intValue();
                                                    zzy zzyVar2 = (zzy) this.zzc.get(num5);
                                                    Preconditions.checkNotNull(zzyVar2);
                                                    com.google.android.gms.internal.measurement.zzhi zzhiVarZza2 = zzyVar2.zza(iIntValue6);
                                                    arrayList2.add(zzhiVarZza2);
                                                    zzawVarZzj = this.zzg.zzj();
                                                    str7 = this.zza;
                                                    com.google.android.gms.internal.measurement.zzic zzicVarZzd2 = zzhiVarZza2.zzd();
                                                    zzawVarZzj.zzav();
                                                    zzawVarZzj.zzg();
                                                    Preconditions.checkNotEmpty(str7);
                                                    Preconditions.checkNotNull(zzicVarZzd2);
                                                    byte[] bArrZzcd2 = zzicVarZzd2.zzcd();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str7);
                                                    contentValues.put(str5, num5);
                                                    contentValues.put("current_results", bArrZzcd2);
                                                    if (zzawVarZzj.zzj().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        zzawVarZzj.zzu.zzaW().zze().zzb("Failed to insert filter results (got -1). appId", zzhe.zzn(str7));
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            z2 = z3;
                                            str14 = str2;
                                            str15 = str15;
                                        } catch (SQLiteException e21) {
                                            e = e21;
                                            zzawVarZzj6.zzu.zzaW().zze().zzc("Database error querying filter results. appId", zzhe.zzn(str17), e);
                                            Map map15 = Collections.EMPTY_MAP;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = map15;
                                        }
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    map2 = arrayMap8;
                                } else {
                                    Map map16 = Collections.EMPTY_MAP;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    map2 = map16;
                                    z3 = z2;
                                    str2 = "data";
                                    str15 = "audience_id";
                                }
                            } catch (SQLiteException e22) {
                                e = e22;
                                z3 = z2;
                                str2 = "data";
                            }
                            if (!map2.isEmpty()) {
                                hashSet = new HashSet(map2.keySet());
                                if (z3) {
                                    String str19 = this.zza;
                                    zzaw zzawVarZzj8 = this.zzg.zzj();
                                    str3 = this.zza;
                                    zzawVarZzj8.zzav();
                                    zzawVarZzj8.zzg();
                                    Preconditions.checkNotEmpty(str3);
                                    arrayMap2 = new ArrayMap();
                                    sQLiteDatabaseZzj = zzawVarZzj8.zzj();
                                    cursorRawQuery = sQLiteDatabaseZzj.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                            arrayList = (List) arrayMap2.get(numValueOf);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                arrayMap2.put(numValueOf, arrayList);
                                            }
                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                        } while (cursorRawQuery.moveToNext());
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                    } else {
                                        arrayMap2 = Collections.EMPTY_MAP;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                    }
                                    Preconditions.checkNotEmpty(str19);
                                    Preconditions.checkNotNull(map2);
                                    arrayMap3 = new ArrayMap();
                                    if (!map2.isEmpty()) {
                                        it2 = map2.keySet().iterator();
                                        while (it2.hasNext()) {
                                            num = (Integer) it2.next();
                                            num.intValue();
                                            zzicVar3 = (com.google.android.gms.internal.measurement.zzic) map2.get(num);
                                            list4 = (List) arrayMap2.get(num);
                                            if (list4 != null) {
                                            }
                                            map4 = arrayMap2;
                                            hashSet3 = hashSet;
                                            it3 = it2;
                                            arrayMap3.put(num, zzicVar3);
                                            arrayMap2 = map4;
                                            hashSet = hashSet3;
                                            it2 = it3;
                                        }
                                    }
                                    hashSet2 = hashSet;
                                    map3 = arrayMap3;
                                } else {
                                    hashSet2 = hashSet;
                                    map3 = map2;
                                }
                                while (r16.hasNext()) {
                                    num3.intValue();
                                    zzicVar = (com.google.android.gms.internal.measurement.zzic) map3.get(num3);
                                    bitSet = new BitSet();
                                    bitSet2 = new BitSet();
                                    arrayMap = new ArrayMap();
                                    if (zzicVar != null) {
                                        while (r7.hasNext()) {
                                            if (zzhkVar.zzh()) {
                                                Map map17 = map3;
                                                Integer numValueOf9 = Integer.valueOf(zzhkVar.zza());
                                                if (zzhkVar.zzg()) {
                                                    lValueOf = Long.valueOf(zzhkVar.zzb());
                                                } else {
                                                    lValueOf = null;
                                                }
                                                arrayMap.put(numValueOf9, lValueOf);
                                                map3 = map17;
                                            }
                                        }
                                    }
                                    Map map18 = map3;
                                    ArrayMap arrayMap12 = new ArrayMap();
                                    if (zzicVar != null) {
                                        it = zzicVar.zzj().iterator();
                                        while (it.hasNext()) {
                                            zzieVar = (com.google.android.gms.internal.measurement.zzie) it.next();
                                            if (!zzieVar.zzi()) {
                                            }
                                        }
                                    }
                                    zzicVar2 = zzicVar;
                                    if (zzicVar2 != null) {
                                        i3 = 0;
                                        while (i3 < zzicVar2.zzd() * 64) {
                                            if (zzqa.zzy(zzicVar2.zzk(), i3)) {
                                                z4 = zZzx;
                                                this.zzu.zzaW().zzj().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i3));
                                                bitSet2.set(i3);
                                                if (zzqa.zzy(zzicVar2.zzi(), i3)) {
                                                    bitSet.set(i3);
                                                }
                                                i3++;
                                                zZzx = z4;
                                            } else {
                                                z4 = zZzx;
                                            }
                                            arrayMap.remove(Integer.valueOf(i3));
                                            i3++;
                                            zZzx = z4;
                                        }
                                    }
                                    boolean z7 = zZzx;
                                    com.google.android.gms.internal.measurement.zzic zzicVar6 = (com.google.android.gms.internal.measurement.zzic) map2.get(num3);
                                    if (!zZzx2) {
                                    }
                                    this.zzc.put(num3, new zzy(this, this.zza, zzicVar6, bitSet, bitSet2, arrayMap, arrayMap12, null));
                                    str2 = str2;
                                    map = map;
                                    str15 = str15;
                                    map2 = map2;
                                    zZzx = z7;
                                    map3 = map18;
                                }
                            }
                            str4 = str2;
                            str5 = str15;
                            str6 = "Skipping failed audience ID";
                            if (!list.isEmpty()) {
                                zzzVar = new zzz(this, null);
                                arrayMap6 = new ArrayMap();
                                it7 = list.iterator();
                                while (it7.hasNext()) {
                                    zzhmVar = (com.google.android.gms.internal.measurement.zzhm) it7.next();
                                    zzhmVarZza = zzzVar.zza(this.zza, zzhmVar);
                                    if (zzhmVarZza != null) {
                                        zzpvVar = this.zzg;
                                        zzbdVarZzr = zzpvVar.zzj().zzr(this.zza, zzhmVar, zzhmVarZza.zzh());
                                        zzpvVar.zzj().zzV(zzbdVarZzr);
                                        if (z) {
                                            j = zzbdVarZzr.zzc;
                                            strZzh = zzhmVarZza.zzh();
                                            map7 = (Map) arrayMap6.get(strZzh);
                                            if (map7 == null) {
                                                zzawVarZzj3 = zzpvVar.zzj();
                                                str10 = this.zza;
                                                zzawVarZzj3.zzav();
                                                zzawVarZzj3.zzg();
                                                Preconditions.checkNotEmpty(str10);
                                                Preconditions.checkNotEmpty(strZzh);
                                                arrayMap7 = new ArrayMap();
                                                str11 = str10;
                                                cursorQuery3 = zzawVarZzj3.zzj().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strZzh}, null, null, null);
                                                if (cursorQuery3.moveToFirst()) {
                                                    zzbdVar = zzbdVarZzr;
                                                    while (true) {
                                                        com.google.android.gms.internal.measurement.zzfj zzfjVar7 = (com.google.android.gms.internal.measurement.zzfj) ((com.google.android.gms.internal.measurement.zzfi) zzqa.zzp(com.google.android.gms.internal.measurement.zzfj.zzc(), cursorQuery3.getBlob(1))).zzba();
                                                        numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                        list6 = (List) arrayMap7.get(numValueOf5);
                                                        if (list6 == null) {
                                                            cursor4 = cursorQuery3;
                                                            arrayList4 = new ArrayList();
                                                            arrayMap7.put(numValueOf5, arrayList4);
                                                        } else {
                                                            cursor4 = cursorQuery3;
                                                            arrayList4 = list6;
                                                        }
                                                        arrayList4.add(zzfjVar7);
                                                        if (!cursor4.moveToNext()) {
                                                            break;
                                                            break;
                                                        }
                                                        cursorQuery3 = cursor4;
                                                    }
                                                    if (cursor4 != null) {
                                                        cursor4.close();
                                                    }
                                                    map7 = arrayMap7;
                                                } else {
                                                    zzbdVar = zzbdVarZzr;
                                                    map7 = Collections.EMPTY_MAP;
                                                    if (cursorQuery3 != null) {
                                                        cursorQuery3.close();
                                                    }
                                                }
                                                arrayMap6.put(strZzh, map7);
                                            } else {
                                                zzbdVar = zzbdVarZzr;
                                            }
                                            it8 = map7.keySet().iterator();
                                            while (it8.hasNext()) {
                                                num2 = (Integer) it8.next();
                                                iIntValue = num2.intValue();
                                                if (this.zzb.contains(num2)) {
                                                    this.zzu.zzaW().zzj().zzb("Skipping failed audience ID", num2);
                                                } else {
                                                    it9 = ((List) map7.get(num2)).iterator();
                                                    zZzd2 = true;
                                                    while (true) {
                                                        if (!it9.hasNext()) {
                                                            map8 = map7;
                                                            it10 = it8;
                                                            j2 = j;
                                                            break;
                                                        }
                                                        com.google.android.gms.internal.measurement.zzfj zzfjVar8 = (com.google.android.gms.internal.measurement.zzfj) it9.next();
                                                        map8 = map7;
                                                        it10 = it8;
                                                        zzaaVar = new zzaa(this, this.zza, iIntValue, zzfjVar8);
                                                        j2 = j;
                                                        zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhmVarZza, j2, zzbdVar, zzf(iIntValue, zzfjVar8.zzb()));
                                                        if (!zZzd2) {
                                                            this.zzb.add(num2);
                                                            break;
                                                        }
                                                        zzd(num2).zzc(zzaaVar);
                                                        j = j2;
                                                        map7 = map8;
                                                        it8 = it10;
                                                    }
                                                    if (!zZzd2) {
                                                        this.zzb.add(num2);
                                                    }
                                                    j = j2;
                                                    map7 = map8;
                                                    it8 = it10;
                                                }
                                            }
                                            it7 = it7;
                                            zzzVar = zzzVar;
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return new ArrayList();
                            }
                            if (!list2.isEmpty()) {
                                arrayMap4 = new ArrayMap();
                                it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    com.google.android.gms.internal.measurement.zzio zzioVar5 = (com.google.android.gms.internal.measurement.zzio) it4.next();
                                    strZzg = zzioVar5.zzg();
                                    map5 = (Map) arrayMap4.get(strZzg);
                                    if (map5 == null) {
                                        zzawVarZzj2 = this.zzg.zzj();
                                        str8 = this.zza;
                                        zzawVarZzj2.zzav();
                                        zzawVarZzj2.zzg();
                                        Preconditions.checkNotEmpty(str8);
                                        Preconditions.checkNotEmpty(strZzg);
                                        arrayMap5 = new ArrayMap();
                                        cursorQuery2 = zzawVarZzj2.zzj().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strZzg}, null, null, null);
                                        if (cursorQuery2.moveToFirst()) {
                                            while (true) {
                                                com.google.android.gms.internal.measurement.zzfr zzfrVar4 = (com.google.android.gms.internal.measurement.zzfr) ((com.google.android.gms.internal.measurement.zzfq) zzqa.zzp(com.google.android.gms.internal.measurement.zzfr.zzc(), cursorQuery2.getBlob(1))).zzba();
                                                numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                list5 = (List) arrayMap5.get(numValueOf4);
                                                if (list5 == null) {
                                                    it5 = it4;
                                                    arrayList3 = new ArrayList();
                                                    arrayMap5.put(numValueOf4, arrayList3);
                                                } else {
                                                    it5 = it4;
                                                    arrayList3 = list5;
                                                }
                                                arrayList3.add(zzfrVar4);
                                                str9 = str8;
                                                if (!cursorQuery2.moveToNext()) {
                                                    break;
                                                    break;
                                                }
                                                it4 = it5;
                                                str8 = str9;
                                            }
                                            if (cursorQuery2 != null) {
                                                cursorQuery2.close();
                                            }
                                            map5 = arrayMap5;
                                        } else {
                                            it5 = it4;
                                            map5 = Collections.EMPTY_MAP;
                                            if (cursorQuery2 != null) {
                                                cursorQuery2.close();
                                            }
                                        }
                                        arrayMap4.put(strZzg, map5);
                                    } else {
                                        it5 = it4;
                                    }
                                    while (r4.hasNext()) {
                                        int iIntValue7 = num4.intValue();
                                        if (this.zzb.contains(num4)) {
                                            this.zzu.zzaW().zzj().zzb(str6, num4);
                                            break;
                                            break;
                                        }
                                        it6 = ((List) map5.get(num4)).iterator();
                                        zZzd = true;
                                        while (true) {
                                            if (it6.hasNext()) {
                                                zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it6.next();
                                                zzioVar = this.zzu;
                                                map6 = map5;
                                                if (Log.isLoggable(zzioVar.zzaW().zzr(), 2)) {
                                                    zzhc zzhcVarZzj4 = zzioVar.zzaW().zzj();
                                                    if (zzfrVar.zzj()) {
                                                        numValueOf3 = Integer.valueOf(zzfrVar.zza());
                                                    } else {
                                                        numValueOf3 = null;
                                                    }
                                                    zzhcVarZzj4.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzioVar.zzj().zzf(zzfrVar.zze()));
                                                    zzioVar.zzaW().zzj().zzb("Filter definition", this.zzg.zzA().zzs(zzfrVar));
                                                }
                                                if (zzfrVar.zzj()) {
                                                }
                                                zzhc zzhcVarZzk4 = zzioVar.zzaW().zzk();
                                                Object objZzn4 = zzhe.zzn(this.zza);
                                                if (zzfrVar.zzj()) {
                                                    numValueOf2 = Integer.valueOf(zzfrVar.zza());
                                                } else {
                                                    numValueOf2 = null;
                                                }
                                                zzhcVarZzk4.zzc("Invalid property filter ID. appId, id", objZzn4, String.valueOf(numValueOf2));
                                                this.zzb.add(num4);
                                                map5 = map6;
                                                arrayMap4 = arrayMap4;
                                                str6 = str6;
                                            } else {
                                                map6 = map5;
                                                str6 = str6;
                                                arrayMap4 = arrayMap4;
                                            }
                                            if (!zZzd) {
                                                this.zzb.add(num4);
                                            }
                                            map5 = map6;
                                            arrayMap4 = arrayMap4;
                                            str6 = str6;
                                            zzd(num4).zzc(zzacVar);
                                            map5 = map6;
                                            arrayMap4 = arrayMap4;
                                            str6 = str6;
                                        }
                                    }
                                    it4 = it5;
                                }
                            }
                            arrayList2 = new ArrayList();
                            Set<Integer> setKeySet3 = this.zzc.keySet();
                            setKeySet3.removeAll(this.zzb);
                            while (r3.hasNext()) {
                                int iIntValue8 = num5.intValue();
                                zzy zzyVar3 = (zzy) this.zzc.get(num5);
                                Preconditions.checkNotNull(zzyVar3);
                                com.google.android.gms.internal.measurement.zzhi zzhiVarZza3 = zzyVar3.zza(iIntValue8);
                                arrayList2.add(zzhiVarZza3);
                                zzawVarZzj = this.zzg.zzj();
                                str7 = this.zza;
                                com.google.android.gms.internal.measurement.zzic zzicVarZzd3 = zzhiVarZza3.zzd();
                                zzawVarZzj.zzav();
                                zzawVarZzj.zzg();
                                Preconditions.checkNotEmpty(str7);
                                Preconditions.checkNotNull(zzicVarZzd3);
                                byte[] bArrZzcd3 = zzicVarZzd3.zzcd();
                                contentValues = new ContentValues();
                                contentValues.put("app_id", str7);
                                contentValues.put(str5, num5);
                                contentValues.put("current_results", bArrZzcd3);
                                if (zzawVarZzj.zzj().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                    zzawVarZzj.zzu.zzaW().zze().zzb("Failed to insert filter results (got -1). appId", zzhe.zzn(str7));
                                }
                            }
                            return arrayList2;
                        } catch (Throwable th9) {
                            th = th9;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th10) {
                    th = th10;
                    if (r6 != 0) {
                        r6.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e23) {
                e = e23;
                cursorQuery4 = null;
            } catch (Throwable th11) {
                th = th11;
                r6 = 0;
                if (r6 != 0) {
                    r6.close();
                }
                throw th;
            }
        } else {
            map = map9;
        }
        zzaw zzawVarZzj9 = this.zzg.zzj();
        String str110 = this.zza;
        zzawVarZzj9.zzav();
        zzawVarZzj9.zzg();
        Preconditions.checkNotEmpty(str110);
        try {
            cursorQuery = zzawVarZzj9.zzj().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str110}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map map19 = Collections.EMPTY_MAP;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                map2 = map19;
                z3 = z2;
                str2 = "data";
                str15 = "audience_id";
            } else {
                arrayMap8 = new ArrayMap();
                while (true) {
                    i4 = cursorQuery.getInt(0);
                    arrayMap8.put(Integer.valueOf(i4), (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzib) zzqa.zzp(com.google.android.gms.internal.measurement.zzic.zze(), cursorQuery.getBlob(1))).zzba());
                    z3 = z2;
                    str2 = str14;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    z2 = z3;
                    str14 = str2;
                    str15 = str15;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                map2 = arrayMap8;
            }
        } catch (SQLiteException e24) {
            e = e24;
            z3 = z2;
            str2 = "data";
            str15 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th12) {
            th = th12;
            cursor = null;
        }
        if (!map2.isEmpty()) {
            hashSet = new HashSet(map2.keySet());
            if (z3) {
                String str111 = this.zza;
                zzaw zzawVarZzj10 = this.zzg.zzj();
                str3 = this.zza;
                zzawVarZzj10.zzav();
                zzawVarZzj10.zzg();
                Preconditions.checkNotEmpty(str3);
                arrayMap2 = new ArrayMap();
                sQLiteDatabaseZzj = zzawVarZzj10.zzj();
                cursorRawQuery = sQLiteDatabaseZzj.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) arrayMap2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            arrayMap2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } else {
                    arrayMap2 = Collections.EMPTY_MAP;
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                }
                Preconditions.checkNotEmpty(str111);
                Preconditions.checkNotNull(map2);
                arrayMap3 = new ArrayMap();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.intValue();
                        zzicVar3 = (com.google.android.gms.internal.measurement.zzic) map2.get(num);
                        list4 = (List) arrayMap2.get(num);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = arrayMap2;
                            hashSet3 = hashSet;
                            it3 = it2;
                            arrayMap3.put(num, zzicVar3);
                            arrayMap2 = map4;
                            hashSet = hashSet3;
                            it2 = it3;
                        } else {
                            zzpv zzpvVar2 = this.zzg;
                            map4 = arrayMap2;
                            hashSet3 = hashSet;
                            List listZzt = zzpvVar2.zzA().zzt(zzicVar3.zzi(), list4);
                            if (listZzt.isEmpty()) {
                                arrayMap2 = map4;
                                hashSet = hashSet3;
                            } else {
                                com.google.android.gms.internal.measurement.zzib zzibVar = (com.google.android.gms.internal.measurement.zzib) zzicVar3.zzch();
                                zzibVar.zzf();
                                zzibVar.zzb(listZzt);
                                List listZzt2 = zzpvVar2.zzA().zzt(zzicVar3.zzk(), list4);
                                zzibVar.zzh();
                                zzibVar.zzd(listZzt2);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it12 = zzicVar3.zzh().iterator();
                                while (it12.hasNext()) {
                                    Iterator it13 = it2;
                                    com.google.android.gms.internal.measurement.zzhk zzhkVar2 = (com.google.android.gms.internal.measurement.zzhk) it12.next();
                                    Iterator it14 = it12;
                                    if (!list4.contains(Integer.valueOf(zzhkVar2.zza()))) {
                                        arrayList6.add(zzhkVar2);
                                    }
                                    it2 = it13;
                                    it12 = it14;
                                }
                                it3 = it2;
                                zzibVar.zze();
                                zzibVar.zza(arrayList6);
                                ArrayList arrayList7 = new ArrayList();
                                for (com.google.android.gms.internal.measurement.zzie zzieVar2 : zzicVar3.zzj()) {
                                    if (!list4.contains(Integer.valueOf(zzieVar2.zzb()))) {
                                        arrayList7.add(zzieVar2);
                                    }
                                }
                                zzibVar.zzg();
                                zzibVar.zzc(arrayList7);
                                arrayMap3.put(num, (com.google.android.gms.internal.measurement.zzic) zzibVar.zzba());
                                arrayMap2 = map4;
                                hashSet = hashSet3;
                                it2 = it3;
                            }
                        }
                    }
                }
                hashSet2 = hashSet;
                map3 = arrayMap3;
            } else {
                hashSet2 = hashSet;
                map3 = map2;
            }
            while (r16.hasNext()) {
                num3.intValue();
                zzicVar = (com.google.android.gms.internal.measurement.zzic) map3.get(num3);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                arrayMap = new ArrayMap();
                if (zzicVar != null && zzicVar.zza() != 0) {
                    while (r7.hasNext()) {
                        if (zzhkVar.zzh()) {
                            Map map110 = map3;
                            Integer numValueOf10 = Integer.valueOf(zzhkVar.zza());
                            if (zzhkVar.zzg()) {
                                lValueOf = Long.valueOf(zzhkVar.zzb());
                            } else {
                                lValueOf = null;
                            }
                            arrayMap.put(numValueOf10, lValueOf);
                            map3 = map110;
                        }
                    }
                }
                Map map111 = map3;
                ArrayMap arrayMap13 = new ArrayMap();
                if (zzicVar != null && zzicVar.zzc() != 0) {
                    it = zzicVar.zzj().iterator();
                    while (it.hasNext()) {
                        zzieVar = (com.google.android.gms.internal.measurement.zzie) it.next();
                        if (!zzieVar.zzi() && zzieVar.zza() > 0) {
                            arrayMap13.put(Integer.valueOf(zzieVar.zzb()), Long.valueOf(zzieVar.zzc(zzieVar.zza() - 1)));
                            it = it;
                            zzicVar = zzicVar;
                        }
                    }
                }
                zzicVar2 = zzicVar;
                if (zzicVar2 != null) {
                    i3 = 0;
                    while (i3 < zzicVar2.zzd() * 64) {
                        if (zzqa.zzy(zzicVar2.zzk(), i3)) {
                            z4 = zZzx;
                            this.zzu.zzaW().zzj().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i3));
                            bitSet2.set(i3);
                            if (zzqa.zzy(zzicVar2.zzi(), i3)) {
                                bitSet.set(i3);
                            }
                            i3++;
                            zZzx = z4;
                        } else {
                            z4 = zZzx;
                        }
                        arrayMap.remove(Integer.valueOf(i3));
                        i3++;
                        zZzx = z4;
                    }
                }
                boolean z8 = zZzx;
                com.google.android.gms.internal.measurement.zzic zzicVar7 = (com.google.android.gms.internal.measurement.zzic) map2.get(num3);
                if (!zZzx2 && z8 && (list3 = (List) map.get(num3)) != null && this.zze != null && this.zzd != null) {
                    Iterator it15 = list3.iterator();
                    while (it15.hasNext()) {
                        com.google.android.gms.internal.measurement.zzfj zzfjVar9 = (com.google.android.gms.internal.measurement.zzfj) it15.next();
                        int iZzb = zzfjVar9.zzb();
                        Iterator it16 = it15;
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzfjVar9.zzm()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf11 = Integer.valueOf(iZzb);
                        if (arrayMap.containsKey(numValueOf11)) {
                            arrayMap.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        if (arrayMap13.containsKey(numValueOf11)) {
                            arrayMap13.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        it15 = it16;
                    }
                }
                this.zzc.put(num3, new zzy(this, this.zza, zzicVar7, bitSet, bitSet2, arrayMap, arrayMap13, null));
                str2 = str2;
                map = map;
                str15 = str15;
                map2 = map2;
                zZzx = z8;
                map3 = map111;
            }
        }
        str4 = str2;
        str5 = str15;
        str6 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            zzzVar = new zzz(this, null);
            arrayMap6 = new ArrayMap();
            it7 = list.iterator();
            while (it7.hasNext()) {
                zzhmVar = (com.google.android.gms.internal.measurement.zzhm) it7.next();
                zzhmVarZza = zzzVar.zza(this.zza, zzhmVar);
                if (zzhmVarZza != null) {
                    zzpvVar = this.zzg;
                    zzbdVarZzr = zzpvVar.zzj().zzr(this.zza, zzhmVar, zzhmVarZza.zzh());
                    zzpvVar.zzj().zzV(zzbdVarZzr);
                    if (z) {
                        j = zzbdVarZzr.zzc;
                        strZzh = zzhmVarZza.zzh();
                        map7 = (Map) arrayMap6.get(strZzh);
                        if (map7 == null) {
                            zzawVarZzj3 = zzpvVar.zzj();
                            str10 = this.zza;
                            zzawVarZzj3.zzav();
                            zzawVarZzj3.zzg();
                            Preconditions.checkNotEmpty(str10);
                            Preconditions.checkNotEmpty(strZzh);
                            arrayMap7 = new ArrayMap();
                            str11 = str10;
                            cursorQuery3 = zzawVarZzj3.zzj().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strZzh}, null, null, null);
                            if (cursorQuery3.moveToFirst()) {
                                zzbdVar = zzbdVarZzr;
                                while (true) {
                                    com.google.android.gms.internal.measurement.zzfj zzfjVar10 = (com.google.android.gms.internal.measurement.zzfj) ((com.google.android.gms.internal.measurement.zzfi) zzqa.zzp(com.google.android.gms.internal.measurement.zzfj.zzc(), cursorQuery3.getBlob(1))).zzba();
                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                    list6 = (List) arrayMap7.get(numValueOf5);
                                    if (list6 == null) {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = new ArrayList();
                                        arrayMap7.put(numValueOf5, arrayList4);
                                    } else {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(zzfjVar10);
                                    if (!cursor4.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    cursorQuery3 = cursor4;
                                }
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                map7 = arrayMap7;
                            } else {
                                zzbdVar = zzbdVarZzr;
                                map7 = Collections.EMPTY_MAP;
                                if (cursorQuery3 != null) {
                                    cursorQuery3.close();
                                }
                            }
                            arrayMap6.put(strZzh, map7);
                        } else {
                            zzbdVar = zzbdVarZzr;
                        }
                        it8 = map7.keySet().iterator();
                        while (it8.hasNext()) {
                            num2 = (Integer) it8.next();
                            iIntValue = num2.intValue();
                            if (this.zzb.contains(num2)) {
                                this.zzu.zzaW().zzj().zzb("Skipping failed audience ID", num2);
                            } else {
                                it9 = ((List) map7.get(num2)).iterator();
                                zZzd2 = true;
                                while (true) {
                                    if (!it9.hasNext()) {
                                        map8 = map7;
                                        it10 = it8;
                                        j2 = j;
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.zzfj zzfjVar11 = (com.google.android.gms.internal.measurement.zzfj) it9.next();
                                    map8 = map7;
                                    it10 = it8;
                                    zzaaVar = new zzaa(this, this.zza, iIntValue, zzfjVar11);
                                    j2 = j;
                                    zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhmVarZza, j2, zzbdVar, zzf(iIntValue, zzfjVar11.zzb()));
                                    if (!zZzd2) {
                                        this.zzb.add(num2);
                                        break;
                                    }
                                    zzd(num2).zzc(zzaaVar);
                                    j = j2;
                                    map7 = map8;
                                    it8 = it10;
                                }
                                if (!zZzd2) {
                                    this.zzb.add(num2);
                                }
                                j = j2;
                                map7 = map8;
                                it8 = it10;
                            }
                        }
                        it7 = it7;
                        zzzVar = zzzVar;
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            arrayMap4 = new ArrayMap();
            it4 = list2.iterator();
            while (it4.hasNext()) {
                com.google.android.gms.internal.measurement.zzio zzioVar6 = (com.google.android.gms.internal.measurement.zzio) it4.next();
                strZzg = zzioVar6.zzg();
                map5 = (Map) arrayMap4.get(strZzg);
                if (map5 == null) {
                    zzawVarZzj2 = this.zzg.zzj();
                    str8 = this.zza;
                    zzawVarZzj2.zzav();
                    zzawVarZzj2.zzg();
                    Preconditions.checkNotEmpty(str8);
                    Preconditions.checkNotEmpty(strZzg);
                    arrayMap5 = new ArrayMap();
                    cursorQuery2 = zzawVarZzj2.zzj().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strZzg}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        while (true) {
                            com.google.android.gms.internal.measurement.zzfr zzfrVar5 = (com.google.android.gms.internal.measurement.zzfr) ((com.google.android.gms.internal.measurement.zzfq) zzqa.zzp(com.google.android.gms.internal.measurement.zzfr.zzc(), cursorQuery2.getBlob(1))).zzba();
                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) arrayMap5.get(numValueOf4);
                            if (list5 == null) {
                                it5 = it4;
                                arrayList3 = new ArrayList();
                                arrayMap5.put(numValueOf4, arrayList3);
                            } else {
                                it5 = it4;
                                arrayList3 = list5;
                            }
                            arrayList3.add(zzfrVar5);
                            str9 = str8;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            it4 = it5;
                            str8 = str9;
                        }
                        if (cursorQuery2 != null) {
                            cursorQuery2.close();
                        }
                        map5 = arrayMap5;
                    } else {
                        it5 = it4;
                        map5 = Collections.EMPTY_MAP;
                        if (cursorQuery2 != null) {
                            cursorQuery2.close();
                        }
                    }
                    arrayMap4.put(strZzg, map5);
                } else {
                    it5 = it4;
                }
                while (r4.hasNext()) {
                    int iIntValue9 = num4.intValue();
                    if (this.zzb.contains(num4)) {
                        this.zzu.zzaW().zzj().zzb(str6, num4);
                        break;
                        break;
                    }
                    it6 = ((List) map5.get(num4)).iterator();
                    zZzd = true;
                    while (true) {
                        if (it6.hasNext()) {
                            zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it6.next();
                            zzioVar = this.zzu;
                            map6 = map5;
                            if (Log.isLoggable(zzioVar.zzaW().zzr(), 2)) {
                                zzhc zzhcVarZzj5 = zzioVar.zzaW().zzj();
                                if (zzfrVar.zzj()) {
                                    numValueOf3 = Integer.valueOf(zzfrVar.zza());
                                } else {
                                    numValueOf3 = null;
                                }
                                zzhcVarZzj5.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzioVar.zzj().zzf(zzfrVar.zze()));
                                zzioVar.zzaW().zzj().zzb("Filter definition", this.zzg.zzA().zzs(zzfrVar));
                            }
                            if (zzfrVar.zzj() || zzfrVar.zza() > 256) {
                                zzhc zzhcVarZzk5 = zzioVar.zzaW().zzk();
                                Object objZzn5 = zzhe.zzn(this.zza);
                                if (zzfrVar.zzj()) {
                                    numValueOf2 = Integer.valueOf(zzfrVar.zza());
                                } else {
                                    numValueOf2 = null;
                                }
                                zzhcVarZzk5.zzc("Invalid property filter ID. appId, id", objZzn5, String.valueOf(numValueOf2));
                                this.zzb.add(num4);
                                map5 = map6;
                                arrayMap4 = arrayMap4;
                                str6 = str6;
                            } else {
                                zzacVar = new zzac(this, this.zza, iIntValue9, zzfrVar);
                                zZzd = zzacVar.zzd(this.zzd, this.zze, zzioVar6, zzf(iIntValue9, zzfrVar.zza()));
                                if (zZzd) {
                                    zzd(num4).zzc(zzacVar);
                                    map5 = map6;
                                    arrayMap4 = arrayMap4;
                                    str6 = str6;
                                } else {
                                    this.zzb.add(num4);
                                }
                            }
                        } else {
                            map6 = map5;
                            str6 = str6;
                            arrayMap4 = arrayMap4;
                        }
                        if (!zZzd) {
                            this.zzb.add(num4);
                        }
                        map5 = map6;
                        arrayMap4 = arrayMap4;
                        str6 = str6;
                    }
                }
                it4 = it5;
            }
        }
        arrayList2 = new ArrayList();
        Set<Integer> setKeySet4 = this.zzc.keySet();
        setKeySet4.removeAll(this.zzb);
        while (r3.hasNext()) {
            int iIntValue10 = num5.intValue();
            zzy zzyVar4 = (zzy) this.zzc.get(num5);
            Preconditions.checkNotNull(zzyVar4);
            com.google.android.gms.internal.measurement.zzhi zzhiVarZza4 = zzyVar4.zza(iIntValue10);
            arrayList2.add(zzhiVarZza4);
            zzawVarZzj = this.zzg.zzj();
            str7 = this.zza;
            com.google.android.gms.internal.measurement.zzic zzicVarZzd4 = zzhiVarZza4.zzd();
            zzawVarZzj.zzav();
            zzawVarZzj.zzg();
            Preconditions.checkNotEmpty(str7);
            Preconditions.checkNotNull(zzicVarZzd4);
            byte[] bArrZzcd4 = zzicVarZzd4.zzcd();
            contentValues = new ContentValues();
            contentValues.put("app_id", str7);
            contentValues.put(str5, num5);
            contentValues.put("current_results", bArrZzcd4);
            if (zzawVarZzj.zzj().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                zzawVarZzj.zzu.zzaW().zze().zzb("Failed to insert filter results (got -1). appId", zzhe.zzn(str7));
            }
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
        return false;
    }
}
