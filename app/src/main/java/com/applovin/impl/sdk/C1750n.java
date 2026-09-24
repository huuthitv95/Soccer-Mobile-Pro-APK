package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1550f4;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1588j2;
import com.applovin.impl.C1788u6;
import com.applovin.impl.C1831z4;
import com.applovin.impl.InterfaceC1578i2;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.sdk.n */
/* JADX INFO: loaded from: classes3.dex */
public class C1750n {

    /* JADX INFO: renamed from: b */
    private final C1748l f3117b;

    /* JADX INFO: renamed from: c */
    private final C1768p f3118c;

    /* JADX INFO: renamed from: f */
    private final boolean f3121f;

    /* JADX INFO: renamed from: a */
    private final String f3116a = "FileManager";

    /* JADX INFO: renamed from: d */
    private final Object f3119d = new Object();

    /* JADX INFO: renamed from: e */
    private final Set f3120e = new HashSet();

    /* JADX INFO: renamed from: g */
    private final InterfaceC1578i2 f3122g = m4951a();

    C1750n(C1748l c1748l) {
        this.f3117b = c1748l;
        this.f3118c = c1748l.m4782Q();
        this.f3121f = ((Boolean) c1748l.m4801a(C1831z4.f3839V0)).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    private long m4949a(long j) {
        return j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    /* JADX INFO: renamed from: a */
    private long m4950a(Context context) {
        boolean zM4968g;
        long jM4960b = m4960b();
        boolean z = jM4960b != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List listM4821c = this.f3117b.m4821c(C1831z4.f3727H0);
        long length = 0;
        for (File file : m4963c(context)) {
            if (!z || listM4821c.contains(file.getName()) || m4964c(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= jM4960b) {
                zM4968g = false;
            } else {
                if (C1768p.m5160a()) {
                    this.f3118c.m5171a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                zM4968g = m4968g(file);
            }
            if (!zM4968g) {
                length += file.length();
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC1578i2 m4951a() {
        if (((Boolean) this.f3117b.m4801a(C1831z4.f4062v3)).booleanValue()) {
            try {
                return new C1550f4(this.f3117b);
            } catch (Throwable th) {
                if (C1768p.m5160a()) {
                    this.f3118c.m5172a("FileManager", "Error instantiating OkHttpLoader, falling back to HttpUrlConnectionLoader", th);
                }
                this.f3117b.m4764E().m4329a("FileManager", "instantiateOkHttpLoader", th);
            }
        }
        return new C1588j2(this.f3117b);
    }

    /* JADX INFO: renamed from: a */
    private File m4952a(String str, boolean z, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (C1768p.m5160a()) {
                this.f3118c.m5171a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (C1768p.m5160a()) {
            this.f3118c.m5171a("FileManager", "Looking up cached resource: " + str);
        }
        if (str.contains("icon")) {
            str = str.replace(RemoteSettings.FORWARD_SLASH_STRING, "_").replace(".", "_");
        }
        File fileM4965d = m4965d(context);
        File file = new File(fileM4965d, str);
        if (!z) {
            return file;
        }
        try {
            fileM4965d.mkdirs();
            return file;
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f3118c.m5172a("FileManager", "Unable to make cache directory at " + fileM4965d, th);
            }
            this.f3117b.m4764E().m4329a("FileManager", "createCacheDir", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private Map m4953a(File file, String str, long j, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
        CollectionUtils.putStringIfValid("url", str, mapHashMap);
        CollectionUtils.putObjectToStringIfValid("duration_ms", Long.valueOf(j), mapHashMap);
        mapHashMap.putAll(map);
        return mapHashMap;
    }

    /* JADX INFO: renamed from: a */
    private void m4954a(long j, Context context) {
        long jIntValue = ((Integer) this.f3117b.m4801a(C1831z4.f3695D0)).intValue();
        if (jIntValue == -1) {
            if (C1768p.m5160a()) {
                this.f3118c.m5171a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else if (m4949a(j) <= jIntValue) {
            if (C1768p.m5160a()) {
                this.f3118c.m5171a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        } else {
            if (C1768p.m5160a()) {
                this.f3118c.m5171a("FileManager", "Cache has exceeded maximum size; dropping...");
            }
            Iterator it = m4963c(context).iterator();
            while (it.hasNext()) {
                m4968g((File) it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m4955a(AbstractC1736b abstractC1736b, Context context) {
        Iterator it = new ArrayList(abstractC1736b.m4545l().keySet()).iterator();
        while (it.hasNext()) {
            m4968g(m4971a(Uri.parse((String) it.next()).getLastPathSegment(), context));
        }
        Uri uriMo4235i0 = abstractC1736b.mo4235i0();
        if (uriMo4235i0 != null) {
            m4968g(m4971a(uriMo4235i0.getLastPathSegment(), context));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4956a(boolean z, String str, int i, long j, Map map) {
        C1548f2 c1548f2 = z ? C1548f2.f1490N : C1548f2.f1492O;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        HashMap map2 = new HashMap(3);
        map2.put("attempt_number", Integer.toString(i));
        map2.put("url", str);
        map2.put("duration_ms", String.valueOf(jElapsedRealtime));
        map2.putAll(map);
        this.f3117b.m4830g().m2682d(c1548f2, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private boolean m4957a(File file, String str, List list, boolean z, int i, String str2, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        Map map2 = map;
        mapHashMap.putAll(map2);
        this.f3117b.m4830g().m2682d(C1548f2.f1486L, mapHashMap);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = 1;
        while (i2 <= i) {
            if (m4958a(file, str, list, z, str2, map2)) {
                m4956a(true, str, i2, jElapsedRealtime, map);
                return true;
            }
            i2++;
            map2 = map;
        }
        m4956a(false, str, i, jElapsedRealtime, map);
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m4958a(File file, String str, List list, boolean z, String str2, Map map) {
        Boolean bool = (Boolean) this.f3117b.m4801a(C1831z4.f3847W0);
        if (bool.booleanValue()) {
            m4966d(file);
        }
        if (m4977a(file)) {
            if (C1768p.m5160a()) {
                this.f3118c.m5171a("FileManager", "File exists for " + str);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
            mapHashMap.putAll(map);
            this.f3117b.m4830g().m2682d(C1548f2.f1488M, mapHashMap);
            if (((Boolean) this.f3117b.m4801a(C1831z4.f3863Y0)).booleanValue() && !file.setLastModified(System.currentTimeMillis())) {
                if (C1768p.m5160a()) {
                    this.f3118c.m5174b("FileManager", "Failed to refresh cache TTL for " + file.getName());
                }
                this.f3117b.m4764E().m2678a(C1548f2.f1511X0, "setLastModifiedFailed", mapHashMap);
            }
            if (!bool.booleanValue()) {
                return true;
            }
            m4969h(file);
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            InputStream inputStreamM4972a = m4972a(str, list, z, map);
            try {
                if (C1768p.m5160a()) {
                    this.f3118c.m5171a("FileManager", "Caching " + file.getAbsolutePath() + "...");
                }
                boolean zM4959a = m4959a(inputStreamM4972a, file, false, bool.booleanValue());
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (zM4959a) {
                    if (C1768p.m5160a()) {
                        this.f3118c.m5171a("FileManager", "Caching completed for " + file);
                    }
                    double dM4093d = AbstractC1701q7.m4093d(jElapsedRealtime2);
                    double dM4085c = AbstractC1701q7.m4085c(file.length());
                    long j = (long) (dM4085c / dM4093d);
                    Map mapM4953a = m4953a(file, str, jElapsedRealtime2, map);
                    CollectionUtils.putObjectToStringIfValid("network_throughput_kbps", Long.valueOf(j), mapM4953a);
                    CollectionUtils.putObjectToStringIfValid("details", Double.valueOf(dM4085c), mapM4953a);
                    this.f3117b.m4830g().m2682d(C1548f2.f1498R, mapM4953a);
                    this.f3117b.m4829f0().m2491b(j, str, str2);
                } else {
                    if (C1768p.m5160a()) {
                        this.f3118c.m5174b("FileManager", "Unable to cache " + file.getAbsolutePath());
                    }
                    this.f3117b.m4830g().m2682d(C1548f2.f1500S, m4953a(file, str, jElapsedRealtime2, map));
                }
                if (inputStreamM4972a != null) {
                    inputStreamM4972a.close();
                }
                if (bool.booleanValue()) {
                    m4969h(file);
                }
                return zM4959a;
            } catch (Throwable th) {
                if (inputStreamM4972a == null) {
                    throw th;
                }
                try {
                    inputStreamM4972a.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                this.f3118c.m5173a("FileManager", th3);
                this.f3117b.m4764E().m4329a("FileManager", "loadAndCacheResource", th3);
                return false;
            } finally {
                if (bool.booleanValue()) {
                    m4969h(file);
                }
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x013b */
    /* JADX WARN: Code duplicated, block: B:186:0x02eb A[Catch: all -> 0x0334, TRY_LEAVE, TryCatch #11 {all -> 0x0334, blocks: (B:184:0x02e5, B:186:0x02eb), top: B:244:0x02e5 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:191:0x0300  */
    /* JADX WARN: Code duplicated, block: B:252:0x0313 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m4959a(java.io.InputStream r20, java.io.File r21, boolean r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1750n.m4959a(java.io.InputStream, java.io.File, boolean, boolean):boolean");
    }

    /* JADX INFO: renamed from: b */
    private long m4960b() {
        long jLongValue = ((Long) this.f3117b.m4801a(C1831z4.f3687C0)).longValue();
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: b */
    private String m4961b(File file) {
        try {
            boolean zExists = file.exists();
            boolean zIsDirectory = file.isDirectory();
            String[] list = file.list();
            boolean z = true;
            boolean z2 = zIsDirectory && list != null && list.length == 0;
            File parentFile = file.getParentFile();
            boolean z3 = parentFile != null && parentFile.exists();
            if (!z3 || !parentFile.canWrite()) {
                z = false;
            }
            return "fileExists: " + zExists + "\nisDirectory: " + zIsDirectory + "\nisEmptyDirectory: " + z2 + "\nparentDirectoryExists: " + z3 + "\nisParentDirectoryWritable: " + z;
        } catch (Throwable th) {
            return "Error retrieving file deletion failure reason: " + th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m4962b(AbstractC1736b abstractC1736b, Context context) {
        if (abstractC1736b.mo4235i0() == null) {
            return;
        }
        m4968g(m4971a(abstractC1736b.mo4235i0().getLastPathSegment(), context));
    }

    /* JADX INFO: renamed from: c */
    private List m4963c(Context context) {
        File[] fileArrListFiles;
        File fileM4965d = m4965d(context);
        return (!fileM4965d.isDirectory() || (fileArrListFiles = fileM4965d.listFiles()) == null) ? Collections.EMPTY_LIST : Arrays.asList(fileArrListFiles);
    }

    /* JADX INFO: renamed from: c */
    private boolean m4964c(File file) {
        boolean zContains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f3119d) {
            zContains = this.f3120e.contains(absolutePath);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: d */
    private File m4965d(Context context) {
        return new File(context.getFilesDir(), CampaignEx.JSON_KEY_AD_AL);
    }

    /* JADX INFO: renamed from: d */
    private void m4966d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f3119d) {
            boolean zAdd = this.f3120e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.f3119d.wait();
                    zAdd = this.f3120e.add(absolutePath);
                } catch (InterruptedException e) {
                    if (C1768p.m5160a()) {
                        this.f3118c.m5172a("FileManager", "Lock '" + absolutePath + "' interrupted", e);
                    }
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m4967e(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f3119d) {
            if (this.f3120e.contains(absolutePath)) {
                return false;
            }
            m4966d(file);
            return true;
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m4968g(File file) {
        if (C1768p.m5160a()) {
            this.f3118c.m5171a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            m4966d(file);
            boolean zDelete = file.delete();
            if (!zDelete) {
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
                mapHashMap.put("details", m4961b(file));
                this.f3117b.m4764E().m2678a(C1548f2.f1511X0, "removeFile", mapHashMap);
            }
            m4969h(file);
            return zDelete;
        } catch (Throwable th) {
            try {
                if (C1768p.m5160a()) {
                    this.f3118c.m5172a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.f3117b.m4764E().m4329a("FileManager", "removeFile", th);
                return false;
            } finally {
                m4969h(file);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private void m4969h(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f3119d) {
            if (!this.f3120e.remove(absolutePath)) {
                this.f3117b.m4764E().m2678a(C1548f2.f1511X0, "unlockFile", CollectionUtils.hashMap("path", absolutePath));
            }
            this.f3119d.notifyAll();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m4970a(String str, AbstractC1736b abstractC1736b) {
        List listM4507T = abstractC1736b.m4507T();
        if (abstractC1736b.m4483G0() || listM4507T.contains(str)) {
            return abstractC1736b.m4473B();
        }
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public File m4971a(String str, Context context) {
        return m4952a(str, true, context);
    }

    /* JADX INFO: renamed from: a */
    public InputStream m4972a(String str, List list, boolean z, Map map) {
        if (z && !AbstractC1701q7.m4068a(str, list)) {
            if (C1768p.m5160a()) {
                this.f3118c.m5171a("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
        String httpsString = StringUtils.toHttpsString(str);
        if (C1768p.m5160a()) {
            this.f3118c.m5171a("FileManager", "Loading " + httpsString + "...");
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", httpsString);
        mapHashMap.putAll(map);
        this.f3117b.m4830g().m2682d(C1548f2.f1494P, mapHashMap);
        try {
            return this.f3122g.mo2582a(httpsString, map);
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f3118c.m5172a("FileManager", "Error loading " + httpsString, th);
            }
            this.f3117b.m4764E().m4332a("FileManager", "loadResource", th, CollectionUtils.hashMap("url", httpsString));
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m4973a(Context context, String str, String str2, List list, boolean z, int i, String str3, Map map) {
        return m4974a(context, str, str2, list, z, false, i, str3, map);
    }

    /* JADX INFO: renamed from: a */
    public String m4974a(Context context, String str, String str2, List list, boolean z, boolean z2, int i, String str3, Map map) {
        if (!StringUtils.isValidString(str)) {
            if (C1768p.m5160a()) {
                this.f3118c.m5171a("FileManager", "Nothing to cache, skipping...");
            }
            this.f3117b.m4764E().m2677a(C1548f2.f1511X0, "cacheResource");
            return null;
        }
        String strM4031a = AbstractC1701q7.m4031a(Uri.parse(str), str2, this.f3117b);
        File fileM4971a = m4971a(strM4031a, context);
        if (!m4957a(fileM4971a, str, list, z, i, str3, map)) {
            return null;
        }
        if (C1768p.m5160a()) {
            this.f3118c.m5171a("FileManager", "Caching succeeded for file " + strM4031a);
        }
        return z2 ? Uri.fromFile(fileM4971a).toString() : strM4031a;
    }

    /* JADX INFO: renamed from: a */
    public String m4975a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStream.read(bArr, 0, 8192);
                    if (i < 0) {
                        String string = byteArrayOutputStream.toString("UTF-8");
                        byteArrayOutputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    this.f3118c.m5173a("FileManager", th);
                    this.f3117b.m4764E().m4329a("FileManager", "readInputStreamAsString", th);
                    return null;
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f3118c.m5173a("FileManager", th3);
            this.f3117b.m4764E().m4329a("FileManager", "readInputStreamAsString", th3);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4976a(File file, String str) {
        if (C1768p.m5160a()) {
            this.f3118c.m5171a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
            mapHashMap.put("details", m4961b(file));
            this.f3117b.m4764E().m2678a(C1548f2.f1511X0, str, mapHashMap);
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f3118c.m5172a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.f3117b.m4764E().m4329a("FileManager", str, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m4977a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m4978a(File file, String str, List list, int i, String str2, Map map) {
        return m4957a(file, str, list, true, i, str2, map);
    }

    /* JADX INFO: renamed from: a */
    public boolean m4979a(InputStream inputStream, File file, boolean z) {
        return m4959a(inputStream, file, z, false);
    }

    /* JADX INFO: renamed from: b */
    public void m4980b(Context context) {
        if (this.f3117b.m4769G0()) {
            if (C1768p.m5160a()) {
                this.f3118c.m5171a("FileManager", "Compacting cache...");
            }
            m4954a(m4950a(context), context);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m4981b(String str, Context context) {
        return m4977a(m4952a(str, false, context));
    }

    /* JADX INFO: renamed from: c */
    public void m4982c(final AbstractC1736b abstractC1736b, final Context context) {
        this.f3117b.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f3117b, false, "removeCachedResourcesForAd", new Runnable() { // from class: com.applovin.impl.sdk.n$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4955a(abstractC1736b, context);
            }
        }), C1552f6.b.CACHING);
    }

    /* JADX INFO: renamed from: c */
    public boolean m4983c(String str, Context context) {
        if (this.f3121f) {
            return m4981b(str, context);
        }
        boolean z = false;
        File fileM4952a = m4952a(str, false, context);
        if (!m4967e(fileM4952a)) {
            return false;
        }
        if (fileM4952a.exists() && !fileM4952a.isDirectory()) {
            z = true;
        }
        m4969h(fileM4952a);
        return z;
    }

    /* JADX INFO: renamed from: d */
    public void m4984d(final AbstractC1736b abstractC1736b, final Context context) {
        this.f3117b.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f3117b, false, "removeCachedVideoResourceForAd", new Runnable() { // from class: com.applovin.impl.sdk.n$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4962b(abstractC1736b, context);
            }
        }), C1552f6.b.CACHING);
    }

    /* JADX INFO: renamed from: e */
    public void m4985e(Context context) {
        try {
            m4971a(".nomedia", context);
            File file = new File(m4965d(context), ".nomedia");
            if (m4977a(file)) {
                return;
            }
            if (C1768p.m5160a()) {
                this.f3118c.m5171a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (C1768p.m5160a()) {
                this.f3118c.m5174b("FileManager", "Failed to create .nomedia file");
            }
            this.f3117b.m4764E().m2677a(C1548f2.f1511X0, "createNoMediaFile");
        } catch (IOException e) {
            if (C1768p.m5160a()) {
                this.f3118c.m5172a("FileManager", "Failed to create .nomedia file", e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public String m4986f(File file) throws Throwable {
        if (file == null) {
            return null;
        }
        if (C1768p.m5160a()) {
            this.f3118c.m5171a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        boolean z = true;
        try {
            try {
                try {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                m4966d(file);
                                String strM4975a = m4975a(fileInputStream);
                                boolean z2 = strM4975a == null;
                                fileInputStream.close();
                                if (z2 && ((Boolean) this.f3117b.m4801a(C1831z4.f3775N0)).booleanValue()) {
                                    m4976a(file, "removeFileAfterReadFail");
                                }
                                m4969h(file);
                                return strM4975a;
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            if (C1768p.m5160a()) {
                                this.f3118c.m5172a("FileManager", "Unknown failure to read file.", th3);
                            }
                            this.f3118c.m5173a("FileManager", th3);
                            this.f3117b.m4764E().m4329a("FileManager", "readFile", th3);
                            if (((Boolean) this.f3117b.m4801a(C1831z4.f3775N0)).booleanValue()) {
                                m4976a(file, "removeFileAfterReadFail");
                            }
                            m4969h(file);
                            return null;
                        }
                    } catch (FileNotFoundException e) {
                        if (C1768p.m5160a()) {
                            this.f3118c.m5175d("FileManager", "File not found. " + e);
                        }
                        this.f3118c.m5173a("FileManager", e);
                        this.f3117b.m4764E().m4329a("FileManager", "readFileNotFound", e);
                        if (0 != 0 && ((Boolean) this.f3117b.m4801a(C1831z4.f3775N0)).booleanValue()) {
                            m4976a(file, "removeFileAfterReadFail");
                        }
                        m4969h(file);
                        return null;
                    }
                } catch (IOException e2) {
                    if (C1768p.m5160a()) {
                        this.f3118c.m5171a("FileManager", "Failed to read file: " + file.getName() + e2);
                    }
                    this.f3118c.m5173a("FileManager", e2);
                    this.f3117b.m4764E().m4329a("FileManager", "readFileIO", e2);
                    if (((Boolean) this.f3117b.m4801a(C1831z4.f3775N0)).booleanValue()) {
                        m4976a(file, "removeFileAfterReadFail");
                    }
                    m4969h(file);
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                if (z && ((Boolean) this.f3117b.m4801a(C1831z4.f3775N0)).booleanValue()) {
                    m4976a(file, "removeFileAfterReadFail");
                }
                m4969h(file);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            z = false;
        }
    }
}
