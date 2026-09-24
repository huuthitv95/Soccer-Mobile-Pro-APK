package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.play.core.assetpacks.internal.C10116o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bh */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9983bh {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22065a = new C10116o("AssetPackStorage");

    /* JADX INFO: renamed from: b */
    private static final long f22066b = TimeUnit.DAYS.toMillis(14);

    /* JADX INFO: renamed from: c */
    private static final long f22067c = TimeUnit.DAYS.toMillis(28);

    /* JADX INFO: renamed from: d */
    private final Context f22068d;

    /* JADX INFO: renamed from: e */
    private final C10059ec f22069e;

    C9983bh(Context context, C10059ec c10059ec) {
        this.f22068d = context;
        this.f22069e = c10059ec;
    }

    /* JADX INFO: renamed from: H */
    private static long m22540H(File file, boolean z) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f22065a.m22753e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            f22065a.m22751c(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* JADX INFO: renamed from: I */
    private final File m22541I(String str) {
        return new File(m22544L(), str);
    }

    /* JADX INFO: renamed from: J */
    private final File m22542J(String str, int i, long j) {
        return new File(m22566j(str, i, j), "merge.tmp");
    }

    /* JADX INFO: renamed from: K */
    private final File m22543K(String str, int i, long j) {
        return new File(new File(new File(m22545M(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* JADX INFO: renamed from: L */
    private final File m22544L() {
        return new File(this.f22068d.getFilesDir(), "assetpacks");
    }

    /* JADX INFO: renamed from: M */
    private final File m22545M() {
        return new File(m22544L(), "_tmp");
    }

    /* JADX INFO: renamed from: N */
    private static List m22546N(PackageInfo packageInfo, String str) {
        ArrayList arrayList = new ArrayList();
        if (packageInfo.splitNames != null) {
            for (int i = (-Arrays.binarySearch(packageInfo.splitNames, str)) - 1; i < packageInfo.splitNames.length && packageInfo.splitNames[i].startsWith(str); i++) {
                arrayList.add(packageInfo.applicationInfo.splitSourceDirs[i]);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    private final List m22547O() {
        ArrayList arrayList = new ArrayList();
        try {
            if (m22544L().exists() && m22544L().listFiles() != null) {
                for (File file : m22544L().listFiles()) {
                    if (!file.getCanonicalPath().equals(m22545M().getCanonicalPath())) {
                        arrayList.add(file);
                    }
                }
            }
        } catch (IOException e) {
            f22065a.m22750b("Could not process directory while scanning installed packs. %s", e);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    private static void m22548P(File file) {
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long jM22540H = m22540H(file, false);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(jM22540H)) && !file2.getName().equals("stale.tmp")) {
                m22549Q(file2);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    private static boolean m22549Q(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zM22549Q = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                zM22549Q &= m22549Q(file2);
            }
        }
        if (file.delete()) {
            return zM22549Q;
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    final void m22550A(String str, int i, long j, int i2) throws IOException {
        File fileM22542J = m22542J(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        fileM22542J.getParentFile().mkdirs();
        fileM22542J.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(fileM22542J);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* JADX INFO: renamed from: B */
    final void m22551B(String str, int i, long j) {
        File fileM22541I = m22541I(str);
        if (fileM22541I.exists()) {
            for (File file : fileM22541I.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    m22549Q(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j))) {
                            m22549Q(file2);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: C */
    final void m22552C(List list) {
        int iM22675a = this.f22069e.m22675a();
        for (File file : m22547O()) {
            if (!list.contains(file.getName()) && m22540H(file, true) != iM22675a) {
                m22549Q(file);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    final boolean m22553D(String str) {
        if (m22541I(str).exists()) {
            return m22549Q(m22541I(str));
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    final boolean m22554E(String str, int i, long j) {
        if (m22543K(str, i, j).exists()) {
            return m22549Q(m22543K(str, i, j));
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    final boolean m22555F(String str, int i, long j) {
        if (m22564h(str, i, j).exists()) {
            return m22549Q(m22564h(str, i, j));
        }
        return true;
    }

    /* JADX INFO: renamed from: G */
    final boolean m22556G(String str) {
        try {
            return m22574r(str) != null;
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    final int m22557a(String str) {
        return (int) m22540H(m22541I(str), true);
    }

    /* JADX INFO: renamed from: b */
    final int m22558b(String str, int i, long j) throws IOException {
        File fileM22542J = m22542J(str, i, j);
        if (!fileM22542J.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileM22542J);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") == null) {
                throw new C10013ck("Merge checkpoint file corrupt.");
            }
            try {
                return Integer.parseInt(properties.getProperty("numberOfMerges"));
            } catch (NumberFormatException e) {
                throw new C10013ck("Merge checkpoint file corrupt.", e);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    final long m22559c(String str) {
        return m22540H(m22563g(str, (int) m22540H(m22541I(str), true)), true);
    }

    /* JADX INFO: renamed from: d */
    final AssetLocation m22560d(String str, String str2, List list) {
        if (list == null) {
            return null;
        }
        String path = new File("assets", str2).getPath();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            try {
                AssetLocation assetLocationM22600a = C9995bt.m22600a(str3, path);
                if (assetLocationM22600a != null) {
                    return assetLocationM22600a;
                }
            } catch (IOException e) {
                f22065a.m22751c(e, "Failed to parse APK file '%s' looking for asset '%s'.", str3, str2);
                return null;
            }
        }
        f22065a.m22749a("The asset %s is not present in Asset Pack %s. Searched in APKs: %s", str2, str, list);
        return null;
    }

    /* JADX INFO: renamed from: e */
    final AssetLocation m22561e(String str, String str2, AssetPackLocation assetPackLocation) {
        File file = new File(assetPackLocation.assetsPath(), str2);
        if (file.exists()) {
            return new C9987bl(file.getPath(), 0L, file.length());
        }
        f22065a.m22749a("The asset %s is not present in Asset Pack %s. Searched in folder: %s", str2, str, assetPackLocation.assetsPath());
        return null;
    }

    /* JADX INFO: renamed from: f */
    final AssetPackLocation m22562f(String str) throws IOException {
        String strM22574r = m22574r(str);
        if (strM22574r == null) {
            return null;
        }
        File file = new File(strM22574r, "assets");
        if (file.isDirectory()) {
            return new C9988bm(0, strM22574r, file.getCanonicalPath());
        }
        f22065a.m22750b("Failed to find assets directory: %s", file);
        return null;
    }

    /* JADX INFO: renamed from: g */
    final File m22563g(String str, int i) {
        return new File(m22541I(str), String.valueOf(i));
    }

    /* JADX INFO: renamed from: h */
    final File m22564h(String str, int i, long j) {
        return new File(m22563g(str, i), String.valueOf(j));
    }

    /* JADX INFO: renamed from: i */
    final File m22565i(String str, int i, long j) {
        return new File(m22564h(str, i, j), "_metadata");
    }

    /* JADX INFO: renamed from: j */
    final File m22566j(String str, int i, long j) {
        return new File(m22543K(str, i, j), "_packs");
    }

    /* JADX INFO: renamed from: k */
    final File m22567k(String str, int i, long j) {
        return new File(m22565i(str, i, j), "properties.dat");
    }

    /* JADX INFO: renamed from: l */
    final File m22568l(String str, int i, long j) {
        return new File(new File(m22543K(str, i, j), "_slices"), "_metadata");
    }

    /* JADX INFO: renamed from: m */
    final File m22569m(String str, int i, long j, String str2) {
        return new File(m22571o(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* JADX INFO: renamed from: n */
    final File m22570n(String str, int i, long j, String str2) {
        return new File(m22571o(str, i, j, str2), "checkpoint.dat");
    }

    /* JADX INFO: renamed from: o */
    final File m22571o(String str, int i, long j, String str2) {
        return new File(m22568l(str, i, j), str2);
    }

    /* JADX INFO: renamed from: p */
    final File m22572p(String str, int i, long j, String str2) {
        return new File(new File(new File(m22543K(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* JADX INFO: renamed from: q */
    final File m22573q(String str, int i, long j, String str2) {
        return new File(new File(new File(m22543K(str, i, j), "_slices"), "_verified"), str2);
    }

    /* JADX INFO: renamed from: r */
    final String m22574r(String str) throws IOException {
        int length;
        File file = new File(m22544L(), str);
        if (!file.exists()) {
            f22065a.m22749a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f22069e.m22675a()));
        if (!file2.exists()) {
            f22065a.m22749a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f22069e.m22675a()));
            return null;
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) {
            f22065a.m22749a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f22069e.m22675a()));
            return null;
        }
        if (length <= 1) {
            return fileArrListFiles[0].getCanonicalPath();
        }
        f22065a.m22750b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f22069e.m22675a()));
        return null;
    }

    /* JADX INFO: renamed from: s */
    final List m22575s(String str) {
        PackageInfo packageInfo;
        String str2 = null;
        try {
            packageInfo = this.f22068d.getPackageManager().getPackageInfo(this.f22068d.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            f22065a.m22750b("Could not find PackageInfo.", new Object[0]);
            packageInfo = null;
        }
        if (packageInfo == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (packageInfo.splitNames == null || packageInfo.applicationInfo.splitSourceDirs == null) {
            f22065a.m22749a("No splits present for package %s.", str);
        } else {
            int iBinarySearch = Arrays.binarySearch(packageInfo.splitNames, str);
            if (iBinarySearch < 0) {
                f22065a.m22749a("Asset Pack '%s' is not installed.", str);
            } else {
                str2 = packageInfo.applicationInfo.splitSourceDirs[iBinarySearch];
            }
        }
        if (str2 == null) {
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            arrayList.addAll(m22546N(packageInfo, "config."));
            return arrayList;
        }
        arrayList.add(str2);
        arrayList.addAll(m22546N(packageInfo, String.valueOf(str).concat(".config.")));
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    final Map m22576t() {
        HashMap map = new HashMap();
        Iterator it = m22547O().iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int iM22540H = (int) m22540H(m22541I(name), true);
            long jM22540H = m22540H(m22563g(name, iM22540H), true);
            if (m22564h(name, iM22540H, jM22540H).exists()) {
                map.put(name, Long.valueOf(jM22540H));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: u */
    final Map m22577u() {
        HashMap map = new HashMap();
        for (String str : m22578v().keySet()) {
            map.put(str, Long.valueOf(m22559c(str)));
        }
        return map;
    }

    /* JADX INFO: renamed from: v */
    final Map m22578v() {
        HashMap map = new HashMap();
        try {
            for (File file : m22547O()) {
                AssetPackLocation assetPackLocationM22562f = m22562f(file.getName());
                if (assetPackLocationM22562f != null) {
                    map.put(file.getName(), assetPackLocationM22562f);
                }
            }
        } catch (IOException e) {
            f22065a.m22750b("Could not process directory while scanning installed packs: %s", e);
        }
        return map;
    }

    /* JADX INFO: renamed from: w */
    final void m22579w() {
        for (File file : m22547O()) {
            if (file.listFiles() != null) {
                m22548P(file);
                long jM22540H = m22540H(file, false);
                if (this.f22069e.m22675a() != jM22540H) {
                    try {
                        new File(new File(file, String.valueOf(jM22540H)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f22065a.m22750b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    m22548P(file2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    final void m22580x() {
        if (m22545M().exists()) {
            for (File file : m22545M().listFiles()) {
                if (System.currentTimeMillis() - file.lastModified() > f22066b) {
                    m22549Q(file);
                } else {
                    m22548P(file);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    final void m22581y() {
        for (File file : m22547O()) {
            if (file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    File file3 = new File(file2, "stale.tmp");
                    if (file3.exists() && System.currentTimeMillis() - file3.lastModified() > f22067c) {
                        m22549Q(file2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    final void m22582z() {
        m22549Q(m22544L());
    }
}
