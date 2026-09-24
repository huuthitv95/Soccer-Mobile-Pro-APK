package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.w6 */
/* JADX INFO: loaded from: classes3.dex */
public class C4131w6 {

    /* JADX INFO: renamed from: a */
    public final Executor f16685a;

    /* JADX INFO: renamed from: b */
    public final C3746f3 f16686b;

    /* JADX INFO: renamed from: c */
    public final C3769g3 f16687c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f16688d;

    /* JADX INFO: renamed from: e */
    public final C3921mh f16689e;

    /* JADX INFO: renamed from: f */
    public final C4001q8 f16690f;

    /* JADX INFO: renamed from: g */
    public int f16691g = 1;

    /* JADX INFO: renamed from: h */
    public C4170y1 f16692h = null;

    /* JADX INFO: renamed from: i */
    public final PriorityQueue f16693i = new PriorityQueue();

    /* JADX INFO: renamed from: j */
    public final InterfaceC4000q7 f16694j;

    public C4131w6(Executor executor, C4001q8 c4001q8, C3746f3 c3746f3, C3769g3 c3769g3, AtomicReference atomicReference, C3921mh c3921mh, InterfaceC4000q7 interfaceC4000q7) {
        this.f16685a = executor;
        this.f16690f = c4001q8;
        this.f16686b = c3746f3;
        this.f16687c = c3769g3;
        this.f16688d = atomicReference;
        this.f16689e = c3921mh;
        this.f16694j = interfaceC4000q7;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m19750a() {
        int i = this.f16691g;
        if (i == 1) {
            C4048sb.m19407a("Change state to PAUSED", null);
            this.f16691g = 4;
        } else if (i == 2) {
            if (this.f16692h.m16892b()) {
                this.f16693i.add(this.f16692h.f16999m);
                this.f16692h = null;
                C4048sb.m19407a("Change state to PAUSED", null);
                this.f16691g = 4;
            } else {
                C4048sb.m19407a("Change state to PAUSING", null);
                this.f16691g = 3;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m19751a(EnumC4095ue enumC4095ue, Map map, AtomicInteger atomicInteger, InterfaceC4060t1 interfaceC4060t1, String str) {
        AtomicInteger atomicInteger2 = new AtomicInteger();
        AtomicReference atomicReference = new AtomicReference(interfaceC4060t1);
        for (C4038s1 c4038s1 : map.values()) {
            EnumC4095ue enumC4095ue2 = enumC4095ue;
            AtomicInteger atomicInteger3 = atomicInteger;
            String str2 = str;
            this.f16693i.add(new C4148x1(enumC4095ue2, c4038s1.f16218b, c4038s1.f16219c, c4038s1.f16217a, atomicInteger3, atomicReference, atomicInteger2, str2));
            enumC4095ue = enumC4095ue2;
            atomicInteger = atomicInteger3;
            str = str2;
        }
        int i = this.f16691g;
        if (i == 1 || i == 2) {
            m19756d();
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m19752a(C4170y1 c4170y1, CBError cBError, C3723e3 c3723e3) {
        String str;
        int i = this.f16691g;
        if (i == 2 || i == 3) {
            if (c4170y1 != this.f16692h) {
                return;
            }
            this.f16692h = null;
            long millis = TimeUnit.NANOSECONDS.toMillis(c4170y1.f13518f);
            C4148x1 c4148x1 = c4170y1.f16999m;
            c4148x1.f16806i.addAndGet((int) millis);
            c4148x1.m19832a(this.f16685a, cBError == null);
            if (cBError == null) {
                C4048sb.m19407a("Downloaded " + c4148x1.f16801d, null);
            } else {
                String str2 = c4170y1.f16999m.f16803f;
                String errorDesc = cBError.getErrorDesc();
                StringBuilder sb = new StringBuilder("Failed to download ");
                sb.append(c4148x1.f16801d);
                if (c3723e3 != null) {
                    str = " Status code=" + c3723e3.m17474b();
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(" Error message=");
                sb.append(errorDesc);
                C4048sb.m19407a(sb.toString(), null);
                String str3 = "Name: " + c4148x1.f16800c + " Url: " + c4148x1.f16801d + " Error: " + errorDesc;
                InterfaceC3888l7 interfaceC3888l7Mo19132a = this.f16694j.mo19132a();
                if (interfaceC3888l7Mo19132a != null) {
                    interfaceC3888l7Mo19132a.mo43989track(new C3796h7(InterfaceC3807hi.a.ASSET_DOWNLOAD_ERROR, str3, str2, "", null));
                }
            }
            if (this.f16691g == 3) {
                C4048sb.m19407a("Change state to PAUSED", null);
                this.f16691g = 4;
            } else {
                m19756d();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m19753a(AtomicInteger atomicInteger) {
        atomicInteger.set(-10000);
        if (this.f16691g == 2) {
            C4170y1 c4170y1 = this.f16692h;
            if (c4170y1.f16999m.f16804g == atomicInteger && c4170y1.m16892b()) {
                this.f16692h = null;
                m19756d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x013f A[PHI: r9
  0x013f: PHI (r9v6 long) = (r9v3 long), (r9v2 long) binds: [B:64:0x0165, B:58:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    public synchronized void m19754b() {
        Object obj;
        if (this.f16691g != 1) {
            return;
        }
        try {
            C4048sb.m19407a("########### Trimming the disk cache", null);
            File file = this.f16690f.m19133a().f16132a;
            ArrayList arrayList = new ArrayList();
            String[] list = file.list();
            if (list != null && list.length > 0) {
                for (String str : list) {
                    if (!str.equalsIgnoreCase("requests") && !str.equalsIgnoreCase("track") && !str.equalsIgnoreCase("session") && !str.equalsIgnoreCase("videoCompletionEvents") && !str.equalsIgnoreCase("precache") && !str.contains(".")) {
                        arrayList.addAll(C3907m3.m18628a(new File(file, str), true));
                    }
                }
            }
            int size = arrayList.size();
            File[] fileArr = new File[size];
            arrayList.toArray(fileArr);
            if (size > 1) {
                Arrays.sort(fileArr, new Comparator() { // from class: com.chartboost.sdk.impl.w6$$ExternalSyntheticLambda0
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return Long.valueOf(((File) obj2).lastModified()).compareTo(Long.valueOf(((File) obj3).lastModified()));
                    }
                });
            }
            if (size > 0) {
                C3920mg c3920mg = (C3920mg) this.f16688d.get();
                long j = c3920mg.f15382n;
                C4001q8 c4001q8 = this.f16690f;
                long jM19140b = c4001q8.m19140b(c4001q8.m19133a().f16138g);
                long jM18681a = this.f16689e.m18681a();
                List list2 = c3920mg.f15372d;
                C4048sb.m19407a("Total local file count:" + size, null);
                C4048sb.m19407a("Video Folder Size in bytes :" + jM19140b, null);
                C4048sb.m19407a("Max Bytes allowed:" + j, null);
                int i = 0;
                while (i < size) {
                    File file2 = fileArr[i];
                    long j2 = j;
                    C3920mg c3920mg2 = c3920mg;
                    boolean z = TimeUnit.MILLISECONDS.toDays(jM18681a - file2.lastModified()) >= ((long) c3920mg.f15384p);
                    boolean zEndsWith = file2.getName().endsWith(".tmp");
                    File parentFile = file2.getParentFile();
                    String absolutePath = parentFile != null ? parentFile.getAbsolutePath() : null;
                    boolean zContains = absolutePath != null ? absolutePath.contains("/videos") : false;
                    boolean z2 = jM19140b > j2 && zContains;
                    if (file2.length() == 0 || zEndsWith || z || list2.contains(parentFile.getName()) || z2) {
                        if (zContains) {
                            jM19140b -= file2.length();
                        }
                        C4048sb.m19407a("Deleting file at path:" + file2.getPath(), null);
                        if (file2.delete()) {
                            obj = null;
                        } else {
                            obj = null;
                            C4048sb.m19410b("Unable to delete " + file2.getPath(), null);
                        }
                    } else {
                        obj = null;
                    }
                    i++;
                    c3920mg = c3920mg2;
                    j = j2;
                }
            }
        } catch (Exception e) {
            C4048sb.m19410b("reduceCacheSize", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m19755c() {
        int i = this.f16691g;
        if (i == 3) {
            C4048sb.m19407a("Change state to DOWNLOADING", null);
            this.f16691g = 2;
        } else if (i == 4) {
            C4048sb.m19407a("Change state to IDLE", null);
            this.f16691g = 1;
            m19756d();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19756d() {
        C4148x1 c4148x1;
        C4148x1 c4148x2;
        if (this.f16692h != null && (c4148x2 = (C4148x1) this.f16693i.peek()) != null && this.f16692h.f16999m.f16799b.m19590b() > c4148x2.f16799b.m19590b() && this.f16692h.m16892b()) {
            this.f16693i.add(this.f16692h.f16999m);
            this.f16692h = null;
        }
        while (this.f16692h == null && (c4148x1 = (C4148x1) this.f16693i.poll()) != null) {
            if (c4148x1.f16804g.get() > 0) {
                File file = new File(this.f16690f.m19133a().f16132a, c4148x1.f16802e);
                if (file.exists() || file.mkdirs() || file.isDirectory()) {
                    File file2 = new File(file, c4148x1.f16800c);
                    if (file2.exists()) {
                        this.f16690f.m19146d(file2);
                        c4148x1.m19832a(this.f16685a, true);
                    } else {
                        C4170y1 c4170y1 = new C4170y1(this, this.f16687c, c4148x1, file2, this.f16686b.m17613a());
                        this.f16692h = c4170y1;
                        this.f16686b.m17614a(c4170y1);
                    }
                } else {
                    C4048sb.m19410b("Unable to create directory " + file.getPath(), null);
                    c4148x1.m19832a(this.f16685a, false);
                }
            }
        }
        if (this.f16692h != null) {
            if (this.f16691g != 2) {
                C4048sb.m19407a("Change state to DOWNLOADING", null);
                this.f16691g = 2;
                return;
            }
            return;
        }
        if (this.f16691g != 1) {
            C4048sb.m19407a("Change state to IDLE", null);
            this.f16691g = 1;
        }
    }
}
