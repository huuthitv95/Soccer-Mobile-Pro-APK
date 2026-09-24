package com.ironsource;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.rc */
/* JADX INFO: loaded from: classes6.dex */
public final class C12462rc {

    /* JADX INFO: renamed from: a */
    private final C12315m2 f31832a;

    /* JADX INFO: renamed from: b */
    private final boolean f31833b;

    /* JADX INFO: renamed from: com.ironsource.rc$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f31834a = new a();

        /* JADX INFO: renamed from: b */
        public static final String f31835b = "adm";

        /* JADX INFO: renamed from: c */
        public static final String f31836c = "isOneFlow";

        /* JADX INFO: renamed from: d */
        public static final String f31837d = "isMultipleAdObjects";

        /* JADX INFO: renamed from: e */
        public static final String f31838e = "adsInternalInfo";

        /* JADX INFO: renamed from: f */
        public static final String f31839f = "success";

        /* JADX INFO: renamed from: g */
        public static final String f31840g = "error";

        /* JADX INFO: renamed from: h */
        public static final String f31841h = "data";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12462rc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public final HashMap<String, String> m33247a() {
        C12452r2 c12452r2M32134g;
        HashMap<String, String> map = new HashMap<>();
        map.put("isOneFlow", String.valueOf(this.f31833b));
        map.put("isMultipleAdObjects", "true");
        List<C11605P> listMo27263a = C11455Gb.f24351s.m25905d().mo25841G().mo27263a();
        String string = listMo27263a != null ? new JSONObject().put("success", true).put("data", listMo27263a).toString() : new JSONObject().put("success", false).put("error", "Failed to get ad internal info").toString();
        Intrinsics.checkNotNullExpressionValue(string, "if (jsonAdInternalInfo !…    .toString()\n        }");
        map.put(a.f31838e, string);
        C12315m2 c12315m2 = this.f31832a;
        if (c12315m2 != null && (c12452r2M32134g = c12315m2.m32134g()) != null) {
            map.put("adm", c12452r2M32134g.m33212a());
            map.putAll(c12452r2M32134g.m33213b());
        }
        return map;
    }

    public C12462rc(C12315m2 c12315m2, boolean z) {
        this.f31832a = c12315m2;
        this.f31833b = z;
    }

    public /* synthetic */ C12462rc(C12315m2 c12315m2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c12315m2, (i & 2) != 0 ? false : z);
    }
}
