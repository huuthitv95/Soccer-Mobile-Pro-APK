package com.mbridge.msdk.config.component.style;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.base.InterfaceC12712d;
import com.mbridge.msdk.config.component.common.file.C12752a;
import com.mbridge.msdk.config.component.common.file.C12753b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.p287vc.inter.InterfaceC12852a;
import com.mbridge.msdk.config.component.style.inter.InterfaceC12844a;
import com.mbridge.msdk.config.component.style.model.C12845a;
import com.mbridge.msdk.config.component.style.model.C12846b;
import com.mbridge.msdk.config.dynamic.C12861a;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.utils.C12902d;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class StyleCpt extends C12709a implements InterfaceC12852a, InterfaceC12712d {

    /* JADX INFO: renamed from: h */
    private C12846b f34422h;

    /* JADX INFO: renamed from: i */
    private XMLView f34423i;

    /* JADX INFO: renamed from: j */
    private InterfaceC12844a f34424j;

    /* JADX INFO: renamed from: c */
    private void m35755c(View view) {
        if (view != null) {
            view.setVisibility(0);
            HashMap map = new HashMap();
            map.put(C12770c.m35209b("view_tag"), view.getTag());
            m34829a(m34827a("903008", map));
        }
    }

    /* JADX INFO: renamed from: e */
    private String[] m35758e(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.replaceAll("[\\[\\]]", "").split(",");
    }

    /* JADX INFO: renamed from: g */
    private void m35759g() {
        if (this.f34423i != null && m34837e() != null) {
            HashMap map = new HashMap();
            m34837e().removeView(this.f34423i);
            Map<String, Object> mapM35763k = m35763k();
            if (!mapM35763k.isEmpty()) {
                map.putAll(mapM35763k);
            }
            m34829a(m34827a("903005", map));
        }
        Object objM36051b = this.f33806d.m36051b(C12770c.m35209b("sdk_context"));
        if (objM36051b instanceof Map) {
            Object obj = ((Map) objM36051b).get("lifecycleListeners");
            if (obj instanceof List) {
                ((List) obj).clear();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private void m35760h() {
        String strM35787a = this.f34422h.m35787a();
        if (TextUtils.isEmpty(strM35787a)) {
            m35751a("2000005", "Component command is null");
            return;
        }
        try {
            if (strM35787a.equals(C12770c.m35209b("319"))) {
                m35768r();
                return;
            }
            if (strM35787a.equals(C12770c.m35209b("325"))) {
                m35764l();
            } else if (strM35787a.equals(C12770c.m35209b("326"))) {
                m35748a(8);
            } else if (strM35787a.equals(C12770c.m35209b("307"))) {
                m35759g();
            }
        } catch (Exception e) {
            C13219q0.m37817b("StyleCpt", "Error in doRenderTemplateAction", e);
            m35751a("", "Command execute error " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    private void m35761i() {
        C12846b c12846b = this.f34422h;
        if (c12846b == null || c12846b.m35795d() == null) {
            return;
        }
        for (C12845a c12845a : this.f34422h.m35795d()) {
            if (c12845a != null) {
                String strM35773a = c12845a.m35773a();
                String strM35780d = c12845a.m35780d();
                if (!TextUtils.isEmpty(strM35773a) && !TextUtils.isEmpty(strM35780d)) {
                    View viewM35754c = m35754c(strM35780d);
                    if (viewM35754c == null) {
                        C13219q0.m37816b("StyleCpt", "Widget view not found: " + strM35780d);
                    } else {
                        try {
                            if (strM35773a.equals(C12770c.m35209b("319"))) {
                                m35755c(viewM35754c);
                            } else if (strM35773a.equals(C12770c.m35209b("325"))) {
                                m35749a(viewM35754c);
                            } else if (strM35773a.equals(C12770c.m35209b("328"))) {
                                m35750a(viewM35754c, c12845a);
                            } else if (strM35773a.equals(C12770c.m35209b("327"))) {
                                m35752b(viewM35754c);
                            }
                            m35756c(viewM35754c, c12845a);
                            m35753b(viewM35754c, c12845a);
                        } catch (Exception e) {
                            C13219q0.m37817b("StyleCpt", "Error in doWidgetViewAction", e);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private void m35762j() {
        C12846b c12846b = this.f34422h;
        if (c12846b == null || TextUtils.isEmpty(c12846b.m35793c())) {
            return;
        }
        this.f34423i = C12902d.m36157a(m34837e(), SameMD5.getMD5(this.f34422h.m35793c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public Map<String, Object> m35763k() {
        String strM35778c;
        List<C12845a> listM35795d = this.f34422h.m35795d();
        if (listM35795d != null && !listM35795d.isEmpty()) {
            for (C12845a c12845a : listM35795d) {
                if (c12845a != null && (strM35778c = c12845a.m35778c()) != null) {
                    strM35778c.equals("1");
                }
            }
        }
        return C12902d.m36159a((ViewGroup) this.f34423i);
    }

    /* JADX INFO: renamed from: l */
    private void m35764l() {
        XMLView xMLView = this.f34423i;
        if (xMLView == null) {
            return;
        }
        xMLView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m35765m() {
        m35760h();
        m35761i();
    }

    /* JADX INFO: renamed from: p */
    private void m35766p() {
        String strM35793c = this.f34422h.m35793c();
        if (TextUtils.isEmpty(strM35793c)) {
            m35751a("2000001", "Template URL is empty");
            return;
        }
        String strM35757d = m35757d(strM35793c);
        if (strM35757d == null || TextUtils.isEmpty(strM35757d)) {
            m35751a("2000003", "XML paths is empty");
            return;
        }
        try {
            XMLView xMLView = (XMLView) new C12861a().m35886a(strM35757d, m34837e(), this.f33806d);
            this.f34423i = xMLView;
            if (xMLView == null) {
                m35751a("2000004", "xml render fail");
            } else {
                xMLView.setRenderMap(strM35793c);
                this.f34423i.setXmlViewActionListener(this.f34424j);
            }
        } catch (Exception e) {
            m35751a("2000004", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: q */
    private void m35767q() {
        if (this.f34424j != null) {
            return;
        }
        this.f34424j = new C12843a();
    }

    /* JADX INFO: renamed from: r */
    private void m35768r() {
        HashMap map = new HashMap();
        m34829a(m34827a("903002", map));
        if (this.f34423i == null) {
            m35748a(0);
        }
        Map<String, Object> mapM35763k = m35763k();
        if (!mapM35763k.isEmpty()) {
            map.putAll(mapM35763k);
        }
        m34829a(m34827a("903006", map));
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        this.f33808f = "903001";
        this.f34422h = new C12846b(map);
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        m35762j();
        C13167a.m37544c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.style.StyleCpt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m35765m();
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m35769n() {
        m34829a(m34827a("903004", new HashMap()));
    }

    /* JADX INFO: renamed from: o */
    public void m35770o() {
        m34829a(m34827a("903003", new HashMap()));
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: a */
    public void mo34828a() {
        super.mo34828a();
        m35767q();
    }

    /* JADX INFO: renamed from: b */
    private void m35752b(View view) {
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    /* JADX INFO: renamed from: d */
    private String m35757d(String str) {
        C12753b c12753bM35047a = C12752a.m35047a(str, 2, this.f34422h.m35791b());
        if (c12753bM35047a != null) {
            return c12753bM35047a.m35073e() ? c12753bM35047a.m35070d() : "";
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    private void m35753b(View view, C12845a c12845a) {
        try {
            if (view == null) {
                C13219q0.m37816b("StyleCpt", "Widget view is null");
                return;
            }
            String strM35782e = c12845a.m35782e();
            if (TextUtils.isEmpty(strM35782e)) {
                return;
            }
            String[] strArrM35758e = m35758e(strM35782e);
            if (strArrM35758e.length != 2) {
                C13219q0.m37816b("StyleCpt", "Invalid widget location format: " + strM35782e);
            } else {
                int i = Integer.parseInt(strArrM35758e[0]);
                int i2 = Integer.parseInt(strArrM35758e[1]);
                view.setX(i);
                view.setY(i2);
            }
        } catch (Exception e) {
            C13219q0.m37816b("StyleCpt", "Error relocating widget: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.InterfaceC12712d
    /* JADX INFO: renamed from: a */
    public boolean mo34848a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get(C12770c.m35209b("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(C12770c.m35209b("116"));
                if (obj2 instanceof String) {
                    String strValueOf = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        return strValueOf.equals(this.f34422h.m35793c());
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private void m35756c(View view, C12845a c12845a) {
        try {
            if (view == null) {
                C13219q0.m37816b("StyleCpt", "Widget view is null");
                return;
            }
            String strM35784f = c12845a.m35784f();
            if (TextUtils.isEmpty(strM35784f)) {
                return;
            }
            String[] strArrM35758e = m35758e(strM35784f);
            if (strArrM35758e.length != 2) {
                C13219q0.m37816b("StyleCpt", "Invalid widget size format: " + strM35784f);
                return;
            }
            int i = Integer.parseInt(strArrM35758e[0]);
            int i2 = Integer.parseInt(strArrM35758e[1]);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
                layoutParams.height = i2;
                view.setLayoutParams(layoutParams);
            }
        } catch (Exception e) {
            C13219q0.m37816b("StyleCpt", "Error resizing widget: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.style.StyleCpt$a */
    class C12843a implements InterfaceC12844a {
        C12843a() {
        }

        @Override // com.mbridge.msdk.config.component.style.inter.InterfaceC12844a
        /* JADX INFO: renamed from: a */
        public void mo35771a(String str, Map<String, Object> map) {
            if (TextUtils.isEmpty(str)) {
                C13219q0.m37816b("StyleCpt", "Click tag is empty");
                return;
            }
            HashMap map2 = new HashMap();
            map2.put(C12770c.m35209b("view_tag"), str);
            if (map != null && !map.isEmpty()) {
                map2.putAll(map);
            }
            Map mapM35763k = StyleCpt.this.m35763k();
            if (!mapM35763k.isEmpty()) {
                map2.put("all_properties", mapM35763k);
            }
            StyleCpt styleCpt = StyleCpt.this;
            styleCpt.m34829a(styleCpt.m34827a("903010", map2));
        }

        @Override // com.mbridge.msdk.config.component.style.inter.InterfaceC12844a
        /* JADX INFO: renamed from: a */
        public void mo35772a(Map<String, Object> map) {
            if (map != null) {
                StyleCpt styleCpt = StyleCpt.this;
                styleCpt.m34829a(styleCpt.m34827a("903008", map));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35751a(String str, String str2) {
        C13219q0.m37816b("StyleCpt", str2);
        HashMap map = new HashMap();
        map.put(C12770c.m35209b("reason"), str2);
        map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), str);
        if (this.f34422h.m35795d() != null) {
            C13219q0.m37816b("StyleCpt", map.toString());
        } else {
            m34829a(m34827a("903007", map));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35750a(View view, C12845a c12845a) {
        try {
            Object objM35776b = c12845a.m35776b();
            View view2 = objM35776b instanceof View ? (View) objM35776b : null;
            if (view2 == null) {
                C13219q0.m37816b("StyleCpt", "Action view is null");
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                viewGroup.addView(view2);
            }
        } catch (Exception e) {
            C13219q0.m37816b("StyleCpt", "Error adding widget: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    private View m35754c(String str) {
        XMLView xMLView = this.f34423i;
        if (xMLView == null) {
            return m34837e().findViewWithTag(str);
        }
        return xMLView.findViewWithTag(str);
    }

    /* JADX INFO: renamed from: a */
    private void m35749a(View view) {
        if (view != null) {
            view.setVisibility(4);
            HashMap map = new HashMap();
            map.put(C12770c.m35209b("view_tag"), view.getTag());
            m34829a(m34827a("903009", map));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35748a(int i) {
        XMLView xMLView;
        m35766p();
        if (m34837e() == null || (xMLView = this.f34423i) == null) {
            return;
        }
        xMLView.setVisibility(i);
    }

    @Override // com.mbridge.msdk.config.component.p287vc.inter.InterfaceC12852a
    /* JADX INFO: renamed from: a */
    public void mo35561a(String str) {
        str.hashCode();
        if (str.equals("onStop")) {
            m35770o();
        } else if (str.equals("onResume")) {
            m35769n();
        }
    }
}
