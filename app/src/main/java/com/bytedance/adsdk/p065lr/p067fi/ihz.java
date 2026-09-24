package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.jbs;
import com.bytedance.adsdk.p065lr.xha;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class ihz {
    /* JADX INFO: renamed from: ri */
    static <T> List<C2167ri<T>> m6625ri(JsonReader jsonReader, xha xhaVar, float f, InterfaceC2037kt<T> interfaceC2037kt, boolean z) throws IOException {
        JsonReader jsonReader2;
        xha xhaVar2;
        float f2;
        InterfaceC2037kt<T> interfaceC2037kt2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            xhaVar.m7197ri("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (!strNextName.equals(CampaignEx.JSON_KEY_AD_K)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    xha xhaVar3 = xhaVar;
                    float f3 = f;
                    InterfaceC2037kt<T> interfaceC2037kt3 = interfaceC2037kt;
                    boolean z3 = z;
                    C2167ri c2167riM6606ri = C2024ac.m6606ri(jsonReader3, xhaVar3, f3, interfaceC2037kt3, false, z3);
                    jsonReader2 = jsonReader3;
                    xhaVar2 = xhaVar3;
                    f2 = f3;
                    interfaceC2037kt2 = interfaceC2037kt3;
                    z2 = z3;
                    arrayList.add(c2167riM6606ri);
                } else {
                    jsonReader2 = jsonReader;
                    xhaVar2 = xhaVar;
                    f2 = f;
                    interfaceC2037kt2 = interfaceC2037kt;
                    z2 = z;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(C2024ac.m6606ri(jsonReader2, xhaVar2, f2, interfaceC2037kt2, true, z2));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                xhaVar = xhaVar2;
                f = f2;
                interfaceC2037kt = interfaceC2037kt2;
                z = z2;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(C2024ac.m6606ri(jsonReader4, xhaVar, f, interfaceC2037kt, false, z));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        m6626ri(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    public static <T> void m6626ri(List<? extends C2167ri<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C2167ri<T> c2167ri = list.get(i2);
            i2++;
            C2167ri<T> c2167ri2 = list.get(i2);
            c2167ri.xha = Float.valueOf(c2167ri2.f5397di);
            if (c2167ri.f5401lr == null && c2167ri2.f5404ri != null) {
                c2167ri.f5401lr = c2167ri2.f5404ri;
                if (c2167ri instanceof jbs) {
                    ((jbs) c2167ri).m7095ri();
                }
            }
        }
        C2167ri<T> c2167ri3 = list.get(i);
        if ((c2167ri3.f5404ri == null || c2167ri3.f5401lr == null) && list.size() > 1) {
            list.remove(c2167ri3);
        }
    }
}
