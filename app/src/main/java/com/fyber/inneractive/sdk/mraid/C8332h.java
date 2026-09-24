package com.fyber.inneractive.sdk.mraid;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.AbstractC9239i0;
import com.fyber.inneractive.sdk.web.InterfaceC9218b0;
import com.fyber.inneractive.sdk.web.InterfaceC9243j1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8332h extends AbstractC8326e {
    public C8332h(LinkedHashMap linkedHashMap, AbstractC9239i0 abstractC9239i0, C9152g1 c9152g1) {
        super(linkedHashMap, abstractC9239i0, c9152g1);
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8328f
    /* JADX INFO: renamed from: a */
    public final void mo20721a() {
        AbstractC9239i0 abstractC9239i0 = this.f18602c;
        Map map = this.f18601b;
        Context contextM21989a = AbstractC9174o.m21989a(abstractC9239i0.f21565b);
        try {
            HashMap mapM22066a = AbstractC9239i0.m22066a(map);
            Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
            for (String str : mapM22066a.keySet()) {
                Object obj = mapM22066a.get(str);
                if (obj instanceof Long) {
                    type.putExtra(str, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    type.putExtra(str, ((Integer) obj).intValue());
                } else {
                    type.putExtra(str, (String) obj);
                }
            }
            if (!(contextM21989a instanceof Activity)) {
                type.setFlags(268435456);
            }
            contextM21989a.startActivity(type);
            InterfaceC9243j1 interfaceC9243j1 = abstractC9239i0.f21570g;
            if (interfaceC9243j1 != null) {
                ((InterfaceC9218b0) interfaceC9243j1).mo20929e();
            }
        } catch (ActivityNotFoundException unused) {
            IAlog.m21945a("There is no calendar app installed!", new Object[0]);
            abstractC9239i0.m22071a(EnumC8335k.CREATE_CALENDAR_EVENT, "Action is unsupported on this device - no calendar app installed");
        } catch (IllegalArgumentException e) {
            IAlog.m21945a("invalid parameters for create calendar ", e.getMessage());
            abstractC9239i0.m22071a(EnumC8335k.CREATE_CALENDAR_EVENT, e.getMessage());
        } catch (Throwable unused2) {
            IAlog.m21945a("Failed to create calendar event.", new Object[0]);
            abstractC9239i0.m22071a(EnumC8335k.CREATE_CALENDAR_EVENT, "could not create calendar event");
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8326e
    /* JADX INFO: renamed from: c */
    public final String mo20718c() {
        return null;
    }
}
