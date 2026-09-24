package com.fyber.inneractive.sdk.mraid;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.AbstractC9239i0;
import com.fyber.inneractive.sdk.web.C9248m;
import com.fyber.inneractive.sdk.web.EnumC9224d0;
import com.fyber.inneractive.sdk.web.EnumC9277z;
import com.fyber.inneractive.sdk.web.InterfaceC9218b0;
import com.fyber.inneractive.sdk.web.InterfaceC9243j1;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.s */
/* JADX INFO: loaded from: classes4.dex */
public final class C8343s extends AbstractC8328f {
    public C8343s(LinkedHashMap linkedHashMap, AbstractC9239i0 abstractC9239i0, C9152g1 c9152g1) {
        super(linkedHashMap, abstractC9239i0, c9152g1);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x014e  */
    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8328f
    /* JADX INFO: renamed from: a */
    public final void mo20721a() {
        ViewGroup viewGroup;
        int iM20720a = m20720a("w");
        int iM20720a2 = m20720a(CmcdData.Factory.STREAMING_FORMAT_HLS);
        int iM20720a3 = m20720a("offsetX");
        int iM20720a4 = m20720a("offsetY");
        boolean zEquals = "true".equals(this.f18601b.get("allowOffscreen"));
        if (iM20720a <= 0) {
            iM20720a = this.f18602c.f21597Z;
        }
        if (iM20720a2 <= 0) {
            iM20720a2 = this.f18602c.f21598a0;
        }
        AbstractC9239i0 abstractC9239i0 = this.f18602c;
        C9248m c9248m = abstractC9239i0.f21565b;
        if (c9248m == null) {
            return;
        }
        try {
            ViewGroup viewGroup2 = (ViewGroup) c9248m.getRootView().findViewById(R.id.content);
            abstractC9239i0.f21589R = viewGroup2;
            if (viewGroup2 == null) {
                IAlog.m21950f("Couldn't find content in the view tree", new Object[0]);
                abstractC9239i0.m22071a(EnumC8335k.RESIZE, "Ad can be resized only if it's state is default or resized.");
                return;
            }
            if (abstractC9239i0.f21586O == EnumC9277z.DISABLED) {
                return;
            }
            EnumC8329f0 enumC8329f0 = abstractC9239i0.f21585N;
            if (enumC8329f0 != EnumC8329f0.DEFAULT && enumC8329f0 != EnumC8329f0.RESIZED) {
                abstractC9239i0.m22071a(EnumC8335k.RESIZE, "Ad can be resized only if it's state is default or resized.");
                return;
            }
            if (iM20720a < 0 && iM20720a2 < 0) {
                abstractC9239i0.m22071a(EnumC8335k.RESIZE, "Creative size passed to resize() was invalid.");
                return;
            }
            abstractC9239i0.f21595X = false;
            InterfaceC9243j1 interfaceC9243j1 = abstractC9239i0.f21570g;
            if (interfaceC9243j1 != null) {
                ((InterfaceC9218b0) interfaceC9243j1).mo20926b(false);
            }
            EnumC9224d0 enumC9224d0 = abstractC9239i0.f21587P;
            if (enumC9224d0 == EnumC9224d0.ALWAYS_VISIBLE || (!abstractC9239i0.f21595X && enumC9224d0 != EnumC9224d0.ALWAYS_HIDDEN)) {
                abstractC9239i0.m22073c(true);
            }
            abstractC9239i0.m22074d(false);
            abstractC9239i0.f21602e0 = AbstractC9174o.m21998b(iM20720a2);
            abstractC9239i0.f21601d0 = AbstractC9174o.m21998b(iM20720a);
            if (!zEquals) {
                int i = (iM20720a3 + iM20720a) - abstractC9239i0.f21597Z;
                if (i > 0) {
                    iM20720a3 -= i;
                }
                if (iM20720a3 < 0) {
                    iM20720a3 = 0;
                }
                int i2 = (iM20720a4 + iM20720a2) - abstractC9239i0.f21598a0;
                if (i2 > 0) {
                    iM20720a4 -= i2;
                }
                if (iM20720a4 < 0) {
                    iM20720a4 = 0;
                }
            }
            if (abstractC9239i0.f21565b != null) {
                int iM21998b = AbstractC9174o.m21998b(iM20720a);
                int iM21998b2 = AbstractC9174o.m21998b(iM20720a2);
                C9248m c9248m2 = abstractC9239i0.f21565b;
                ViewGroup.LayoutParams layoutParams = c9248m2.getLayoutParams();
                layoutParams.width = iM21998b;
                layoutParams.height = iM21998b2;
                c9248m2.setLayoutParams(layoutParams);
                AbstractC9174o.m21994a(abstractC9239i0.f21565b, 17);
                C9248m c9248m3 = abstractC9239i0.f21565b;
                ViewGroup.LayoutParams layoutParams2 = c9248m3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.leftMargin = iM20720a3;
                    marginLayoutParams.topMargin = iM20720a4;
                    marginLayoutParams.rightMargin = 0;
                    marginLayoutParams.bottomMargin = 0;
                    c9248m3.setLayoutParams(marginLayoutParams);
                }
            }
            EnumC8329f0 enumC8329f1 = abstractC9239i0.f21585N;
            EnumC8329f0 enumC8329f2 = EnumC8329f0.RESIZED;
            if (enumC8329f1 != enumC8329f2) {
                abstractC9239i0.f21585N = enumC8329f2;
                abstractC9239i0.m22081a(new C8325d0(enumC8329f2));
                int i3 = abstractC9239i0.f21601d0;
                if (i3 != -1 && abstractC9239i0.f21602e0 != -1) {
                    abstractC9239i0.m22081a(new C8348x(AbstractC9174o.m22001c(i3), AbstractC9174o.m22001c(abstractC9239i0.f21602e0)));
                }
            }
            abstractC9239i0.m22070a(EnumC8335k.RESIZE);
            ViewGroup viewGroup3 = (ViewGroup) abstractC9239i0.f21565b.getParent();
            if (viewGroup3 == null) {
                viewGroup = null;
            } else {
                View viewFindViewById = viewGroup3.findViewById(C7809R.id.ia_identifier_overlay);
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                } else {
                    viewGroup = null;
                }
            }
            C9248m c9248m4 = abstractC9239i0.f21565b;
            if (c9248m4 != null && viewGroup != null) {
                viewGroup.setLayoutParams(c9248m4.getLayoutParams());
            }
            InterfaceC9243j1 interfaceC9243j2 = abstractC9239i0.f21570g;
            if (interfaceC9243j2 != null) {
                ((InterfaceC9218b0) interfaceC9243j2).mo20927c();
            }
        } catch (Exception unused) {
            IAlog.m21950f("Couldn't find content in the view tree", new Object[0]);
            abstractC9239i0.m22071a(EnumC8335k.RESIZE, "Ad can be resized only if it's state is default or resized.");
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8328f
    /* JADX INFO: renamed from: b */
    public final boolean mo20717b() {
        return true;
    }
}
