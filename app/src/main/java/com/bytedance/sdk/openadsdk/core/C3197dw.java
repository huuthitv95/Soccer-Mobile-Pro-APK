package com.bytedance.sdk.openadsdk.core;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.p252ri.p253fi.InterfaceC3495ri;
import com.bytedance.sdk.openadsdk.p252ri.p254ik.InterfaceC3496lr;
import com.bytedance.sdk.openadsdk.p252ri.p255ka.InterfaceC3498lr;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.dw */
/* JADX INFO: loaded from: classes3.dex */
public class C3197dw {

    /* JADX INFO: renamed from: ri */
    private static C3197dw f10573ri;

    /* JADX INFO: renamed from: di */
    private InterfaceC3496lr f10574di;

    /* JADX INFO: renamed from: fi */
    private InterfaceC3495ri f10575fi;
    private InterfaceC3498lr xha;

    /* JADX INFO: renamed from: lr */
    private final AtomicInteger f10578lr = new AtomicInteger(0);

    /* JADX INFO: renamed from: ik */
    private Map<Integer, C3289ri> f10576ik = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ka */
    private final ConcurrentHashMap<String, ri<?>> f10577ka = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: mj */
    private final Map<String, lr> f10579mj = new HashMap();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.dw$lr */
    public interface lr {
        /* JADX INFO: renamed from: ri */
        void mo11713ri();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.dw$ri */
    public static class ri<T> {

        /* JADX INFO: renamed from: ik */
        public final long f10580ik = System.currentTimeMillis();

        /* JADX INFO: renamed from: lr */
        public final String f10581lr;

        /* JADX INFO: renamed from: ri */
        public final T f10582ri;

        public ri(T t, String str) {
            this.f10582ri = t;
            this.f10581lr = str;
        }
    }

    private C3197dw() {
    }

    /* JADX INFO: renamed from: ka */
    private static String m13335ka(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar == null) {
            return null;
        }
        String strM14424jf = wjvVar.m14424jf();
        return TextUtils.isEmpty(strM14424jf) ? String.valueOf(wjvVar.hashCode()) : strM14424jf;
    }

    /* JADX INFO: renamed from: ri */
    public static int m13336ri(Intent intent) {
        if (intent != null) {
            return intent.getIntExtra("meta_index", -1);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ri */
    public static C3197dw m13337ri() {
        if (f10573ri == null) {
            f10573ri = new C3197dw();
        }
        return f10573ri;
    }

    /* JADX INFO: renamed from: ri */
    private void m13338ri(String str, boolean z) {
        ri<?> riVarM13349ri = m13349ri(str);
        if (z) {
            if (riVarM13349ri == null) {
                C2707ac.m10205ri("BVA", "cleanListener: removeCallback failed,listenerKey=".concat(String.valueOf(str)));
                return;
            }
            C2707ac.m10205ri("BVA", "cleanListener: removeCallback success,listenerKey=" + str + ",callback=" + riVarM13349ri.f10582ri);
        }
    }

    /* JADX INFO: renamed from: fi */
    public void m13339fi() {
        this.f10575fi = null;
        this.f10574di = null;
        this.xha = null;
    }

    /* JADX INFO: renamed from: ik */
    public InterfaceC3496lr m13340ik() {
        return this.f10574di;
    }

    /* JADX INFO: renamed from: ik */
    public void m13341ik(int i) {
        this.f10576ik.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ik */
    public void m13342ik(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        String strM13335ka = m13335ka(wjvVar);
        if (TextUtils.isEmpty(strM13335ka)) {
            return;
        }
        this.f10579mj.remove(strM13335ka);
    }

    /* JADX INFO: renamed from: ka */
    public InterfaceC3498lr m13343ka() {
        return this.xha;
    }

    /* JADX INFO: renamed from: lr */
    public C3289ri m13344lr(int i) {
        return this.f10576ik.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: lr */
    public InterfaceC3495ri m13345lr() {
        return this.f10575fi;
    }

    /* JADX INFO: renamed from: lr */
    public void m13346lr(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        lr lrVar;
        if (wjvVar == null) {
            return;
        }
        String strM13335ka = m13335ka(wjvVar);
        if (TextUtils.isEmpty(strM13335ka) || (lrVar = this.f10579mj.get(strM13335ka)) == null) {
            return;
        }
        lrVar.mo11713ri();
    }

    /* JADX INFO: renamed from: ri */
    public int m13347ri(C3289ri c3289ri) {
        int iIncrementAndGet = this.f10578lr.incrementAndGet();
        this.f10576ik.put(Integer.valueOf(iIncrementAndGet), c3289ri);
        return iIncrementAndGet;
    }

    /* JADX INFO: renamed from: ri */
    public int m13348ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        C3289ri c3289ri = new C3289ri();
        c3289ri.m14255lr(wjvVar);
        return m13347ri(c3289ri);
    }

    /* JADX INFO: renamed from: ri */
    public ri<?> m13349ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f10577ka.remove(str);
    }

    /* JADX INFO: renamed from: ri */
    public com.bytedance.sdk.openadsdk.core.model.wjv m13350ri(int i) {
        C3289ri c3289riRemove = this.f10576ik.remove(Integer.valueOf(i));
        if (c3289riRemove != null) {
            return c3289riRemove.m14247co();
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public <T> T m13351ri(String str, Class<T> cls) {
        ri<?> riVar;
        if (TextUtils.isEmpty(str) || cls == null || (riVar = this.f10577ka.get(str)) == null || !cls.isInstance(riVar.f10582ri)) {
            return null;
        }
        return cls.cast(riVar.f10582ri);
    }

    /* JADX INFO: renamed from: ri */
    public void m13352ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, lr lrVar) {
        if (wjvVar == null || lrVar == null) {
            return;
        }
        String strM13335ka = m13335ka(wjvVar);
        if (TextUtils.isEmpty(strM13335ka)) {
            return;
        }
        this.f10579mj.put(strM13335ka, lrVar);
    }

    /* JADX INFO: renamed from: ri */
    public void m13353ri(InterfaceC3495ri interfaceC3495ri) {
        this.f10575fi = interfaceC3495ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m13354ri(InterfaceC3496lr interfaceC3496lr) {
        this.f10574di = interfaceC3496lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m13355ri(InterfaceC3498lr interfaceC3498lr) {
        this.xha = interfaceC3498lr;
    }

    /* JADX INFO: renamed from: ri */
    public <T> void m13356ri(String str, T t) {
        if (TextUtils.isEmpty(str) || t == null) {
            return;
        }
        this.f10577ka.put(str, new ri<>(t, str));
    }

    /* JADX INFO: renamed from: ri */
    public void m13357ri(String str, boolean z, boolean z2) {
        boolean z3 = z || !z2;
        boolean zM14703vr = C3304qt.m14669lr().m14703vr();
        if (zM14703vr) {
            C2707ac.m10205ri("BVA", "cleanListener: isFinish = " + z + ",isConfigChange = " + z2);
        }
        if (z3) {
            m13338ri(str, zM14703vr);
        } else if (z || !z2) {
            m13338ri(str, zM14703vr);
        }
    }
}
