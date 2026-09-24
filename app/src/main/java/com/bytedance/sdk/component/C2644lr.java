package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2644lr {

    /* JADX INFO: renamed from: aw */
    private static ArrayMap<File, C2644lr> f7495aw;

    /* JADX INFO: renamed from: co */
    private static ArrayMap<String, File> f7496co;

    /* JADX INFO: renamed from: lr */
    private static boolean f7497lr;

    /* JADX INFO: renamed from: ri */
    protected static ri f7498ri;

    /* JADX INFO: renamed from: di */
    private volatile boolean f7499di;

    /* JADX INFO: renamed from: fi */
    private Properties f7500fi;

    /* JADX INFO: renamed from: ik */
    private final Object f7501ik;
    private long jbs;

    /* JADX INFO: renamed from: ka */
    private final Object f7502ka;

    /* JADX INFO: renamed from: mj */
    private long f7503mj;

    /* JADX INFO: renamed from: qt */
    private final File f7504qt;

    /* JADX INFO: renamed from: sf */
    private final File f7505sf;
    private int xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.lr$ik */
    /* JADX INFO: loaded from: classes9.dex */
    public class ik implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: lr */
        private final Object f7513lr = new Object();

        /* JADX INFO: renamed from: ik */
        private final Map<String, Object> f7511ik = new HashMap();

        /* JADX INFO: renamed from: ka */
        private boolean f7512ka = false;

        public ik() {
        }

        /* JADX INFO: renamed from: lr */
        private lr m9862lr() {
            Properties properties;
            long j;
            Object obj;
            boolean z;
            synchronized (C2644lr.this.f7501ik) {
                try {
                    if (C2644lr.this.xha > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(C2644lr.this.f7500fi);
                        C2644lr.this.f7500fi = properties2;
                    }
                    properties = C2644lr.this.f7500fi;
                    C2644lr.m9840fi(C2644lr.this);
                    synchronized (this.f7513lr) {
                        boolean z2 = false;
                        if (this.f7512ka) {
                            if (properties.isEmpty()) {
                                z = false;
                            } else {
                                properties.clear();
                                z = true;
                            }
                            this.f7512ka = false;
                            z2 = z;
                        }
                        for (Map.Entry<String, Object> entry : this.f7511ik.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (value == this || value == null) {
                                if (properties.containsKey(key)) {
                                    properties.remove(key);
                                    z2 = true;
                                }
                            } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                properties.put(key, String.valueOf(value));
                                z2 = true;
                            }
                        }
                        this.f7511ik.clear();
                        if (z2) {
                            C2644lr.m9839di(C2644lr.this);
                        }
                        j = C2644lr.this.f7503mj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new lr(j, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            C2644lr.this.m9853ri(m9862lr(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long jCurrentTimeMillis = C2644lr.f7497lr ? System.currentTimeMillis() : 0L;
            lr lrVarM9862lr = m9862lr();
            C2644lr.this.m9853ri(lrVarM9862lr, true);
            try {
                lrVarM9862lr.f7516ik.await();
                return lrVarM9862lr.f7517ka;
            } catch (InterruptedException unused) {
            } finally {
                if (C2644lr.f7497lr) {
                    Log.d("TTPropHelper", C2644lr.this.f7504qt.getName() + CertificateUtil.DELIMITER + lrVarM9862lr.f7519ri + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return m9869ri(str, (Set<String>) set);
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ik clear() {
            synchronized (this.f7513lr) {
                this.f7512ka = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ik remove(String str) {
            synchronized (this.f7513lr) {
                this.f7511ik.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ik putFloat(String str, float f) {
            synchronized (this.f7513lr) {
                this.f7511ik.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ik putInt(String str, int i) {
            synchronized (this.f7513lr) {
                this.f7511ik.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ik putLong(String str, long j) {
            synchronized (this.f7513lr) {
                this.f7511ik.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ik putString(String str, String str2) {
            synchronized (this.f7513lr) {
                this.f7511ik.put(str, str2);
            }
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ik m9869ri(String str, Set<String> set) {
            synchronized (this.f7513lr) {
                this.f7511ik.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ik putBoolean(String str, boolean z) {
            synchronized (this.f7513lr) {
                this.f7511ik.put(str, Boolean.valueOf(z));
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.lr$lr */
    private static class lr {

        /* JADX INFO: renamed from: fi */
        boolean f7515fi;

        /* JADX INFO: renamed from: ik */
        final CountDownLatch f7516ik;

        /* JADX INFO: renamed from: ka */
        volatile boolean f7517ka;

        /* JADX INFO: renamed from: lr */
        final Properties f7518lr;

        /* JADX INFO: renamed from: ri */
        final long f7519ri;

        private lr(long j, Properties properties) {
            this.f7516ik = new CountDownLatch(1);
            this.f7517ka = false;
            this.f7515fi = false;
            this.f7519ri = j;
            this.f7518lr = properties;
        }

        /* JADX INFO: renamed from: ri */
        void m9871ri(boolean z, boolean z2) {
            this.f7515fi = z;
            this.f7517ka = z2;
            this.f7516ik.countDown();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.lr$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        HandlerThread mo9872ri(String str, int i);

        /* JADX INFO: renamed from: ri */
        ExecutorService mo9873ri();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.bytedance.sdk.component.lr$1] */
    private C2644lr(File file) {
        Object obj = new Object();
        this.f7501ik = obj;
        this.f7502ka = new Object();
        this.f7500fi = new Properties();
        this.f7499di = false;
        this.xha = 0;
        this.f7504qt = file;
        this.f7505sf = m9851ri(file);
        synchronized (obj) {
            this.f7499di = false;
        }
        ri riVar = f7498ri;
        if (riVar == null || riVar.mo9873ri() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.lr.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    C2644lr.this.m9860ri();
                }
            }.start();
        } else {
            f7498ri.mo9873ri().execute(new Runnable() { // from class: com.bytedance.sdk.component.lr.2
                @Override // java.lang.Runnable
                public void run() {
                    C2644lr.this.m9860ri();
                }
            });
        }
    }

    /* JADX INFO: renamed from: di */
    static /* synthetic */ long m9839di(C2644lr c2644lr) {
        long j = c2644lr.f7503mj;
        c2644lr.f7503mj = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: fi */
    static /* synthetic */ int m9840fi(C2644lr c2644lr) {
        int i = c2644lr.xha;
        c2644lr.xha = i + 1;
        return i;
    }

    static /* synthetic */ int jbs(C2644lr c2644lr) {
        int i = c2644lr.xha;
        c2644lr.xha = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: ka */
    private void m9844ka() {
        while (!this.f7499di) {
            try {
                this.f7501ik.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:108:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0121 A[Catch: all -> 0x0193, TryCatch #3 {all -> 0x0193, blocks: (B:39:0x0090, B:40:0x0092, B:74:0x011d, B:76:0x0121, B:78:0x0128, B:80:0x0131, B:82:0x0139, B:84:0x0145, B:93:0x0191, B:94:0x0192, B:73:0x011c, B:54:0x00e7, B:55:0x00ed, B:72:0x0115, B:91:0x018f, B:90:0x0186, B:69:0x0110, B:87:0x0181, B:51:0x00e2), top: B:107:0x0090, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0126  */
    /* JADX WARN: Code duplicated, block: B:80:0x0131 A[Catch: all -> 0x0193, TryCatch #3 {all -> 0x0193, blocks: (B:39:0x0090, B:40:0x0092, B:74:0x011d, B:76:0x0121, B:78:0x0128, B:80:0x0131, B:82:0x0139, B:84:0x0145, B:93:0x0191, B:94:0x0192, B:73:0x011c, B:54:0x00e7, B:55:0x00ed, B:72:0x0115, B:91:0x018f, B:90:0x0186, B:69:0x0110, B:87:0x0181, B:51:0x00e2), top: B:107:0x0090, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0137  */
    /* JADX WARN: Code duplicated, block: B:84:0x0145 A[Catch: all -> 0x0193, TRY_LEAVE, TryCatch #3 {all -> 0x0193, blocks: (B:39:0x0090, B:40:0x0092, B:74:0x011d, B:76:0x0121, B:78:0x0128, B:80:0x0131, B:82:0x0139, B:84:0x0145, B:93:0x0191, B:94:0x0192, B:73:0x011c, B:54:0x00e7, B:55:0x00ed, B:72:0x0115, B:91:0x018f, B:90:0x0186, B:69:0x0110, B:87:0x0181, B:51:0x00e2), top: B:107:0x0090, inners: #0 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x0145, please report this as an issue */
    /* JADX INFO: renamed from: lr */
    public void m9846lr(lr lrVar, boolean z) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        Throwable th;
        long jCurrentTimeMillis3;
        String str;
        String message;
        long jCurrentTimeMillis4;
        long jCurrentTimeMillis5;
        boolean z2;
        long jCurrentTimeMillis6 = f7497lr ? System.currentTimeMillis() : 0L;
        boolean zExists = this.f7504qt.exists();
        if (f7497lr) {
            jCurrentTimeMillis = System.currentTimeMillis();
            jCurrentTimeMillis2 = jCurrentTimeMillis;
        } else {
            jCurrentTimeMillis = 0;
            jCurrentTimeMillis2 = 0;
        }
        if (zExists) {
            if (this.jbs >= lrVar.f7519ri) {
                z2 = false;
            } else if (z) {
                z2 = true;
            } else {
                synchronized (this.f7501ik) {
                    z2 = this.f7503mj == lrVar.f7519ri;
                }
            }
            if (!z2) {
                lrVar.m9871ri(false, true);
                return;
            }
            boolean zExists2 = this.f7505sf.exists();
            if (f7497lr) {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            if (zExists2) {
                this.f7504qt.delete();
            } else if (!this.f7504qt.renameTo(this.f7505sf)) {
                Log.e("TTPropHelper", "Couldn't rename file " + this.f7504qt + " to backup file " + this.f7505sf);
                lrVar.m9871ri(false, false);
                return;
            }
        }
        try {
            synchronized (this.f7502ka) {
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(this.f7504qt);
                        try {
                            try {
                                jCurrentTimeMillis3 = f7497lr ? System.currentTimeMillis() : 0L;
                                try {
                                    lrVar.f7518lr.store(fileOutputStream2, (String) null);
                                    if (f7497lr) {
                                        Log.d("TTPropHelper", "save: " + lrVar.f7518lr);
                                        Log.d("TTPropHelper", "saveToLocal: save to" + this.f7504qt.getAbsolutePath() + "success");
                                    }
                                    try {
                                        fileOutputStream2.close();
                                    } catch (Throwable th2) {
                                        str = "TTPropHelper";
                                        message = th2.getMessage();
                                        Log.w(str, message);
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    fileOutputStream = fileOutputStream2;
                                    Log.e("TTPropHelper", "saveToLocal: ", e);
                                    lrVar.m9871ri(false, false);
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th3) {
                                            str = "TTPropHelper";
                                            message = th3.getMessage();
                                            Log.w(str, message);
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                fileOutputStream = fileOutputStream2;
                                if (fileOutputStream == null) {
                                    throw th;
                                }
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (Throwable th5) {
                                    Log.w("TTPropHelper", th5.getMessage());
                                    throw th;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            jCurrentTimeMillis3 = 0;
                            Log.e("TTPropHelper", "saveToLocal: ", e);
                            lrVar.m9871ri(false, false);
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (f7497lr) {
                                jCurrentTimeMillis4 = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis4 = 0;
                            }
                            this.f7505sf.delete();
                            if (f7497lr) {
                                jCurrentTimeMillis5 = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis5 = 0;
                            }
                            this.jbs = lrVar.f7519ri;
                            lrVar.m9871ri(true, true);
                            if (f7497lr) {
                                Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + RemoteSettings.FORWARD_SLASH_STRING + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + RemoteSettings.FORWARD_SLASH_STRING + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + RemoteSettings.FORWARD_SLASH_STRING + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + RemoteSettings.FORWARD_SLASH_STRING + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
            if (f7497lr) {
                jCurrentTimeMillis4 = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis4 = 0;
            }
            this.f7505sf.delete();
            if (f7497lr) {
                jCurrentTimeMillis5 = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis5 = 0;
            }
            this.jbs = lrVar.f7519ri;
            lrVar.m9871ri(true, true);
            if (f7497lr) {
                Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + RemoteSettings.FORWARD_SLASH_STRING + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + RemoteSettings.FORWARD_SLASH_STRING + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + RemoteSettings.FORWARD_SLASH_STRING + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + RemoteSettings.FORWARD_SLASH_STRING + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
            }
        } catch (Throwable th7) {
            Log.w("TTPropHelper", "writeToFile: Got exception:", th7);
            if (this.f7504qt.exists() && !this.f7504qt.delete()) {
                Log.e("TTPropHelper", "Couldn't clean up partially-written file " + this.f7504qt);
            }
            lrVar.m9871ri(false, false);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C2644lr m9849ri(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (C2644lr.class) {
            if (f7496co == null) {
                f7496co = new ArrayMap<>();
            }
            File file = f7496co.get(str);
            if (file == null) {
                file = new File(context.getFilesDir(), str);
                f7496co.put(str, file);
            }
            if (f7495aw == null) {
                f7495aw = new ArrayMap<>();
            }
            C2644lr c2644lr = f7495aw.get(file);
            if (c2644lr != null) {
                return c2644lr;
            }
            C2644lr c2644lr2 = new C2644lr(file);
            f7495aw.put(file, c2644lr2);
            return c2644lr2;
        }
    }

    /* JADX INFO: renamed from: ri */
    static File m9851ri(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m9853ri(final lr lrVar, final boolean z) {
        boolean z2;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.lr.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (C2644lr.this.f7502ka) {
                    try {
                        C2644lr.this.m9846lr(lrVar, z);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (C2644lr.this.f7501ik) {
                    C2644lr.jbs(C2644lr.this);
                }
            }
        };
        if (z) {
            synchronized (this.f7501ik) {
                z2 = this.xha == 1;
            }
            if (z2) {
                runnable.run();
                return;
            }
        }
        C2632ik.m9746ri(runnable, true ^ z);
    }

    /* JADX INFO: renamed from: ri */
    public static void m9854ri(ri riVar) {
        f7498ri = riVar;
    }

    /* JADX INFO: renamed from: lr */
    public ik m9856lr() {
        return new ik();
    }

    /* JADX INFO: renamed from: ri */
    public int m9857ri(String str, int i) {
        int i2;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f7501ik) {
                try {
                    try {
                        m9844ka();
                        i2 = Integer.parseInt(this.f7500fi.getProperty(str, String.valueOf(i)));
                    } catch (NumberFormatException e) {
                        Log.e("TTPropHelper", e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i2;
        }
        return i;
    }

    /* JADX INFO: renamed from: ri */
    public long m9858ri(String str, long j) {
        long j2;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f7501ik) {
                try {
                    try {
                        m9844ka();
                        j2 = Long.parseLong(this.f7500fi.getProperty(str, String.valueOf(j)));
                    } catch (NumberFormatException e) {
                        Log.e("TTPropHelper", e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return j2;
        }
        return j;
    }

    /* JADX INFO: renamed from: ri */
    public String m9859ri(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.f7501ik) {
            m9844ka();
            property = this.f7500fi.getProperty(str, str2);
        }
        return property;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5 A[Catch: all -> 0x00e1, TryCatch #0 {, blocks: (B:48:0x00cf, B:50:0x00d5, B:51:0x00d7, B:52:0x00df), top: B:60:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7 A[Catch: all -> 0x00e1, TryCatch #0 {, blocks: (B:48:0x00cf, B:50:0x00d5, B:51:0x00d7, B:52:0x00df), top: B:60:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ri */
    public void m9860ri() {
        FileInputStream fileInputStream;
        Throwable th;
        synchronized (this.f7501ik) {
            if (this.f7499di) {
                if (f7497lr) {
                    Log.d("TTPropHelper", "reload: already loaded, ignore");
                }
                return;
            }
            if (this.f7505sf.exists()) {
                this.f7504qt.delete();
                this.f7505sf.renameTo(this.f7504qt);
            }
            if (f7497lr) {
                Log.d("TTPropHelper", "reload: " + this.f7504qt.getAbsolutePath() + ", exist? " + this.f7504qt.exists());
            }
            Properties properties = null;
            if (this.f7504qt.exists()) {
                Properties properties2 = new Properties();
                try {
                    try {
                        fileInputStream = new FileInputStream(this.f7504qt);
                        try {
                            properties2.load(fileInputStream);
                            if (f7497lr) {
                                Log.d("TTPropHelper", "reload: find " + properties2.size() + " ,items from " + this.f7504qt.getAbsolutePath());
                            }
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                Log.e("TTPropHelper", "reload: ", th);
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                properties = properties2;
                                synchronized (this.f7501ik) {
                                    if (properties == null) {
                                        this.f7499di = true;
                                        this.f7501ik.notifyAll();
                                    } else {
                                        if (!properties.isEmpty()) {
                                            this.f7500fi = properties;
                                        }
                                        this.f7499di = true;
                                        this.f7501ik.notifyAll();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th4) {
                                        Log.w("TTPropHelper", th4.getMessage());
                                    }
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        fileInputStream = null;
                        th = th5;
                    }
                } catch (Throwable th6) {
                    Log.w("TTPropHelper", th6.getMessage());
                }
                properties = properties2;
            }
            synchronized (this.f7501ik) {
                if (properties == null) {
                    if (!properties.isEmpty()) {
                        this.f7500fi = properties;
                    }
                    this.f7499di = true;
                    this.f7501ik.notifyAll();
                } else {
                    this.f7499di = true;
                    this.f7501ik.notifyAll();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m9861ri(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f7501ik) {
                try {
                    try {
                        m9844ka();
                        z2 = Boolean.parseBoolean(this.f7500fi.getProperty(str, String.valueOf(z)));
                    } catch (NumberFormatException e) {
                        Log.e("TTPropHelper", e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z2;
        }
        return z;
    }
}
