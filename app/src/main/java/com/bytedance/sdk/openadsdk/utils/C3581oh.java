package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2523lr;
import com.bytedance.sdk.component.p165mj.p166lr.ThreadFactoryC2675fi;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2723mj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.component.reward.C2985bu;
import com.bytedance.sdk.openadsdk.component.reward.C2987di;
import com.bytedance.sdk.openadsdk.component.xha.C3087ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.oh */
/* JADX INFO: loaded from: classes3.dex */
public class C3581oh implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: ri */
    public static volatile boolean f13200ri;

    /* JADX INFO: renamed from: ik */
    private String f13201ik;

    /* JADX INFO: renamed from: lr */
    private final Thread.UncaughtExceptionHandler f13202lr = Thread.getDefaultUncaughtExceptionHandler();

    private C3581oh() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        m16561lr();
    }

    /* JADX INFO: renamed from: ik */
    private void m16560ik() {
        try {
            C3087ri.m12361ri(C3299nr.m14642ri());
        } catch (Throwable unused) {
        }
        try {
            if (C3578lr.m16535lr()) {
                C2985bu.m11638ri(C3299nr.m14642ri()).m11789fi();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.slm.m12192ri(C3299nr.m14642ri()).m12201ri();
            }
        } catch (Throwable unused2) {
        }
        try {
            if (C3578lr.m16535lr()) {
                com.bytedance.sdk.openadsdk.component.reward.xha.m12322ri(C3299nr.m14642ri()).m11789fi();
            } else {
                C2987di.m11663ri(C3299nr.m14642ri()).m11672ri();
            }
        } catch (Throwable unused3) {
        }
        try {
            C3322sf.m14819lr().m14876ri();
        } catch (Throwable unused4) {
        }
        try {
            C2523lr.m9113lr();
        } catch (Throwable unused5) {
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m16561lr() {
        Context contextM14642ri = C3299nr.m14642ri();
        if (contextM14642ri == null) {
            return;
        }
        try {
            File file = new File(contextM14642ri.getFilesDir(), "TTCache");
            file.mkdirs();
            this.f13201ik = file.getPath();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C3581oh m16562ri() {
        return new C3581oh();
    }

    /* JADX WARN: Code duplicated, block: B:79:0x00e2 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ri */
    private void m16563ri(Thread thread, Throwable th) {
        FileOutputStream fileOutputStream;
        Object[] objArr;
        int i;
        FileInputStream fileInputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        FileInputStream fileInputStream2 = null;
        fileInputStream = null;
        try {
            if (TextUtils.isEmpty(this.f13201ik)) {
                m16561lr();
            }
            if (TextUtils.isEmpty(this.f13201ik)) {
                return;
            }
            File file = new File(this.f13201ik, "tt_crash_count.properties");
            if (file.exists() && file.isFile() && file.canRead()) {
                Properties properties = new Properties();
                FileInputStream fileInputStream3 = new FileInputStream(file);
                try {
                    properties.load(fileInputStream3);
                    String property = properties.getProperty("crash_count", "0");
                    String property2 = properties.getProperty("crash_last_time", "0");
                    int iIntValue = Integer.valueOf(property).intValue();
                    if (System.currentTimeMillis() - Long.valueOf(property2).longValue() < 300000) {
                        i = iIntValue + 1;
                        objArr = false;
                    } else {
                        objArr = true;
                        i = 1;
                    }
                    boolean z = i >= 3;
                    int i2 = z ? 0 : i;
                    if (z) {
                        try {
                            file.delete();
                        } catch (Throwable unused) {
                        }
                    } else {
                        properties.setProperty("crash_count", String.valueOf(i2));
                        if (objArr != false) {
                            properties.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                        }
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            properties.store(fileOutputStream3, "tt_crash_info");
                            fileOutputStream2 = fileOutputStream3;
                        } catch (Throwable th2) {
                            fileOutputStream = fileOutputStream3;
                            th = th2;
                            fileInputStream = fileInputStream3;
                            C2707ac.m10206ri("TTCrashHandler", "crash count error", th);
                        }
                    }
                    if (z) {
                        m16560ik();
                    }
                    fileOutputStream = fileOutputStream2;
                    fileInputStream2 = fileInputStream3;
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    if (fileOutputStream == null) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                }
            } else {
                Properties properties2 = new Properties();
                properties2.setProperty("crash_count", "1");
                properties2.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                fileOutputStream = new FileOutputStream(file);
                try {
                    properties2.store(fileOutputStream, "tt_crash_info");
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (fileOutputStream == null) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        C2707ac.m10206ri("TTCrashHandler", "crash count error", th);
                    } finally {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable unused4) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        f13200ri = true;
        C2723mj.f7775ri = true;
        ThreadFactoryC2675fi.f7638ik = true;
        boolean zContains = false;
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            if (string != null) {
                zContains = string.contains(AdSlot.class.getPackage().getName());
            }
        } catch (Throwable unused) {
        }
        if (zContains) {
            m16563ri(thread, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13202lr;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
