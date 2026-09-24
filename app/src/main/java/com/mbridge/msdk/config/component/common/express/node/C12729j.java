package com.mbridge.msdk.config.component.common.express.node;

import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.express.EnumC12718e;
import com.mbridge.msdk.config.component.common.express.entities.C12719a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.node.j */
/* JADX INFO: compiled from: propertiesNode.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12729j extends AbstractC12723d {

    /* JADX INFO: renamed from: a */
    AbstractC12723d f33880a;

    /* JADX INFO: renamed from: b */
    String f33881b;

    public C12729j(AbstractC12723d abstractC12723d, String str) {
        this.f33880a = abstractC12723d;
        this.f33881b = str;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.AbstractC12723d
    /* JADX INFO: renamed from: a */
    public Object mo34898a(C12717d c12717d, EnumC12718e enumC12718e, C12894a c12894a) {
        if (enumC12718e == EnumC12718e.ASSIGNMENT) {
            C12719a c12719a = new C12719a();
            C12719a c12719a2 = (C12719a) this.f33880a.mo34898a(c12717d, enumC12718e, c12894a);
            c12719a.m34895a(((C12894a) c12719a2.m34897b()).m36051b(c12719a2.m34894a()));
            c12719a.m34896a(this.f33881b);
            return c12719a;
        }
        Object objMo34898a = this.f33880a.mo34898a(c12717d, enumC12718e, c12894a);
        if (objMo34898a instanceof C12894a) {
            return ((C12894a) objMo34898a).m36051b(this.f33881b);
        }
        if (objMo34898a instanceof Map) {
            return ((Map) objMo34898a).get(this.f33881b);
        }
        return null;
    }
}
