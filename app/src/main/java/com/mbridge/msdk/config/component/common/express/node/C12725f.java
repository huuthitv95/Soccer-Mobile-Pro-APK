package com.mbridge.msdk.config.component.common.express.node;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.express.EnumC12718e;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.node.f */
/* JADX INFO: compiled from: IndexAccessNode.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12725f extends AbstractC12723d {

    /* JADX INFO: renamed from: a */
    AbstractC12723d f33874a;

    /* JADX INFO: renamed from: b */
    AbstractC12723d f33875b;

    public C12725f(AbstractC12723d abstractC12723d, AbstractC12723d abstractC12723d2) {
        this.f33874a = abstractC12723d;
        this.f33875b = abstractC12723d2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.AbstractC12723d
    /* JADX INFO: renamed from: a */
    public Object mo34898a(C12717d c12717d, EnumC12718e enumC12718e, C12894a c12894a) {
        try {
            Object objMo34898a = this.f33874a.mo34898a(c12717d, enumC12718e, c12894a);
            String str = (String) this.f33875b.mo34898a(c12717d, enumC12718e, c12894a);
            if (objMo34898a != null && !TextUtils.isEmpty(str)) {
                int i = Integer.parseInt(str);
                if (objMo34898a instanceof Object[]) {
                    if (i < ((Object[]) objMo34898a).length) {
                        return ((Object[]) objMo34898a)[i];
                    }
                } else if (objMo34898a instanceof int[]) {
                    if (i < ((int[]) objMo34898a).length) {
                        return Integer.valueOf(((int[]) objMo34898a)[i]);
                    }
                } else if (objMo34898a instanceof long[]) {
                    if (i < ((long[]) objMo34898a).length) {
                        return Long.valueOf(((long[]) objMo34898a)[i]);
                    }
                } else if (objMo34898a instanceof double[]) {
                    if (i < ((double[]) objMo34898a).length) {
                        return Double.valueOf(((double[]) objMo34898a)[i]);
                    }
                } else if (objMo34898a instanceof float[]) {
                    if (i < ((float[]) objMo34898a).length) {
                        return Float.valueOf(((float[]) objMo34898a)[i]);
                    }
                } else if (objMo34898a instanceof boolean[]) {
                    if (i < ((boolean[]) objMo34898a).length) {
                        return Boolean.valueOf(((boolean[]) objMo34898a)[i]);
                    }
                } else if (objMo34898a instanceof char[]) {
                    if (i < ((char[]) objMo34898a).length) {
                        return Character.valueOf(((char[]) objMo34898a)[i]);
                    }
                } else if (objMo34898a instanceof byte[]) {
                    if (i < ((byte[]) objMo34898a).length) {
                        return Byte.valueOf(((byte[]) objMo34898a)[i]);
                    }
                } else if (objMo34898a instanceof short[]) {
                    if (i < ((short[]) objMo34898a).length) {
                        return Short.valueOf(((short[]) objMo34898a)[i]);
                    }
                } else if ((objMo34898a instanceof List) && i < ((List) objMo34898a).size()) {
                    return ((List) objMo34898a).get(i);
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            C13219q0.m37816b("IndexAccessNode", "IndexAccessNode error: " + e.getMessage());
        }
    }
}
