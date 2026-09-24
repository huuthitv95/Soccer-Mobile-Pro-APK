package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C12610y implements InterfaceC12155df<JSONObject>, InterfaceC12119bf<C12574w> {

    /* JADX INFO: renamed from: a */
    private final Map<String, C11480I0> f33197a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    private int f33198b;

    /* JADX INFO: renamed from: com.ironsource.y$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33199a;

        static {
            int[] iArr = new int[EnumC12101af.values().length];
            try {
                iArr[EnumC12101af.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12101af.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC12101af.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC12101af.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC12101af.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f33199a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m34197b(C12574w c12574w) {
        int i;
        int i2 = a.f33199a[c12574w.m33987f().ordinal()];
        if (i2 == 2) {
            this.f33198b++;
        } else if ((i2 == 3 || i2 == 4 || i2 == 5) && (i = this.f33198b) > 0) {
            this.f33198b = i - 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m34198a() {
        return this.f33198b;
    }

    @Override // com.ironsource.InterfaceC12119bf
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo26047a(C12574w record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String strM33984c = record.m33984c();
        Map<String, C11480I0> map = this.f33197a;
        C11480I0 c11480i0 = map.get(strM33984c);
        if (c11480i0 == null) {
            c11480i0 = new C11480I0();
            map.put(strM33984c, c11480i0);
        }
        c11480i0.mo26047a(record.m33981a(new C12592x()));
        m34197b(record);
    }

    @Override // com.ironsource.InterfaceC12129c7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject mo26046a(EnumC12137cf mode) throws JSONException {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C11480I0> entry : this.f33197a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectMo26046a = entry.getValue().mo26046a(mode);
            if (jSONObjectMo26046a.length() > 0) {
                jSONObject.put(key, jSONObjectMo26046a);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m34200b() {
        return !this.f33197a.isEmpty();
    }
}
