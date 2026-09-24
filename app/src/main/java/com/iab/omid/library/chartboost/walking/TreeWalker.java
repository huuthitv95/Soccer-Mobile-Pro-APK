package com.iab.omid.library.chartboost.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.chartboost.adsession.C11021a;
import com.iab.omid.library.chartboost.internal.C11031c;
import com.iab.omid.library.chartboost.internal.C11038j;
import com.iab.omid.library.chartboost.processor.C11040b;
import com.iab.omid.library.chartboost.processor.InterfaceC11039a;
import com.iab.omid.library.chartboost.utils.C11048c;
import com.iab.omid.library.chartboost.utils.C11051f;
import com.iab.omid.library.chartboost.utils.C11053h;
import com.iab.omid.library.chartboost.walking.async.C11061c;
import com.iab.omid.library.chartboost.weakreference.C11067a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements InterfaceC11039a.a {

    /* JADX INFO: renamed from: i */
    private static TreeWalker f23034i = new TreeWalker();

    /* JADX INFO: renamed from: j */
    private static Handler f23035j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k */
    private static Handler f23036k = null;

    /* JADX INFO: renamed from: l */
    private static final Runnable f23037l = new RunnableC11056b();

    /* JADX INFO: renamed from: m */
    private static final Runnable f23038m = new RunnableC11057c();

    /* JADX INFO: renamed from: b */
    private int f23040b;

    /* JADX INFO: renamed from: h */
    private long f23046h;

    /* JADX INFO: renamed from: a */
    private List<TreeWalkerTimeLogger> f23039a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private boolean f23041c = false;

    /* JADX INFO: renamed from: d */
    private final List<C11067a> f23042d = new ArrayList();

    /* JADX INFO: renamed from: f */
    private C11058a f23044f = new C11058a();

    /* JADX INFO: renamed from: e */
    private C11040b f23043e = new C11040b();

    /* JADX INFO: renamed from: g */
    private C11065b f23045g = new C11065b(new C11061c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.walking.TreeWalker$a */
    class RunnableC11055a implements Runnable {
        RunnableC11055a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f23045g.m23929b();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.walking.TreeWalker$b */
    class RunnableC11056b implements Runnable {
        RunnableC11056b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().m23891l();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.walking.TreeWalker$c */
    class RunnableC11057c implements Runnable {
        RunnableC11057c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f23036k != null) {
                TreeWalker.f23036k.post(TreeWalker.f23037l);
                TreeWalker.f23036k.postDelayed(TreeWalker.f23038m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    /* JADX INFO: renamed from: a */
    private void m23879a(long j) {
        if (this.f23039a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f23039a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f23040b, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f23040b, j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23880a(View view, InterfaceC11039a interfaceC11039a, JSONObject jSONObject, EnumC11066c enumC11066c, boolean z) {
        interfaceC11039a.mo23784a(view, jSONObject, this, enumC11066c == EnumC11066c.PARENT_VIEW, z);
    }

    /* JADX INFO: renamed from: a */
    private void m23881a(String str, View view, JSONObject jSONObject) {
        InterfaceC11039a interfaceC11039aM23787b = this.f23043e.m23787b();
        String strM23903b = this.f23044f.m23903b(str);
        if (strM23903b != null) {
            JSONObject jSONObjectMo23783a = interfaceC11039aM23787b.mo23783a(view);
            C11048c.m23832a(jSONObjectMo23783a, str);
            C11048c.m23839b(jSONObjectMo23783a, strM23903b);
            C11048c.m23834a(jSONObject, jSONObjectMo23783a);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m23882a(View view, JSONObject jSONObject) {
        C11058a.a aVarM23902b = this.f23044f.m23902b(view);
        if (aVarM23902b == null) {
            return false;
        }
        C11048c.m23830a(jSONObject, aVarM23902b);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m23885b(View view, JSONObject jSONObject) {
        String strM23905c = this.f23044f.m23905c(view);
        if (strM23905c == null) {
            return false;
        }
        C11048c.m23832a(jSONObject, strM23905c);
        C11048c.m23831a(jSONObject, Boolean.valueOf(this.f23044f.m23911e(view)));
        C11048c.m23838b(jSONObject, Boolean.valueOf(this.f23044f.m23907c(strM23905c)));
        this.f23044f.m23909d();
        return true;
    }

    /* JADX INFO: renamed from: d */
    private void m23887d() {
        m23879a(C11051f.m23853b() - this.f23046h);
    }

    /* JADX INFO: renamed from: e */
    private void m23888e() {
        this.f23040b = 0;
        this.f23042d.clear();
        this.f23041c = false;
        Iterator<C11021a> it = C11031c.m23724c().m23725a().iterator();
        while (it.hasNext()) {
            if (it.next().m23681g()) {
                this.f23041c = true;
                break;
            }
        }
        this.f23046h = C11051f.m23853b();
    }

    public static TreeWalker getInstance() {
        return f23034i;
    }

    /* JADX INFO: renamed from: i */
    private void m23889i() {
        if (f23036k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f23036k = handler;
            handler.post(f23037l);
            f23036k.postDelayed(f23038m, 200L);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m23890k() {
        Handler handler = f23036k;
        if (handler != null) {
            handler.removeCallbacks(f23038m);
            f23036k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m23891l() {
        m23888e();
        m23892f();
        m23887d();
        C11038j.m23779b().m23780a();
    }

    @Override // com.iab.omid.library.chartboost.processor.InterfaceC11039a.a
    /* JADX INFO: renamed from: a */
    public void mo23785a(View view, InterfaceC11039a interfaceC11039a, JSONObject jSONObject, boolean z) {
        EnumC11066c enumC11066cM23908d;
        TreeWalker treeWalker;
        if (C11053h.m23873f(view) && (enumC11066cM23908d = this.f23044f.m23908d(view)) != EnumC11066c.UNDERLYING_VIEW) {
            JSONObject jSONObjectMo23783a = interfaceC11039a.mo23783a(view);
            C11048c.m23834a(jSONObject, jSONObjectMo23783a);
            if (m23885b(view, jSONObjectMo23783a)) {
                treeWalker = this;
            } else {
                boolean z2 = z || m23882a(view, jSONObjectMo23783a);
                if (this.f23041c && enumC11066cM23908d == EnumC11066c.OBSTRUCTION_VIEW && !z2) {
                    this.f23042d.add(new C11067a(view));
                }
                treeWalker = this;
                treeWalker.m23880a(view, interfaceC11039a, jSONObjectMo23783a, enumC11066cM23908d, z2);
            }
            treeWalker.f23040b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23039a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f23039a.add(treeWalkerTimeLogger);
    }

    /* JADX INFO: renamed from: f */
    void m23892f() {
        TreeWalker treeWalker;
        this.f23044f.m23910e();
        long jM23853b = C11051f.m23853b();
        InterfaceC11039a interfaceC11039aM23786a = this.f23043e.m23786a();
        if (this.f23044f.m23904b().size() > 0) {
            for (String str : this.f23044f.m23904b()) {
                JSONObject jSONObjectMo23783a = interfaceC11039aM23786a.mo23783a(null);
                m23881a(str, this.f23044f.m23900a(str), jSONObjectMo23783a);
                C11048c.m23837b(jSONObjectMo23783a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f23045g.m23928a(jSONObjectMo23783a, hashSet, jM23853b);
            }
        }
        if (this.f23044f.m23906c().size() > 0) {
            JSONObject jSONObjectMo23783a2 = interfaceC11039aM23786a.mo23783a(null);
            treeWalker = this;
            treeWalker.m23880a(null, interfaceC11039aM23786a, jSONObjectMo23783a2, EnumC11066c.PARENT_VIEW, false);
            C11048c.m23837b(jSONObjectMo23783a2);
            treeWalker.f23045g.m23930b(jSONObjectMo23783a2, treeWalker.f23044f.m23906c(), jM23853b);
            if (treeWalker.f23041c) {
                Iterator<C11021a> it = C11031c.m23724c().m23725a().iterator();
                while (it.hasNext()) {
                    it.next().m23675a(treeWalker.f23042d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f23045g.m23929b();
        }
        treeWalker.f23044f.m23901a();
    }

    /* JADX INFO: renamed from: g */
    public void m23893g() {
        m23890k();
    }

    /* JADX INFO: renamed from: h */
    public void m23894h() {
        m23889i();
    }

    /* JADX INFO: renamed from: j */
    public void m23895j() {
        m23893g();
        this.f23039a.clear();
        f23035j.post(new RunnableC11055a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23039a.contains(treeWalkerTimeLogger)) {
            this.f23039a.remove(treeWalkerTimeLogger);
        }
    }
}
