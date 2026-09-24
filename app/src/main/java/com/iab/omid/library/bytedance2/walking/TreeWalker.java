package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.C10970a;
import com.iab.omid.library.bytedance2.internal.C10980c;
import com.iab.omid.library.bytedance2.processor.C10988b;
import com.iab.omid.library.bytedance2.processor.InterfaceC10987a;
import com.iab.omid.library.bytedance2.utils.C10996c;
import com.iab.omid.library.bytedance2.utils.C10999f;
import com.iab.omid.library.bytedance2.utils.C11001h;
import com.iab.omid.library.bytedance2.walking.async.C11009c;
import com.iab.omid.library.bytedance2.weakreference.C11015a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements InterfaceC10987a.a {

    /* JADX INFO: renamed from: i */
    private static TreeWalker f22894i = new TreeWalker();

    /* JADX INFO: renamed from: j */
    private static Handler f22895j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k */
    private static Handler f22896k = null;

    /* JADX INFO: renamed from: l */
    private static final Runnable f22897l = new RunnableC11004b();

    /* JADX INFO: renamed from: m */
    private static final Runnable f22898m = new RunnableC11005c();

    /* JADX INFO: renamed from: b */
    private int f22900b;

    /* JADX INFO: renamed from: h */
    private long f22906h;

    /* JADX INFO: renamed from: a */
    private List<TreeWalkerTimeLogger> f22899a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private boolean f22901c = false;

    /* JADX INFO: renamed from: d */
    private final List<C11015a> f22902d = new ArrayList();

    /* JADX INFO: renamed from: f */
    private C11006a f22904f = new C11006a();

    /* JADX INFO: renamed from: e */
    private C10988b f22903e = new C10988b();

    /* JADX INFO: renamed from: g */
    private C11013b f22905g = new C11013b(new C11009c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.TreeWalker$a */
    class RunnableC11003a implements Runnable {
        RunnableC11003a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f22905g.m23669b();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.TreeWalker$b */
    class RunnableC11004b implements Runnable {
        RunnableC11004b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().m23632l();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.TreeWalker$c */
    class RunnableC11005c implements Runnable {
        RunnableC11005c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f22896k != null) {
                TreeWalker.f22896k.post(TreeWalker.f22897l);
                TreeWalker.f22896k.postDelayed(TreeWalker.f22898m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    /* JADX INFO: renamed from: a */
    private void m23620a(long j) {
        if (this.f22899a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f22899a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f22900b, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f22900b, j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23621a(View view, InterfaceC10987a interfaceC10987a, JSONObject jSONObject, EnumC11014c enumC11014c, boolean z) {
        interfaceC10987a.mo23530a(view, jSONObject, this, enumC11014c == EnumC11014c.PARENT_VIEW, z);
    }

    /* JADX INFO: renamed from: a */
    private void m23622a(String str, View view, JSONObject jSONObject) {
        InterfaceC10987a interfaceC10987aM23533b = this.f22903e.m23533b();
        String strM23643b = this.f22904f.m23643b(str);
        if (strM23643b != null) {
            JSONObject jSONObjectMo23529a = interfaceC10987aM23533b.mo23529a(view);
            C10996c.m23576a(jSONObjectMo23529a, str);
            C10996c.m23582b(jSONObjectMo23529a, strM23643b);
            C10996c.m23578a(jSONObject, jSONObjectMo23529a);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m23623a(View view, JSONObject jSONObject) {
        C11006a.a aVarM23645c = this.f22904f.m23645c(view);
        if (aVarM23645c == null) {
            return false;
        }
        C10996c.m23574a(jSONObject, aVarM23645c);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m23626b(View view, JSONObject jSONObject) {
        String strM23647d = this.f22904f.m23647d(view);
        if (strM23647d == null) {
            return false;
        }
        C10996c.m23576a(jSONObject, strM23647d);
        C10996c.m23575a(jSONObject, Boolean.valueOf(this.f22904f.m23651f(view)));
        this.f22904f.m23648d();
        return true;
    }

    /* JADX INFO: renamed from: d */
    private void m23628d() {
        m23620a(C10999f.m23596b() - this.f22906h);
    }

    /* JADX INFO: renamed from: e */
    private void m23629e() {
        this.f22900b = 0;
        this.f22902d.clear();
        this.f22901c = false;
        Iterator<C10970a> it = C10980c.m23477c().m23478a().iterator();
        while (it.hasNext()) {
            if (it.next().m23438e()) {
                this.f22901c = true;
                break;
            }
        }
        this.f22906h = C10999f.m23596b();
    }

    public static TreeWalker getInstance() {
        return f22894i;
    }

    /* JADX INFO: renamed from: i */
    private void m23630i() {
        if (f22896k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f22896k = handler;
            handler.post(f22897l);
            f22896k.postDelayed(f22898m, 200L);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m23631k() {
        Handler handler = f22896k;
        if (handler != null) {
            handler.removeCallbacks(f22898m);
            f22896k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m23632l() {
        m23629e();
        m23633f();
        m23628d();
    }

    @Override // com.iab.omid.library.bytedance2.processor.InterfaceC10987a.a
    /* JADX INFO: renamed from: a */
    public void mo23531a(View view, InterfaceC10987a interfaceC10987a, JSONObject jSONObject, boolean z) {
        EnumC11014c enumC11014cM23649e;
        TreeWalker treeWalker;
        if (C11001h.m23614d(view) && (enumC11014cM23649e = this.f22904f.m23649e(view)) != EnumC11014c.UNDERLYING_VIEW) {
            JSONObject jSONObjectMo23529a = interfaceC10987a.mo23529a(view);
            C10996c.m23578a(jSONObject, jSONObjectMo23529a);
            if (m23626b(view, jSONObjectMo23529a)) {
                treeWalker = this;
            } else {
                boolean z2 = z || m23623a(view, jSONObjectMo23529a);
                if (this.f22901c && enumC11014cM23649e == EnumC11014c.OBSTRUCTION_VIEW && !z2) {
                    this.f22902d.add(new C11015a(view));
                }
                treeWalker = this;
                treeWalker.m23621a(view, interfaceC10987a, jSONObjectMo23529a, enumC11014cM23649e, z2);
            }
            treeWalker.f22900b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f22899a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f22899a.add(treeWalkerTimeLogger);
    }

    /* JADX INFO: renamed from: f */
    void m23633f() {
        TreeWalker treeWalker;
        this.f22904f.m23650e();
        long jM23596b = C10999f.m23596b();
        InterfaceC10987a interfaceC10987aM23532a = this.f22903e.m23532a();
        if (this.f22904f.m23644b().size() > 0) {
            for (String str : this.f22904f.m23644b()) {
                JSONObject jSONObjectMo23529a = interfaceC10987aM23532a.mo23529a(null);
                m23622a(str, this.f22904f.m23641a(str), jSONObjectMo23529a);
                C10996c.m23581b(jSONObjectMo23529a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f22905g.m23668a(jSONObjectMo23529a, hashSet, jM23596b);
            }
        }
        if (this.f22904f.m23646c().size() > 0) {
            JSONObject jSONObjectMo23529a2 = interfaceC10987aM23532a.mo23529a(null);
            treeWalker = this;
            treeWalker.m23621a(null, interfaceC10987aM23532a, jSONObjectMo23529a2, EnumC11014c.PARENT_VIEW, false);
            C10996c.m23581b(jSONObjectMo23529a2);
            treeWalker.f22905g.m23670b(jSONObjectMo23529a2, treeWalker.f22904f.m23646c(), jM23596b);
            if (treeWalker.f22901c) {
                Iterator<C10970a> it = C10980c.m23477c().m23478a().iterator();
                while (it.hasNext()) {
                    it.next().m23434a(treeWalker.f22902d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f22905g.m23669b();
        }
        treeWalker.f22904f.m23642a();
    }

    /* JADX INFO: renamed from: g */
    public void m23634g() {
        m23631k();
    }

    /* JADX INFO: renamed from: h */
    public void m23635h() {
        m23630i();
    }

    /* JADX INFO: renamed from: j */
    public void m23636j() {
        m23634g();
        this.f22899a.clear();
        f22895j.post(new RunnableC11003a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f22899a.contains(treeWalkerTimeLogger)) {
            this.f22899a.remove(treeWalkerTimeLogger);
        }
    }
}
