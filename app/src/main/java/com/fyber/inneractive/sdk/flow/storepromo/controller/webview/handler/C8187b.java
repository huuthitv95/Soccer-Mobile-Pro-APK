package com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler;

import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.InterfaceC8185a;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8187b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8185a f18241a;

    public C8187b(InterfaceC8185a interfaceC8185a) {
        this.f18241a = interfaceC8185a;
    }

    /* JADX INFO: renamed from: a */
    public final void m20614a(String str, HashMap map, C9152g1 c9152g1) {
        str.getClass();
        str.hashCode();
        switch (str) {
            case "onClick":
                String str2 = (String) map.get("clickAction");
                if (str2 != null && !str2.isEmpty()) {
                    try {
                        this.f18241a.mo20608a(Integer.parseInt(str2), c9152g1);
                    } catch (NumberFormatException e) {
                        IAlog.m21946b("WebviewCommandHandlerBase: handleClick: exception: %s" + e, new Object[0]);
                    }
                    break;
                } else {
                    IAlog.m21945a("WebviewCommandHandlerBase: handleClick: no click action in params for click cmd", new Object[0]);
                    break;
                }
                break;
            case "onError":
                this.f18241a.mo20610a(map);
                break;
            case "DOMLoaded":
                this.f18241a.mo20607a();
                break;
            default:
                IAlog.m21950f("Sent unknown command: %s", str);
                break;
        }
        this.f18241a.mo20611b();
    }
}
