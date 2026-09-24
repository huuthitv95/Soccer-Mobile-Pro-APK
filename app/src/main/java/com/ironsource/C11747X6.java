package com.ironsource;

import com.ironsource.mediationsdk.metadata.C12364a;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.X6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11747X6 implements InterfaceC11679T6 {

    /* JADX INFO: renamed from: a */
    private final JSONObject f26512a;

    /* JADX INFO: renamed from: com.ironsource.X6$a */
    public static final class a {

        /* JADX INFO: renamed from: b */
        public static final boolean f26514b = false;

        /* JADX INFO: renamed from: d */
        public static final int f26516d = 24;

        /* JADX INFO: renamed from: a */
        public static final a f26513a = new a();

        /* JADX INFO: renamed from: c */
        private static final int f26515c = EnumC11764Y6.SendEvent.m28013b();

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public final int m27941a() {
            return f26515c;
        }
    }

    public C11747X6(JSONObject jSONObject) {
        this.f26512a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.InterfaceC11679T6
    /* JADX INFO: renamed from: a */
    public long mo27519a() {
        return ((long) this.f26512a.optInt("timeout", 24)) * 1000;
    }

    @Override // com.ironsource.InterfaceC11644R5
    /* JADX INFO: renamed from: b */
    public boolean mo26172b() {
        return this.f26512a.optBoolean(C12364a.f31324j, false);
    }

    @Override // com.ironsource.InterfaceC11679T6
    /* JADX INFO: renamed from: c */
    public EnumC11764Y6 mo27520c() {
        return EnumC11764Y6.f26585b.m28014a(this.f26512a.optInt(C11744X3.f.f26247e, a.f26513a.m27941a()));
    }
}
