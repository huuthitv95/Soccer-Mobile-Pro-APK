package com.fyber.inneractive.sdk.flow.endcard;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.global.features.C7994v;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C8237x0;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;
import com.fyber.inneractive.sdk.player.p277ui.C8878b;
import com.fyber.inneractive.sdk.player.p277ui.C8879c;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8084b implements InterfaceC8108n {

    /* JADX INFO: renamed from: a */
    public final String f17982a = IAlog.m21943a(this);

    /* JADX INFO: renamed from: b */
    public JSONArray f17983b = null;

    /* JADX INFO: renamed from: c */
    public final C8237x0 f17984c;

    /* JADX INFO: renamed from: d */
    public InterfaceC8108n f17985d;

    /* JADX INFO: renamed from: e */
    public int f17986e;

    /* JADX INFO: renamed from: f */
    public int f17987f;

    public AbstractC8084b(int i, C8237x0 c8237x0) {
        this.f17984c = c8237x0;
        this.f17987f = i;
    }

    /* JADX INFO: renamed from: a */
    public static int m20501a(C7994v c7994v) {
        if (c7994v != null) {
            Integer numMo20416a = c7994v.mo20416a("autoClickDelay");
            int iIntValue = numMo20416a != null ? numMo20416a.intValue() : 3;
            if (iIntValue >= 0 && iIntValue <= 10) {
                return iIntValue;
            }
        }
        return 3;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20502b(C7994v c7994v) {
        if (c7994v != null) {
            Boolean boolMo20420c = c7994v.mo20420c("shouldEnableEndCardAutoClick");
            if (boolMo20420c != null ? boolMo20420c.booleanValue() : false) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.InterfaceC8108n
    /* JADX INFO: renamed from: a */
    public final void mo20499a() {
        InterfaceC8108n interfaceC8108n = this.f17985d;
        if (interfaceC8108n != null) {
            interfaceC8108n.mo20499a();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo20503a(ViewGroup viewGroup, C8878b c8878b);

    /* JADX INFO: renamed from: a */
    public void mo20504a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.m21944a("%s loading failed for %s", inneractiveInfrastructureError.getCause(), mo20513i(), this.f17982a);
    }

    /* JADX INFO: renamed from: a */
    public void mo20505a(JSONArray jSONArray) {
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.InterfaceC8108n
    /* JADX INFO: renamed from: b */
    public final View mo20506b() {
        return m20510f().mo20506b();
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC8108n mo20507c();

    /* JADX INFO: renamed from: d */
    public C8879c mo20508d() {
        C7994v c7994v = this.f17984c.f18385g;
        C8879c c8879c = new C8879c();
        c8879c.f20865a = mo20516l();
        c8879c.f20870f = mo20513i();
        boolean zM20502b = m20502b(c7994v);
        Integer numValueOf = Integer.valueOf(m20501a(c7994v));
        if (zM20502b) {
            c8879c.f20868d = numValueOf;
        }
        return c8879c;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.InterfaceC8108n
    public void destroy() {
        mo20509e();
        InterfaceC8108n interfaceC8108n = this.f17985d;
        if (interfaceC8108n != null) {
            interfaceC8108n.destroy();
            this.f17985d = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo20509e() {
        mo20499a();
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC8108n m20510f() {
        if (this.f17985d == null) {
            this.f17985d = mo20507c();
        }
        return this.f17985d;
    }

    /* JADX INFO: renamed from: g */
    public abstract EnumC9150g mo20511g();

    /* JADX INFO: renamed from: h */
    public abstract EnumC8094l mo20512h();

    /* JADX INFO: renamed from: i */
    public abstract EnumC8300i mo20513i();

    /* JADX INFO: renamed from: j */
    public boolean mo20514j() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo20515k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract boolean mo20516l();

    /* JADX INFO: renamed from: m */
    public void mo20517m() {
        IAlog.m21945a("%s loading success for %s", mo20513i(), this.f17982a);
    }
}
