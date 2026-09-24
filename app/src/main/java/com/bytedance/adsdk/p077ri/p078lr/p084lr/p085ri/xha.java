package com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri;

import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2193di;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.InterfaceC2194fi;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import com.ironsource.C11744X3;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha implements InterfaceC2200ri {

    /* JADX INFO: renamed from: ri */
    private final Object f5465ri;

    public xha(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.f5465ri = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.f5465ri = Boolean.FALSE;
        } else {
            if (!str.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                throw new IllegalArgumentException();
            }
            this.f5465ri = null;
        }
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: lr */
    public String mo7291lr() {
        Object obj = this.f5465ri;
        return obj != null ? obj.toString() : "NULL";
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public InterfaceC2194fi mo7292ri() {
        return EnumC2193di.CONSTANT;
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public Object mo7293ri(Map<String, JSONObject> map) {
        return this.f5465ri;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.f5465ri + C11744X3.j.f26440e;
    }
}
