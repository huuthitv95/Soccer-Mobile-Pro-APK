package com.iab.omid.library.vungle.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.vungle.adsession.C11271a;
import com.iab.omid.library.vungle.internal.C11292c;
import com.iab.omid.library.vungle.internal.C11300k;
import com.iab.omid.library.vungle.processor.C11304b;
import com.iab.omid.library.vungle.processor.InterfaceC11303a;
import com.iab.omid.library.vungle.utils.C11312c;
import com.iab.omid.library.vungle.utils.C11315f;
import com.iab.omid.library.vungle.utils.C11317h;
import com.iab.omid.library.vungle.walking.async.C11325c;
import com.iab.omid.library.vungle.weakreference.C11331a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements InterfaceC11303a.a {

    /* JADX INFO: renamed from: i */
    private static TreeWalker f23732i = new TreeWalker();

    /* JADX INFO: renamed from: j */
    private static Handler f23733j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k */
    private static Handler f23734k = null;

    /* JADX INFO: renamed from: l */
    private static final Runnable f23735l = new RunnableC11320b();

    /* JADX INFO: renamed from: m */
    private static final Runnable f23736m = new RunnableC11321c();

    /* JADX INFO: renamed from: b */
    private int f23738b;

    /* JADX INFO: renamed from: h */
    private long f23744h;

    /* JADX INFO: renamed from: a */
    private List<TreeWalkerTimeLogger> f23737a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private boolean f23739c = false;

    /* JADX INFO: renamed from: d */
    private final List<C11331a> f23740d = new ArrayList();

    /* JADX INFO: renamed from: f */
    private C11322a f23742f = new C11322a();

    /* JADX INFO: renamed from: e */
    private C11304b f23741e = new C11304b();

    /* JADX INFO: renamed from: g */
    private C11329b f23743g = new C11329b(new C11325c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.TreeWalker$a */
    class RunnableC11319a implements Runnable {
        RunnableC11319a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f23743g.m25230b();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.TreeWalker$b */
    class RunnableC11320b implements Runnable {
        RunnableC11320b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().m25192l();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.TreeWalker$c */
    class RunnableC11321c implements Runnable {
        RunnableC11321c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f23734k != null) {
                TreeWalker.f23734k.post(TreeWalker.f23735l);
                TreeWalker.f23734k.postDelayed(TreeWalker.f23736m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    /* JADX INFO: renamed from: a */
    private void m25180a(long j) {
        if (this.f23737a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f23737a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f23738b, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f23738b, j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m25181a(View view, InterfaceC11303a interfaceC11303a, JSONObject jSONObject, EnumC11330c enumC11330c, boolean z) {
        interfaceC11303a.mo25071a(view, jSONObject, this, enumC11330c == EnumC11330c.PARENT_VIEW, z);
    }

    /* JADX INFO: renamed from: a */
    private void m25182a(String str, View view, JSONObject jSONObject) {
        InterfaceC11303a interfaceC11303aM25074b = this.f23741e.m25074b();
        String strM25204b = this.f23742f.m25204b(str);
        if (strM25204b != null) {
            JSONObject jSONObjectMo25070a = interfaceC11303aM25074b.mo25070a(view);
            C11312c.m25130a(jSONObjectMo25070a, str);
            C11312c.m25137b(jSONObjectMo25070a, strM25204b);
            C11312c.m25132a(jSONObject, jSONObjectMo25070a);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m25183a(View view, JSONObject jSONObject) {
        C11322a.a aVarM25203b = this.f23742f.m25203b(view);
        if (aVarM25203b == null) {
            return false;
        }
        C11312c.m25128a(jSONObject, aVarM25203b);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m25186b(View view, JSONObject jSONObject) {
        String strM25206c = this.f23742f.m25206c(view);
        if (strM25206c == null) {
            return false;
        }
        C11312c.m25130a(jSONObject, strM25206c);
        C11312c.m25129a(jSONObject, Boolean.valueOf(this.f23742f.m25212e(view)));
        C11312c.m25136b(jSONObject, Boolean.valueOf(this.f23742f.m25208c(strM25206c)));
        this.f23742f.m25210d();
        return true;
    }

    /* JADX INFO: renamed from: d */
    private void m25188d() {
        m25180a(C11315f.m25154b() - this.f23744h);
    }

    /* JADX INFO: renamed from: e */
    private void m25189e() {
        this.f23738b = 0;
        this.f23740d.clear();
        this.f23739c = false;
        Iterator<C11271a> it = C11292c.m25003c().m25004a().iterator();
        while (it.hasNext()) {
            if (it.next().m24937g()) {
                this.f23739c = true;
                break;
            }
        }
        this.f23744h = C11315f.m25154b();
    }

    public static TreeWalker getInstance() {
        return f23732i;
    }

    /* JADX INFO: renamed from: i */
    private void m25190i() {
        if (f23734k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f23734k = handler;
            handler.post(f23735l);
            f23734k.postDelayed(f23736m, 200L);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m25191k() {
        Handler handler = f23734k;
        if (handler != null) {
            handler.removeCallbacks(f23736m);
            f23734k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m25192l() {
        m25189e();
        m25193f();
        m25188d();
        C11300k.m25062b().m25063a();
    }

    @Override // com.iab.omid.library.vungle.processor.InterfaceC11303a.a
    /* JADX INFO: renamed from: a */
    public void mo25072a(View view, InterfaceC11303a interfaceC11303a, JSONObject jSONObject, boolean z) {
        EnumC11330c enumC11330cM25209d;
        TreeWalker treeWalker;
        if (C11317h.m25174f(view) && (enumC11330cM25209d = this.f23742f.m25209d(view)) != EnumC11330c.UNDERLYING_VIEW) {
            JSONObject jSONObjectMo25070a = interfaceC11303a.mo25070a(view);
            C11312c.m25132a(jSONObject, jSONObjectMo25070a);
            if (m25186b(view, jSONObjectMo25070a)) {
                treeWalker = this;
            } else {
                boolean z2 = z || m25183a(view, jSONObjectMo25070a);
                if (this.f23739c && enumC11330cM25209d == EnumC11330c.OBSTRUCTION_VIEW && !z2) {
                    this.f23740d.add(new C11331a(view));
                }
                treeWalker = this;
                treeWalker.m25181a(view, interfaceC11303a, jSONObjectMo25070a, enumC11330cM25209d, z2);
            }
            treeWalker.f23738b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23737a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f23737a.add(treeWalkerTimeLogger);
    }

    /* JADX INFO: renamed from: f */
    void m25193f() {
        TreeWalker treeWalker;
        this.f23742f.m25211e();
        long jM25154b = C11315f.m25154b();
        InterfaceC11303a interfaceC11303aM25073a = this.f23741e.m25073a();
        if (this.f23742f.m25205b().size() > 0) {
            for (String str : this.f23742f.m25205b()) {
                JSONObject jSONObjectMo25070a = interfaceC11303aM25073a.mo25070a(null);
                m25182a(str, this.f23742f.m25201a(str), jSONObjectMo25070a);
                C11312c.m25139c(jSONObjectMo25070a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f23743g.m25229a(jSONObjectMo25070a, hashSet, jM25154b);
            }
        }
        if (this.f23742f.m25207c().size() > 0) {
            JSONObject jSONObjectMo25070a2 = interfaceC11303aM25073a.mo25070a(null);
            treeWalker = this;
            treeWalker.m25181a(null, interfaceC11303aM25073a, jSONObjectMo25070a2, EnumC11330c.PARENT_VIEW, false);
            C11312c.m25139c(jSONObjectMo25070a2);
            treeWalker.f23743g.m25231b(jSONObjectMo25070a2, treeWalker.f23742f.m25207c(), jM25154b);
            if (treeWalker.f23739c) {
                Iterator<C11271a> it = C11292c.m25003c().m25004a().iterator();
                while (it.hasNext()) {
                    it.next().m24931a(treeWalker.f23740d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f23743g.m25230b();
        }
        treeWalker.f23742f.m25202a();
    }

    /* JADX INFO: renamed from: g */
    public void m25194g() {
        m25191k();
    }

    /* JADX INFO: renamed from: h */
    public void m25195h() {
        m25190i();
    }

    /* JADX INFO: renamed from: j */
    public void m25196j() {
        m25194g();
        this.f23737a.clear();
        f23733j.post(new RunnableC11319a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23737a.contains(treeWalkerTimeLogger)) {
            this.f23737a.remove(treeWalkerTimeLogger);
        }
    }
}
