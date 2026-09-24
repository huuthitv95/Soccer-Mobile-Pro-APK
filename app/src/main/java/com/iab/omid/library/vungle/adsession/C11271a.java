package com.iab.omid.library.vungle.adsession;

import android.view.View;
import com.iab.omid.library.vungle.attestation.C11274c;
import com.iab.omid.library.vungle.internal.C11290a;
import com.iab.omid.library.vungle.internal.C11292c;
import com.iab.omid.library.vungle.internal.C11294e;
import com.iab.omid.library.vungle.internal.C11295f;
import com.iab.omid.library.vungle.internal.C11296g;
import com.iab.omid.library.vungle.internal.C11298i;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import com.iab.omid.library.vungle.publisher.C11308a;
import com.iab.omid.library.vungle.publisher.C11309b;
import com.iab.omid.library.vungle.utils.C11316g;
import com.iab.omid.library.vungle.weakreference.C11331a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.adsession.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11271a extends AdSession {

    /* JADX INFO: renamed from: a */
    private final AdSessionContext f23609a;

    /* JADX INFO: renamed from: b */
    private final AdSessionConfiguration f23610b;

    /* JADX INFO: renamed from: c */
    private final C11295f f23611c;

    /* JADX INFO: renamed from: d */
    private C11331a f23612d;

    /* JADX INFO: renamed from: e */
    private AdSessionStatePublisher f23613e;

    /* JADX INFO: renamed from: f */
    private boolean f23614f;

    /* JADX INFO: renamed from: g */
    private boolean f23615g;

    /* JADX INFO: renamed from: h */
    private final String f23616h;

    /* JADX INFO: renamed from: i */
    private boolean f23617i;

    /* JADX INFO: renamed from: j */
    private boolean f23618j;

    /* JADX INFO: renamed from: k */
    private PossibleObstructionListener f23619k;

    C11271a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    C11271a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f23611c = new C11295f();
        this.f23614f = false;
        this.f23615g = false;
        this.f23610b = adSessionConfiguration;
        this.f23609a = adSessionContext;
        this.f23616h = str;
        m24930b(null);
        this.f23613e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C11308a(str, adSessionContext.getWebView()) : new C11309b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f23613e.mo25107i();
        C11292c.m25003c().m25005a(this);
        this.f23613e.m25086a(adSessionConfiguration);
    }

    /* JADX INFO: renamed from: a */
    private void m24927a() {
        if (this.f23617i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24928a(View view) {
        Collection<C11271a> collectionM25006b = C11292c.m25003c().m25006b();
        if (collectionM25006b == null || collectionM25006b.isEmpty()) {
            return;
        }
        for (C11271a c11271a : collectionM25006b) {
            if (c11271a != this && c11271a.m24935e() == view) {
                c11271a.f23612d.clear();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m24929b() {
        if (this.f23618j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* JADX INFO: renamed from: b */
    private void m24930b(View view) {
        this.f23612d = new C11331a(view);
    }

    /* JADX INFO: renamed from: a */
    public void m24931a(List<C11331a> list) {
        if (m24937g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C11331a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f23619k.onPossibleObstructionsDetected(this.f23616h, arrayList);
        }
    }

    /* JADX INFO: renamed from: a */
    void m24932a(JSONObject jSONObject) {
        m24929b();
        m24934d().m25099b(jSONObject);
        this.f23618j = true;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f23615g) {
            return;
        }
        this.f23611c.m25026a(view, friendlyObstructionPurpose, str);
    }

    /* JADX INFO: renamed from: c */
    public String m24933c() {
        return this.f23616h;
    }

    /* JADX INFO: renamed from: d */
    public AdSessionStatePublisher m24934d() {
        return this.f23613e;
    }

    /* JADX INFO: renamed from: e */
    public View m24935e() {
        return this.f23612d.get();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f23615g) {
            throw new IllegalStateException("AdSession is finished");
        }
        C11316g.m25159a(errorType, "Error type is null");
        C11316g.m25161a(str, "Message is null");
        m24934d().m25087a(errorType, str);
    }

    /* JADX INFO: renamed from: f */
    public List<C11294e> m24936f() {
        return this.f23611c.m25025a();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void finish() {
        if (this.f23615g) {
            return;
        }
        this.f23612d.clear();
        removeAllFriendlyObstructions();
        this.f23615g = true;
        m24934d().m25104f();
        C11292c.m25003c().m25007b(this);
        m24934d().mo25096b();
        this.f23613e = null;
        this.f23619k = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m24937g() {
        return this.f23619k != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m24938h() {
        return this.f23614f && !this.f23615g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m24939i() {
        return this.f23615g;
    }

    /* JADX INFO: renamed from: j */
    public boolean m24940j() {
        return this.f23610b.isNativeImpressionOwner();
    }

    /* JADX INFO: renamed from: k */
    public boolean m24941k() {
        return this.f23610b.isNativeMediaEventsOwner();
    }

    /* JADX INFO: renamed from: l */
    public boolean m24942l() {
        return this.f23614f;
    }

    /* JADX INFO: renamed from: m */
    void m24943m() {
        m24927a();
        m24934d().m25105g();
        this.f23617i = true;
    }

    /* JADX INFO: renamed from: n */
    void m24944n() {
        m24929b();
        m24934d().m25106h();
        this.f23618j = true;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f23615g || m24935e() == view) {
            return;
        }
        m24930b(view);
        m24934d().m25082a();
        m24928a(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f23615g) {
            return;
        }
        this.f23611c.m25027b();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f23615g) {
            return;
        }
        this.f23611c.m25028c(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f23619k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void start() {
        if (this.f23614f || this.f23613e == null) {
            return;
        }
        this.f23614f = true;
        C11292c.m25003c().m25008c(this);
        this.f23613e.m25083a(C11298i.m25052c().m25054b());
        this.f23613e.m25094a(C11290a.m24994a().m24998b());
        this.f23613e.m25098b(C11274c.m24951a(C11296g.m25029b().m25030a()).m24953a());
        this.f23613e.mo25088a(this, this.f23609a);
    }
}
