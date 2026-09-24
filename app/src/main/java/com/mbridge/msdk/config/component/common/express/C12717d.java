package com.mbridge.msdk.config.component.common.express;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.C12730a;
import com.mbridge.msdk.config.component.common.express.operator.C12731b;
import com.mbridge.msdk.config.component.common.express.operator.C12732c;
import com.mbridge.msdk.config.component.common.express.operator.C12733d;
import com.mbridge.msdk.config.component.common.express.operator.C12734e;
import com.mbridge.msdk.config.component.common.express.operator.C12735f;
import com.mbridge.msdk.config.component.common.express.operator.C12736g;
import com.mbridge.msdk.config.component.common.express.operator.C12737h;
import com.mbridge.msdk.config.component.common.express.operator.C12738i;
import com.mbridge.msdk.config.component.common.express.operator.C12739j;
import com.mbridge.msdk.config.component.common.express.operator.C12740k;
import com.mbridge.msdk.config.component.common.express.operator.C12741l;
import com.mbridge.msdk.config.component.common.express.operator.C12742m;
import com.mbridge.msdk.config.component.common.express.operator.C12743n;
import com.mbridge.msdk.config.component.common.express.operator.C12744o;
import com.mbridge.msdk.config.component.common.express.operator.C12745p;
import com.mbridge.msdk.config.component.common.express.operator.C12749q;
import com.mbridge.msdk.config.component.common.express.operator.C12750r;
import com.mbridge.msdk.config.component.common.express.operator.C12751s;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.d */
/* JADX INFO: compiled from: ExpressionOperator.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12717d {

    /* JADX INFO: renamed from: a */
    private final C12748c f33838a;

    /* JADX INFO: renamed from: b */
    private final C12732c f33839b;

    /* JADX INFO: renamed from: c */
    private final C12733d f33840c;

    /* JADX INFO: renamed from: d */
    private final C12735f f33841d;

    /* JADX INFO: renamed from: e */
    private final C12734e f33842e;

    /* JADX INFO: renamed from: f */
    private final C12749q f33843f;

    /* JADX INFO: renamed from: g */
    private final C12751s f33844g;

    /* JADX INFO: renamed from: h */
    private final C12744o f33845h;

    /* JADX INFO: renamed from: i */
    private final C12742m f33846i;

    /* JADX INFO: renamed from: j */
    private final C12741l f33847j;

    /* JADX INFO: renamed from: k */
    private final C12730a f33848k;

    /* JADX INFO: renamed from: l */
    private final C12738i f33849l;

    /* JADX INFO: renamed from: m */
    private final C12740k f33850m;

    /* JADX INFO: renamed from: n */
    private final C12731b f33851n;

    /* JADX INFO: renamed from: o */
    private final C12750r f33852o;

    /* JADX INFO: renamed from: p */
    private final C12739j f33853p;

    /* JADX INFO: renamed from: q */
    private final C12745p f33854q;

    /* JADX INFO: renamed from: r */
    private final C12743n f33855r;

    /* JADX INFO: renamed from: s */
    private final C12737h f33856s;

    /* JADX INFO: renamed from: t */
    private final C12736g f33857t;

    public C12717d() {
        C12748c c12748c = new C12748c();
        this.f33838a = c12748c;
        this.f33839b = new C12732c(c12748c);
        this.f33840c = new C12733d(c12748c);
        this.f33841d = new C12735f(c12748c);
        this.f33842e = new C12734e(c12748c);
        this.f33843f = new C12749q(c12748c);
        this.f33844g = new C12751s(c12748c);
        this.f33845h = new C12744o(c12748c);
        this.f33846i = new C12742m(c12748c);
        this.f33847j = new C12741l(c12748c);
        this.f33848k = new C12730a(c12748c);
        this.f33849l = new C12738i(c12748c);
        this.f33850m = new C12740k(c12748c);
        this.f33851n = new C12731b(c12748c);
        this.f33852o = new C12750r(c12748c);
        this.f33853p = new C12739j();
        this.f33854q = new C12745p(c12748c);
        this.f33855r = new C12743n(c12748c);
        this.f33856s = new C12737h(c12748c);
        this.f33857t = new C12736g(c12748c);
    }

    /* JADX INFO: renamed from: a */
    public Object m34892a(String str, C12894a c12894a) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("\"") && str.endsWith("\"") && str.replace("\\\"", "").split("\"").length == 2) {
            return str.substring(1, str.length() - 1);
        }
        try {
            Object objMo34898a = new C12714a().m34879a(str).mo34898a(this, EnumC12718e.OTHER, c12894a);
            return objMo34898a == null ? "" : objMo34898a;
        } catch (Exception e) {
            C13219q0.m37813a("ExpressionOperator", "execute-e: " + e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m34891a(Object obj, List<Object> list, String str, C12894a c12894a) {
        C12715b c12715b = new C12715b();
        c12715b.m34881a(obj);
        c12715b.m34883a(list);
        c12715b.m34882a(str);
        return m34890a(c12715b, c12894a);
    }

    /* JADX INFO: renamed from: a */
    private Object m34890a(C12715b c12715b, C12894a c12894a) {
        String strM34884b = c12715b.m34884b();
        Object objM34880a = c12715b.m34880a();
        List<Object> listM34885c = c12715b.m34885c();
        try {
            C12746a c12746aM34998b = this.f33855r.m34998b(strM34884b, objM34880a, listM34885c, c12894a);
            if (c12746aM34998b.m35019b()) {
                return c12746aM34998b.m35018a();
            }
            C12746a c12746aM34936a = this.f33842e.m34936a(strM34884b, objM34880a, listM34885c);
            if (c12746aM34936a.m35019b()) {
                return c12746aM34936a.m35018a();
            }
            C12746a c12746aM34946a = this.f33841d.m34946a(strM34884b, objM34880a, listM34885c);
            if (c12746aM34946a.m35019b()) {
                return c12746aM34946a.m35018a();
            }
            C12746a c12746aM34919a = this.f33840c.m34919a(strM34884b, objM34880a, listM34885c);
            if (c12746aM34919a.m35019b()) {
                return c12746aM34919a.m35018a();
            }
            C12746a c12746aM35037a = this.f33843f.m35037a(strM34884b, objM34880a, listM34885c);
            if (c12746aM35037a.m35019b()) {
                return c12746aM35037a.m35018a();
            }
            C12746a c12746aM34973a = this.f33850m.m34973a(strM34884b, objM34880a, listM34885c);
            if (c12746aM34973a.m35019b()) {
                return c12746aM34973a.m35018a();
            }
            C12746a c12746aM34994a = this.f33846i.m34994a(strM34884b, objM34880a, listM34885c);
            if (c12746aM34994a.m35019b()) {
                return c12746aM34994a.m35018a();
            }
            C12746a c12746aM35046a = this.f33844g.m35046a(strM34884b, objM34880a, listM34885c);
            if (c12746aM35046a.m35019b()) {
                return c12746aM35046a.m35018a();
            }
            C12746a c12746aM35014i = this.f33845h.m35014i(strM34884b, objM34880a, listM34885c);
            if (c12746aM35014i.m35019b()) {
                return c12746aM35014i.m35018a();
            }
            C12746a c12746aM34989b = this.f33847j.m34989b(strM34884b, objM34880a, listM34885c);
            if (c12746aM34989b.m35019b()) {
                return c12746aM34989b.m35018a();
            }
            C12746a c12746aM34911a = this.f33848k.m34911a(strM34884b, objM34880a, listM34885c);
            if (c12746aM34911a.m35019b()) {
                return c12746aM34911a.m35018a();
            }
            C12746a c12746aM35038a = this.f33852o.m35038a(strM34884b, objM34880a, listM34885c);
            if (c12746aM35038a.m35019b()) {
                return c12746aM35038a.m35018a();
            }
            C12746a c12746aM35015a = this.f33854q.m35015a(strM34884b, objM34880a, listM34885c);
            if (c12746aM35015a.m35019b()) {
                return c12746aM35015a.m35018a();
            }
            C12746a c12746aM34971b = this.f33853p.m34971b(strM34884b, objM34880a, listM34885c);
            if (c12746aM34971b.m35019b()) {
                return c12746aM34971b.m35018a();
            }
            C12746a c12746aM34914a = this.f33839b.m34914a(strM34884b, objM34880a, listM34885c);
            if (c12746aM34914a.m35019b()) {
                return c12746aM34914a.m35018a();
            }
            C12746a c12746aM34964a = this.f33856s.m34964a(strM34884b, objM34880a, listM34885c);
            if (c12746aM34964a.m35019b()) {
                return c12746aM34964a.m35018a();
            }
            C12746a c12746aM34959a = this.f33857t.m34959a(strM34884b, objM34880a, listM34885c);
            return c12746aM34959a.m35019b() ? c12746aM34959a.m35018a() : strM34884b;
        } catch (Exception e) {
            C13219q0.m37817b("ExpressionOperator", e.getMessage(), e);
            return null;
        }
    }
}
