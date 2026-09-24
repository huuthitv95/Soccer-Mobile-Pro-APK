package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.p065lr.xha.C2165ik;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.xd */
/* JADX INFO: loaded from: classes3.dex */
public class C2051xd implements InterfaceC2037kt<C2165ik> {

    /* JADX INFO: renamed from: ri */
    public static final C2051xd f4790ri = new C2051xd();

    private C2051xd() {
    }

    @Override // com.bytedance.adsdk.p065lr.p067fi.InterfaceC2037kt
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public C2165ik mo6614lr(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new C2165ik((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
    }
}
