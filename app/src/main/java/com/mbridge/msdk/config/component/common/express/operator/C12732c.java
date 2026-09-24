package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.config.component.common.express.entities.C12719a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.c */
/* JADX INFO: compiled from: OperatorAssignment.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12732c {

    /* JADX INFO: renamed from: a */
    private final C12748c f33884a;

    public C12732c(C12748c c12748c) {
        this.f33884a = c12748c;
    }

    /* JADX INFO: renamed from: b */
    private C12746a m34913b(String str, Object obj, List<Object> list) {
        String strM34894a;
        Object objM34897b;
        Object objM34912a = m34912a(list);
        if (obj instanceof C12719a) {
            C12719a c12719a = (C12719a) obj;
            strM34894a = c12719a.m34894a();
            objM34897b = c12719a.m34897b();
        } else {
            strM34894a = "";
            objM34897b = null;
        }
        if (TextUtils.isEmpty(strM34894a) || !(objM34897b instanceof C12894a)) {
            return C12746a.m35016a(null);
        }
        Object objM36051b = ((C12894a) objM34897b).m36051b(strM34894a);
        if (objM36051b == null || TextUtils.isEmpty(strM34894a)) {
            return C12746a.m35016a(null);
        }
        ((C12894a) objM36051b).m36045a(strM34894a, objM34912a);
        return C12746a.m35016a(objM34912a);
    }

    /* JADX INFO: renamed from: a */
    public C12746a m34914a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35017c();
        }
        String strTrim = str.trim();
        return strTrim.equals(C11744X3.j.f26434b) ? m34913b(strTrim, obj, list) : C12746a.m35017c();
    }

    /* JADX INFO: renamed from: a */
    private Object m34912a(List<Object> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
