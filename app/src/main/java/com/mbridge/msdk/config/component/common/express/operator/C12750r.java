package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.component.common.util.C12770c;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.r */
/* JADX INFO: compiled from: OperatorTime.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12750r {

    /* JADX INFO: renamed from: a */
    private final C12748c f33915a;

    public C12750r(C12748c c12748c) {
        this.f33915a = c12748c;
    }

    /* JADX INFO: renamed from: a */
    public C12746a m35038a(String str, Object obj, List<Object> list) {
        return (TextUtils.isEmpty(str) || !str.contains(C12770c.m35209b("875"))) ? C12746a.m35017c() : C12746a.m35016a(String.valueOf(System.currentTimeMillis()));
    }
}
