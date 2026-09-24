package com.iab.omid.library.mmadbridge.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.C11175a;
import com.iab.omid.library.mmadbridge.internal.C11185c;
import com.iab.omid.library.mmadbridge.internal.C11192j;
import com.iab.omid.library.mmadbridge.processor.C11194b;
import com.iab.omid.library.mmadbridge.processor.InterfaceC11193a;
import com.iab.omid.library.mmadbridge.utils.C11202c;
import com.iab.omid.library.mmadbridge.utils.C11205f;
import com.iab.omid.library.mmadbridge.utils.C11207h;
import com.iab.omid.library.mmadbridge.walking.async.C11215c;
import com.iab.omid.library.mmadbridge.weakreference.C11221a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements InterfaceC11193a.a {

    /* JADX INFO: renamed from: i */
    private static TreeWalker f23439i = new TreeWalker();

    /* JADX INFO: renamed from: j */
    private static Handler f23440j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k */
    private static Handler f23441k = null;

    /* JADX INFO: renamed from: l */
    private static final Runnable f23442l = new RunnableC11210b();

    /* JADX INFO: renamed from: m */
    private static final Runnable f23443m = new RunnableC11211c();

    /* JADX INFO: renamed from: b */
    private int f23445b;

    /* JADX INFO: renamed from: h */
    private long f23451h;

    /* JADX INFO: renamed from: a */
    private List<TreeWalkerTimeLogger> f23444a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private boolean f23446c = false;

    /* JADX INFO: renamed from: d */
    private final List<C11221a> f23447d = new ArrayList();

    /* JADX INFO: renamed from: f */
    private C11212a f23449f = new C11212a();

    /* JADX INFO: renamed from: e */
    private C11194b f23448e = new C11194b();

    /* JADX INFO: renamed from: g */
    private C11219b f23450g = new C11219b(new C11215c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.TreeWalker$a */
    class RunnableC11209a implements Runnable {
        RunnableC11209a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f23450g.m24691b();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.TreeWalker$b */
    class RunnableC11210b implements Runnable {
        RunnableC11210b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().m24653l();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.TreeWalker$c */
    class RunnableC11211c implements Runnable {
        RunnableC11211c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f23441k != null) {
                TreeWalker.f23441k.post(TreeWalker.f23442l);
                TreeWalker.f23441k.postDelayed(TreeWalker.f23443m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    /* JADX INFO: renamed from: a */
    private void m24641a(long j) {
        if (this.f23444a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f23444a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f23445b, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f23445b, j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24642a(View view, InterfaceC11193a interfaceC11193a, JSONObject jSONObject, EnumC11220c enumC11220c, boolean z) {
        interfaceC11193a.mo24547a(view, jSONObject, this, enumC11220c == EnumC11220c.PARENT_VIEW, z);
    }

    /* JADX INFO: renamed from: a */
    private void m24643a(String str, View view, JSONObject jSONObject) {
        InterfaceC11193a interfaceC11193aM24550b = this.f23448e.m24550b();
        String strM24665b = this.f23449f.m24665b(str);
        if (strM24665b != null) {
            JSONObject jSONObjectMo24546a = interfaceC11193aM24550b.mo24546a(view);
            C11202c.m24594a(jSONObjectMo24546a, str);
            C11202c.m24601b(jSONObjectMo24546a, strM24665b);
            C11202c.m24596a(jSONObject, jSONObjectMo24546a);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m24644a(View view, JSONObject jSONObject) {
        C11212a.a aVarM24664b = this.f23449f.m24664b(view);
        if (aVarM24664b == null) {
            return false;
        }
        C11202c.m24592a(jSONObject, aVarM24664b);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m24647b(View view, JSONObject jSONObject) {
        String strM24667c = this.f23449f.m24667c(view);
        if (strM24667c == null) {
            return false;
        }
        C11202c.m24594a(jSONObject, strM24667c);
        C11202c.m24593a(jSONObject, Boolean.valueOf(this.f23449f.m24673e(view)));
        C11202c.m24600b(jSONObject, Boolean.valueOf(this.f23449f.m24669c(strM24667c)));
        this.f23449f.m24671d();
        return true;
    }

    /* JADX INFO: renamed from: d */
    private void m24649d() {
        m24641a(C11205f.m24615b() - this.f23451h);
    }

    /* JADX INFO: renamed from: e */
    private void m24650e() {
        this.f23445b = 0;
        this.f23447d.clear();
        this.f23446c = false;
        Iterator<C11175a> it = C11185c.m24487c().m24488a().iterator();
        while (it.hasNext()) {
            if (it.next().m24448e()) {
                this.f23446c = true;
                break;
            }
        }
        this.f23451h = C11205f.m24615b();
    }

    public static TreeWalker getInstance() {
        return f23439i;
    }

    /* JADX INFO: renamed from: i */
    private void m24651i() {
        if (f23441k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f23441k = handler;
            handler.post(f23442l);
            f23441k.postDelayed(f23443m, 200L);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m24652k() {
        Handler handler = f23441k;
        if (handler != null) {
            handler.removeCallbacks(f23443m);
            f23441k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m24653l() {
        m24650e();
        m24654f();
        m24649d();
        C11192j.m24542b().m24543a();
    }

    @Override // com.iab.omid.library.mmadbridge.processor.InterfaceC11193a.a
    /* JADX INFO: renamed from: a */
    public void mo24548a(View view, InterfaceC11193a interfaceC11193a, JSONObject jSONObject, boolean z) {
        EnumC11220c enumC11220cM24670d;
        TreeWalker treeWalker;
        if (C11207h.m24635f(view) && (enumC11220cM24670d = this.f23449f.m24670d(view)) != EnumC11220c.UNDERLYING_VIEW) {
            JSONObject jSONObjectMo24546a = interfaceC11193a.mo24546a(view);
            C11202c.m24596a(jSONObject, jSONObjectMo24546a);
            if (m24647b(view, jSONObjectMo24546a)) {
                treeWalker = this;
            } else {
                boolean z2 = z || m24644a(view, jSONObjectMo24546a);
                if (this.f23446c && enumC11220cM24670d == EnumC11220c.OBSTRUCTION_VIEW && !z2) {
                    this.f23447d.add(new C11221a(view));
                }
                treeWalker = this;
                treeWalker.m24642a(view, interfaceC11193a, jSONObjectMo24546a, enumC11220cM24670d, z2);
            }
            treeWalker.f23445b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23444a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f23444a.add(treeWalkerTimeLogger);
    }

    /* JADX INFO: renamed from: f */
    void m24654f() {
        TreeWalker treeWalker;
        this.f23449f.m24672e();
        long jM24615b = C11205f.m24615b();
        InterfaceC11193a interfaceC11193aM24549a = this.f23448e.m24549a();
        if (this.f23449f.m24666b().size() > 0) {
            for (String str : this.f23449f.m24666b()) {
                JSONObject jSONObjectMo24546a = interfaceC11193aM24549a.mo24546a(null);
                m24643a(str, this.f23449f.m24662a(str), jSONObjectMo24546a);
                C11202c.m24599b(jSONObjectMo24546a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f23450g.m24690a(jSONObjectMo24546a, hashSet, jM24615b);
            }
        }
        if (this.f23449f.m24668c().size() > 0) {
            JSONObject jSONObjectMo24546a2 = interfaceC11193aM24549a.mo24546a(null);
            treeWalker = this;
            treeWalker.m24642a(null, interfaceC11193aM24549a, jSONObjectMo24546a2, EnumC11220c.PARENT_VIEW, false);
            C11202c.m24599b(jSONObjectMo24546a2);
            treeWalker.f23450g.m24692b(jSONObjectMo24546a2, treeWalker.f23449f.m24668c(), jM24615b);
            if (treeWalker.f23446c) {
                Iterator<C11175a> it = C11185c.m24487c().m24488a().iterator();
                while (it.hasNext()) {
                    it.next().m24444a(treeWalker.f23447d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f23450g.m24691b();
        }
        treeWalker.f23449f.m24663a();
    }

    /* JADX INFO: renamed from: g */
    public void m24655g() {
        m24652k();
    }

    /* JADX INFO: renamed from: h */
    public void m24656h() {
        m24651i();
    }

    /* JADX INFO: renamed from: j */
    public void m24657j() {
        m24655g();
        this.f23444a.clear();
        f23440j.post(new RunnableC11209a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23444a.contains(treeWalkerTimeLogger)) {
            this.f23444a.remove(treeWalkerTimeLogger);
        }
    }
}
