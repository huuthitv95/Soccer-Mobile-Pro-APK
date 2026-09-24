package com.iab.omid.library.chartboost.adsession;

import android.view.View;
import com.iab.omid.library.chartboost.internal.C11029a;
import com.iab.omid.library.chartboost.internal.C11031c;
import com.iab.omid.library.chartboost.internal.C11033e;
import com.iab.omid.library.chartboost.internal.C11034f;
import com.iab.omid.library.chartboost.internal.C11037i;
import com.iab.omid.library.chartboost.publisher.AdSessionStatePublisher;
import com.iab.omid.library.chartboost.publisher.C11044a;
import com.iab.omid.library.chartboost.publisher.C11045b;
import com.iab.omid.library.chartboost.utils.C11052g;
import com.iab.omid.library.chartboost.weakreference.C11067a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.adsession.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11021a extends AdSession {

    /* JADX INFO: renamed from: a */
    private final AdSessionContext f22935a;

    /* JADX INFO: renamed from: b */
    private final AdSessionConfiguration f22936b;

    /* JADX INFO: renamed from: c */
    private final C11034f f22937c;

    /* JADX INFO: renamed from: d */
    private C11067a f22938d;

    /* JADX INFO: renamed from: e */
    private AdSessionStatePublisher f22939e;

    /* JADX INFO: renamed from: f */
    private boolean f22940f;

    /* JADX INFO: renamed from: g */
    private boolean f22941g;

    /* JADX INFO: renamed from: h */
    private final String f22942h;

    /* JADX INFO: renamed from: i */
    private boolean f22943i;

    /* JADX INFO: renamed from: j */
    private boolean f22944j;

    /* JADX INFO: renamed from: k */
    private PossibleObstructionListener f22945k;

    C11021a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    C11021a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f22937c = new C11034f();
        this.f22940f = false;
        this.f22941g = false;
        this.f22936b = adSessionConfiguration;
        this.f22935a = adSessionContext;
        this.f22942h = str;
        m23674b(null);
        this.f22939e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C11044a(str, adSessionContext.getWebView()) : new C11045b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f22939e.mo23815i();
        C11031c.m23724c().m23726a(this);
        this.f22939e.m23795a(adSessionConfiguration);
    }

    /* JADX INFO: renamed from: a */
    private void m23671a() {
        if (this.f22943i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23672a(View view) {
        Collection<C11021a> collectionM23727b = C11031c.m23724c().m23727b();
        if (collectionM23727b == null || collectionM23727b.isEmpty()) {
            return;
        }
        for (C11021a c11021a : collectionM23727b) {
            if (c11021a != this && c11021a.m23679e() == view) {
                c11021a.f22938d.clear();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m23673b() {
        if (this.f22944j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: b */
    private void m23674b(View view) {
        this.f22938d = new C11067a(view);
    }

    /* JADX INFO: renamed from: a */
    public void m23675a(List<C11067a> list) {
        if (m23681g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C11067a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f22945k.onPossibleObstructionsDetected(this.f22942h, arrayList);
        }
    }

    /* JADX INFO: renamed from: a */
    void m23676a(JSONObject jSONObject) {
        m23673b();
        m23678d().m23804a(jSONObject);
        this.f22944j = true;
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f22941g) {
            return;
        }
        this.f22937c.m23747a(view, friendlyObstructionPurpose, str);
    }

    /* JADX INFO: renamed from: c */
    public String m23677c() {
        return this.f22942h;
    }

    /* JADX INFO: renamed from: d */
    public AdSessionStatePublisher m23678d() {
        return this.f22939e;
    }

    /* JADX INFO: renamed from: e */
    public View m23679e() {
        return this.f22938d.get();
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f22941g) {
            throw new IllegalStateException("AdSession is finished");
        }
        C11052g.m23858a(errorType, "Error type is null");
        C11052g.m23860a(str, "Message is null");
        m23678d().m23796a(errorType, str);
    }

    /* JADX INFO: renamed from: f */
    public List<C11033e> m23680f() {
        return this.f22937c.m23746a();
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void finish() {
        if (this.f22941g) {
            return;
        }
        this.f22938d.clear();
        removeAllFriendlyObstructions();
        this.f22941g = true;
        m23678d().m23812f();
        C11031c.m23724c().m23728b(this);
        m23678d().mo23806b();
        this.f22939e = null;
        this.f22945k = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m23681g() {
        return this.f22945k != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m23682h() {
        return this.f22940f && !this.f22941g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m23683i() {
        return this.f22941g;
    }

    /* JADX INFO: renamed from: j */
    public boolean m23684j() {
        return this.f22936b.isNativeImpressionOwner();
    }

    /* JADX INFO: renamed from: k */
    public boolean m23685k() {
        return this.f22936b.isNativeMediaEventsOwner();
    }

    /* JADX INFO: renamed from: l */
    public boolean m23686l() {
        return this.f22940f;
    }

    /* JADX INFO: renamed from: m */
    void m23687m() {
        m23671a();
        m23678d().m23813g();
        this.f22943i = true;
    }

    /* JADX INFO: renamed from: n */
    void m23688n() {
        m23673b();
        m23678d().m23814h();
        this.f22944j = true;
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f22941g || m23679e() == view) {
            return;
        }
        m23674b(view);
        m23678d().m23791a();
        m23672a(view);
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f22941g) {
            return;
        }
        this.f22937c.m23748b();
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f22941g) {
            return;
        }
        this.f22937c.m23749c(view);
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f22945k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void start() {
        if (this.f22940f || this.f22939e == null) {
            return;
        }
        this.f22940f = true;
        C11031c.m23724c().m23729c(this);
        this.f22939e.m23792a(C11037i.m23772c().m23774b());
        this.f22939e.m23803a(C11029a.m23715a().m23719b());
        this.f22939e.mo23797a(this, this.f22935a);
    }
}
