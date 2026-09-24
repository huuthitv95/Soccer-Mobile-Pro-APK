package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C11613P7;
import com.ironsource.C11660S4;
import com.ironsource.C12317m4;
import com.ironsource.C12386n8;
import com.ironsource.InterfaceC12454r4;
import com.ironsource.InterfaceC12472s4;
import com.ironsource.InterfaceC12525t4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.n */
/* JADX INFO: loaded from: classes6.dex */
public class C12505n implements InterfaceC12503l {

    /* JADX INFO: renamed from: a */
    private final C11613P7 f32132a;

    /* JADX INFO: renamed from: b */
    private final String f32133b;

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.n$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12503l.a f32134a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC12497f.c f32135b;

        a(InterfaceC12503l.a aVar, InterfaceC12497f.c cVar) {
            this.f32134a = aVar;
            this.f32135b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f32134a == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("reason", C12505n.this.f32133b);
                this.f32134a.mo26765a(new InterfaceC12497f.a(this.f32135b.m33445f(), jSONObject));
            } catch (JSONException e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.n$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12525t4 f32137a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C11660S4 f32138b;

        b(InterfaceC12525t4 interfaceC12525t4, C11660S4 c11660s4) {
            this.f32137a = interfaceC12525t4;
            this.f32138b = c11660s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32137a.mo26519a(C12386n8.e.RewardedVideo, this.f32138b.m27447h(), C12505n.this.f32133b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.n$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12525t4 f32140a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f32141b;

        c(InterfaceC12525t4 interfaceC12525t4, JSONObject jSONObject) {
            this.f32140a = interfaceC12525t4;
            this.f32141b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32140a.mo26536b(this.f32141b.optString("demandSourceName"), C12505n.this.f32133b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.n$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12472s4 f32143a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C11660S4 f32144b;

        d(InterfaceC12472s4 interfaceC12472s4, C11660S4 c11660s4) {
            this.f32143a = interfaceC12472s4;
            this.f32144b = c11660s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32143a.mo26519a(C12386n8.e.Interstitial, this.f32144b.m27447h(), C12505n.this.f32133b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.n$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12472s4 f32146a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f32147b;

        e(InterfaceC12472s4 interfaceC12472s4, String str) {
            this.f32146a = interfaceC12472s4;
            this.f32147b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32146a.mo26523a(this.f32147b, C12505n.this.f32133b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.n$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12472s4 f32149a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C11660S4 f32150b;

        f(InterfaceC12472s4 interfaceC12472s4, C11660S4 c11660s4) {
            this.f32149a = interfaceC12472s4;
            this.f32150b = c11660s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32149a.mo26523a(this.f32150b.m27447h(), C12505n.this.f32133b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.n$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12472s4 f32152a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f32153b;

        g(InterfaceC12472s4 interfaceC12472s4, JSONObject jSONObject) {
            this.f32152a = interfaceC12472s4;
            this.f32153b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32152a.mo26544d(this.f32153b.optString("demandSourceName"), C12505n.this.f32133b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.n$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12472s4 f32155a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C11660S4 f32156b;

        h(InterfaceC12472s4 interfaceC12472s4, C11660S4 c11660s4) {
            this.f32155a = interfaceC12472s4;
            this.f32156b = c11660s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32155a.mo26544d(this.f32156b.m27447h(), C12505n.this.f32133b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.n$i */
    class i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12454r4 f32158a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Map f32159b;

        i(InterfaceC12454r4 interfaceC12454r4, Map map) {
            this.f32158a = interfaceC12454r4;
            this.f32159b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32158a.mo26541c((String) this.f32159b.get("demandSourceName"), C12505n.this.f32133b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.n$j */
    class j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12454r4 f32161a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f32162b;

        j(InterfaceC12454r4 interfaceC12454r4, JSONObject jSONObject) {
            this.f32161a = interfaceC12454r4;
            this.f32162b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32161a.mo26541c(this.f32162b.optString("demandSourceName"), C12505n.this.f32133b);
        }
    }

    C12505n(String str, C11613P7 c11613p7) {
        this.f32132a = c11613p7;
        this.f32133b = str;
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33401a() {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33402a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33403a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33404a(C11660S4 c11660s4) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33414a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public boolean mo33418a(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33419b() {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33420b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33421b(C11660S4 c11660s4) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33423b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: e */
    public void mo33424e() {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: f */
    public void mo33425f() {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: g */
    public void mo33426g() {
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: h */
    public C12386n8.c mo33427h() {
        return C12386n8.c.Native;
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33422b(C11660S4 c11660s4, Map<String, String> map, InterfaceC12472s4 interfaceC12472s4) {
        if (interfaceC12472s4 != null) {
            m33468a(new f(interfaceC12472s4, c11660s4));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33413a(String str, String str2, C11660S4 c11660s4, InterfaceC12525t4 interfaceC12525t4) {
        if (interfaceC12525t4 != null) {
            m33468a(new b(interfaceC12525t4, c11660s4));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33417a(JSONObject jSONObject, InterfaceC12525t4 interfaceC12525t4) {
        if (interfaceC12525t4 != null) {
            m33468a(new c(interfaceC12525t4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33412a(String str, String str2, C11660S4 c11660s4, InterfaceC12472s4 interfaceC12472s4) {
        if (interfaceC12472s4 != null) {
            m33468a(new d(interfaceC12472s4, c11660s4));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33409a(String str, InterfaceC12472s4 interfaceC12472s4) {
        if (interfaceC12472s4 != null) {
            m33468a(new e(interfaceC12472s4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33416a(JSONObject jSONObject, InterfaceC12472s4 interfaceC12472s4) {
        if (interfaceC12472s4 != null) {
            m33468a(new g(interfaceC12472s4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33406a(C11660S4 c11660s4, Map<String, String> map, InterfaceC12472s4 interfaceC12472s4) {
        if (interfaceC12472s4 != null) {
            m33468a(new h(interfaceC12472s4, c11660s4));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33411a(String str, String str2, C11660S4 c11660s4, InterfaceC12454r4 interfaceC12454r4) {
        if (interfaceC12454r4 != null) {
            interfaceC12454r4.mo26519a(C12386n8.e.Banner, c11660s4.m27447h(), this.f32133b);
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33405a(C11660S4 c11660s4, Map<String, String> map, InterfaceC12454r4 interfaceC12454r4) {
        if (interfaceC12454r4 != null) {
            m33468a(new i(interfaceC12454r4, map));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33415a(JSONObject jSONObject, InterfaceC12454r4 interfaceC12454r4) {
        if (interfaceC12454r4 != null) {
            m33468a(new j(interfaceC12454r4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33407a(InterfaceC12497f.c cVar, InterfaceC12503l.a aVar) {
        m33468a(new a(aVar, cVar));
    }

    /* JADX INFO: renamed from: a */
    void m33468a(Runnable runnable) {
        C11613P7 c11613p7 = this.f32132a;
        if (c11613p7 != null) {
            c11613p7.m27221c(runnable);
        }
    }
}
