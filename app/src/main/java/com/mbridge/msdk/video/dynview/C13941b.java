package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13955h;
import com.mbridge.msdk.video.dynview.p292ui.C13974a;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.b */
/* JADX INFO: compiled from: MBUIController.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13941b {

    /* JADX INFO: renamed from: b */
    private static volatile C13941b f39941b;

    /* JADX INFO: renamed from: a */
    public Map<String, SoftReference<View>> f39942a = new HashMap();

    private C13941b() {
    }

    /* JADX INFO: renamed from: a */
    public static C13941b m41701a() {
        C13941b c13941b;
        if (f39941b != null) {
            return f39941b;
        }
        synchronized (C13941b.class) {
            if (f39941b == null) {
                f39941b = new C13941b();
            }
            c13941b = f39941b;
        }
        return c13941b;
    }

    /* JADX INFO: renamed from: a */
    public void m41702a(Context context, List<CampaignEx> list, InterfaceC13955h interfaceC13955h, Map<String, Object> map) {
        new C13974a(context, list, interfaceC13955h, map);
    }

    /* JADX INFO: renamed from: a */
    public void m41703a(C13942c c13942c, InterfaceC13955h interfaceC13955h) {
        new C13974a(c13942c, interfaceC13955h, new HashMap());
    }

    /* JADX INFO: renamed from: a */
    public void m41704a(C13942c c13942c, InterfaceC13955h interfaceC13955h, Map<String, Object> map) {
        new C13974a(c13942c, interfaceC13955h, map);
    }
}
