package com.mbridge.msdk.video.dynview.p292ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.video.dynview.C13940a;
import com.mbridge.msdk.video.dynview.C13942c;
import com.mbridge.msdk.video.dynview.energize.C13944a;
import com.mbridge.msdk.video.dynview.energize.C13945b;
import com.mbridge.msdk.video.dynview.error.EnumC13946a;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13952e;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13955h;
import com.mbridge.msdk.video.dynview.wrapper.C13987c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ui.a */
/* JADX INFO: compiled from: MBridgeUI.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13974a {

    /* JADX INFO: renamed from: a */
    private static boolean f40064a;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ui.a$a */
    /* JADX INFO: compiled from: MBridgeUI.java */
    class a implements InterfaceC13952e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC13955h f40065a;

        a(InterfaceC13955h interfaceC13955h) {
            this.f40065a = interfaceC13955h;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13952e
        /* JADX INFO: renamed from: a */
        public void mo41779a(View view, List<View> list) {
            C13940a c13940a = new C13940a();
            c13940a.m41696a(view);
            c13940a.m41697a(list);
            c13940a.m41698a(C13974a.f40064a);
            this.f40065a.mo41638a(c13940a);
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13952e
        /* JADX INFO: renamed from: a */
        public void mo41780a(EnumC13946a enumC13946a) {
            this.f40065a.mo41639a(enumC13946a);
        }
    }

    public C13974a(Context context, List<CampaignEx> list, InterfaceC13955h interfaceC13955h, Map<String, Object> map) {
        m41839a(new C13987c().m41934a(context, list), interfaceC13955h, map);
    }

    public C13974a(C13942c c13942c, InterfaceC13955h interfaceC13955h, Map<String, Object> map) {
        m41839a(c13942c, interfaceC13955h, map);
    }

    /* JADX INFO: renamed from: a */
    private void m41839a(C13942c c13942c, InterfaceC13955h interfaceC13955h, Map<String, Object> map) {
        View viewInflate;
        if (interfaceC13955h == null) {
            return;
        }
        if (c13942c == null) {
            interfaceC13955h.mo41639a(EnumC13946a.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (c13942c.m41707c() == null) {
            interfaceC13955h.mo41639a(EnumC13946a.NOT_FOUND_CONTEXT);
            return;
        }
        if (TextUtils.isEmpty(c13942c.m41710f())) {
            interfaceC13955h.mo41639a(EnumC13946a.NOT_FOUND_LAYOUTNAME);
            return;
        }
        try {
            if (c13942c.m41708d() != null) {
                viewInflate = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx((c13942c.m41706b() == null || c13942c.m41706b().size() <= 0) ? null : c13942c.m41706b().get(0)).fileDirs(c13942c.m41708d()).dyAdType(DyAdType.REWARD).orientation(c13942c.m41712h()).templateType(c13942c.m41711g()).build());
                if (viewInflate != null) {
                    f40064a = true;
                } else {
                    f40064a = false;
                    viewInflate = LayoutInflater.from(c13942c.m41707c()).inflate(C13203i0.m37707a(c13942c.m41707c(), c13942c.m41710f(), "layout"), (ViewGroup) null);
                }
            } else {
                f40064a = false;
                viewInflate = LayoutInflater.from(c13942c.m41707c()).inflate(C13203i0.m37707a(c13942c.m41707c(), c13942c.m41710f(), "layout"), (ViewGroup) null);
            }
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("is_dy_success", Boolean.valueOf(f40064a));
            C13945b.m41763a().m41769a(viewInflate, c13942c, map);
            C13944a.m41754a().m41759a(viewInflate, c13942c, map, new a(interfaceC13955h));
        } catch (Exception e) {
            C13219q0.m37816b("MBridgeUI", e.getMessage());
            interfaceC13955h.mo41639a(EnumC13946a.VIEW_CREATE_ERROR);
        }
    }
}
