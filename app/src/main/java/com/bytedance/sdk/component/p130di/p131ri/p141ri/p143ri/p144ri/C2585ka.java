package com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri;

import android.content.Context;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p136lr.C2551ri;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi;
import com.bytedance.sdk.component.p130di.p131ri.xha;
import com.bytedance.sdk.component.p130di.p131ri.xha.C2588ri;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.ri.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2585ka extends C2587ri {
    public C2585ka(Context context, C2551ri c2551ri) {
        super(context, c2551ri);
    }

    /* JADX INFO: renamed from: ik */
    public static String m9499ik(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.AbstractC2584ik
    /* JADX INFO: renamed from: di */
    protected long mo9494di() {
        return C2588ri.m9551lr();
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.C2587ri
    /* JADX INFO: renamed from: ik */
    public byte mo9500ik() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.C2587ri
    /* JADX INFO: renamed from: ka */
    public byte mo9501ka() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.C2587ri, com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.AbstractC2584ik
    /* JADX INFO: renamed from: lr */
    public String mo9487lr() {
        InterfaceC2566fi interfaceC2566fiM9530ik = xha.m9524di().m9530ik();
        if (interfaceC2566fiM9530ik != null) {
            return interfaceC2566fiM9530ik.mo9459ri();
        }
        return null;
    }
}
