package com.ironsource;

import com.ironsource.sdk.controller.InterfaceC12497f;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Ib */
/* JADX INFO: loaded from: classes6.dex */
public final class C11491Ib {

    /* JADX INFO: renamed from: d */
    public static final a f24502d = new a(null);

    /* JADX INFO: renamed from: a */
    private final String f24503a;

    /* JADX INFO: renamed from: b */
    private final String f24504b;

    /* JADX INFO: renamed from: c */
    private final JSONObject f24505c;

    /* JADX INFO: renamed from: com.ironsource.Ib$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final C11491Ib m26100a(String jsonStr) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            JSONObject jSONObject = new JSONObject(jsonStr);
            String adId = jSONObject.getString(InterfaceC12497f.b.f32089c);
            String command = jSONObject.getString(InterfaceC12497f.b.f32093g);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            Intrinsics.checkNotNullExpressionValue(adId, "adId");
            Intrinsics.checkNotNullExpressionValue(command, "command");
            return new C11491Ib(adId, command, jSONObjectOptJSONObject);
        }

        private a() {
        }
    }

    public C11491Ib(String adId, String command, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        this.f24503a = adId;
        this.f24504b = command;
        this.f24505c = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final String m26094a() {
        return this.f24503a;
    }

    /* JADX INFO: renamed from: b */
    public final String m26095b() {
        return this.f24504b;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m26096c() {
        return this.f24505c;
    }

    /* JADX INFO: renamed from: d */
    public final String m26097d() {
        return this.f24503a;
    }

    /* JADX INFO: renamed from: e */
    public final String m26098e() {
        return this.f24504b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11491Ib)) {
            return false;
        }
        C11491Ib c11491Ib = (C11491Ib) obj;
        return Intrinsics.areEqual(this.f24503a, c11491Ib.f24503a) && Intrinsics.areEqual(this.f24504b, c11491Ib.f24504b) && Intrinsics.areEqual(this.f24505c, c11491Ib.f24505c);
    }

    /* JADX INFO: renamed from: f */
    public final JSONObject m26099f() {
        return this.f24505c;
    }

    public int hashCode() {
        int iHashCode = ((this.f24503a.hashCode() * 31) + this.f24504b.hashCode()) * 31;
        JSONObject jSONObject = this.f24505c;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "MessageToNative(adId=" + this.f24503a + ", command=" + this.f24504b + ", params=" + this.f24505c + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11491Ib m26093a(String adId, String command, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        return new C11491Ib(adId, command, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11491Ib m26091a(C11491Ib c11491Ib, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c11491Ib.f24503a;
        }
        if ((i & 2) != 0) {
            str2 = c11491Ib.f24504b;
        }
        if ((i & 4) != 0) {
            jSONObject = c11491Ib.f24505c;
        }
        return c11491Ib.m26093a(str, str2, jSONObject);
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final C11491Ib m26092a(String str) throws JSONException {
        return f24502d.m26100a(str);
    }
}
