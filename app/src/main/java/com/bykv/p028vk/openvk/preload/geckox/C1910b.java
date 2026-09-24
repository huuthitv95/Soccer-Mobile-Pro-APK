package com.bykv.p028vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.p028vk.openvk.preload.geckox.net.INetWork;
import com.bykv.p028vk.openvk.preload.geckox.p033a.p034a.C1902a;
import com.bykv.p028vk.openvk.preload.geckox.p033a.p034a.InterfaceC1904c;
import com.bykv.p028vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1964a;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.b */
/* JADX INFO: compiled from: GeckoConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1910b {

    /* JADX INFO: renamed from: r */
    private static IThreadPoolCallback f4323r;

    /* JADX INFO: renamed from: s */
    private static ThreadPoolExecutor f4324s;

    /* JADX INFO: renamed from: a */
    private final Context f4325a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1904c f4326b;

    /* JADX INFO: renamed from: c */
    private final IStatisticMonitor f4327c;

    /* JADX INFO: renamed from: d */
    private final INetWork f4328d;

    /* JADX INFO: renamed from: e */
    private final List<String> f4329e;

    /* JADX INFO: renamed from: f */
    private final List<String> f4330f;

    /* JADX INFO: renamed from: g */
    private final C1902a f4331g;

    /* JADX INFO: renamed from: h */
    private final Long f4332h;

    /* JADX INFO: renamed from: i */
    private final String f4333i;

    /* JADX INFO: renamed from: j */
    private final String f4334j;

    /* JADX INFO: renamed from: k */
    private final String f4335k;

    /* JADX INFO: renamed from: l */
    private final String f4336l;

    /* JADX INFO: renamed from: m */
    private final String f4337m;

    /* JADX INFO: renamed from: n */
    private final File f4338n;

    /* JADX INFO: renamed from: o */
    private final boolean f4339o;

    /* JADX INFO: renamed from: p */
    private final long f4340p;

    /* JADX INFO: renamed from: q */
    private JSONObject f4341q;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.b$a */
    /* JADX INFO: compiled from: GeckoConfig.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        private INetWork f4342a;

        /* JADX INFO: renamed from: b */
        private List<String> f4343b;

        /* JADX INFO: renamed from: c */
        private List<String> f4344c;

        /* JADX INFO: renamed from: d */
        private Context f4345d;

        /* JADX INFO: renamed from: e */
        private InterfaceC1904c f4346e;

        /* JADX INFO: renamed from: f */
        private IStatisticMonitor f4347f;

        /* JADX INFO: renamed from: g */
        private boolean f4348g = true;

        /* JADX INFO: renamed from: h */
        private C1902a f4349h;

        /* JADX INFO: renamed from: i */
        private Long f4350i;

        /* JADX INFO: renamed from: j */
        private String f4351j;

        /* JADX INFO: renamed from: k */
        private String f4352k;

        /* JADX INFO: renamed from: l */
        private String f4353l;

        /* JADX INFO: renamed from: m */
        private File f4354m;

        /* JADX INFO: renamed from: n */
        private String f4355n;

        /* JADX INFO: renamed from: o */
        private String f4356o;

        /* JADX INFO: renamed from: p */
        private long f4357p;

        public a(Context context) {
            this.f4345d = context.getApplicationContext();
        }

        /* JADX INFO: renamed from: a */
        public final a m5956a() {
            this.f4348g = false;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5957a(long j) {
            this.f4357p = j;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5958a(C1902a c1902a) {
            this.f4349h = c1902a;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5959a(INetWork iNetWork) {
            this.f4342a = iNetWork;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5960a(IStatisticMonitor iStatisticMonitor) {
            this.f4347f = iStatisticMonitor;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5961a(File file) {
            this.f4354m = file;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5962a(String str) {
            this.f4351j = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5963a(String... strArr) {
            this.f4344c = Arrays.asList(strArr);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final a m5964b() {
            this.f4350i = 38L;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final a m5965b(String str) {
            this.f4352k = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final a m5966b(String... strArr) {
            this.f4343b = Arrays.asList(strArr);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m5967c(String str) {
            this.f4353l = str;
            return this;
        }
    }

    private C1910b(a aVar) {
        Context context = aVar.f4345d;
        this.f4325a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.f4343b;
        this.f4329e = list;
        this.f4330f = aVar.f4344c;
        this.f4326b = aVar.f4346e;
        this.f4331g = aVar.f4349h;
        Long l = aVar.f4350i;
        this.f4332h = l;
        if (TextUtils.isEmpty(aVar.f4351j)) {
            this.f4333i = C1964a.m6068a(context);
        } else {
            this.f4333i = aVar.f4351j;
        }
        String str = aVar.f4352k;
        this.f4334j = str;
        this.f4336l = aVar.f4355n;
        this.f4337m = aVar.f4356o;
        this.f4340p = aVar.f4357p;
        if (aVar.f4354m == null) {
            this.f4338n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.f4338n = aVar.f4354m;
        }
        String str2 = aVar.f4353l;
        this.f4335k = str2;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if (l == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.f4328d = aVar.f4342a;
        this.f4327c = aVar.f4347f;
        this.f4339o = aVar.f4348g;
    }

    /* synthetic */ C1910b(a aVar, byte b) {
        this(aVar);
    }

    /* JADX INFO: renamed from: a */
    public static void m5918a(IThreadPoolCallback iThreadPoolCallback) {
        f4323r = iThreadPoolCallback;
    }

    /* JADX INFO: renamed from: g */
    public static Executor m5919g() {
        return m5921t();
    }

    /* JADX INFO: renamed from: h */
    public static Executor m5920h() {
        return m5921t();
    }

    /* JADX INFO: renamed from: t */
    public static ExecutorService m5921t() {
        IThreadPoolCallback iThreadPoolCallback = f4323r;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (f4324s == null) {
            synchronized (C1910b.class) {
                if (f4324s == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    f4324s = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f4324s;
    }

    /* JADX INFO: renamed from: a */
    public final Context m5922a() {
        return this.f4325a;
    }

    /* JADX INFO: renamed from: a */
    public final void m5923a(JSONObject jSONObject) {
        this.f4341q = jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public final C1902a m5924b() {
        return this.f4331g;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5925c() {
        return this.f4339o;
    }

    /* JADX INFO: renamed from: d */
    public final List<String> m5926d() {
        return this.f4330f;
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m5927e() {
        return this.f4329e;
    }

    /* JADX INFO: renamed from: f */
    public final JSONObject m5928f() {
        return this.f4341q;
    }

    /* JADX INFO: renamed from: i */
    public final INetWork m5929i() {
        return this.f4328d;
    }

    /* JADX INFO: renamed from: j */
    public final String m5930j() {
        return this.f4335k;
    }

    /* JADX INFO: renamed from: k */
    public final long m5931k() {
        return this.f4332h.longValue();
    }

    /* JADX INFO: renamed from: l */
    public final String m5932l() {
        return this.f4337m;
    }

    /* JADX INFO: renamed from: m */
    public final String m5933m() {
        return this.f4336l;
    }

    /* JADX INFO: renamed from: n */
    public final File m5934n() {
        return this.f4338n;
    }

    /* JADX INFO: renamed from: o */
    public final String m5935o() {
        return this.f4333i;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC1904c m5936p() {
        return this.f4326b;
    }

    /* JADX INFO: renamed from: q */
    public final IStatisticMonitor m5937q() {
        return this.f4327c;
    }

    /* JADX INFO: renamed from: r */
    public final String m5938r() {
        return this.f4334j;
    }

    /* JADX INFO: renamed from: s */
    public final long m5939s() {
        return this.f4340p;
    }
}
