package com.bytedance.sdk.openadsdk.p236ka.p243ri;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi;
import com.bytedance.sdk.openadsdk.core.C3189di;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3434ka implements InterfaceC2566fi {

    /* JADX INFO: renamed from: ri */
    public static final C3434ka f12449ri = new C3434ka();

    /* JADX INFO: renamed from: lr */
    private volatile SQLiteDatabase f12450lr;

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi
    /* JADX INFO: renamed from: di */
    public String mo9453di() {
        return null;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi
    /* JADX INFO: renamed from: fi */
    public String mo9454fi() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi
    /* JADX INFO: renamed from: ik */
    public String mo9455ik() {
        return null;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi
    /* JADX INFO: renamed from: ka */
    public String mo9456ka() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi
    /* JADX INFO: renamed from: lr */
    public String mo9457lr() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi
    /* JADX INFO: renamed from: ri */
    public SQLiteDatabase mo9458ri(Context context) {
        if (this.f12450lr == null) {
            synchronized (this) {
                if (this.f12450lr == null) {
                    this.f12450lr = C3189di.m13325ri(context).mo13326ri().m15137ri();
                }
            }
        }
        return this.f12450lr;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi
    /* JADX INFO: renamed from: ri */
    public String mo9459ri() {
        return "loghighpriority";
    }
}
