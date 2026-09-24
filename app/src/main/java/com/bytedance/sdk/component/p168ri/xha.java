package com.bytedance.sdk.component.p168ri;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
class xha {

    /* JADX INFO: renamed from: ri */
    private InterfaceC2702qt f7752ri;

    private xha(InterfaceC2702qt interfaceC2702qt) {
        this.f7752ri = interfaceC2702qt;
    }

    /* JADX INFO: renamed from: ri */
    static xha m10192ri(InterfaceC2702qt interfaceC2702qt) {
        return new xha(interfaceC2702qt);
    }

    /* JADX INFO: renamed from: ri */
    private static void m10193ri(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        C2700mj.m10169ri(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(String.valueOf(str))));
    }

    /* JADX INFO: renamed from: ri */
    <T> T m10194ri(String str, Type type) throws JSONException {
        m10193ri(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.f7752ri.mo10171ri(str, type);
    }

    /* JADX INFO: renamed from: ri */
    <T> String m10195ri(T t) {
        if (t == null) {
            return JsonUtils.EMPTY_JSON;
        }
        String string = ((t instanceof JSONObject) || (t instanceof JSONArray)) ? t.toString() : this.f7752ri.mo10172ri(t);
        m10193ri(string);
        return string;
    }
}
