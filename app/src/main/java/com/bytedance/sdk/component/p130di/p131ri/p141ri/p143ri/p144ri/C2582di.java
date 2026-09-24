package com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri;

import android.content.Context;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p136lr.C2551ri;
import com.bytedance.sdk.component.p130di.p131ri.xha;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.ri.ri.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2582di extends xha {
    public C2582di(Context context, C2551ri c2551ri) {
        super(context, c2551ri);
    }

    /* JADX INFO: renamed from: ri */
    public static String m9485ri(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.xha
    /* JADX INFO: renamed from: ik */
    public byte mo9486ik() {
        return (byte) 3;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.xha, com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.AbstractC2584ik
    /* JADX INFO: renamed from: lr */
    public String mo9487lr() {
        return xha.m9524di().m9530ik().mo9454fi();
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.xha
    /* JADX INFO: renamed from: ri */
    public byte mo9488ri() {
        return (byte) 1;
    }
}
