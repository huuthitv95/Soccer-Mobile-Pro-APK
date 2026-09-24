package com.ironsource.sdk.controller;

import com.ironsource.C11661S5;
import com.ironsource.C11695U5;
import com.ironsource.C12302la;
import com.ironsource.C12317m4;
import com.ironsource.C12323ma;
import com.ironsource.C12404o8;
import com.ironsource.C12601x8;
import com.ironsource.InterfaceC11510Jc;
import com.ironsource.InterfaceC12284ka;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.j */
/* JADX INFO: loaded from: classes6.dex */
class C12501j {

    /* JADX INFO: renamed from: a */
    private final String f32121a;

    /* JADX INFO: renamed from: b */
    private final C11695U5 f32122b;

    C12501j(String str, C11695U5 c11695u5) {
        this.f32121a = str;
        this.f32122b = c11695u5;
    }

    /* JADX INFO: renamed from: b */
    private C12601x8 m33465b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(C11661S5.c.f25654c) || !jSONObject.has(C11661S5.c.f25653b)) {
            throw new Exception(C11661S5.a.f25638a);
        }
        String string = jSONObject.getString(C11661S5.c.f25654c);
        return new C12601x8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(C11661S5.c.f25653b));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    void m33466a(JSONObject jSONObject, InterfaceC12284ka interfaceC12284ka) {
        byte b;
        C12302la c12302la = new C12302la(jSONObject);
        C12323ma c12323ma = new C12323ma(interfaceC12284ka);
        try {
            String strM32073b = c12302la.m32073b();
            JSONObject jSONObjectM32074c = c12302la.m32074c();
            C12601x8 c12601x8M33465b = m33465b(jSONObjectM32074c, this.f32121a);
            IronSourceStorageUtils.ensurePathSafety(c12601x8M33465b, this.f32121a);
            switch (strM32073b.hashCode()) {
                case -2073025383:
                    if (!strM32073b.equals(C11661S5.b.f25646a)) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1137024519:
                    if (!strM32073b.equals("deleteFolder")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -318115535:
                    if (!strM32073b.equals(C11661S5.b.f25650e)) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 537556755:
                    if (!strM32073b.equals(C11661S5.b.f25651f)) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 1764172231:
                    if (!strM32073b.equals("deleteFile")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 1953259713:
                    if (!strM32073b.equals(C11661S5.b.f25649d)) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                this.f32122b.m27590a(c12601x8M33465b, jSONObjectM32074c.optString(C11661S5.c.f25652a), jSONObjectM32074c.optInt("connectionTimeout"), jSONObjectM32074c.optInt("readTimeout"), m33460a(c12302la, c12323ma));
                return;
            }
            if (b == 1) {
                this.f32122b.m27589a(c12601x8M33465b);
                c12323ma.m32222b(c12302la, m33464a(c12302la, c12601x8M33465b.m34139a()));
                return;
            }
            if (b == 2) {
                this.f32122b.m27592b(c12601x8M33465b);
                c12323ma.m32222b(c12302la, m33464a(c12302la, c12601x8M33465b.m34139a()));
                return;
            }
            if (b == 3) {
                c12323ma.m32222b(c12302la, m33464a(c12302la, this.f32122b.m27593c(c12601x8M33465b)));
                return;
            }
            if (b == 4) {
                c12323ma.m32222b(c12302la, m33462a(c12302la, this.f32122b.m27594d(c12601x8M33465b)));
            } else {
                if (b != 5) {
                    return;
                }
                this.f32122b.m27591a(c12601x8M33465b, jSONObjectM32074c.optJSONObject(C11661S5.c.f25658g));
                c12323ma.m32222b(c12302la, m33464a(c12302la, c12601x8M33465b.m34139a()));
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            c12323ma.m32221a(c12302la, m33463a(c12302la, e.getMessage()));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.j$a */
    class a implements InterfaceC11510Jc {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12323ma f32123a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C12302la f32124b;

        a(C12323ma c12323ma, C12302la c12302la) {
            this.f32123a = c12323ma;
            this.f32124b = c12302la;
        }

        @Override // com.ironsource.InterfaceC11510Jc
        /* JADX INFO: renamed from: a */
        public void mo26216a(C12601x8 c12601x8) {
            try {
                C12323ma c12323ma = this.f32123a;
                C12302la c12302la = this.f32124b;
                c12323ma.m32222b(c12302la, C12501j.this.m33464a(c12302la, c12601x8.m34139a()));
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.InterfaceC11510Jc
        /* JADX INFO: renamed from: a */
        public void mo26217a(C12601x8 c12601x8, C12404o8 c12404o8) {
            try {
                C12323ma c12323ma = this.f32123a;
                C12302la c12302la = this.f32124b;
                c12323ma.m32221a(c12302la, C12501j.this.m33463a(c12302la, c12404o8.m32957b()));
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC11510Jc m33460a(C12302la c12302la, C12323ma c12323ma) {
        return new a(c12323ma, c12302la);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public JSONObject m33464a(C12302la c12302la, JSONObject jSONObject) {
        try {
            return c12302la.m32076e().put("result", jSONObject);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m33462a(C12302la c12302la, long j) {
        try {
            return c12302la.m32076e().put("result", j);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public JSONObject m33463a(C12302la c12302la, String str) {
        try {
            return c12302la.m32076e().put("errMsg", str);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: a */
    private C12601x8 m33461a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(C11661S5.c.f25655d)) {
            return new C12601x8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(C11661S5.c.f25655d)));
        }
        throw new Exception(C11661S5.a.f25639b);
    }
}
