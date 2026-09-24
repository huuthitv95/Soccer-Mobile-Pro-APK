package com.ironsource.sdk.controller;

import java.util.UUID;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.f */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12497f {

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.f$a */
    public static final class a {

        /* JADX INFO: renamed from: c */
        public static final C15544a f32084c = new C15544a(null);

        /* JADX INFO: renamed from: a */
        private final String f32085a;

        /* JADX INFO: renamed from: b */
        private final JSONObject f32086b;

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        public static final class C15544a {
            public /* synthetic */ C15544a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final a m33436a(String jsonStr) throws JSONException {
                Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
                JSONObject jSONObject = new JSONObject(jsonStr);
                String id = jSONObject.getString(b.f32088b);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                Intrinsics.checkNotNullExpressionValue(id, "id");
                return new a(id, jSONObjectOptJSONObject);
            }

            private C15544a() {
            }
        }

        public a(String msgId, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            this.f32085a = msgId;
            this.f32086b = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        public final String m33432a() {
            return this.f32085a;
        }

        /* JADX INFO: renamed from: b */
        public final JSONObject m33433b() {
            return this.f32086b;
        }

        /* JADX INFO: renamed from: c */
        public final String m33434c() {
            return this.f32085a;
        }

        /* JADX INFO: renamed from: d */
        public final JSONObject m33435d() {
            return this.f32086b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f32085a, aVar.f32085a) && Intrinsics.areEqual(this.f32086b, aVar.f32086b);
        }

        public int hashCode() {
            int iHashCode = this.f32085a.hashCode() * 31;
            JSONObject jSONObject = this.f32086b;
            return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        public String toString() {
            return "CallbackToNative(msgId=" + this.f32085a + ", params=" + this.f32086b + ")";
        }

        /* JADX INFO: renamed from: a */
        public final a m33431a(String msgId, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            return new a(msgId, jSONObject);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m33429a(a aVar, String str, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f32085a;
            }
            if ((i & 2) != 0) {
                jSONObject = aVar.f32086b;
            }
            return aVar.m33431a(str, jSONObject);
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final a m33430a(String str) throws JSONException {
            return f32084c.m33436a(str);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final b f32087a = new b();

        /* JADX INFO: renamed from: b */
        public static final String f32088b = "msgId";

        /* JADX INFO: renamed from: c */
        public static final String f32089c = "adId";

        /* JADX INFO: renamed from: d */
        public static final String f32090d = "params";

        /* JADX INFO: renamed from: e */
        public static final String f32091e = "success";

        /* JADX INFO: renamed from: f */
        public static final String f32092f = "reason";

        /* JADX INFO: renamed from: g */
        public static final String f32093g = "command";

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.f$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final String f32094a;

        /* JADX INFO: renamed from: b */
        private final String f32095b;

        /* JADX INFO: renamed from: c */
        private final JSONObject f32096c;

        /* JADX INFO: renamed from: d */
        private String f32097d;

        public c(String adId, String command, JSONObject params) {
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f32094a = adId;
            this.f32095b = command;
            this.f32096c = params;
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            this.f32097d = string;
        }

        /* JADX INFO: renamed from: a */
        public final String m33439a() {
            return this.f32094a;
        }

        /* JADX INFO: renamed from: b */
        public final String m33441b() {
            return this.f32095b;
        }

        /* JADX INFO: renamed from: c */
        public final JSONObject m33442c() {
            return this.f32096c;
        }

        /* JADX INFO: renamed from: d */
        public final String m33443d() {
            return this.f32094a;
        }

        /* JADX INFO: renamed from: e */
        public final String m33444e() {
            return this.f32095b;
        }

        public boolean equals(Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return Intrinsics.areEqual(this.f32097d, cVar.f32097d) && Intrinsics.areEqual(this.f32094a, cVar.f32094a) && Intrinsics.areEqual(this.f32095b, cVar.f32095b) && Intrinsics.areEqual(this.f32096c.toString(), cVar.f32096c.toString());
        }

        /* JADX INFO: renamed from: f */
        public final String m33445f() {
            return this.f32097d;
        }

        /* JADX INFO: renamed from: g */
        public final JSONObject m33446g() {
            return this.f32096c;
        }

        /* JADX INFO: renamed from: h */
        public final String m33447h() {
            String string = new JSONObject().put(b.f32088b, this.f32097d).put(b.f32089c, this.f32094a).put("params", this.f32096c).toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject()\n          .…ms)\n          .toString()");
            return string;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return "MessageToController(adId=" + this.f32094a + ", command=" + this.f32095b + ", params=" + this.f32096c + ")";
        }

        /* JADX INFO: renamed from: a */
        public final c m33438a(String adId, String command, JSONObject params) {
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(params, "params");
            return new c(adId, command, params);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ c m33437a(c cVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f32094a;
            }
            if ((i & 2) != 0) {
                str2 = cVar.f32095b;
            }
            if ((i & 4) != 0) {
                jSONObject = cVar.f32096c;
            }
            return cVar.m33438a(str, str2, jSONObject);
        }

        /* JADX INFO: renamed from: a */
        public final void m33440a(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f32097d = str;
        }
    }
}
