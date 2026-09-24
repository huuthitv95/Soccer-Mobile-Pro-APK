package com.ironsource.adqualitysdk.sdk.p286i;

import java.math.BigDecimal;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.el */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11928el extends AbstractC11922ef {
    /* JADX INFO: renamed from: ﻐ */
    abstract boolean mo30173(int i);

    /* JADX INFO: renamed from: ﻐ */
    abstract boolean mo30174(Object obj, Object obj2);

    /* JADX INFO: renamed from: ﻐ */
    abstract boolean mo30175(String str, String str2);

    public AbstractC11928el(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        Object objM30066 = m30162().m30156(c11907dr, c11877co).m30066();
        Object objM30067 = m30163().m30156(c11907dr, c11877co).m30066();
        try {
            return new C11908ds(Boolean.valueOf(mo30173(new BigDecimal(objM30066.toString()).compareTo(new BigDecimal(objM30067.toString())))));
        } catch (Exception unused) {
            if ((objM30066 instanceof String) && (objM30067 instanceof String)) {
                return new C11908ds(Boolean.valueOf(mo30175((String) objM30066, (String) objM30067)));
            }
            return new C11908ds(Boolean.valueOf(mo30174(objM30066, objM30067)));
        }
    }
}
