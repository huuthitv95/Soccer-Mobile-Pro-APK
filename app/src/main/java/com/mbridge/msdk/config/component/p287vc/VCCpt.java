package com.mbridge.msdk.config.component.p287vc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.ViewGroup;
import com.mbridge.msdk.config.activity.MBRewardVideoActivity;
import com.mbridge.msdk.config.activity.backdispatcher.C12706a;
import com.mbridge.msdk.config.activity.backdispatcher.InterfaceC12707b;
import com.mbridge.msdk.config.activity.lifecycle.InterfaceC12708a;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.p287vc.inter.InterfaceC12852a;
import com.mbridge.msdk.config.component.p287vc.model.C12853a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class VCCpt extends C12709a {

    /* JADX INFO: renamed from: l */
    private static ConcurrentHashMap<String, VCCpt> f34454l;

    /* JADX INFO: renamed from: h */
    final String f34455h = "1200001";

    /* JADX INFO: renamed from: i */
    final String f34456i = "1200002";

    /* JADX INFO: renamed from: j */
    private String f34457j;

    /* JADX INFO: renamed from: k */
    private C12853a f34458k;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.vc.VCCpt$b */
    private static class C12851b implements InterfaceC12708a, Serializable {

        /* JADX INFO: renamed from: a */
        private String f34459a;

        private C12851b() {
        }

        /* JADX INFO: renamed from: a */
        public void m35825a(String str) {
            this.f34459a = str;
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.InterfaceC12708a
        /* JADX INFO: renamed from: b */
        public void mo34818b() {
            VCCpt vCCpt;
            if (VCCpt.f34454l == null || VCCpt.f34454l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f34454l.get(this.f34459a)) == null) {
                return;
            }
            vCCpt.m34829a(vCCpt.m34827a("902007", new HashMap()));
            vCCpt.m35816c("onResume");
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.InterfaceC12708a
        /* JADX INFO: renamed from: c */
        public void mo34819c() {
            VCCpt vCCpt;
            if (VCCpt.f34454l == null || VCCpt.f34454l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f34454l.get(this.f34459a)) == null) {
                return;
            }
            vCCpt.m34829a(vCCpt.m34827a("902009", new HashMap()));
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.InterfaceC12708a
        /* JADX INFO: renamed from: e */
        public void mo34820e() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.InterfaceC12708a
        /* JADX INFO: renamed from: f */
        public void mo34821f() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.InterfaceC12708a
        public void onStart() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.InterfaceC12708a
        /* JADX INFO: renamed from: a */
        public void mo34817a(ViewGroup viewGroup) {
            VCCpt vCCpt;
            if (VCCpt.f34454l == null || VCCpt.f34454l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f34454l.get(this.f34459a)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                vCCpt.m35811a(viewGroup);
            }
            Object objM36051b = vCCpt.f33806d.m36051b(C12770c.m35209b("sdk_context"));
            if (objM36051b instanceof Map) {
                ((Map) objM36051b).put(C12770c.m35209b("rootView"), viewGroup);
            } else {
                HashMap map = new HashMap();
                map.put(C12770c.m35209b("rootView"), viewGroup);
                vCCpt.f33806d.m36045a(C12770c.m35209b("sdk_context"), map);
            }
            vCCpt.m34829a(vCCpt.m34827a("902002", new HashMap()));
            vCCpt.m34829a(vCCpt.m34827a("902003", new HashMap()));
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.InterfaceC12708a
        /* JADX INFO: renamed from: a */
        public void mo34816a() {
            VCCpt vCCpt;
            if (VCCpt.f34454l == null || VCCpt.f34454l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f34454l.get(this.f34459a)) == null) {
                return;
            }
            vCCpt.m34829a(vCCpt.m34827a("902006", new HashMap()));
            vCCpt.m35816c("onStop");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m35816c(String str) {
        C12894a c12894a = this.f33806d;
        if (c12894a == null) {
            return;
        }
        Object objM36051b = c12894a.m36051b(C12770c.m35209b("sdk_context"));
        try {
            if (objM36051b instanceof Map) {
                Object obj = ((Map) objM36051b).get("lifecycleListeners");
                if (obj instanceof List) {
                    List<InterfaceC12852a> list = (List) obj;
                    if (list.isEmpty()) {
                        return;
                    }
                    synchronized (list) {
                        try {
                            for (InterfaceC12852a interfaceC12852a : list) {
                                if (interfaceC12852a != null) {
                                    interfaceC12852a.mo35561a(str);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            C13219q0.m37817b("VCCpt", th2.getMessage(), th2);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m35818h() {
        m34829a(m34827a("902005", new HashMap()));
        m35822l();
        if (m34837e() == null || !(m34837e().getContext() instanceof Activity)) {
            return;
        }
        ((Activity) m34837e().getContext()).finish();
    }

    /* JADX INFO: renamed from: i */
    private void m35819i() {
        String strM35826a = this.f34458k.m35826a();
        try {
            if (strM35826a.equals(C12770c.m35209b("319"))) {
                m35823m();
            } else if (strM35826a.equals(C12770c.m35209b("307"))) {
                m35818h();
            }
            if (this.f34458k.m35838f() == 1) {
                m35824n();
            }
        } catch (Exception e) {
            C13219q0.m37817b("VCCpt", "Error in doRenderTemplateAction", e);
            m35815a("1200002", "Root view render fail");
        }
    }

    /* JADX INFO: renamed from: j */
    private C12706a m35820j() {
        try {
            C12894a c12894a = this.f33806d;
            if (c12894a == null) {
                return null;
            }
            Object objM36051b = c12894a.m36051b(C12770c.m35209b("sdk_context"));
            if (objM36051b instanceof Map) {
                Object obj = ((Map) objM36051b).get("backInvocationCallback");
                if (obj instanceof C12706a) {
                    return (C12706a) obj;
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b("VCCpt", th.getMessage());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m35821k() {
        m34829a(m34827a("902010", new HashMap()));
    }

    /* JADX INFO: renamed from: l */
    private void m35822l() {
        try {
            Object objM36051b = this.f33806d.m36051b(C12770c.m35209b("sdk_context"));
            if (objM36051b instanceof Map) {
                Map map = (Map) objM36051b;
                Object obj = map.get("lifecycleListeners");
                if (obj instanceof List) {
                    ((List) obj).clear();
                }
                Object obj2 = map.get(C12770c.m35209b("component_cache"));
                if (obj2 instanceof Map) {
                    ((Map) obj2).clear();
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    m35824n();
                }
                map.remove("backInvocationCallback");
            }
            ConcurrentHashMap<String, VCCpt> concurrentHashMap = f34454l;
            if (concurrentHashMap != null) {
                concurrentHashMap.remove(this.f34457j);
                if (f34454l.isEmpty()) {
                    f34454l = null;
                }
            }
        } catch (Throwable th) {
            C13219q0.m37817b("VCCpt", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m35823m() {
        Intent intent = new Intent(C13008c.m36588n().m36542d(), (Class<?>) MBRewardVideoActivity.class);
        intent.putExtra("155", this.f34458k.m35832c());
        intent.putExtra("154", this.f34458k.m35834d());
        intent.putExtra("157", this.f34458k.m35840g());
        intent.putExtra("158", this.f34458k.m35830b());
        intent.putExtra("156", this.f34458k.m35836e());
        C12851b c12851b = new C12851b();
        c12851b.m35825a(this.f34457j);
        intent.putExtra("lifecycleCallbackByActivity", c12851b);
        try {
            if (C13008c.m36588n() != null && C13008c.m36588n().m36546f() != null) {
                ((Activity) C13008c.m36588n().m36546f()).startActivity(intent);
                return;
            }
        } catch (Throwable th) {
            C13219q0.m37816b("VCCpt", th.getMessage());
        }
        intent.addFlags(268435456);
        C13008c.m36588n().m36542d().startActivity(intent);
    }

    /* JADX INFO: renamed from: n */
    private void m35824n() {
        Context context;
        C12706a c12706aM35820j;
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                ViewGroup viewGroupM34837e = m34837e();
                if (viewGroupM34837e != null && (context = viewGroupM34837e.getContext()) != null && (context instanceof Activity) && (c12706aM35820j = m35820j()) != null) {
                    c12706aM35820j.m34814a(((Activity) context).getWindow());
                }
            } catch (Throwable th) {
                C13219q0.m37816b("VCCpt", th.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        this.f33808f = "902001";
        this.f34458k = new C12853a(map);
        this.f34457j = UUID.randomUUID().toString();
        if (f34454l == null) {
            f34454l = new ConcurrentHashMap<>();
        }
        f34454l.put(this.f34457j, this);
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        m35819i();
    }

    /* JADX INFO: renamed from: a */
    private void m35815a(String str, String str2) {
        m34831a("902008", str, str2);
        m35818h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m35811a(ViewGroup viewGroup) {
        C12853a c12853a;
        if (Build.VERSION.SDK_INT < 33 || viewGroup == null || (c12853a = this.f34458k) == null || c12853a.m35838f() == 1) {
            return;
        }
        try {
            Context context = viewGroup.getContext();
            if (context != null && (context instanceof Activity)) {
                C12706a c12706a = new C12706a();
                c12706a.m34815a(((Activity) context).getWindow(), new InterfaceC12707b() { // from class: com.mbridge.msdk.config.component.vc.VCCpt$$ExternalSyntheticLambda0
                    @Override // com.mbridge.msdk.config.activity.backdispatcher.InterfaceC12707b
                    /* JADX INFO: renamed from: a */
                    public final void mo34374a() {
                        this.f$0.m35821k();
                    }
                });
                m35814a(c12706a);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("VCCpt", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35814a(Object obj) {
        try {
            C12894a c12894a = this.f33806d;
            if (c12894a == null) {
                return;
            }
            Object objM36051b = c12894a.m36051b(C12770c.m35209b("sdk_context"));
            if (objM36051b instanceof Map) {
                ((Map) objM36051b).put("backInvocationCallback", obj);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("VCCpt", th.getMessage());
        }
    }
}
