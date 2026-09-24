package com.bytedance.sdk.component.utils;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class wjv {

    /* JADX INFO: renamed from: ri */
    private static InterfaceC2731lr f7800ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.wjv$lr */
    public interface InterfaceC2731lr {
        /* JADX INFO: renamed from: ri */
        void mo10321ri(String str, boolean z, AbstractC2732ri abstractC2732ri);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.wjv$ri */
    public static abstract class AbstractC2732ri {
        /* JADX INFO: renamed from: lr */
        public final String m10322lr() {
            try {
                return mo10323ri().toString();
            } catch (Exception unused) {
                return "";
            }
        }

        /* JADX INFO: renamed from: ri */
        abstract JSONObject mo10323ri();
    }

    /* JADX INFO: renamed from: ri */
    public static void m10319ri(InterfaceC2731lr interfaceC2731lr) {
        f7800ri = interfaceC2731lr;
    }

    /* JADX INFO: renamed from: ri */
    public static void m10320ri(String str, AbstractC2732ri abstractC2732ri) {
        InterfaceC2731lr interfaceC2731lr = f7800ri;
        if (interfaceC2731lr == null) {
            return;
        }
        interfaceC2731lr.mo10321ri(str, false, abstractC2732ri);
    }
}
