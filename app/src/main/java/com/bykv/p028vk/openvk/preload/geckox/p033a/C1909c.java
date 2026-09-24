package com.bykv.p028vk.openvk.preload.geckox.p033a;

import com.bykv.p028vk.openvk.preload.geckox.p047f.C1953a;
import com.bykv.p028vk.openvk.preload.geckox.p047f.C1954b;
import com.bykv.p028vk.openvk.preload.geckox.p047f.C1955c;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1964a;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1965b;
import com.bykv.p028vk.openvk.preload.geckox.utils.ExecutorC1966c;
import com.bykv.p028vk.openvk.preload.geckox.utils.ExecutorC1969f;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.c */
/* JADX INFO: compiled from: ChannelCleanHelper.java */
/* JADX INFO: loaded from: classes9.dex */
public final class C1909c {
    /* JADX INFO: renamed from: a */
    private static List<File> m5913a(File[] fileArr) {
        long j;
        ArrayList<File> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File file = null;
        long j2 = -1;
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (name.endsWith("--updating")) {
                arrayList.add(file2);
            } else if (name.endsWith("--pending-delete")) {
                m5914a(file2);
            } else {
                try {
                    long j3 = Long.parseLong(name);
                    if (j3 > j2) {
                        if (file != null) {
                            try {
                                arrayList2.add(file);
                            } catch (Exception unused) {
                                j2 = j3;
                                m5914a(file2);
                            }
                        }
                        file = file2;
                        j2 = j3;
                    } else {
                        arrayList2.add(file2);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        for (File file3 : arrayList) {
            String name2 = file3.getName();
            int iIndexOf = name2.indexOf("--updating");
            if (iIndexOf == -1) {
                m5914a(file3);
            } else {
                try {
                    j = Long.parseLong(name2.substring(0, iIndexOf));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    j = -1;
                }
                if (j <= j2) {
                    m5914a(file3);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: a */
    private static void m5914a(final File file) {
        ExecutorC1966c.m6079a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.3
            @Override // java.lang.Runnable
            public final void run() {
                C1965b.m6075a(file);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5915a(final String str) {
        ExecutorC1969f.m6083a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C1909c.m5917c(str);
                } catch (Throwable th) {
                    C1964a.m6069a(new RuntimeException("delete old channel version failed，path：" + str, th));
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5916b(String str) {
        try {
            C1953a c1953aM6024a = C1953a.m6024a(str + File.separator + "update.lock");
            if (c1953aM6024a == null) {
                return true;
            }
            try {
                C1954b c1954bM6026a = C1954b.m6026a(str + File.separator + "select.lock");
                try {
                    C1965b.m6077c(new File(str));
                } catch (Throwable unused) {
                }
                c1954bM6026a.m6027a();
                return true;
            } finally {
                c1953aM6024a.m6025a();
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m5917c(String str) throws Exception {
        C1953a c1953aM6024a = C1953a.m6024a(str + File.separator + "update.lock");
        if (c1953aM6024a != null) {
            try {
                C1954b c1954bM6026a = C1954b.m6026a(str + File.separator + "select.lock");
                try {
                    File[] fileArrListFiles = new File(str).listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.2
                        @Override // java.io.FileFilter
                        public final boolean accept(File file) {
                            return file.isDirectory();
                        }
                    });
                    List<File> listM5913a = (fileArrListFiles == null || fileArrListFiles.length == 0 || fileArrListFiles.length == 1) ? null : m5913a(fileArrListFiles);
                    if (listM5913a != null && !listM5913a.isEmpty()) {
                        Iterator<File> it = listM5913a.iterator();
                        while (it.hasNext()) {
                            C1955c.m6030c(it.next().getAbsolutePath() + File.separator + "using.lock");
                        }
                        c1954bM6026a.m6027a();
                        c1953aM6024a.m6025a();
                        return;
                    }
                    c1954bM6026a.m6027a();
                    c1953aM6024a.m6025a();
                } catch (Throwable th) {
                    c1954bM6026a.m6027a();
                    throw th;
                }
            } catch (Throwable th2) {
                c1953aM6024a.m6025a();
                throw th2;
            }
        }
    }
}
