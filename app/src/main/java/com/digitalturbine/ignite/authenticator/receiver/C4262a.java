package com.digitalturbine.ignite.authenticator.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.digitalturbine.ignite.authenticator.C4238c;
import com.digitalturbine.ignite.authenticator.decorator.C4248h;
import com.digitalturbine.ignite.authenticator.events.C4252b;
import com.digitalturbine.ignite.authenticator.events.EnumC4254d;
import com.digitalturbine.ignite.authenticator.listeners.internal.InterfaceC4258b;
import com.digitalturbine.ignite.authenticator.logger.C4259a;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.receiver.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4262a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public InterfaceC4258b f17348a;

    /* JADX INFO: renamed from: b */
    public boolean f17349b = false;

    public C4262a(InterfaceC4258b interfaceC4258b) {
        this.f17348a = interfaceC4258b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        InterfaceC4258b interfaceC4258b;
        if ("com.dt.ignite.service.action.PROPERTY_CHANGED".equals(intent.getAction())) {
            C4259a.m20308a("%s : broadcast received", "PropertyChangeReceiver");
            String stringExtra = intent.getStringExtra("PROPERTIES_CHANGED");
            if (stringExtra == null || (interfaceC4258b = this.f17348a) == null) {
                return;
            }
            C4238c c4238c = (C4238c) interfaceC4258b;
            try {
                JSONArray jSONArray = new JSONArray(stringExtra);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if ("DTID".equalsIgnoreCase(jSONArray.getString(i))) {
                        C4259a.m20308a("%s : onPropertiesChanged", "OneDTPropertyWatchdog");
                        if (!c4238c.f17301c.mo20285c()) {
                            C4248h c4248h = c4238c.f17302d;
                            if (c4248h != null) {
                                c4248h.m20296m();
                                return;
                            }
                            return;
                        }
                        C4259a.m20308a("%s : onPropertiesChanged: will reconnect", "OneDTPropertyWatchdog");
                        C4248h c4248h2 = c4238c.f17302d;
                        if (c4248h2 != null) {
                            C4259a.m20308a("%s : one dt refresh required", "OneDTAuthenticator");
                            c4248h2.f17338k.set(true);
                        }
                        c4238c.f17301c.mo20294l();
                        return;
                    }
                }
            } catch (JSONException e) {
                C4252b.m20297a(EnumC4254d.ONE_DT_BROADCAST_ERROR, e);
            }
        }
    }
}
