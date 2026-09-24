package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.adsession.C10919a;
import com.iab.omid.library.applovin.internal.C10929c;
import com.iab.omid.library.applovin.internal.C10936j;
import com.iab.omid.library.applovin.processor.C10938b;
import com.iab.omid.library.applovin.processor.InterfaceC10937a;
import com.iab.omid.library.applovin.utils.C10946c;
import com.iab.omid.library.applovin.utils.C10949f;
import com.iab.omid.library.applovin.utils.C10951h;
import com.iab.omid.library.applovin.walking.async.C10959c;
import com.iab.omid.library.applovin.weakreference.C10965a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements InterfaceC10937a.a {

    /* JADX INFO: renamed from: i */
    private static TreeWalker f22764i = new TreeWalker();

    /* JADX INFO: renamed from: j */
    private static Handler f22765j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k */
    private static Handler f22766k = null;

    /* JADX INFO: renamed from: l */
    private static final Runnable f22767l = new RunnableC10954b();

    /* JADX INFO: renamed from: m */
    private static final Runnable f22768m = new RunnableC10955c();

    /* JADX INFO: renamed from: b */
    private int f22770b;

    /* JADX INFO: renamed from: h */
    private long f22776h;

    /* JADX INFO: renamed from: a */
    private List<TreeWalkerTimeLogger> f22769a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private boolean f22771c = false;

    /* JADX INFO: renamed from: d */
    private final List<C10965a> f22772d = new ArrayList();

    /* JADX INFO: renamed from: f */
    private C10956a f22774f = new C10956a();

    /* JADX INFO: renamed from: e */
    private C10938b f22773e = new C10938b();

    /* JADX INFO: renamed from: g */
    private C10963b f22775g = new C10963b(new C10959c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.TreeWalker$a */
    class RunnableC10953a implements Runnable {
        RunnableC10953a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f22775g.m23428b();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.TreeWalker$b */
    class RunnableC10954b implements Runnable {
        RunnableC10954b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().m23390l();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.TreeWalker$c */
    class RunnableC10955c implements Runnable {
        RunnableC10955c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f22766k != null) {
                TreeWalker.f22766k.post(TreeWalker.f22767l);
                TreeWalker.f22766k.postDelayed(TreeWalker.f22768m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    /* JADX INFO: renamed from: a */
    private void m23378a(long j) {
        if (this.f22769a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f22769a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f22770b, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f22770b, j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23379a(View view, InterfaceC10937a interfaceC10937a, JSONObject jSONObject, EnumC10964c enumC10964c, boolean z) {
        interfaceC10937a.mo23284a(view, jSONObject, this, enumC10964c == EnumC10964c.PARENT_VIEW, z);
    }

    /* JADX INFO: renamed from: a */
    private void m23380a(String str, View view, JSONObject jSONObject) {
        InterfaceC10937a interfaceC10937aM23287b = this.f22773e.m23287b();
        String strM23402b = this.f22774f.m23402b(str);
        if (strM23402b != null) {
            JSONObject jSONObjectMo23283a = interfaceC10937aM23287b.mo23283a(view);
            C10946c.m23331a(jSONObjectMo23283a, str);
            C10946c.m23338b(jSONObjectMo23283a, strM23402b);
            C10946c.m23333a(jSONObject, jSONObjectMo23283a);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m23381a(View view, JSONObject jSONObject) {
        C10956a.a aVarM23401b = this.f22774f.m23401b(view);
        if (aVarM23401b == null) {
            return false;
        }
        C10946c.m23329a(jSONObject, aVarM23401b);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m23384b(View view, JSONObject jSONObject) {
        String strM23404c = this.f22774f.m23404c(view);
        if (strM23404c == null) {
            return false;
        }
        C10946c.m23331a(jSONObject, strM23404c);
        C10946c.m23330a(jSONObject, Boolean.valueOf(this.f22774f.m23410e(view)));
        C10946c.m23337b(jSONObject, Boolean.valueOf(this.f22774f.m23406c(strM23404c)));
        this.f22774f.m23408d();
        return true;
    }

    /* JADX INFO: renamed from: d */
    private void m23386d() {
        m23378a(C10949f.m23352b() - this.f22776h);
    }

    /* JADX INFO: renamed from: e */
    private void m23387e() {
        this.f22770b = 0;
        this.f22772d.clear();
        this.f22771c = false;
        Iterator<C10919a> it = C10929c.m23224c().m23225a().iterator();
        while (it.hasNext()) {
            if (it.next().m23185g()) {
                this.f22771c = true;
                break;
            }
        }
        this.f22776h = C10949f.m23352b();
    }

    public static TreeWalker getInstance() {
        return f22764i;
    }

    /* JADX INFO: renamed from: i */
    private void m23388i() {
        if (f22766k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f22766k = handler;
            handler.post(f22767l);
            f22766k.postDelayed(f22768m, 200L);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m23389k() {
        Handler handler = f22766k;
        if (handler != null) {
            handler.removeCallbacks(f22768m);
            f22766k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m23390l() {
        m23387e();
        m23391f();
        m23386d();
        C10936j.m23279b().m23280a();
    }

    @Override // com.iab.omid.library.applovin.processor.InterfaceC10937a.a
    /* JADX INFO: renamed from: a */
    public void mo23285a(View view, InterfaceC10937a interfaceC10937a, JSONObject jSONObject, boolean z) {
        EnumC10964c enumC10964cM23407d;
        TreeWalker treeWalker;
        if (C10951h.m23372f(view) && (enumC10964cM23407d = this.f22774f.m23407d(view)) != EnumC10964c.UNDERLYING_VIEW) {
            JSONObject jSONObjectMo23283a = interfaceC10937a.mo23283a(view);
            C10946c.m23333a(jSONObject, jSONObjectMo23283a);
            if (m23384b(view, jSONObjectMo23283a)) {
                treeWalker = this;
            } else {
                boolean z2 = z || m23381a(view, jSONObjectMo23283a);
                if (this.f22771c && enumC10964cM23407d == EnumC10964c.OBSTRUCTION_VIEW && !z2) {
                    this.f22772d.add(new C10965a(view));
                }
                treeWalker = this;
                treeWalker.m23379a(view, interfaceC10937a, jSONObjectMo23283a, enumC10964cM23407d, z2);
            }
            treeWalker.f22770b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f22769a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f22769a.add(treeWalkerTimeLogger);
    }

    /* JADX INFO: renamed from: f */
    void m23391f() {
        TreeWalker treeWalker;
        this.f22774f.m23409e();
        long jM23352b = C10949f.m23352b();
        InterfaceC10937a interfaceC10937aM23286a = this.f22773e.m23286a();
        if (this.f22774f.m23403b().size() > 0) {
            for (String str : this.f22774f.m23403b()) {
                JSONObject jSONObjectMo23283a = interfaceC10937aM23286a.mo23283a(null);
                m23380a(str, this.f22774f.m23399a(str), jSONObjectMo23283a);
                C10946c.m23336b(jSONObjectMo23283a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f22775g.m23427a(jSONObjectMo23283a, hashSet, jM23352b);
            }
        }
        if (this.f22774f.m23405c().size() > 0) {
            JSONObject jSONObjectMo23283a2 = interfaceC10937aM23286a.mo23283a(null);
            treeWalker = this;
            treeWalker.m23379a(null, interfaceC10937aM23286a, jSONObjectMo23283a2, EnumC10964c.PARENT_VIEW, false);
            C10946c.m23336b(jSONObjectMo23283a2);
            treeWalker.f22775g.m23429b(jSONObjectMo23283a2, treeWalker.f22774f.m23405c(), jM23352b);
            if (treeWalker.f22771c) {
                Iterator<C10919a> it = C10929c.m23224c().m23225a().iterator();
                while (it.hasNext()) {
                    it.next().m23179a(treeWalker.f22772d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f22775g.m23428b();
        }
        treeWalker.f22774f.m23400a();
    }

    /* JADX INFO: renamed from: g */
    public void m23392g() {
        m23389k();
    }

    /* JADX INFO: renamed from: h */
    public void m23393h() {
        m23388i();
    }

    /* JADX INFO: renamed from: j */
    public void m23394j() {
        m23392g();
        this.f22769a.clear();
        f22765j.post(new RunnableC10953a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f22769a.contains(treeWalkerTimeLogger)) {
            this.f22769a.remove(treeWalkerTimeLogger);
        }
    }
}
