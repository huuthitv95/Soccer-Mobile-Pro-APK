package com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2577fi implements InterfaceC2566fi {

    /* JADX INFO: renamed from: ri */
    public static final C2577fi f7212ri = new C2577fi();

    /* JADX INFO: renamed from: lr */
    private volatile SQLiteDatabase f7213lr;

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
        if (this.f7213lr == null) {
            synchronized (this) {
                if (this.f7213lr == null) {
                    this.f7213lr = new C2579ka(context).getWritableDatabase();
                }
            }
        }
        return this.f7213lr;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi
    /* JADX INFO: renamed from: ri */
    public String mo9459ri() {
        return "loghighpriority";
    }
}
