package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.directory.C13097d;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import java.io.File;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.t0 */
/* JADX INFO: compiled from: SameSDCardTool.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13225t0 {

    /* JADX INFO: renamed from: a */
    static String f36384a = "";

    /* JADX INFO: renamed from: b */
    private static volatile boolean f36385b = false;

    /* JADX INFO: renamed from: c */
    private static int f36386c = -1;

    /* JADX INFO: renamed from: d */
    private static int f36387d = -1;

    /* JADX INFO: renamed from: e */
    private static long f36388e;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.t0$a */
    /* JADX INFO: compiled from: SameSDCardTool.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13225t0.m37850b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37849a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f36385b) {
                return;
            }
            f36385b = true;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                f36384a = externalFilesDir.getAbsolutePath();
            }
            try {
                m37851b(context);
            } catch (Exception unused) {
                m37851b(context);
            }
        } catch (Exception e) {
            C13219q0.m37816b("SameSDCardTool", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m37851b(Context context) {
        File externalFilesDir;
        if (TextUtils.isEmpty(f36384a) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
            f36384a = externalFilesDir.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(f36384a)) {
            C13098e.m37146a(new C13097d(f36384a));
            C13098e.m37148b().m37150a();
        }
        m37850b();
    }

    /* JADX INFO: renamed from: c */
    public static int m37852c() {
        return f36387d;
    }

    /* JADX INFO: renamed from: a */
    public static int m37848a() {
        if (System.currentTimeMillis() - f36388e > 1800000) {
            C13167a.m37546e().execute(new a());
        }
        return f36386c;
    }

    /* JADX INFO: renamed from: b */
    public static void m37850b() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            f36387d = Long.valueOf(((((long) statFs.getBlockCount()) * blockSize) / 1000) / 1000).intValue();
            f36386c = Long.valueOf(((availableBlocks * blockSize) / 1000) / 1000).intValue();
            f36388e = System.currentTimeMillis();
        } catch (Exception e) {
            C13219q0.m37816b("SameSDCardTool", e.getMessage());
        }
    }
}
