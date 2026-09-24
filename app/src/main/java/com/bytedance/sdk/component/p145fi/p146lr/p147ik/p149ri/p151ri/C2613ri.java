package com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.p151ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2725qt;
import com.bytedance.sdk.component.utils.xha;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.ri.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2613ri {

    /* JADX INFO: renamed from: lr */
    private File f7368lr;

    /* JADX INFO: renamed from: ri */
    private int f7369ri;

    private C2613ri(int i, File file) {
        this.f7369ri = i;
        this.f7368lr = file;
    }

    /* JADX INFO: renamed from: ik */
    private File m9708ik(String str) {
        return new File(this.f7368lr, str + ".temp");
    }

    /* JADX INFO: renamed from: ik */
    private void m9709ik(File file) {
        if (file == null) {
            return;
        }
        try {
            xha.m10329lr(file);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ka */
    private static void m9710ka(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: lr */
    private File m9711lr(String str) {
        return new File(this.f7368lr, str);
    }

    /* JADX INFO: renamed from: lr */
    private List<File> m9712lr(File file) {
        List<File> listM9714ri = m9714ri(file);
        if (listM9714ri == null || listM9714ri.isEmpty()) {
            return null;
        }
        final HashMap map = new HashMap();
        for (File file2 : listM9714ri) {
            map.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(listM9714ri, new Comparator<File>() { // from class: com.bytedance.sdk.component.fi.lr.ik.ri.ri.ri.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public int compare(File file3, File file4) {
                if (file3 == null && file4 == null) {
                    return 0;
                }
                if (file3 == null) {
                    return 1;
                }
                if (file4 == null) {
                    return -1;
                }
                return Long.compare(((Long) map.get(file4)).longValue(), ((Long) map.get(file3)).longValue());
            }
        });
        return listM9714ri;
    }

    /* JADX INFO: renamed from: ri */
    public static C2613ri m9713ri(int i, File file) {
        try {
            C2613ri c2613ri = new C2613ri(i, file);
            if (file != null) {
                file.mkdirs();
            }
            return c2613ri;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    private List<File> m9714ri(File file) {
        File[] fileArrListFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                    List<File> listAsList = Arrays.asList(fileArrListFiles);
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listAsList) {
                        if (file2 != null && file2.isFile() && !TextUtils.isEmpty(file2.getName()) && !file2.getName().endsWith(".temp")) {
                            arrayList.add(file2);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private void m9715ri(File file, File file2, boolean z) throws IOException {
        if (z) {
            m9710ka(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: ri */
    public synchronized InputStream m9716ri(String str) {
        FileInputStream fileInputStream;
        if (this.f7369ri <= 0) {
            return null;
        }
        File fileM9711lr = m9711lr(str);
        try {
            try {
                fileInputStream = new FileInputStream(fileM9711lr);
                try {
                    m9709ik(fileM9711lr);
                    return fileInputStream;
                } catch (FileNotFoundException unused) {
                    C2725qt.m10269ri(fileInputStream);
                    return null;
                }
            } catch (Throwable unused2) {
                return null;
            }
        } catch (FileNotFoundException unused3) {
            fileInputStream = null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public synchronized void m9717ri(int i) {
        try {
            if (i > this.f7369ri) {
                return;
            }
            List<File> listM9712lr = m9712lr(this.f7368lr);
            if (listM9712lr != null && listM9712lr.size() > i) {
                while (i < listM9712lr.size()) {
                    File file = listM9712lr.get(i);
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    i++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public synchronized boolean m9718ri(String str, byte[] bArr) {
        if (this.f7369ri > 0 && str != null && bArr != null) {
            File fileM9708ik = m9708ik(str);
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileM9708ik);
                try {
                    fileOutputStream2.write(bArr);
                    if (fileM9708ik.exists()) {
                        m9715ri(fileM9708ik, m9711lr(str), true);
                    }
                    C2725qt.m10269ri(fileOutputStream2);
                    List<File> listM9714ri = m9714ri(this.f7368lr);
                    if (listM9714ri != null) {
                        int size = listM9714ri.size();
                        int i = this.f7369ri;
                        if (size > i) {
                            m9717ri((int) (((double) i) * 0.7d));
                        }
                    }
                    return true;
                } catch (FileNotFoundException unused) {
                    fileOutputStream = fileOutputStream2;
                    try {
                        File file = this.f7368lr;
                        if (file != null) {
                            file.mkdirs();
                        }
                        C2725qt.m10269ri(fileOutputStream);
                        List<File> listM9714ri2 = m9714ri(this.f7368lr);
                        if (listM9714ri2 != null) {
                            int size2 = listM9714ri2.size();
                            int i2 = this.f7369ri;
                            if (size2 > i2) {
                                m9717ri((int) (((double) i2) * 0.7d));
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        C2725qt.m10269ri(fileOutputStream);
                        List<File> listM9714ri3 = m9714ri(this.f7368lr);
                        if (listM9714ri3 != null) {
                            int size3 = listM9714ri3.size();
                            int i3 = this.f7369ri;
                            if (size3 > i3) {
                                m9717ri((int) (((double) i3) * 0.7d));
                            }
                        }
                        throw th;
                    }
                } catch (Throwable unused2) {
                    fileOutputStream = fileOutputStream2;
                    C2725qt.m10269ri(fileOutputStream);
                    List<File> listM9714ri4 = m9714ri(this.f7368lr);
                    if (listM9714ri4 != null) {
                        int size4 = listM9714ri4.size();
                        int i4 = this.f7369ri;
                        if (size4 > i4) {
                            m9717ri((int) (((double) i4) * 0.7d));
                        }
                    }
                    return false;
                }
            } catch (FileNotFoundException unused3) {
            } catch (Throwable unused4) {
            }
        }
        return false;
    }
}
