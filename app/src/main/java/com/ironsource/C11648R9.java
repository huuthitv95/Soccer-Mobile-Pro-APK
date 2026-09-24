package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.metadata.C12364a;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.R9 */
/* JADX INFO: loaded from: classes6.dex */
public class C11648R9 {

    /* JADX INFO: renamed from: a */
    C11612P6 f25571a = new C11612P6();

    /* JADX INFO: renamed from: com.ironsource.R9$a */
    class a extends AbstractRunnableC11754Xd {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ EnumC12234he f25572b;

        a(EnumC12234he enumC12234he) {
            this.f25572b = enumC12234he;
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            C11648R9.this.f25571a.m27205a(C11540L6.f24975g0, new JSONArray().put(this.f25572b.m31646b()));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m27348a(JSONObject jSONObject) {
        this.f25571a.m27203a(C11540L6.f25016u, (Object) jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public void m27353b(JSONObject jSONObject) {
        this.f25571a.m27203a(C11540L6.f24973f1, (Object) jSONObject);
    }

    /* JADX INFO: renamed from: c */
    public void m27356c(String str) {
        this.f25571a.m27203a(C11540L6.f24925K0, str);
    }

    /* JADX INFO: renamed from: d */
    public void m27357d(String str) {
        this.f25571a.m27203a(C11540L6.f24929M0, str);
    }

    /* JADX INFO: renamed from: e */
    public void m27358e(String str) {
        this.f25571a.m27203a(C12364a.f31323i, str);
    }

    /* JADX INFO: renamed from: f */
    public void m27359f(String str) {
        this.f25571a.m27203a(C11540L6.f24958a1, str);
    }

    /* JADX INFO: renamed from: g */
    public void m27360g(String str) {
        this.f25571a.m27203a(C11540L6.f24896A, str);
    }

    /* JADX INFO: renamed from: h */
    public void m27361h(String str) {
        this.f25571a.m27203a("sid", str);
    }

    /* JADX INFO: renamed from: i */
    public void m27362i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f25571a.m27203a(C11540L6.f24969e0, str);
    }

    /* JADX INFO: renamed from: a */
    public void m27349a(boolean z) {
        this.f25571a.m27203a(C11540L6.f24939R0, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: b */
    public void m27354b(boolean z) {
        this.f25571a.m27203a("gpi", Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c */
    public void m27355c(int i) {
        this.f25571a.m27203a(C11540L6.f24972f0, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public void m27343a(Context context) {
        this.f25571a.m27201a(context);
    }

    /* JADX INFO: renamed from: b */
    public void m27350b(int i) {
        if (i >= 0) {
            this.f25571a.m27203a(C11540L6.f24943T0, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m27346a(Boolean bool) {
        this.f25571a.m27203a(C11540L6.f24945U0, bool);
    }

    /* JADX INFO: renamed from: b */
    public void m27352b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f25571a.m27203a(C11540L6.f24907D1, str);
    }

    /* JADX INFO: renamed from: a */
    public void m27345a(EnumC12234he enumC12234he) {
        new Thread(new a(enumC12234he)).start();
    }

    /* JADX INFO: renamed from: b */
    public void m27351b(Context context) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        ActivityManager.MemoryInfo memoryInfoMo27918o = interfaceC12582w7Mo25842a.mo27918o(context);
        this.f25571a.m27203a(C11540L6.f25022w, interfaceC12582w7Mo25842a.mo27893c(memoryInfoMo27918o));
        this.f25571a.m27203a(C11540L6.f25025x, interfaceC12582w7Mo25842a.mo27890b(memoryInfoMo27918o));
    }

    /* JADX INFO: renamed from: a */
    public void m27344a(C11595O7 c11595o7) {
        try {
            HashMap map = new HashMap();
            map.put(C11540L6.f24908E, c11595o7.m26733a());
            map.put(C11540L6.f24905D, c11595o7.m26734b());
            map.put(C11540L6.f24946V, c11595o7.m26735c());
            this.f25571a.m27207a(map);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m27347a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f25571a.m27203a("abt", str);
    }

    /* JADX INFO: renamed from: a */
    public void m27342a(int i) {
        this.f25571a.m27203a(C11540L6.f24984j0, Integer.valueOf(i));
    }
}
