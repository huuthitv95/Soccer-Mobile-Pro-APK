package com.bytedance.adsdk.p077ri.p078lr;

import com.bytedance.adsdk.p077ri.p078lr.p079fi.C2175lr;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.InterfaceC2184ri;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.AbstractC2185di;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.C2186fi;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.C2187ik;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.C2188ka;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.C2189lr;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.C2190mj;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.C2191qt;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.C2192ri;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.jbs;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.xha;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import com.bytedance.adsdk.p077ri.p087ri.C2222lr;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2217ri {

    /* JADX INFO: renamed from: ri */
    private static final InterfaceC2184ri f5466ri;

    /* JADX INFO: renamed from: fi */
    private String f5467fi;

    /* JADX INFO: renamed from: ik */
    private InterfaceC2200ri f5468ik;

    /* JADX INFO: renamed from: ka */
    private Deque<InterfaceC2200ri> f5469ka = new LinkedList();

    /* JADX INFO: renamed from: lr */
    private final InterfaceC2184ri f5470lr;

    static {
        int i = 8;
        AbstractC2185di[] abstractC2185diArr = {new C2191qt(), new C2188ka(), new jbs(), new C2189lr(), new C2186fi(), new C2192ri(), new xha(), new C2187ik(), new C2190mj()};
        final InterfaceC2184ri interfaceC2184ri = new InterfaceC2184ri() { // from class: com.bytedance.adsdk.ri.lr.ri.1
            @Override // com.bytedance.adsdk.p077ri.p078lr.p081ik.InterfaceC2184ri
            /* JADX INFO: renamed from: ri */
            public int mo7270ri(String str, int i2, Deque<InterfaceC2200ri> deque) {
                return i2;
            }
        };
        while (i >= 0) {
            final AbstractC2185di abstractC2185di = abstractC2185diArr[i];
            i--;
            interfaceC2184ri = new InterfaceC2184ri() { // from class: com.bytedance.adsdk.ri.lr.ri.2
                @Override // com.bytedance.adsdk.p077ri.p078lr.p081ik.InterfaceC2184ri
                /* JADX INFO: renamed from: ri */
                public int mo7270ri(String str, int i2, Deque<InterfaceC2200ri> deque) {
                    return abstractC2185di.mo7273ri(str, i2, deque, interfaceC2184ri);
                }
            };
        }
        f5466ri = interfaceC2184ri;
    }

    private C2217ri(String str, InterfaceC2184ri interfaceC2184ri) {
        this.f5470lr = interfaceC2184ri;
        this.f5467fi = str;
        try {
            m7303ri();
        } catch (Exception e) {
            throw new C2222lr(str, e);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C2217ri m7302ri(String str) {
        return new C2217ri(str, f5466ri);
    }

    /* JADX INFO: renamed from: ri */
    private void m7303ri() {
        int length = this.f5467fi.length();
        int i = 0;
        while (i < length) {
            int iMo7270ri = this.f5470lr.mo7270ri(this.f5467fi, i, this.f5469ka);
            if (iMo7270ri == i) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.f5467fi.substring(0, i));
            }
            i = iMo7270ri;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            InterfaceC2200ri interfaceC2200riPollFirst = this.f5469ka.pollFirst();
            if (interfaceC2200riPollFirst == null) {
                this.f5468ik = C2175lr.m7223ri(arrayList, this.f5467fi, i);
                this.f5469ka = null;
                return;
            }
            arrayList.add(0, interfaceC2200riPollFirst);
        }
    }

    /* JADX INFO: renamed from: ri */
    public <T> T m7304ri(Map<String, JSONObject> map) {
        return (T) this.f5468ik.mo7293ri(map);
    }

    /* JADX INFO: renamed from: ri */
    public <T> T m7305ri(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) m7304ri(map);
    }
}
