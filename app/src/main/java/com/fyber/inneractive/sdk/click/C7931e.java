package com.fyber.inneractive.sdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.RunnableC7964f0;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.click.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C7931e implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f17616a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Uri f17617b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C7933g f17618c;

    public C7931e(C7933g c7933g, List list, Uri uri) {
        this.f17618c = c7933g;
        this.f17616a = list;
        this.f17617b = uri;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        C7929c c7929c = (C7929c) obj;
        if (this.f17618c.f17624f) {
            return;
        }
        if (exc != null || c7929c == null) {
            String string = this.f17617b.toString();
            IAConfigManager iAConfigManager = IAConfigManager.f17654M;
            AbstractC9183r.f21478b.post(new RunnableC7964f0(string, null));
            Uri uri = this.f17617b;
            this.f17618c.getClass();
            C7928b c7928bM20369a = C7944r.m20369a(uri.toString(), "IgniteGooglePlay", "failed getting redirects");
            List list = this.f17616a;
            if (list != null) {
                list.add(new C7936j(this.f17617b.toString(), false, EnumC7943q.INTERNAL_REDIRECT, "failed getting redirects. ignite click handler"));
                List list2 = this.f17616a;
                c7928bM20369a.f17612f.clear();
                c7928bM20369a.f17612f.addAll(list2);
            }
            C7933g c7933g = this.f17618c;
            InterfaceC7932f interfaceC7932f = c7933g.f17621c;
            if (interfaceC7932f != null) {
                interfaceC7932f.mo20327a(c7928bM20369a, c7933g.f17622d, c7933g.f17623e);
                return;
            }
            return;
        }
        if (c7929c.f17613a.size() > 0) {
            ArrayList arrayList = c7929c.f17613a;
            String str = (String) arrayList.get(arrayList.size() - 1);
            if (this.f17616a != null) {
                for (String str2 : c7929c.f17613a) {
                    if (!TextUtils.equals(str2, str)) {
                        this.f17616a.add(new C7936j(str2, true, EnumC7943q.INTERNAL_REDIRECT, null));
                    }
                }
                List list3 = this.f17616a;
                EnumC7943q enumC7943q = EnumC7943q.OPEN_INTERNAL_STORE;
                list3.add(new C7936j(str, true, enumC7943q, null));
                this.f17618c.getClass();
                C7928b c7928b = new C7928b(str, enumC7943q, "IgniteGooglePlay", null);
                List list4 = this.f17616a;
                c7928b.f17612f.clear();
                c7928b.f17612f.addAll(list4);
                C7933g c7933g2 = this.f17618c;
                InterfaceC7932f interfaceC7932f2 = c7933g2.f17621c;
                if (interfaceC7932f2 != null) {
                    interfaceC7932f2.mo20327a(c7928b, c7933g2.f17622d, c7933g2.f17623e);
                }
            }
            if (str.startsWith("market")) {
                String strReplace = str.replace("market://details?id=", "https://play.google.com/store/apps/details?id=");
                IAConfigManager iAConfigManager2 = IAConfigManager.f17654M;
                AbstractC9183r.f21478b.post(new RunnableC7964f0(strReplace, null));
            } else {
                String str3 = c7929c.f17614b;
                IAConfigManager iAConfigManager3 = IAConfigManager.f17654M;
                AbstractC9183r.f21478b.post(new RunnableC7964f0(str, str3));
            }
        }
    }
}
