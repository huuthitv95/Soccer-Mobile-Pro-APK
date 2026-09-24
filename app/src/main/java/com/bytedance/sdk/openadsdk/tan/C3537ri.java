package com.bytedance.sdk.openadsdk.tan;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.ihz;
import com.ironsource.C11744X3;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.tan.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3537ri {

    /* JADX INFO: renamed from: lr */
    private static final AtomicBoolean f12845lr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ri */
    private static boolean f12846ri = true;

    /* JADX INFO: renamed from: lr */
    private static String m16087lr() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX INFO: renamed from: lr */
    private static void m16088lr(Context context) throws Throwable {
        ?? r1;
        ?? r2;
        Throwable th;
        ?? r3;
        ?? r4;
        String strM16087lr = m16087lr();
        ?? randomAccessFile = "webview_data.lock";
        File file = new File(context.getDir(TextUtils.isEmpty(strM16087lr) ? C11744X3.i.f26336K : "webview_".concat(String.valueOf(strM16087lr)), 0).getPath(), "webview_data.lock");
        file.getAbsolutePath();
        if (file.exists()) {
            ?? th2 = 0;
            th2 = 0;
            fileChannel = null;
            FileChannel fileChannel = null;
            try {
                try {
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        FileChannel channel = randomAccessFile.getChannel();
                        if (channel != null) {
                            try {
                                th2 = channel.tryLock();
                            } catch (Exception unused) {
                                fileChannel = channel;
                                m16091ri(file);
                                th2 = fileChannel;
                                if (fileChannel != null) {
                                    try {
                                        fileChannel.close();
                                        th2 = fileChannel;
                                    } catch (Throwable th3) {
                                        th3.getMessage();
                                        th2 = th3;
                                    }
                                }
                                if (randomAccessFile != 0) {
                                    try {
                                        randomAccessFile.close();
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        th2.getMessage();
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                r4 = randomAccessFile;
                                r3 = channel;
                                if (r3 != 0) {
                                    try {
                                        r3.close();
                                    } catch (Throwable th6) {
                                        th6.getMessage();
                                    }
                                }
                                if (r4 == 0) {
                                    throw th;
                                }
                                try {
                                    r4.close();
                                    throw th;
                                } catch (Throwable th7) {
                                    th7.getMessage();
                                    throw th;
                                }
                            }
                        }
                        if (th2 != 0) {
                            th2.close();
                        } else {
                            m16091ri(file);
                        }
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Throwable th8) {
                                th2 = th8;
                                th2.getMessage();
                            }
                        }
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th9) {
                            th9.getMessage();
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th10) {
                    th = th10;
                    r2 = th2;
                    r1 = randomAccessFile;
                    th = th;
                    r4 = r1;
                    r3 = r2;
                    if (r3 != 0) {
                        r3.close();
                    }
                    if (r4 == 0) {
                        throw th;
                    }
                    r4.close();
                    throw th;
                }
            } catch (Exception unused3) {
                randomAccessFile = 0;
            } catch (Throwable th11) {
                th = th11;
                r1 = 0;
                r2 = 0;
                th = th;
                r4 = r1;
                r3 = r2;
                if (r3 != 0) {
                    r3.close();
                }
                if (r4 == 0) {
                    throw th;
                }
                r4.close();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16089ri() {
        f12846ri = false;
    }

    /* JADX INFO: renamed from: ri */
    public static void m16090ri(Context context) {
        if (context != null && f12846ri && f12845lr.compareAndSet(false, true)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (ihz.m10229ri(context)) {
                        m16088lr(context);
                        return;
                    }
                    String strM10227lr = ihz.m10227lr(context);
                    try {
                        if (TextUtils.isEmpty(strM10227lr)) {
                            strM10227lr = context.getPackageName() + Process.myPid();
                        }
                        WebView.setDataDirectorySuffix(strM10227lr);
                        C2707ac.m10205ri("TTAD.TTMultiInitHelper", "init: WebView.setDataDirectorySuffix with ".concat(String.valueOf(strM10227lr)));
                    } catch (IllegalStateException e) {
                        C2707ac.m10206ri("TTAD.TTMultiInitHelper", "init: ", e);
                        m16093ri(strM10227lr);
                    } catch (Exception e2) {
                        C2707ac.m10206ri("TTAD.TTMultiInitHelper", "init: ", e2);
                    }
                }
            } catch (Throwable th) {
                C2707ac.m10206ri("TTAD.TTMultiInitHelper", "init: ", th);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m16091ri(File file) {
        m16092ri(file, file.exists() ? file.delete() : false);
    }

    /* JADX INFO: renamed from: ri */
    private static void m16092ri(File file, boolean z) {
        if (!z || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            C2707ac.m10196ik("TTAD.TTMultiInitHelper", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m16093ri(String str) {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            Field field = (Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
            field.setAccessible(true);
            if (TextUtils.isEmpty((String) field.get(cls))) {
                field.set(cls, str);
            }
        } catch (Throwable th) {
            Log.e("TTAD.TTMultiInitHelper", "trySetDataDirectorySuffix: ", th);
        }
    }
}
