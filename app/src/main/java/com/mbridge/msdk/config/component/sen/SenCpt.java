package com.mbridge.msdk.config.component.sen;

import android.text.TextUtils;
import androidx.constraintlayout.motion.widget.Key;
import com.bykv.p028vk.openvk.preload.falconx.statistic.StatisticData;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.base.C12710b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class SenCpt extends C12709a {

    /* JADX INFO: renamed from: k */
    private static C12837b f34382k;

    /* JADX INFO: renamed from: l */
    private static Map<String, InterfaceC12836a> f34383l;

    /* JADX INFO: renamed from: h */
    private String f34384h;

    /* JADX INFO: renamed from: i */
    private String f34385i;

    /* JADX INFO: renamed from: j */
    private int f34386j;

    /* JADX INFO: renamed from: c */
    private String m35699c(String str) {
        if (C12770c.m35209b("331").equals(str)) {
            return "accelerometer";
        }
        if (C12770c.m35209b("332").equals(str)) {
            return "magnetic";
        }
        if (C12770c.m35209b("333").equals(str)) {
            return "gyroscope";
        }
        return C12770c.m35209b("334").equals(str) ? Key.ROTATION : str;
    }

    /* JADX INFO: renamed from: g */
    private int m35700g() {
        if (C12770c.m35209b("331").equals(this.f34385i)) {
            return 1;
        }
        if (C12770c.m35209b("332").equals(this.f34385i)) {
            return 2;
        }
        if (C12770c.m35209b("333").equals(this.f34385i)) {
            return 4;
        }
        return C12770c.m35209b("334").equals(this.f34385i) ? 11 : -1;
    }

    /* JADX INFO: renamed from: h */
    private void m35701h() {
        if (f34382k == null) {
            f34382k = new C12837b();
        }
        if (f34383l == null) {
            f34383l = new HashMap();
        }
        InterfaceC12836a interfaceC12836a = new InterfaceC12836a() { // from class: com.mbridge.msdk.config.component.sen.SenCpt$$ExternalSyntheticLambda0
            @Override // com.mbridge.msdk.config.component.sen.InterfaceC12836a
            /* JADX INFO: renamed from: a */
            public final void mo35702a(C12710b c12710b) {
                this.f$0.m35698b(c12710b);
            }
        };
        f34383l.put(this.f34385i, interfaceC12836a);
        f34382k.m35709a(interfaceC12836a);
        f34382k.m35708a(m35700g(), m35699c(this.f34385i), this.f34386j);
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        this.f33808f = "917001";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                if (key.equals(C12770c.m35209b("149"))) {
                    this.f34385i = String.valueOf(entry.getValue());
                } else if (key.equals(C12770c.m35209b("150"))) {
                    double d = Double.parseDouble(String.valueOf(entry.getValue()));
                    if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        this.f34386j = (int) (d * 1000.0d * 1000.0d);
                    }
                } else if (key.equals(C12770c.m35209b(StatisticData.ERROR_CODE_NOT_FOUND))) {
                    this.f34384h = String.valueOf(entry.getValue());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        Map<String, InterfaceC12836a> map;
        super.mo34836d();
        if (this.f34384h.equals(C12770c.m35209b("310"))) {
            m35701h();
        }
        if (!this.f34384h.equals(C12770c.m35209b("318")) || f34382k == null || (map = f34383l) == null) {
            return;
        }
        f34382k.m35710b(map.get(this.f34385i));
        f34383l.remove(this.f34385i);
        if (f34383l.isEmpty()) {
            f34382k.m35707a();
            f34382k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m35698b(C12710b c12710b) {
        m34829a(m34827a(c12710b.m34844c(), c12710b.m34842b()));
    }
}
