package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgv extends zzg {
    private static final String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final zzgt zzb;
    private boolean zzc;

    zzgv(zzio zzioVar) {
        super(zzioVar);
        Context contextZzaT = this.zzu.zzaT();
        this.zzu.zzf();
        this.zzb = new zzgt(this, contextZzaT, "google_app_measurement_local.db");
    }

    /* JADX WARN: Code duplicated, block: B:117:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x0124 A[Catch: all -> 0x0183, TRY_ENTER, TryCatch #6 {all -> 0x0183, blocks: (B:23:0x007a, B:25:0x0080, B:36:0x00a0, B:38:0x00c4, B:40:0x00ce, B:42:0x00d6, B:48:0x00eb, B:69:0x0124, B:71:0x012a, B:72:0x012d, B:87:0x0162, B:79:0x014d), top: B:105:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x0154  */
    /* JADX WARN: Code duplicated, block: B:84:0x0159 A[PHI: r8 r10 r17
  0x0159: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v4 int) binds: [B:75:0x0145, B:90:0x0179, B:83:0x0157] A[DONT_GENERATE, DONT_INLINE]
  0x0159: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
  (r10v5 android.database.sqlite.SQLiteDatabase)
  (r10v6 android.database.sqlite.SQLiteDatabase)
  (r10v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:75:0x0145, B:90:0x0179, B:83:0x0157] A[DONT_GENERATE, DONT_INLINE]
  0x0159: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:75:0x0145, B:90:0x0179, B:83:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0176  */
    private final boolean zzs(int i, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseZzh;
        boolean z;
        boolean z2;
        Cursor cursorRawQuery;
        zzg();
        boolean z3 = false;
        z3 = false;
        if (!this.zzc) {
            zzio zzioVar = this.zzu;
            Cursor cursor = null;
            cursor = null;
            zzr zzrVarZzk = zzioVar.zzf().zzx(null, zzgi.zzbl) ? this.zzu.zzh().zzk(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (zzioVar.zzf().zzx(null, zzgi.zzbl) && zzrVarZzk != null) {
                contentValues.put("app_version", zzrVarZzk.zzc);
                contentValues.put("app_version_int", Long.valueOf(zzrVarZzk.zzj));
            }
            zzioVar.zzf();
            int i2 = 0;
            int i3 = 5;
            for (int i4 = 5; i2 < i4; i4 = 5) {
                try {
                    sQLiteDatabaseZzh = zzh();
                    if (sQLiteDatabaseZzh == null) {
                        this.zzc = true;
                    } else {
                        try {
                            sQLiteDatabaseZzh.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = cursorRawQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z = z3 ? 1 : 0;
                                    SystemClock.sleep(i3);
                                    i3 += 20;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                    i2++;
                                    z3 = z;
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    z = z3 ? 1 : 0;
                                    this.zzu.zzaW().zze().zzb("Error writing entry; local database full", e);
                                    this.zzc = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                    i2++;
                                    z3 = z;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.endTransaction();
                                    }
                                    this.zzu.zzaW().zze().zzb("Error writing entry to local database", e);
                                    this.zzc = z2;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                    i2++;
                                    z3 = z;
                                }
                            }
                            if (j >= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                zzioVar.zzaW().zze().zza("Data loss, local db full");
                                long j2 = 100001 - j;
                                long jDelete = sQLiteDatabaseZzh.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (jDelete != j2) {
                                    zzhc zzhcVarZze = zzioVar.zzaW().zze();
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                            try {
                                                zzhcVarZze.zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                            } catch (SQLiteFullException e3) {
                                                e = e3;
                                                this.zzu.zzaW().zze().zzb("Error writing entry; local database full", e);
                                                this.zzc = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseZzh != null) {
                                                    sQLiteDatabaseZzh.close();
                                                }
                                                i2++;
                                                z3 = z;
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                if (sQLiteDatabaseZzh != null && sQLiteDatabaseZzh.inTransaction()) {
                                                    sQLiteDatabaseZzh.endTransaction();
                                                }
                                                this.zzu.zzaW().zze().zzb("Error writing entry to local database", e);
                                                this.zzc = z2;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseZzh != null) {
                                                    sQLiteDatabaseZzh.close();
                                                }
                                                i2++;
                                                z3 = z;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i3);
                                            i3 += 20;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseZzh != null) {
                                                sQLiteDatabaseZzh.close();
                                            }
                                            i2++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteFullException e5) {
                                        e = e5;
                                        this.zzu.zzaW().zze().zzb("Error writing entry; local database full", e);
                                        this.zzc = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.close();
                                        }
                                        i2++;
                                        z3 = z;
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        z2 = true;
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.endTransaction();
                                        }
                                        this.zzu.zzaW().zze().zzb("Error writing entry to local database", e);
                                        this.zzc = z2;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.close();
                                        }
                                        i2++;
                                        z3 = z;
                                    }
                                } else {
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                }
                            } else {
                                z = z3 ? 1 : 0;
                                z2 = true;
                            }
                            sQLiteDatabaseZzh.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseZzh.setTransactionSuccessful();
                            sQLiteDatabaseZzh.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseZzh.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseZzh = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseZzh = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabaseZzh = null;
                    cursorRawQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseZzh = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            this.zzu.zzaW().zzj().zza("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
        return false;
    }

    final SQLiteDatabase zzh() throws SQLiteException {
        if (this.zzc) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzc = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:199:0x032c A[Catch: all -> 0x02b7, TryCatch #7 {all -> 0x02b7, blocks: (B:58:0x0137, B:59:0x013a, B:54:0x012d, B:197:0x0326, B:199:0x032c, B:200:0x032f, B:217:0x0369, B:208:0x0350, B:69:0x0153, B:73:0x0169, B:83:0x018a, B:84:0x0193, B:85:0x0196, B:81:0x0184, B:92:0x01a2, B:94:0x01b6, B:101:0x01d1, B:102:0x01db, B:103:0x01de, B:99:0x01cb, B:110:0x01e8, B:114:0x01fc, B:124:0x021b, B:126:0x0225, B:127:0x0228, B:122:0x0215, B:130:0x022d, B:131:0x023d, B:149:0x027d, B:151:0x0299, B:152:0x02a8), top: B:242:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:202:0x0341  */
    /* JADX WARN: Code duplicated, block: B:211:0x0357  */
    /* JADX WARN: Code duplicated, block: B:213:0x035c A[PHI: r3 r6 r11 r13 r19 r21
  0x035c: PHI (r3v11 int) = (r3v5 int), (r3v7 int), (r3v12 int) binds: [B:203:0x0344, B:220:0x037e, B:212:0x035a] A[DONT_GENERATE, DONT_INLINE]
  0x035c: PHI (r6v14 com.google.android.gms.measurement.internal.zzgv) = 
  (r6v8 com.google.android.gms.measurement.internal.zzgv)
  (r6v10 com.google.android.gms.measurement.internal.zzgv)
  (r6v15 com.google.android.gms.measurement.internal.zzgv)
 binds: [B:203:0x0344, B:220:0x037e, B:212:0x035a] A[DONT_GENERATE, DONT_INLINE]
  0x035c: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:203:0x0344, B:220:0x037e, B:212:0x035a] A[DONT_GENERATE, DONT_INLINE]
  0x035c: PHI (r13v10 ??) = (r13v6 ??), (r13v8 ??), (r13v11 ??) binds: [B:203:0x0344, B:220:0x037e, B:212:0x035a] A[DONT_GENERATE, DONT_INLINE]
  0x035c: PHI (r19v8 java.lang.String) = (r19v3 java.lang.String), (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:203:0x0344, B:220:0x037e, B:212:0x035a] A[DONT_GENERATE, DONT_INLINE]
  0x035c: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:203:0x0344, B:220:0x037e, B:212:0x035a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:219:0x037b  */
    /* JADX WARN: Code duplicated, block: B:224:0x038f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0394  */
    /* JADX WARN: Code duplicated, block: B:242:0x0326 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.google.android.gms.measurement.internal.zzam] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.util.List] */
    public final List zzi(int i) {
        ?? Zzh;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        ?? r17;
        ?? r16;
        long j2;
        String str;
        int i2;
        zzbf zzbfVarCreateFromParcel;
        zzai zzaiVarCreateFromParcel;
        zzqb zzqbVarCreateFromParcel;
        zzgv zzgvVar = this;
        String str2 = "entry";
        String str3 = "type";
        zzgvVar.zzg();
        ?? r6 = 0;
        if (zzgvVar.zzc) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzgvVar.zzl()) {
            return arrayList;
        }
        int i3 = 0;
        int i4 = 5;
        int i5 = 0;
        for (int i6 = 5; i5 < i6; i6 = 5) {
            try {
                Zzh = zzgvVar.zzh();
                if (Zzh == 0) {
                    zzgvVar.zzc = true;
                    return r6;
                }
                try {
                    Zzh.beginTransaction();
                    try {
                        cursorQuery2 = Zzh.query("messages", new String[]{"rowid"}, "type=?", new String[]{ExifInterface.GPS_MEASUREMENT_3D}, null, null, "rowid desc", "1");
                        try {
                            long j3 = -1;
                            if (cursorQuery2.moveToFirst()) {
                                j = cursorQuery2.getLong(i3);
                                if (cursorQuery2 != null) {
                                    cursorQuery2.close();
                                }
                            } else {
                                if (cursorQuery2 != null) {
                                    cursorQuery2.close();
                                }
                                j = -1;
                            }
                            if (j != -1) {
                                String[] strArr = new String[1];
                                strArr[i3] = String.valueOf(j);
                                r16 = "rowid<?";
                                r17 = strArr;
                            } else {
                                ?? r18 = r6;
                                r17 = r18;
                                r16 = r18;
                            }
                            String[] strArr2 = {"rowid", str3, str2};
                            zzio zzioVar = zzgvVar.zzu;
                            int i7 = 1;
                            boolean zZzx = zzioVar.zzf().zzx(r6, zzgi.zzbl);
                            int i8 = 3;
                            int i9 = 2;
                            if (zZzx) {
                                strArr2 = new String[i6];
                                strArr2[i3] = "rowid";
                                strArr2[1] = str3;
                                strArr2[2] = str2;
                                strArr2[3] = "app_version";
                                strArr2[4] = "app_version_int";
                            }
                            String[] strArr3 = strArr2;
                            int i10 = 4;
                            cursorQuery = Zzh.query("messages", strArr3, r16, r17, null, null, "rowid asc", Integer.toString(100));
                            while (cursorQuery.moveToNext()) {
                                try {
                                    try {
                                        j3 = cursorQuery.getLong(i3);
                                        int i11 = cursorQuery.getInt(i7);
                                        byte[] blob = cursorQuery.getBlob(i9);
                                        try {
                                            str2 = str2;
                                            try {
                                                if (zzioVar.zzf().zzx(null, zzgi.zzbl)) {
                                                    String string = cursorQuery.getString(i8);
                                                    j2 = cursorQuery.getLong(i10);
                                                    str = string;
                                                } else {
                                                    j2 = 0;
                                                    str = null;
                                                }
                                                long j4 = j2;
                                                if (i11 == 0) {
                                                    try {
                                                        Parcel parcelObtain = Parcel.obtain();
                                                        try {
                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                            parcelObtain.setDataPosition(0);
                                                            zzbh zzbhVarCreateFromParcel = zzbh.CREATOR.createFromParcel(parcelObtain);
                                                            parcelObtain.recycle();
                                                            if (zzbhVarCreateFromParcel != null) {
                                                                arrayList.add(new zzgu(zzbhVarCreateFromParcel, str, j4));
                                                            }
                                                            i2 = 3;
                                                            zzgvVar = this;
                                                            str3 = str3;
                                                        } catch (SafeParcelReader.ParseException unused) {
                                                            zzgvVar = this;
                                                            try {
                                                                zzgvVar.zzu.zzaW().zze().zza("Failed to load event from local database");
                                                                try {
                                                                    parcelObtain.recycle();
                                                                    str3 = str3;
                                                                    i2 = 3;
                                                                } catch (SQLiteDatabaseLockedException unused2) {
                                                                    str3 = str3;
                                                                    i3 = 0;
                                                                    SystemClock.sleep(i4);
                                                                    i4 += 20;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (Zzh != 0) {
                                                                        Zzh.close();
                                                                    }
                                                                    i5++;
                                                                    i3 = i3;
                                                                    zzgvVar = zzgvVar;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r6 = 0;
                                                                } catch (SQLiteFullException e) {
                                                                    e = e;
                                                                    str3 = str3;
                                                                    i3 = 0;
                                                                    zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                                                    zzgvVar.zzc = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (Zzh != 0) {
                                                                        Zzh.close();
                                                                    }
                                                                    i5++;
                                                                    i3 = i3;
                                                                    zzgvVar = zzgvVar;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r6 = 0;
                                                                } catch (SQLiteException e2) {
                                                                    e = e2;
                                                                    str3 = str3;
                                                                    i3 = 0;
                                                                    if (Zzh != 0) {
                                                                        try {
                                                                            if (Zzh.inTransaction()) {
                                                                                Zzh.endTransaction();
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (Zzh != 0) {
                                                                                Zzh.close();
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                                                    zzgvVar.zzc = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (Zzh != 0) {
                                                                        Zzh.close();
                                                                    }
                                                                    i5++;
                                                                    i3 = i3;
                                                                    zzgvVar = zzgvVar;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r6 = 0;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                parcelObtain.recycle();
                                                                throw th;
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            zzgvVar = this;
                                                            parcelObtain.recycle();
                                                            throw th;
                                                        }
                                                        i3 = 0;
                                                        i8 = i2;
                                                        i3 = i3;
                                                        zzgvVar = zzgvVar;
                                                        str2 = str2;
                                                        str3 = str3;
                                                        i7 = 1;
                                                        i10 = 4;
                                                        i9 = 2;
                                                    } catch (SQLiteDatabaseLockedException unused3) {
                                                        zzgvVar = this;
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        zzgvVar = this;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        zzgvVar = this;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (Zzh != 0) {
                                                            Zzh.close();
                                                        }
                                                        throw th;
                                                    }
                                                } else {
                                                    zzgvVar = this;
                                                    if (i11 == 1) {
                                                        Parcel parcelObtain2 = Parcel.obtain();
                                                        try {
                                                            str3 = str3;
                                                            try {
                                                                try {
                                                                    parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                    parcelObtain2.setDataPosition(0);
                                                                    zzqbVarCreateFromParcel = zzqb.CREATOR.createFromParcel(parcelObtain2);
                                                                    try {
                                                                        parcelObtain2.recycle();
                                                                        if (zzqbVarCreateFromParcel != null) {
                                                                            arrayList.add(new zzgu(zzqbVarCreateFromParcel, str, j4));
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused4) {
                                                                        i3 = 0;
                                                                        SystemClock.sleep(i4);
                                                                        i4 += 20;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (Zzh != 0) {
                                                                            Zzh.close();
                                                                        }
                                                                        i5++;
                                                                        i3 = i3;
                                                                        zzgvVar = zzgvVar;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r6 = 0;
                                                                    } catch (SQLiteFullException e5) {
                                                                        e = e5;
                                                                        i3 = 0;
                                                                        zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                                                        zzgvVar.zzc = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (Zzh != 0) {
                                                                            Zzh.close();
                                                                        }
                                                                        i5++;
                                                                        i3 = i3;
                                                                        zzgvVar = zzgvVar;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r6 = 0;
                                                                    } catch (SQLiteException e6) {
                                                                        e = e6;
                                                                        i3 = 0;
                                                                        if (Zzh != 0) {
                                                                            if (Zzh.inTransaction()) {
                                                                                Zzh.endTransaction();
                                                                            }
                                                                        }
                                                                        zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                                                        zzgvVar.zzc = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (Zzh != 0) {
                                                                            Zzh.close();
                                                                        }
                                                                        i5++;
                                                                        i3 = i3;
                                                                        zzgvVar = zzgvVar;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r6 = 0;
                                                                    }
                                                                } catch (SafeParcelReader.ParseException unused5) {
                                                                    zzgvVar.zzu.zzaW().zze().zza("Failed to load user property from local database");
                                                                    parcelObtain2.recycle();
                                                                    zzqbVarCreateFromParcel = null;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                parcelObtain2.recycle();
                                                                throw th;
                                                            }
                                                        } catch (SafeParcelReader.ParseException unused6) {
                                                            str3 = str3;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                        }
                                                    } else {
                                                        str3 = str3;
                                                        if (i11 == 2) {
                                                            Parcel parcelObtain3 = Parcel.obtain();
                                                            try {
                                                                try {
                                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                    parcelObtain3.setDataPosition(0);
                                                                    zzaiVarCreateFromParcel = zzai.CREATOR.createFromParcel(parcelObtain3);
                                                                    parcelObtain3.recycle();
                                                                } catch (Throwable th7) {
                                                                    parcelObtain3.recycle();
                                                                    throw th7;
                                                                }
                                                            } catch (SafeParcelReader.ParseException unused7) {
                                                                zzgvVar.zzu.zzaW().zze().zza("Failed to load conditional user property from local database");
                                                                parcelObtain3.recycle();
                                                                zzaiVarCreateFromParcel = null;
                                                            }
                                                            if (zzaiVarCreateFromParcel != null) {
                                                                arrayList.add(new zzgu(zzaiVarCreateFromParcel, str, j4));
                                                            }
                                                        } else if (i11 == 4) {
                                                            Parcel parcelObtain4 = Parcel.obtain();
                                                            try {
                                                                i3 = 0;
                                                                try {
                                                                    try {
                                                                        parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                        parcelObtain4.setDataPosition(0);
                                                                        zzbfVarCreateFromParcel = zzbf.CREATOR.createFromParcel(parcelObtain4);
                                                                        try {
                                                                            parcelObtain4.recycle();
                                                                            if (zzbfVarCreateFromParcel != null) {
                                                                                arrayList.add(new zzgu(zzbfVarCreateFromParcel, str, j4));
                                                                            }
                                                                            i2 = 3;
                                                                        } catch (SQLiteDatabaseLockedException unused8) {
                                                                            SystemClock.sleep(i4);
                                                                            i4 += 20;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (Zzh != 0) {
                                                                                Zzh.close();
                                                                            }
                                                                            i5++;
                                                                            i3 = i3;
                                                                            zzgvVar = zzgvVar;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r6 = 0;
                                                                        } catch (SQLiteFullException e7) {
                                                                            e = e7;
                                                                            zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                                                            zzgvVar.zzc = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (Zzh != 0) {
                                                                                Zzh.close();
                                                                            }
                                                                            i5++;
                                                                            i3 = i3;
                                                                            zzgvVar = zzgvVar;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r6 = 0;
                                                                        } catch (SQLiteException e8) {
                                                                            e = e8;
                                                                            if (Zzh != 0) {
                                                                                if (Zzh.inTransaction()) {
                                                                                    Zzh.endTransaction();
                                                                                }
                                                                            }
                                                                            zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                                                            zzgvVar.zzc = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (Zzh != 0) {
                                                                                Zzh.close();
                                                                            }
                                                                            i5++;
                                                                            i3 = i3;
                                                                            zzgvVar = zzgvVar;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r6 = 0;
                                                                        }
                                                                    } catch (SafeParcelReader.ParseException unused9) {
                                                                        zzgvVar.zzu.zzaW().zze().zza("Failed to load default event parameters from local database");
                                                                        parcelObtain4.recycle();
                                                                        zzbfVarCreateFromParcel = null;
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    parcelObtain4.recycle();
                                                                    throw th;
                                                                }
                                                            } catch (SafeParcelReader.ParseException unused10) {
                                                                i3 = 0;
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } else {
                                                            i2 = 3;
                                                            i3 = 0;
                                                            if (i11 == 3) {
                                                                zzgvVar.zzu.zzaW().zzk().zza("Skipping app launch break");
                                                            } else {
                                                                zzgvVar.zzu.zzaW().zze().zza("Unknown record type in local database");
                                                            }
                                                        }
                                                        i8 = i2;
                                                        i3 = i3;
                                                        zzgvVar = zzgvVar;
                                                        str2 = str2;
                                                        str3 = str3;
                                                        i7 = 1;
                                                        i10 = 4;
                                                        i9 = 2;
                                                    }
                                                }
                                                i2 = 3;
                                                i3 = 0;
                                                i8 = i2;
                                                i3 = i3;
                                                zzgvVar = zzgvVar;
                                                str2 = str2;
                                                str3 = str3;
                                                i7 = 1;
                                                i10 = 4;
                                                i9 = 2;
                                            } catch (SQLiteDatabaseLockedException unused11) {
                                                zzgvVar = zzgvVar;
                                            } catch (SQLiteFullException e9) {
                                                e = e9;
                                                zzgvVar = zzgvVar;
                                            } catch (SQLiteException e10) {
                                                e = e10;
                                                zzgvVar = zzgvVar;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused12) {
                                            zzgvVar = zzgvVar;
                                            str2 = str2;
                                        } catch (SQLiteFullException e11) {
                                            e = e11;
                                            zzgvVar = zzgvVar;
                                            str2 = str2;
                                        } catch (SQLiteException e12) {
                                            e = e12;
                                            zzgvVar = zzgvVar;
                                            str2 = str2;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                    }
                                } catch (SQLiteDatabaseLockedException unused13) {
                                    zzgvVar = zzgvVar;
                                    str2 = str2;
                                    str3 = str3;
                                    i3 = i3;
                                } catch (SQLiteFullException e13) {
                                    e = e13;
                                    zzgvVar = zzgvVar;
                                    str2 = str2;
                                    str3 = str3;
                                    i3 = i3;
                                } catch (SQLiteException e14) {
                                    e = e14;
                                    zzgvVar = zzgvVar;
                                    str2 = str2;
                                    str3 = str3;
                                    i3 = i3;
                                }
                            }
                            zzgv zzgvVar2 = zzgvVar;
                            if (Zzh.delete("messages", "rowid <= ?", new String[]{Long.toString(j3)}) < arrayList.size()) {
                                zzgvVar2.zzu.zzaW().zze().zza("Fewer entries removed from local database than expected");
                            }
                            Zzh.setTransactionSuccessful();
                            Zzh.endTransaction();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            Zzh.close();
                            return arrayList;
                        } catch (Throwable th11) {
                            th = th11;
                            if (cursorQuery2 != null) {
                                try {
                                    cursorQuery2.close();
                                } catch (SQLiteDatabaseLockedException unused14) {
                                    cursorQuery = null;
                                    SystemClock.sleep(i4);
                                    i4 += 20;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (Zzh != 0) {
                                        Zzh.close();
                                    }
                                    i5++;
                                    i3 = i3;
                                    zzgvVar = zzgvVar;
                                    str2 = str2;
                                    str3 = str3;
                                    r6 = 0;
                                } catch (SQLiteFullException e15) {
                                    e = e15;
                                    cursorQuery = null;
                                    zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                    zzgvVar.zzc = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (Zzh != 0) {
                                        Zzh.close();
                                    }
                                    i5++;
                                    i3 = i3;
                                    zzgvVar = zzgvVar;
                                    str2 = str2;
                                    str3 = str3;
                                    r6 = 0;
                                } catch (SQLiteException e16) {
                                    e = e16;
                                    cursorQuery = null;
                                    if (Zzh != 0) {
                                        if (Zzh.inTransaction()) {
                                            Zzh.endTransaction();
                                        }
                                    }
                                    zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                    zzgvVar.zzc = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (Zzh != 0) {
                                        Zzh.close();
                                    }
                                    i5++;
                                    i3 = i3;
                                    zzgvVar = zzgvVar;
                                    str2 = str2;
                                    str3 = str3;
                                    r6 = 0;
                                } catch (Throwable th12) {
                                    th = th12;
                                    cursorQuery = null;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (Zzh != 0) {
                                        Zzh.close();
                                    }
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        cursorQuery2 = null;
                    }
                } catch (SQLiteDatabaseLockedException unused15) {
                    zzgvVar = zzgvVar;
                    str2 = str2;
                    str3 = str3;
                    i3 = i3;
                } catch (SQLiteFullException e17) {
                    e = e17;
                    zzgvVar = zzgvVar;
                    str2 = str2;
                    str3 = str3;
                    i3 = i3;
                } catch (SQLiteException e18) {
                    e = e18;
                    zzgvVar = zzgvVar;
                    str2 = str2;
                    str3 = str3;
                    i3 = i3;
                } catch (Throwable th14) {
                    th = th14;
                }
            } catch (SQLiteDatabaseLockedException unused16) {
                zzgvVar = zzgvVar;
                str2 = str2;
                str3 = str3;
                i3 = i3;
                Zzh = 0;
            } catch (SQLiteFullException e19) {
                e = e19;
                zzgvVar = zzgvVar;
                str2 = str2;
                str3 = str3;
                i3 = i3;
                Zzh = 0;
            } catch (SQLiteException e20) {
                e = e20;
                zzgvVar = zzgvVar;
                str2 = str2;
                str3 = str3;
                i3 = i3;
                Zzh = 0;
            } catch (Throwable th15) {
                th = th15;
                Zzh = 0;
            }
        }
        zzgvVar.zzu.zzaW().zzk().zza("Failed to read events from database in reasonable time");
        return null;
    }

    public final void zzj() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            if (sQLiteDatabaseZzh == null || (iDelete = sQLiteDatabaseZzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzu.zzaW().zzj().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            this.zzu.zzaW().zze().zzb("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzk() {
        return zzs(3, new byte[0]);
    }

    final boolean zzl() {
        zzio zzioVar = this.zzu;
        Context contextZzaT = zzioVar.zzaT();
        zzioVar.zzf();
        return contextZzaT.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b A[PHI: r4
  0x006b: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v4 int) binds: [B:34:0x007e, B:28:0x0062, B:31:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean zzm() {
        zzg();
        if (!this.zzc && zzl()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseZzh = zzh();
                            if (sQLiteDatabaseZzh != null) {
                                sQLiteDatabaseZzh.beginTransaction();
                                sQLiteDatabaseZzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                sQLiteDatabaseZzh.setTransactionSuccessful();
                                sQLiteDatabaseZzh.endTransaction();
                                sQLiteDatabaseZzh.close();
                                return true;
                            }
                            this.zzc = true;
                        } catch (SQLiteDatabaseLockedException unused) {
                            SystemClock.sleep(i);
                            i += 20;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        this.zzu.zzaW().zze().zzb("Error deleting app launch break from local database", e);
                        this.zzc = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e2) {
                    this.zzu.zzaW().zze().zzb("Error deleting app launch break from local database", e2);
                    this.zzc = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.zzu.zzaW().zzk().zza("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzai zzaiVar) {
        zzio zzioVar = this.zzu;
        byte[] bArrZzay = zzioVar.zzw().zzay(zzaiVar);
        if (bArrZzay.length <= 131072) {
            return zzs(2, bArrZzay);
        }
        zzioVar.zzaW().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzbf zzbfVar) {
        zzio zzioVar = this.zzu;
        byte[] bArrZzay = zzioVar.zzw().zzay(zzbfVar);
        if (bArrZzay == null) {
            zzioVar.zzaW().zzh().zza("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrZzay.length <= 131072) {
            return zzs(4, bArrZzay);
        }
        zzioVar.zzaW().zzh().zza("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzp(zzbh zzbhVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzbi.zza(zzbhVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(0, bArrMarshall);
        }
        this.zzu.zzaW().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzq(zzqb zzqbVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzqc.zza(zzqbVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(1, bArrMarshall);
        }
        this.zzu.zzaW().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
