package com.fyber.inneractive.sdk.click;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.click.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C7939m implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f17635a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f17636b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C7944r f17637c;

    public C7939m(C7944r c7944r, String str, String str2) {
        this.f17637c = c7944r;
        this.f17635a = str;
        this.f17636b = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        C7929c c7929c = (C7929c) obj;
        if (this.f17637c.f17645f) {
            return;
        }
        if (exc != null) {
            C7944r.m20370a(this.f17637c, null, this.f17635a, this.f17636b, exc);
            return;
        }
        if (c7929c != null) {
            String str = this.f17635a;
            if (c7929c.f17613a.size() > 1) {
                ArrayList arrayList = c7929c.f17613a;
                str = (String) arrayList.get(arrayList.size() - 1);
            }
            C7928b c7928bM20372a = this.f17637c.m20372a(str);
            if ((c7928bM20372a == null || c7928bM20372a.f17607a == EnumC7943q.FAILED) && !TextUtils.isEmpty(c7929c.f17614b)) {
                C7944r c7944r = this.f17637c;
                c7944r.getClass();
                for (String str2 : c7929c.f17613a) {
                    if (!TextUtils.equals(str2, str)) {
                        c7944r.f17646g.add(new C7936j(str2, true, EnumC7943q.INTERNAL_REDIRECT, null));
                    }
                }
                C7944r.m20370a(this.f17637c, c7929c.f17614b, str, this.f17636b, null);
                return;
            }
            C7944r c7944r2 = this.f17637c;
            c7944r2.getClass();
            for (String str3 : c7929c.f17613a) {
                if (!TextUtils.equals(str3, str)) {
                    c7944r2.f17646g.add(new C7936j(str3, false, EnumC7943q.INTERNAL_REDIRECT, null));
                }
            }
            if (this.f17637c.f17646g.size() == 0) {
                this.f17637c.f17646g.add(new C7936j(str, false, EnumC7943q.INTERNAL_REDIRECT, null));
            }
            this.f17637c.m20371a(C7944r.m20369a(str, "followRedirects", "Invalid response"));
        }
    }
}
