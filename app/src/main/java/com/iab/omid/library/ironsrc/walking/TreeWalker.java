package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.ironsrc.adsession.C11124a;
import com.iab.omid.library.ironsrc.internal.C11134c;
import com.iab.omid.library.ironsrc.internal.C11141j;
import com.iab.omid.library.ironsrc.processor.C11143b;
import com.iab.omid.library.ironsrc.processor.InterfaceC11142a;
import com.iab.omid.library.ironsrc.utils.C11151c;
import com.iab.omid.library.ironsrc.utils.C11154f;
import com.iab.omid.library.ironsrc.utils.C11156h;
import com.iab.omid.library.ironsrc.walking.async.C11164c;
import com.iab.omid.library.ironsrc.weakreference.C11170a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements InterfaceC11142a.a {

    /* JADX INFO: renamed from: i */
    private static TreeWalker f23304i = new TreeWalker();

    /* JADX INFO: renamed from: j */
    private static Handler f23305j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k */
    private static Handler f23306k = null;

    /* JADX INFO: renamed from: l */
    private static final Runnable f23307l = new RunnableC11159b();

    /* JADX INFO: renamed from: m */
    private static final Runnable f23308m = new RunnableC11160c();

    /* JADX INFO: renamed from: b */
    private int f23310b;

    /* JADX INFO: renamed from: h */
    private long f23316h;

    /* JADX INFO: renamed from: a */
    private List<TreeWalkerTimeLogger> f23309a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private boolean f23311c = false;

    /* JADX INFO: renamed from: d */
    private final List<C11170a> f23312d = new ArrayList();

    /* JADX INFO: renamed from: f */
    private C11161a f23314f = new C11161a();

    /* JADX INFO: renamed from: e */
    private C11143b f23313e = new C11143b();

    /* JADX INFO: renamed from: g */
    private C11168b f23315g = new C11168b(new C11164c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.TreeWalker$a */
    class RunnableC11158a implements Runnable {
        RunnableC11158a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f23315g.m24438b();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.TreeWalker$b */
    class RunnableC11159b implements Runnable {
        RunnableC11159b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().m24400l();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.TreeWalker$c */
    class RunnableC11160c implements Runnable {
        RunnableC11160c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f23306k != null) {
                TreeWalker.f23306k.post(TreeWalker.f23307l);
                TreeWalker.f23306k.postDelayed(TreeWalker.f23308m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    /* JADX INFO: renamed from: a */
    private void m24388a(long j) {
        if (this.f23309a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f23309a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f23310b, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f23310b, j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24389a(View view, InterfaceC11142a interfaceC11142a, JSONObject jSONObject, EnumC11169c enumC11169c, boolean z) {
        interfaceC11142a.mo24294a(view, jSONObject, this, enumC11169c == EnumC11169c.PARENT_VIEW, z);
    }

    /* JADX INFO: renamed from: a */
    private void m24390a(String str, View view, JSONObject jSONObject) {
        InterfaceC11142a interfaceC11142aM24297b = this.f23313e.m24297b();
        String strM24412b = this.f23314f.m24412b(str);
        if (strM24412b != null) {
            JSONObject jSONObjectMo24293a = interfaceC11142aM24297b.mo24293a(view);
            C11151c.m24341a(jSONObjectMo24293a, str);
            C11151c.m24348b(jSONObjectMo24293a, strM24412b);
            C11151c.m24343a(jSONObject, jSONObjectMo24293a);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m24391a(View view, JSONObject jSONObject) {
        C11161a.a aVarM24411b = this.f23314f.m24411b(view);
        if (aVarM24411b == null) {
            return false;
        }
        C11151c.m24339a(jSONObject, aVarM24411b);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m24394b(View view, JSONObject jSONObject) {
        String strM24414c = this.f23314f.m24414c(view);
        if (strM24414c == null) {
            return false;
        }
        C11151c.m24341a(jSONObject, strM24414c);
        C11151c.m24340a(jSONObject, Boolean.valueOf(this.f23314f.m24420e(view)));
        C11151c.m24347b(jSONObject, Boolean.valueOf(this.f23314f.m24416c(strM24414c)));
        this.f23314f.m24418d();
        return true;
    }

    /* JADX INFO: renamed from: d */
    private void m24396d() {
        m24388a(C11154f.m24362b() - this.f23316h);
    }

    /* JADX INFO: renamed from: e */
    private void m24397e() {
        this.f23310b = 0;
        this.f23312d.clear();
        this.f23311c = false;
        Iterator<C11124a> it = C11134c.m24234c().m24235a().iterator();
        while (it.hasNext()) {
            if (it.next().m24195e()) {
                this.f23311c = true;
                break;
            }
        }
        this.f23316h = C11154f.m24362b();
    }

    public static TreeWalker getInstance() {
        return f23304i;
    }

    /* JADX INFO: renamed from: i */
    private void m24398i() {
        if (f23306k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f23306k = handler;
            handler.post(f23307l);
            f23306k.postDelayed(f23308m, 200L);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m24399k() {
        Handler handler = f23306k;
        if (handler != null) {
            handler.removeCallbacks(f23308m);
            f23306k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m24400l() {
        m24397e();
        m24401f();
        m24396d();
        C11141j.m24289b().m24290a();
    }

    @Override // com.iab.omid.library.ironsrc.processor.InterfaceC11142a.a
    /* JADX INFO: renamed from: a */
    public void mo24295a(View view, InterfaceC11142a interfaceC11142a, JSONObject jSONObject, boolean z) {
        EnumC11169c enumC11169cM24417d;
        TreeWalker treeWalker;
        if (C11156h.m24382f(view) && (enumC11169cM24417d = this.f23314f.m24417d(view)) != EnumC11169c.UNDERLYING_VIEW) {
            JSONObject jSONObjectMo24293a = interfaceC11142a.mo24293a(view);
            C11151c.m24343a(jSONObject, jSONObjectMo24293a);
            if (m24394b(view, jSONObjectMo24293a)) {
                treeWalker = this;
            } else {
                boolean z2 = z || m24391a(view, jSONObjectMo24293a);
                if (this.f23311c && enumC11169cM24417d == EnumC11169c.OBSTRUCTION_VIEW && !z2) {
                    this.f23312d.add(new C11170a(view));
                }
                treeWalker = this;
                treeWalker.m24389a(view, interfaceC11142a, jSONObjectMo24293a, enumC11169cM24417d, z2);
            }
            treeWalker.f23310b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23309a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f23309a.add(treeWalkerTimeLogger);
    }

    /* JADX INFO: renamed from: f */
    void m24401f() {
        TreeWalker treeWalker;
        this.f23314f.m24419e();
        long jM24362b = C11154f.m24362b();
        InterfaceC11142a interfaceC11142aM24296a = this.f23313e.m24296a();
        if (this.f23314f.m24413b().size() > 0) {
            for (String str : this.f23314f.m24413b()) {
                JSONObject jSONObjectMo24293a = interfaceC11142aM24296a.mo24293a(null);
                m24390a(str, this.f23314f.m24409a(str), jSONObjectMo24293a);
                C11151c.m24346b(jSONObjectMo24293a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f23315g.m24437a(jSONObjectMo24293a, hashSet, jM24362b);
            }
        }
        if (this.f23314f.m24415c().size() > 0) {
            JSONObject jSONObjectMo24293a2 = interfaceC11142aM24296a.mo24293a(null);
            treeWalker = this;
            treeWalker.m24389a(null, interfaceC11142aM24296a, jSONObjectMo24293a2, EnumC11169c.PARENT_VIEW, false);
            C11151c.m24346b(jSONObjectMo24293a2);
            treeWalker.f23315g.m24439b(jSONObjectMo24293a2, treeWalker.f23314f.m24415c(), jM24362b);
            if (treeWalker.f23311c) {
                Iterator<C11124a> it = C11134c.m24234c().m24235a().iterator();
                while (it.hasNext()) {
                    it.next().m24191a(treeWalker.f23312d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f23315g.m24438b();
        }
        treeWalker.f23314f.m24410a();
    }

    /* JADX INFO: renamed from: g */
    public void m24402g() {
        m24399k();
    }

    /* JADX INFO: renamed from: h */
    public void m24403h() {
        m24398i();
    }

    /* JADX INFO: renamed from: j */
    public void m24404j() {
        m24402g();
        this.f23309a.clear();
        f23305j.post(new RunnableC11158a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23309a.contains(treeWalkerTimeLogger)) {
            this.f23309a.remove(treeWalkerTimeLogger);
        }
    }
}
