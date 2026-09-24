package com.mbridge.msdk.config.component.status;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.base.C12710b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.controller.AbstractC13003a;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class StatusCpt extends C12709a {

    /* JADX INFO: renamed from: k */
    private static C12840c f34391k;

    /* JADX INFO: renamed from: l */
    private static C12842e f34392l;

    /* JADX INFO: renamed from: m */
    private static C12841d f34393m;

    /* JADX INFO: renamed from: n */
    private static InterfaceC12838a f34394n;

    /* JADX INFO: renamed from: h */
    String f34395h = "";

    /* JADX INFO: renamed from: i */
    Map<String, Object> f34396i = null;

    /* JADX INFO: renamed from: j */
    Map<String, Object> f34397j = null;

    /* JADX INFO: renamed from: g */
    private void m35714g() {
        boolean zM35712c = m35712c("916002");
        boolean zM35712c2 = m35712c("916005");
        boolean z = m35712c("916004") || m35712c("916003");
        boolean zM35712c3 = m35712c("916006");
        if (zM35712c || zM35712c2 || z || zM35712c3) {
            return;
        }
        f34394n = null;
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        this.f33808f = "916001";
        if (map == null) {
            return;
        }
        this.f34397j = map;
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: c */
    protected void mo34835c(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f34396i = map;
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        String strValueOf;
        List<String> list;
        super.mo34836d();
        Map<String, Object> map = this.f34396i;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (f34394n == null) {
            f34394n = new InterfaceC12838a() { // from class: com.mbridge.msdk.config.component.status.StatusCpt$$ExternalSyntheticLambda0
                @Override // com.mbridge.msdk.config.component.status.InterfaceC12838a
                /* JADX INFO: renamed from: a */
                public final void mo35715a(C12710b c12710b) {
                    this.f$0.m35711b(c12710b);
                }
            };
        }
        if (m35713d("916002")) {
            if (!m35712c("916002")) {
                C12840c c12840c = f34391k;
                if (c12840c != null) {
                    c12840c.m35729b(f34394n);
                    f34391k.m35731d();
                }
                f34391k = null;
            } else if (f34391k == null) {
                C12840c c12840c2 = new C12840c();
                f34391k = c12840c2;
                c12840c2.m35727a(f34394n);
            }
        }
        if (m35713d("916003") || m35713d("916004")) {
            if (m35712c("916003") || m35712c("916004")) {
                C12839b c12839b = AbstractC13003a.f35477s;
                if (c12839b != null) {
                    c12839b.m35721a(f34394n);
                }
            } else {
                C12839b c12839b2 = AbstractC13003a.f35477s;
                if (c12839b2 != null) {
                    c12839b2.m35722b(f34394n);
                }
            }
        }
        if (m35713d("916005")) {
            if (!m35712c("916005")) {
                C12842e c12842e = f34392l;
                if (c12842e != null) {
                    c12842e.m35743b(f34394n);
                    f34392l.m35745d();
                }
                f34392l = null;
            } else if (f34392l == null) {
                C12842e c12842e2 = new C12842e();
                f34392l = c12842e2;
                c12842e2.m35742a(f34394n);
            }
        }
        if (m35713d("916006")) {
            Map<String, Object> map2 = this.f34397j;
            if (map2 != null) {
                Object obj = map2.get(C12770c.m35209b(DownloadModel.FILE_NAME));
                if (obj == null) {
                    obj = "";
                }
                strValueOf = String.valueOf(obj);
                list = (this.f34397j.containsKey(C12770c.m35209b("key_list")) && (this.f34397j.get(C12770c.m35209b("key_list")) instanceof List)) ? (List) this.f34397j.get(C12770c.m35209b("key_list")) : null;
            } else {
                strValueOf = null;
                list = null;
            }
            if (!m35712c("916006")) {
                C12841d c12841d = f34393m;
                if (c12841d != null) {
                    c12841d.m35738b(f34394n);
                }
                f34393m = null;
            } else if (f34393m == null) {
                C12841d c12841d2 = new C12841d(strValueOf);
                f34393m = c12841d2;
                c12841d2.m35737a(list);
                f34393m.m35736a(f34394n);
            }
        }
        m35714g();
    }

    /* JADX INFO: renamed from: c */
    private boolean m35712c(String str) {
        Object obj = this.f34396i.get(str);
        if (obj instanceof Map) {
            return String.valueOf(((Map) obj).get(C12770c.m35209b("17"))).equals("1");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m35711b(C12710b c12710b) {
        String strM34844c = c12710b.m34844c();
        strM34844c.hashCode();
        strM34844c.hashCode();
        switch (strM34844c) {
            case "916002":
                String strValueOf = String.valueOf(c12710b.m34842b().get("networkType"));
                if (TextUtils.isEmpty(this.f34395h)) {
                    this.f34395h = strValueOf;
                    break;
                } else if (!this.f34395h.equals(strValueOf)) {
                    this.f34395h = strValueOf;
                    m34829a(m34827a(c12710b.m34844c(), c12710b.m34842b()));
                    break;
                }
                break;
            case "916003":
            case "916004":
            case "916005":
            case "916006":
                m34829a(m34827a(c12710b.m34844c(), c12710b.m34842b()));
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m35713d(String str) {
        Object obj;
        Object obj2 = this.f34396i.get(str);
        if (!(obj2 instanceof Map) || (obj = ((Map) obj2).get(C12770c.m35209b("17"))) == null) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        return strValueOf.equals("1") || strValueOf.equals("0");
    }
}
