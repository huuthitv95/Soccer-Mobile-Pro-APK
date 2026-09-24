package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2090di;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2092ik;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2093ka;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2095mj;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2096qt;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2097ri;
import com.bytedance.adsdk.p065lr.xha;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2036ka {
    /* JADX INFO: renamed from: di */
    static C2096qt m6636di(JsonReader jsonReader, xha xhaVar) throws IOException {
        return new C2096qt(m6644ri(jsonReader, C2017di.m6540ri(), xhaVar, jbs.f4775ri));
    }

    /* JADX INFO: renamed from: fi */
    static C2095mj m6637fi(JsonReader jsonReader, xha xhaVar) throws IOException {
        return new C2095mj(m6644ri(jsonReader, C2017di.m6540ri(), xhaVar, dzy.f4773ri));
    }

    /* JADX INFO: renamed from: ik */
    static C2090di m6638ik(JsonReader jsonReader, xha xhaVar) throws IOException {
        return new C2090di(ihz.m6625ri(jsonReader, xhaVar, C2017di.m6540ri(), C2052zf.f4792ri, true));
    }

    /* JADX INFO: renamed from: ka */
    static com.bytedance.adsdk.p065lr.p068ik.p071ri.xha m6639ka(JsonReader jsonReader, xha xhaVar) throws IOException {
        return new com.bytedance.adsdk.p065lr.p068ik.p071ri.xha(m6645ri(jsonReader, xhaVar, C2051xd.f4790ri));
    }

    /* JADX INFO: renamed from: lr */
    static C2093ka m6640lr(JsonReader jsonReader, xha xhaVar) throws IOException {
        return new C2093ka(m6645ri(jsonReader, xhaVar, C2040nr.f4776ri));
    }

    /* JADX INFO: renamed from: ri */
    static C2092ik m6641ri(JsonReader jsonReader, xha xhaVar, int i) throws IOException {
        return new C2092ik(m6645ri(jsonReader, xhaVar, new C2050vr(i)));
    }

    /* JADX INFO: renamed from: ri */
    public static C2094lr m6642ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        return m6643ri(jsonReader, xhaVar, true);
    }

    /* JADX INFO: renamed from: ri */
    public static C2094lr m6643ri(JsonReader jsonReader, xha xhaVar, boolean z) throws IOException {
        return new C2094lr(m6644ri(jsonReader, z ? C2017di.m6540ri() : 1.0f, xhaVar, C2028co.f4772ri));
    }

    /* JADX INFO: renamed from: ri */
    private static <T> List<C2167ri<T>> m6644ri(JsonReader jsonReader, float f, xha xhaVar, InterfaceC2037kt<T> interfaceC2037kt) throws IOException {
        return ihz.m6625ri(jsonReader, xhaVar, f, interfaceC2037kt, false);
    }

    /* JADX INFO: renamed from: ri */
    private static <T> List<C2167ri<T>> m6645ri(JsonReader jsonReader, xha xhaVar, InterfaceC2037kt<T> interfaceC2037kt) throws IOException {
        return ihz.m6625ri(jsonReader, xhaVar, 1.0f, interfaceC2037kt, false);
    }

    static C2097ri xha(JsonReader jsonReader, xha xhaVar) throws IOException {
        return new C2097ri(m6645ri(jsonReader, xhaVar, xha.f4791ri));
    }
}
