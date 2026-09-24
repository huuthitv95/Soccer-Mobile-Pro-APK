package com.iab.omid.library.unity3d.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.unity3d.adsession.C11224a;
import com.iab.omid.library.unity3d.internal.C11234c;
import com.iab.omid.library.unity3d.processor.C11241b;
import com.iab.omid.library.unity3d.processor.InterfaceC11240a;
import com.iab.omid.library.unity3d.utils.C11249c;
import com.iab.omid.library.unity3d.utils.C11252f;
import com.iab.omid.library.unity3d.utils.C11254h;
import com.iab.omid.library.unity3d.walking.async.C11261c;
import com.iab.omid.library.unity3d.weakreference.C11267a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements InterfaceC11240a.a {

    /* JADX INFO: renamed from: i */
    private static TreeWalker f23568i = new TreeWalker();

    /* JADX INFO: renamed from: j */
    private static Handler f23569j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k */
    private static Handler f23570k = null;

    /* JADX INFO: renamed from: l */
    private static final Runnable f23571l = new RunnableC11256b();

    /* JADX INFO: renamed from: m */
    private static final Runnable f23572m = new RunnableC11257c();

    /* JADX INFO: renamed from: b */
    private int f23574b;

    /* JADX INFO: renamed from: h */
    private long f23580h;

    /* JADX INFO: renamed from: a */
    private List<TreeWalkerTimeLogger> f23573a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private boolean f23575c = false;

    /* JADX INFO: renamed from: d */
    private final List<C11267a> f23576d = new ArrayList();

    /* JADX INFO: renamed from: f */
    private C11258a f23578f = new C11258a();

    /* JADX INFO: renamed from: e */
    private C11241b f23577e = new C11241b();

    /* JADX INFO: renamed from: g */
    private C11265b f23579g = new C11265b(new C11261c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.TreeWalker$a */
    class RunnableC11255a implements Runnable {
        RunnableC11255a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f23579g.m24925b();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.TreeWalker$b */
    class RunnableC11256b implements Runnable {
        RunnableC11256b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().m24888l();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.TreeWalker$c */
    class RunnableC11257c implements Runnable {
        RunnableC11257c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f23570k != null) {
                TreeWalker.f23570k.post(TreeWalker.f23571l);
                TreeWalker.f23570k.postDelayed(TreeWalker.f23572m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    /* JADX INFO: renamed from: a */
    private void m24876a(long j) {
        if (this.f23573a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f23573a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f23574b, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f23574b, j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24877a(View view, InterfaceC11240a interfaceC11240a, JSONObject jSONObject, EnumC11266c enumC11266c, boolean z) {
        interfaceC11240a.mo24789a(view, jSONObject, this, enumC11266c == EnumC11266c.PARENT_VIEW, z);
    }

    /* JADX INFO: renamed from: a */
    private void m24878a(String str, View view, JSONObject jSONObject) {
        InterfaceC11240a interfaceC11240aM24792b = this.f23577e.m24792b();
        String strM24899b = this.f23578f.m24899b(str);
        if (strM24899b != null) {
            JSONObject jSONObjectMo24788a = interfaceC11240aM24792b.mo24788a(view);
            C11249c.m24835a(jSONObjectMo24788a, str);
            C11249c.m24841b(jSONObjectMo24788a, strM24899b);
            C11249c.m24837a(jSONObject, jSONObjectMo24788a);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m24879a(View view, JSONObject jSONObject) {
        C11258a.a aVarM24901c = this.f23578f.m24901c(view);
        if (aVarM24901c == null) {
            return false;
        }
        C11249c.m24833a(jSONObject, aVarM24901c);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m24882b(View view, JSONObject jSONObject) {
        String strM24903d = this.f23578f.m24903d(view);
        if (strM24903d == null) {
            return false;
        }
        C11249c.m24835a(jSONObject, strM24903d);
        C11249c.m24834a(jSONObject, Boolean.valueOf(this.f23578f.m24907f(view)));
        this.f23578f.m24904d();
        return true;
    }

    /* JADX INFO: renamed from: d */
    private void m24884d() {
        m24876a(C11252f.m24854b() - this.f23580h);
    }

    /* JADX INFO: renamed from: e */
    private void m24885e() {
        this.f23574b = 0;
        this.f23576d.clear();
        this.f23575c = false;
        Iterator<C11224a> it = C11234c.m24743c().m24744a().iterator();
        while (it.hasNext()) {
            if (it.next().m24704e()) {
                this.f23575c = true;
                break;
            }
        }
        this.f23580h = C11252f.m24854b();
    }

    public static TreeWalker getInstance() {
        return f23568i;
    }

    /* JADX INFO: renamed from: i */
    private void m24886i() {
        if (f23570k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f23570k = handler;
            handler.post(f23571l);
            f23570k.postDelayed(f23572m, 200L);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m24887k() {
        Handler handler = f23570k;
        if (handler != null) {
            handler.removeCallbacks(f23572m);
            f23570k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m24888l() {
        m24885e();
        m24889f();
        m24884d();
    }

    @Override // com.iab.omid.library.unity3d.processor.InterfaceC11240a.a
    /* JADX INFO: renamed from: a */
    public void mo24790a(View view, InterfaceC11240a interfaceC11240a, JSONObject jSONObject, boolean z) {
        EnumC11266c enumC11266cM24905e;
        TreeWalker treeWalker;
        if (C11254h.m24872d(view) && (enumC11266cM24905e = this.f23578f.m24905e(view)) != EnumC11266c.UNDERLYING_VIEW) {
            JSONObject jSONObjectMo24788a = interfaceC11240a.mo24788a(view);
            C11249c.m24837a(jSONObject, jSONObjectMo24788a);
            if (m24882b(view, jSONObjectMo24788a)) {
                treeWalker = this;
            } else {
                boolean z2 = z || m24879a(view, jSONObjectMo24788a);
                if (this.f23575c && enumC11266cM24905e == EnumC11266c.OBSTRUCTION_VIEW && !z2) {
                    this.f23576d.add(new C11267a(view));
                }
                treeWalker = this;
                treeWalker.m24877a(view, interfaceC11240a, jSONObjectMo24788a, enumC11266cM24905e, z2);
            }
            treeWalker.f23574b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23573a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f23573a.add(treeWalkerTimeLogger);
    }

    /* JADX INFO: renamed from: f */
    void m24889f() {
        TreeWalker treeWalker;
        this.f23578f.m24906e();
        long jM24854b = C11252f.m24854b();
        InterfaceC11240a interfaceC11240aM24791a = this.f23577e.m24791a();
        if (this.f23578f.m24900b().size() > 0) {
            for (String str : this.f23578f.m24900b()) {
                JSONObject jSONObjectMo24788a = interfaceC11240aM24791a.mo24788a(null);
                m24878a(str, this.f23578f.m24897a(str), jSONObjectMo24788a);
                C11249c.m24840b(jSONObjectMo24788a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f23579g.m24924a(jSONObjectMo24788a, hashSet, jM24854b);
            }
        }
        if (this.f23578f.m24902c().size() > 0) {
            JSONObject jSONObjectMo24788a2 = interfaceC11240aM24791a.mo24788a(null);
            treeWalker = this;
            treeWalker.m24877a(null, interfaceC11240aM24791a, jSONObjectMo24788a2, EnumC11266c.PARENT_VIEW, false);
            C11249c.m24840b(jSONObjectMo24788a2);
            treeWalker.f23579g.m24926b(jSONObjectMo24788a2, treeWalker.f23578f.m24902c(), jM24854b);
            if (treeWalker.f23575c) {
                Iterator<C11224a> it = C11234c.m24743c().m24744a().iterator();
                while (it.hasNext()) {
                    it.next().m24700a(treeWalker.f23576d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f23579g.m24925b();
        }
        treeWalker.f23578f.m24898a();
    }

    /* JADX INFO: renamed from: g */
    public void m24890g() {
        m24887k();
    }

    /* JADX INFO: renamed from: h */
    public void m24891h() {
        m24886i();
    }

    /* JADX INFO: renamed from: j */
    public void m24892j() {
        m24890g();
        this.f23573a.clear();
        f23569j.post(new RunnableC11255a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23573a.contains(treeWalkerTimeLogger)) {
            this.f23573a.remove(treeWalkerTimeLogger);
        }
    }
}
