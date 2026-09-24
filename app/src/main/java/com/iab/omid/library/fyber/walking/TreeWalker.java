package com.iab.omid.library.fyber.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.fyber.adsession.C11073a;
import com.iab.omid.library.fyber.internal.C11083c;
import com.iab.omid.library.fyber.internal.C11090j;
import com.iab.omid.library.fyber.processor.C11092b;
import com.iab.omid.library.fyber.processor.InterfaceC11091a;
import com.iab.omid.library.fyber.utils.C11100c;
import com.iab.omid.library.fyber.utils.C11103f;
import com.iab.omid.library.fyber.utils.C11105h;
import com.iab.omid.library.fyber.walking.async.C11113c;
import com.iab.omid.library.fyber.weakreference.C11119a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements InterfaceC11091a.a {

    /* JADX INFO: renamed from: i */
    private static TreeWalker f23169i = new TreeWalker();

    /* JADX INFO: renamed from: j */
    private static Handler f23170j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k */
    private static Handler f23171k = null;

    /* JADX INFO: renamed from: l */
    private static final Runnable f23172l = new RunnableC11108b();

    /* JADX INFO: renamed from: m */
    private static final Runnable f23173m = new RunnableC11109c();

    /* JADX INFO: renamed from: b */
    private int f23175b;

    /* JADX INFO: renamed from: h */
    private long f23181h;

    /* JADX INFO: renamed from: a */
    private List<TreeWalkerTimeLogger> f23174a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private boolean f23176c = false;

    /* JADX INFO: renamed from: d */
    private final List<C11119a> f23177d = new ArrayList();

    /* JADX INFO: renamed from: f */
    private C11110a f23179f = new C11110a();

    /* JADX INFO: renamed from: e */
    private C11092b f23178e = new C11092b();

    /* JADX INFO: renamed from: g */
    private C11117b f23180g = new C11117b(new C11113c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.TreeWalker$a */
    class RunnableC11107a implements Runnable {
        RunnableC11107a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f23180g.m24185b();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.TreeWalker$b */
    class RunnableC11108b implements Runnable {
        RunnableC11108b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().m24147l();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.TreeWalker$c */
    class RunnableC11109c implements Runnable {
        RunnableC11109c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f23171k != null) {
                TreeWalker.f23171k.post(TreeWalker.f23172l);
                TreeWalker.f23171k.postDelayed(TreeWalker.f23173m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    /* JADX INFO: renamed from: a */
    private void m24135a(long j) {
        if (this.f23174a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f23174a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f23175b, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f23175b, j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24136a(View view, InterfaceC11091a interfaceC11091a, JSONObject jSONObject, EnumC11118c enumC11118c, boolean z) {
        interfaceC11091a.mo24041a(view, jSONObject, this, enumC11118c == EnumC11118c.PARENT_VIEW, z);
    }

    /* JADX INFO: renamed from: a */
    private void m24137a(String str, View view, JSONObject jSONObject) {
        InterfaceC11091a interfaceC11091aM24044b = this.f23178e.m24044b();
        String strM24159b = this.f23179f.m24159b(str);
        if (strM24159b != null) {
            JSONObject jSONObjectMo24040a = interfaceC11091aM24044b.mo24040a(view);
            C11100c.m24088a(jSONObjectMo24040a, str);
            C11100c.m24095b(jSONObjectMo24040a, strM24159b);
            C11100c.m24090a(jSONObject, jSONObjectMo24040a);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m24138a(View view, JSONObject jSONObject) {
        C11110a.a aVarM24158b = this.f23179f.m24158b(view);
        if (aVarM24158b == null) {
            return false;
        }
        C11100c.m24086a(jSONObject, aVarM24158b);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m24141b(View view, JSONObject jSONObject) {
        String strM24161c = this.f23179f.m24161c(view);
        if (strM24161c == null) {
            return false;
        }
        C11100c.m24088a(jSONObject, strM24161c);
        C11100c.m24087a(jSONObject, Boolean.valueOf(this.f23179f.m24167e(view)));
        C11100c.m24094b(jSONObject, Boolean.valueOf(this.f23179f.m24163c(strM24161c)));
        this.f23179f.m24165d();
        return true;
    }

    /* JADX INFO: renamed from: d */
    private void m24143d() {
        m24135a(C11103f.m24109b() - this.f23181h);
    }

    /* JADX INFO: renamed from: e */
    private void m24144e() {
        this.f23175b = 0;
        this.f23177d.clear();
        this.f23176c = false;
        Iterator<C11073a> it = C11083c.m23981c().m23982a().iterator();
        while (it.hasNext()) {
            if (it.next().m23942g()) {
                this.f23176c = true;
                break;
            }
        }
        this.f23181h = C11103f.m24109b();
    }

    public static TreeWalker getInstance() {
        return f23169i;
    }

    /* JADX INFO: renamed from: i */
    private void m24145i() {
        if (f23171k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f23171k = handler;
            handler.post(f23172l);
            f23171k.postDelayed(f23173m, 200L);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m24146k() {
        Handler handler = f23171k;
        if (handler != null) {
            handler.removeCallbacks(f23173m);
            f23171k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m24147l() {
        m24144e();
        m24148f();
        m24143d();
        C11090j.m24036b().m24037a();
    }

    @Override // com.iab.omid.library.fyber.processor.InterfaceC11091a.a
    /* JADX INFO: renamed from: a */
    public void mo24042a(View view, InterfaceC11091a interfaceC11091a, JSONObject jSONObject, boolean z) {
        EnumC11118c enumC11118cM24164d;
        TreeWalker treeWalker;
        if (C11105h.m24129f(view) && (enumC11118cM24164d = this.f23179f.m24164d(view)) != EnumC11118c.UNDERLYING_VIEW) {
            JSONObject jSONObjectMo24040a = interfaceC11091a.mo24040a(view);
            C11100c.m24090a(jSONObject, jSONObjectMo24040a);
            if (m24141b(view, jSONObjectMo24040a)) {
                treeWalker = this;
            } else {
                boolean z2 = z || m24138a(view, jSONObjectMo24040a);
                if (this.f23176c && enumC11118cM24164d == EnumC11118c.OBSTRUCTION_VIEW && !z2) {
                    this.f23177d.add(new C11119a(view));
                }
                treeWalker = this;
                treeWalker.m24136a(view, interfaceC11091a, jSONObjectMo24040a, enumC11118cM24164d, z2);
            }
            treeWalker.f23175b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23174a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f23174a.add(treeWalkerTimeLogger);
    }

    /* JADX INFO: renamed from: f */
    void m24148f() {
        TreeWalker treeWalker;
        this.f23179f.m24166e();
        long jM24109b = C11103f.m24109b();
        InterfaceC11091a interfaceC11091aM24043a = this.f23178e.m24043a();
        if (this.f23179f.m24160b().size() > 0) {
            for (String str : this.f23179f.m24160b()) {
                JSONObject jSONObjectMo24040a = interfaceC11091aM24043a.mo24040a(null);
                m24137a(str, this.f23179f.m24156a(str), jSONObjectMo24040a);
                C11100c.m24093b(jSONObjectMo24040a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f23180g.m24184a(jSONObjectMo24040a, hashSet, jM24109b);
            }
        }
        if (this.f23179f.m24162c().size() > 0) {
            JSONObject jSONObjectMo24040a2 = interfaceC11091aM24043a.mo24040a(null);
            treeWalker = this;
            treeWalker.m24136a(null, interfaceC11091aM24043a, jSONObjectMo24040a2, EnumC11118c.PARENT_VIEW, false);
            C11100c.m24093b(jSONObjectMo24040a2);
            treeWalker.f23180g.m24186b(jSONObjectMo24040a2, treeWalker.f23179f.m24162c(), jM24109b);
            if (treeWalker.f23176c) {
                Iterator<C11073a> it = C11083c.m23981c().m23982a().iterator();
                while (it.hasNext()) {
                    it.next().m23936a(treeWalker.f23177d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f23180g.m24185b();
        }
        treeWalker.f23179f.m24157a();
    }

    /* JADX INFO: renamed from: g */
    public void m24149g() {
        m24146k();
    }

    /* JADX INFO: renamed from: h */
    public void m24150h() {
        m24145i();
    }

    /* JADX INFO: renamed from: j */
    public void m24151j() {
        m24149g();
        this.f23174a.clear();
        f23170j.post(new RunnableC11107a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23174a.contains(treeWalkerTimeLogger)) {
            this.f23174a.remove(treeWalkerTimeLogger);
        }
    }
}
