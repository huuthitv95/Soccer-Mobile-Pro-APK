package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.q8 */
/* JADX INFO: loaded from: classes3.dex */
public class C4001q8 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f15888a;

    /* JADX INFO: renamed from: b */
    public final C4023r8 f15889b;

    public C4001q8(Context context, AtomicReference atomicReference) {
        C4023r8 c4023r8 = new C4023r8(context.getCacheDir());
        this.f15889b = c4023r8;
        this.f15888a = atomicReference;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(((C3920mg) atomicReference.get()).f15384p);
            File file = new File(c4023r8.f16132a, "templates");
            if (file.exists()) {
                m19137a(file.listFiles(), jCurrentTimeMillis);
                m19136a(c4023r8);
            }
        } catch (Exception e) {
            C4048sb.m19410b("Exception while cleaning up templates directory at " + this.f15889b.f16137f.getPath(), e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public C4023r8 m19133a() {
        return this.f15889b;
    }

    /* JADX INFO: renamed from: a */
    public File m19134a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        File file2 = new File(file, str);
        if (!file2.exists() || file2.length() <= 0) {
            return null;
        }
        return file2;
    }

    /* JADX INFO: renamed from: a */
    public Boolean m19135a(C3651b0 c3651b0) {
        Map mapM16862d = c3651b0.m16862d();
        C4023r8 c4023r8M19133a = m19133a();
        if (c4023r8M19133a == null) {
            return Boolean.FALSE;
        }
        File file = c4023r8M19133a.f16132a;
        for (C4038s1 c4038s1 : mapM16862d.values()) {
            File fileM19376a = c4038s1.m19376a(file);
            if (fileM19376a == null) {
                return Boolean.FALSE;
            }
            if (!fileM19376a.exists()) {
                C4048sb.m19410b("Asset does not exist: " + c4038s1.f16218b, null);
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: a */
    public final void m19136a(C4023r8 c4023r8) {
        File file = new File(c4023r8.f16132a, ".adId");
        if (!file.exists() || file.delete()) {
            return;
        }
        C4048sb.m19410b("Unable to delete " + file.getPath(), null);
    }

    /* JADX INFO: renamed from: a */
    public final void m19137a(File[] fileArr, long j) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.isDirectory()) {
                    m19142b(file.listFiles(), j);
                    m19138a(file.listFiles(), file);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19138a(File[] fileArr, File file) {
        if (fileArr == null || fileArr.length != 0 || file.delete()) {
            return;
        }
        C4048sb.m19410b("Unable to delete " + file.getPath(), null);
    }

    /* JADX INFO: renamed from: a */
    public boolean m19139a(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.delete();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[Catch: Exception -> 0x001f, TRY_LEAVE, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x0010, B:10:0x0014, B:15:0x0023), top: B:19:0x0004 }] */
    /* JADX INFO: renamed from: b */
    public long m19140b(File file) {
        long jM19140b = 0;
        if (file != null) {
            try {
                if (file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            jM19140b += m19140b(file2);
                        }
                        return jM19140b;
                    }
                } else if (file != null) {
                    return file.length();
                }
            } catch (Exception e) {
                C4048sb.m19410b("getFolderSize: " + e, null);
            }
        } else if (file != null) {
            return file.length();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public File m19141b() {
        return this.f15889b.f16139h;
    }

    /* JADX INFO: renamed from: b */
    public final void m19142b(File[] fileArr, long j) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.lastModified() < j && !file.delete()) {
                    C4048sb.m19410b("Unable to delete " + file.getPath(), null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m19143c(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    /* JADX INFO: renamed from: c */
    public File[] m19144c() {
        File fileM19141b = m19141b();
        if (fileM19141b != null) {
            return fileM19141b.listFiles();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public File m19145d() {
        return this.f15889b.f16140i;
    }

    /* JADX INFO: renamed from: d */
    public void m19146d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                int i = randomAccessFile.read();
                randomAccessFile.seek(0L);
                randomAccessFile.write(i);
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e) {
            C4048sb.m19410b("File not found when attempting to touch", e);
        } catch (IOException e2) {
            C4048sb.m19410b("IOException when attempting to touch file", e2);
        }
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m19147e() {
        String[] list;
        JSONObject jSONObject = new JSONObject();
        try {
            File file = m19133a().f16132a;
            for (String str : ((C3920mg) this.f15888a.get()).f15385q) {
                if (!str.equals("templates")) {
                    File file2 = new File(file, str);
                    JSONArray jSONArray = new JSONArray();
                    if (file2.exists() && (list = file2.list()) != null) {
                        for (String str2 : list) {
                            if (!str2.equals(".nomedia") && !str2.endsWith(".tmp")) {
                                jSONArray.put(str2);
                            }
                        }
                    }
                    AbstractC4171y2.m20015a(jSONObject, str, jSONArray);
                }
            }
        } catch (Exception e) {
            C4048sb.m19410b("getWebViewCacheAssets: " + e, null);
        }
        return jSONObject;
    }
}
