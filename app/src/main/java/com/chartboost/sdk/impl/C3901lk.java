package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.lk */
/* JADX INFO: loaded from: classes3.dex */
public final class C3901lk implements C3924mk.a, InterfaceC3855jk {

    /* JADX INFO: renamed from: a */
    public final C3746f3 f15252a;

    /* JADX INFO: renamed from: b */
    public final C4166xj f15253b;

    /* JADX INFO: renamed from: c */
    public final C3769g3 f15254c;

    /* JADX INFO: renamed from: d */
    public final C4001q8 f15255d;

    /* JADX INFO: renamed from: e */
    public final C3875kh f15256e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f15257f;

    /* JADX INFO: renamed from: g */
    public final Queue f15258g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentLinkedQueue f15259h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f15260i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f15261j;

    /* JADX INFO: renamed from: k */
    public AtomicInteger f15262k;

    /* JADX INFO: renamed from: l */
    public final Runnable f15263l;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.lk$a */
    public enum a {
        CAN_NOT_DOWNLOAD,
        CREATE_ASSET_AND_DOWNLOAD,
        BRING_TO_FRONT_QUEUE_AND_DOWNLOAD;


        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ EnumEntries f15268f = EnumEntriesKt.enumEntries(m18539a());
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.lk$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15269a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.CAN_NOT_DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.CREATE_ASSET_AND_DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.BRING_TO_FRONT_QUEUE_AND_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15269a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.lk$c */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Long.valueOf(((C4078tj) obj).m19505a()), Long.valueOf(((C4078tj) obj2).m19505a()));
        }
    }

    public C3901lk(C3746f3 networkRequestService, C4166xj policy, C3769g3 c3769g3, C4001q8 c4001q8, C3875kh tempHelper, ScheduledExecutorService backgroundExecutor) {
        Intrinsics.checkNotNullParameter(networkRequestService, "networkRequestService");
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(tempHelper, "tempHelper");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        this.f15252a = networkRequestService;
        this.f15253b = policy;
        this.f15254c = c3769g3;
        this.f15255d = c4001q8;
        this.f15256e = tempHelper;
        this.f15257f = backgroundExecutor;
        this.f15258g = new ConcurrentLinkedQueue();
        this.f15259h = new ConcurrentLinkedQueue();
        this.f15260i = new ConcurrentHashMap();
        this.f15261j = new ConcurrentHashMap();
        this.f15262k = new AtomicInteger(1);
        this.f15263l = new Runnable() { // from class: com.chartboost.sdk.impl.lk$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C3901lk.m18523a(this.f$0);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static final void m18523a(C3901lk this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mo18295a((String) null, this$0.f15262k.incrementAndGet(), false);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3855jk
    /* JADX INFO: renamed from: a */
    public int mo18293a(C4078tj c4078tj) {
        if (c4078tj == null) {
            return 0;
        }
        if (m18535e(c4078tj)) {
            return 5;
        }
        File fileM18534d = m18534d(c4078tj);
        long length = fileM18534d != null ? fileM18534d.length() : 0L;
        if (c4078tj.m19508c() == 0) {
            return 0;
        }
        return AbstractC4206zf.m20149a(length / c4078tj.m19508c());
    }

    /* JADX INFO: renamed from: a */
    public final a m18524a(String str, String str2, boolean z, InterfaceC4015r0 interfaceC4015r0, boolean z2, File file) {
        InterfaceC4015r0 interfaceC4015r1;
        String str3;
        String str4;
        String str5;
        C3901lk c3901lk;
        if (z) {
            if (z2) {
                if (this.f15260i.containsKey(str)) {
                    C4048sb.m19408a("Already downloading for show operation: " + str2, (Throwable) null, 2, (Object) null);
                    C3851jg.m18281a("Already downloading for show operation: " + str2);
                    mo18440a(str, str2, file != null ? file.length() : 0L, interfaceC4015r0);
                    return a.CAN_NOT_DOWNLOAD;
                }
                str5 = str;
                interfaceC4015r1 = interfaceC4015r0;
                str3 = "Register callback for show operation: ";
                str4 = str2;
                if (interfaceC4015r1 != null) {
                    C4048sb.m19408a(str3 + str4, (Throwable) null, 2, (Object) null);
                    C3851jg.m18281a(str3 + str4);
                    mo18440a(str5, str4, file != null ? file.length() : 0L, interfaceC4015r1);
                    return a.CAN_NOT_DOWNLOAD;
                }
                c3901lk = this;
            } else {
                interfaceC4015r1 = interfaceC4015r0;
                str3 = "Register callback for show operation: ";
                str4 = str2;
                str5 = str;
                c3901lk = this;
                C4048sb.m19408a("Not downloading for show operation: " + str4, (Throwable) null, 2, (Object) null);
                if (interfaceC4015r1 != null) {
                    C4078tj c4078tj = (C4078tj) c3901lk.f15261j.get(str4);
                    if (Intrinsics.areEqual(c4078tj != null ? c4078tj.m19509d() : null, str4) || c3901lk.f15260i.containsKey(str5)) {
                        c3901lk.f15260i.put(str5, interfaceC4015r1);
                        return a.BRING_TO_FRONT_QUEUE_AND_DOWNLOAD;
                    }
                }
            }
            if (interfaceC4015r1 != null) {
                C4048sb.m19408a(str3 + str4, (Throwable) null, 2, (Object) null);
                C3851jg.m18281a(str3 + str4);
                c3901lk.f15260i.put(str5, interfaceC4015r1);
            }
        } else if (m18529b(str, str2) || z2) {
            C4048sb.m19408a("Already queued or downloading for cache operation: " + str2, (Throwable) null, 2, (Object) null);
            C3851jg.m18281a("Already queued or downloading for cache operation: " + str2);
            return a.CAN_NOT_DOWNLOAD;
        }
        return a.CREATE_ASSET_AND_DOWNLOAD;
    }

    /* JADX INFO: renamed from: a */
    public final void m18525a() {
        if (m18528b()) {
            Collection collectionValues = this.f15261j.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            Iterator it = CollectionsKt.sortedWith(collectionValues, new c()).iterator();
            while (it.hasNext()) {
                m18537g((C4078tj) it.next());
                if (!m18528b()) {
                    return;
                }
            }
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3855jk
    /* JADX INFO: renamed from: a */
    public void mo18294a(Context context) {
        File[] fileArrM19144c;
        Intrinsics.checkNotNullParameter(context, "context");
        C4001q8 c4001q8 = this.f15255d;
        if (c4001q8 == null || (fileArrM19144c = c4001q8.m19144c()) == null) {
            return;
        }
        Intrinsics.checkNotNull(fileArrM19144c);
        int length = fileArrM19144c.length;
        boolean z = false;
        int i = 0;
        while (i < length) {
            File file = fileArrM19144c[i];
            if (file.exists()) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.contains$default(name, ".tmp", z, 2, (Object) null)) {
                    c4001q8.m19139a(file);
                    return;
                }
            }
            C4166xj c4166xj = this.f15253b;
            Intrinsics.checkNotNull(file);
            if (c4166xj.m19983a(file)) {
                c4001q8.m19139a(file);
            } else {
                String name2 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                C4078tj c4078tj = new C4078tj("", name2, file, c4001q8.m19141b(), file.lastModified(), null, file.length(), 32, null);
                ConcurrentHashMap concurrentHashMap = this.f15261j;
                String name3 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                concurrentHashMap.put(name3, c4078tj);
            }
            i++;
            z = false;
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3855jk
    /* JADX INFO: renamed from: a */
    public void mo18295a(String str, int i, boolean z) {
        C4048sb.m19408a("startDownloadIfPossible: " + str, (Throwable) null, 2, (Object) null);
        if (this.f15258g.size() > 0) {
            if (z || m18532c()) {
                C4078tj c4078tjM18533d = m18533d(str);
                if (c4078tjM18533d != null) {
                    m18538h(c4078tjM18533d);
                    return;
                }
                return;
            }
            C3851jg.m18281a("Can't cache next video at the moment");
            this.f15257f.schedule(this.f15263l, ((long) i) * 5000, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.chartboost.sdk.impl.C3924mk.a
    /* JADX INFO: renamed from: a */
    public void mo18439a(String uri, String videoFileName) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        C4048sb.m19408a("onSuccess: " + uri, (Throwable) null, 2, (Object) null);
        C3851jg.m18281a("Video downloaded success " + uri);
        m18525a();
        this.f15259h.remove(uri);
        this.f15260i.remove(uri);
        this.f15262k = new AtomicInteger(1);
        m18531c(uri);
        mo18295a((String) null, this.f15262k.get(), false);
    }

    @Override // com.chartboost.sdk.impl.C3924mk.a
    /* JADX INFO: renamed from: a */
    public void mo18440a(String url, String videoFileName, long j, InterfaceC4015r0 interfaceC4015r0) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        C4048sb.m19408a("tempFileIsReady: " + videoFileName, (Throwable) null, 2, (Object) null);
        C4078tj c4078tjMo18298b = mo18298b(videoFileName);
        if (j > 0 && c4078tjMo18298b != null) {
            c4078tjMo18298b.m19506a(j);
        }
        if (c4078tjMo18298b != null) {
            this.f15261j.remove(videoFileName);
        }
        if (interfaceC4015r0 == null) {
            interfaceC4015r0 = (InterfaceC4015r0) this.f15260i.get(url);
        }
        if (interfaceC4015r0 != null) {
            interfaceC4015r0.mo18619a(url);
        }
    }

    @Override // com.chartboost.sdk.impl.C3924mk.a
    /* JADX INFO: renamed from: a */
    public void mo18441a(String uri, String videoFileName, CBError cBError) {
        String errorDesc;
        Unit unit;
        File fileM19510e;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        C4048sb.m19408a("onError: " + uri, (Throwable) null, 2, (Object) null);
        if (cBError == null || (errorDesc = cBError.getErrorDesc()) == null) {
            errorDesc = "Unknown error";
        }
        C4078tj c4078tjMo18298b = mo18298b(videoFileName);
        if (c4078tjMo18298b != null && (fileM19510e = c4078tjMo18298b.m19510e()) != null) {
            fileM19510e.delete();
        }
        if (cBError == null || cBError.getType() != CBError.Internal.INTERNET_UNAVAILABLE) {
            m18531c(uri);
            InterfaceC4015r0 interfaceC4015r0 = (InterfaceC4015r0) this.f15260i.get(uri);
            if (interfaceC4015r0 != null) {
                interfaceC4015r0.mo18619a(uri);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19411b("Missing callback on error", (Throwable) null, 2, (Object) null);
            }
        } else if (c4078tjMo18298b != null) {
            this.f15258g.add(c4078tjMo18298b);
            m18527b(c4078tjMo18298b);
        }
        this.f15260i.remove(uri);
        this.f15261j.remove(videoFileName);
        mo18295a((String) null, this.f15262k.get(), false);
        C4048sb.m19411b("Video download failed: " + uri + " with error " + errorDesc, (Throwable) null, 2, (Object) null);
        C3851jg.m18281a("Video downloaded failed " + uri + " with error " + errorDesc);
        this.f15259h.remove(uri);
    }

    /* JADX INFO: renamed from: a */
    public final void m18526a(String str, String str2, File file, File file2) {
        File fileM19145d;
        C4001q8 c4001q8 = this.f15255d;
        String absolutePath = (c4001q8 == null || (fileM19145d = c4001q8.m19145d()) == null) ? null : fileM19145d.getAbsolutePath();
        C4078tj c4078tj = new C4078tj(str, str2, file, file2, 0L, absolutePath + File.separator + str2, 0L, 80, null);
        file.setLastModified(c4078tj.m19505a());
        m18527b(c4078tj);
        this.f15261j.putIfAbsent(str2, c4078tj);
        this.f15258g.offer(c4078tj);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3855jk
    /* JADX INFO: renamed from: a */
    public synchronized void mo18296a(String url, String filename, boolean z, InterfaceC4015r0 interfaceC4015r0) throws Throwable {
        Throwable th;
        File fileM19141b;
        try {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(filename, "filename");
            C4048sb.m19408a("downloadVideoFile: " + url, (Throwable) null, 2, (Object) null);
            C4001q8 c4001q8 = this.f15255d;
            if (c4001q8 != null) {
                try {
                    fileM19141b = c4001q8.m19141b();
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } else {
                fileM19141b = null;
            }
            C4001q8 c4001q9 = this.f15255d;
            try {
                int i = b.f15269a[m18524a(url, filename, z, interfaceC4015r0, mo18297a(filename), c4001q9 != null ? c4001q9.m19134a(fileM19141b, filename) : null).ordinal()];
                if (i == 2) {
                    m18526a(url, filename, new File(fileM19141b, filename), fileM19141b);
                    mo18295a(z ? filename : null, this.f15262k.get(), z);
                } else if (i == 3) {
                    InterfaceC3855jk.a.m18299a(this, filename, 0, true, 2, null);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3855jk
    /* JADX INFO: renamed from: a */
    public boolean mo18297a(String videoFilename) {
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        C4078tj c4078tjMo18298b = mo18298b(videoFilename);
        return (c4078tjMo18298b != null && m18536f(c4078tjMo18298b)) || (c4078tjMo18298b != null && m18535e(c4078tjMo18298b));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3855jk
    /* JADX INFO: renamed from: b */
    public C4078tj mo18298b(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        return (C4078tj) this.f15261j.get(filename);
    }

    /* JADX INFO: renamed from: b */
    public final void m18527b(C4078tj c4078tj) {
        if (C3851jg.f14967a.m18286d()) {
            File file = new File(c4078tj.m19511f());
            try {
                file.createNewFile();
                file.setLastModified(AbstractC3760fh.m17736a());
            } catch (IOException e) {
                C4048sb.m19411b("Error while creating queue empty file: " + e, (Throwable) null, 2, (Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18528b() {
        C4001q8 c4001q8 = this.f15255d;
        if (c4001q8 == null) {
            return false;
        }
        return this.f15253b.m19986b(c4001q8.m19140b(c4001q8.m19141b()));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18529b(String str, String str2) {
        if (this.f15258g.size() <= 0) {
            return false;
        }
        for (C4078tj c4078tj : this.f15258g) {
            if (Intrinsics.areEqual(c4078tj.m19512g(), str) && Intrinsics.areEqual(c4078tj.m19509d(), str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m18530c(C4078tj c4078tj) {
        if (C3851jg.f14967a.m18286d()) {
            File file = new File(c4078tj.m19511f());
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18531c(String str) {
        for (C4078tj c4078tj : new LinkedList(this.f15258g)) {
            if (c4078tj != null && Intrinsics.areEqual(c4078tj.m19512g(), str)) {
                this.f15258g.remove(c4078tj);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18532c() {
        C3769g3 c3769g3 = this.f15254c;
        return c3769g3 != null && c3769g3.m17757e() && !this.f15253b.m19996g() && this.f15259h.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public final C4078tj m18533d(String str) {
        Object objPoll;
        if (str == null) {
            objPoll = this.f15258g.poll();
        } else {
            C4078tj c4078tj = null;
            for (C4078tj c4078tj2 : this.f15258g) {
                if (Intrinsics.areEqual(c4078tj2.m19509d(), str)) {
                    c4078tj = c4078tj2;
                }
            }
            objPoll = c4078tj;
        }
        C4078tj c4078tj3 = (C4078tj) objPoll;
        if (c4078tj3 != null) {
            m18530c(c4078tj3);
        }
        return c4078tj3;
    }

    /* JADX INFO: renamed from: d */
    public final File m18534d(C4078tj c4078tj) {
        return this.f15256e.m18429a(c4078tj.m19507b(), c4078tj.m19509d());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18535e(C4078tj c4078tj) {
        C4001q8 c4001q8;
        if (c4078tj == null || c4078tj.m19510e() == null || (c4001q8 = this.f15255d) == null) {
            return false;
        }
        return c4001q8.m19143c(c4078tj.m19510e());
    }

    /* JADX INFO: renamed from: f */
    public final boolean m18536f(C4078tj c4078tj) {
        return this.f15256e.m18431b(c4078tj.m19507b(), c4078tj.m19509d());
    }

    /* JADX INFO: renamed from: g */
    public boolean m18537g(C4078tj c4078tj) {
        if (c4078tj == null || !m18535e(c4078tj)) {
            return false;
        }
        File fileM19510e = c4078tj.m19510e();
        String strM19509d = c4078tj.m19509d();
        C4001q8 c4001q8 = this.f15255d;
        if (c4001q8 == null || !c4001q8.m19139a(fileM19510e)) {
            return false;
        }
        this.f15261j.remove(strM19509d);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m18538h(C4078tj c4078tj) {
        C4048sb.m19408a("startDownloadNow: " + c4078tj.m19512g(), (Throwable) null, 2, (Object) null);
        if (mo18297a(c4078tj.m19509d())) {
            C3851jg.m18281a("File already downloaded or downloading: " + c4078tj.m19509d());
            String strM19512g = c4078tj.m19512g();
            InterfaceC4015r0 interfaceC4015r0 = (InterfaceC4015r0) this.f15260i.remove(strM19512g);
            if (interfaceC4015r0 != null) {
                interfaceC4015r0.mo18619a(strM19512g);
                return;
            }
            return;
        }
        C3851jg.m18281a("Start downloading " + c4078tj.m19512g());
        this.f15253b.m19980a();
        this.f15259h.add(c4078tj.m19512g());
        C3769g3 c3769g3 = this.f15254c;
        File fileM19510e = c4078tj.m19510e();
        Intrinsics.checkNotNull(fileM19510e);
        this.f15252a.m17614a(new C3924mk(c3769g3, fileM19510e, c4078tj.m19512g(), this, EnumC4095ue.NORMAL, this.f15252a.m17613a()));
    }
}
