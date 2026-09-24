package com.fyber.inneractive.sdk.mraid;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.y */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8349y {
    /* JADX INFO: renamed from: a */
    public abstract String mo20716a();

    public final String toString() {
        String strMo20716a = mo20716a();
        return strMo20716a != null ? strMo20716a.replaceAll("[^a-zA-Z0-9_,:\\s\\{\\}\\'\\\"]", "") : "";
    }
}
