package com.apm.insight.p022l;

import android.os.Environment;
import android.os.StatFs;
import com.apm.insight.C1390e;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.l.n */
/* JADX INFO: compiled from: Storage.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1438n {
    /* JADX INFO: renamed from: a */
    private static long m1433a(File file) {
        try {
            return new StatFs(file.getPath()).getTotalBytes();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m1434a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inner_free", m1435b());
            jSONObject.put("inner_total", m1437c());
            jSONObject.put("sdcard_free", m1440f());
            jSONObject.put("sdcard_total", m1441g());
            jSONObject.put("inner_free_real", m1438d());
            jSONObject.put("inner_total_real", m1439e());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    private static long m1435b() {
        try {
            return m1436b(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    private static long m1436b(File file) {
        try {
            return new StatFs(file.getPath()).getFreeBytes();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    private static long m1437c() {
        try {
            return m1433a(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: d */
    private static long m1438d() {
        try {
            return m1436b(C1390e.m1032g().getFilesDir());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: e */
    private static long m1439e() {
        try {
            return m1433a(C1390e.m1032g().getFilesDir());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: f */
    private static long m1440f() {
        try {
            if (m1442h()) {
                return Environment.getExternalStorageDirectory().getFreeSpace();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: g */
    private static long m1441g() {
        try {
            if (m1442h()) {
                return Environment.getExternalStorageDirectory().getTotalSpace();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: h */
    private static boolean m1442h() {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}
