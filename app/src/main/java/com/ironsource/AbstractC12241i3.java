package com.ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.AbstractC12259j3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C12332c;
import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.C12352e;
import com.ironsource.mediationsdk.C12353f;
import com.ironsource.mediationsdk.C12355h;
import com.ironsource.mediationsdk.C12359l;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12241i3<Smash extends AbstractC12259j3<?>, Listener extends AdapterAdListener> implements InterfaceC11639R0, InterfaceC11691U1, InterfaceC11408E0, InterfaceC11365Bb, InterfaceC12605xc, InterfaceC12395o, InterfaceC12627yg, InterfaceC12453r3, InterfaceC12326md {

    /* JADX INFO: renamed from: A */
    private AdInfo f30520A;

    /* JADX INFO: renamed from: B */
    private C12266ja f30521B;

    /* JADX INFO: renamed from: C */
    final InterfaceC11524K8 f30522C;

    /* JADX INFO: renamed from: D */
    final InterfaceC11524K8.a f30523D;

    /* JADX INFO: renamed from: E */
    protected final InterfaceC11523K7 f30524E;

    /* JADX INFO: renamed from: F */
    private final InterfaceC11523K7.a f30525F;

    /* JADX INFO: renamed from: G */
    private boolean f30526G;

    /* JADX INFO: renamed from: H */
    private C11405Df f30527H;

    /* JADX INFO: renamed from: I */
    private AtomicBoolean f30528I;

    /* JADX INFO: renamed from: J */
    private HandlerThreadC11615P9 f30529J;

    /* JADX INFO: renamed from: a */
    protected C12609xg<Smash> f30530a;

    /* JADX INFO: renamed from: b */
    protected ConcurrentHashMap<String, C12106b2.a> f30531b;

    /* JADX INFO: renamed from: c */
    protected C12352e f30532c;

    /* JADX INFO: renamed from: d */
    protected C12106b2 f30533d;

    /* JADX INFO: renamed from: e */
    protected int f30534e;

    /* JADX INFO: renamed from: f */
    protected String f30535f;

    /* JADX INFO: renamed from: g */
    protected JSONObject f30536g;

    /* JADX INFO: renamed from: h */
    protected C12434q2 f30537h;

    /* JADX INFO: renamed from: i */
    protected C12135cd f30538i;

    /* JADX INFO: renamed from: j */
    protected boolean f30539j;

    /* JADX INFO: renamed from: k */
    private NetworkStateReceiver f30540k;

    /* JADX INFO: renamed from: l */
    protected C11602Oe f30541l;

    /* JADX INFO: renamed from: m */
    protected C12189f5 f30542m;

    /* JADX INFO: renamed from: n */
    protected C12189f5 f30543n;

    /* JADX INFO: renamed from: o */
    protected C11723W f30544o;

    /* JADX INFO: renamed from: p */
    protected f f30545p;

    /* JADX INFO: renamed from: q */
    protected C11623Q0 f30546q;

    /* JADX INFO: renamed from: r */
    protected C11539L5 f30547r;

    /* JADX INFO: renamed from: s */
    protected C11426F0 f30548s;

    /* JADX INFO: renamed from: t */
    protected AbstractC11534L0 f30549t;

    /* JADX INFO: renamed from: u */
    protected C12467s f30550u;

    /* JADX INFO: renamed from: v */
    protected C11767Y9 f30551v;

    /* JADX INFO: renamed from: w */
    protected UUID f30552w;

    /* JADX INFO: renamed from: x */
    protected final Object f30553x;

    /* JADX INFO: renamed from: y */
    private long f30554y;

    /* JADX INFO: renamed from: z */
    private Boolean f30555z;

    /* JADX INFO: renamed from: com.ironsource.i3$a */
    class a extends AbstractRunnableC11754Xd {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            AbstractC12241i3.this.m31694y();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ NetworkSettings f30557a;

        b(NetworkSettings networkSettings) {
            this.f30557a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC12241i3.this.m31685c(this.f30557a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$c */
    class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC12241i3.this.m31670A();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC12241i3.this.f30536g = new JSONObject();
            AbstractC12241i3.this.f30548s.f24290h.m27488a((Double) null);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            AbstractC12241i3.this.m31682b(map, arrayList, sb, arrayList2);
            AbstractC12241i3.this.m31679a(map, arrayList, sb, arrayList2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$e */
    class e implements C12524t3.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Map f30561a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ StringBuilder f30562b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f30563c;

        e(Map map, StringBuilder sb, List list) {
            this.f30561a = map;
            this.f30562b = sb;
            this.f30563c = list;
        }

        @Override // com.ironsource.C12524t3.b
        /* JADX INFO: renamed from: a */
        public void mo27432a(List<C12542u3> list, long j, List<String> list2) {
            AbstractC12241i3.this.f30548s.f24289g.m27538a(j);
            for (C12542u3 c12542u3 : list) {
                NetworkSettings networkSettingsM27765a = AbstractC12241i3.this.f30544o.m27765a(c12542u3.m33877c());
                Map<String, Object> mapM31681b = AbstractC12241i3.this.m31681b(networkSettingsM27765a, C12332c.m32303b().m32322b(networkSettingsM27765a, AbstractC12241i3.this.f30544o.m27768b(), AbstractC12241i3.this.m31722h()));
                if (c12542u3.m33875a() != null) {
                    this.f30561a.put(c12542u3.m33877c(), c12542u3.m33875a());
                    StringBuilder sb = this.f30562b;
                    sb.append(c12542u3.m33878d());
                    sb.append(c12542u3.m33877c());
                    sb.append(",");
                    AbstractC12241i3.this.f30548s.f24289g.m27541a(mapM31681b, c12542u3.m33879e());
                } else {
                    AbstractC12241i3.this.f30548s.f24289g.m27542a(mapM31681b, c12542u3.m33879e(), c12542u3.m33876b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings networkSettingsM27765a2 = AbstractC12241i3.this.f30544o.m27765a(it.next());
                AbstractC12241i3.this.f30548s.f24289g.m27543b(AbstractC12241i3.this.m31681b(networkSettingsM27765a2, C12332c.m32303b().m32322b(networkSettingsM27765a2, AbstractC12241i3.this.f30544o.m27768b(), AbstractC12241i3.this.m31722h())), j);
            }
            AbstractC12241i3.this.m31678a((Map<String, Object>) this.f30561a, (List<String>) this.f30563c, this.f30562b.toString());
        }

        @Override // com.ironsource.C12524t3.b
        public void onFailure(String str) {
            AbstractC12241i3.this.f30548s.f24289g.m27539a(str);
            AbstractC12241i3.this.m31678a((Map<String, Object>) this.f30561a, (List<String>) this.f30563c, this.f30562b.toString());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$f */
    protected enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public AbstractC12241i3(C11723W c11723w, C12266ja c12266ja, C11767Y9 c11767y9) {
        this(C11455Gb.m25891U(), C11455Gb.m25885O(), c11723w, c12266ja, c11767y9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public void m31670A() {
        IronLog.INTERNAL.verbose(m31720f());
        AsyncTask.execute(new d());
    }

    /* JADX INFO: renamed from: B */
    private C11424Eg<Smash> m31671B() {
        IronLog.INTERNAL.verbose();
        return new C11406Dg(this.f30544o).m25640d(this.f30530a.m34193b());
    }

    /* JADX INFO: renamed from: C */
    private void m31672C() {
        this.f30550u.mo31546a(this.f30544o.m27768b(), false);
    }

    /* JADX INFO: renamed from: H */
    private void m31673H() {
        IronLog.INTERNAL.verbose(m31720f());
        synchronized (this.f30553x) {
            f fVar = this.f30545p;
            f fVar2 = f.AUCTION;
            if (fVar == fVar2) {
                return;
            }
            m31710a(fVar2);
            this.f30528I.set(false);
            long jM33285k = this.f30544o.m27771d().m33285k() - C12189f5.m31432a(this.f30542m);
            if (jM33285k > 0) {
                new Timer().schedule(new c(), jM33285k);
            } else {
                m31670A();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    private void m31674I() {
        IronLog.INTERNAL.verbose(m31720f());
        m31677a(m31690g(), m31725j());
    }

    /* JADX INFO: renamed from: c */
    private boolean m31688c(boolean z) {
        Boolean bool = this.f30555z;
        if (bool == null) {
            return false;
        }
        if (z && !bool.booleanValue() && m31729r()) {
            return true;
        }
        return !z && this.f30555z.booleanValue();
    }

    /* JADX INFO: renamed from: d */
    private boolean m31689d(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceM32322b = C12332c.m32303b().m32322b(networkSettings, this.f30544o.m27768b(), m31722h());
        if (adapterBaseInterfaceM32322b instanceof AdapterSettingsInterface) {
            return this.f30530a.m34191a(this.f30544o.m27775h().m26706a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), m31698a(networkSettings, adapterBaseInterfaceM32322b), adapterBaseInterfaceM32322b, this.f30544o.m27768b());
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    private List<C12434q2> m31690g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.f30544o.mo27739j()) {
            if (!networkSettings.isBidder(this.f30544o.m27768b()) && m31689d(networkSettings)) {
                C11584Ne c11584Ne = new C11584Ne(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f30544o.m27768b()));
                if (!this.f30541l.mo26203b(c11584Ne)) {
                    copyOnWriteArrayList.add(new C12434q2(c11584Ne.mo26207c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: renamed from: m */
    private int m31691m() {
        return 1;
    }

    /* JADX INFO: renamed from: o */
    private void m31692o() {
        IronLog.INTERNAL.verbose(m31720f());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f30544o.mo27739j()) {
            if (m31687c(networkSettings, C12332c.m32303b().m32322b(networkSettings, this.f30544o.m27768b(), m31722h()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.f30544o.m27777k(), this.f30544o.m27781p(), arrayList);
    }

    /* JADX INFO: renamed from: p */
    private void m31693p() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f30544o.mo27739j()) {
            arrayList.add(new C11584Ne(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f30544o.m27768b())));
        }
        C11602Oe c11602Oe = new C11602Oe();
        this.f30541l = c11602Oe;
        c11602Oe.mo26205a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m31694y() {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31720f());
        synchronized (this.f30553x) {
            if (this.f30544o.m27775h().m26710e() && this.f30541l.mo26202a()) {
                ironLog.verbose(m31715b("all smashes are capped"));
                m31704a(C11354B0.m25367a(this.f30544o.m27768b()), "all smashes are capped", false);
                return;
            }
            if (!m31728q() && this.f30545p == f.SHOWING) {
                IronLog.API.error(m31715b("load cannot be invoked while showing an ad"));
                mo27620a(new IronSourceError(C11354B0.m25370d(this.f30544o.m27768b()), "load cannot be invoked while showing an ad"));
                return;
            }
            if (this.f30544o.m27775h().m26706a() != C11588O0.a.AUTOMATIC_LOAD_WHILE_SHOW && this.f30544o.m27775h().m26706a() != C11588O0.a.MANUAL_WITH_LOAD_ON_SHOW && (((fVar = this.f30545p) != f.READY_TO_LOAD && fVar != f.READY_TO_SHOW) || C12359l.m32560a().m32564b(this.f30544o.m27768b()))) {
                IronLog.API.error(m31715b("load is already in progress"));
                return;
            }
            this.f30536g = new JSONObject();
            m31672C();
            if (mo27626s()) {
                this.f30548s.f24288f.m33944a();
            } else {
                this.f30548s.f24288f.m33953a(m31727n());
            }
            this.f30543n = new C12189f5();
            if (this.f30544o.m27782q()) {
                if (!this.f30531b.isEmpty()) {
                    this.f30533d.m31127a(this.f30531b);
                    this.f30531b.clear();
                }
                m31673H();
            } else {
                m31710a(f.LOADING);
            }
            if (this.f30544o.m27782q()) {
                return;
            }
            ironLog.verbose(m31715b("auction disabled"));
            m31674I();
            m31695z();
        }
    }

    /* JADX INFO: renamed from: z */
    private void m31695z() {
        C11424Eg<Smash> c11424EgM31671B = m31671B();
        if (c11424EgM31671B.m25740c()) {
            m31704a(509, "Mediation No fill", false);
        }
        Iterator<Smash> it = c11424EgM31671B.m25738a().iterator();
        while (it.hasNext()) {
            it.next().m31811E();
        }
    }

    /* JADX INFO: renamed from: D */
    protected void mo27613D() {
        C12359l.m32560a().m32562a(this.f30544o.m27768b(), this.f30544o.m27773f());
    }

    /* JADX INFO: renamed from: E */
    protected boolean mo27614E() {
        return true;
    }

    /* JADX INFO: renamed from: F */
    protected boolean m31696F() {
        return true;
    }

    /* JADX INFO: renamed from: G */
    public void m31697G() {
        Iterator<NetworkSettings> it = this.f30544o.mo27739j().iterator();
        while (it.hasNext()) {
            C12332c.m32303b().m32322b(it.next(), this.f30544o.m27768b(), m31722h());
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract Smash mo27616a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i, String str, C12434q2 c12434q2);

    /* JADX INFO: renamed from: a */
    public void m31706a(Context context, boolean z) {
        IronLog.INTERNAL.verbose(m31715b("track = " + z));
        try {
            this.f30539j = z;
            if (z) {
                if (this.f30540k == null) {
                    this.f30540k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f30540k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f30540k != null) {
                context.getApplicationContext().unregisterReceiver(this.f30540k);
            }
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    protected abstract JSONObject mo27622b(NetworkSettings networkSettings);

    /* JADX INFO: renamed from: b */
    protected void m31717b(boolean z) {
        m31713a(false, z, (AbstractC12259j3<?>) null);
    }

    /* JADX INFO: renamed from: d */
    protected abstract AbstractC11534L0 mo27623d();

    /* JADX INFO: renamed from: e */
    protected C11623Q0 m31719e() {
        return new C11623Q0(this.f30544o.m27775h(), this);
    }

    /* JADX INFO: renamed from: f */
    protected String m31720f() {
        return m31715b((String) null);
    }

    /* JADX INFO: renamed from: h */
    protected void m31723h(AbstractC12259j3<?> abstractC12259j3) {
        if (this.f30544o.m27775h().m26711f()) {
            mo27618a(abstractC12259j3, abstractC12259j3.m31821f());
        } else {
            m31713a(true, false, abstractC12259j3);
        }
    }

    /* JADX INFO: renamed from: i */
    protected abstract String mo27624i();

    /* JADX INFO: renamed from: i */
    protected void m31724i(AbstractC12259j3<?> abstractC12259j3) {
        if (this.f30544o.m27782q() && this.f30528I.compareAndSet(false, true)) {
            C12434q2 c12434q2M31824i = abstractC12259j3.m31824i();
            this.f30532c.m32460a(c12434q2M31824i, abstractC12259j3.m31827l(), this.f30537h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, C12434q2> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.f30530a.m34193b()) {
                arrayList.add(smash.mo26207c());
                concurrentHashMap.put(smash.mo26207c(), smash.m31824i());
            }
            this.f30532c.m32462a(arrayList, concurrentHashMap, abstractC12259j3.m31827l(), this.f30537h, c12434q2M31824i);
        }
    }

    /* JADX INFO: renamed from: j */
    protected String m31725j() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: k */
    protected String m31726k() {
        C12135cd c12135cd = this.f30538i;
        return c12135cd == null ? "" : c12135cd.m32814c();
    }

    /* JADX INFO: renamed from: l */
    abstract String mo27625l();

    /* JADX INFO: renamed from: n */
    protected boolean m31727n() {
        return false;
    }

    /* JADX INFO: renamed from: q */
    protected boolean m31728q() {
        return false;
    }

    /* JADX INFO: renamed from: r */
    protected boolean m31729r() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    protected abstract boolean mo27626s();

    /* JADX INFO: renamed from: t */
    protected boolean m31730t() {
        boolean z;
        synchronized (this.f30553x) {
            f fVar = this.f30545p;
            z = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
        }
        return z;
    }

    /* JADX INFO: renamed from: u */
    protected boolean m31731u() {
        boolean z;
        synchronized (this.f30553x) {
            z = this.f30545p == f.READY_TO_SHOW;
        }
        return z;
    }

    /* JADX INFO: renamed from: v */
    protected boolean m31732v() {
        boolean z;
        synchronized (this.f30553x) {
            z = this.f30545p == f.AUCTION;
        }
        return z;
    }

    /* JADX INFO: renamed from: w */
    protected boolean m31733w() {
        boolean z;
        synchronized (this.f30553x) {
            z = this.f30545p == f.LOADING;
        }
        return z;
    }

    /* JADX INFO: renamed from: x */
    public void m31734x() {
        if (mo31718c()) {
            mo31711a(new a());
        } else {
            m31694y();
        }
    }

    @Override // com.ironsource.InterfaceC11365Bb
    /* JADX INFO: renamed from: b */
    public void mo25485b() {
        IronLog.INTERNAL.verbose(m31720f());
        m31734x();
    }

    @Override // com.ironsource.InterfaceC11639R0
    /* JADX INFO: renamed from: e */
    public void mo27315e(AbstractC12259j3<?> abstractC12259j3) {
        IronLog.INTERNAL.verbose(m31715b(abstractC12259j3.m31826k()));
        this.f30548s.f24291i.m26689a(m31726k());
        this.f30549t.mo26319a(this.f30538i, abstractC12259j3.m31821f());
    }

    AbstractC12241i3(InterfaceC11451G7 interfaceC11451G7, InterfaceC11433F7 interfaceC11433F7, C11723W c11723w, C12266ja c12266ja, C11767Y9 c11767y9) {
        this.f30535f = "";
        this.f30539j = false;
        this.f30553x = new Object();
        this.f30554y = 0L;
        this.f30528I = new AtomicBoolean(false);
        this.f30552w = UUID.randomUUID();
        this.f30522C = interfaceC11451G7.mo25852s();
        this.f30523D = interfaceC11433F7.mo25775i();
        this.f30524E = interfaceC11451G7.mo25855w();
        this.f30525F = interfaceC11433F7.mo25781x();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + c11723w.m27768b() + ", loading mode = " + c11723w.m27775h().m26706a());
        StringBuilder sb = new StringBuilder();
        sb.append(c11723w.m27768b());
        sb.append(" initiated object per waterfall mode");
        IronSourceUtils.m32782i(sb.toString());
        C12189f5 c12189f5 = new C12189f5();
        this.f30529J = m31675a(c11723w);
        this.f30551v = c11767y9;
        this.f30544o = c11723w;
        this.f30548s = new C11426F0(c11723w.m27768b(), C11426F0.b.MEDIATION, this);
        this.f30549t = mo27623d();
        this.f30546q = m31719e();
        m31710a(f.NONE);
        this.f30521B = c12266ja;
        this.f30530a = new C12609xg<>(this.f30544o.m27771d().m33280f(), this.f30544o.m27771d().m33283i(), this);
        this.f30548s.f24287e.m27677a(mo27625l(), this.f30544o.m27775h().m26706a().toString());
        this.f30531b = new ConcurrentHashMap<>();
        this.f30538i = null;
        mo27613D();
        this.f30536g = new JSONObject();
        if (this.f30544o.m27782q()) {
            this.f30532c = new C12352e(new C12353f(this.f30544o.m27771d(), IronSourceUtils.m32764d()));
        }
        this.f30533d = new C12106b2(this.f30544o.mo27739j(), this.f30544o.m27771d().m33277c());
        m31693p();
        m31692o();
        this.f30542m = new C12189f5();
        m31710a(f.READY_TO_LOAD);
        this.f30547r = new C11539L5(c11723w.m27764a(), this);
        this.f30550u = new C12467s();
        this.f30548s.f24287e.m27676a(C12189f5.m31432a(c12189f5));
        if (this.f30544o.m27775h().m26710e()) {
            ironLog.verbose("first automatic load");
            m31734x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m31682b(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC12435q3> list2) {
        for (NetworkSettings networkSettings : this.f30544o.mo27739j()) {
            C11405Df c11405Df = this.f30527H;
            if (c11405Df == null || c11405Df.m25634a(networkSettings, this.f30544o.m27768b())) {
                if (!this.f30541l.mo26203b(new C11584Ne(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f30544o.m27768b()))) && m31689d(networkSettings)) {
                    AdData adDataM31700a = m31700a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.f30544o.m27768b())) {
                        AdapterBaseInterface adapterBaseInterfaceM32322b = C12332c.m32303b().m32322b(networkSettings, this.f30544o.m27768b(), m31722h());
                        if (adapterBaseInterfaceM32322b instanceof InterfaceC12471s3) {
                            list2.add(new CallableC12435q3(networkSettings.getInstanceType(this.f30544o.m27768b()), networkSettings.getProviderInstanceName(), adDataM31700a, (InterfaceC12471s3) adapterBaseInterfaceM32322b, this, networkSettings));
                        } else {
                            this.f30548s.f24292j.m27986g(adapterBaseInterfaceM32322b == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb.append(networkSettings.getInstanceType(this.f30544o.m27768b()));
                        sb.append(networkSettings.getProviderInstanceName());
                        sb.append(",");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public UUID m31722h() {
        return this.f30552w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m31685c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(m31715b(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
        AdData adDataM31700a = m31700a(networkSettings, this.f30544o.mo27740o());
        AdapterBaseInterface adapterBaseInterfaceM32322b = C12332c.m32303b().m32322b(networkSettings, this.f30544o.m27768b(), m31722h());
        if (adapterBaseInterfaceM32322b != null) {
            try {
                adapterBaseInterfaceM32322b.init(adDataM31700a, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                this.f30548s.f24292j.m27986g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e2);
            }
        }
        IronLog.INTERNAL.verbose(m31715b(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
    }

    @Override // com.ironsource.InterfaceC11639R0
    /* JADX INFO: renamed from: d */
    public void mo27314d(AbstractC12259j3<?> abstractC12259j3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31715b(abstractC12259j3.m31826k()));
        if (!abstractC12259j3.m31823h().equals(this.f30530a.m34195c())) {
            ironLog.error(m31715b("invoked from " + abstractC12259j3.mo26207c() + " with state = " + this.f30545p + " auctionId: " + abstractC12259j3.m31823h() + " and the current id is " + this.f30530a.m34195c()));
            C11756Xf c11756Xf = this.f30548s.f24292j;
            StringBuilder sb = new StringBuilder("onAdLoadSuccess invoked with state = ");
            sb.append(this.f30545p);
            c11756Xf.m27995p(sb.toString());
            return;
        }
        if (this.f30544o.m27779m()) {
            List<Smash> listM34193b = this.f30530a.m34193b();
            C11406Dg c11406Dg = new C11406Dg(this.f30544o);
            boolean zM25636a = c11406Dg.m25636a(abstractC12259j3, listM34193b);
            synchronized (this.f30553x) {
                if (zM25636a) {
                    if (m31730t()) {
                        m31724i(abstractC12259j3);
                    }
                }
                if (c11406Dg.m25637a(listM34193b)) {
                    m31724i(c11406Dg.m25639c(listM34193b));
                }
            }
        }
        this.f30531b.put(abstractC12259j3.mo26207c(), C12106b2.a.ISAuctionPerformanceLoadedSuccessfully);
        if (m31714a(f.LOADING, f.READY_TO_SHOW)) {
            long jM31432a = C12189f5.m31432a(this.f30543n);
            if (mo27626s()) {
                this.f30548s.f24288f.m33946a(jM31432a);
            } else {
                this.f30548s.f24288f.m33951a(jM31432a, m31727n());
            }
            if (this.f30544o.m27775h().m26710e()) {
                this.f30547r.m26351a(0L);
            }
            if (!this.f30544o.m27779m()) {
                m31724i(abstractC12259j3);
            }
            m31723h(abstractC12259j3);
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m31710a(f fVar) {
        synchronized (this.f30553x) {
            IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.f30545p = fVar;
        }
    }

    /* JADX INFO: renamed from: g */
    protected void m31721g(AbstractC12259j3<?> abstractC12259j3) {
        this.f30549t.mo26329d(abstractC12259j3.m31821f());
    }

    /* JADX INFO: renamed from: a */
    protected boolean m31714a(f fVar, f fVar2) {
        boolean z;
        synchronized (this.f30553x) {
            if (this.f30545p == fVar) {
                IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                this.f30545p = fVar2;
                z = true;
            } else {
                IronLog.INTERNAL.verbose("wrong state, current state = " + this.f30545p + ", expected state = " + fVar);
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    private HandlerThreadC11615P9 m31675a(C11723W c11723w) {
        if (c11723w.m27778l()) {
            return IronSourceThreadManager.INSTANCE.getSharedManagersThread();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    protected void m31708a(AbstractC11534L0 abstractC11534L0) {
        this.f30549t = abstractC11534L0;
    }

    /* JADX INFO: renamed from: a */
    protected BaseAdAdapter<?, Listener> m31699a(NetworkSettings networkSettings, IronSource.EnumC12328a enumC12328a) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) C12332c.m32303b().m32319a(networkSettings, enumC12328a, m31722h());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    protected void m31713a(boolean z, boolean z2, AbstractC12259j3<?> abstractC12259j3) {
        synchronized (this.f30553x) {
            Boolean bool = this.f30555z;
            if (bool == null || bool.booleanValue() != z) {
                this.f30555z = Boolean.valueOf(z);
                long time = 0;
                if (this.f30554y != 0) {
                    time = new Date().getTime() - this.f30554y;
                }
                this.f30554y = new Date().getTime();
                this.f30548s.f24288f.m33954a(z, time, z2);
                AdInfo adInfoM31821f = abstractC12259j3 != null ? abstractC12259j3.m31821f() : this.f30520A;
                this.f30520A = adInfoM31821f;
                AbstractC11534L0 abstractC11534L0 = this.f30549t;
                if (!z) {
                    adInfoM31821f = null;
                }
                abstractC11534L0.mo26324a(z, adInfoM31821f);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m31687c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.f30530a.m34192a(adapterBaseInterface, this.f30544o.m27768b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit(networkSettings.isBidder(this.f30544o.m27768b()));
    }

    /* JADX INFO: renamed from: b */
    private boolean m31684b(EnumC11372C0 enumC11372C0) {
        return !new ArrayList(Arrays.asList(EnumC11372C0.INIT_STARTED, EnumC11372C0.LOAD_AD, EnumC11372C0.AUCTION_REQUEST, EnumC11372C0.AUCTION_REQUEST_WATERFALL, EnumC11372C0.AUCTION_FAILED_NO_CANDIDATES, EnumC11372C0.COLLECT_TOKEN, EnumC11372C0.COLLECT_TOKENS_COMPLETED, EnumC11372C0.COLLECT_TOKENS_FAILED, EnumC11372C0.INSTANCE_COLLECT_TOKEN, EnumC11372C0.INSTANCE_COLLECT_TOKEN_SUCCESS, EnumC11372C0.INSTANCE_COLLECT_TOKEN_FAILED, EnumC11372C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(enumC11372C0);
    }

    /* JADX INFO: renamed from: c */
    private boolean m31686c(EnumC11372C0 enumC11372C0) {
        return new ArrayList(Arrays.asList(EnumC11372C0.LOAD_AD_SUCCESS, EnumC11372C0.LOAD_AD_FAILED, EnumC11372C0.LOAD_AD_FAILED_WITH_REASON, EnumC11372C0.AUCTION_SUCCESS, EnumC11372C0.AUCTION_FAILED, EnumC11372C0.AUCTION_FAILED_NO_CANDIDATES, EnumC11372C0.AD_FORMAT_CAPPED, EnumC11372C0.AD_OPENED, EnumC11372C0.SHOW_AD, EnumC11372C0.SHOW_AD_FAILED, EnumC11372C0.AD_CLICKED, EnumC11372C0.RELOAD_AD_FAILED_WITH_REASON, EnumC11372C0.RELOAD_AD_SUCCESS, EnumC11372C0.AD_LEFT_APPLICATION)).contains(enumC11372C0);
    }

    @Override // com.ironsource.InterfaceC12395o
    /* JADX INFO: renamed from: a */
    public void mo31702a() {
        if (this.f30544o.m27775h().m26710e()) {
            m31710a(f.READY_TO_LOAD);
            m31717b(true);
            m31734x();
        }
    }

    /* JADX INFO: renamed from: b */
    protected void m31716b(C12434q2 c12434q2, String str) {
        if (c12434q2 != null) {
            C11698U8 c11698u8M33140a = c12434q2.m33140a(str);
            if (c11698u8M33140a != null) {
                for (ImpressionDataListener impressionDataListener : new HashSet(this.f30521B.m31873a())) {
                    IronLog.CALLBACK.info(m31715b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + c11698u8M33140a));
                    impressionDataListener.onImpressionSuccess(c11698u8M33140a);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.error(m31715b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
        C11426F0 c11426f0 = this.f30548s;
        if (c11426f0 != null) {
            c11426f0.f24292j.m27986g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
        }
    }

    @Override // com.ironsource.InterfaceC12326md
    /* JADX INFO: renamed from: c */
    public boolean mo31718c() {
        HandlerThreadC11615P9 handlerThreadC11615P9 = this.f30529J;
        if (handlerThreadC11615P9 == null || handlerThreadC11615P9 == Thread.currentThread()) {
            return false;
        }
        return this.f30544o.m27778l();
    }

    @Override // com.ironsource.InterfaceC12605xc
    /* JADX INFO: renamed from: a */
    public void mo31712a(boolean z) {
        if (!this.f30539j || this.f30544o.m27775h().m26711f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z);
        if (m31688c(z)) {
            m31713a(z, false, (AbstractC12259j3<?>) null);
        }
    }

    /* JADX INFO: renamed from: a */
    protected LoadWhileShowSupportState m31698a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    /* JADX INFO: renamed from: a */
    private String m31677a(List<C12434q2> list, String str) {
        IronLog.INTERNAL.verbose(m31715b("waterfall.size() = " + list.size()));
        this.f30531b.clear();
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < list.size(); i++) {
            C12434q2 c12434q2 = list.get(i);
            AbstractC12259j3 abstractC12259j3M31676a = m31676a(c12434q2, str);
            if (abstractC12259j3M31676a != null) {
                copyOnWriteArrayList.add(abstractC12259j3M31676a);
                sb.append(m31701a(c12434q2, abstractC12259j3M31676a.m31827l()));
            }
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.f30530a.m34189a(this.f30544o.m27775h().m26706a(), (CopyOnWriteArrayList<Smash>) copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(m31715b("updateWaterfall() - next waterfall is " + ((Object) sb)));
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private void m31683b(JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.f30544o.m27769b(false);
                IronLog.INTERNAL.verbose(m31715b("loading configuration from auction response is null, using the following: " + this.f30544o.m27783r()));
                return;
            }
            try {
                if (jSONObject.has(C12333d.f31060x) && (i = jSONObject.getInt(C12333d.f31060x)) > 0) {
                    this.f30544o.m27766a(i);
                }
                if (jSONObject.has(C12333d.f31061y)) {
                    this.f30544o.m27767a(jSONObject.getBoolean(C12333d.f31061y));
                }
                this.f30544o.m27769b(jSONObject.optBoolean(C12333d.f31062z, false));
                IronLog.INTERNAL.verbose(m31715b(this.f30544o.m27783r()));
            } catch (JSONException e2) {
                C12317m4.m32153d().m32155a(e2);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f30544o.m27768b() + " Error: " + e2.getMessage());
                ironLog.verbose(m31715b(this.f30544o.m27783r()));
            }
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(m31715b(this.f30544o.m27783r()));
            throw th;
        }
    }

    @Override // com.ironsource.InterfaceC12627yg
    /* JADX INFO: renamed from: a */
    public void mo31703a(int i) {
        this.f30548s.f24292j.m28001v("waterfalls hold too many with size = " + i);
    }

    /* JADX INFO: renamed from: a */
    private Smash m31676a(C12434q2 c12434q2, String str) {
        NetworkSettings networkSettingsM27765a = this.f30544o.m27765a(c12434q2.m33143c());
        if (networkSettingsM27765a != null) {
            C12332c.m32303b().m32322b(networkSettingsM27765a, this.f30544o.m27768b(), m31722h());
            BaseAdAdapter<?, Listener> baseAdAdapterM31699a = m31699a(networkSettingsM27765a, this.f30544o.m27768b());
            if (baseAdAdapterM31699a != null) {
                Smash smash = (Smash) mo27616a(networkSettingsM27765a, baseAdAdapterM31699a, this.f30522C.mo26265a(this.f30544o.m27768b()), str, c12434q2);
                this.f30531b.put(c12434q2.m33143c(), C12106b2.a.ISAuctionPerformanceDidntAttemptToLoad);
                return smash;
            }
            IronLog.INTERNAL.error(m31715b("addSmashToWaterfall - could not load ad adapter for " + networkSettingsM27765a.getProviderInstanceName()));
            return null;
        }
        String str2 = "could not find matching provider settings for auction response item - item = " + c12434q2.m33143c() + " state = " + this.f30545p;
        IronLog.INTERNAL.error(m31715b(str2));
        this.f30548s.f24292j.m27988i(str2);
        return null;
    }

    /* JADX INFO: renamed from: b */
    protected String m31715b(String str) {
        String str2 = this.f30544o.m27768b().name() + " state:" + this.f30545p;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public Map<String, Object> m31681b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap map = new HashMap();
        try {
            map.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            map.put("spId", networkSettings.getSubProviderId());
            map.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.f30544o.m27768b())));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(m31691m()));
            return map;
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e2);
            return map;
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m31704a(int i, String str, boolean z) {
        int i2;
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        m31710a(f.READY_TO_LOAD);
        ironLog.verbose(m31715b("errorCode = " + i + ", errorReason = " + str));
        if (this.f30544o.m27775h().m26711f()) {
            if (z) {
                i2 = i;
                str2 = str;
            } else {
                i2 = i;
                str2 = str;
                this.f30548s.f24288f.m33949a(C12189f5.m31432a(this.f30543n), i2, str2, m31727n());
            }
            mo27620a(new IronSourceError(i2, str2));
        } else {
            if (!z) {
                this.f30548s.f24292j.m27977b(i, str);
            }
            m31717b(false);
        }
        this.f30546q.m27274e();
    }

    /* JADX INFO: renamed from: a */
    protected void mo27618a(AbstractC12259j3<?> abstractC12259j3, AdInfo adInfo) {
        this.f30549t.mo26328c(adInfo);
    }

    /* JADX INFO: renamed from: a */
    protected void mo27620a(IronSourceError ironSourceError) {
        C12359l.m32560a().m32563b(this.f30544o.m27768b(), ironSourceError);
    }

    /* JADX INFO: renamed from: a */
    protected AdData m31700a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(mo27622b(networkSettings), this.f30544o.m27768b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m31679a(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC12435q3> list2) {
        if (list2.isEmpty()) {
            m31678a(map, list, sb.toString());
            return;
        }
        C12524t3 c12524t3 = new C12524t3();
        e eVar = new e(map, sb, list);
        this.f30548s.f24289g.m27537a();
        c12524t3.m33734a(list2, eVar, this.f30544o.m27772e(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m31678a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31715b("auction waterfallString = " + str));
        boolean z = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(m31715b("auction failed - no candidates"));
            this.f30548s.f24290h.m27485a(1005, "No candidates available for auctioning");
            m31704a(C11354B0.m25371e(this.f30544o.m27768b()), "no available ad to load", false);
            return;
        }
        this.f30548s.f24290h.m27490b(str);
        if (this.f30532c != null) {
            int iMo26265a = this.f30522C.mo26265a(this.f30544o.m27768b());
            C12355h c12355h = new C12355h(this.f30544o.m27768b());
            c12355h.m32498b(IronSourceUtils.m32779g());
            c12355h.m32494a(map);
            c12355h.m32493a(list);
            c12355h.m32487a(this.f30533d);
            c12355h.m32485a(iMo26265a);
            c12355h.m32486a(this.f30551v);
            c12355h.m32504d(this.f30526G);
            C11405Df c11405Df = this.f30527H;
            if (c11405Df != null && c11405Df.m25635b()) {
                z = true;
            }
            c12355h.m32506e(z);
            m31705a(ContextProvider.getInstance().getApplicationContext(), c12355h, this);
            return;
        }
        ironLog.error(m31715b("mAuctionHandler is null"));
    }

    /* JADX INFO: renamed from: a */
    protected void m31705a(Context context, C12355h c12355h, InterfaceC11691U1 interfaceC11691U1) {
        C12352e c12352e = this.f30532c;
        if (c12352e != null) {
            c12352e.m32457a(context, c12355h, interfaceC11691U1);
        } else {
            IronLog.INTERNAL.error(m31715b("mAuctionHandler is null"));
        }
    }

    @Override // com.ironsource.InterfaceC11691U1
    /* JADX INFO: renamed from: a */
    public void mo27554a(List<C12434q2> list, String str, C12434q2 c12434q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31720f());
        if (m31732v()) {
            this.f30535f = "";
            this.f30534e = i;
            this.f30537h = c12434q2;
            this.f30536g = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                this.f30548s.f24292j.m27964a(i2, str2);
            }
            m31680a(jSONObject2);
            if (this.f30550u.mo31545a(this.f30544o.m27768b())) {
                this.f30548s.f24290h.m27489a(str);
                m31704a(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
                return;
            }
            String strM31677a = m31677a(list, str);
            this.f30548s.f24290h.m27487a(j, this.f30544o.m27783r() + ";wtf=" + list.size());
            this.f30548s.f24290h.m27491c(strM31677a);
            m31710a(f.LOADING);
            m31695z();
            return;
        }
        ironLog.error(m31715b("unexpected auction success for auctionId - " + str + " state = " + this.f30545p));
        C11756Xf c11756Xf = this.f30548s.f24292j;
        StringBuilder sb = new StringBuilder("unexpected auction success, state = ");
        sb.append(this.f30545p);
        c11756Xf.m27990k(sb.toString());
    }

    @Override // com.ironsource.InterfaceC11691U1
    /* JADX INFO: renamed from: a */
    public void mo27553a(int i, String str, int i2, String str2, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31720f());
        if (m31732v()) {
            String str3 = "Auction failed (error " + i + " - " + str + ")";
            ironLog.verbose(m31715b(str3));
            IronSourceUtils.m32782i(mo27624i() + ": " + str3);
            this.f30534e = i2;
            this.f30535f = str2;
            this.f30536g = new JSONObject();
            if (this.f30544o.m27771d().m33288n()) {
                ironLog.verbose(m31715b("Moving to fallback waterfall"));
                m31674I();
            }
            this.f30548s.f24290h.m27486a(j, i, str);
            m31710a(f.LOADING);
            m31695z();
            return;
        }
        String str4 = "unexpected auction fail - error = " + i + ", " + str + " state = " + this.f30545p;
        ironLog.error(m31715b(str4));
        this.f30548s.f24292j.m27989j(str4);
    }

    @Override // com.ironsource.InterfaceC11639R0
    /* JADX INFO: renamed from: a */
    public void mo27313a(IronSourceError ironSourceError, AbstractC12259j3<?> abstractC12259j3) {
        C11424Eg<Smash> c11424EgM31671B;
        AbstractC12259j3<?> abstractC12259j3M25639c;
        synchronized (this.f30553x) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(m31715b(abstractC12259j3.m31826k() + " - error = " + ironSourceError));
            if (abstractC12259j3.m31823h().equals(this.f30530a.m34195c()) && this.f30545p != f.AUCTION) {
                this.f30531b.put(abstractC12259j3.mo26207c(), C12106b2.a.ISAuctionPerformanceFailedToLoad);
                if (m31733w() || m31731u()) {
                    c11424EgM31671B = m31671B();
                    if (c11424EgM31671B.m25740c()) {
                        m31704a(509, "Mediation No fill", false);
                        return;
                    }
                } else {
                    c11424EgM31671B = null;
                }
                if (c11424EgM31671B == null) {
                    return;
                }
                if (this.f30544o.m27779m()) {
                    synchronized (this.f30553x) {
                        if (c11424EgM31671B.m25739b() && m31730t() && (abstractC12259j3M25639c = new C11406Dg(this.f30544o).m25639c(this.f30530a.m34193b())) != null) {
                            m31724i(abstractC12259j3M25639c);
                        }
                    }
                }
                Iterator<Smash> it = c11424EgM31671B.m25738a().iterator();
                while (it.hasNext()) {
                    it.next().m31811E();
                }
                return;
            }
            ironLog.error(m31715b("onAdLoadFailed was invoked from " + abstractC12259j3.mo26207c() + " with state =" + this.f30545p + " auctionId: " + abstractC12259j3.m31823h() + " and the current id is " + this.f30530a.m34195c()));
            C11756Xf c11756Xf = this.f30548s.f24292j;
            StringBuilder sb = new StringBuilder("onAdLoadFailed was invoked with state =");
            sb.append(this.f30545p);
            c11756Xf.m27994o(sb.toString());
        }
    }

    @Override // com.ironsource.InterfaceC11639R0
    /* JADX INFO: renamed from: a */
    public void mo27312a(AbstractC12259j3<?> abstractC12259j3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31715b(abstractC12259j3.m31826k()));
        this.f30548s.f24291i.m26701g(m31726k());
        this.f30530a.m34190a(abstractC12259j3);
        this.f30530a.m34194b(abstractC12259j3);
        this.f30541l.mo26204a(abstractC12259j3);
        if (this.f30541l.mo26203b(abstractC12259j3)) {
            ironLog.verbose(m31715b(abstractC12259j3.mo26207c() + " was session capped"));
            abstractC12259j3.m31813N();
            IronSourceUtils.m32782i(abstractC12259j3.mo26207c() + " was session capped");
        }
        this.f30525F.mo26263a(ContextProvider.getInstance().getApplicationContext(), m31726k(), this.f30544o.m27768b());
        if (this.f30524E.mo26262c(ContextProvider.getInstance().getApplicationContext(), this.f30538i, this.f30544o.m27768b())) {
            ironLog.verbose(m31715b("placement " + m31726k() + " is capped"));
            this.f30548s.f24291i.m26696b(m31726k(), null);
        }
        this.f30523D.mo26267b(this.f30544o.m27768b());
        if (this.f30544o.m27782q()) {
            C12434q2 c12434q2M31824i = abstractC12259j3.m31824i();
            this.f30532c.m32461a(c12434q2M31824i, abstractC12259j3.m31827l(), this.f30537h, m31726k());
            this.f30531b.put(abstractC12259j3.mo26207c(), C12106b2.a.ISAuctionPerformanceShowedSuccessfully);
            if (mo27614E()) {
                m31716b(c12434q2M31824i, m31726k());
            }
        }
        m31721g(abstractC12259j3);
        if (this.f30544o.m27775h().m26710e()) {
            m31717b(false);
        }
        this.f30546q.m27277h();
    }

    /* JADX INFO: renamed from: a */
    public Map<String, Object> mo25594a(EnumC11372C0 enumC11372C0) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.f30536g;
        if (jSONObject != null && jSONObject.length() > 0) {
            map.put("genericParams", this.f30536g);
        }
        map.put("sessionDepth", Integer.valueOf(this.f30522C.mo26265a(this.f30544o.m27768b())));
        if (m31686c(enumC11372C0)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f30534e));
            if (!TextUtils.isEmpty(this.f30535f)) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f30535f);
            }
        }
        if (m31684b(enumC11372C0) && !TextUtils.isEmpty(this.f30530a.m34195c())) {
            map.put("auctionId", this.f30530a.m34195c());
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public void m31709a(C11767Y9 c11767y9) {
        this.f30551v = c11767y9;
    }

    /* JADX INFO: renamed from: a */
    private void m31680a(JSONObject jSONObject) {
        this.f30550u.mo31546a(this.f30544o.m27768b(), jSONObject != null ? jSONObject.optBoolean(C12333d.f31042f, false) : false);
        m31683b(jSONObject);
    }

    /* JADX INFO: renamed from: a */
    protected String m31701a(C12434q2 c12434q2, int i) {
        return String.format("%s%s", Integer.valueOf(i), c12434q2.m33143c());
    }

    /* JADX INFO: renamed from: a */
    public void m31707a(C11405Df c11405Df) {
        this.f30527H = c11405Df;
        if (c11405Df != null) {
            this.f30526G = true;
        } else {
            this.f30526G = false;
        }
        this.f30555z = null;
    }

    @Override // com.ironsource.InterfaceC12453r3
    /* JADX INFO: renamed from: a */
    public void mo27428a(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceM32322b = C12332c.m32303b().m32322b(networkSettings, this.f30544o.m27768b(), m31722h());
        if (adapterBaseInterfaceM32322b != null) {
            this.f30548s.f24289g.m27540a(m31681b(networkSettings, adapterBaseInterfaceM32322b));
        }
    }

    @Override // com.ironsource.InterfaceC12453r3
    /* JADX INFO: renamed from: a */
    public void mo27429a(String str) {
        this.f30548s.f24292j.m27986g(str);
    }

    @Override // com.ironsource.InterfaceC12326md
    /* JADX INFO: renamed from: a */
    public void mo31711a(Runnable runnable) {
        HandlerThreadC11615P9 handlerThreadC11615P9 = this.f30529J;
        if (handlerThreadC11615P9 != null) {
            handlerThreadC11615P9.m27241a(runnable);
        }
    }
}
