package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.InterfaceC12350p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.X1 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11742X1 {

    /* JADX INFO: renamed from: com.ironsource.X1$a */
    public static final class a implements InterfaceC11742X1 {

        /* JADX INFO: renamed from: a */
        private final JSONObject f26118a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.InterfaceC11742X1
        /* JADX INFO: renamed from: a */
        public InterfaceC12350p mo27855a(String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            JSONObject jSONObject = this.f26118a;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(instanceId) : null;
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("plumbus") : null;
            return strOptString != null ? new InterfaceC12350p.a(strOptString) : new InterfaceC12350p.b();
        }

        public a(JSONObject jSONObject) {
            this.f26118a = jSONObject;
        }

        public /* synthetic */ a(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new JSONObject() : jSONObject);
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceC12350p mo27855a(String str);
}
