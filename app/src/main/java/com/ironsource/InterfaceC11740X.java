package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.X */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11740X {

    /* JADX INFO: renamed from: com.ironsource.X$a */
    public static final class a implements InterfaceC11740X {

        /* JADX INFO: renamed from: a */
        private final JSONObject f26109a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC12618y7 f26110b;

        public a(JSONObject applicationConfig, InterfaceC12618y7 epService) {
            Intrinsics.checkNotNullParameter(applicationConfig, "applicationConfig");
            Intrinsics.checkNotNullParameter(epService, "epService");
            this.f26109a = applicationConfig;
            this.f26110b = epService;
        }

        @Override // com.ironsource.InterfaceC11740X
        /* JADX INFO: renamed from: a */
        public String mo27848a() {
            String strMo32173a = this.f26110b.mo32173a();
            if (StringsKt.isBlank(strMo32173a)) {
                strMo32173a = null;
            }
            if (strMo32173a != null) {
                return strMo32173a;
            }
            String it = this.f26109a.optString("controllerUrl");
            Intrinsics.checkNotNullExpressionValue(it, "it");
            String str = StringsKt.isBlank(it) ? null : it;
            return str == null ? "" : str;
        }

        @Override // com.ironsource.InterfaceC11740X
        /* JADX INFO: renamed from: b */
        public JSONObject mo27849b() {
            JSONObject jSONObjectOptJSONObject = this.f26109a.optJSONObject("controllerConfig");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        @Override // com.ironsource.InterfaceC11740X
        /* JADX INFO: renamed from: c */
        public int mo27850c() {
            int iOptInt = this.f26109a.optInt("debugMode", 0);
            if (this.f26109a.optBoolean(b.f26115e, false)) {
                return 3;
            }
            return iOptInt;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.X$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final b f26111a = new b();

        /* JADX INFO: renamed from: b */
        public static final String f26112b = "controllerUrl";

        /* JADX INFO: renamed from: c */
        public static final String f26113c = "controllerConfig";

        /* JADX INFO: renamed from: d */
        public static final String f26114d = "debugMode";

        /* JADX INFO: renamed from: e */
        public static final String f26115e = "adptDebugMode";

        private b() {
        }
    }

    /* JADX INFO: renamed from: a */
    String mo27848a();

    /* JADX INFO: renamed from: b */
    JSONObject mo27849b();

    /* JADX INFO: renamed from: c */
    int mo27850c();
}
